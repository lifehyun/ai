-- stored procedure program
-- 설계 --> 인스턴스화 --> 사용
use sqldb;
-- 기본적인 형식
delimiter $$
create procedure  userProc()
begin
    select * from usertbl;
end $$
delimiter 

call userProc();

desc usertbl ; -- 테이블의 구조 보기
-- 파라미터를 넣어 처리형식
delimiter $$
create procedure  userProc1( in _addr char( 2 ) )
begin
    select * from usertbl where addr = _addr ;
end $$
delimiter 

call userProc1('서울');

-- userId BBK 또는 LJB 검색하기 
drop procedure userProc2;

delimiter $$
create procedure  userProc2( in _userId1 varchar( 10 ),  in _userId2 varchar( 10 ) )
begin
    select * from usertbl where userId in ( _userId1, _userId2 ) ;
end $$
delimiter 

call userProc2('BBK', 'LJB');

-- 파라미터 값을 내보내기
-- 서울에 사는 사람이 몇명인지 변수에 담아서 외부로 내보내기 
-- 파라미터를 넣어 처리형식

delimiter $$
create procedure  userProc3( in _addr char( 2 ), out _result int )
begin
    select count(addr) into _result  from usertbl where addr = _addr ;
end $$
delimiter ;

call userProc3('서울',  @_result );
select @_result; -- 답 4

select * from buytbl;
desc  buytbl; 
-- 문제 groupName을 입력하면  price 값이 가장 큰 것을 찾기 변수로 받기 
-- 처리 결과  입력은 전자 답은 노트북 1000
--               의류 답은 청바지  50
--               서적 답은 책     15



delimiter $$
create procedure  buyPro1( in _gN  char(4),  out _price int )
begin 
	select  max(price) into _price from buytbl where  groupName = _gN ;
end $$
delimiter ;

call buyPro1( '전자', @priceVar) ;
call buyPro1( '의류', @priceVar) ;
call buyPro1( '서적', @priceVar) ;
select @priceVar ;


delimiter $$
create procedure  buyPro2( in _gN  char(4), out _pN char(6),  out _price int )
begin 
  /* 여러개의 출력값을 얻으려면 select문을 여러개 쓰기 */ 
  select prodName into _pN from buytbl where groupName = _gN 
       group by prodName 
       order by max(price) desc limit 1;
  select  max(price) into _price from buytbl where  groupName = _gN ;
   
end $$
delimiter ;

call buyPro2( '전자', @pNVar, @priVar) ;
select @pNVar, @priVar; 

call buyPro2( '의류', @pNVar, @priVar) ;
select @pNVar, @priVar; 

call buyPro2( '서적', @pNVar, @priVar) ;
select @pNVar, @priVar; 

-- 여기 수정
select * from buytbl where groupName = '전자';
select prodName , max(price) from buytbl where groupNmae = '전자'
group by prodName
having prodName = '노트북' ;

-- 2) procedure function 함수 결과 1개 나온다 return p452
-- 주의 사항 : 사전에 해야 되는 작업 - 함수 생성권한 제한을 풀어주기
set global log_bin_trust_function_creators = 1;
-- 기본예
delimiter $$
create function userFun1( v1 int , v2 int) -- 입력을 해줄 자료형 선언
returns int -- 출력해줄 자료형 선억
begin 
	return v1 + v2;
end $$
delimiter;

select userFun1(100,200);

-- 요구사항 : 출생년도를 입력하면 나이가 생성되는 함수 만들기
delimiter $$ 
create function ageFun(birthYear int)
	returns int
begin 
	declare age int;
	set age = year(curdate()) - birthYear;
    return age;
end $$
delimiter ;

select ageFun(2000) into @age2000;
select ageFun(2000) into @age2020;
select @age2000 - @age2020;

create table cUsertbl
as 
select * from usertbl;

select * from cusertbl;

alter table cusertbl
	add column years int; -- 컬럽 추가하기

-- 요구사항 : mDate를 이용해서 근무년수를 구하는 함수를 만들기
-- 1단계 함수를 만든다
delimiter $$
create function yearsFun( y1 date) -- mDate 컬럼 입력 받기
	returns int
begin
	declare yy int ;
    set yy = year( curdate()) - year(y1);
    return yy;
end $$
delimiter ;


desc cUsertbl;
-- 2단계 함수를 호출해서 근무년수를 구한다.
select mDate into  @mDate from userTbl where userid = 'BBK';
select @mDate;

select yearsFun( @mDate ) into @years;
select @years;

-- 3단계 year 컬럽 update하기
update cUsertbl set years = @years where userid = 'BBK';

select * from cusertbl;

-- 은지원 'Ejw'  업데이트 하기
select mDate into  @mDate from userTbl where userid = 'EJW';
select @mDate;

select yearsFun( @mDate ) into @years;
select @years;

update cUsertbl set years = @years where userid = 'EJW';

select * from cusertbl;

-- 김범수 'KBS' 업데이트 하기 
select mDate into @mDate from usertbl where userid = 'KBS';
select @mDate;

select yearsFun(@mDate) into @years;
select @years;

update cUsertbl set years = @years where userid = 'KBS';


-- 'KBS' 업데이트 하기 

