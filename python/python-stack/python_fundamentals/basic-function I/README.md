# 🧠 Python Functions – Output Prediction

This project focuses on understanding how Python functions behave by predicting their outputs. It covers key concepts such as `return`, `print`, variable scope, and function calls.

---

## 📖 Overview

The exercises are designed to help you:

* Understand the difference between `print()` and `return`
* Learn how function execution works
* Predict outputs before running code
* Understand variable scope (local vs global)
* Analyze function calls and execution flow

---

## 📂 Project Structure

```
functions_output_practice.py
README.md
```

---

## ⚙️ Exercises Included

### 1. Basic Return

```python
def a():
    return 5

print(a())
```

---

### 2. Function Call Addition

```python
def a():
    return 5

print(a() + a())
```

---

### 3. Code After Return (Ignored)

```python
def a():
    return 5
    return 10

print(a())
```

---

### 4. Print After Return (Ignored)

```python
def a():
    return 5
    print(10)

print(a())
```

---

### 5. Print vs Return

```python
def a():
    print(5)

x = a()
print(x)
```

---

### 6. Function Without Return (Error Case)

```python
def a(b, c):
    print(b + c)

print(a(1, 2) + a(2, 3))
```

---

### 7. String Concatenation

```python
def a(b, c):
    return str(b) + str(c)

print(a(2, 5))
```

---

### 8. Conditional Return

```python
def a():
    b = 100
    print(b)
    if b < 10:
        return 5
    else:
        return 10

print(a())
```

---

### 9. Multiple Returns

```python
def a(b, c):
    if b < c:
        return 7
    else:
        return 14

print(a(2, 3))
print(a(5, 3))
print(a(2, 3) + a(5, 3))
```

---

### 10. Return Stops Execution

```python
def a(b, c):
    return b + c
    return 10

print(a(3, 5))
```

---

### 11. Global vs Local Variable

```python
b = 500
print(b)

def a():
    b = 300
    print(b)

print(b)
a()
print(b)
```

---

### 12. Return Without Reassignment

```python
b = 500
print(b)

def a():
    b = 300
    print(b)
    return b

print(b)
a()
print(b)
```

---

### 13. Return With Reassignment

```python
b = 500
print(b)

def a():
    b = 300
    print(b)
    return b

print(b)
b = a()
print(b)
```

---

### 14. Function Inside Function

```python
def a():
    print(1)
    b()
    print(2)

def b():
    print(3)

a()
```

---

### 15. Nested Function with Return

```python
def a():
    print(1)
    x = b()
    print(x)
    return 10

def b():
    print(3)
    return 5

y = a()
print(y)
```

---

## 🎯 Concepts Covered

* `print()` vs `return`
* Function execution order
* Code after `return`
* Function parameters
* String conversion using `str()`
* Local vs global variables
* Function calls inside functions
* Storing return values

---

## 🚀 How to Run

1. Save the code in a file:

```
functions_output_practice.py
```

2. Run the file:

```bash
python functions_output_practice.py
```

---

## 📌 Notes

* `print()` displays output but returns `None`
* `return` sends a value back from the function
* Any code after `return` does not execute
* Local variables do not affect global variables unless reassigned
* Always predict the output before running the code

---

## 📌 Author

**Hosni Ahmad**
Aspiring Full-Stack Developer

---
