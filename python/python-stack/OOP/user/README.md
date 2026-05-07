# User Class Assignment

## Overview
This project is a Python Object-Oriented Programming (OOP) assignment that creates a `User` class to simulate basic banking operations.

The application allows users to:
- Deposit money
- Withdraw money
- Display account balances
- Transfer money between users

---

## Features

### User Class Methods

#### `__init__(self, name, email)`
Initializes a new user with:
- Name
- Email
- Starting account balance set to `$0`

---

#### `make_deposit(self, amount)`
Adds the specified amount to the user's balance.

Example:
```python
user.make_deposit(500)
make_withdrawal(self, amount)

Subtracts the specified amount from the user's balance.

Example:

user.make_withdrawal(100)
display_user_balance(self)

Displays the user's current balance.

Example Output:

User: Hosni Ahmad, Balance: $425
transfer_money(self, other_user, amount) (Bonus)

Transfers money from one user to another.

Example:

user1.transfer_money(user2, 100)
Technologies Used
Python 3
Concepts Practiced
Object-Oriented Programming (OOP)
Python Classes
Instance Attributes
Methods
Method Chaining
Object Interaction
Project Structure
project-folder/
│
├── user.py
└── README.md
How to Run
Install Python 3
Open the project folder
Run the program using:
python user.py
Example Output
User: abdallah, Balance: $2500
User: jalil Musk, Balance: $350
User: Hosni Ahmad, Balance: $325

After Transfer:
User: abdallah, Balance: $2400
User: Hosni Ahmad, Balance: $425
Author

Hosni Ahmad
Computer Science Student & Aspiring Full-Stack Developer