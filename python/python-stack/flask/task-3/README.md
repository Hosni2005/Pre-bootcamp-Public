````md
# Dojo Survey Flask Project

A simple Flask web application that allows users to submit a survey form and display the submitted information on a separate result page using Flask sessions.

---

# Features

- User input form
- Flask routing
- Form handling with POST requests
- Session storage
- Redirect after form submission
- Result page displaying submitted data
- Custom HTML & CSS styling

---

# Technologies Used

- Python
- Flask
- HTML5
- CSS3

---

# Project Structure

```bash
project/
│
├── server.py
│
├── templates/
│   ├── index.html
│   └── user-data.html
│
├── static/
│   ├── style.css
│   └── user-data.css
````

---

# Application Preview

## Survey Form Page

![Survey Form](Screenshot%202026-05-14%20140631.png)

---

## Result Page

![Result Page](Screenshot%202026-05-14%20140746.png)

---

# How It Works

1. The user opens the main survey page.
2. The user fills out the form:

   * Name
   * Dojo Location
   * Favorite Language
   * Comment
3. Flask stores the submitted data inside a session.
4. The app redirects the user to the result page.
5. The submitted information is displayed back to the user.

---

# Installation

## 1. Clone the Repository

```bash
git clone <your-repository-url>
```

## 2. Navigate to the Project Folder

```bash
cd project-name
```

## 3. Install Flask

```bash
pip install flask
```

## 4. Run the Application

```bash
python server.py
```

---

# Open in Browser

```bash
http://127.0.0.1:5000/
```

---

# Main Flask Routes

| Route     | Method | Description              |
| --------- | ------ | ------------------------ |
| `/`       | GET    | Displays the survey form |
| `/show`   | POST   | Handles form submission  |
| `/result` | GET    | Displays submitted data  |

---

# Code Highlights

## Flask Session Usage

```python
session['name'] = request.form['name']
```

## Redirect After Submit

```python
return redirect('/result')
```

## Display Data in HTML

```html
{{ name }}
```

---

# Files Overview

### `server.py`

Main Flask application containing routes and session logic.

### `index.html`

Survey form page template.

### `user-data.html`

Displays submitted survey data.

### `style.css`

Main styling for the survey form page.

### `user-data.css`

Styling for the result display page.

---

# Author

Hosni Ahmad

```
```
