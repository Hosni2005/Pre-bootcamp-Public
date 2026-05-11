# Zoo Management System 🦁🐶🦊🐑

A simple Python Object-Oriented Programming project that simulates a zoo management system.  
This project demonstrates how to use inheritance, method overriding, and object composition in Python.

---

## 📌 Project Overview

The Zoo Management System allows you to create different animals, add them to a zoo, feed them, update the zoo time, and display animal information.

The project includes a base `Animal` class and several animal subclasses:

- Dog
- Fox
- Lion
- Sheep

Each animal has its own attributes and behaviors.

---

## 📁 Project Structure

```bash
Zoo-Management-System/
│
├── animal.py
├── dog.py
├── fox.py
├── lion.py
├── sheep.py
└── zoo.py
```

---

## 🧠 OOP Concepts Used

| Concept | Description |
|---|---|
| Class | Used to create blueprints for animals and zoo objects |
| Object | Each animal and zoo is created as an object |
| Inheritance | Dog, Fox, Lion, and Sheep inherit from Animal |
| Method Overriding | Some animals have their own version of the `feed()` method |
| Composition | The Zoo class stores multiple animal objects |

---

## 🐾 Classes

### Animal Class

The `Animal` class is the parent class for all animals.

It includes:

- `name`
- `health`
- `age`
- `happiness`

Methods:

- `display_info()`
- `feed()`

---

### Dog Class

The `Dog` class inherits from `Animal`.

Extra attributes:

- `loyalty`
- `position`

Methods:

- `get_loyalty()`
- `get_position()`
- `order()`
- `feed()`

---

### Fox Class

The `Fox` class inherits from `Animal`.

Extra attribute:

- `attack`

Methods:

- `get_attack()`
- `run()`
- `feed()`

---

### Lion Class

The `Lion` class inherits from `Animal`.

Extra attribute:

- `attack`

Methods:

- `get_attack()`
- `roar()`

---

### Sheep Class

The `Sheep` class inherits from `Animal`.

Extra attributes:

- `woolLength`
- `woolColor`

Methods:

- `get_wool_length()`
- `get_wool_color()`
- `shave()`

---

### Zoo Class

The `Zoo` class manages all animals.

It includes:

- Zoo name
- Animal list
- Current time

Methods:

- `add_animal()`
- `get_animals()`
- `feed_animals()`
- `update_time()`
- `display_animals()`

---

## ▶️ How to Run

1. Make sure Python is installed on your device.
2. Put all files in the same folder.
3. Open the terminal inside the project folder.
4. Run the following command:

```bash
python zoo.py
```

---

## 💻 Example Code

```python
zoo1 = Zoo("Zoo1")

zoo1.add_animal(Dog("Todo", 100, 4, 10))
zoo1.add_animal(Sheep(10, "black", "sheep1", 70, 1, 5))
zoo1.add_animal(Lion("Gojo", 80, 7, 7))
zoo1.add_animal(Fox("Kurama", 50, 3, 5))

zoo1.update_time(13)
zoo1.feed_animals(14)
zoo1.display_animals()
```

---

## 📤 Example Output

```bash
It's too early to feed the animals.

Name: Todo
Health: 110
Age: 4
Happiness: 30

--------------------

Name: sheep1
Health: 80
Age: 1
Happiness: 15

--------------------

Name: Gojo
Health: 90
Age: 7
Happiness: 17

--------------------

Name: Kurama
Health: 60
Age: 3
Happiness: 20

--------------------
```

---

## ✅ Features

- Create different animal types
- Add animals to a zoo
- Feed all animals
- Update zoo time
- Display animal information
- Practice inheritance and method overriding

---

## 🛠️ Technologies Used

- Python
- Object-Oriented Programming

---

## 🎯 Learning Goals

This project helps practice:

- Creating classes
- Using inheritance
- Overriding methods
- Managing objects inside another class
- Writing organized Python files

---

## 👨‍💻 Author

**Hosni Ahmad**

Computer Science Student  
Full-Stack Developer
