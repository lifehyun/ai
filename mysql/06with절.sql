-- sqldb 사용하러 가기
use sqldb; 

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


-- 1. with절 사용하기 p229쪽 교체
-- 뷰 , 파생테이블 , 임시테이블 , 가상테이블 : 잠깐 쓰고 버리기(메모리에서 삭제)
use sqqldb;
select * from usertbl;
select * from buytbl;

-- 요구사항 : 이름 총구매액(price * amount)
select userid , sum(price) * sum(amount) as '총구매액' from buytbl group by userid;
-- 이름을 출력하기
select name from usertbl;
with t ( tid , total )
as
(
	select userid , sum(price * amount) from buytbl group by userid
) 
select * from t ;

-- 두개의 테이블에서 필요한 컬럼을 뽑아와서 출력한다
-- select 테이블명.이름 , 테이블명.이름 from 데이블명 , 테이블명
select usertbl, sum(price * amount) from usertbl, buytbl 
									where buytbl.userid = buytbl.amount
group by userid;

select * from usertbl , buytbl;	-- usertbl 행과 buytbl 행이 모두 곱해져서 나온다
select * from usertbl , buytbl where usertbl.userid = buytbl.userid; -- 교집합이 나온다.

-- userid , name , amount , price 두개 테이블에서 각각 다른 항목 검색하기
select usertbl.userid , usertbl.name, buytbl.amount, buytbl.price
from usertbl,buytbl where usertbl.userID = buytbl.userID;
-- 에러 발생
-- select usertbl.name, buytbl.amount * buytbl.price
-- from usertbl , buytbl
-- where usertbl.userID = buytbl.userID
-- group by buytbl.userID


select u.userid , u.name, b.amount * b.price
	from usertbl u , buytbl b
	where u.userID = b.userID ;
 
-- 위에 쿼리를 가상테이블로 만들기

with t (id , name , total )
as
(
	select u.userid , u.name, b.amount * b.price
	from usertbl u , buytbl b
	where u.userID = b.userID 
) 
select name , sum(total)  from t group by  name ;    

-- 회원테이블(userTbl)에서 각 지역별로 가장 큰 키를 1명씩 뽑은후 그사람들의 키의 평균을 내보자
-- 1단계 각 지역별로 가장 큰 키를 1명씩 출력
select addr , max(height) from usertbl group by addr;
-- 2단계 가상테이블 만들기
with t ( avgheight)
as
(
select max(height) from usertbl group by addr
) -- 3단계 평균을 출력하자
select avg(avgheight)'가장큰키평균' from t;
 
 select * from buytbl;
 -- 요구사항 각 groupName의  price가 최저인것의 평균을 구하기
 -- 1단계 최저 구하기
 select groupName , min(price) from buytbl group by groupName;
 -- 2단계 가상테이블 만들기
 with t (avgminprice)
 as 
 (
  select min(price) from buytbl group by groupName
 ) -- 평균구하기
 select avg(avgminprice) '최저평균' from t;
 
 

 