#지역변수
#전역변수
#변수의 생명주기 life cycle
def func() :
    x = 10  # ★태어남 만들어짐 : 지역변수★
    print(x)

func()
# print(x)  정의 되지않아서 출력이 안됨.

gx = 200 # ★p279.py인 파일에서 태어났다. 파일안에서 다 사용할수 있다. : 전역변수★
def func2() :
    # gx = gx + 300 오류남 "사용"만 할수있다 . "수정" 할수는 없다.
    print(gx)
print()

func2()
print(gx)
gx = gx + 300 #함수밖에서는 오류가 없다.
print(gx)
print()

def func3() : 
    #함수안에 선언한 변수를 전역변수로 만들고 싶다. 
    #그러면 스택 공간에 변수를 할당한다.
    #global이란 함수로 전역변수를 만들어준다. 
    #계속 살아 있는 변수. 쓸때 신중하게 사용. 메모리 비효율적
    #사용 : 장바구니,로그인 계속유지, 포인트 계속 보이기
    global y    
    y = 300 
    y = y - 10
    print(y)

func3()
print(y)
y = y + 20
print(y)
print()

def func4() :
    print(y , "~")

func4()
print()

def func5():
    global x 
    x = 200
    print(x)

x = 100 
print(x,"~~")
func5()
print(x,"~~")

#p284 
def cir_area():
    global r 
    result = r * r * 3.14
    return result

def cir_length():
    global r 
    result = 2 * 3.4 * r
    return result

r = 10 # 밖에있는 전역변수 r  
area = cir_area()
length = cir_length()
print("원의 면적:%.1f,원주의 길이:%.1f"%(area,length))