from django.urls import path
from . import views

urlpatterns = [
    path('', views.index, name='landing'),
    path('destroy/' , views.destroy , name='destroy'),
    path('increment/' , views.increment , name ='increment'),
]