class BankAccount:
    def __init__(self, interest_rate, balance=0):
        self.interest_rate = interest_rate
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount
        return self

    def withdraw(self, amount):
        self.balance -= amount
        return self

    def display_account_info(self):
        print(f"Balance: ${self.balance}")
        return self

    def yield_interest(self):
        if self.balance > 0:
            self.balance += self.balance * self.interest_rate
        return self


class User:
    def __init__(self, name, email, interest_rate=0.02, balance=0):
        self.name = name
        self.email = email
        self.account = BankAccount(interest_rate, balance)

    def make_deposit(self, amount):
        self.account.deposit(amount)
        return self

    def make_withdrawal(self, amount):
        self.account.withdraw(amount)
        return self

    def display_user_balance(self):
        print(f"User: {self.name}, Balance: ${self.account.balance}")
        return self

    def transfer_money(self, other_user, amount):
        self.account.withdraw(amount)
        other_user.account.deposit(amount)
        return self

    def yield_interest(self):
        self.account.yield_interest()
        return self


# Create users
user1 = User("abdallah", "abdallah@gmail.com", 0.05, 1000)
user2 = User("jalil Musk", "jalilmusk@gmail.com", 0.03, 500)
user3 = User("Hosni Ahmad", "hosninouraldin@gmail.com", 0.04, 300)


# User 1 transactions with chaining
user1.make_deposit(1000)\
    .make_deposit(500)\
    .make_deposit(250)\
    .make_withdrawal(300)\
    .yield_interest()\
    .display_user_balance()


# User 2 transactions
user2.make_deposit(400)\
    .make_withdrawal(100)\
    .yield_interest()\
    .display_user_balance()


# User 3 transactions
user3.make_deposit(200)\
    .make_withdrawal(50)\
    .display_user_balance()


# Transfer money
user1.transfer_money(user3, 150)

print("\nAfter Transfer:")

user1.display_user_balance()
user3.display_user_balance()