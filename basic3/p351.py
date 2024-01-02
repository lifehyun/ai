#random모듈 : 랜덤이란 임의적으로 만들어낸수 
import random

r1 = random.random() #출력값:0~1사이의 숫자(0 <=  < 1사이의 실수값)
print(r1)

r2 = random.uniform(1,10) #출력값:1~10사이의 숫자(1 <=  < 10 사이의 실수값)
print(r2)

r3 = random.randint(1,6) #출력값:1~6사이의 숫자(1 <=  <=  6 사이의 정수값)
print(r3)

r4 = random.choice([1,2,3,4,5])
r5 = random.choice((1,2,6,7))
r6 = random.choice(" I like Python")
print( r4 , r5 , r6 )