import csv

rf = open("./basic4/a.csv","r") #읽는코드
wf = open("./basic4/a_copy.csv","w",newline="") #써주는코드

r = csv.reader(rf)
w = csv.writer(wf)

for i in range(3) :
    line = next(r)
    w.writerow(line)

rf.close()
wf.close()


