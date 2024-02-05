#1번문제
#matrix를 사용하여 만든다
z <- matrix(12:1 , nrow = 3, ncol = 4 ,byrow=4)
z
rownames(z) <- c('v1','v2','v3') # 행의 이름을 지을때 

#다른 방식
v1 <- 12:9
v2 <- 8:5
v3 <- 4:1

z1 <- rbind(v1,v2,v3)
z1



#1-1번문제

z <- matrix(12:1, nrow = 3, ncol = 4 , byrow = T)
rownames(z) <- c('v1','v2','v3')
#(2) 매트릭스 z의 열 이름을 각각 a1, a2, a3, a4로 바꾸시오
colnames(z) <- c('a1','a2','a3','a4')
#(3) 매트릭스 z에 1~7 사이의 홀수로 구성된 벡터 v4를 행 방향으로 추가하시오.
v4 <- c(1,3,5,7)
z <- rbind(z,v4)
z
#(4) 4행에 있는 모든 값을 출력하시오.
z[4,]
#(5) 2~4행의 값 중 a1, a3열에 있는 값을 출력하시오.
z[2:4,c('a1','a3')]
#(6) 매트릭스 z의 세 번째 행의 이름을 출력하시오.
rownames(z)[3] 
#(7) 매트릭스 z의 세번째 열의 이름을 출력하시오
colnames(z)[3]


#2번문제
#(1) state.x77을 변환하여 st에 데이터프레임으로 저장하시오.
st <- data.frame(state.x77)
#(2) st의 내용을 출력하시오. 
st
#(3) st의 열 이름을 출력하시오.
colnames(st)
#(4) st의 행 이름을 출력하시오. 
rownames(st)
#(5) st의 행의 개수와 열의 개수를 출력하시오. 
nrow(st)
#(6) st의 요약 정보를 출력하시오. 
str(st) #데이터 요약정보
dim(st) #행열갯수
#(7) st의 행별 합계와 평균을 출력하시오. 
rowSums(st) #행별 합계
rowMeans(st)#행별 평균
#(8) st의 열별 합계와 평균을 출력하시오. 
colSums(st)
colMeans(st)
#(9) Florida 주의 모든 정보를 출력하시오. 
st['Florida',]
#(10) 50개 주의 수입(Income) 정보만 출력하시오.
st[,'Income']
# (11) Texas 주의 면적(Area)을 출력하시오.
st['Texas','Area']
# (12) Ohio 주의 인구(Population)와 수입(Income)을 출력하시오. 
st['Ohio', c('Population','Income')]
# (13) 인구가 5,000 이상인 주의 데이터만 출력하시오. 
subset(st,Population>=5000)
# (14) 수입이 4,500 이상인 주의 인구, 수입, 면적을 출력하시오. 
subset(st,Income>=4500, select = c(Population,Income,Area)) 
subset(st,Income>=4500)[,c('Population','Income','Area')]
# (15) 수입이 4,500 이상인 주는 몇 개인지 출력하시오. 
nrow(subset(st,'Income'>=4500))
# (16) 전체 면적(Area)이 100,000 이상이고, 결빙일수(Frost)가 120 이상인 주의 정보를 출력하시오. 
subset(st,Area>=100000 & Frost>=120)
# (17) 인구(Population)가 2,000 미만이고, 범죄율(Murder)이 12 미만인 주의 정보를 출력하시오. 
subset(st,Population<2000 & Murder<12)
# (18) 문맹률(Illiteracy)이 2.0 이상인 주의 평균 수입은 얼마인지 출력하시오. 
subset(st,Illiteracy>=2.0, select = 'Income'  ) 
# (19) 문맹률(Illiteracy)이 2.0 미만인 주와 2.0 이상인 주의 평균 수입의 차이를 출력하시오. 


# (20) 기대수명(Life Exp)이 가장 높은 주는 어디인지 출력하시오. 
max(st[,'Life.Exp']) #73.6
subset(st,Life.Exp == max(st[,'Life.Exp'])) #hawail
row.names(subset(st,Life.Exp == max(st[,'Life.Exp'])))

row.names(subset(st,Life.Exp==73.6))
# (21) Pennsylvania 주보다 수입(Income)이 높은 주들을 출력하시오. 
#1단계 Pennsylvania주 수입구하기
st['Pennsylvania','Income']
#2단계 높은 주들
subset(st,'Income'>4449)
#3단계 주들명 출력(행이름만 출력)
rownames(subset(st,'Income'>'4449'))

#3번문제
# (1) 위와 같은 내용을 가지는 데이터프레임 human을 생성하시오.
name <- c('Tom','Jane','Nick')
age <- c(20,23,26)
gender <- c('M','F','M')
height <- c(180,160,175)
student <- c(TRUE,TRUE,FALSE)
human <- data.frame(name,age,gender,height,student)

human
# (2) human에 (“Mary”, 24, “F”, 155, TRUE)를 추가하시오(list함수 사용).
human.new <- list(name='Mary',age=24,gender='F',height=155,student='TRUE')
human <- rbind(human,human.new)

# (3) 이 데이터셋 열들의 자료형을 보이시오. 
str(human)
# (4) 평균 나이(age)와 평균 키(height)를 구하시오.
mean(human$age)
mean(human$height)

# (5) 4번째 열을 제외한 human의 열 이름을 출력하시오.
colnames(human)[-4]
colnames(human[-4])
# colnames(human[-'height']) 안된다
# (6) 성별(gender) 인원수를 보이시오.
table(human$gender)




