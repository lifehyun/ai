#다중선형 회귀 분석
install.packages('car')
library(car)
head(Prestige)
dim(Prestige)
class(Prestige)
str(Prestige)

#문제 : 연봉 예측하기 ( 교육연수 - education , 여성비율 - women , 직군에 대한 평판도 - prestige)
#종속변수 : 연봉(inCome)
#독립변수 :  교육연수 (education) , 여성비율 (women) , 직군에 대한 평판도 (prestige)
#데이터셋은 1열~4열까지
newData <- Prestige[, 1:4]
head(newData)

#산점도로 변수간의 관계 확인
plot(newData,col='purple')

#회귀식 구하기
#               y =    x1     *    x2  *     x3   + b(Intercept)
model.1 <- lm(income~education + women + prestige , newData) #독립변수가 여러개일때는 + 로 연결해준다.
model.1
#회귀식으로 써보기 y = 177.2 * education + (-50.9) * women + 141.4 * prestige + b:(-253.8)

#해당식을 요약해보기
summary(model.1) # Adjusted R-squared:  0.6323  


#다중선형 회귀모델에서 변수 선택하기
install.packages('MASS')
library('MASS')
class('MASS')
newData2 <- Prestige[, 1:4]
head(newData2)
model.2 <- lm(income~ women + prestige + education , newData2)
model.2
model.3 <- stepAIC(model.2) #독립변수 ( stepAIC: 기여도가 낮고,불필요한자료를 제거해준다 ) 자동으로 선택 진행


#회귀식 2번  y = (-50.9) * women + 141.4 * prestige + b:(-253.8)
summary(model.3) # Adjusted R-squared:  0.6327

#2개의 모델을 만들었다 . model.1 , model.3 중 model.3이 더 잘한 모델이다 왜? 독립변수가 적어도 설명력이 높기 때문이다.

#예측하기
newData2

#문제 education 12.26 women 4.02 prestige 69.1일때 income예측하기
#model.1으로 예측하기
education <- 12.26 ; women <-  4.02 ;  prestige <- 69.1
y1 = 177.2 * education + (-50.9) * women + 141.4 * prestige + (-253.8)

#model.3으로 예측하기
y3 = (-50.9) * women + 141.4 * prestige + (-253.8)

#실제값은 25879
y1 #예측값:11484.79
y3 #예측값:9312.322


