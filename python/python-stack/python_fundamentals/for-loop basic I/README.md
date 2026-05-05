# 🧠 Python Loop Practice

This project contains a collection of loop-based exercises designed to strengthen fundamental Python skills such as iteration, conditions, and problem-solving.

---

## 📖 Overview

The exercises focus on understanding how loops work in Python and how to combine them with conditional logic. Each task demonstrates a different use case of loops and helps build a strong programming foundation.

---

## 📂 Project Structure

```
loops_practice.py
README.md
```

---

## ⚙️ Exercises Included

### 1. Basic - Print All Integers (0 → 150)

Print all numbers from 0 to 150.

```python
for i in range(0, 151):
    print(i)
```

---

### 2. Multiples of Five (5 → 1000)

Print all multiples of 5 between 5 and 1000.

```python
for i in range(5, 1001, 5):
    print(i)
```

---

### 3. Counting, the Dojo Way

* If a number is divisible by 10 → print `"Coding Dojo"`
* If divisible by 5 → print `"Coding"`
* Otherwise → print the number

```python
for i in range(1, 101):
    if i % 10 == 0:
        print("Coding Dojo")
    elif i % 5 == 0:
        print("Coding")
    else:
        print(i)
```

---

### 4. Sum of Odd Numbers (0 → 500,000)

Calculate the total sum of all odd numbers in the range.

```python
total = 0
for i in range(1, 500001, 2):
    total += i
print(total)
```

---

### 5. Countdown by Fours

Count down from 2018 to 0, decreasing by 4 each step.

```python
for i in range(2018, 0, -4):
    print(i)
```

---

### 6. Flexible Counter

Print numbers between `num1` and `num2` that are divisible by `mult`.

```python
num1 = 2
num2 = 9
mult = 3

for i in range(num1, num2 + 1):
    if i % mult == 0:
        print(i)
```

---

## 🎯 Concepts Covered

* `for` loops and iteration
* Using `range()` with start, stop, and step
* Conditional statements (`if`, `elif`, `else`)
* Modulus operator `%` for divisibility
* Accumulators for summing values

---

## 🚀 How to Run

1. Make sure Python is installed on your system.
2. Save your code in a file named:

```
loops_practice.py
```

3. Run the file using:

```bash
python loops_practice.py
```

---

## 📌 Author

**Hosni Ahmad**
Aspiring Full-Stack Developer

---
