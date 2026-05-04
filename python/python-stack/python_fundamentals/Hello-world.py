# 1. TASK: print "Hello World"
print("Hello World")


# 2. print "Hello Noelle!" with the name in a variable
name = "Noelle"

# with a comma
print("Hello", name)

# with a +
print("Hello " + name)


# 3. print "Hello 42!" with the number in a variable
name = 42

# with a comma
print("Hello", name)

# with a +  (this will cause error)
# print("Hello " + name)

# FIX (NINJA BONUS)
print("Hello " + str(name))


# 4. print "I love to eat sushi and pizza."
fave_food1 = "sushi"
fave_food2 = "pizza"

# with .format()
print("I love to eat {} and {}.".format(fave_food1, fave_food2))

# with f-string
print(f"I love to eat {fave_food1} and {fave_food2}.")