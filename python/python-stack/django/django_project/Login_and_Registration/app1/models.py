from django.db import models
import re
from datetime import date

class UserManager(models.Manager):
    def register_validator(self, postData):
        errors = {}

        name_regex = re.compile(r'^[A-Za-z]+$')
        email_regex = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')

        if len(postData['firstname']) < 2:
            errors['firstname'] = "First name must be at least 2 characters"

        elif not name_regex.match(postData['firstname']):
            errors['firstname'] = "First name must contain letters only"

        if len(postData['lastname']) < 2:
            errors['lastname'] = "Last name must be at least 2 characters"

        elif not name_regex.match(postData['lastname']):
            errors['lastname'] = "Last name must contain letters only"

        if not email_regex.match(postData['email']):
            errors['email'] = "Invalid email address"

        elif User.objects.filter(email=postData['email']).exists():
            errors['email'] = "Email already exists"

        if len(postData['password']) < 8:
            errors['password'] = "Password must be at least 8 characters"

        if postData['password'] != postData['confirm_password']:
            errors['confirm_password'] = "Passwords do not match"

        return errors


class User(models.Model):
    firstname = models.CharField(max_length=50)
    lastname = models.CharField(max_length=50)
    email = models.CharField(max_length=255, unique=True)
    password = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    objects = UserManager()