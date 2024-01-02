def add(a,b) :
    c = a + b
    return c
def sub(a,b) :
    c = a - b
    return c
def mul(a,b) :
    c = a * b
    return c
def div(a,b) :
    c = a // b
    return c
def mm(a,b) :
    c = b*b + a
    return c
min = 0
def ss(a,b,c) :
    if a < b and a < c :        #a가 b보다 작을때  비교  a가 c보다 작을때
        min = a
    elif b < a and b < c :
        min = b
    else :
        min = c
    return min

