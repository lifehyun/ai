#변수를 사용하여 구구단 
for (k in 2:9) {
  for(i in 1:9){
    cat(k,' * ',i, '=',k*i,'\n')
  }
}

# iris에서 꽃잎의 길이에 따른 분류작업
class(iris)
head(iris)

norow <- nrow(iris)
mylabel <- c() #빈벡터 만들기

for (i in 1:norow) {
  if (iris$Petal.Length[i]<=1.6) {
    mylabel[i] <- 'L'
  }else if(iris$Sepal.Length[i]>=5.1){
    mylabel[i] <- 'H'
  }else{
    mylabel[i] <- 'M'
  }
}
mylabel
newds <- data.frame(iris$Petal.Length, mylabel)
head(newds)
table(newds$mylabel)

#apple함수
apply(iris [, 1:4], 1, mean)
head(iris)
dim(iris)

apply(iris[, 1:4],2,mean)

#사용자 정의 함수
mymax<- function(x , y){
  num.max <- x
  if( y > x){
    num.max <- y
  }
  return(num.max)
}
mymax(10 , 15)


myfunc <- function(x , y){
  sum <- x+y
  mul <- x*y
  div <- x/y
  mod <- x%%y
  return(list(rsum=sum , rmul=mul, rdiv=div , rmod=mod ))
}
result<- myfunc(20 , 10)
result$rsum
result$rmul
result$rdiv
result$rmod

# 외부(다른)파일에 저장한 함수 사용(호출)하기
source('D:/AI/study/R_study/myfunc.R')
a <- myfu(100,50)
a$rsum
a$rmul
a$rdiv
a$rmod


#조건에 맞는 데이터의 위치 찾기
#which() , witch.max() , which.min() 

score <- c(76,84,69,50,95,60,82,71,88,84)
which(score>= 85)
max(score)
which.min(score)

idx <- which(score <= 60) 
score[idx] <- 61
score

idx2 <- which(score>=80)
idx2

score.high <- score[idx2]
score.high

idx3 <- which(iris$Petal.Length>5.0)
idx3

iris.big <- iris[idx3,]
iris.big

#행과 열의 위치 찾기 
idx4 <- which(iris[, 1:4]> 5.0, arr.ind = T)
idx4

head(iris)




