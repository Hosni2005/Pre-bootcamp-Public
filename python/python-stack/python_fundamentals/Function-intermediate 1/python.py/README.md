# Random Integer Function Assignment

## Overview

This assignment focuses on creating a custom `randInt()` function in Python without using `random.randint()`.

The function uses `random.random()` to generate random numbers based on different argument combinations.

---

# Requirements

The `randInt()` function should behave as follows:

* If no arguments are provided:

  * Return a random number between `0` and `100`

* If only `max` is provided:

  * Return a random number between `0` and `max`

* If only `min` is provided:

  * Return a random number between `min` and `100`

* If both `min` and `max` are provided:

  * Return a random number between `min` and `max`

* If `min` is greater than `max`:

  * Swap the values automatically

---

# Python Code

```python
import random

def randInt(min=None, max=None):

    if min == None and max == None:
        min = 0
        max = 100

    elif min == None:
        min = 0
        max = 50

    elif max == None:
        min = 50
        max = 100

    if min > max:
        min, max = max, min

    num = random.random() * (max - min) + min
    return num

print(randInt())
print(randInt(max=50))
print(randInt(min=50))
print(randInt(min=50, max=500))
```

---

# Concepts Used

* Python Functions
* Default Parameters
* Conditional Statements
* Random Number Generation
* Variable Swapping
* Mathematical Operations

---

# Example Output

```python
34.6721
12.8845
76.5521
423.1944
```

The output changes every time because the numbers are randomly generated.

---

# Notes

* The function uses `random.random()` instead of `random.randint()`.
* `random.random()` generates a floating-point number between `0.0` and `1.0`.
* The formula:

```python
random.random() * (max - min) + min
```

is used to generate a random number within the desired range.

---

# Author

Hosni Ahmad
