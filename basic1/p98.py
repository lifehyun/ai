#if문에서는 들여오고 내오는게 중요함
#>크다 <작다  ==같다 != 같지않다 <=작거나같다 >= 크거나같다
# 조건문의 서식은 (조건) : ()
x = 10
y = 20
if not x >= 0  or y >= 0:  #10 크거나 같다 참 , 20 크거나 같다 참
    print("두개 다 양수")     # or ~이거나 , 또는
    print(f"{x} {y}")        # not 반대 참이면 거짓


xx = 10
print( xx % 2 == 0  or xx % 3 == 0)   # T or F

a = 5
b = 7
c = a + b
print(c == 12)

hobby1 = "영화감상"
hobby2 = "수영"
my_hobby = '독서'
print(my_hobby == hobby1 or my_hobby == hobby2)
# false 또는 false

pilgi = 90
silgi = 70
if pilgi >= 80 and silgi >= 80 :
    print("합격")
else :
    print("불합격")


#월을 입력받아서
# 1,2,3월이면 1사분기 # 4,5,6월이면 7,8,9분기
month = int(input('월?'))
if month <= 0 or month > 13 :
    print('잘못된 달 입니다')
elif  1 <= month <= 3 :
    print('1사분기')
elif 4 <= month <= 6 :
    print('2사분기')
elif 7 <= month <= 9 :
    print('3사분기')
elif 10 <= month <= 12 :
    print('4사분기') 
 