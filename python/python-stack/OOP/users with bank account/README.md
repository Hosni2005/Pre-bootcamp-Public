# Bank Account & User Association System

## Overview
This project demonstrates Object-Oriented Programming (OOP) concepts in Python using two connected classes:

- `BankAccount`
- `User`

The `User` class is associated with the `BankAccount` class, allowing users to perform banking operations through their account object.

---

## Features

### BankAccount Class
- Create a bank account with:
  - Interest rate
  - Balance
- Deposit money
- Withdraw money
- Display account information
- Apply interest to the balance

### User Class
- Create users with:
  - Name
  - Email
- Make deposits
- Make withdrawals
- Display user balance
- Association with the `BankAccount` class

---

## Technologies Used
- Python 3
- Object-Oriented Programming (OOP)

---

## Code Example

```python
user1 = User("Hosni Ahmad", "hosni@gmail.com")

user1.make_deposit(1000)\
     .make_deposit(500)\
     .make_withdrawal(200)\
     .display_user_balance()