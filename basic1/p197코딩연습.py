#c5-1
#실행결과 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
data = list(range(1,21))
for i in range(0,len(data),1) : 
    print("%d"%data[i],end=" ")
print()

#c5-2
#실행결과 2 4 6 8 10 12 14 16 18 20  
for i in range(2,21,2) :
    print("%d"% i , end=" ")
print()   

#c5-3 
#실행결과 1 3 5 7 9 11 13 15 17 19
i = 0
while i <len(data) : 
    print("%d"%data[i], end=" ")
    i += 2 
     
#c4-4
#실행결과 10,11,12,13,14,15,16,17,18,19,20
data = []
for x in range(9,21):
    print(x)