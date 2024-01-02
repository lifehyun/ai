import time

seconts = time.time()
print(seconts)  #타임스탬프 1970-1-1 0시 0분 0초 가 나온다

tm = time.gmtime()
print(tm)       #그리니치 표준시간대이고 , 우리나라의 시간을 알고싶으면 GMT+9를하면 우리나라의 시간대가 나온다.

#타임스탬프를 가지고 그리니치 표준시를 구하기
tm = time.gmtime(seconts)
print(tm)

#localtime함수:타임스탬프로 (윈도우 운영체제에서 셋팅한 나라:현재 내가 컴퓨터를 하고있는나라)의 현재 시간을 얻는데 사용하는 함수이다. 
tm = time.localtime(seconts) #대한민국 날짜가 나옴
print(tm)

tm = time.localtime() #대한민국 날짜가 나옴
print(tm)

string = time.ctime(seconts) 
print(string)

tm = time.localtime(time.time())
Sf = time.strftime("%Y년 %m월 %d일 %A %I시 %p %M분 %S초")
print(Sf)

print("시작")
time.sleep(1) #sleep딜레이 시키려는 목적: 병목현상을 없애기 위해서 주로 이용
print("끝")

def func() :
    sum = 0
    for i in range(1,10000001) :
        sum += i
    print(sum)

start = time.time()
func()
end = time.time()
print("소요시간",(end-start))