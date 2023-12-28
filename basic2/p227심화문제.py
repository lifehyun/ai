#S5-1 for문을 이용해서 분리하는 프로그램을 작성하시오.
file_names = ["flie1.py","flie2.txt","file3.pptx","file4.doc"]
# print(file_names[0])
a = file_names[0].split(".")
b = file_names[1].split(".")
c = file_names[2].split(".")
d = file_names[3].split(".")

print(f"{file_names[0]}=> 파일명:{a[0]},확장자:.{a[1]}")
print(f"{file_names[1]}=> 파일명:{b[0]},확장자:.{b[1]}")
print(f"{file_names[2]}=> 파일명:{c[0]},확장자:.{c[1]}")
print(f"{file_names[3]}=> 파일명:{d[0]},확장자:.{d[1]}")

for i in range(0,len,1) :
    print(file_names[i]+1)

# print(file_names[0].split("."))
# a = file_names[1].split(".")
# print(a)

# file_names[0].split(".")[0] 랑 a[0] 똑같음
    
    