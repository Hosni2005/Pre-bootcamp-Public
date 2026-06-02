from django.urls import path
from . import views

urlpatterns = [
    path('', views.login_page, name='login'),
    path('register/', views.register_page, name='register'),
    path('main/', views.main_page, name='main'),
    path('edit-profile/', views.edit_profile, name='edit_profile'),
    path('logout/', views.logout_user, name='logout'),
]