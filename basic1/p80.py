#3번 문제
kor = 85
eng = 87
math = 99
print(kor+eng+math)
# kor = (input"국어 성적을 입력하세요:")
# eng = (input"영어 성적을 입력하세요:")
# math = (input"수학 성적을 입력하세요:")

# # 83 탄생년을 입력받아 나이계산하기
# name = input("당신의 이름은?")
# birth = int(input("년도?"))  # "2005" -> int사용시 -> 2005로변경
# age = (datetime.today().year - birth)
# print(f"{name}님의 나이는 {age}세입니다")

import datetime
current_date_time = datetime.datetime.now()
current_year = current_date_time.year
print("현재연도:",current_year)

#86페이지
# 오늘의 연월일이 나오는 함수1
# year = input('년은?')
# month = input('월은?')
# day = input('일은?')
# 오늘의 연월일이 나오는 함수2
from datetime  import datetime 
year = datetime.today().year
month = datetime.today().month
day = datetime.today().day
weekday = datetime.today().weekday() 
print(year,month,day,weekday,sep=".") #출력값 weekday는 2라고 나온다 오늘은 화요일 :0.1.2
#1이면 2면 ~ 6까지 나와줘야하니까 elif           
if weekday == 0 : # :뒤에는 /t 들여쓰기를 해줘야한다.
    weekdayHan = "월"
elif weekday == 1:
    weekdayHan = "화"
elif weekday == 2:
    weekdayHan = "수"
elif weekday == 3:
    weekdayHan = "목"
elif weekday == 4:
    weekdayHan = "금"
elif weekday == 5:
    weekdayHan = "토"
elif weekday == 6:
    weekdayHan = "일"
print(f'{weekdayHan}요일입니다')


#87페이지
width = 10
height = 5
length = width * 2 + height * 2     #사각형 둘레
area = width * height               #사각형 넓이
print(f'사각형의 둘레는:{length}')
print(f'사각형 넓이:{area}')

# 만약에 사각형의 넓이가 100이 넘으면 큰 사각형이네요 / 아니면 작은 사각형이네요 라고 출력하기
# 아니다 맞다 true false 결과만 나오면 되니까 else 
if area >= 100 :        #>= 부호
    print('큰사각형이네요')
else :
    print('작은 사각형이네요') 

#넓이가 100<=넓이 <= 300 큰사각형 
#       50          99   중간
#        0          49   작은

if 100 <= area <= 300 :
    print('큰사각형')
elif  50 <= area <= 99 :
    print('중간사각형')
elif 0 <= area <= 49 :
    print('작은사각형')

    