#E7-1 
def func():
    x = 200

x = 200
func()
print(x)


#E7-2
def func():
    x = 200
    print(x)

x = 100
func()
print(x)

#E7-3
def func():
    global x 
    x = 200
    print(x)

x = 100
func()
print(x)

# #E7-4
# def mail(  kil ):
   
#     mail = kil *0.621371
#     return mail
    
# kil = int(input("킬로미터를 입력하세요: ")) 
# m = mail(  kil )
# print( "%d킬로미터는 %.2f마일이다"% (kil,m))

#E7-5

def plus( c1 , c2 ):
    return c1 + c2
def sub( c1 , c2 ):    
    return c1 - c2
def multi( c1 , c2 ):
    return c1 * c2
def divide(c1 , c2 ):
    return c1 / c2

# print("-선택옵션")
# print("1.더하기")
# print("2.빼기")
# print("3.곱하기")
# print("4.나누기")
# c0 = int(input("원하는 연산을 선택하세요(1/2/3/4/):")) # 2
# c1 = int(input("첫번째 숫자를 입력하세요:")) #10
# c2 = int(input("두번째 숫자를 입력하세요:")) # 7

# if c0 == 1 :
#     r = plus(c1 , c2)
# elif c0 == 2 :
#     r = sub(c1 , c2)    
# elif c0 == 3 :
#     r = multi (c1 , c2)
# elif c0 == 4 :
#     r = divide (c1 , c2)  
# print(f"답은 {r} 입니다")


#E7-6
# def count_alpabet(eng , alpa):
#     count = 0
#     for i in eng :      # i에 "i am a  student를 넣어준다.""
#         if i == alpa :
#             count += 1  #a를 찾을때마다 1씩 늘어난다.
#     return count         #반복문이 끝나면 갯수를 세는 카운트함수를 끝내라
    
# eng  = input("영어문장을 입력하세요:")
# alpa = input("알파벳 하나를 입력하세요:")
# count = count_alpabet(eng,alpa)
# print(f"{eng}에 포함된 {alpa}의 개수는 {count}이다")


#E7-7
def tup1Sum(t1):
    sm = 0
    for i in t1:    
        sm = sm + i
    return sm 

tup1 = (10,20,30,40,50)
ss = tup1Sum(tup1)
print("튜플의 합계: %d"%(ss))

#E7-8 THANK YOU를 역순으로 출력하기
# def reversF(st) :
#     for i in st[::-1] : # 변수를 이용하여 역순으로 찍어야한다.
#         print(i,end=" ")

# st = input("문자열을 입력하세요:")
# reversF(st)

#E7-9 치환하는 프로그램을 작성하시오.

#방법1
# def changeH(ch1) :
#     global ch 
#     ch = ch1.replace(" " , "-")
    
# ch = input("문자열을 입력하세요:") #I am a student 
# changeH(ch)
# print(ch)

# #방법2
# def changeH(ch) :
#     ch = ch.replace(" " , "-")
#     return ch
    
# ch = input("문자열을 입력하세요:") #I am a student 
# ch = changeH(ch)
# print(ch)


#p291 
#심화문제 7-1
# n = int(input("n값을 입력해 주세요:")) # 50
# def decimal(n1) :
#     de = []
#     for i in range(2,n1,1):         # 2 3 4 5
#         x = True
#         for j in range(2,i,1):     # 1 , 2,  2 3  , 2 3 4 5
#             if i % j == 0 :        # 2 % 2 == 0 
#                 x = False
#                 break
#         if x : 
#             print(i)
# decimal(n) 


#심화문제 7-2
# eng_dict = {"house":"집", "piano":"피아노", "christmas":"크리스마스","friend":"친구","bread":"빵"}
# def engQuiz( eng_dict):
#     for i in eng_dict : # i변수에 키값들이 담긴다.
#         answer = input(f"{eng_dict[i]}에 맞는 영어단어는?") #dict에 key값을 넣어주면 value가 나온다.
#         if answer == i : 
#             print("참잘했어요!^_^")
#         else :
#             print("틀렸어요!ㅜㅡㅜ")

# engQuiz(eng_dict)


#심화문제 7-3
n = int(input("n 값을 입력하세요:"))

def nMul(n) :
    result = []
    for i in range(1,n+1): # 1~10
        result.append(i*i)
    return result

resultList = nMul(n)
print(resultList)