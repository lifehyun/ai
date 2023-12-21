number = ["가","나","다","라","마"] #i 0 i 1 i 2 i 3 i 4  
for i in range(0,5):
    print(i) 

print()
print(number[0])
print(number[1])
print(number[2])
print(number[3])
print(number[4])



# clothes = ["유니클로", "자라", "구찌", "프라다", "에잇세컨즈", "탑텐"]
# for i in range(0,6) :
#     print(clothes[i])

#for문을 사용해서 유니클로 , 구찌 ,에잇세컨즈 출력하기
clothes = ["유니클로", "자라", "구찌", "프라다", "에잇세컨즈", "탑텐"]
for i in range(0,len(clothes),2) :
    print(clothes[i])
 
# for i in range(0,6,2):
#     print(i)

print(len(clothes))