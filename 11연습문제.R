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
