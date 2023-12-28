a = 10 
print(a)

def f() : 
    global y #함수 밖에 있는 전역변수
    
    print(x)

x = 25 #전역변수
f()


