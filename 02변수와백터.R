#산술연산자
2+3
2^3
10%%3
log(10)
log(10, base=2) #log의 밑수가 2
sqrt(4)
max(10,5,9)
abs(-90)
factorial(5) #5~1까지 내려가서 곱한수 
sin(60)
tan(45)

# 변수 선언 <- (단축키:alt +  - )
pi <- 3.14
sin(pi/2)

name <- "홍길동"

#벡터란? 1차원 배열이다 . 백터명 <- c(요소1, 요소2)

x <- c(1,2,3)
x #숫자형인 num

y <- c('a','b','c')
y #문자형인 chr형

x <- c(1,3,'a','b')
x #num형인 x가 chr형으로 변경

z <- c(TRUE,TRUE,FALSE,FALSE)
z #참 , 거짓형 logi

z <- c(1,2,TRUE,FALSE)
z # logi형이었던 z가 num형으로 변경

# 벡터 만들기
#1~10까지 벡터만들기
num1<- (1:10)
#1~100까지벡터 만들기
num2 <- (1:100)
#200~500까지 벡터 만들기
num3 <- (200:500)
#100~300 , 400~ 500까지 벡터 만들기
num4 <- seq(100,500,by=100)


#1 3 5 7 9 ..99 까지 벡터 만들기 1~100까지 증가치가 2인 벡터 만들기
seq(from=1, to=100, by=2) #방법1 : 원래 형식
seq(1,100,2) #방법2 : 값만 넣어도 가능하다

# 100 ~1 까지 벡터만들기
seq(100,1,-2)

#rep 같은수의 반복해주는 함수
# 앞에는 조건 , 뒤에는 반복하는 조건.
rep(2:10,2)
rep(1:4,2)
rep(1:4,each=2) # 각각반복해주는 함수
rep(1:4,c(2,3,4,5))
rep(1:4,each=2,length.out=(4))

#벡터의 이름 지정하기
score <- c(90,85,70)
names(score) #벡터의 이름을 출력하기. 
names(score) <- c('김수진','이영미','최진수') #벡터의 이름값을 넣어준다.
score # 넣은값을 출력한다.

#부분적으로 출력하고 싶을때
score[1] #김수진만 보고싶을떄
score['이영미'] #이영미만 보고싶을때 
score[3] #최진수만 보고싶을떄
score['최진수']
score[2:3]#이영미 최진수의 값을 보고싶을때
score[c('이영미','최진수')] 

#값의 내용바꿀때
v1 <- c(1,5,7,9)
v1[2] <- 3
v1

#1,5번 인덱스 값을 바꾸기
v1[c(1,5)] <- c(10,20)

x <- (10:15)
y <- (20:25)
x
y
x+y
x*y

x1 <- 10:14
y1 <- 20:26
x1+ y1 # 인덱스의 길이가 맞지 않으면 계산이 안된다


d <- 1:10
sum(d)
sum(d*2)
length(d)
mean(d)
max(d)
min(d)
sort(d)
sort(d,decreasing = T) #정렬뒤에 T는 트루이고 , F는 FALSE이다 

help()
#
d <- 1:9 
d[d>5] 
d[d<4]

# 5~8 그리고에 해당


#list형 
#값만 출력하고 싶을시 [[]] 이중괄호 , $ 뽑아내고싶은 자료명
ds <- c(90,85,70,84)
my.info <- list(name="Tom", age=60 , status=TRUE , score=ds)
my.info
my.info[1]
my.info[[1]]
my.info[2]
my.info[[2]]
my.info$score
my.info$status

#factor 범주형 자료(예 동서남북)저장 사용한다.
bt <- c('A','B','B','O','AB')
bt.new = factor(bt) # factor 만들기
bt.new
bt.new[1:3]
bt.new[-2] #2번째 인덱스 값은 제외하기
levels(bt.new)

# as.의 뜻 ~~로 바꿔준다는 함수
as.integer(bt.new) #level로 정렬한순서의  인덱스번호를 출력해준다.
bt.new[6] <- 'A'
bt.new
bt.new[7] <- 'O'
bt.new[8] <- 'C' #<NA>가 출력되는 이유는 리스트에 작성하지않은 값이 있어서 

nn <- c('동','서','남','북','북','북')
nn.new <- factor(nn)
levels(nn.new)
as.integer(nn.new)
nn.new[7] <- '동'
nn.new[8] <- 'North' #위에 없으니까 자료가 들어가지 않는다.
