#로지스틱 회귀분석
# 예측하는 값(Y의 값) : 종속변수 = 범주형이다 glm()함수로 찾는다 
# 범주형자료를 문자로 하면 안된다. 수치를 숫자형으로 만들어야한다: as.integer()
# EX) 월요일은 1 , 화요일은 2 , 동 - 1 , 서 - 2 , 남 - 3 , 북 - 4  , setosa - 1 , vers - 2

head(iris)
class(iris)
str(iris)
dim(iris)

#범주형 자료를 숫자로 변환하기
iris.new <- iris
iris.new$Species <- as.integer(iris$Species)
str(iris.new$Species)
tail(iris.new$Species)

head(iris.new)
#회귀식 구하기
#종속변수 : Species , 독립변수 : Sepal.Length Sepal.Width Petal.Length Petal.Width 
#구하고싶은 종속변수 ~ 독립변수 들을 나열하면된다.
model.9 <- glm(Species~Sepal.Length + Sepal.Width + Petal.Length + Petal.Width , data=iris.new ) 
model.9 <- glm(Species~. , data = iris.new) #위에있는 식과 동일 
summary(model.9 )

#회귀식 표시하기 y = w x + b
#오류가 난다 ? 독립변수의 값이 들어가 있지 않기 때문에
y = -0.11191 * Sepal.Length + -0.04008 * Sepal.Width +0.22865 * Petal.Length + 0.60925 * Petal.Width + 1.18650
  
#필요없는거 변수 제거하고 회귀식 표시하기  (기여도가 낮은 변수는 제거하고 해도된다)
model.9.1 <- stepAIC(model.9)  
summary(model.9.1)

y = -0.13624 * Sepal.Length + 0.25213 * Petal.Length + 0.58689 * Petal.Width * 1.14469
tail(iris.new)


Petal.Length <- 4.0
Petal.Width <- 2.5

y =  0.25213 * Petal.Length + 0.58689 * Petal.Width * 1.14469  


# predict() 함수로 품종을 예측하기
unknown <- data.frame(rbind(c(5.1 , 3.5, 1.4, 0.2))) #예측하고 싶은 독립변수의 값을 넣기
unknown
names(unknown) <- names(iris)[1:4]
pred<- predict(model.9 , unknown) #predict 자동으로 계산해준다. (회귀모델 , 예측하려는 x값들)
pred # 0.9174506 

#반올림 해서 올려보기: 소숫점이 없게
pred <- round(pred,0)
pred

Sepal.Length <- 5.1
Sepal.Width  <- 3.5
Petal.Length <- 1.4
Petal.Width  <- 0.2

y = -0.11191 * Sepal.Length + -0.04008 * Sepal.Width +0.22865 * Petal.Length + 0.60925 * Petal.Width + 1.18650
y #[1] 0.917439 

help(predict)
