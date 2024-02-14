# 1. Loblolly 데이터셋에서 age를 이용해 height를 예측하는 단순선형 회귀모델을 만드시오. 그리고 age가 10, 15, 20일 때 height를 예측하여 보시오.
head(Loblolly)
dim(Loblolly)
str(Loblolly) 
plot(age~height , data = Loblolly ,col="red")
abline(model.2)
#종속변수는? height이다 == y값이다
#독립변수는? age이다 == x값이다


#1단계 회기식을 구한다
model.2 <- lm(age~height,Loblolly)
model.2
#2단계 
w <- coef(model.2)[2] #height:0.3782742
b <- coef(model.2)[1] #Intercept:0.7573804 

#3단계 회기값 구한다
age <- 10
y.10 <- w * age + b
y.10

age <- 15
y.15 <- w * age + b
y.15

age <- 20
y.20 <- w * age + b
y.20


# 2번문제. airquality 데이터셋에서 Wind로 Temp를 예측하는 단순선형 회귀모델을 만드시오. 그리고 Wind가 10, 15, 20일 때, Temp를 예측하여 보시오.
head(airquality)
dim(airquality)
str(airquality)
plot(Wind~Temp , data=airquality , col= 'blue')
abline(model.3)
#종속변수는? Temp이다 == y값이다
#독립변수는? Wind이다 == x값이다

#1단계
model.3 <- lm(Temp~Wind,airquality)
model.3

#2단계
w <- coef(model.3)[2]
w 
b <- coef(model.3)[1]
b

W.10 <-  w * 10 + b 
W.10

W.15 <- w * 15 + b
W.15

W.20 <- w * 20 + b
W.20

# 3번문제. pressure 데이터셋에서 온도(temperature)로 기압(pressure)을 예측하는 단순선형 회귀모델을 만드시오. 
# 그리고 온도가 65, 95, 155일 때 기압을 예측하여 보시오.

#종속변수는:예측하는값이다? preccure이다 == y값이다
#독립변수는? temperature이다 == x값이다
head(pressure)
dim(pressure)
str(pressure)
plot(pressure~temperature , data= pressure , col= 'black')
abline(model.4)

model.4 <- lm(pressure~temperature,pressure)
model.4

w <- coef(model.4)[2]
w

b <- coef(model.4)[1]
b

t.65 <- w * 65 + b
t.65

t.95 <- w * 95 + b
t.95

t.155 <- w * 155 + b
t.155


t.350 <- w * 350 + b
t.350

# 4번문제. state.x77 데이터셋에 대해 다음의 문제를 해결하는 R 코드를 작성하시오.
# (1) 문맹률(Illiteracy)과 고등학교 졸업률(HS.Grad))로 1인당 소득(Income)을 예측하는 다중선형 회귀모델을 만드시오.
head(state.x77) 
dim(state.x77)
str(state.x77)
class(state.x77)


#종속변수: 1인당 소득(Income)
#독립변수: 문맹률문맹률(Illiteracy), 고등학교 졸업률(HS.Grad)
model.4 <- lm(Income~Illiteracy + HS.Grad , data = data.frame(state.x77)) 
model.4
#회귀식 y = -52.64 * Illiteracy + 44.55 * HS.Grad + 2131.33
summary(model.4) 
#독립변수중에서 기여도가 높은 변수는? HS.Grad
#유의 수준은 ?1.057e-05
#모델의 설명력은?0.3597 
#회귀식에서 독립변수를 HS.Grad만 구하기
model.5 <- lm(Income~HS.Grad , data = data.frame(state.x77))
model.5
summary(model.5)
# (2) 다중선형 회귀모델을 이용하여 state.x77 데이터셋의 문맹률(Illiteracy)과 인구수(Population)로 1인당 소득(Income)을 예측하시오.

model.6 <- lm(Income~Illiteracy + Population , data = data.frame(state.x77))
model.6

#회귀식 작성 y = -468.63466 * Illiteracy + 0.03555 * Population + 4833.16224
summary(model.6)

# (3) (2)에서 예측한 1인당 소득과 실제 state.x77 데이터셋의 1인당 소득(Income)이 얼마나 차이가 나는지 보이시오. (예측값, 실제값, 예측값-실제값을 나타낸다.)
head(state.x77)
Illiteracy <-  2.1
Population <- 3615
pred = -468.63466 * Illiteracy + 0.03555 * Population + 4833.16224 #예상값
pred #실제값: 3977.543
state.x77 ['Alabama','Income']
pred - state.x77 ['Alabama','Income']
ds.3 <- data.frame(pred , state.x77 ['Alabama','Income'], pred - state.x77 ['Alabama','Income'])
colnames(ds.3) <- c('예상값','실제값','차이값')
ds.3

