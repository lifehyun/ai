r = 0 #전역변수
def printSum( sList) :
    #r = 0   #지역변수
    global r 
    r = 0
    for s in sList :
        r += s
    return r

sList = [1,3,5,6,2]
print(printSum(sList))
print(r)
