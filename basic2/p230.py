#튜플 : 수정,삭제가 안된다. 용도는 변동이 불가한것
#p230
t = (1,2)
t1 = 1,2
print(t[0])     #t의 0열
print(t1[1])    #t1의 1열
print(type[t1])

#생략할수 있다. 1개의 요소(1,)
t2 = 1,
print(type(t2))

#빈공간으로도 할수있다. 
t3 = ()
print(type(t3))

animals = ("토끼","거북이","사자","여우")
print(animals[:])
#처음부터 3번인덱스까지 출력하라
print(animals[:3])
#여우만 출력되게 하라
print(animals[-1:])
#토끼를 돼지로 변경하라
#animals[0] = "돼지"안됨
#바꾸기 1단계 list() , 2단계 tuple()
ani_list = list(animals)
print(type(ani_list))
ani_list[0] = "돼지"
print(ani_list)
animals = tuple(ani_list)
print(type(animals))


#p232 
#튜플생성하기
#변수 = () , 변수 = tuple(())
n = tuple(range(10,21)) 
#10~20까지 출력되면서 tuple type으로 변경된다
print(n)
n2 = tuple([1,2,3])
print(n2)
#뒤에서 앞으로 출력하라
print(n[ : : -1]) 
print(len(n)) 

#p234 튜플병합하기
tup1 = (10,20,30,40)
tup2 = (40,50,60)
tup3 = tup1 + tup2
print(tup1)
print(tup2)
print(tup3)
#tup1이 두번 반복되게하라
print(tup1*2) 
#print(tup1*tup2)는 에러가 난다
#tup1의 합계는?
print(tup1[0]+tup1[1]+tup1[2]+tup1[3])
sm = sum(tup1)
print(f"tup1의 합계:{sm}")
#tup1에서 30을 삭제하세요
#tup1.remove(30) 오류남
#tup1에서 50을 삽입하세요.
#tup1.append(50) 오류남


#23/12/22일 실습
t1 = ('valentine',2,14,'gift')
print(t1[1:2])
t2 = ('love')
print(t2[0:])
# print(t1+t2)
print(t2*2)
print(len(t1))

#튜블
a_1 = ['홍길동', '이수지', '박상민']
a_1[1]='하누리'
print(a_1)

#리스트
a_2 = ('홍길동', '이수지', '박상민')
# a_2[1]='하누리' 
print(a_2)


