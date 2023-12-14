'''
start = int(input("시작수는?")) #200
end = int(input("끝 점수는?"))  #500
num = int(input("정수를 입력하세요"))#235

result = "%d은(는) %d~%d사이에 없습니다"%(num,start,end)

if  start <= num <= end     :
    result = "%d은(는 %d~%d사이에 있다)"%(num,start,end)
print(result)

'''

#난수(규칙이 없는수)를 구하라
import random
# print(random.random()) # 0<= r < 1
# print(random.randrange(1,7)) #  1<= 랜덤수 <7

thinkNumber = random.randrange(1,31)
c = 0
a1 = int(input("답은?")) 
while   a1 != thinkNumber  :     ##정답을 찾을때 까지 넣어준다. # 반복의 시작점.
    if a1 < thinkNumber :    
        result = "답보다 큰 수 입니다"
        c += 1
    else :
        result = "답보다 작은 수 입니다"
     c += 1
    print(f"{result}")
    a1 = int(input("답은?"))
result = "정답 입니다"
print(f"{c}번만에 찾았습니다")
