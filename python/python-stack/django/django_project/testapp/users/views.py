from django.shortcuts import render, redirect, get_object_or_404
from django.contrib.auth import login, logout
from django.contrib.auth.decorators import login_required
from django.contrib import messages
from django.http import HttpResponseForbidden

from .models import User, Message
from .forms import (LoginForm, RegisterForm, EditProfileForm, ChangePasswordForm,
                    AdminEditUserForm, AdminAddUserForm, MessageForm)


def home(request):
    return render(request, 'users/home.html')


def sign_in(request):
    if request.user.is_authenticated:
        return redirect('dashboard')
    form = LoginForm(request.POST or None)
    if request.method == 'POST' and form.is_valid():
        login(request, form.user)
        return redirect('dashboard')
    return render(request, 'users/sign_in.html', {'form': form})


def sign_out(request):
    logout(request)
    return redirect('home')


def register(request):
    if request.user.is_authenticated:
        return redirect('dashboard')
    form = RegisterForm(request.POST or None)
    if request.method == 'POST' and form.is_valid():
        user = form.save()
        login(request, user)
        return redirect('dashboard')
    return render(request, 'users/register.html', {'form': form})


@login_required
def dashboard(request):
    if request.user.is_admin:
        users = User.objects.all().order_by('created_at')
        return render(request, 'users/admin_dashboard.html', {'users': users})
    else:
        users = User.objects.all().order_by('created_at')
        return render(request, 'users/user_dashboard.html', {'users': users})


@login_required
def user_info(request, user_id):
    profile_user = get_object_or_404(User, pk=user_id)
    received = Message.objects.filter(recipient=profile_user).select_related('sender').order_by('created_at')
    msg_form = MessageForm()
    if request.method == 'POST':
        msg_form = MessageForm(request.POST)
        if msg_form.is_valid():
            Message.objects.create(
                sender=request.user,
                recipient=profile_user,
                body=msg_form.cleaned_data['body']
            )
            return redirect('user_info', user_id=user_id)
    return render(request, 'users/user_info.html', {
        'profile_user': profile_user,
        'messages_list': received,
        'msg_form': msg_form,
    })


@login_required
def edit_profile(request):
    info_form = EditProfileForm(instance=request.user)
    pw_form = ChangePasswordForm()
    if request.method == 'POST':
        if 'save_info' in request.POST:
            info_form = EditProfileForm(request.POST, instance=request.user)
            if info_form.is_valid():
                info_form.save()
                messages.success(request, 'Profile updated.')
                return redirect('edit_profile')
        elif 'change_password' in request.POST:
            pw_form = ChangePasswordForm(request.POST)
            if pw_form.is_valid():
                request.user.set_password(pw_form.cleaned_data['password'])
                request.user.save()
                messages.success(request, 'Password changed. Please log in again.')
                return redirect('sign_in')
    return render(request, 'users/edit_profile.html', {'info_form': info_form, 'pw_form': pw_form})


# Admin-only views

def admin_required(view_func):
    def wrapper(request, *args, **kwargs):
        if not request.user.is_authenticated or not request.user.is_admin:
            return HttpResponseForbidden('Admin access required.')
        return view_func(request, *args, **kwargs)
    return wrapper


@login_required
@admin_required
def new_user(request):
    form = AdminAddUserForm(request.POST or None)
    if request.method == 'POST' and form.is_valid():
        form.save()
        messages.success(request, 'User created.')
        return redirect('dashboard')
    return render(request, 'users/new_user.html', {'form': form})


@login_required
@admin_required
def edit_user(request, user_id):
    edit_target = get_object_or_404(User, pk=user_id)
    info_form = AdminEditUserForm(instance=edit_target)
    pw_form = ChangePasswordForm()
    if request.method == 'POST':
        if 'save_info' in request.POST:
            info_form = AdminEditUserForm(request.POST, instance=edit_target)
            if info_form.is_valid():
                user = info_form.save(commit=False)
                user.is_staff = user.user_level == 'admin'
                user.save()
                messages.success(request, 'User updated.')
                return redirect('dashboard')
        elif 'change_password' in request.POST:
            pw_form = ChangePasswordForm(request.POST)
            if pw_form.is_valid():
                edit_target.set_password(pw_form.cleaned_data['password'])
                edit_target.save()
                messages.success(request, 'Password updated.')
                return redirect('dashboard')
    return render(request, 'users/edit_user.html', {'edit_target': edit_target, 'info_form': info_form, 'pw_form': pw_form})


@login_required
@admin_required
def delete_user(request, user_id):
    edit_target = get_object_or_404(User, pk=user_id)
    if request.method == 'POST':
        edit_target.delete()
        messages.success(request, 'User removed.')
        return redirect('dashboard')
    return render(request, 'users/confirm_delete.html', {'edit_target': edit_target})
