from django.shortcuts import render, redirect
from .models import User


def login_page(request):
    if request.method == "POST":
        email = request.POST['email']
        password = request.POST['password']

        user = User.objects.filter(email=email, password=password).first()

        if user:
            request.session['user_id'] = user.id
            return redirect('main')

    return render(request, 'login.html')


def register_page(request):
    if request.method == "POST":
        First_name = request.POST['First_name']
        Last_name = request.POST['Last_name']
        email = request.POST['email']
        password = request.POST['password']

        User.objects.create(
            First_name=First_name,
            Last_name=Last_name,
            email=email,
            password=password
        )

        return redirect('login')

    return render(request, 'register.html')


def main_page(request):
    if 'user_id' not in request.session:
        return redirect('login')

    user = User.objects.get(id=request.session['user_id'])

    context = {
        'user': user
    }

    return render(request, 'main.html', context)


def edit_profile(request):
    if 'user_id' not in request.session:
        return redirect('login')

    user = User.objects.get(id=request.session['user_id'])

    if request.method == "POST":
        user.First_name = request.POST['First_name']
        user.Last_name = request.POST['Last_name']
        user.email = request.POST['email']
        user.password = request.POST['password']

        user.save()

        return redirect('main')

    context = {
        'user': user
    }

    return render(request, 'edit_profile.html', context)


def logout_user(request):
    request.session.flush()
    return redirect('login')