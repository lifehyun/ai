#병합,합계,순서거꾸로,정렬,복사
person1 = ["kim",24, "kim@naver.com"]
person2 = ["lee",35, "lee@naver.com"]
person3 = ["kim",24, "lee@naver.com"]

person = person1+person2+person3
print(person)

#합계를 구하는 방법
scores = list(range(80,101,4))
print(scores)
# iterable 이라는 함수는 반복해서 사용해준다.
sm = sum(scores)
print(sm)

#리스트안에 숫자 && 또는 문자가 섞여있다면 숫자와 문자는 같이 계산하지 못하여 오류가 난다.
data = [1,2,8,9]
sm = sum(data)
print(sm) 

jumsu = list(range(90,101,1))
avg = sum(jumsu) / len(jumsu)
print(avg)

#.reverse()값이 없어서 변수를정의해도 출력이 되지않는다 NOne.
data = ["사과","배","귤","딸기"]
#데이터라는 값을 .reverse를 해준다.
data.reverse() 
print(data) 
data.reverse()
print(data)

#복사하기
fruits = ["apple", "banana","rich"]
print(fruits)
# 리스트의 내용이 동일하게 다시 메모리에 만들어지면서 x변수에 들어가는것.
x = fruits.copy()
print(x)

xx = fruits
print(xx)
print(type(xx))

# pineapple 1번 인덱스에 삽입해라.
fruits.insert(1,"pineapple")
print(fruits)
print(x)
print(xx)

#정렬하기
data = [12,8,6,4,2,-3,-28,66,77,109,55]
data1 = ['a','b','c','d','한글','가나']
#오름차순 정렬
data.sort()
print(data)
#내림차순 정렬
data.sort(reverse=True)

print(data)
#유니코드 번호 순서대로 정렬
data.sort()
print(data1)
