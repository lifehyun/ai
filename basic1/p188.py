#요소변환 수정(삽입,삭제,업데이트)하기
flowers= ["목련","벚꽃","장미","백일홍"] #0,1,2,3
print(flowers)
#1을 무궁화로 수정해달라
flowers[1] = "무궁화" 
print(flowers)
#백일홍을 수정하기 개나리
flowers[-1] = "개나리"
print(flowers)
#뒤로 추가하여 붙이기 
#append는 단독으로 사용하지못하여 객체와 메소드와 같이 사용한다, 만약 혼자사용하면 함수이다
flowers.append("백일홍")
print(flowers)
flowers.append("튜울립")
print(flowers)
#메소드 vs 함수 동작시키기
#메소드는 객체안에서 동작을 시키는것
#함수 동작을 시키는것

#실무에서 리스트는 어떻게 사용이 될까?
 # 1. 빈 리스트
scores = []
scores.append(100)
scores.append(90)
scores.append(85)
scores.append(100)
scores.append(98)
print(scores)

#특정 위치에 삽입하기
fruits = [] 
while True : 
    a = input("좋아하는 과일은?") #값은 체리를 넣은것이다
    if a == "끝" :               #fruit의 값이 끝이라고 나오면 빠지세요 / 반복을 그만하고 싶을시에 끝이라고 치면된다.
        break
    fruits.append(a)
print(fruits)
fruits.insert(1,"자몽")
print(fruits) 
idxx = fruits.index("체리")
print(idxx)

#특정요소 위치찾기 
#.index()가 인덱스 자리를 찾아주는 함수
number = [5,20,13,7,8,22,7,17,8]
print(number)
idx = number.index(13)
print(idx)

number = [5,20,13,7,8,22,7,17,8,9,8,1]
print(number.index(8,9,11)) #values 값의 첫번째 값을 리턴한다 

flowers= ["목련","벚꽃","장미","백일홍","벚꽃","튤립","해바라기"] #0,1,2,3,4,5,6
#뒤로 나오는 "벚꽃"이 몇번째 인덱스에 있나요?
print(flowers.index("벚꽃",4)) #앞에있는 1번째는 건너뛰고 찾아준다.
#삭제하기 remove
flowers.remove("벚꽃")
print(flowers)
flowers.remove("백일홍")
print(flowers)
# pop이란 함수는 : 위로 올라간다 , 따로 빼내준다.
x = flowers.pop(2)
print(x)
x = flowers.pop(2)
print(x)
print(flowers)
# clear란 함수는 : 아무것도 없이 다지워준다.
flowers.clear()
print(flowers)

