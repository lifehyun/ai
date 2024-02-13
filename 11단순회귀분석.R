
#단순선형 회귀 분석
#문제 주행속도와 제동거리사이의 회귀식 구하기
head(cars)
class(cars)
str(cars)
dim(cars)
plot(dist~speed, data=cars)

cars

#산점도에서 선형관계가 분명하다.
#주행속도가 증가할수록 제동거리도 증가한다
#형식 회귀모델 구하는 함수: lm(종속변수 ~ 독립변수 , 데이터셋)
#회기식은 y = wx+b
mod1 <- lm(dist~speed,cars)
mod1
coef(mod1)[1] #intercept값이 b이다 : 17.57909
coef(mod1)[2] #speed 3.932409 값이 "w"이다
#그래서 y = 3.932409 X speed - 17.57909 회기식이 구해진다.


#문제 속도가 30일때 제동거리는?
y <- 3.932409 * 30 - 17.57909
y
#문제 속도가 50일때 제동거리는?
y <- 3.932409 * 50 - 17.57909
y

#문제 속도가 70일때 제동거리는?
y <- 3.932409 * 70 - 17.57909
y

#오차는 꼭 있다 . 인정하기
#예상제동거리 , 실제 제동거리 , 오차 구하기
head(cars)
speed <- cars[,1]
speed
b <- coef(mod1)[1]
w <- coef(mod1)[2]
pred <- w*speed + b #예상제동거리(회귀식에 의한 제동거리)
pred

#예상제동거리 , 실제 제동거리 , 오차구하기를 데이터프레임으로 만들기
compare <- data.frame(pred,cars[,2],pred - cars[,2])
compare
colnames(compare) <- c('예상제동거리','실제제동거리','오차')
compare

