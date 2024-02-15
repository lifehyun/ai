# 1. R에서 제공하는 Seatbelts 데이터셋에 대해 k-평균 군집화를 실시하고 결과를 그래프로 출력하시오
  head(Seatbelts)
  class(Seatbelts) #"mts":  "matrix"  , "ts"   :  "array"
  str(Seatbelts)
  dim(Seatbelts)
  
  # • 군집의 수는 2로 한다
  # • Seatbelts 데이터셋에서 마지막에 있는 law 열은 제외하고 군집화를 실행한다.
  sb <- Seatbelts[,1:7]
  head(sb)
  
  # • Seatbelts는 각 변수(열)의 값들의 단위의 차이가 많이 나기 때문에 0~1 표준화를 실시한 후 군집화를 실행한다.
  #표준화 함수로 변경하기 
  std <- function(x){
    return((x-min(x))/ (max(x)- min(x)))
  }
  std
  
  sb <- Seatbelts[,1:7]
  head(sb)
  
  sb.app <- apply(sb, 2,std)
  head(sb.app)
  fit <- kmeans( x= sb.app , centers = 2)
  fit
  
  library(cluster)
  clusplot( sb.app , fit$cluster , centers = 2 )
  fit$centers
  
  
# 2. mlbench 패키지에서 제공하는 Sonar 데이터셋에 대해 k-평균 군집화를 실시하고 결과를 그래프로 출력하시오. 
  library(mlbench)
  data("Sonar") # 데이터셋 불러오기
  str(Sonar) 
  class(Sonar)
  dim(Sonar)
  head(Sonar)
  # • 군집의 수는 2로 한다.
  # • Sonar 데이터셋에서 마지막에 있는 Class 열은 제외하고 군집화를 실행한다.
  so <- Sonar[,-61]
  so
  
  std <- function(x){
    return((x-min(x))/ (max(x)- (min(x))))
  }
  
  so.app <- apply(so,2,std)
  so.app
  
  k.so <- kmeans(x =so.app ,centers = 2)
  k.so
  
  #그래프 그리기
  clusplot(so , k.so$cluster , color = T , shade = T , lines = 2 , labels = 1)

  # 3. R에서 제공하는 swiss 데이터셋에 대해 k-평균 군집화를 실시하고 결과를 그래프로 출력하시오.
  head(swiss)
  class(swiss)
  str(swiss)
  dim(swiss)
  # • 군집의 수는 3으로 한다.
  
  # 표준화 하기
  sw <- swiss[,1:6]
  sw
  
  std <- function(x){
    return((x-min(x)/ (max(x)- min(x))))
  }

  sw.app <- apply(sw, 2, std)     
  sw.app
  
  k.sw <- kmeans(x =sw.app , centers =  3 )
  k.sw
  
  #그래프출력
  clusplot(sw , k.sw$cluster , color = T , shade =  T , lines =  2 , labels =  2)
  
  # 4. R에서 제공하는 rock 데이터셋에 대해 k-평균 군집화를 실시하고 결과를 그래프로 출력하시오.
  head( rock )
  dim( rock )
  
  # • 군집의 수는 3으로 한다.
  std <- function( x ){
    return(  ( x - min(x)  )    / ( max(x) - min(x) )    )
  }
  
  ds.rock <- apply( rock, 2, std )
  ds.rock
  
  fit <- kmeans( ds.rock, centers = 3)
  fit
  clusplot( ds.rock, fit$cluster, color=T, shade=T, lablels=2, lines=1   ) 
  warnings( fit )
  
  # 5. mlbench 패키지에서 제공하는 Soybean 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.
 library(mlbench)
  data(Soybean)
  class(Soybean)
  str(Soybean) 
  dim(Soybean) # 원래값: 683  36
  #  Soybean 데이터셋에는 결측값이 포함되어 있으므로 결측값을 제거한다.
  soy.new <- Soybean[complete.cases(Soybean),] 
  head(soy.new)
  dim(soy.new) #제거후 값: 562  36
  #  Soybean 데이터셋에서 첫 번째에 있는 Class 열이 그룹 정보이다.
  class(soy.new)
  #  Soybean 데이터셋에서 "짝수 번째 데이터(관측값)를 훈련용 데이터" 로하고, "홀수 번째 데이터(관측값)를 테스트용 데이터"로 한다.
  
  #짝수 --> 훈련용 데이터
  #홀수 --> 테스트용 데이터
  
  idx <- seq(1, nrow(soy.new),2)  # 1번부터 시작해서 데이터셋에있는걸 2개씩 증가하게 만들어라
  
  #학습문제( 훈련용 데이터)
  #학습지
  soy.train.que <- soy.new[-idx, 2:36]
  soy.train.que  
  #답안지
  soy.train.ans <-  soy.new[-idx,1]
  soy.train.ans
  
  
  #시험문제(테스트용 데이터)
  
  #시험지
  soy.test.que <- soy.new[idx,2:36]
  soy.test.que
  #답안지
  soy.test.ans <- soy.new[idx,1]
  soy.test.que
  
  #  k-최근접 이웃에서 k를 3, 5, 7로 다르게 하여 예측 정확도를 비교한다.
  library(class)
  pred <- knn(soy.train.que, soy.test.que, soy.train.ans ,k = 3 ,prob = T)
  pred 

  acc <- mean(pred == soy.test.ans )
  acc
  
  #분석 보고서 : k-최근접 이웃에서 k가 3명일때 0.886121 이다 0.8967972 
  
  pred <- knn(soy.train.que, soy.test.que, soy.train.ans ,k = 5  ,prob = T )
  pred 

  acc <- mean(pred == soy.test.ans )
  acc
  
  #분석 보고서 : k-최근접 이웃에서 k가 5명일때 0.8540925 이다 0.8683274
  
  pred <- knn(soy.train.que, soy.test.que, soy.train.ans ,k = 7 ,prob = T )
  pred 

  acc <- mean(pred == soy.test.ans )
  acc
  
  #분석 보고서 : k-최근접 이웃에서 k가 7명일때 0.8434164 이다 0.829181 0.8398577
  
  # 6. mlbench 패키지에서 제공하는 Glass 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.
  library(mlbench)
  class(Glass)
  str(Glass)
  dim(Glass) #214 10
  head(Glass)
  # Glass 데이터셋에서 마지막에 있는 Type 열이 그룹 정보이다.
  gl <- Glass[complete.cases(Glass),]
  folds <- cvFolds(nrow(gl) , K = 10)
  acc <- c()
  
  for (i in 1:9) {
    idx <- folds$which == i
    #트레이닝문제
    gl.train.que <- gl[-idx ,1:9]
    #트레이닝답안지
    gl.train.ans <- gl[-idx,10]
    #테스트문제
    gl.test.que <- gl[idx,1:9]
    #테스트답안지
    gl.test.ans <- gl[idx,10]
  prod <- knn(gl.train.que , gl.test.que , gl.train.ans ,k =  5)
  acc[i] <- mean(prod == gl.test.ans)
  }
  acc
  mean(acc)
  # k-최근접 이웃에서 k는 3으로 한다.
  # 5-fold 교차 검증 방법으로 예측 정확도를 측정한다.
  
  # 7. mlbench 패키지에서 제공하는 BreastCancer 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.
  library(mlbench)
  data("BreastCancer") # 데이터셋 불러오기
  class(BreastCancer)
  str(BreastCancer)
  dim(BreastCancer)
  head(BreastCancer)
  
  #  BreastCancer 데이터셋에는 결측값이 포함되어 있으므로 결측값을 제거한다.
  br <- BreastCancer[complete.cases(BreastCancer), ]
  br
  dim(BreastCancer)
  dim(br)
  #  BreastCancer 데이터셋에서 마지막에 있는 Class 열이 그룹 정보이다.
  br.new <- br[,]
  br.new
  head(br.new)
  dim(br.new)
  #  k-최근접 이웃에서 k는 5로 한다.
  #  10-fold 교차 검증 방법으로 예측 정확도를 측정한다.
  library(class) #knn()
  library(cvTools) #cvFolds()
  flods <- cvFolds(nrow(br.new) ,  K = 10 )
  head(flods)
  
  # 반복문을 한다.
  acc <- c()
  for (i in 1:10) {
    #시험용자료 인덱스 구하기
    idx <- flods$which == i
    #학습용 문제
    br.train.que <- br.new[-idx , 1:10 ] 
    #학습용 답안
    br.train.ans <- br.new[-idx, 11]
    #시험용 문제
    br.test.que <- br.new[idx ,1:10]
    #시험용 답안
    br.test.ans <- br.new[idx , 11]
    
    #knn(br.train.que, br.test.que, br.test.ans, k = 5)에서 다음과 같은 에러가 발생했습니다:
    #'train'의 길이와 'class'의 길이가 서로 다릅니다. : pred에  범위를 잘못 잡았을때 뜨는 오류이다.
    
    pred <- knn(br.train.que, br.test.que , br.train.ans , k = 5  )
    pred  
    acc[i] <- mean(pred == br.test.ans)
  }
  acc
  mean(acc)
  
  # 8. mlbench 패키지에서 제공하는 PimaIndiansDiabetes 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.
  library(mlbench)
  data("PimaIndiansDiabetes") # 데이터셋 불러오기
  #  PimaIndiansDiabetes 데이터셋에서 마지막에 있는 diabetes 열이 그룹 정보이다.
  
  #  k-최근접 이웃에서 k는 5로 한다.
  #  10-fold 교차 검증 방법으로 예측 정확도를 측정한다.
  ds <- imaIndiansDiabetes[complete.cases(PimaIndiansDiabetes),]
  flods <- cvFolds(nrow(ds),K = 10) 
  
  # 9. mlbench 패키지에서 제공하는 Vehicle 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.
   
  library(mlbench)
  data("Vehicle") # 데이터셋 불러오기
  head(Vehicle)
  dim(Vehicle) 
  class(Vehicle)
  str(Vehicle)
  
  #  Vehicle 데이터셋에서 마지막에 있는 Class 열이 그룹 정보이다.
  ve <- Vehicle[complete.cases(Vehicle),]
  folds <- cvFolds(nrow(ve), K = 10)
  acc <- c()
  #  k-최근접 이웃에서 k는 3으로 한다.
  for (i in 1:18) {
    
    #시험용자료 인덱스 구하기
    idx <- flods$which == i
    #학습용 문제
    ve.train.que <- ve[-idx , 1:18 ] 
    #학습용 답안
    ve.train.ans <- ve[-idx, 19]
    #시험용 문제
    ve.test.que <- ve[idx ,1:18]
    #시험용 답안
    ve.test.ans <- ve[idx , 19]
    pred <- knn(ve.train.que, ve.test.que , ve.train.ans , k = 3)
    acc[i] <- mean(pred == ve.test.ans)
  }
  acc
  mean(acc)
  #  10-fold 교차 검증 방법으로 예측 정확도를 측정한다.
   
  # 10. mlbench 패키지에서 제공하는 Vowel 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.
 
  library(mlbench)
  data("Vowel") # 데이터셋 불러오기
  head(Vowel)
  str(Vowel)
  dim(Vowel) #990 11
  class(Vowel)
  #  Vowel 데이터셋에서 마지막에 있는 Class 열이 그룹 정보이다. : 마지막 had클래스
  vo <- Vowel[complete.cases(Vowel),]
  flods <- cvFolds(nrow(vo),K = 10)
  acc <- c()
  
  #  k-최근접 이웃에서 k는 5로 한다.
  #  10-fold 교차 검증 방법으로 예측 정확도를 측정한다.
  
  for (i in 1:10) {
    
    #시험용자료 인덱스 구하기
    idx <- flods$which == i
    #학습용 문제
    vo.train.que <- vo[-idx , 1:10 ] 
    #학습용 답안
    vo.train.ans <- vo[-idx, 11]
    #시험용 문제
    vo.test.que <- vo[idx ,1:10]
    #시험용 답안
    vo.test.ans <- vo[idx , 11]
    pred <- knn(vo.train.que, vo.test.que , vo.train.ans , k = 5)
    acc[i] <- mean(pred == vo.test.ans)
  }
  acc
  mean(acc)
  
  