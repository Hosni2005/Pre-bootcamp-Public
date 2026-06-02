from django.shortcuts import render
from .models import User
# Create your views here.

def index(request):

    
    user = User.objects.all()
    context = {
        "users": user
    }
    return render(request, 'index.html', context)