#p218
#c5-5
#for문을 이용하여 영어 스펠링 퀴즈를 만드는 프로그램이다.
# qustions = ["s_hool","compu_er","deco_ation","windo_","hi_tory"]
# answer = ["c","t","r","w","s"]

# for i in range (0,len(qustions),1):
#     q = "%s:밑 줄에 들어갈 알파벳은?"% qustions[i] 
#     guess = input(q) 
#     if  guess == answer[i] :
#         print("정답")
#     else :
#         print("틀렸어요") 

#p219
#5-6 
#성적을 입력받아 리스트에 저장한 다음 성적의 합계와 평균을 구하는 프로그램입니다.

sum = 0
scores = []
while True :
    x = int(input("성적을 입력하세요(종료시 -1 입력):"))
    if x == -1 :
        break 
    else :
        scores.append(x)
for i in scores : 
    sum += i
sm = sum 
avg = sm/len(scores)
print("합계:%d, 평균: %.2f"%(sum,avg))