# Flask Routing Assignment

A simple Flask application that demonstrates basic routing and dynamic URL handling using Python and Flask.

---

## Features

- Basic Flask app setup
- Static routes
- Dynamic route handling
- URL parameters
- Flask debug mode enabled

---

## Project Structure

```bash
.
├── server.py
└── README.md
```

---

## Code Overview

### Import Flask

```python
from flask import Flask , render_template
```

Creates the Flask application instance.

---

### Home Route

```python
@app.route("/")
def home():
    return "Hello World"
```

Output:

```bash
Hello World
```

---

### Custom Route

```python
@app.route("/hosni")
def champ():
    return "Champion !"
```

Output:

```bash
Champion !
```

---

### Dynamic Route

```python
@app.route("/<name>")
def hi(name):
    return f"Hello {name}"
```

Example:

```bash
http://127.0.0.1:5000/Ali
```

Output:

```bash
Hello Ali
```

---

## Installation

Install Flask using pip:

```bash
pip install flask
```

---

## Run the Project

```bash
python server.py
```

---

## Open in Browser

```bash
http://127.0.0.1:5000/
```

---

## Example URLs

| URL | Output |
|---|---|
| `/` | Hello World |
| `/hosni` | Champion ! |
| `/John` | Hello John |

---

## Technologies Used

- Python
- Flask

---

## Author

Hosni Ahmad

