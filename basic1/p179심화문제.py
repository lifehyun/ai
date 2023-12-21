#23/12/19
#p179
#심화문제 4-1
#1단계 for문을 이용하여 1~1000까지의 수중 3의 배수가 아닌수를 출력하는 프로그램을 작성
for i in range(1,1001)  : 
    print(i,end=" ")   
#2단계 3의 배수가 아닌것만 출력.
#9 % 3 == 0 이니까 3의 배수이다.
#8 % 3 != 0  3의배수가 아니다.라는 식
for i in range(1,1001) :
    if i % 3 != 0 :
        print(i , end=" ")                                

#3단계 한줄에 10개씩 출력하기
count = 0
for i in range(1,1001) :
    if count == 0 :
        print()
        count = 0
    if  i % 3 != 0 :
        print(i , end=" ")
        count += 1 


# #while문을 이용하여 1~1000까지의 수중 3의 배수가 아닌수를 출력하는 프로그램을 작성

i = 1                   # i라는 변수에  1,2,3,....,1000까지 나오게하는 변수
count = 0               # 한줄에 10개 출력하라
while i <= 1000 :       # i 가 1000보다 크거나 작을동안
    if count == 10 :    # 만약 카운트가 10이랑 같을때
        print()
        count = 0  
    if i % 3 != 0 :
        print(i , end=" ")
        count += 1
    i += 1
#거꾸로 100~ 1 까지 출력하기
for i in range(100,0,-1) :
    print(i, end=" ")
    print()

# #심화문제 4-2 성적을 입력받아 수:90점 이상 , 우:80점 이상 , 미: 70점 이상 , 양: 60점 이상 , 가 :60점 미만을 판정하는 프로그램을 작성하시오. 단'q'를 입력하면 프로그램이 종료됨
con = "y"
while con == "y" :
    jumsu = int(input("성적을 입력하세요"))
    if 90 <= jumsu < 100 :
        result = "수"
    elif 80 <= jumsu <= 89 :
        result = "우"
    elif 70 <= jumsu <= 79 :
        result = "미"
    elif 60 <= jumsu <= 69 :
        result = "양"
    elif 50 <= jumsu <= 59 :
        result = "가"
    print(f"등급:{result}")
    con=input("계속하시겠습니까?(중단:q 계속:y)")
    

#심화문제 4-3
#1단계 시작수 입력받고 끝 수 입력받기 
#2단계 소수를 구하는 프로그램을 작성하세요
start = int(input("시작수를 입력해주세요"))
end = int(input("끝수를 입력해주세요"))
for i in range(start,end+1) :
    print(i,end=" ")
#3단계 시작수 ~ 끝수 , 소수를 출력하기
# 30 소수판단하기 30 % 2 = 0 소수아님
x = True
for i in range(2,30) :
    if 31 % i == 0 :
        x = False
        break 
if x :
    print(f"{31}은 소수이다")
#소수만 출력하기
x = True #소수인경우 X True , True가 아닌경우 False.
for i in range (start,end+1) :      #start : 30  end 80
    x = True
    for j in range(2, start) :        # 2~29지 나누어 본다.
        if i % j == 0 :
            x = False
            break   #한단계 반복문 밖으로 나간다.
    if x :
        print( i , end=" ")

