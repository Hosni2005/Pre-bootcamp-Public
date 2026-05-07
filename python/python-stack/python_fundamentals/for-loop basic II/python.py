def biggie_size(n) :
    for i in range (len(n)) :
        if n[i] > 0 :
            n[i] = "big"
    return n
print(biggie_size([-1 , 3 , 5 , -5]))


def count_positive(x) :
    count=0
    arr = []
    for i in range (len(x)) :
        if x[i] > 0 :
            count+=1
        elif x[i] == 0 :
            print("not considered to be a positive number")   
    arr=x
    arr[i]=count
    return arr
print(count_positive([-1,1,1,1]))
print(count_positive([1,6,-4,0,-7,-2]))



def sum_total(y) :
    sum=0
    for i in range (len(y)) :
        sum = y[i] + sum
    return sum
print(sum_total([1,2,3,4]))
print(sum_total([6,3,-2]))




def avarage(x) :
    avg=0
    for i in range (len(x)) :
        avg = x[i] + avg
    return avg/len(x)
print(avarage([1,2,3,4]))



def length(l) :
    return len(l)
print(length([1,2,3,4,5,8]))



def minimum(n) :
    if n :
        min = n[0]
        for i in range(len(n)) :
            if n[i] < min :
                min = n[i]
    else :
        return False
    return min
print(minimum([37,2,1,-9]))




def maximum(n) :
    if n :
        max = n[0]
        for i in range(len(n)) :
            if n[i] > max :
                max = n[i]
    else :
        return False
    return max
print(maximum([37,2,1,-9]))


def ultimate_analysis(x) :
    sum=0 , avg=0 , max = x[0] , min = x[0]
    for i in range (len(x)) :
        sum += x[i]
        avg = sum / len(i)
        if x[i] > max :
            max = x[i]
        else :
            min = x[i]
print ({'sum total' : sum_total(y) , 'avarage': avg , 'minimum' : min , 'maximum' : max})
