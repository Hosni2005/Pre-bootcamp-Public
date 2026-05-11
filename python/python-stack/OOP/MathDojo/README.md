# MathDojo Assignment

## Description
This project demonstrates the use of Python classes, method chaining, and variable-length arguments using `*args`.

The `MathDojo` class allows users to:
- Add multiple numbers
- Subtract multiple numbers
- Chain methods together
- Store the final result inside the `result` attribute

---

## Features
- Object-Oriented Programming (OOP)
- Method Chaining
- Flexible Functions with `*args`
- Simple Mathematical Operations

---

## Code

```python
class MathDojo:
    def __init__(self):
        self.result = 0

    def add(self, num, *nums):

        self.result += num

        for n in nums:
            self.result += n

        return self

    def subtract(self, num, *nums):

        self.result -= num

        for n in nums:
            self.result -= n

        return self


# create an instance:
md = MathDojo()

# to test:
x = md.add(8).add(2,5,1).subtract(3,2).result

print(x)
```

---

## Example Output

```bash
11
```

---

## How It Works

### Step-by-Step Calculation

```text
Start = 0

add(8)
0 + 8 = 8

add(2,5,1)
8 + 2 + 5 + 1 = 16

subtract(3,2)
16 - 3 - 2 = 11
```

Final Result:

```text
11
```

---

## Concepts Used

### `*args`
Allows passing multiple arguments into a function.

Example:

```python
def test(*nums):
    print(nums)
```

Output:

```python
(1, 2, 3)
```

---

## Method Chaining

Returning `self` allows multiple methods to be connected together.

Example:

```python
md.add(5).subtract(2).add(10)
```

---

## Author

Hosni Ahmad
