import random
def randInt(min= None   , max= None  ):
    
    
    if min == None and max == None :
        min = 0
        max = 100
    elif min == None :
        min =0
        max = 50
    elif max == None :
        min = 50
        max = 100
    if min > max :
        min , max = max , min
    
    num = random.random() * (max - min) + min
    return num
print(randInt())             # should print a random integer between 0 to 100
print(randInt(max=50))         # should print a random integer between 0 to 50
print(randInt(min=50))         # should print a random integer between 50 to 100
print(randInt(min=50, max=500))    # should print a random integer between 50 and 500