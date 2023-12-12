# 문자열 연산자
x = '토끼' *10
print(x)

#1번
x = '수학성적'
y = 80
# z = x+y
d = (str)(y) + x
print(d)
#2번
date ="20220301"
year = date[0:4]
month = date[4:6]
day = date[6:]
date2 = year + " "+month + " "+day
print(date2)

# #3번
# *
# //
# %
# +

#p65쪽
x = '가는 말이 고와야 오는 말이 곱다.'
n = len(x)
print('문자열의길이:'+str(n))

#p66쪽
#1번
x = '말 한마디로 천냥 빚을 갚는다'
print(len(x))

#2번
x ='-'*10
y ='거북이'*10
print(x+y)
print(len(x+y))

#3번
x = 'apple'+str(123)
y = "-"*10+"="*20
print(len(x+y))

#p67쪽
animal = '고양이'
x = '나는 %s를 좋아합니다'%animal
print(x)

age = 25
print('내 나이는 %d살 입니다' % age)

name = input('이름을 입력하세요')
print('%s 입니다'%name)

# score = (int)(input('점수는'))
# print( type(score))     #type이 어떤건지 보여주는것
# print('%d 점입니다'%score)


# # 실수 반지름 12.5789를 입력받아서 원넓이(반지름*반지름*3.14)를 구하세요
# radius = (float)(input("반지름은?"))
# area = radius*radius*3.14
# print("%f 원넓이"%area)
# #소숫점 3째짜리까지 나오게 하세요

name = '홍지영'
a = 10
b = 20
print(name,a,b,a-b,100,sep="")

#76 널이란? 값이 없는것 "" <

print('문자열에는 문자 앞 뒤에 쌍따옴표(\")를 붙인다') #이스케이프 문자 (\")  \n붙인다.