-- 3) cursor 반복처리 
-- 포인터 : 가르키다. 자동으로 한행을 읽으면 아래(다음)로 내려 간다
-- 파일 시작 BOF :  begin of file  , 파일 끝 EOF : End of file 
-- 처리 순서 1단계 파일을 연다 , 2단계 파일을 읽는다 행단위로 읽는다 , 3단계 파일 끝 , 4단계 닫는다

/* 커서 형식 p459쪽 
1 delimiter $$  짝궁
2 create procedure cursorProc() 혼자
3 begin 짝궁
-- 변수 선언 6줄 ~ 10줄
-- 커서 선언 12줄
-- 반복 조건 15줄
-- 커서 열기 18줄
-- 반복문 20줄
-- 결과출력 31줄
3 end $$ 짝궁
1 delimiter ; 짝궁
*/

-- 고객의 평균키를 구하는 프로시저 커서 이용하기

delimiter $$   -- 설계만 한것
create procedure cursorProc() 
begin 
-- 변수 선언 6줄 ~ 10줄
	declare userHeight int; -- 고객의 키
    declare cnt int default 0; -- 고객의 인숸수
    declare totalHeight int default 0; -- 키의 합계
    declare endOfRow boolean default false; 
-- 커서 선언 12줄
	declare userCursor cursor for	-- userCursor 커서명
		select height from usertbl; -- 문제가 평균키를 구하기 
-- 반복 조건 15줄
	declare continue handler
		for not found set endOfRow = true;
-- 커서 열기 18줄
	open userCursor;
-- 반복문 20줄
	cursor_loop : Loop
		fetch userCursor into userHeight;
        if endOfRow then 
			leave cursor_loop;
		end if;
        set cnt = cnt + 1 ; -- 1개씩 증가해라.
        set totalHeight = totalHeight + userHeight;
    end loop cursor_loop;
-- 결과출력 31줄
	select concat('고객 키의 평균 ==>' , (totalHeight / cnt));
-- 커서 닫기 
	close userCursor;
end $$ 
delimiter ; 

-- procedures 호출하기 : call
call cursorProc();

-- 고객테이블 고객등급 열을 하나 추가하기 등급 넣기
select * from usertbl;

-- 테이블 생성하기
create table rankut
as
select * from usertbl;

-- 테이블 컬럼 추가하기 r1 안에 최우수고객/우수고객/일반고객/유령고객
alter table usertbl
 add column r1 varchar(20);
 
select * from buytbl order by userid;

drop procedure gp;

delimiter $$
create procedure gP() 
begin
declare id varchar(10); 
declare hap bigint; 
declare userGrade varchar(20); 
declare endOfRow  boolean default FALSE;
declare userCursor cursor for select u.userid , sum( b.price * b.amount) from buytbl b right outer join usertbl u on b.userid = u.userid group by u.userid , u.name;
declare continue handler for not found set endOfRow = TRUE;
open userCursor;
grade_loop: Loop
	fetch userCursor into id , hap;
    if endOfRow then
		leave grand_loop;
	end if;
        case 
			when( hap >= 1500) then set userGrade = '최우수고객';
			when( hap >= 1000) then set userGrade = '우수고객';
			when( hap >= 1) then set userGrade = '일반고객';
			else set userGrade =  '잠재고객';
		end case;
		update usertbl set r1 = userGrade where userid = id; 
		end Loop grade_loop;
		close userCursor;
end $$
delimiter ; 

call gP();

select * from usertbl;


create database if not exists testdb;
use testdb;

create table if not exists testtbl (id int, text varchar(10));
insert into testtbl values(1, '레드벨벳');
insert into testtbl values(2, '잇지');
insert into testtbl values(3, '블랙핑크');

select * from testtbl;

drop trigger if exists testtrg;

delimiter //
create trigger testtrg after delete on testtbl for each row
begin
set @msg = '가수 그룹이 삭제됩니다';
end //
delimiter ;

set @msg = '';
insert into testtbl values(4, '마마무');
select @msg;
delete from testtbl where id = 4;
update testtbl set text='마마마무' where id =4;
select @msg;

use sqldb;
create table backup_userTbl 
 (
  userID     CHAR(8) NOT NULL PRIMARY KEY, -- 사용자 아이디(PK)
  name       VARCHAR(10) NOT NULL, -- 이름
  birthYear   INT NOT NULL,  -- 출생년도
  addr        CHAR(2) NOT NULL, -- 지역(경기,서울,경남 식으로 2글자만입력)
  mobile1   CHAR(3), -- 휴대폰의 국번(011, 016, 017, 018, 019, 010 등)
  mobile2   CHAR(8), -- 휴대폰의 나머지 전화번호(하이픈제외)
  height       SMALLINT,  -- 키
  mDate       DATE,  -- 회원 가입일
  modType char(2), -- 변경된 타입, '수정' 또는 '삭제'
  modDate date, -- 변경된 날짜
  modUser varchar(256) -- 변경한 사용자 
 ) ;
 
 -- 트리거 작성하기
 delimiter //
 create trigger but 
	after update 
    on usertbl
	for each row
 begin
 insert into backup_userTbl
 values(OLD.userid, OLD.name, OLD.birthyear, OLD.addr,
		OLD.mobile1, OLD.mobile2, OLD.height, OLD.mdate,
        '수정', now(), current_user());
 end//
 delimiter ;
 
 select * from usertbl;
 update usertbl set birthYear = 1977 where userid = 'BBK';
 update usertbl set addr = '서울' where userid = 'EJW';
 
select * from backup_usertbl;
  
 