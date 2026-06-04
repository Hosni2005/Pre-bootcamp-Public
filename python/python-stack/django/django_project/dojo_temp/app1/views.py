from django.shortcuts import render , redirect
from .models import *

# Create your views here.
def index(request) :
    context = {
        'dojos':Dojo.objects.all() 

    }
    return render(request ,'index.html',context)

def add_dojo(request) :
    if request.method == 'POST' :

        add_dojos(request)
        return redirect('index')
    else :
        return render('index.html')
    
def add_ninja(request) :
    if request.method == 'POST' :
        firstname = request.POST['firstname']
        print (firstname)
        add_ninjas(firstname)
        return redirect('index')
    else :
        return render('index.html')