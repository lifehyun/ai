#while 문
#형식 while 조건문:
#           조건이 참이면 반복하고 
#       조건이 거짓이면 수행할 내용 

#1~ 100까지 합구하기
i = 1
sum = 0
while i <= 100 : #i가 백보다 작거나 같다
    sum += i
    i += 1
print(sum)

#500 ~ 200까지 합구하기
j = 500
sum = 0
while j >= 200 :  #j가 200보다 크다
    sum += j
    j -= 1
print(sum)

# 500 ~ 1000까지 7의 배수로 구하기
# 평균을 구하려면 갯수를 구해야한다.
k = 500
sum = 0
count = 0
while k <= 1000 :
    sum += k
    k += 7
    count += 1
print("갯수 %d"%count)
print("합계 %d"%sum)
print("평균 %.2f"%(sum/count))

#무조건 참일때
#1~50까지 출력하다가 3000이면 멈추기
i = 1
sum = 0
while True : 
    print(i,end=" ")
    sum += i
    i += 1
    if sum >= 3000 :
        break
print(sum)


i = 1
sum = 0
while True : 
    i += 1
    if i % 5 != 0 :
        continue
    if i == 101:
        break
    print(i,end=" ")
  