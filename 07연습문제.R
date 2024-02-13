# 1번문제. 다음과 같이 결측값이 포함된 데이터셋 ds를 생성한 후, 다음 문제를 해결하기 위한 R 코드를 작성하시오. 
ds <- mtcars
ds
ds[2,3] <- NA; ds[3,1] <- NA; ds[2,4] <- NA; ds[4,3] <- NA
  
# (1) 각 열별로 결측값이 몇 개인지 출력하시오.
ncol(ds)
for (i in i:ncol(ds)) {
  this.na <- is.na(ds[, i])
  cat(i , '열',sum(this.na),'개\n')
}
# (2) 결측값이 포함된 행들의 데이터를 출력하시오.
nrow(ds)
#결측값이 있는 행의 인덱스를 구한다.
idx <- c()
for (j in j:nrow(ds)) {
  if ( sum(is.na(ds[j, ]))>0){ #결츨값이 있는 행의 인덱스를 ㅎ구한다.
      idx <- c(idx ,j) #인덱스를 넣어준다
  }
}
idx
ds[idx ,]
head(ds)


# (3) 결측값이 포함된 행은 몇 개인지 출력하시오.
#출력결과 :NA가 있는 2번행 , 3번행 , 4번행 이 다 나와야한다. 총 3개
#방법1:2번의 결과로 풀기
length(idx)
#방법2
cnt <- 0
for (i in 1:nrow(ds)) {
  if (sum(is.na(ds[i ,]))>0) {
    cnt <- cnt +1
  }
}
cnt

# (4) 결측값이 포함된 행들을 제외하고 새로운 데이터셋 ds.new를 만들어보시오.
ds.new <- na.omit(ds)
dim(ds.new)

# 2번문제. 다음과 같이 mtcars 데이터셋을 mt에 저장한 후 다음 문제를 해결하기 위한 R 코드를 작성하시오.
mt <- data.frame(mtcars)
mt 
# (1) mt의 각 변수(열)들에 대해 특이값이 존재하는지 상자그림을 그려 확인하시오.
dim(mt)
#특이값이 없다.
boxplot(mt[,1])
boxplot(mt[,2])
boxplot(mt[,3])
boxplot(mt[,5])
boxplot(mt[,8])
boxplot(mt[,9])
boxplot(mt[,10])
#특이값이 있다.
boxplot(mt[,4])$out
boxplot(mt[,6])$out
boxplot(mt[,7])$out
boxplot(mt[,11])$out

# (2) 특이값이 존재하는 경우 이상치를 NA로 대체하여 저장하시오.
#mt의 행열을 찾아야한다. 
boxplot.stats(mt[,4])$out
for (i in 1:ncol(mt)) { #ncol: 열
  mt.out <- boxplot.stats(mt[,i])$out
  if (length(mt.out)>0) {
    mt[ mt[,i] %in% mt.out , i] <- NA
  }
}
mt[,4]
mt


# (3) mt에서 NA가 존재하는 행들을 제거하여 mt2에 저장하시오.

mt22 <- mt[complete.cases(mt),]
mt22
dim(mt22)

mt2<- na.omit(mt)
mt2
dim(mt2)


# 3번문제. R에서 제공하는 airquality 데이터셋에 대해 다음의 문제를 해결하기 위한 R 코드를 작성하시오.
# (1) airquality를 AQ에 저장하시오.
AQ <- airquality
head(AQ)
class(AQ)
dim(AQ)
str(AQ)
 # (2) AQ에서 열별로 NA의 개수를 출력하시오.

AQ[,1]
dim(AQ)
boxplot(AQ)
boxplot.stats(AQ[,'Ozone'])$out
boxplot.stats(AQ[,'Solar.R'])$out

for (i in 1:ncol(AQ)) {
 cnt <- sum(is.na(AQ[ , i]))
 cat(names(AQ[i]), ': ',cnt,'개\n')
 }
 
#출력결과
# Ozone : ?개
# Solar.T : ?개
 
# (3) AQ에서 행별로 NA의 개수를 출력하시오.
for (i in 1:ncol(AQ)) {
  cnt <- sum(is.na(AQ[i,]))
  cat(i,"행의 결측값의 갯수 :",cnt,"개 \n")
} 
# (4) AQ에서 NA를 포함하지 않은 행들만 출력하시오.
AQ.NOTNA <- na.omit(AQ) #제거하기
AQ.NOTNA

AQ.NOTNA2 <- AQ[complete.cases(AQ),]
AQ.NOTNA2

# (5) AQ에서 NA를 NA가 속한 열의 평균값으로 치환하여 AQ2로 저장하고, AQ2의 내용을 출력하시오.
col.mean <- colMeans(AQ, na.rm = T) #NA를 빼고 칸의 평균을 구함 , NA없는 칸의 평균
col.mean

