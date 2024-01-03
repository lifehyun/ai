#오류를 대처라는 방법을 프로그래밍하기

def divide(a,b):
    try :
        x = 10
        print(x)
        def divide(a,b) :
            c = a/b
            print(c)
        divide(10,0)
    except NameError :
        print("변수의 값이 없습니다")
    except ZeroDivisionError :
        print("0으로 나눌 수 없다")
    finally :
        print("모두처리됨")

divide(10,2)