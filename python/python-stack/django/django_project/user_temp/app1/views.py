from django.shortcuts import render , redirect
from .models import User

# Create your views here.
def landing(request):
    users = User.objects.all()
    return render(request, 'index.html', {'users': users})
def index(request):

    if request.method == 'POST':
        firstname = request.POST.get('firstname')
        lastname = request.POST.get('lastname')
        email = request.POST.get('email')
        age = request.POST.get('age')

        user = User(firstname=firstname, lastname=lastname, email=email, age=age)
        user.save()

    return redirect('/')