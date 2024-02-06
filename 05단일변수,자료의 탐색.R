favorite <- c('WINTER', 'SUMMER', 'SPRING', 'SUMMER', 'SUMMER','FALL','FALL','SUMMER','SPRING','SPRING')
favorite
table(favorite) # 도수분포표
table(favorite) / length(favorite) #비율

ds <- table(favorite)
ds
barplot(ds, main='좋아하는 계절') #막대 그래프를 만들어준다 main= 제목으로 넣을말
pie(ds,main='여름이 좋다')#파이 그래프가 만들어진다.

#좋아하는 색상으로 그래프를 생성한다
fav.color <- c(5,8,6,1,2,3,7,5,6,2,6,5,4)
ds2<- table(fav.color)
colors <- c('skyblue','pink','gold')
barplot(ds2, main='좋아하는 색상', col = colors)
pie(ds2)

# 단일변수 연속형 자료
weight <- c(60,62,64,65,68,69)
weight.heavy<- c(weight,120)
weight
weight.heavy

#산술평가
mean(weight)
mean(weight.heavy)

#중위수 중앙값
median(weight)
median(weight.heavy)


#절삭평균
mean(weight , trim=0.2)
mean(weight.heavy ,trim = 0.2)


mydata = c(60,62,64,65,68,69,120)
quantile(mydata, (0:10)/10)
summary(mydata)

var(mydata) # 분(얼마나 데이터들이 흩어져있나 수치화)
sd(mydata) # 표준편차(얼마나 데이터들이 흩어져있나 수치화)
range(mydata) # 범위 : 최소~최대
diff(range(mydata)) # 범위 : 최소~최대 뺀값
hist(mydata, main="점수", col="green", border="blue", las=1, breaks=5) #그래프 그려줌
hist(mydata, main="점수",xlab = '점수',ylab = '갯수',border = 'red',col = 'pink',las=3, breaks = 2)

head(cars)
dim(cars)
str(cars)
hist(cars[,2])
hist(cars[,1])
barplot(cars[,1])

#연속형 barplot(speed) 결과는 나와도 의미가 없다
boxplot(mydata)
boxplot(m)
boxplot(dist)
boxplot(speed)
boxplot.stats(dist)
#conf 중앙값에 대한 신뢰구간
#out 이상치 , 특이값
head(iris)
unique(iris$Species)
#붓꽃의 종류별(Species)로  값(Petal.Length-꽃잎길이)로 boxplot 그리기
#boxplot(그리려는 열의값~그룹화하려는 열이름 , data = 데이터셋명)
boxplot(Petal.Length~Species , data = iris)
boxplot(Petal.Length~Species , data = iris,
        main='제목: 붓꽃의 품종별 꽃잎길이', 
        xlab='x축제목: 붓꽃 품종',
        ylab='y축제목: 붓꽃 길이(cm)', border='skyblue')

#한화면에 다나오게 출력하는 방법
par(mfrow = c(2,2))
hist(mydata, main="점수",xlab = '점수',ylab = '갯수',border = 'red',col = 'pink',las=3, breaks = 2)
boxplot(speed)
boxplot(Petal.Length~Species, data=iris)
