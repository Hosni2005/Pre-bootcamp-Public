# Bank Account & User Management System

## Overview
This project is a Python Object-Oriented Programming (OOP) application that simulates a simple banking system using two associated classes:

- `BankAccount`
- `User`

The project demonstrates:
- Class associations
- Method chaining
- Deposits & withdrawals
- Interest calculations
- Money transfers between users

---

## Features

### BankAccount Class
The `BankAccount` class handles all banking operations.

#### Included Features
- Deposit money
- Withdraw money
- Display account information
- Apply interest to the balance
- Support method chaining

---

### User Class
The `User` class represents users connected to a bank account.

#### Included Features
- Create users with:
  - Name
  - Email
  - Interest rate
  - Initial balance
- Deposit money into the account
- Withdraw money from the account
- Display current balance
- Transfer money to another user
- Apply account interest

---

## Technologies Used
- Python 3
- Object-Oriented Programming (OOP)

---

## Concepts Practiced
- Classes and objects
- Associations between classes
- Encapsulation
- Method chaining using `return self`
- Reusable methods
- Object interaction

---

## Project Structure

### BankAccount Methods

| Method | Description |
|--------|-------------|
| `deposit(amount)` | Adds money to balance |
| `withdraw(amount)` | Removes money from balance |
| `display_account_info()` | Displays account balance |
| `yield_interest()` | Applies interest if balance is positive |

---

### User Methods

| Method | Description |
|--------|-------------|
| `make_deposit(amount)` | Deposits money |
| `make_withdrawal(amount)` | Withdraws money |
| `display_user_balance()` | Displays user balance |
| `transfer_money(other_user, amount)` | Transfers money to another user |
| `yield_interest()` | Applies interest to user's account |

---

## Example Usage

```python
user1.make_deposit(1000)\
    .make_deposit(500)\
    .make_deposit(250)\
    .make_withdrawal(300)\
    .yield_interest()\
    .display_user_balance()