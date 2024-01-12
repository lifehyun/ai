select * from usertbl ;
select * from buytbl ;

select *  from usertbl 
   inner join  buytbl
   on usertbl.userid = buytbl.userid ; 
 
select usertbl.name, buytbl.prodName  from usertbl 
   inner join  buytbl
   on usertbl.userid = buytbl.userid 
where  birthyear  between 1970 and 1980 ;   
   
select usertbl.name, buytbl.prodName  from usertbl 
   inner join  buytbl
   on usertbl.userid = buytbl.userid 
where  birthyear  between 1970 and 1980 order by usertbl.name limit 3 ;  

-- select usertbl.name, buytbl.prodName  from usertbl 
--                    5                        1
--    inner join  buytbl
--                  2
--    on usertbl.userid = buytbl.userid 
--                     3
-- where  birthyear  between 1970 and 1980 
--                      4
-- order by usertbl.name
--              6
-- limit 3 ; 
--     7

select u.name, b.prodName  from usertbl u
   inner join  buytbl b
   on u.userid = b.userid 
where  b.userid='BBK'; 

-- 282 
create table stdTbl(
   stdName varchar(10) not null primary key,
   addr char(4) not null
);
create table clubTbl(
   clubName varchar(10) not null primary key,
   roomNo char(4) not null
);
create table stdclubTbl (
   num int auto_increment not null primary key,
   stdName varchar(10) not null,
   clubName varchar(10) not null,
   foreign key(stdName) references stdTbl(stdName),
   foreign key(clubName) references clubTbl(clubName)
);
insert into stdTbl
values
( '김범수','경남'), ('성시경','서울'), ('조용필','경기'),('은지원','경북'), ('바비킴','서울') ; 

insert into clubTbl
values
( '수영','101호'), ('바둑','102호'), ('축구','103호'),('봉사','104호') ; 

insert into stdclubTbl
values
( null, '김범수','바둑'), (null,'김범수','축구'),
(null,'조용필','축구'),(null,'은지원','축구'),
(null, '은지원','봉사'), (null, '바비킴','봉사') ; 

select * from stdTbl;
select * from clubTbl;
select * from stdclubTbl;

-- 1. 요구사항 학생테이블, 동아리테이블, 학생동아리 테이블을 이용하여 
-- 학생을 기준으로 학생이름, 지역, 가입한 동아리, 동아리방 보기
select  s.stdName, s.addr, c.clubName, c.roomNo
from stdTbl  s  
  inner join stdclubtbl  sc
  on s.stdName = sc.stdName
  inner join clubtbl c
  on sc.clubName = c.clubName ;

-- 2. 요구사항 학생테이블, 동아리테이블, 학생동아리 테이블을 이용하여 
-- 축구를 선택하신 분의 이름과 지역은? 김범수 경남, 조용필 경기, 은지원 경북
select 
    s.stdName, s.addr
from stdtbl s
    inner join stdclubTbl sc 
    on s.stdName = sc.stdName
    inner join clubtbl c
    on sc.clubName = c.clubName
where sc.clubName='축구' ;     

-- 3. 요구사항 학생테이블, 동아리테이블, 학생동아리 테이블을 이용하여 
-- 은지원이 선택한 동아리와 동아리방은? 축구 103호 봉사 104호 

select 
    c.clubName, c.roomNo
from stdtbl s
    inner join stdclubTbl sc 
    on s.stdName = sc.stdName
    inner join clubtbl c
    on sc.clubName = c.clubName
where sc.stdName='은지원' ; 

-- 4. 요구사항 학생테이블, 동아리테이블, 학생동아리 테이블을 이용하여 
-- 서울 지역에 사는 사람이 선택한 동아리명은? 답은  바비킴 봉사  성시경 null -- inner join 구할 수 없다
select 
    s.stdName, sc.clubName
from stdtbl s
    inner join stdclubTbl sc 
    on s.stdName = sc.stdName
    inner join clubtbl c
    on sc.clubName = c.clubName
where s.addr='서울' ; 

-- 5. 요구사항 동아리방 101호와 102호를 사용하는 사람들의 이름을 구하기 
-- 답은  102호 김범수    단, 101호 null 출력되지 않는다 왜? null 이니깐

