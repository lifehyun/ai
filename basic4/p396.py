# 클래스: 설계도(필드:변수 , 함수:동작)
# 객체 Object: 클래스를 메모리에 올려서 실제 자료 넣어주는 것
# 메소드: 클래스안에 있는 함수 , 동작하기
# 필드 : 파이썬에서 속성



# 클래스 만들기(정의)
class Person :
    name = "홍길동"
    list1 = []              #빈리스트:비어있는 리스트
    def method1(self) :     #self 자기자신 Person 클래스를 가르킨다
        print("메소드임")    

    def method2(self,age) :  
        print("나이는",age)


# 클래스 사용하기
# 호출시 클래스명이아니라 ,참조변수로 호출해야한다
p1 = Person()               #자바식 객체화생성: Person p1 = new Person
print(p1.name)
print(Person.name)
p1.list1.append("aa")       #Peson클래스에 "aa"추가
print(p1.list1)
print(Person.list1)
p1.method1()
p1.method2(25)

#클래스명으로 호출해서 오류남.
#Person.method1() 
#Person.method2()