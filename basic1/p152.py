# #화씨 온도  = 섭시온도 x 9/5 + 32
# print("-"*30)
# print(" 섭씨 화씨")
# print("-"*30)
# for c in range(-20,31,5):
#     f = c*9.0/5.0+32.0
#     print("%5d %6.1f"%(c,f))
# print("-"*30)

# #154 C4-1
# #200 ~ 800정수중 5의배수가 아닌수를 한줄에 10개씩 출력하는 프로그램
# count = 0
# for i  in range(200,800) :
#     if i % != 5 : 
#         print("%d"%i,end="") 
#         count = count + 1 
#     if count / 10 :
#         print(i)

# #c4-2
# print("-"*40)
# print(" cm  mm  m   inch")
# print("-"*40)


# for i in range(1,100):
#     mm = cm *10.0
#     m = cm * 0.01
#     inch = cm * 0.3937
#     print()

#c4-5 
# number = input("숫자를 입력하세요:") #"477569040"
# total = 0

# for a in number     :
#     a = int(a) 
#     if a % 2 != 0   :
#         total += 1
# print("홀수의 개수: %d개 "%total)


# #c4-6
# print("-"*50)
# print("%7s %7s %7s"%("킬로그램","파운드","온스"))
# print("-"*50)

# for i in range () :
# pound = kg * 2.204623
# ounce = kg * 35.273962
# print()

# print("-"*50)


#c4-7
for i in range(1,6)     : #밖에 있는 행
    for j in range(1,11) : #안에 있는 열
        print("*",end=" ")
    print()


for i in range(9,0,-1) :    #9가 9번 , 8이 8개 ,
    for j in range(1,i+1,1):   #i가 9일때 9번 반복 i 8일때 8번반복
        print("i",end=" ")   
    print() 