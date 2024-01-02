# w : 해당하는 폴더에 파일이 존재하지 않으면 새로운 파일이 생성되고
#     해당하는 폴더에 파일이 존재하면 기존파일에 덮어쓴다. 
# r : 해당하는 파일을 읽어준다
# a : 해당하는 파일이 있으면 뒤에 덧붙혀주세요

'''
f = open("new_file1.txt","a",encoding="utf-8") 

names = ["이순신","김희수"]

for name in names :
    f.write(name + "\n")

print("파일 쓰기 완료")
f.close()
'''
f = open("new_file1.txt","r",encoding="utf-8") 

#lines = f.readlines() 여러줄을 한꺼번에 읽어온다 리스트로 반환한다
#line  = f.readline()  한줄만을 익는다 . 그래서 반복문을 이용을 해야한다.
#print(lines)

lines = f.readlines()
line = f.readline
print("파일 쓰기 완료")
print(lines)
print(line)
f.close()
