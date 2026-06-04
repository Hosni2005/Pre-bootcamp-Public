from django.shortcuts import render , redirect
from .models import *
# Create your views here.
def index(request) :

    return render(request , 'login_registration.html')

def register(request) :
    if request.method == 'POST' :

        User.objects.create(
            firstname = request.POST['firstname'],
            lastname = request.POST['lastname'],
            email = request.POST['email'] , 
            password = request.POST['password']
        )
        return redirect ('/')
    else :
        return render(request , 'login_registration.html')
