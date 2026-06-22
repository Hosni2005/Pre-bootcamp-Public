# Java Exceptions & ArrayList

## Description

This project demonstrates how Java handles exceptions when working with different data types inside an ArrayList. The program stores multiple objects (Strings and Integers) in an ArrayList, attempts to cast each element into an Integer, and handles errors using try/catch blocks.

## Features

* Create an ArrayList containing different object types
* Iterate through the ArrayList
* Attempt to cast each item into an Integer
* Handle `ClassCastException` using exception handling
* Display:

  * Error message
  * Index where the error happened
  * Value that caused the error
* Continue running after handling exceptions

## Technologies Used

* Java
* ArrayList
* Exception Handling
* Try/Catch
* Object Casting

## Project Structure

```text
JavaExceptions/
│
├── TestExceptions.java
└── README.md
```

## How to Run

### Compile

```bash
javac TestExceptions.java
```

### Run

```bash
java TestExceptions
```

## Example Output

```text
Error Message:
class java.lang.String cannot be cast to class java.lang.Integer

Index where error happened:
0

Value causing error:
13

Value:
48

Program continued successfully!
```

## Learning Objectives

* Understand Java Generics and Objects
* Learn how casting works
* Practice using ArrayLists
* Understand runtime exceptions
* Use try/catch blocks to prevent program crashes
* Handle errors gracefully

## Author

Hosni Ahmad

