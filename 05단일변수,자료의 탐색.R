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


