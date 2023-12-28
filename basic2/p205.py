#특정문자열 찾기, 문자열치환 , 문자열쪼개기
String1 = "python is fun !"
print(String1) 
#.find 찾아주는 함수  
a = String1.find("n") #출력값은 n은 인덱스 5행에 있어서
print(a)
#만약에 없는 글자를 찾을시 -1로 출력된다.
a = String1.find("k") 
print(a)

studentName = "홍길동 이순신 이경미 최수진"
#최수진 있어요?
#우리반이 아닙니다.
if studentName.find ("최수진") == -1 :
    print("우리반 아니에요") 
else :
    print("우리반이에요")

#치환하기 ★.replace★
#최수진에서 정수진으로 고친다. 
#studentName에서는 그냥 출력이 되지않기때문에 새로운 이름으로 다시 담아줘야한다.
newname = studentName.replace("최수진","정수진")
print(newname)
#이수진을 찾아서 박수진으로 고친다.
#오류는 나진 않지만 치환이 되지않는다.
newname = studentName.replace("이수진","박수진")
print(newname)
#결과 홍길동 이순신 최경구
data = "홍길동/이순신/최경주"
data = data.replace("/"," ")
print(data)
data = data.replace(" ","-")
print(data)

#데이터 쪼개기 ★.split ★ 
hello = "have a nice day ; Happy new Year; Merry christmas"
#list[LiteralString]로 담아줘야한다.
list1 = hello.split(";",) 
list2 = hello.split(";",1) 
print(list1) 
print(list2)

names = ["황애린","홍지수","안지영"]
print(names)
x = "/".join(names)
print(x)

phoneNumber = ["010","1234","5678"]
xx = " - ".join(phoneNumber)
print(xx)
print(type(xx))

