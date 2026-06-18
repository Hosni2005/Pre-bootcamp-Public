# Test App — Django MVC

A Django app from the VillageBB wireframe, with user management and messaging.

## Setup

```bash
pip install -r requirements.txt
python manage.py migrate
python manage.py runserver
```

Then open http://127.0.0.1:8000/ and register — the first account becomes Admin.

## Features

- **Home** — Public landing page
- **Register / Sign In / Log Out**
- **Admin Dashboard** — Manage all users (add, edit, remove with confirmation)
- **User Dashboard** — View all users (normal users)
- **User Info** — View profile + leave messages
- **Edit Profile** — Edit own info, description, password
- **Edit User** (admin only) — Edit any user's info and password

## Structure

```
testapp/          # Django project settings & URLs
users/            # App: models, views, forms, URLs, templates
templates/        # base.html
```
