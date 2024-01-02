f = open("./연습장/240102_text","r",encoding="utf-8")
lines = f.readlines()
print(lines)

for line in lines :
    data = line.split()
    print(line)


    