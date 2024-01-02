#날짜와 시간을 구해주는 함수이다.
#datetime의 모듈

import datetime
#import datetime as dt
#from p346 import timedelte , today , now , strftime  

time1 = datetime.timedelta(days=3, hours=3, minutes=30)
time2 = datetime.timedelta(days=5, hours=5, minutes=40)

print(time2 - time1)   #time2에서 time1을 뺀값 , 출력값:2일 2시간 10분
print(time2 + time1)   #time2에서 time1을 더한값,출력값:8일 9시간 10분

#오늘날짜 구하기
today = datetime.date.today() #datetime.date클래스에.today를 사용
print(today) 
week = datetime.timedelta(weeks=1) 
next_week = today + week
print(next_week) #다음주
before_week = today - week
print(before_week) #이전주

#현재날짜시간 구하기
now = datetime.datetime.now() #모듈명.클래스명.함수명
print(now)          #현재날짜시간
print(now.year)     #년도만출력
print(now.month)    #달만출력
print(now.day)      #일만출력
print(now.minute)   #분만출력
print(now.second)   #초만출력
print(now.astimezone)





