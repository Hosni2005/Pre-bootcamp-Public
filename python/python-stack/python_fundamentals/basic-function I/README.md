# Python Function Output Practice

This assignment practices predicting Python function outputs and understanding how `return`, `print`, variables, and function calls work.

## Overview

The file contains 15 small Python examples. Each example asks you to predict the output before running the code.

## Concepts Covered

- Functions
- `print()` statements
- `return` statements
- Code after `return`
- Function parameters
- String concatenation
- Variable scope
- Calling functions inside other functions
- Storing return values in variables

## Examples Included

### Return Values
Some functions return values directly:

```python
def a():
    return 5

print(a())
Output:

5
Print vs Return

A function that only prints something returns None automatically:

def a():
    print(5)

x = a()
print(x)

Output:

5
None
Code After Return

Any code written after return will not run:

def a():
    return 5
    return 10

The function returns 5, and return 10 is ignored.

Variable Scope

A variable inside a function is local and does not change the outside variable unless returned and reassigned:

b = 500

def a():
    b = 300
    return b

b = a()
print(b)

Output:

300
Important Notes
print() displays a value but does not return it.
return sends a value back from the function.
A function without return returns None.
Code after return does not execute.
Local variables inside functions do not affect global variables unless reassigned.
How to Run
Save the code in a file, for example:
functions_basic_2.py
Run it using:
python functions_basic_2.py
Author

Hosni Ahmad