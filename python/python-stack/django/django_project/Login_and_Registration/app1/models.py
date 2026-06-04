from django.db import models
import re

# Create your models here.

class UserManager(models.Manager) :
    def basic_validator(self , postData) :
        errors = {}
        if len(postData['firstname']) < 2 :
            errors['firstname'] = "the first name should be at least two characters"
        if len(postData['lastname']) < 2 :
            errors['lastname'] = "the last name should be at least two characters"
        if len(postData['firstname']) < 2 :
            errors['firstname'] = "the first name should be at least two characters"
        if len(postData['password']) < 8 :
            errors['password'] = "the first name should be at least 8 characters"
        if postData['password'] != postData['confirm_password']:
            errors['confirm_password'] = "Passwords do not match"
        EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')
        if not EMAIL_REGEX.match(postData['email']):
                    errors['email'] = "Invalid email address!"

        return errors
    def login_validato(self , postData) :
        errors = {}
        if len(postData['email']) == 0 :
            errors['email'] = "email is Requierd"
        if len(postData['password']) == 0 :
            errors['password'] = "password is Requierd"

class User(models.Model) :
    firstname = models.CharField(max_length=50)
    lastname = models.CharField(max_length=50)
    email = models.CharField(max_length=255 , unique=True)
    password = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)\
    
    objects = UserManager()

