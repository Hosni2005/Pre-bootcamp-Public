# Alfred Bot

## Overview

Alfred Bot is a simple Java application that simulates the responses of Alfred Pennyworth, Bruce Wayne's loyal butler and assistant. The project demonstrates fundamental Java concepts including classes, methods, method overloading, String manipulation, conditional statements, and working with dates.

## Features

### Basic Greeting

Returns a standard greeting from Alfred.

**Example Output**

```
Hello, lovely to see you. How are you?
```

### Guest Greeting

Greets a guest by name.

**Example Output**

```
Hello, Beth Kane. Lovely to see you.
```

### Date Announcement

Announces the current date and time using Java's Date class.

**Example Output**

```
It is currently Sat Jun 21 10:30:45 PDT 2026.
```

### Respond Before Alexis

Analyzes a conversation and responds appropriately:

* If the conversation mentions "Alexis", Alfred gives a witty response.
* If the conversation mentions "Alfred", Alfred offers assistance.
* Otherwise, Alfred gives a neutral response.

**Example Outputs**

```
Right away, sir. She certainly isn't sophisticated enough for that.
```

```
At your service. As you wish, naturally.
```

```
Right. And with that I shall retire.
```

### Ninja Bonus: Method Overloading

An overloaded guestGreeting method allows Alfred to greet guests based on the time of day.

**Example Output**

```
Good evening, Beth Kane. Lovely to see you.
```

### Sensei Bonus

A custom Alfred method demonstrating String manipulation.

**Example Output**

```
WHERE IS THE BATMOBILE!!!
```

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java String Methods
* java.util.Date

## Project Structure

```
alfredBot/
│
├── AlfredQuotes.java
└── AlfredTest.java
```

## How to Run

### Compile the Project

```bash
javac AlfredTest.java
```

### Run the Program

```bash
java AlfredTest
```

## Learning Objectives

This project demonstrates:

* Creating and using classes
* Writing methods with return values
* Using parameters
* Method overloading
* Conditional logic (if / else if / else)
* String manipulation
* Working with Date objects
* Testing functionality through a main method

## Author

Hosni Ahmad
