#딕셔너리의 모습 : { key - value }   
score = {"kor":90, "eng":89, "math":95 }
print(score)
#value를 출력하려면 key를 입력하면된다.
print(score["kor"])

user = {"id":"kim55","name":"김성준","level":"7","point":10000}
print(user["id"])
print(user["level"])

#추가하기 [key] = value
score["music"] = 100
print(score)
user["vip"] = "우수회원"
print(user)

#수정하기
score["music"] = 80
print(score)
user["vip"] = "최우스회원"
print(user)

#삭제하기
x = score.pop("music")
print(x)
print(score)
user.pop("vip")
print(user)
print()

#전체출력하기
for uKey in user :
    print(f"{uKey} - {user[uKey]} ~~")
print()

#반복문을 이용해서 딕셔너리 처리
area_code = {"02":"서울","052":"부산","053":"대구","031":"경기도","062":"광주"}

#key값이 자동으로 합개씩 k로 들어간다
for k in area_code:
    print(f"{k} ☏': {area_code[k]}") 

#키만 모아서 출력하라.
sk = ""
for k in area_code : 
    sk = sk + k + " "
print(f"지역번호:{sk}")
