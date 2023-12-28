def inch_to_cm(inch) :
    cm = inch * 2.54
    return cm
num = 30
result = inch_to_cm(num)
print("%d inch => %.2f cm"%(num,result))


#P275 C7-5
def tri_area(w,h):
    result = w * h * 0.5
    return result
width = 10
height = 15

print("삼각형의 너비 : ",width)
print("삼각형의 높이 : ",height)
print("삼각형의 면적 : ",tri_area(width , height ))


#276 c7-6
def sum_besu(n):    #n=3
    sum = 0
    for i in range(1,101):
        if i % n == 0 :   #i를 n으로 나눈다 3의배수만큼
            sum = sum + i
    return sum
       
besu = 3
total = sum_besu(besu)  #1683
print("1~100사이의 %d의 배수의합계:%d"% (besu,total))


# #p277 c7-7
def count_space(a) : # 받아올 변수
    count = 0
    for x in a :
        if x == " " :
            count = count + 1
    return count
     
setence = "python is easy and powerful"
print(setence)
num_space = count_space(setence)
print("-공백의개수:",num_space)    


#c7-8
def get_item(userid) : 
    game_items = {"kim":"총","lee":"대포","choi":"전투기","hwang":"병사"}
    for key in game_items : #키값만 출력된다.
        if key == userid :       
            item = game_items[key]
    return item

user1 = "kim"
user2 = "lee"
user3 = "choi"
user4 = "hwang"
print("%s의 게임 아이템: %s"%(user1,get_item(user1)))
print("%s의 게임 아이템: %s"%(user2,get_item(user2)))
print("%s의 게임 아이템: %s"%(user3,get_item(user3)))
print("%s의 게임 아이템: %s"%(user4,get_item(user4)))