#4번문제 R에서 제공하는 swiss 데이터셋은 스위스 47개 주의 경제 자료를 포함하고 있다. 
#이 데이터셋에 대해서 다음 문제를 해결하기 위한 코드를 작성하시오.

# (1) 데이터셋의 요약 정보를 보이시오. 
class(swiss)

# (2) 남성의 농업인 비율(Agriculture)이 가장 높은 주를 보이시오. 
#1단계 가장 높은 것을 구하기
max( swiss$Agriculture)
#2단계 행을 구하기
subset(swiss , Agriculture == max(swiss$Agriculture))
#3단계 row의 이름만구하기
rownames( subset(swiss , Agriculture == max(swiss$Agriculture)) )

# (3) 남성의 농업인 비율(Agriculture)을 내림차순으로 정렬하여 주의 이름과 함께 보이시오. 
#1단계 농업의 비율을 출력하기 
swiss[,'Agriculture',]
swiss[2]
#2단계 내림차순으로 정렬하기
tmp <- swiss[order(swiss$Agriculture,decreasing = T) ,]
tmp['Agriculture']

# (4) 카톨릭 신자의 비율(Catholic)이 80% 이상인 주들의 남성의 농업인 비율(Agriculture) 을 보이시오. 
subset(swiss,Catholic >=80 , select = Agriculture )

# (5) 징집대상자 중 입대시험에서 높은 평가를 받은 사람들의 비율(Examination)이 20% 미만이고 남성의 농업인 비율(Agriculture)이 50% 미만인 주의 이름과 Examination, Agriculture 컬럼의 값을 보이시오. 
subset(swiss , Examination <20 &  Agriculture <50 , select = c(Examination, Agriculture) )


# 5번문제 R을 이용하여 각 문제를 수행하기 위한 코드를 작성하시오.
 
# (1) R에서 제공하는 state.x77 데이터셋에서 수입(Income)이 5,000 이상인 주의 데이터에서 수입(Income), 인구(Population), 면적(Area) 열의 값들만 추출하여 rich_state.csv 에 저장하시오. 
# 1단계 데이터형을 확인
class( state.x77 ) # matrix 구조 
# 2단계 형변환 matrix --> data.frame
st<- data.frame( state.x77 )
class( st )
# 3단계 조건으로 검출 
rich_state <- subset( st, st$Income>=5000 )[  c('Income', 'Population', 'Area' )]
# 4단계 엑셀파일로 저장하기
write.csv( rich_state,'D:/AI/study/R_study/rich_state.csv'  )

# (2) (1)에서 만든 rich_state.csv 파일을 읽어서 ds 변수에 저장한 후 ds의 내용을 출력하시오. 
ds <- read.csv( 'D:/AI/study/R_study/rich_state.csv' )
ds


# 6번문제 
# (1) 위와 같은 내용의 매트릭스 score를 생성하시오. 
m <- c(10,40,60,20)
f <- c(21,60,70,30)
score <- cbind(m,f)
score
# (2) score의 열 이름을 각각 male, female로 바꾸시오. 
colnames(score) <- c('male','female')
# (3) 2행에 있는 모든 값을 출력하시오. 
score[2,]
# (4) female의 모든 값을 출력하시오. 
score[,'female'] 
# (5) 3행 2열의 값을 출력하시오. 
score[3,2]
 
# 7. R에서 제공하는 mtcars 데이터셋은 자동차 모델에 대한 제원 정보를 담고 있다. 이 데이터셋에 대해서 다음 문제를 해결하기 위한 코드를 작성하시오.
# (1) 이 데이터셋의 자료구조를 보이시오. 
class(mtcars)
# (2) 이 데이터셋의 행의 개수와 열의 개수를 보이시오. 
dim(mtcars) 
# (3) 이 데이터셋 열들의 자료형을 보이시오. 
str(mtcars)  
# (4) R 스튜디오의 도움말 기능을 이용하여 각 열이 어떤 데이터를 저장하고 있는지 설명하시오(예: mpg(mile per gallon), 자동차의 연비). 
help(mtcars) 
# (5) 연비(mpg)가 가장 좋은 자동차 모델을 보이시오. 
max(mtcars$mpg)
subset(mtcars ,mtcars$mpg == max(mtcars$mpg))
row.names(subset(mtcars ,mtcars$mpg == max(mtcars$mpg)))
# (6) gear가 4인 자동차 모델 중 연비가 가장 낮은 모델을 보이시오. 
rownames(subset(mtcars,gear==4 & mpg==17.8)) #간단하게.

#1단계 gear가 4인 자동차모델 구하라.
subset(mtcars ,mtcars$gear == 4)
#2단계 mpg가 가장 낮은 연비를 구하라
mpg.min <- min(subset(mtcars ,mtcars$gear == 4,'mpg'))
#3단계 2단계의 모델명을 가져와라
rownames(subset(mtcars ,mtcars$mpg == mpg.min))

# (7) Honda Civic의 연비(mpg)와 gear 수를 보이시오. 
mtcars['Honda Civic', c('mpg','gear')]

# (8) Pontiac Firebird 보다 연비가 좋은 자동차 모델을 모두 보이시오. 
# Pontiac Firebird 보다 연비는?
p.mpg <-  mtcars[ 'Pontiac Firebird', 'mpg'] # 19.2
# 
rownames( subset( mtcars, mpg > p.mpg ) ) 

# (9) 자동차 모델들의 평균 연비를 보이시오. 
mean( mtcars$mpg )

# (10) gear의 수 종류를 보이시오. 
unique( mtcars$gear )

