from django.db import models

# Create your models here.
class User (models.Model) :
    first_name = models.CharField (max_length=50 , null=False)
    last_name = models.CharField (max_length=50 , null=False)
    email = models.CharField (max_length=255 , null=False , unique=True)
    password = models.CharField (max_length= 30 , null=False)
    created_at = models.DateTimeField (auto_now_add=True)
    updated_at = models.DateTimeField (auto_now=True)
    
    def __str__(self) :
        return f"{self.first_name} {self.last_name}"
