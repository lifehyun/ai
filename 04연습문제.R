# 1번문제
# (1) 1~100 사이의 정수 중 3의 배수들의 합과 개수를 구하시오. 
sum <- 0
cnt <- 0
  for (i in 1:100) {
    if(i%%3 == 0){
      sum <- sum + i
      cnt <- cnt +1
    }
  }
sum  
cnt
# (2) 101~200 사이의 숫자 중 3과 4의 공배수를 출력하시오. 
  for (i in 101:200) {
    if (i%%3==0 & i%%4==0) {
      print(i)
    }
  }
  i
# (3) 24의 약수를 출력하시오. 
for (i in 1:24) {
  if (24%%i == 0) {
    print(i)
  }
}
  i
# (4) 10!을 출력하시오.(단, factorial() 함수를 이용하지 않는다.) 
fac <- 1
  for (i in 10:1) {
  fac <- fac * i  
  print(i)
}
fac  


#2번문제 for문을 이용하여 다음과 같은 패턴을 출력하는 R 코드를 작성하시오.
for (i in 1:6) { #한번반복
  for(j in 1:i){ #두번반복
    cat('*')
  }
  cat('\n')
}
#3번문제 while문을 이용하여 
 i <- 1
 sum <- 0
 while (i <= 9) {
   sum <- sum + i^2
   i <- i + 1
   }
 sum
# 4번문제 다음의 R 코드를 ifelse문으로 재작성하시오.# 
score <-  60
result <- ifelse(score >60, 'Pass','Fail')
result

#5번문제 소수(prime number):2 3 5 7 11는 1과 자기 자신 외에는 나누어 떨어지지 않는 수를 말한다. 2~1000 사이의 소수를 출력하는 R 코드를 작성하시오
prime <- c()
for (i in 2:1000) { #i는 소수
    for (j in 2:i) {
      if(i%%j == 0) break
    }
  if(j == i)
    prime <- c(prime,i) 
}
prime

# 6번문제 0, 1, 1, 2, 3, 5, 8, 13, 21...... 형태의 수열,
#즉 첫 번째 항의 값은 0이고 두 번째 항의 값은 1일 때 이후의 항들은 이전의 두 항을 더한 값으로 만들어지는 수열을 ‘피보나치 수열’이라고 한다. 
# 0에서부터 시작하여 40개의 피보나치 수열을 출력하는 R 코드를 작성하시오.

#비어있는 벡터를 하나 만든다
fibo <- c(0,1)
while (length(fibo) < 40) {
  f.1 <- fibo[length(fibo)-1]
  f.2 <- fibo[length(fibo)]
  fibo <- c(fibo,f.1 + f.2)
}
fibo

#7번문제 R의 apply() 함수를 이용하여 다음 문제를 해결하는 R 코드를 작성하시오.
# (1) iris 데이터셋의 행별 합계를 출력하시오.
apply(iris[, -5],1,sum)
# (2) iris 데이터셋의 열별 최댓값을 출력하시오.
apply(iris[,-5],2,max)

#8번문제
#(1) mtcars 데이터셋의 열별 합계를 출력하시오.
apply(mtcars,2,sum)
# (2) mtcars 데이터셋의 열별 최댓값을 출력하시오.
apply(mtcars,2,max) 
# (3) mtcars 데이터셋의 열별 표준편차를 출력하시오.
apply(mtcars,2, sd)


#9번문제 다음과 같이 두 정수를 입력하면 두 수의 최대공약수를 찾아서 반환(return)하는 R 함수 lgm()을 만들고 테스트하시오.
lgm <- function(x,y){
  result <- 0
  for (i in 1:max(x,y)) { #최대값만큼 반복한다
    if(x %%i == 0 & y%%i == 0){
      result <- i;
    }
  }
  return (result)
  }
lgm(10,20) # 최대공약수

# 10. 다음과 같이 벡터를 입력하면 벡터의 최댓값과 최솟값을 반환(return)하는 R 함수 maxmin()을 만들고 테스트하시오(반환 값이 list임).
maxmin <- function( x ){
  fmax <- max(x)
  fmin <-  min(x)
  return(  list( max=fmax, min=fmin ))
}

v <- c(1,5,0,9,10,50,8)
rv <- maxmin(v)
rv$max
rv$min


# 11. 10명의 몸무게를 저장한 벡터가 다음과 같을 때 질문을 해결하기 위한 R 코드를 작성하시오.
weight <- c(69,50,55,71,89,64,59,70,71,80)
# (1) 몸무게가 가장 큰 값은 몇 번째에 있나? 
which.max(weight)   
which(weight == max(weight))
# (2) 몸무게가 가장 작은 값은 몇 번째에 있나? 
which.min(weight)
# (3) 몸무게가 61에서 69 사이인 값들은 몇 번째에 있나? 
which(weight >=61 & weight <=69)   
# (4) 몸무게가 60 이하인 값들만 추출하여 weight.2에 저장하고 내용을 보이시오. 
weight.2 <- which(weight<60)
weight.2

# 12번문제
# (1) mtcars 데이터셋에서 연비(mpg)가 가장 좋은 관측값(행)의 내용을 보이시오.
idx <- which.max(mtcars$mpg) 
mtcars[idx,]
# (2) mtcars 데이터셋에서 자동차 중량(wt)이 2~3 사이인 관측값(행)들의 내용을 보이시오.
idx2 <- which(mtcars$wt>=2 & mtcars$wt <= 3) 
mtcars[idx2,] 
# (3) mtcars 데이터셋에서 gear의 수가 3인 자동차 모델의 연비(mpg) 평균값을 구하시오.
idx3 <- which(mtcars$gear == 3)
mean(mtcars[idx3,'mpg'])
# (4) mtcars 데이터셋에서 자동차 중량(wt)이 5 이상인 자동차 모델의 연비(mpg) 최댓값을 구하시오.
idx4 <- which(mtcars$wt>= 5)
idx4
max(mtcars[idx4,'mpg'])
