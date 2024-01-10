use sqldb;
select * from usertbl;
-- userid 'bbk' , 'jkw'인 사람만 
select * from usertbl where useid in  ('bbk', 'jkw');
-- 김씨 서을 가진 사람 검색
select * from usertbl where name like '김%';
-- 김경호씨 키보다 큰 사람은?
-- 1단계 김경호의 키는? 177을 검색
select height from usertbl where name = '김경호';
-- 2단계 조건 찾기
select * from usertbl where height >= 177;
-- 1단계 2단계 동시에 작성하기
select * from usertbl where height >= ( select height from usertbl where name = '김경호'); 

-- 은지원 보다 나이가 어린 사람은?alter
-- 1단계 은지원 나이 검색
select birthYear from usertbl where name = '은지원';
-- 2단계 조건 찾기
select * from usertbl where birthYear > 1972;
-- 1단계 2단계 섞어서 
select * from usertbl where birthYear > (select birthYear from usertbl where name = '은지원');

select * from buytbl;
-- prodname 노트북의 groupname 종류와 동일한 물품의 노트북의 해당하는 userid,prodName , groupName 검색하기
-- 결과는 kbs 노트북 전자 / jyp 모니터 전자 /  bbk 모니터 전자 / bbk 메모리 전자 
-- 1단계 전자 검색하기
select groupName from buytbl where prodName = '노트북'; 
-- 2단계 
select userid, prodName ,groupName from buytbl
	where groupName >= (select groupName from buytbl where prodName = '노트북');

-- 김범수가 산 물건은 무엇인가요?
-- 김범수의 user_id를 구한다.
select prodName, userid from buytbl where userid = (select userid from usertbl where name = '김범수');

select * from usertbl;
-- 주소가 서울사람인 검색하기
select addr  from usertbl where addr = '서울';
-- 서울에 사는 사람의 키보다 작은 키를 가진 사람 검색하기 
-- any 함수 사용시 : 또는 이라는 뜻이고 , 최소값 보다 큰값이 출력된다
select * from usertbl where height <= any (select height from usertbl where addr = '서울');
-- some 함수 : 또는 이라는 뜻이고 , 최소값 보다 큰값이 출력된다
select * from usertbl where height <= some (select height from usertbl where addr = '서울');

-- all 함수 사용시 : 그리고 라는 뜻이고 , 작거나 같은 값이 출력된다
select * from usertbl where height <= all (select height from usertbl where addr = '서울');


select * from buytbl;
-- 운동화를 산 사람의 이름은?
select userid from buytbl where prodName = '운동화';
select * from usertbl where userid = any(select userid from buytbl where prodName = '운동화'); 

-- 청바지를 산 사람의 이름은?
select userid from buytbl where prodName = '청바지';
select * from usertbl where userid = any(select userID from buytbl where prodName = '청바지');

-- 키 오름차순으로 출력하기
select * from usertbl order by height desc;
-- 키가 제일 큰 사람 3명만 출력하기
select * from usertbl order by height desc limit 3;
-- 나이가 제일 많은 사람 출력하기
select * from usertbl order by birthYear asc;
-- 나이가 제일 많은 사람 5명 검색하기
select * from usertbl order by birthYear asc limit 5;

-- 테이블 만들기 usertbl 동일한 테이블을 출력하기
-- 같은 테이블을 복사해서 만들때는 자동으로 제악조건(pk,fk)는 만들어 지지 않는다 , 새로 만들어줘야 한다. 
create table usertbl2 (select * from usertbl);
select * from usertbl2;

-- 테이블 만들기 서울에 있는 사람만 출력하기
create table userSeoul (select * from usertbl where addr = '서울');
select * from userseoul;

-- 키가 175 ~ 180 사이인 사람만 userid, name , height 열만 테이블로 만들어 출력하기
create table hightTbl (select userid , name , height from usertbl where height between 175 and 180); 
select * from hightTbl;

-- group by절 : 여러개를 넣으면 하나가 나온다
select userid,sum(amount), avg(amount), max(amount), count(amount),std(amount), var_samp(amount) from buytbl group by userid; 
-- 총구매액이 1000원 이상인 사람의 사용자명과 총구매액 구하기
select userid , sum(price)  from buytbl group by userid;
-- 총구매액이 300원 이상인 사람의 사용자명과 총구매액 구하기
select userid , sum(price) from buytbl group by userid having sum(price) >= 300; 
-- 경품 대상인 사람을 테이블로 만들기 , userid , mobile2, addr
create table eventTbl(
select userid, mobile2, mobile2 addr from usertbl 
	where userid = any( select userid from buytbl group by userid having sum(price) >= 300) 
);

select * from eventTbl;

select * from buytbl;

-- groupName 그룸화하기
select groupName , sum(amount), sum(price) from buytbl group by groupName;

-- 테이블 가장 높은 groupName,prodName , amount , price 만들기
-- 가장 많이 판 그룹이 팔린 그룹을 찾는다
-- 1단계 가장 높은 전자 찾기
select groupName 
from buytbl group by groupName 
			having max(price) >=  (select max(price) from buytble);
