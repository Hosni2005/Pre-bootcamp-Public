from django.db import models
from django.shortcuts import  redirect

# Create your models here.
class Dojo(models.Model) :
    name = models.CharField(max_length=255)
    city = models.CharField(max_length=255)
    state = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

class Ninja(models.Model) :
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
    dojo = models.ForeignKey(Dojo , related_name="dojos" , on_delete= models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)


def add_dojos(request) :
    name = request.POST['name']
    city = request.POST['city']
    state = request.POST['state']
    Dojo.objects.create(name=name , city=city , state=state)

def add_ninjas(request) :
    first_name = request.POST['first_name']
    last_name = request.POST['last_name']
    dojo_id = request.POST['dojo']
    currentDojo=Dojo.objects.get(id=dojo_id)
    Ninja.objects.create(first_name=first_name , last_name=last_name,dojo=currentDojo)
