#나이를 입력 받아서 65세 이상이면 입장료 무료
# 티켓변수에 2000원을 넣는다
# 나이를 입력 받아 변수에 넣는다
# 조건문으로 나이가 65세 이상인지 판단한다.
# 나이가 61이상이면 0 40~60 1000 30~39 1500 20~29 2000 10 이하 0원
# 티켓변수에 0을 넣는다
# 티켓을 출력한다
# 나이를 입력받는게 아니라 태어난 연도 입력 하면 나이가 계산해서
from datetime import datetime #나이 구하는함수
ticket = 2000
birth = (int)(input("태어난 연도는?"))
currentyear = datetime.today().year
age = currentyear - birth
if age < currentyear :
    print(f"올해가 {currentyear}")
    print("입력이 잘못되었네요")
else :
    if age >= 61 or age <= 10:
        ticket = 0
    elif age <=40<= 60 :
        ticket = 1000
    elif age <=30<= 39 :
        ticket = 1500
    elif age <=20<= 29 :
        ticket = 2000
    elif age <=10<= 18 :
        ticket = 2500
        print(f"당신의 나이는{age}입니다")
        print(f"입장료는 {ticket}입니다")












