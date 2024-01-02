f1 = open("./basic3/scores.txt" , "r" , encoding="utf-8")
lines = f1.readlines()      #readlines:리스트로되서 반환한다
print(lines)

for line in lines :
    data = line.split(" ")     #공백 \n된것 나뉜다
    print(data)
    i = 0
    sum = 0
    while i < len(data):    #i가 6보다 작을때까지 반복을해라
        if i == 0:
            print(data[i] , end= " : ")
        else :
           sum += int(data[i])
        i = i + 1
    avg = sum / (len(data) - 1)
    print("%.2f점" % avg)
f1.close()