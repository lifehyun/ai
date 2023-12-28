# #변수사용법
# a = 100 
# a = 200
# a = "안녕하세요"
# print(a.)

 

a = 100
print(a)
print(f"안녕하세요 {a}")
print(f"안녕하세요 {a}",{a})
# print(f"1*1*1 +"{})

a = 50
b = 100
c = 150
print(f"안녕하세요 {a}")
print(f"안녕하세요 {b}")
print(f"안녕하세요 {c}")


for i in range(1,6,1):
    print(f"안녕하세요{i}")

for j in range(1,5,1):
    print(f"사랑해{j*2}")

def 자판기(받은돈) :    # def 정의하다 자판기(받은돈)
    if 받은돈 == 500 :
        print("레쓰비")
    elif 받은돈 == 1000 :
        print("파워에이드")
    elif 받은돈 == 2000 :
        print("오렌지쥬스")
    
자판기(2000)


def aqua(ticket):
    if ticket == 35000 :
        print("어른 및 청소년")
    elif ticket == 29000 :
        print("어린이 및 경로")
    else :
        print("연중휴무 입니다")

aqua(40000)
    

# for i in range(1,51,1): #시작점,끝나는 지점,증가점
#     print("진단서")


def 프린터기(p):
    for  i in range(1,10,1):
        print("프린터")
프린터기(10)
