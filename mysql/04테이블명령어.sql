-- dept 테이블에 데이터 넣기
-- insert into 해서 직접 추가하는 방법 1 , 또는 ctrl + enter해서 Result grid안에 데이터 넣기
insert into dept( deptno, dname , loc) values(10,'경리부','서울');
insert into dept( deptno, dname , loc) values(20,'영업부','경기');

select * from dept;

-- 40번에 전산부를 충북이아닌 서울로 변경해라 
update dept set loc = '서울' where deptno = 40;
-- 방금 바꾼 서울을 충북으로 다시 변경해라
rollback;

-- 30번에 총무부를 해외부로 변경해라
update dept set dname = '해외부' where dname = '총무부';

-- 40번을 삭제하기
delete from dept where deptno = 40;