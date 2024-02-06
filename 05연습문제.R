#1번문제
# (1) esoph 데이터셋의 tobgp 열(column)에는 각 사람이 하루에 섭취하는 담배 소비량이 범주형 자료 형태로 저장되어 있다. esoph 데이터셋의 tobgp열의 값을 잘라내어 tabaco에 저장한 후, tabaco의 값을 출력하시오. 
 tabaco <- esoph$tobgp
 tabaco
 # (2) tabaco에 있는 값들의 중복을 제거하고 출력하시오. 
 tabaco <- unique(tabaco)
 tabaco
 # (3) tabaco에 있는 값들에 대해 도수분포표를 작성하여 출력하시오. 
 table(tabaco)
 # (4) tabaco에 있는 값들에 대해 막대그래프를 작성하여 출력하시오. 
  barplot(table(tabaco))


 #2번문제
 # 2. 어떤 학급 학생들의 시험 통과 여부가 다음과 같을 때 주어진 문제를 해결하기 위한 R 코드를 작성하시오.
 
 # (1) 위의 자료를 result에 저장하시오.
  result=c('P','P','F','P','F','P','F','P','P','F')
 # (2) result에 있는 값들에 대해 도수분포표를 작성하여 출력하시오.
  table(result)
 # (3) result에 있는 값들에 대해 막대그래프를 작성하여 출력하시오.
  barplot(table(result))
 # (4) result에 있는 값들에 대해 원그래프를 작성하여 출력하시오. 
  pie(table(result))
 
  #3번문제
  # 3. 좋아하는 계절에 대한 조사 결과가 다음과 같을 때 주어진 문제를 해결하기 위한 R 코드를 작성하시오.
  # (1) 위의 자료를 season 벡터에 저장하시오.
  season <- c('여름','겨울','봄','가을','여름','가을','겨울','여름','여름','가을') 
 # (2) season에 있는 값들에 대해 도수분포표를 작성하여 출력하시오.
  table(season) 
 # (3) season에 있는 값들에 대해 막대그래프를 작성하여 출력하시오.
  barplot(table(season))
 # (4) season에 있는 값들에 대해 원그래프를 작성하여 출력하시오.
  pie(table(season))
 
    #4번문제
    # 4. 학생 A의 과목별 성적이 다음과 같을 때 각 문제를 해결하기 위한 R 코드를 작성하시오.
    # (1) 위 데이터를 score 벡터에 저장하시오(과목명은 데이터 이름으로 저장).
    score <- c(90,85,73,80,85,65,78,50,68,96)
    names(score) <- c('KOR','ENG','ATH','HIST','SOC','MUSIC','BIO','EARTH','PHY','ART')
    # (2) score 벡터의 내용을 출력하시오.
    score
    # (3) 전체 성적의 평균과 중앙값을 각각 구하시오.
    mean(score)
    median(score)
    
    # (4) 전체 성적의 표준편차를 출력하시오.
    sd(score)
    # (5) 가장 성적이 높은 과목의 이름을 출력하시오.
    names(which.max(score)) 
    #가장 성적이 낮은 과목의 이름.
    names(which.min(score))
    # (6) 성적에 대한 상자그림을 작성하고, 이상치에 해당하는 과목이 있으면 출력하시오.
    barplot(score , main='성적')
    # (7) 다음 조건을 만족하는 학생성적에 대한 히스토그램을 작성하시오.
    #(그래프 제목: 학생 성적, 막대의 색: 보라색)
    barplot(score,main = '학생 성적',col = 'purple')
    
    #5번문제
    # 5. R에서 제공하는 mtcars 데이터셋에 대해 다음 문제를 해결하기 위한 R 코드를 작성하시오.
    # (1) 중량(wt)의 평균값, 중앙값, 절사평균값(절사범위: 15%), 표준편차를 각각 구하시오.
    mean(mtcars$wt)
    median(mtcars$wt)
    mean(mtcars$wt,trim =0.15)
    sd(mtcars$wt)
    # (2) 중량(wt)에 대해 summary( ) 함수의 적용 결과를 출력하시오.
    summary(mtcars$wt)
    # (3) 실린더수(cyl)에 대해 도수분포표(table)를 출력하시오.
    table(mtcars$cyl)
    # (4) 앞에서 구한 도수분포표를 막대그래프(barplot)로 출력하시오.
    barplot(table(mtcars$cyl))
    # (5) 중량(wt)의 히스토그램(hist)을 출력하시오.
    hist(mtcars$wt)
    # (6) 중량(wt)에 대해 상자그림(boxplot)을 출력하시오.(단, 상자그림으로부터 관찰할 수 있는 정보를 함께 출력하시오.)
    boxplot(mtcars$wt ,main= '중량(wt)' )
    # (7) 배기량(disp)에 대한 상자그림을 출력하시오.(단, 상자그림으로부터 관찰할 수 있는 정보를 함께 출력하시오.)
    boxplot(mtcars$disp,main='배기량(disp)')
    # (8) 기어수(gear)를 그룹 정보(~)로 하여 연비(mpg) 자료에 대해 상자그림(boxplot)을 작성하고, 각 그룹의 상자그림을 비교하여 관찰할 수 있는 것이 무엇인지 나타내시오.
    boxplot(mpg~gear,data = mtcars ,main='mpg gear')
   
    #6번문제
     # 6. R에서 제공하는 trees 데이터셋에 대해 다음 문제를 해결하기 위한 R 코드를 작성하시오.
      # (1) trees 데이터셋의 앞쪽 일부 데이터만 출력하시오.
        trees[1]
      # (2) 나무 지름(Girth)의 평균값(mean), 중앙값(median), 절사평균값(절사범위: 15%)(mean(),trim=), 표준편차(sd)를 각각 구하시오.
        mean(trees$Girth)
        median(trees$Girth)
        mean(trees$Girth , trim = 0.15)
        sd(trees$Girth)
      # (3) 나무 지름(Girth)에 대해 히스토그램을 작성하시오.
        hist(trees$Girth)
      # (4) 나무 지름(Girth)에 대해 상자그림을 작성하시오.
        boxplot(trees$Girth)
      # (5) 나무 높이(Height)의 평균값, 중앙값, 절사평균값(절사범위: 15%), 표준편차를 각각 구하시오.
        mean(trees$Height)
        median(trees$Height)
        mean(trees$Height,trim = 0.15)
        sd(trees$Height)
      # (6) 나무 높이(Height)에 대해 히스토그램을 작성하시오.
        hist(trees$Height)
      # (7) 나무 높이(Height)에 대해 상자그림을 작성하시오.
        boxplot(trees$Height)
    
    #7번문제
    # 7. R에서 제공하는 Orange 데이터셋에 대해 다음 문제를 해결하기 위한 R 코드를 작성하시오.
      # (1) Orange 데이터셋의 앞쪽 일부 데이터만 출력하시오.
      Orange[1]
      # (2) 나무 연령(age)의 평균값, 중앙값, 절사평균값(절사범위: 15%), 표준편차를 각각 구하시오.
      mean(Orange$age)
      median(Orange$age)
      mean(Orange$age,trim = 0.15)
      sd(Orange$age)
      # (3) 나무 연령(age)에 대해 히스토그램을 작성하시오.
      hist(Orange$age)
      # (4) 나무 연령(age)에 대해 상자그림을 작성하되 그룹(Tree)을 구분하여 작성하시오.
      boxplot(Tree~age ,data = Orange ,main = '나무연령' )
      # (5) 나무 둘레(circumference)의 평균값, 중앙값, 절사평균값(절사범위: 15%), 표준편차를 각각 구하시오.(단, 그룹(Tree) 번호 2는 제외하시오.)
      mean(Orange$circumference)
      median(Orange$circumference)
      mean(Orange$circumference,trim = 0.15)
      
      # (6) 나무 둘레(circumference)에 대해 히스토그램을 작성하시오.(단, 그룹(Tree) 번호 2는 제외하시오.)
      hist(!Orange$circumference[-2])
      # (7) 나무 둘레(circumference)에 대해 상자그림을 작성하되 그룹(Tree)을 구분하여 작성하시오.
      boxplot(Orange$circumference~Orange$Tree , data = Orange )
      