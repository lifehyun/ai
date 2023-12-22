#딕셔너리 생성
inventory = {"메로나":[300,20],
             "바밤바":[400,3],
             "죠스바":[250,100]}

#메로나 300 20 6000
#비비빅 400 3  1200
#죠스바 250 100 25000

for i in inventory :
    t = inventory[i][0] * inventory[i][1]
    print(f"{i} {inventory[i][0]}원 {inventory[i][0]}개 {t} 원 ")

#메로나 가격을 출력하세요.
print(inventory["메로나"][0],"원",sep="")
#죠스바의 재고는? 100개를 출력하세요
print(inventory["죠스바"][1],"개",sep="")
#월드콘을 추가하세요.
inventory ["월드콘"] = [1500,50]
print(inventory)
#죠스바를 350원으로 수정하세요.
inventory ["죠스바"] = [350,100]
print(inventory)

#아이스크림의 품목수는? 길이수는 출력하라
print(len(inventory),"종류")
#아이스크림의 종류는? key만 출력하라
for key in inventory :
    print(key,end=" ")
