from django.shortcuts import render, redirect
from django.contrib import messages
from django.contrib.auth.hashers import make_password, check_password
from .models import *

def index(request):
    return render(request, 'login_registration.html')


def register(request):
    if request.method == "POST":
        errors = User.objects.register_validator(request.POST)

        if errors:
            for value in errors.values():
                messages.error(request, value)
            return redirect('/')

        user = User.objects.create(
            firstname=request.POST['firstname'],
            lastname=request.POST['lastname'],
            email=request.POST['email'],
            
            password=make_password(request.POST['password'])
        )

        request.session['user_id'] = user.id
        return redirect('/success')

    return redirect('/')


def login(request):
    if request.method == "POST":
        users = User.objects.filter(email=request.POST['email'])

        if users:
            user = users[0]

            if check_password(request.POST['password'], user.password):
                request.session['user_id'] = user.id
                return redirect('/success')

        messages.error(request, "Invalid email or password")
        return redirect('/')

    return redirect('/')


def success(request):
    if 'user_id' not in request.session:
        return redirect('/')

    user = User.objects.get(id=request.session['user_id'])
    context = {
        'user': user
    }
    return render(request, 'home.html', context)


def logout(request):
    request.session.flush()
    return redirect('/')