
print("기능선택")
print("1.더하기")
print("2.빼기")
print("3.곱하기")
print("4.나누기")

s=input("계산기 기능을 선택하세요(1/2/3/4)")
count = int(input("계산할 숫자갯수는?"))
result = 0
first = 0
while count > 0 :
    num1 = int(input("숫자1?:"))
    count = count - 1
    if s == "1" :
        result += num1
    elif s == "2":
        first = "y"
        result -= num1
        first = "n"
    elif s == "3" :
        first = "y"
        result *= num1
        first = "n"
    elif s == "4" : 
        first = "y"
        result /= num1
        first = "n"
        print("입력된 숫자가 잘못 되었습니다")
        
    
    
    
    
    
    # num2 = int(input("숫자2?"))
    # if s == "1" :
    #     print("%d + %d = %d"%(num1,num2, num1 + num2 ) )
    # if s == "2" :
    #     print(f"{num1} - {num2}")
    # if s == "3" :
    #     print(f"{num1} * {num2}" )
    # if s == "4" :
    #     print(f"{num1} / {num2}" )
    # print("입력된 숫자가 잘못 되었습니다")


