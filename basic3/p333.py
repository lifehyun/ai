#내장함수p332
import math

print(math.sin(1/2))
print(math.cos(0))      

# x = 12.3 : 작은수12 , 12.3 큰수 13 ,  음수값: 작은수 -13 ,-12.3 , 큰수 -12

print(math.ceil(-12.3))     #x보다 작지않은 최대값 구하기
print(math.floor(12.3))     #x보다 작지않은 최소값 구하기
print(math.floor(-12.3))    #x보다 작지않은 최소값 구하기

#print(math.round(12.3)):math모듈의 내장함수가 아니다
print(round(12.7))#파이썬 자체 내장함수이다: 반올림0.5이상

# ****fsum():함수의 합계를 구해주는 함수
list1 = [1,2,3,4,5,6]
tuple1 = (1,2,3)
print(math.fsum(list1))
print(math.fsum(tuple1))

#log10:100의대한 값을 구해주는 함수
print(math.log10(100))
print(math.log10(1000))

#pow:거듭제곱 값을 구해주는 함수
print(math.pow(3,2))
#sqrt:거듭제곱한 제곱근을 구해주는 함수
print(math.sqrt(4))