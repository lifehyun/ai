#생성자

#자바식코드
# class P{
#     void p(String name , int age){ 
#     생성자 용도: 객체를 생성하면서 초기화할때 사용한다
#     }
# }

#파이썬코드 : init
#생성자 __init__
class Members : 
    def __init__(self,name,age,gender) :      
        self.name = name
        self.age = age
        self.gender = gender
    def __init__(self,name=None,age=None,gender=None) :      
        self.name = None
        self.age = None
        self.gender = None
    def show_info(self) :
        print("이름 :" , self.name)
        print("나이 :" , self.age)
        print("성별 :" , self.gender )

#객체생성
m1 = Members("홍길동",25)
m1.show_info()
m2 = Members("홍길동",25,True)
m2.show_info()

