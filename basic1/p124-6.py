dog = "아프다"
while dog == "안아프다" :
    print("기능선택")
    print("1개껌.")
    print("2.빼기")
    print("3.곱하기")
    print("4.나누기")

    s=input("메뉴를 선택하세요(1/2/3/4)")
    n=input("진료비는?")
    num1 = int(input("숫자1?:"))
    num2 = int(input("숫자2?:"))
    num3 = int(input("숫자3?:"))

    if s == "1" :
        print(f"{num1} + {num2} + {num3}")
    if s == "2" :
        print(f"{num1} - {num2} - {num3}")
    if s == "3" :
        print(f"{num1} * {num2} * {num3}")
    if s == "4" :
        print(f"{num1} / {num2} / {num3}")
    print("잘못 입력하셧습니다")
    dog = input("계속하실건가요?y/n")
print("수고하셧습니다")

