#변수가 2개이상인자료 
#매트릭스 , 데이터프레임을 저장하여 분석한다.
#산도점:2개의 변수로 구성된 자료의 분포를 알아보는 그래프이다.


#두변수의 산점도

class(mtcars) #2차원인 데이터프레임이다.
head(mtcars) 
wt <- mtcars$wt #차의 무게
mpg <- mtcars$mpg #차의 연비
plot(wt,mpg,main = '중량-연비 그래프',
     xlab='중량',ylab='연비',col="pink",pch=99)

#여러변수들 간의 산점도(pairs로 본다)
vars <- c('mpg','disp','drat','wt')
target <- mtcars[,vars]
target
pairs(target) #방법1
plot(mtcars[,vars]) #방법2

head(iris)
iris.2<- iris[, 3:4]
iris.2
point <- as.numeric(iris$Species) #as.numeric("품종종류")숫자로 바꿔라
point
color <- c('red','green','blue') #기호생상을 넣은것
plot(iris.2 , main="붓꽃의 꽃잎길이와 너비관계",
     pch=c(point), #기호모양 
     col=color) #기호색상

pairs(iris.2,main="Iris plot",
      pch=c(point), col=color[point])


x <- c(2,3,5,6)
y <- c(4,3,3,10)
tbl <- data.frame(x,y)
tbl
cor(x,y) #상관계수 계산하기

beers = c(5,2,9,8,3,7,3,5,3,5) # 자료 입력 
bal <- c(0.1,0.03,0.19,0.12,0.04,0.0095,0.07,0.06,0.02,0.05) # 자료입력
tbl <- data.frame(beers,bal) # 데이터프레임 생성
tbl
plot(bal~beers,data=tbl,col='red',pch=9) # 산점도
res <- lm(bal~beers,data=tbl) # 회귀식 도출
abline(res) # 회귀선 그리기
cor(beers,bal) 

head(iris)
tbl2 <- iris[, 1:4]
class(tbl2)
plot(tbl2)

t1 <- iris$Petal.Length
t2 <- iris$Petal.Width
tbl3<- data.frame(t1,t2)
tbl3
plot(t1,t2)
res <- lm(t1~t2, data=tbl3)
res
abline(res)
cor(t1,t2)
cor(iris[,1:4])

cor(iris[,1:4])
'http://127.0.0.1:46373/graphics/6c8ba984-15fc-4ce0-b489-e5820a939e66.png'
#월별 지각생의 수를 선그래프로 표현
month = 1:12
late = c(5,8,7,9,4,6,12,13,8,6,6,4) 	# 자료 입력
plot(month,late,main="월병 지각생 수", type='s',lty=1, lwd=1, 		
     xlab="Month",ylab="Late cnt",col="#10f011")


#시나리오
#미국 보스턴 지역 주택 가격에 영향을 미치는 항목은 무엇인가?
#외부에 있는 데이터 셋의 패키지 다운로드하기
install.packages('mlbench')
library(mlbench)# 해당 라이브러리를 사용할때쓰는 명령어
data('BostonHousing')
head(BostonHousing)
dim(BostonHousing)
class(BostonHousing)
str(BostonHousing)

#필요한 열만 추출한다
myds <- BostonHousing[,c('crim','rm','dis','tax','medv')]

#새로운 열추가: grp
grp <- c()
for (i in 1:nrow(myds)) {
  if(myds$medv[i]>= 25.0){
    grp[i] <-"H" #최상위층
  }else if(myds$medv[i]<= 17.0){
    grp[i] <- "L"#중상위층
  }else{
    grp[i] <- "M"#중위층
  }
}
grp <- factor(grp) #팩터로 만드는것
grp <- factor(grp, levels = c("H","M","L")) 
myds <- data.frame(myds,grp)
head(myds)
myds


#데이터셋의 형태와 기본적인 내용 파악
str(myds)
#도수분표표로 내용파악
table(myds$grp)
dim(myds)
class(myds)
summary(myds[,1:4])

#차트로 그리기 자료형은 연속형 , 히스토그램 , boxplot 이다
par(mfrow =c(2,3))
for (i in 1:5) {
  hist(myds[,i], main=colnames(myds)[i],col='yellow',
       xlab='변량들',ylab='빈도수'
       )
  
}



