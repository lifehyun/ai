#매트릭스

z <- matrix(1:30,nrow=5,ncol=6 ,  byrow= T)
z

z1 <- matrix(101:200,nrow = 10,ncol = 10)
z1

x <- 1:5  #1차원벡터
y <- 8:12 #1차원벡터
x
y
#2차원 메트릭스로 만들고 싶을때 
sum.xy <- cbind(x,y) # 면으로 합친형태
sum.xy

sum.xy1 <- rbind(x,y) # 줄로 합친형태
sum.xy1

#1~5
f <- 1:5
#101~105
f1 <- 101:105
#201~205
f2 <- 201:205

f
f1
f2

sum.f <- cbind(f,f1,f2)
sum.f1 <- rbind(f,f1,f2)

sum.f
sum.f1


# 인덱스에서 뽑고 싶은 것만 뽑기 
z1
z1[2,4]
z1[3,2]
z1[1, ] #1행을 다 뽑고 싶으면 뒤에 공백을 주면된다.

z1[,2] #열을 다 뽑고 싶을때
#1행 3행을 뽑을때
z1[c(1,3), ]
#2열 4열을 뽑을때
z1[, c(2,4)]
#2열 부터 4열까지 뽑을때
z1[, 2:4]

#행,열이름 주기

score <- matrix(c(90,85,69,78, 85,96,49,95, 90,80,70,60),nrow = 4 , ncol = 3)
score
#행이름 추가
rownames(score) <- c('John','Tom','Mark','Jane')
#열이름 추가
colnames(score) <- c('English','Math','Science')

#95점 나오게 하기
score[2,2] #2행 2열

#60점 나오게 하기
score[4,3] #4행 3열
score['Jane','Science']

#78점 나오게하기
score['Jane','English']

#Tom의 점수를 검색하세요
score["Tom", ] #Tom행을 가져오면된다

#수학점수를 검색하세요
score[,'Math'] 

#수학점수의 평균을 구해주세요.
mean(score[,'Math'])

#전체 학생의 이름은 무엇입니까?
#행의 이름이 써있다.
rownames(score)

# 전체 과목명은 ?
#열의 이름이 써있다.
colnames(score)

#두번째 학생명은 누구야?
rownames(score)[2] 

#세번째 과목명은?
colnames(score)[3]


#데이터 프레임
#만들기
city <- c('Seoul','Tokyo','Washington')
rank <- c(1,3,2)
ece <- c(TRUE,TRUE,FALSE)
city.info <- data.frame(city,rank,ece)
city.info

#도쿄를 꺼내보자
city.info[2,'city']
city.info[1,'rank']

rownames(city.info)
colnames(city.info)


iris
head(iris,n=10)
tail(iris,n=5)

head(iris[,c(1:2)])
head(iris[,'Petal.Width'])
dim(iris) #몇행,몇열보는 함수
str(iris) #구조를 보는함수
iris[, 5] #품종데이터를 보는 함수
unique(iris[, 5]) #중복데이터 제거 해주는 함수
table(iris[, 'Species'])#품종별로 갯수 세기

colSums(iris[-5]) 
colMeans(iris[-5]) 
rowSums(iris[-5])
rowMeans(iris[-5])

#행과 열을 바꾸기
t(city.info) #trainsation :변환하다
subset(ci)#조건의 따라서 행렬을 추출하다


# 2.5 연산자
a <- matrix(1:20,4,5)
a
b <- matrix(21:40,4,5)
b


2*a
b-5
a+b
b/a
a*b

#데이더의 종류를 알아보는법
class(iris)
class(state.x77)
class(islands)
class(lh)

is.matrix(iris) #메트릭스인지 물어보는것 
is.data.frame(iris) #데이터프레임인지 물어보는것


#메트릭스:자료형이 동일한 1차배열만 가능 <-> 데이터프레임셋(자료형이 다른 2차배열)
st <- data.frame(state.x77)
class(st) 
class(iris)

# 데이터프레임셋(자료형이 다른 2차배열)<-> 메트릭스:자료형이 동일한 1차배열만 가능 
as.im <- as.matrix(iris) 
class(as.im)

#알추출하기
class(iris)
class(state.x77) 
iris[,'Species'] #열이름으로 검색

head(state.x77)
state.x77[,'Area'] #열이름으로 검색

iris[ , 5] #인덱스로 검색 가능
state.x77[,8] # 가능


iris['Species'] #열이름으로 검색 가능
state.x77['Area'] #불가능

iris[5]
state.x77[8]#검색 불가능

iris$Species #데이터 프레임$열이름
state.x77$Area #안됨


#파일 데이터 읽기/쓰기
setwd("D:/AI/study/R_study")#파일불러올 경로명 가져오기
air <- read.csv("airquality.csv")
air
class(air)

air2 <- read.csv('D:/AI/study/R_study/airquality.csv')
head(air2)
air2['Ozone']

air3 <- read.csv(file.choose()) #대화상자로 열어서 파일 불러오기
head(air3)

#저장하기
iris.setosa <- subset(iris , Species == 'setosa')
write.csv(iris.setosa,"irisfilename.csv",row.names = F) #줄번호 없는것
write.csv(iris.setosa,"irisfilename2.csv") # 줄번호 있는것

