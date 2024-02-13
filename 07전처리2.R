##########################################
#1. 결측값(NA)
##########################################

z <- c(1,2,3,NA,5,NA,8)
sum(z)
is.na(z)
#결측값을 빼고 계산하는것(na.rm=)
sum(z,na.rm = T) 
m <- mean(z,na.rm = T)
sd(z,na.rm = T)

z[is.na(z)] <- 0 #결측값인 : NA자리에 0이 대신 들어간다
z

##########################################
#결측값에 평균으로 대체하기
##########################################

z[is.na(z)] <- m
z

#대체한 z을 새로운 백터로 저장하기
z.new <- as.vector(z)
z.new

DF <- data.frame ( x = c ( 1 ,  2 ,  3 ) , y = c ( 0 ,  10 ,  NA ) ) 
DF
na.omit ( DF ) # 결측값이 있는것을 제외하고 정상값만 출력된다.

z <- c(1,2,3,NA,5,NA,8)
na.z <- na.omit(z)
na.z

na.zv <- as.vector(na.z)
na.zv

##########################################
#2차원 결측값 처리방법
##########################################

x <- iris[1:50 ,]
x
x[1,2] <- NA; x[1,3] <- NA; x[2,3] <- NA; x[3,4] <- NA;
head(x)

#찾기 : 반복문 시행
#열에 있는 결측값의 갯수 세기
ncol(x) #컬럼의 수
for (i in 1:ncol(x)) {
  this.na <- is.na(x[ , i]) #행은 전부다 , (세로)열로 찾는다  ,  결측치이면 TRUE , 아니면 FALSE
  cat('i','열',sum(this.na),'\n') #cat:print와 동일한 함수이다.
}


#출력결과1
# 1열 0
# 2열 1
# 3열 2
# 4열 3
# 5열 4

nrow(x)
for (j in 1:5) {
  this.na <- is.na(x[j, ])
  cat('j','행',sum(this.na),'\n')
}
#출력결과2
# 1행 2
# 2행 1
# 3행 1
# 4행 0
# 5행 0

##########################################
#특이값(이상값) :boxplot.stats, $out  으로 찾는다
##########################################

st <- data.frame(state.x77)
boxplot(st$Income,col="pink")
boxplot.stats(st$Income) $out #그림이 아닌 상황을 보여준다 $out:이상치

#문Income의 이상값은 얼마인지?
income.out <- boxplot.stats(st$Income) $out
income.out

#문 PoPULATION 이상값은 얼마인지?
Pop.out <- boxplot.stats(st$Population) $out
Pop.out

##########################################
#이상값을 제거하기 
# 1.이상값을 결측값으로 변경 후 2. 결측값을 제거한다.
#결측을 제거하는 함수를 따로 만들어놓는다 
##########################################

#변경하기

#income의 이상값 찾아서 변경하기
income.out <- boxplot.stats(st$Income)$out
income.out #한개의 값이 출력 
st$Income[st$Income == income.out] <- NA # NA값으로 변경 income.out이 st$income이랑 같으면 참: ==
st$Income 

#Population의 이상값 찾아서 변경하기
Pop.out <- boxplot.stats(st$Population) $out
Pop.out #여러개의 값이 출력
st$Population[st$Population %in% Pop.out] <- NA  #pop.out안에 변수값이 있으면 참 : %in%
st$Population 

#Area의 이상값 찾아서 변경하기
area.out <- boxplot.stats(st$Area) $out
area.out

st$Area[st$Area %in% area.out] <- NA
st$Area

#제거하기 
#방법1.complete.cases()
dim(st)
st.new <- st[complete.cases(st),] #NA가 있는 행을 제거하기complete.cases
dim(st.new)

# st.new1 <- st[, complete.cases(st)] #열제거는 되지 않는다

#방법2.na.omit()
st.new2 <- na.omit(st)
st.new2
head(st.new2)
dim(st.new2)

##########################################
#정렬하기
##########################################

head(iris)
sort(iris$Sepal.Length)
sort(iris$Sepal.Length, decreasing = T) 

order(iris$Sepal.Length ) 

head(iris, n=15)

iris[order(iris$Sepal.Length),] #내림차순 정렬
iris[order(iris$Sepal.Length, decreasing=T),] 

##########################################
#분리 : 그룹별로 분석하기
##########################################

str(iris)
sp <- split(iris,iris$Species) #split(데이터셋, 분류하려는 열의이름)
sp
summary( sp )

##########################################
#샘플링 : sample(데이터셋 , size=갯수 , replace=F)  replace=T:샘플로 꺼낼껄 다시 넣고 싶을때는 T
##########################################

x <- 1:100 
set.seed(100) #임의의 추출할때 씨앗
sample(x, size=10, replace = F)
idx <- sample(1:nrow(iris), size=20, replace = F)
idx
iris.10<- iris[idx2 ,]
iris.10

##########################################
#조합 :combination(데이터셋,뽑는갯수)경우의수를 말한다
##########################################

combn(1:5,3) #3개씩 짝지은것
combn(1:4,2) #2개씩 짝지은것

##########################################
#집계함수 : aggreagate(데이터셋,by=그룹명 , FUN=함수명)
##########################################

aggregate(iris[, 1:4],by=list(iris$Species) , FUN = mean )
aggregate(iris[, 1:4],by=list(품종의평균=iris$Species) , FUN = mean )
aggregate(iris[, 1:4],by=list(품종의합=iris$Species) , FUN = sum )
aggregate(iris[, 1:4],by=list(품종의표준편차=iris$Species) , FUN = sd )
aggregate(iris[, 1:4],by=list(품종의최대값=iris$Species) , FUN = max )
aggregate(iris[, 1:4],by=list(품종의최소값=iris$Species) , FUN = min )

aggregate(mtcars,by = list(cyl=mtcars$cyl),FUN = mean)
aggregate(mtcars,by = list(cyl=mtcars$cyl,vs=mtcars$vs),FUN = mean)

##########################################
#병합 : merge(데이터셋1, 테이터셋2 , all=T (외부조인) 또는  all.x=T (왼쪽외부조인) 또는  all.y=T (오른쪽 외부조인))
##########################################

x <- data.frame(name=c('a','b','c'),math=c(90,80,40))
x
y <- data.frame(name=c('a','b','d'),korean=c(75,60,90))
y

z <- merge(x , y , by=c('name')) #2개(a.b)의 공통열만 병합(머지)가 됨 (inner join 내부조인)
z

z1 <- merge(x,y, by=c('name'),all = T) #두개의 모든 데이터값이 조인된다 .데이터값이 없으면 NA 값이 된다.
z1

z2 <- merge(x,y,by=c('name'),all.x = T) #왼쪽에 있는 "x"의 데이터셋은 모두 조인되고 오른쪽은 안됨(left outter join)
z2

z3 <- merge(x,y,by=c('name'),all.y = T) #오른쪽에 있는 "y"의 데이터셋은 모두 조인되고 왼쪽은 안됨(right outter join)
z3