-- 2단계 
create table if not exists maxGroupTbl 
   ( select groupName, prodName, amount, price from buytbl 
    where groupName = ( select  groupName 
                     from buytbl group by groupName
                             having max(price) >= ( select max(price) from buytbl)
                       )
    );
select * from maxgrouptbl;

select * from buytbl order by groupName;
-- rollup : 소합계
-- with rollup : 중간합계 구할때 쓰는 함수
select num , groupName , sum(price) from buytbl group by groupName, num with rollup;

-- p.220
-- 요구사랑 게시판ㅇ에서 게시글 번호 경우에 자동번호가 넘버링 좋겠다.
-- 학번 부여 자동부여 되게 하고 싶다
-- auto_increment를 사용하려면 조건은 : int형이고 primary key , unique 사용

create table if not exists testTbl2
(id int auto_increment primary key,
userName char(3),
age int);

insert into testTbl2 values(null , '지민',25);
insert into testTbl2 (userName,age) values ('유나',22);
insert into testTbl2 (userName,age) values ('유경',21);
select * from testTbl2;

-- 시작수가  100부터 입력하고 싶을때
alter table testTb14 auto_increment=100;
insert into testTbl4 values(null , '지수',25);

-- 학번이  240101 시작하기
create table if not exists testTbl3
(id int auto_increment primary key,
userName char(3),
age int);

alter table testTbl3 auto_increment=240101;
insert into testTbl3 (userName,age) values ('유경2',21);

-- 증가치를 1씩이 아니라 3개씩 증가되게 만들기
set @@auto_increment_increment=3;
insert into testTbl3 (userName,age) values ('유경5',21);
insert into testTbl3 (userName,age) values ('유경6',21);

select * from testTbl3;

-- employees를 사용하러가기
use employees;
select * from employees.employees;
--			  데이터베이스명. 테이블명

-- sqldb 를 사용하러가기
use sqldb;
select * from buytbl;

drop table if exists testtbl4 ; 
select * from buytbl ;
-- 요구사항 : 상품명, 가격 테이블 만들기
-- 1단계 테이블 만들기
create table if not exists testtbl4 
  ( prodName varchar(40) not null,
    price int not null ) ;
-- 2단계 삽입한다.
select distinct prodName, price from buytbl ;

insert into testtbl4  
       select distinct prodName, price from buytbl ;

select * from testtbl4 order by price desc ;

-- 청바지 가격을 100으로 수정하기
update testtbl4 set price = 100 where prodName = '청바지' ;
-- 가장 높은 가격인 것을 찾아서 10% 인하하기
-- 1단계 가장 높은 가격 것 찾기
select price from testtbl4 order by price desc limit 0, 1;
-- 2단계 10% 인하하기  **** with문으로 사용하기 
-- update시에 동일한 테이블을 서브쿼리 사용하여 update 할 수 없다. 
-- 오류 
update testtbl4  set price = price - price * 0.1 
   where price =
   ( select price from ( select price from testtbl4 order by price desc limit 1 ) as t );

update testtbl4  set price = price - price * 0.1 
 where  price = 
   ( select price from ( select price from testtbl4 order by price desc limit 0, 1 ) as t  ); 

select * from testtbl4;


-- delete문 
select * from buytbl;
-- copyBuy 테이블 복사해서 만들기 
create table if not exists copyBuy
   select * from buytbl;
select * from copyBuy;

-- copyBuy amount가 제일 작은 것 찾아서 삭제하기
-- 1단계 amount가 제일 작은 것 찾기
select amount from copyBuy  order by amount asc limit 1;
-- 2단계 삭제하기
delete from copyBuy  
where 
amount = (  select amount from 
               ( select amount from copyBuy  order by amount asc limit 1 ) as t );

select * from copyBuy ;



-- insert문인데 select문을 이용하여 삽입하기
-- values:  1001 2004-01-09	김	성수	M	2024-01-09 
create table testTbl5 (id int ,fname varchar(50), lname varchar(50));
select  emp_no , first_name , last_name from employees.employees ;

insert into testTbl5 
	select  emp_no , first_name , last_name from employees.employees ;
select * from testtbl5;

create table copyBuyTbl ( select * from buyTbl);
-- 가격이 상위권 3개인걸 출력하기
select * from copyBuyTbl order by price desc limit 3;
-- 가격이 상위권 3개인걸 삭제하기
delete from copyBuyTbl order by price desc limit 3;

select * from copyBuyTbl;
-- 수량이 하위권 2개 삭제하기
select * from copyBuyTbl order by amount asc;
select * from copyBuyTbl order by amount asc limit 2;

-- 운동화중 상위 1개 삭제하기
select * from copyBuyTbl where prodName = '운동화';
update copyBuyTbl set price = 60 where num = 2 ; 
delete from copyBuyTbl order by price desc limit 1;
select * from copyBuyTbl ;