AQ2 <- AQ
for (i in 1:ncol(AQ2)) {
  AQ[is.na(AQ2[ , i]),i] <- col.mean[i] 
} 
head(AQ)


# 4번문제. R에서 제공하는 state.x77 데이터셋에 대하여 다음 문제를 해결하기 위한 R 코드를 작성하시오.
# (1) state.x77 데이터셋을 Population(인구수)를 기준으로 오름차순 정렬하시오.
class(state.x77) #자료형은 matrix
order(state.x77[,'Population'])
state.x77[order(state.x77[,'Population']),]
# (2) state.x77 데이터셋을 Income(소득)을 기준으로 내림차순 정렬하시오.
order(state.x77[,'Income'],decreasing = T)
state.x77[order(state.x77[,'Income'],decreasing = T),]
# (3) Illiteracy(문맹률)가 낮은 상위 10개 주의 이름과 문맹률을 출력하시오.
temp <- state.x77[order(state.x77[,'Illiteracy'],decreasing = T),]
head(temp , n=15)
temp[1:10, 'Illiteracy']

# 5번문제. R에서 제공하는 mtcars 데이터셋에 대하여 다음 문제를 해결하기 위한 R 코드를 작성하시오
# (1) mtcars 데이터셋을 gear(기어)의 개수에 따라 그룹을 나누어 mt.gear에 저장하시오.(단, split() 함수를 사용하시오.)
mt.gear <- split(mtcars,mtcars$gear)
mt.gear

# (2) mt.gear에서 gear(기어)의 개수가 4인 그룹의 데이터를 출력하시오.: ``햅틱으로 사용하여 가져온다.
mt.gear$`4`

# (3) mt.gear에서 gear(기어)의 개수가 3인 그룹과 5인 그룹의 데이터를 합쳐서 mt.gear.35에 저장하고 내용을 출력하시오.
mt.gear3 <- mt.gear$`3`
mt.gear5 <- mt.gear$`5`
mt.gear.35 <- rbind(mt.gear3 , mt.gear5)
mt.gear.35

# (4) mtcars 데이터셋에서 wt(중량)가 1.5~3.0 사이인 행들을 추출하여 출력하시오
subset(mtcars ,wt >= 1.5 & wt<= 3.0)
subset(iris,iris$Sepal.Length >7.6 , select = c(Sepal.Length,species))

# 6번문제. mlbench 패키지에서 제공하는 Glass 데이터셋에 대해 다음의 문제를 해결하기 위한 R 코드를 작성하시오.
# (1) 다음과 같이 Glass 데이터셋을 myds에 저장하시오.
library(mlbench)
data("Glass")
myds <- Glass

# (2) myds에서 Type 열의 값을 그룹으로 하여 RI, Na, Mg, Al, Si 열의 값들의 평균을 구하시오. (주의: 집계작업시 팩터타입의 컬럼은 제외해야 한다.)
myds[RI,Na,Mg,Al,Si]


# 7번문제. mlbench 패키지에서 제공하는 Ionosphere 데이터셋에 대해 다음의 문제를 해결하기 위한 R 코드를 작성하시오.
# (1) 다음과 같이 Ionosphere 데이터셋을 myds에 저장하시오.
install.packages('mlbench')
library(mlbench)
data("Ionosphere")
myds <- Ionosphere
myds

# (2) myds에서 class 와 V1열의 값을 그룹으로 하여 V3~V10 열의 값들의 표준편차를 출력하시오. (주의: 집계 작업시 팩터 타입의 열은 제외해야 한다).
head(myds)
aggregate(myds[,3:10],by=list(구분=myds$Class,V1= myds$V1), FUN = sd)
aggregate(myds[,3:10],by=list(V1=myds$V1, class=myds$Class), FUN = sd)

# 8번문제. mtcars 데이터셋에서 10개의 행을 임의로 추출하여 mt10에 저장하고, 나머지 행들은 mt.other에 저장하시오. 그리고 mt10과 mt.other의 내용을 출력하시오.
set.seed(1:10)

idx <- sample(1:nrow(mtcars),size = 10 , replace = F)
idx
mt10 <- mtcars[idx ,]#해당하는 열의 인덱스가 출력된다.
mt10

mt.other <- mtcars[-idx,]
mt.other

