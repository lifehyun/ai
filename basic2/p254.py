#함수
#용도는? 역할을 담당 것
#사용법은? 만들기 -> 호출해서 사용
def hello(): #만들기
    print("Hi!") 

def goodMorning():
    print("Good Morning")

#호출
hello() 
goodMorning() 

#함수의 종류
#내장함수 : 파이썬에서 미리 만들어 둔것
#사용자정의 함수: 프로그래머가 만들어 주는 함수
#요구사항
#안녕! 현희야 , 안녕! 길동야, 안녕! 민수야

def hi(name):   #매개변수
    print(f"안녕! {name}야 ")

hi("현희") #매개변수의 들어갈 값
hi("길동")
hi("민수")

#나는 현희야 키가 160이야, 나는 길동야 키가 180이야 #나는 민수야 키가 170이야
def height(name , height ):
    print(f"나는 {name}야,키가 {height}이야")
height("현희",160)
height("길동",180)
height("민수",170)

#263 여러개 매개변수인 경우(가변인 경우)
def averge(*args): # *로하면 한개가 아닌 여러개를 구할때 *로 구하면 된다.
    print(type(args))
    print(args)
    num_args = len(args) # 실인수의 갯수가 나온다 
    sum = 0
    for i in args : 
        sum = sum + i
    avg = sum / num_args
    print(f"평균은 {avg}")

averge(85,96,87)
averge(85,96,87,97,72)
averge(5,78)

# 함수를 만들어 보세요.
def All(*str1):
    # 갯수를 구하세요
    s = "" #빈공간
    for i in str1:
        s = s + i
        print(s)

All("a","b") # 출력은 ab
All("a","b","c") #출력은 abc
All("a","b","c","d")#출력은 abcd

#리스트:수정이 된다. 중복가능
def func(food) :    #fruits리스트의 주소(힙메모리)가 전달
    food.append("귤")
    print(food)
    for x in food :
        print(x)    #주소를 찾아가서 값을 찍어준다.
    

fruits = ["사과","오렌지","바나나","사과"] 
func(fruits)
#튜플 과 리스트의 차이점: -> 수정 , 변경이 안되는것  
def tD(tDP) :
    # tDP.append("코스코")
    # print(tDP)
    for i in tDP:
        print(i)

tupleData = ("삼성","LG","세스코")
tD(tupleData)

#딕셔너리 자바 - 맵
def dicF(dictData):
    dictData[4]="d"
    print(dictData)

dictData = {1:"a",2:"b",3:"c"}
dicF(dictData)

def returnSum(a1,a2,a3) :
   A = a1 + a2 + a3
   return A

rs = returnSum(10,20,30)    #답을 가지고 돌아온다
print(rs)

#반지름 10을 이용해서 원의 넒이를 구하는 함수를 만드세요.
def returnArea(r) :
    return r * r * 3.14

CircleArea = returnArea(10)
print(CircleArea)