-- p238쪽
-- 동영상 , 소리 , 그림 : 2진수(BLOB)로 저장한다.
-- 날짜형 : 'YYYY-MM-DD'형식으로 저장한다 

-- cast함수: 형변환해주는 함수이다
-- cast ( as 자료형)으로 바꿔주면된다
select cast('2020-10-19 12:35:29:123' as date);
select cast('2020-10-19 12:35:29:123' as time);
select cast('2020-10-19 12:35:29:123' as datetime);

-- 변수 사용시 : set @변수 
set @val1 = 10;
set @val2 = '제품판매처 : 삼성';
select @val2 , @val1 ;
select @val2 , prodName from buytbl;

-- 데이터 형 변환 cast() , convert()
select * from buytbl;
-- buytbl에서 amout의 평균을 구하라
select avg(amount) from buytbl;
-- 실수형을 정수형으로 변환하기
-- 방법 1 cast
select cast(avg(amount)as signed integer) from buytbl;
-- 방법 2 convert
select convert(avg(amount) , signed integer ) from buytbl;

-- 정수형을 실수형으로 변환하기
set @var3 = 3;
select cast( @var3 as float);
select convert( @var3 , float);

-- 정수형을 문자로 변환하기
select cast( @var3 as character);
select convert( @var3 , character);

-- p246 
select '100' + '200' ;
select concat('100'+'200');
select concat(100,'200');
-- mega는 앞에 붙은 숫자로 비교한다
select 1 > '2mega' ; -- 거짓이라 0
select 3 > '2mega' ; -- 참이라 1
select 0 = 'mega0' ; -- 문자는 0으로 바뀌므로 0 = 0

-- if 함수 
-- select if ( 참 , 조건 , 거짓)
set @v1 = 200;
set @v2 = 20;
set @v3 = 100;

-- 가장 큰 수 구하기 답 200
select if( @v1 > @v2 , if(@v1 > @v3 , @v1 , @v3) ,if(@v2 > @v3 , @v2 , @v3) );
-- 가장 작은 수 구하기 답 20;
select if( @v1 < @v2 , if(@vi < @v3 , @v1 , @v3) ,if(@v2 < @v3 , @v2 , @v3) );
-- 중간수 구하기 @v1이 중간이라고 생각하고 만든다
select if( @v1 < @v2 , if( @v1 > @v3, @v1 , @v3) ,if(@v2 > @v3 , @v2 , @v3));

-- ifnull (수식1 , 수식2)
-- null이면 뒤로 넘기고 , null이 아니면 본인께 나온다
select ifnull(null , 100);
select ifnull(200 , null);
select ifnull(200 , 300);
select ifnull(null , ifnull(null , 300));

-- nullif (수식1 , 수식2) 
select nullif(100,100); -- 두개가 같으면 null을 반환한다
select nullif(200,100); -- 두개가 다르면 앞에 값을 반환한다.

-- case when else end
set @v1 = 1;
select case @v1
	when 1 then '일'
    when 2 then '이'
    when 3 then '삼'
    else '1,2,3이 아님'
end as 'case 연습';

-- 자바식
-- switch @v1 {
-- 	case 1 : print("일"); break;
--     case 2 : print("이"); break;
--     case 3 : print("삼"); break;
--     defalut : print ("1,2,3,이 아님");
-- }

select * from buytbl;
-- userid가 kbs  김범수 , jyp 조용필 , 나머지는 '모름'
select case userid
	   when 'KBS' then '김범수'
       when 'JYP' then '조용필'
       else '모름'
	end as '이름',
	userid
from buytbl;

-- 문자열 함수 
-- concat()
-- concat_ws(구분자 , 문자열1 , 문자열2)
select concat(',','100','200');
select elt(1,'하나','둘','셋'); -- 첫번째에 있는걸 찾아준다
select field('김','이','박','최','김'); -- 처음 위치의 '김'있는 김이 어디에 있는지 찾기
select find_in_set('김','이,박,최,김,송');
select instr('이,박,최,김,승','김');
select locate('김','이,박,최,김,송');

select format(123456.123456,4); 
select  hex(10),oct(8),bin(15); -- 진법변환을 보는것이다

select insert('abcdefghi',3,4,'0000'); -- 3번째 인덱스부터 4개만큼을 바꿔준다.
select trim('		abc   ');
select substring('대한민국만세' , 3 , 2);

select substring_index('cafe.naver.com.co.kr','.',-2);
set @v = 'cafe.naver.com.co.kr';
set @v2 = substring_index(@v,'.',4);
select @v2; -- cafe.naver.com.co 

-- 요구사항 com
-- 1단계 com.co 만들기
set @v3 = substring_index(@v2,'.',-2);
select @v3;
-- 2단계 
set @v4 = substring_index(@v3,'.',1);
select @v4;

-- 요구사항 b를 출력하기
set @v5 = 'a,b,c,d,e';
set @v6 = substring_index(@v5,',',2);
set @v7 = substring_index(@v6,',',2);
set @v8 = substring_index(@v7,',',-1);
select @v7;
select @v8;

-- 숫자 함수 
select ceiling(4.1), floor(4.7) , round(4.7);
select pow(2,10);

-- 기억 공간 단위
-- bit < 8 bit = 1 byte < 1024 byte = 1kb < 1024kb = 1 megaByte < 1024mb = 1gb
-- 1024 gb = 1tb (terabye) < 1024tb = 1hb(hera byte)

select rand(), floor( 1 + (rand() * (7-1) ) );

-- 1,235,456,577 천원이하 절삭 
select truncate(1235456577,-3);

-- 날짜 , 시간 함수
select adddate( mdate, interval 31 day)from usertbl;

select date( now() ) , time(now()) , now();
select sysdate();

-- p261 대용량 파일 처리하기 : 파일 올리고(업로드) 내리기(다운로드)
create database moviedb;
use moviedb;
create table movietbl
 ( movie_id int,
   movie_title varchar(30),
   movie_director varchar(20),
   movie_star varchar(20),
   movie_script longtext, -- 대본 
   movie_film longblob ) default charset=utf8mb4;
   
   insert into movietbl 
   values ( 1 , '쉰들러리스트','스필버그','리암니슨',
			load_file('D:/AI/Temp/movies/Schindler.txt'),
            load_file('D:/AI/Temp/movies/Schindler.mp4')
            );

select * from movietbl;

-- null이 출력된 이유 : movie_ script , film은 용량이 커서 안올라간다 
show variables like 'max_allowed_packet'; -- 저장할수있는 패킷의 크기를 볼수 있다.
show variables like 'secure_file_priv';	  -- mysql이 지정한 업로드 경로를 볼수 있다.

 truncate movietbl;
 insert into movietbl values (1, '쉰들러 리스트', '스필버그','리암니슨', load_file('D:/AI/Temp/movies/Schindler.txt'),
 load_file('D:/AI/Temp/movies/Schindler.mp4') );

 use movi
edb;
 select * from movietbl;

