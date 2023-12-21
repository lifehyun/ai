#문제1)내용을 모두 출력하기
jumsu = [[10,20],[30,40,50],[60]]
#생각 10을 출력하려면 [0][0], 20을 출력하려면 [0][1]
#[0][0]  [0][1] [1][0] [1][1] [1][2] [2][0]
for i in range(0 , len(jumsu)) :
    for j in range(0,len(jumsu[1])) : 
        print(jumsu[1][j], end=" ")
    print()
#문제2) 문제1의 합 구하기
sm = 0
for i in range(len(jumsu)) :
    for j in range(len(jumsu[i])) :
        sm = sm + jumsu[i][j]
print(sm)

#a문제3) sum() 함수를 이용해서 구하기
# a = [1,2,3]
# print(sum(a))
jumsu = [[10,20],[30,40,50],[60] ]
print(sum(jumsu[0]))
print(sum(jumsu[1]))
# print(sum(jumsu)) #에러 발생

sm = sum(jumsu[0]) + sum(jumsu[1]) + sum(jumsu[2])
print(sm)

#for문을 이용하여 전체 합을 구하기
sm = 0
for i in range(0, len(jumsu)) :
    sm += sum(jumsu[i])
print(sm)

#p217
strings = ["원두커피","라떼","콜라"],["우동","국수","피자","파스타"] #2요소 ,0행 0,1,2열 /1행 0,1,2,3 열

print(strings[1][1])
#피자,파스타를 삭제하세요 .remove
strings[1].remove("피자"); strings[1].remove("파스타")
#"원두커피"를 치환하기 .replace
strings[0][0] = "아메리카노"
#생각으로는 "원두커피"의 인덱스를 찾아서 해당 인덱스를 수정한다
#"원두커피"의 인덱스를 찾아서
strings = ["원두커피","라떼","콜라"],["우동","국수","피자","파스타"]
findColumIndex = strings[0].index("원두커피")
strings[0][findColumIndex] = "아메리카노"
print(strings[0])
print(strings[1])

#join()리스트 --> "문자열"
#"문자열"replace하기
strings = ["원두커피","라떼","콜라"],["우동","국수","피자","파스타"]
s1 = "/".join(strings[0])
print(s1)