# 5번문제. mlbench 패키지의 BostonHousing 데이터셋은 보스턴 지역의 지역 정보 및 평균 주택가격(medv) 정보가 저장되어 있다. 다른 변수들을 이용하여 medv를 예측하는 모델을 만드시오.(단 chas 변수는 모델을 만들 때 제외한다.)
library(mlbench)
data(BostonHousing) # 데이터셋 불러오기
class(BostonHousing) 
dim(BostonHousing)
str(BostonHousing)

# (1) 전체 변수를 이용하여 평균 주택가격(medv)을 예측하는 회귀모델을 만들고 회귀식을 나타내시오.
#회귀식 구하기 y = w x + b
ds <- BostonHousing[, -4]
head(ds)
model.7 <- lm(medv~. , data=ds)
model.7

summary(model.7)
# y = -0.113139 * crim + 0.047052 * zn + 0.040311  * indus + -17.366999 * nox + 3.850492  *  rm + 0.002784 
#   *  age +  -1.485374 * dis + 0.328311 * rad + -0.013756 * tax + -0.990958 * ptratio + 0.009741 * b + -0.534158 * lstat  )


# (2) 평균 주택가격(medv)을 예측하는 데 도움이 되는 변수들만 사용하여 예측하는 회귀모델을 만들고 회귀식을 나타내시오.
 library(MASS)
  model.7.1 <- stepAIC(model.7)
  summary(model.7.1)
  y = -0.114056 * crim + 0.045742  * zn + -16.469153 * nox + 3.844639 * rm + -1.526099 * dis + 0.315531 * rad +
      -0.012674 * tax  + -0.978442 * ptratio + 0.009730 * b + -0.528103 * lstat + 36.620311
  
  # (3) (1), (2)에서 만든 예측모델의 설명력(Adjusted R-squared)을 비교해 보시오.
  summary(model.7)#생명령 : 0.7291( 모든 독립변수를 사용한경우 )
  summary(model.7.1) #생명령 : 0.7299 (indus , age인 독립변수를 제거한경우 )

  # 6번문제. mtcars 데이터셋에서 다른 변수들을 이용하여 연비(mpg)를 예측하는 다중 회귀모델을 만드시오.
  head(mtcars)
  dim(mtcars)
  str(mtcars)
  # (1) 전체 변수를 이용하여 연비(mpg)를 예측하는 회귀모델을 만들고 회귀식을 나타내시오.
  model.8 <- lm(mpg~. , data=mtcars)
  summary(model.8) #0.8066 
   model.8
  y = -0.11144 * cyl +  0.01334 * disp + -0.02148 * hp + 0.78711 * drat + -3.71530  *
      wt + 0.82104 * qsec + 0.31776 * vs + 2.52023 * am + 0.65541 * gear + -0.19942 * carb + 12.30337
  
  # (2) 연비(mpg)를 예측하는 데 도움이 되는 변수들만 사용하여 예측하는 회귀모델을 만들고 회귀식을 나타내시오.
  model.8.1<- stepAIC(model.8)
  summary(model.8.1) #0.8336 
  
  y = -3.9165  * wt + 1.2259  * qsec + 2.9358  * am + 9.6178 
  
  # (3) (1), (2)에서 만든 예측모델의 설명력(Adjusted R-squared)을 비교하시오.
  summary(model.8) #0.8066 
  summary(model.8.1)  #0.8336
  
  # 7번문제. UCLA 대학원의 입학 데이터를 불러와서 mydata에 저장한 후 다음 물음에 답하시오. 
  mydata <- read.csv("https://stats.idre.ucla.edu/stat/data/binary.csv")
  mydata
  head(mydata)
  class(mydata)
  str(mydata)
  dim(mydata)
  # (1) gre, gpa, rank를 이용해 합격 여부(admit)를 예측하는 로지스틱 모델을 만드시오(0: 불합격, 1:합격).
  
  #모델링을한다
  model.10 <- glm(admit~. , data = mydata)
  summary(model.10)
  
  # (2) mydata에서 합격 여부(admit)를 제외한 데이터를 예측 대상 데이터로 하여 (1)에서 만든 모델에 입력하여 합격 여부를 예측하고 실제값과 예측값을 나타내시오.
  
  head(mydata)
  #예측값에 넣을 값을 만들기
  admit1 <- data.frame(mydata[,2:4])
  head(admit1)
  
  #predict() 예측값 구하기
  pred <- predict(model.10 , admit1)
  pred
  
  length(pred) #몇개인지 보는 함수
  head(pred) #모델로 예측값을 구한것을 보여주는 것
  
  # 예측값은 0 0 1 0 0 0 
  pred <- round(pred , 0)
  head(pred) 
  
  # 실제값은 0 1 1 1 0 1
  head(mydata$admit)
  tail(mydata$admit)
  
  result <- data.frame(예측값=pred , 실제값=mydata$admit , 오차= pred - mydata$admit)
  result
  y =  0.0004424 * gre + 0.1510402 * gba + -0.1095019 * rank + -0.1824127
  
  #맞게 예측 한 것의 갯수는?
  sum(result$예측값 == result$실제값)
  
  #틀리게 예측한 것의 갯수는?
  sum(result$예측값 != result$실제값)
  
  # (3) 만들어진 모델의 예측 정확도를 나타내시오.
  acc <- mean( result$예측값 == result$실제값)
  acc
  
  # 8번문제. mlbench 패키지의 PimaIndiansDiabetes 데이터셋은 17개의 변수로 당뇨 여부(diabetes)를 예측하기 위한 정보를 담고 있다. 17개의 변수들을 이용하여 당뇨 여부(diabetes)를 예측하는 로지스틱 회귀모델을 만드시오.
  
  library(mlbench)
  data(PimaIndiansDiabetes) # 데이터셋 불러오기
  head(PimaIndiansDiabetes)
  str(PimaIndiansDiabetes)
  dim(PimaIndiansDiabetes)
  
  # (1) set.seed(100)을 실행한 후 전체 데이터(관측값)에서 임의로 60%를 추출하여 train에 저장하고 나머지 40%는 test에 저장하시오.
  
  # 1단계 diabetes 숫자로 변형하기
  ds <- PimaIndiansDiabetes
  ds$diabetes <- as.integer(ds$diabetes) #pos(양성) :2 ,(음성): neg 1
  head(ds)
  # 2단계 임의로 60%로 추출하기
  set.seed(100)
  train.idx <- sample(1:nrow(ds) , nrow(ds) * 0.6 )
  head(train.idx)
  
  train <- ds[-train.idx ,] # 제외할 곳을 빼준다
  head(train)
  
  
  test.idx <- sample(1:nrow(ds), nrow(ds) *0.4 ) 
  head(test.idx)
  
  test <- ds[-test.idx , ]
  head(test)
  
  
  # (2) train의 데이터로 당뇨여부(diabetes)를 예측하는 로지스틱 회귀모델을 만들고 회귀식을 나타내시오.
  # (당뇨여부(diabetes) 변수는 팩터 타입이므로 정수로 바꾸어야 모델을 만들 수 있다.)
  model.train <- glm(diabetes~.,data=train)
  summary(model.train)
  
  train.rm <- stepAIC(model.train)
  summary(train.rm)
  
  y = 0.0329147 * pregnant + 0.0061303 * glucose + 0.0133551 * mass +  0.1911055 * pedigree + 0.1377013

  # (3) 회귀모델에 대해 test의 데이터를 입력하여 당뇨여부(diabetes)를 예측하시오.
  predict(diabetes~. , date = test)
  pro <- predict(model.train,test)
  head(pro)
  head(ds)
  pro <- round(pro,0)
  head(pro)
  
  ds[1:20,]
  # (4) 예측한 값과 실제 당뇨여부를 비교하여 모델의 정확도(accuracy)가 어느 정도인지 확인하시오.

  acc <- mean(pro == test$diabetes)
  acc # 0.7678959 의 정확도가 있다
  #보고서 : 모델은 76,78의 정확도로 예측할 수 있다
  
  # 9번문제. mlbench 패키지의 Glass 데이터셋은 9개의 변수로 잔디의 종류(Type)를 예측하기 위한 정보를 담고 있다. 9개의 변수들을 이용하여 잔디의 종류(Type)를 예측하는 로지스틱 회귀모델을 만드시오.

  library(mlbench)
  data(Glass) # 데이터셋 불러오기
  dim(Glass)
  class(Glass)
  str(Glass)
  
  ds<- Glass
  ds$Type <- as.integer(Glass$Type)
  ds
  # (1) set.seed(100)을 실행한 후 전체 데이터(관측값)에서 임의로 60%를 추출하여 train에 저장하고 나머지 40%는 test에 저장하시오.
  set.seed(100)
  train.idx <- sample( 1:nrow(ds), nrow(ds)*0.6  )
  train <- ds[ train.idx, ]
  test <- ds[ -train.idx, ]
  train
  
  
  # (2) train의 데이터로 잔디의 종류(Type)를 예측하는 로지스틱 회귀모델을 만들고 회귀식을 나타내시오.(잔디의 종류(Type) 변수는 팩터 타입이므로 정수로 바꾸어야 모델을 만들 수 있다.)
  model.glass <- glm( train$Type~. , data=train )  
  summary(model.glass)
  y = 130.69743 * RI + 0.53712 * Na -0.52967 * Mg + ... + -233.21655
  
  # (3) 회귀모델에 대해 test의 데이터를 입력하여 잔디의 종류(Type)를 예측하시오.
  
  pred <- predict(  model.glass, test )
  pred 
  pred <- round( pred, 0 )
  head( pred )
  head( test )
  
  # (4) 예측한 값과 실제 잔디의 종류를 비교하여 모델의 정확도(accuracy)가 어느 정도인지 확인하시오.
 
  acc <- mean( pred == test$Type )
  acc # 0.4651163
  
  # 보고서 : 모델의 정확도는 0.46이다. 낮은 정확도이므로 다시 모델을 정립할 필요가 있다. 
  # 독립변수를 다시 정비할 필요가 있다.
  