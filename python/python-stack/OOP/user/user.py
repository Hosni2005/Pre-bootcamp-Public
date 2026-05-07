class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account_balance = 0

    def make_deposit(self, amount):
        self.account_balance += amount
        return self

    def make_withdrawal(self, amount):
        self.account_balance -= amount
        return self

    def display_user_balance(self):
        print(f"User: {self.name}, Balance: ${self.account_balance}")
        return self

    def transfer_money(self, other_user, amount):
        self.account_balance -= amount
        other_user.account_balance += amount
        return self


user1 = User("abdallah", "abdallah@gmail.com")
user2 = User("jalil Musk", "jalilmusk@gmail.com")
user3 = User("Hosni Ahmad", "hosninouraldin@gmail.com")

user1.make_deposit(1000).make_deposit(1000).make_deposit(1000).make_withdrawal(500)
user1.display_user_balance()

user2.make_deposit(300).make_deposit(200).make_withdrawal(100).make_withdrawal(50)
user2.display_user_balance()


user3.make_deposit(500).make_withdrawal(100).make_withdrawal(50).make_withdrawal(25)
user3.display_user_balance()



user1.transfer_money(user3, 100)


user1.display_user_balance()
user3.display_user_balance()