# Basic - Print all integers from 0 to 150
for i in range(0, 151):
    print(i)

# Multiples of Five - Print multiples of 5 from 5 to 1000
for i in range(5, 1001, 5):
    print(i)

# Counting, the Dojo Way
for i in range(1, 101):
    if i % 10 == 0:
        print("Coding Dojo")
    elif i % 5 == 0:
        print("Coding")
    else:
        print(i)

# Whoa. That Sucker's Huge - Sum of odd integers from 0 to 500,000
total = 0
for i in range(1, 500001, 2):
    total += i
print(total)

# Countdown by Fours
for i in range(2018, 0, -4):
    print(i)

# Flexible Counter
num1 = 2
num2 = 9
mult = 3

for i in range(num1, num2 + 1):
    if i % mult == 0:
        print(i)