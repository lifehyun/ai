#파일 삭제하기
import os 


if os.path.exists("./basic3/new_file.txt") : #만약에 os.path에 new_faile.txt 파일이 존재하면 
    os.remove("./basic3/new_file.txt")        #os.에서 삭제해주세요
else :
    print("삭제하려는 파일이 없어요")

#폴더 삭제하기
#폴더 만들기
if os.path.exists("./basic3/mm") :     #만약에 os.path에 ./basic3/mm폴더가 있으면 이미폴더가있어요. , 아니면 만들어주세요
    print("이미 폴더가 있어요")         
else:                                  
    os.mkdir("./basic3/mm")
if os.path.exists("./basic3/mm") :
    os.rename("./basic3/mm", "./basic3/new_mm") 

if os.path.exists("./basic3/new_mm") :
    os.rmdir("./basic3/new_mm")
    