# Bank Account Assignment

## Overview

This project demonstrates the use of Object-Oriented Programming (OOP) concepts in Java by creating a `BankAccount` class and a `BankTest` class.

The application allows users to:

* Create bank accounts.
* Deposit money into checking or savings accounts.
* Withdraw money from checking or savings accounts.
* Track the total balance of an individual account.
* Track the total number of bank accounts created.
* Track the total amount of money stored across all accounts.

---

## Classes

### BankAccount

The `BankAccount` class contains:

#### Private Member Variables

* `checkingBalance`
* `savingsBalance`

#### Static Variables

* `accounts` – stores the total number of bank accounts created.
* `totalMoney` – stores the total amount of money across all accounts.

#### Methods

* `deposit()` – adds money to checking or savings.
* `withdraw()` – removes money from checking or savings if sufficient funds exist.
* `getBalance()` – returns the total balance of the account.
* Getter methods for balances, total accounts, and total money.

---

### BankTest

The `BankTest` class is used to test the functionality of the `BankAccount` class.

Tests include:

1. Creating multiple bank accounts.
2. Depositing money into accounts.
3. Withdrawing money from accounts.
4. Displaying account balances.
5. Displaying the total number of accounts.
6. Displaying the total amount of money in the bank.

---

## Features

* Encapsulation using private member variables.
* Static variables shared across all objects.
* Validation for insufficient funds during withdrawals.
* Automatic tracking of bank accounts and total money.

---

## Example Output

Account 1 Balance: $500.0

Account 2 Balance: $1000.0

Account 3 Balance: $1000.0

Total Money in Bank: $2500.0

Account 1 Balance After Withdrawal: $300.0

Account 2 Balance After Withdrawal: $600.0

Account 3 Balance After Withdrawal: $900.0

Number of Accounts: 3

Total Money in Bank: $1800.0

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)

---

## Author

Hosni Ahmad