# 9번문제. iris 데이터셋에서 각 품종별로 10개의 행을 임의로 추출하여 iris.10에 저장하고, iris.10의 내용을 출력하시오. (품종정보와 품종별 행의 개수를 알고 있다고 가정)
idx2 <- sample(1:nrow(iris), size=10, replace = F)
idx2
iris.10 <- iris[idx2,]
iris.10
# 10번문제. sample( ) 함수를 이용하여 cars 데이터셋의 행들의 순서를 임의로 바꾸어서(셔플링하여) 출력하시오.
cars <- sample(1:nrow(cars),size=10, replace = F)
cars
# 11번문제. iris 데이터셋에서 3개의 Species(품종)를 "2개씩" 짝지어 출력하시오.
sp <- unique(iris$Species)
sp
combn(sp, 2)
# 12번문제. banana, apple, melon,, peach, mango를 "3개씩" 짝지어 출력하시오.
fruit <- c('banana', 'apple', 'melon','peach', 'mango') 
combn(fruit,3)

# 13번문제. state.x77 데이터셋에서 Area(면적)가 Alabama 주보다 크고 California 주보다 작은 주의 이름과 Population(인구 수), Income(소득), Area(면적)를 출력하시오
subset(state.x77, Area >=Alabama & Area>=Californai)

# 14번문제. 다음 문제를 해결하기 위한 R 코드를 작성하시오.
# (1) 제공된 파일 중 subway.csv와 subway_latlong.csv 파일을 읽은 후 병합하여 subway.tot에 저장하시오(병합 기준 열은 STATION_CD와 station).
subway <- read.csv( 'D:/AI/study/R_study/subway.csv', header = TRUE, fileEncoding = "CP949", encoding = "UTF-8")
subway_latlong <- read.csv('D:/AI/study/R_study/subway_latlong.csv', header = TRUE, fileEncoding = "CP949", encoding = "UTF-8")
subway.tot <- merge(subway,subway_latlong, by.x = c('station'), by.y = c('STATION_CD'),)
subway.tot

head(subway)
head(subway_latlong)
head(subway.tot)


# (2) subway.tot에서 역 이름과 날짜를 기준으로 on_tot(탑승 인원)과 off_tot(하차 인원)을 집계(합계)하여 출력하시오.
subname <- aggregate(subway.tot[, c('on_tot','off_tot')], by =list(역이름=subway.tot$stat_name, 날짜=subway.tot$income_date), FUN = sum )
head(subname)
tail(subname) 



# (3) subway.tot에서 2011년도에 대해서만 역 이름을 기준으로 on_tot(탑승 인원)과 off_tot(하차 인원)을 집계(합계)하여 출력하시오. 
# 1단계 2011년도만 추출
condi <- subway.tot$income_date >= 20110101 & subway.tot$income_date <= 20111231
# 2단계 집계함수
aggregate( subway.tot[ condi,  c('on_tot', 'off_tot') ], 
           by=list(역이름=subway.tot$stat_name[condi]), 
           FUN=sum
)
# (4) subway.tot에서 2011년도에 대해서 LINE_NUM(호선)별 on_tot(탑승 인원)과 off_
# tot(하차 인원)을 집계(합계)하여 출력하시오.
aggregate( subway.tot[ condi, c('on_tot', 'off_tot') ], 
           by=list(호선별=subway.tot$LINE_NUM[condi]),
           FUN=sum
)


# 15번문제. 다음의 문제를 해결하기 위한 R코드를 작성하시오.
# (1) 다음과 같이 데이터프레임 authors와 books를 생성하고 authors와 books의 내용을 출력하시오.
  authors <- data.frame(
   surname = c("Twein", "Venables", "Tierney", "Ripley", "McNeil"),
   nationality = c("US", "Australia", "US", "UK", "Australia"),
   retired = c("yes", rep("no", 4)))

  books <- data.frame(
   name = c("Johns", "Venables", "Tierney", "Ripley", "Ripley", "McNeil"),
   title = c("Exploratory Data Analysis",
             "Modern Applied Statistics ...",
             "LISP-STAT",
             "Spatial Statistics", "Stochastic Simulation",
             "Interactive Data Analysis"),
   other.author = c(NA, "Ripley", NA, NA, NA, NA))

authors
books

# (2) surname과 name을 공통 열로 하여 authors와 books를 병합하여 출력하시오(두 데이터프레임에서 공통 열의 값이 일치하는 것들만 병합).
 merge(authors,books,by.x = c('surname') ,by.y = c('name'))

# (3) surname과 name을 공통 열로 하여 authors와 books를 병합하여 출력하되 authors의 행들이 모두 표시되도록 하시오.
 merge(authors,books,by.x = c('surname') ,by.y = c('name'),all.x = T)

# (4) surname과 name을 공통 열로 하여 authors와 books를 병합하여 출력하되 books의 행들은 모두 표시되도록 하시오.
 merge(authors,books,by.x = c('surname') ,by.y = c('name'),all.y = T)
# (5) surname과 other.author를 공통 열로 하여 authors와 books를 병합하여 출력하시오.
 merge(authors,books,by.x = c('surname') ,by.y = c('other,author'),c(all.x = T,all.y = T))
 