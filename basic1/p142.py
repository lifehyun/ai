# #for문 , while문
# for x in range(1,11,2) :  # range(1,11,2) 1부터시작  2증가해서 11보다작은수를 만들어주는것 
#     print(x)

# #5 10 ... 95 100
# for x in range(5,101,5) : #5부터 시작해서 5씩 증가해서 100보다 작은수
#     print(x)
# #100 95 90 ... 5 
# for x in range(100,4,-5) : #100부터 시작해서 
#     print(x)

#문제 
#시작수? 3
#마지막수? 100
#결과화면
#3 5 7 9 ... 99
# start = int(input("시작수")) 
# stop = int(input("마지막수"))
# increae = int(input("증가수"))
# for x in range (start,stop,increae) :
#     print(x)   


#1~100까지 합
#변수 1,2,3,4,...100
#합계변수 1,4+2,,1+2+3,1+2+3+4...sum = sum + x

sum = 0 
sumsum = 0
for x in range(1,101,1) : # x = 1 , 2, 3
    sum = sum + x         # 0 + 1 , 1+2, 1+2+3
    sumsum = sumsum + sum # 0 + 0+1 + 1+1+2 ,  1+1+2+1+2+2
print(sum)
print(sumsum)
#합계의 합계변수
#sumsum = 1, 1+(1+2) , 1+(1+2)+(1+2+3) 

# 146page
for x in range(10) : #0~9까지 출력
    print(x)
for x in range(1,11) : #1~10까지 출력
    print(x)
for x in range(1,10,2) :#1~10까지 2씩증가해서 출력 1,3,5,7,9
    print(x)
for x in range(20,0,-2) :#20~ 0까지 -2만큼씩 감소한거 출력
    print(x)

# 2024년도 1월 1일부터 2024년 1월 31일까지 출력하기
year = 2024
month = 1
day = 1
print(year,end="/")
print(month,end="/")
print(day)

for day in range(1,32):
    print(year,month,day,sep="/")
    print() 

# 1 ~ 100 까지 "합계" 구하기 3000넘어가면 멈추고 합계 출력하기
sum = 0
for x in range(1,101) :
    sum += x 
    if sum >= 3000 :    #3000보다 크거나 같다 
        break
print(sum,x)
# 100 ~ 10000 까지 5개씩 증가해서 합계 구하기 5000이면 멈추고 합계
sum = 0
for x in range(100,10001,5):
    sum += x 
    if sum >= 5000 : 
        break
print(sum , x)
# 300 ~ 50000 까지 10개씩 증가해서 합계 구하기 7000이면 멈추고 합계
sum = 0
for x in range(300,50000,10) :
    sum += x
    if sum >= 7000 :
        break
print(sum , x )

#문자열 for문
for x in "abcdefg" :
    print(x)
# "t"가 몇개 인가요?
count = 0
for x in "this is python" :
    print(x)
    if x == "t" :
        count += 1 
print(f"t의 갯수는?{count}개 입니다")
#공백이 몇개인가요 ?
count = 0
for x in "this is python" :
    print(x)
    if x == " ":
        count += 1
print(f"공백의 갯수는 {count}입니다")


# "s"이거나 "i"인것이 몇개 인가요?
count = 0
for x in "this is python" :
    print(x)
    if x == "s" or x == "i":
        count =+ 1 
print(f"'s'이거나 'i'의갯수는 {count}개 입니다")

# 이중 for문 - 구구단 출력
#구구단일때는 구행까지 있고 
#1행일때는 `앞자리 수`가 바뀌고   2*1=2 3*1=3 4*1=4 9*1=9   2,3,4,9
#2행일때는 `뒷자리 수`가 바뀐다   2*2=4 3*2=6 4*2=8 9*2=18  2.2.2.2

for i in range(1,10) : #1~9까지 나와야하니까
    for j in range(2,10) : #2~9까지 나와야하니까
        # print(f"{j}x{i}={j*i}",end=",")
        print("%2dX%2d=%2d "%(j, i, j*i),end=" ")
    print()
#행열은 2 ~ 
#2단은 옆으로 2*1 ... 2*9
#3단은 옆으로 2*1 ... 2*9
for i in range(2,10) :
    for j in range(1,10):
        print("%2dX%2d=%2d"%(i, j,i*j),end=" ")
    print()

#156쪽
#1행 1번 , 2행 2번 , 3행 3번
for i in range(1,10) :
    for j in range(1 , i+1) :
         print("*"*i,end=" ")
print()
   

for i in range(1,10) : 
    print("*"* i)
print()
#157쪽 별나오게 하기 
for j in range(10,0,-1) :
    print("*"*j)    

for i in range(1,11):
    for j in range(i, 11) : 
        print("*",end=" ")
    print()

for i in range (1,6) :      #i가 1,2,3,4,5 만들어진다
    for j in range(1,6-i) : #i가  4번 반복해야하니까
        print(" ",end="")   #공백 출력
    for k in range (1,2*i): #i가 2,4,6,8,10 만들어진다
        print("*",end="")   #별 출력
    print()  
    
