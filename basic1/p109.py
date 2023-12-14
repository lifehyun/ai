# ans1 = input("'사자'의 영어단어는 무엇일까요?:")
# result = "땡!틀렸습니다"
# if ans1 == "lion" :
#     result = "딩동댕 참 잘했어요"
# print(result)

# ans2 = input("'오렌지'의 영어단어는 무엇일까요?:")
# result = "땡!틀렸습니다"
# if ans2 == "orange" :
#     result = "딩동댕 참 잘했어요~~~"
# print(result)

# 사자면 lion이 맞는거
# 오렌지이면 orange 맞는것    
print("영어단어 공부하기 ver 2.0")
 w3 = "w"
 o = 0
 x = x
 while w3 == "w" : 

     k1 = input("질문단어는(한국어)?")
     e1 = input("답변단어는(영어)?")
    if k1 == "사자" and "lion":
         result = "딩동뎅! 맞았습니다"
         o = 0 + 1
         print(result)
    elif e1 == "오렌지" and "orenge" :
         result = "딩동뎅! 맞았습니다"
         0 += 1
    elif e1 == "기차" and "train" :
         result = "딩동뎅! 맞았습니다"
         0 += 1
         print(result)    
    else :
        result = "땡 틀렸습니다"
        x += 1
         print(result)
        w3 = input("계속 공부 할래요?(y/n)")
print("<< 오늘 공부한 것 분석>>")
print(f"전체 {o + x}문제 풀었다")
print(f"{o}문제 맞추었고")
print(f"{x}문제 틀렸다")
