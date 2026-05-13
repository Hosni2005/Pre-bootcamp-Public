# Playground Flask Assignment

## Overview

This project is a simple Flask web application created for practicing:

* Flask routing
* Passing data from routes to templates
* Using variables in Jinja templates
* Using loops in templates
* Dynamic styling with route parameters

The application displays colorful boxes based on values provided in the URL.

---

## Features

### Level 1

Visiting:

```bash
/play
```

Displays:

* 3 blue boxes

---

### Level 2

Visiting:

```bash
/play/7
```

Displays:

* 7 blue boxes

The number changes dynamically based on the URL parameter.

---

### Level 3

Visiting:

```bash
/play/5/green
```

Displays:

* 5 green boxes

Both the number of boxes and the color are dynamic.

---

## Project Structure

```bash
playground/
│
├── server.py
└── templates/
    └── index.html
```

---

## Technologies Used

* Python
* Flask
* HTML5
* CSS3
* Jinja2 Templates

---

## Installation

### 1. Clone the repository

```bash
git clone <your-repository-url>
```

### 2. Navigate into the project folder

```bash
cd playground
```

### 3. Install Flask

```bash
pip install flask
```

---

## Running the Application

Start the Flask server:

```bash
python server.py
```

The application will run on:

```bash
http://localhost:5000
```

---

## Routes

| Route               | Description                           |
| ------------------- | ------------------------------------- |
| `/play`             | Shows 3 blue boxes                    |
| `/play/<x>`         | Shows x blue boxes                    |
| `/play/<x>/<color>` | Shows x boxes with the selected color |

---

## Example URLs

```bash
http://localhost:5000/play
```

```bash
http://localhost:5000/play/10
```

```bash
http://localhost:5000/play/5/red
```

```bash
http://localhost:5000/play/8/purple
```

---

## Screenshot Preview

The page displays colorful square boxes using dynamic Flask routes and Jinja template rendering.

---

## Learning Objectives

* Understand Flask route parameters
* Practice rendering templates
* Use Jinja loops
* Apply dynamic CSS styling
* Build reusable templates

---

## Author

Hosni Ahmad
