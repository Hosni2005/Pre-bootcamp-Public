# User Table Flask App

A simple Flask web application that displays user information inside a styled HTML table using Jinja templating and custom CSS.

## Features

* Display user data dynamically using Flask
* Styled HTML table with CSS
* Full name generated automatically
* Clean and responsive UI
* Uses Jinja2 template engine

---

## Technologies Used

* Python
* Flask
* HTML5
* CSS3
* Jinja2

---

## Project Structure

```bash
project/
│
├── server.py
├── templates/
│   └── index.html
├── static/
│   └── style.css
```

---

## Installation

1. Clone the repository

```bash
git clone <your-repository-url>
```

2. Navigate to the project folder

```bash
cd project-folder
```

3. Install Flask

```bash
pip install flask
```

4. Run the application

```bash
python server.py
```

5. Open in browser

```bash
http://127.0.0.1:5000
```

---

## Flask Backend

The Flask app creates a list of users and sends it to the HTML template for rendering.

---

## HTML Template

The HTML file uses Jinja templating to loop through users and display them in a table.

---

## CSS Styling

The CSS file adds table styling, hover effects, shadows, and responsive layout.

---

## Example Output

| First Name | Last Name | Full Name     |
| ---------- | --------- | ------------- |
| Michael    | Choi      | Michael Choi  |
| John       | Supsupin  | John Supsupin |
| Mark       | Guillen   | Mark Guillen  |
| KB         | Tonel     | KB Tonel      |
| Hosni      | Ahmad     | Hosni Ahmad   |

---
## Screenshot

![html table](/static/screeshot.png)

## Learning Objectives

* Understand Flask routing
* Pass data from Flask to HTML templates
* Use Jinja loops
* Connect CSS files in Flask
* Build dynamic web pages

---

## Author

Hosni Ahmad
