# 🐍 Python Basics – Strings & Variables

This project introduces basic Python concepts such as printing, variables, string concatenation, and formatting.

---

## 📖 Overview

The exercises demonstrate how to:

* Print text to the console
* Use variables (strings and numbers)
* Combine strings with variables
* Handle type conversion
* Format strings using different methods

---

## 📂 Project Structure

```
python_basics.py
README.md
```

---

## ⚙️ Exercises Included

### 1. Print "Hello World"

Basic print statement:

```python
print("Hello World")
```

---

### 2. Print "Hello Noelle!"

Using a variable:

```python
name = "Noelle"

# Using comma
print("Hello", name)

# Using concatenation
print("Hello " + name)
```

---

### 3. Print "Hello 42!"

Handling numbers inside strings:

```python
name = 42

# Using comma (works)
print("Hello", name)

# Using + (causes error)
# print("Hello " + name)

# Fix using type conversion
print("Hello " + str(name))
```

---

### 4. Favorite Food Sentence

Printing variables inside a sentence:

```python
fave_food1 = "sushi"
fave_food2 = "pizza"

# Using .format()
print("I love to eat {} and {}.".format(fave_food1, fave_food2))

# Using f-string
print(f"I love to eat {fave_food1} and {fave_food2}.")
```

---

## 🎯 Concepts Covered

* `print()` function
* Variables (string & integer)
* String concatenation (`+`)
* Printing with commas
* Type casting (`str()`)
* String formatting:

  * `.format()`
  * f-strings

---

## 🚀 How to Run

1. Save the code in a file:

```
python_basics.py
```

2. Run the file:

```bash
python python_basics.py
```

---

## 📌 Notes

* Using `+` requires both values to be strings.
* Use `str()` to convert numbers to strings when needed.
* f-strings are the modern and recommended way for formatting.

---

## 📌 Author

**Hosni Ahmad**
Aspiring Full-Stack Developer

---
