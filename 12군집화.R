mydata <- iris[, 1:4]
mydata
fit <- kmeans(x= mydata, centers=3)
fit
#with 3 clusters of sizes 62, 50, 38: 3개의 군집에 속한 데이터들의 갯수
#Cluster means: 좌표점 
#Clustering vector: 각 데이터에 대한  군집번호
#Available components: 


fit$cluster #각각의 군집의 범위를 볼수 있다.
head(iris)
iris[107:127, ]

fit$centers #중심좌표
fit$size # 각 군집의 포인트수(관찰값 수)
fit$totss

#군집 시각화
library(cluster)
clusplot( mydata, fit$cluster , color = T ,  shade = T , labels = 2 , lines = 0)

# clustplot(  mydata 군집화 대상 데이터셋, 
#             
#             fit$cluster 군집화 결과에서 관측값별 군집번호, 
#             
#             color=T 군집을 표시하는 원의 색깔을 군집별로 다르게 할 지 여부 결정, 
#             
#             shade=T 군집을 표시하는 원안에 빗금을 표시할지 여부를 결정, 
#             
#             labels=2 군집화 대상 데이터셋에서 개별 관측값을 그래프상에 어떻게 나타낼지를 지정 1:관측값을 ○ △ + 와 같은 기호로 표시 2: 관측값을 숫자로 표시, 
#             
#             lines = 0 군집의 중심점과 중심점을 연결하는 선을 표시할지 여부를 결정 0:표시하지 않음 1: 표시함 ) 


#2번 군집 자료를 보기 
subset(mydata , fit$cluster== 2)
fit$size
subset(mydata , fit$cluster== 3)


dim(iris)
str(iris)
mydata <- iris[, 1:4]
fit <- kmeans( x=mydata , centers = 3 ) #각각의 변수의 평균이 나온다.

#군집의 갯수는 어떻게 쓸가? 원래는 임의의 수를 쓴다 .
#1) 루트(관찰값) 갯수보다 작게 작성해야한다. 2)str(데이터 셋) Factor가 있다면 level수를 한다.
fit
fit$cluster #군집내용
fit$centers #군집 중심정의 평균
fit$size #군집의 갯수

#군집 시각화
library(cluster)
clusplot(mydata , fit$cluster , color = T , shade =  T ,labels = 2, lines = 1)

subset(mydata , fit$cluster == 3)


# k-평균의 표준화하기
std <- function(x){
  return((x-min(x)) / (max(x)- min(x))) 
}

mydata <- apply( iris[,1:4],2 , std) # apply는 반복하는 함수이다 (데이터셋 , 1이면 행 2이면 열 , 함수명 )
mydata

ds <- data.frame(name=c('A','B'), 키=c(190,180), 시력=c(1.3,0.9)) 
ds


# x - min(x)에서 다음과 같은 에러가 발생했습니다:이항연산자에 수치가 아닌 인수입니다 
# : apply(ds], 2, std) 왜냐하면 ds의 처음인 name은 숫자가 아닌 문자이기 때문에 에러가 난다
ds.app <- apply(ds[,-1], 2, std) 
ds.app



ds1 <-  data.frame(name=c('C','D'), 운동시간=c(0.27 , 2.34) , 일하는시간=c(0.48 , 0.59))
ds1.app <- apply(ds1[-1],1 ,std)
ds1.app
ds2.app <- apply(ds1[-1],2 ,std)
ds2.app

# clusplot.default(mydata, ds1, color = T, shade = F, lines = 1, 에서 다음과 같은 에러가 발생했습니다:군집벡터(clustering vector)의 길이가 올바르지 않습니다.
#clusplot(mydata,ds1,color = T, shade = F , lines = 1 , labels = 2)

#########################
#k-최근접 이웃 분류 
#########################

library(class)
dim(iris) 

#관찰값을 150개를 분석가에 주었다 가정.
#train용으로 60%를 주고 , test용으로 40%를 준다 . 문제의 답을 가지고 있어야한다.
#train 150*60% -답,test  150*40% -답

idc <- c(1:25 , 51:75 , 101:125) #앞쪽 25개 중간쪽 25개 끝쪽 25 자료를 뽑았다
idc 

tr.qust <- iris[idc,1:4] #학습용 문제 50개를 준비
head(tr.qust)

tr.answer <- iris[idc,5] #학습용의 답안지 준비
tr.answer 

te.qust <- iris[-idc,1:4] # 시험용 문제 50개 준비 : 학습용문제를 제외하고 준비 
te.qust

te.answer <- iris[-idc,5] # 시험용 답안지 준비
te.answer

# knn : 학습용문제 , 시험용문제 , 학습용 답안지 , k = 이웃들 3명을 뽑는다 , prob = 예측된 확률을 뽑을지 T,F)
pred <- knn( tr.qust , te.qust , tr.answer, k=3 ,  prob = T) 
pred

acc <-  mean(pred == te.answer) # 머신러닝이 예측한 값과 시험용 답안지의 진짜답을 맞추어보기
acc
table(pred,te.answer)


# 확률값이 나오지않는경우
pred1 <- knn( tr.qust , te.qust , tr.answer, k=20 ,  prob = F)  # 확률값이 나오지 않는다 
pred1

acc1 <-  mean(pred1 == te.answer) # 머신러닝이 예측한 값과 시험용 답안지의 진짜답을 맞추어보기
acc1
table(pred1,te.answer )


# k-fold 교차 검증 knn의 예측률을 높이기 위해 , 데이터셋을 골고루 뽑아낸다
install.packages('cvTools')
library(cvTools)
k <- 10
folds <- cvFolds(nrow(iris),K = k)  # cvFolds(관측수 , 그룹수)
folds

#반복문 만들기
acc <- c() #빈 벡터 
for (i in 1:k) {
  ts.idx <- folds$which == i # folds$which : 각 열에 인덱스 순열이 포함된 정수 행렬이다. i의 값이 TRUE로 나온다
  ds.tr.qust <- iris[ -ts.idx, 1:4]
  ds.tr.answer <- iris[-ts.idx, 5]
  ds.te.qust <- iris[-ts.idx , 1:4]
  ds.te.answer <- iris[-ts.idx , 5]
  pred <- knn(ds.tr.qust,ds.te.qust,ds.te.answer ,k = 5)
  
  acc[i] <- mean(pred == ds.te.answer)
  }
  acc
  mean(acc)