select 
    c.roomNo,  s.stdName
from stdtbl s
    inner join stdclubTbl sc 
    on s.stdName = sc.stdName
    inner join clubtbl c
    on sc.clubName = c.clubName
where c.roomNo in ( '101호', '102호' ) ; 

-- outer join 
-- 조인에 만족하지 않는 행까지 포함하기 null까지 포함하기
select  
   *
from stdTbl s
  left outer join stdclubTbl sc
  on s.stdName = sc.stdName ; 
  
select  
   *
from stdclubTbl sc
  right outer join clubtbl c
  on sc.clubName = c.clubName ;  

select  
   *
from stdtbl s
   left outer join stdclubtbl sc 
   on s.stdName = sc.stdName 
   left outer join clubtbl c 
   on sc.clubName = c.clubName 

union   

select  
   *
from stdtbl s
   left outer join stdclubtbl sc 
   on s.stdName = sc.stdName 
   right outer join clubtbl c 
   on sc.clubName = c.clubName;
      
-- 4. 요구사항 학생테이블, 동아리테이블, 학생동아리 테이블을 이용하여 
-- 서울 지역에 사는 사람이 선택한 동아리명은? 답은  바비킴 봉사  성시경 null 
select 
    s.stdName, sc.clubName
from stdtbl s
    left outer join stdclubTbl sc 
    on s.stdName = sc.stdName
    left outer join clubtbl c
    on sc.clubName = c.clubName
where s.addr='서울' ;   

-- 5. 요구사항 동아리방 101호와 102호를 사용하는 사람들의 이름을 구하기 
-- 답은  102호 김범수  101호 null 

select 
    c.roomNo,  s.stdName
from stdtbl s
    left outer join stdclubTbl sc 
    on s.stdName = sc.stdName
    right outer join clubtbl c
    on sc.clubName = c.clubName
where c.roomNo in ( '101호', '102호' ) ; 

-- cross join 비강추
select *  from stdtbl s , stdclubtbl sc , clubtbl c ;
  
select * from stdtbl s
    cross join stdclubtbl sc ;
    

-- self 조인 ----------------------
create table empTbl(
   emp char(3), 
   manager char(3), 
   empTel varchar(8) );

INSERT INTO empTbl VALUES('나사장',NULL,'0000');
INSERT INTO empTbl VALUES('김재무','나사장','2222');
INSERT INTO empTbl VALUES('김부장','김재무','2222-1');
INSERT INTO empTbl VALUES('이부장','김재무','2222-2');
INSERT INTO empTbl VALUES('우대리','이부장','2222-2-1');
INSERT INTO empTbl VALUES('지사원','이부장','2222-2-2');
INSERT INTO empTbl VALUES('이영업','나사장','1111');
INSERT INTO empTbl VALUES('한과장','이영업','1111-1');
INSERT INTO empTbl VALUES('최정보','나사장','3333');
INSERT INTO empTbl VALUES('윤차장','최정보','3333-1');
INSERT INTO empTbl VALUES('이주임','윤차장','3333-1-1');

select * from empTbl;

-- 우대리 상관의 연락처  답 '2222-2'
 select 
   e1.empTel
 from emptbl e
    inner join  emptbl e1
    on e.manager = e1.emp 
where e.emp = '우대리' ;   

 -- 이주임 매니저의 매니저는? 최정보
 select 
   e1.manager
 from emptbl e
    inner join  emptbl e1
    on e.manager = e1.emp 
where e.emp = '이주임' ;   
 
 -- 이주임 매니저의 매니저의 전화번호 ? 3333 
 -- self join을 2단계 한다.
 -- 찾으려는 정보를 1줄(행)에 모두 만들어 두고 검색 해야된다.
select 
    * 
 from emptbl e
    inner join  emptbl e1
    on e.manager = e1.emp 
    inner join  emptbl e2
    on e1.manager = e2.emp ;
    
select 
    e2.empTel  
 from emptbl e
    inner join  emptbl e1
    on e.manager = e1.emp 
    inner join  emptbl e2
    on e1.manager = e2.emp 
where  e.emp = '이주임'    ;    