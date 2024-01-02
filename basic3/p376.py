#csv 파일 처리
#['지점명', '일시', '기온(°C)']-> 첫번째줄에 있는걸 :hedder라고한다.
import csv 
'''
file_name = "./basic3/weater.csv"
f = open(file_name,"r")
lines = csv.reader(f)
for line in lines :
    print(line)
f.close()

file_name = "./basic3/weater.csv"
f = open(file_name,"r")
lines = csv.reader(f)
print(next(lines))  #첫번째줄이출력된다
print(next(lines))  #두번째줄이출력된다
print(next(lines))  #세번째줄이출력된다
f.close()
'''
#12월 27일 0시 기온 구하기
#답은 0.5
# file_name = "./basic3/weater.csv"
# f = open(file_name,"r")
# lines = csv.reader(f)
# result = 0
# next(lines) #열이름(즉 제목명)을 구해서 제거하기
# for line in lines :
#     if line[1] == "2023-12-27 18:00" :
#         result = line[2] 
#         print(result)
# f.close()

#온도만 구하는 프로그램을 작성하기
read_file_name = "./basic3/weater.csv"
writh_file_name = "./basic3/weater.온도.csv"
rf = open(read_file_name,"r")
wf = open(writh_file_name,"w")

lines = csv.reader(rf)
wr = csv.writer(wf)
next(lines)
for line in lines :
    if line[1] != "2023-12-27" :
        result = line[2]
        wr.writerow(result)
rf.close()
wf.close()

