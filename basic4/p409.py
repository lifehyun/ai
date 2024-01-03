#속성 :자바에서 필드,변수
# class A{
#     int k = 10;            //자바:인스턴스 필드  , 파이썬: 인스턴스 속성 
#     static int sk = 10;    //자바:정적필드       , 파이썬: 클래스속성
# }

class Student :
    pet = []        #클래스 속성 , 값을 계속 유지함
    def push_pet(self,x) :
        self.pet.append(x)
    
john = Student()    #객체화
john.push_pet("고양이")
print(john.pet)
sally = Student()
sally.push_pet("강아지")
print(sally.pet)


class Student :
    
    def __init__(self) :     
        self.pet = []        #인스턴스 속성 , 값이 객체화 할때마다 지워진다.
    def push_pet(self,x) :
        self.pet.append(x)
    
john = Student()    #객체화
john.push_pet("고양이")
print(john.pet)
sally = Student()    #객체화
sally.push_pet("강아지")
print(sally.pet)
