# 178 4-6
# 10! = 1 x 2 x 3 .. x 10
# 시작점 , 종료점 , 증가치
for i in range(10) :        #0~9까지 나옴
    print(i, end=" ")
print("-"*10)
for i in range(1,11) :      #1~10까지 나옴 
    print(i , end=" ")
print("-"*30)
for i in range(11,0,-1) :
    print(i , end=" ")
print("-"*30)
for i in "I LOVE YOU !" :
    print(i,end="")

#반복문 while
sum = 0
j = 1
while True :
    if sum >= 5000 :    #만약에 sum이 크거나작다 5000보다
        break           #그럼 멈춰라
    else :              #그렇지 않으면
        j += 1          #j는 1개씩 커진다
        sum += j
print( j , sum)         #while문시 아예 밖으로 나와서 출력해줘야한다.


#178 4-6
# 10! = 1 * 2 * 3 * ... *  10  " 하나씩 곱해서 10까지나오게 해라"
fac = 1
for i in range(1,11) :     #마지막이 10 일시 1개더 크게
    fac = fac * i
print(fac)                 #출력값은 36288000