# ★p182 리스트★
# 순서있게 [요소, 요소 , 요소] 
# 수정 할수있다. : 삽입,수정,삭제
# 일기전용 : 파일열기만 가능
# 쓰기전용 : 저장,수정,삭제,읽기
list0 = [1,1.1,"문자",[1,9],7,8]
#문자라는것을 출력하라.
print(list0[2])
#3까지만 출력하라.
print(list0[:3])
# 2:에서 끝까지 출력해라
print(list0[2:])

list1 = [3,15,-12.5,"사과","딸기"]
print(list1)
#type()자료형이 어떤건지 보기
print(type(list1))      

# ★리스트를 만드는 방법★
# 방법1)변수 = [요소1,요소2]
# 방법2)list() 함수를 사용하기    
 
list2 = list(range(1,21,2))
print(list2)
print(type(list2))

list3 = list("abcdef") # ['a'b'c'd'e'f']
print(list3)
print(type(list3))

color = ["빨강","주황","노랑","초록","파랑","남색","보라"]
print(color[0])
print(color[5])
#index가 2~6번보다 작은것 2 <= index < 6
print(color[2:6])  
#뒤에서부터 세번째를 출력하라 
print(color[-3])    
print(color[-4:-1])
#전체다 출력하라 
print(color) ; print(color[::]) ; print(color[:])
#초록,파랑,남색,보라 나오게하라
print(color[3:])
#빨강,주황,노랑 나오게하라    
print(color[0:3])   
#뒤에서부터 가져오게 했다.
print(color[-7:-4]) 
# 주황 , 파랑 , 보라 추출하기
# 요소를 하나하나 빼서 써서 괄호가 다르다 ( ) <class 'tuple'>
list6 = (color[1],color[4],color[6]) 
print(list6) ; print(type(list6))

# 반복문과 리스트 
# for i in color : 
#     변수        리스트 color = ["빨강","주황","노랑","초록","파랑","남색","보라"]

for i in color :  
    # print(i , end= "") 
    print("나는 %s를 좋아합니다"%i)
#len이라는 인덱스를 세어주는 함수이다 
print(len(color))  
