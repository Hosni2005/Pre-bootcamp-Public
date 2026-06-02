from django.urls import path
from . import views

urlpatterns = [
    path("", views.index),
    path("guess", views.guess),
    path("save_winner", views.save_winner),
    path("leaderboard", views.leaderboard),
    path("reset", views.reset),
]