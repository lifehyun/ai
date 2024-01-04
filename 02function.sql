SELECT 24*60 as 계산 FROM dual;

--오라클이 제공하는 기본모듈
--용도는 계산용이다
SELECT * FROM dual;

SELECT sign(10) FROM dual;
SELECT round(3.456, 2) FROM dual;   --round:소수점 2째자리까지 반올림하세요
SELECT trunc(3.4567, -1) FROM dual;  --trunc :마이너스이면 소수점자리에서 앞으로 . 기준으로 잘라주는 함수
SELECT trunc(5354.4567, 2) FROM dual;      -- 양수이면 소수점 뒤로가서 잘라주는 함수
SELECT mod(25,4)FROM dual;  --mod: 나누기함수


SELECT * FROM student;

 --upper:대문자로 보여주는 함수
 --lower:소문자로 보여주는 함수
SELECT upper(stu_email) FROM student;  
SELECT lower(stu_email) , initcap(stu_email) , upper(stu_email)  FROM student;  

--length 인덱스의 길이를 알려주는 함수
--lengthb 인덱스의 바이트수를 알려주는 함수
SELECT length('oracle'), length('오라클') FROM dual;
SELECT lengthb('oracle'), lengthb('오라클') FROM dual;

--substr( 대상 , 시작위치 , 추출할 갯수)
SELECT substr('Welcome to Oracle', 9,2 ) FROM dual;

--문종헌의 이메일이 앞부분을 추출하기 결과 : moon
SELECT substr(stu_email , 1 , 4) FROM student WHERE stu_name = '문종헌';

--stu_id가 101~110까지의 사람들의 이메일 맨 뒷부분 즉 com을 추출하기
SELECT substr(stu_email,-3,3) FROM student WHERE stu_id between 101 and 110 ;

--stu_id가 110~116 까지의 사람들의 이메일 맨 뒷부분 즉 nate을 추출하기
SELECT substr(stu_email,-8,4) FROM student WHERE stu_id between 110 and 116 ;

--instr(대상,찾는문자) 대상에서 찾는문자의 위치를 숫자로 반환함
SELECT instr('Welcome to Oracle','e')FROM dual; --제일 앞에부터 'e'를 찾아 준다. 2번째에 있다

--instr(대상,찾는문자) 대상에서 찾는문자의 위치를 숫자로 반환함
SELECT instr('Welcome to Oracle','e',3)FROM dual; --시작위치부터 'e'를 찾아 준다. 7번째에 있다

--instr(대상,찾는문자) 대상에서 찾는문자의 위치를 숫자로 반환함
SELECT instr('Welcome to Oracle','e',3,2)FROM dual; --시작위치부터'e'를 찾는데 2번째 발견한것. 17번쨰 있다

SELECT * FROM student;
-- 모든학생의 이메일에서 골뱅이 위치를 알아보기
SELECT instr(stu_email,'@') FROM student;

--모든학생의 id를 구하기 결과 moon five again cook,
SELECT substr(stu_email,1 , instr(stu_email, '@')-1) id FROM student ; 

--PAD : 남은자리 만큼 채워야할때 사용한다
--LPAD : left padding
--RPAD : right padding

SELECT lpad('Oracle',20,'#') FROM dual;
SELECT rpad('Oracle',20,'#') FROM dual;

SELECT lpad('Oracle',20,'#') FROM dual;
SELECT rpad('Oracle',20,'#') FROM dual;

SELECT * FROM emp;
SELECT lpad(job,10,'_') FROM emp;


--3.형변환함수
-- 숫자가 문자로 되는것 1 --> '1' , 문자가 숫자로 되는것 '1' --> 1 ,  01/04 --> 

--현재시간을 구해주는 함수 : sysdate
SELECT sysdate FROM dual;

SELECT sysdate, to_char(sysdate, 'YYYY-MM-DD DAY') FROM dual;
SELECT * FROM emp;
SELECT hiredate , to_char(hiredate, 'yyyy-mm-dd dy') FROM emp;


--숫자형을 문자로 변환하기
SELECT to_char(12345678,'000,000,000')FROM dual;--012,345,678 
SELECT to_char(12345678,'000,000')FROM dual;--자리가 모자르면 #으로채운다

SELECT to_char(12345678,'999,999,999')FROM dual;--공백12,,345,678
SELECT to_char(12345678,'999,999')FROM dual;--자리가 모자르면 #으로채운다

SELECT to_char(12345678,'L999,999,999')FROM dual;--통화기호12,,345,678

--to_date() 날짜형으로 바꾸기 
--오라클에서 기본날짜형은 'mm/dd/yy'
--to_date('문자','형식') 문자가 형식으로 바뀌어서 날짜형이 된다
SELECT * FROM emp;
--SELECT * FROM emp WHERE hirdate = 20070402; 에러발생 : 숫자가 아니라서 
--숫자를 문자형으로 바꾸기
SELECT * FROM emp WHERE hiredate = to_date(20070402,'yyyymmdd');
--문자를 숫자형으로 바꾸기
SELECT * FROM emp WHERE hiredate = to_date('20070402','yyyymmdd');

--오늘날짜에서 특정일이 얼마나 지났는지를 구해라
--SELECT sysdate - '2023/10/02' FROM dual; 
SELECT trunc(sysdate - to_date(20231002 ,'yyyymmdd') , 0)FROM dual;

SELECT * FROM emp;
--안성기씨의 입사일 - 김사랑씨의 입사일 구해라
SELECT to_date('20070321','yyyymmdd') - to_date('20070310','yyyymmdd') FROM dual;

--to_number(',가 있는숫자' , '형식')
SELECT to_number('20,000','99,999') - to_number('10,000','99,999') FROM dual;

SELECT '20000' - '10000' FROM dual;

--날짜함수
SELECT sysdate - 2 엊그제 FROM dual; --이틀전
SELECT sysdate + 2 내일모래 FROM dual; --이틀후

SELECT sysdate -1 어제 , sysdate 오늘 , sysdate +1 내일 FROM dual;
SELECT to_char(sysdate -1 , 'yyyy-mm-dd day' ) 어제, sysdate 오늘 , sysdate +1 내일 FROM dual;

--months_between
SELECT months_between( sysdate, '2023/12/04') FROM dual;
SELECT add_months('2023/10/01',10) FROM dual;
SELECT round(to_date('20/07/17', 'yy/mm/dd'),'month')FROM dual; 

SELECT hiredate,trunc(hiredate,'month') FROM emp; --입사일을 달로 잘라서 , 일을 모두 01로 고치기

SELECT * FROM emp;

--근무년수 , 근무달수 
--오늘날짜 - 입사일 년수 달수
SELECT ename , sysdate , hiredate FROM emp;

SELECT ename 사원명 , sysdate 현재일 , hiredate 입사일, months_between(sysdate , hiredate) 근무달수  FROM emp;
-- SELECT ename 사원명 , sysdate 현재일 , hiredate 입사일, years_between(sysdate , hiredate) 근무달수  FROM emp;
-- years_between() 할수는 없다. 그러면 month_between()으로 근무달 수를 구한후 /12로나누기
SELECT ename 사원명, sysdate 현재일 , hiredate 입사일, trunc(months_between(sysdate, hiredate)/12,0) 근무년수 FROM emp;

--출력형식 입사일 현재날짜 근속년 근속원 근속일
SELECT  hiredate 입사일 , sysdate 현재날짜 , trunc(months_between(sysdate, hiredate)/12,0) 근무년수 ,
        trunc(months_between(sysdate, hiredate),0) 근무월수,
        trunc(months_between(sysdate, hiredate),0) * 30 근무일수
FROM emp;

--오늘 날짜를 기준으로 최초로 도래하는 수요일의 날짜는?
SELECT to_char(next_day(sysdate,'수'),'yyyy/mm/dd') FROM dual; 

SELECT last_day('24/01/01') FROM dual;

SELECT * FROM emp;

--급여를 주는날이 그달의 마지막달이다
SELECT ename 사원번호, last_day(sysdate)급여일 FROM emp;

SELECT * FROM emp;

-- nvl(comm,0) 
SELECT comm,nvl(comm,0) FROM emp;

SELECT * FROM emp WHERE hiredate is null; --입사일이 null인사람을 보여주세요

--입사일이 null이면 오늘날짜 넣어주기 
SELECT hiredate,nvl(hiredate,sysdate) FROM emp WHERE hiredate is null;
SELECT hiredate,nvl(hiredate,sysdate) FROM emp;


--이름이 null 이면 '무명' , job이 null이면 '사원'
SELECT ename,nvl(ename,'무명') ,nvl(job,'사원') FROM emp;

-- insert 19 , 20
insert into emp values(1019,null,'대리',1003,sysdate,null,null,20); 
insert into emp values(1020,null,'대리',1003,sysdate,null,100,20); 


SELECT comm,sal,coalesce(comm,sal,0) FROM emp;

--선택을 위한 decode함수(switch ~case문과 비슷함)
/*decode(표현식,조건1,결과1,
                조건2,결과2,
                조건3,결과3,
                기본결과n
*/               

--예)deptno가 10이면 '경리부' , 20이면 인사부 30이면 영업부 40이면 전산부로 출력하기
SELECT * FROM emp;
SELECT deptno , decode ( deptno, 10, '경리부',
                                 20, '인사부',
                                 30, '영업부',
                                 40, '전산부')
FROM
emp;

SELECT * FROM student;
--sex가 'M'남자 , 'F;여자
SELECT sex, decode ( sex, 'M','남자',
                           'F','여자')
FROM
student;

--그룹함수 
--단일행 함수와 그룹함수는 같이 쓸수없다
SELECT count(ename) FROM emp; -- 20행 입력 행출력  : 그룹함수
SELECT ename FROM emp; --20행 입력 20행 출력 : 단일행 함수
-- SELECT ename,count(ename) from emp ; 출력행이 갯수가 달라서 같이 쓸수 없다.

SELECT sum(sal) FROM emp;
SELECT sum(sal), count(ename), avg(sal), max(sal), min(sal) FROM emp;
--그룸함수에서 sum,count에서 null연산에서 제외

--보너스 를 받는 사원수는?
SELECT count(comm) FROM emp;

--직위종류의 수는?
--직위종류
SELECT distinct job FROM emp;

SELECT * FROM emp;

SELECT * FROM emp ORDER BY deptno;

--group by: 그룹별로 묶어준다 
-- 각부서별로 제일 높은 급여 출력하기
SELECT deptno , max(sal) FROM emp group by deptno ORDER BY deptno;

-- job별로 급여가 제일 낮은 급여 출력하기
SELECT job, min(sal) FROM emp group by job ORDER BY job;

-- job별로 급여 평균 출력하기
SELECT job, avg(sal) FROM emp group by job ORDER BY job ;


-- 사원이거나 대리이거나 과장의 급여 합계를 구하세요.
--1단계 사원,대리,과장으로 출력하기
SELECT * FROM emp WHERE job in('사원','대리','과장');
--2단계 그룹으로 지정하기
SELECT job, round(avg(sal)) FROM emp WHERE job in('사원','대리','과장') group by job;

--최대급여가 700을 초과하는 부서에 대해서 최대급여와 최소급여를 구하기
--결과 20 1000 300
--1단계 부서별 최대급여 구하기
SELECT deptno, max(sal) FROM emp group by deptno;
--2단계 최대 급여가 700이 넘는것은? 그룹함수의 조건
SELECT deptno, max(sal) FROM emp group by deptno having max(sal) > 700;

--직급별로 급여의 평균이 500이상인 직급,급여평균,부서명을 출력하기
--1단계 직급별 그룹하기
SELECT job,avg(sal) FROM emp group by job;
--2단게 급여의 평균이 500이상인지 출력하기
SELECT job,avg(sal) FROM emp group by job having avg(sal) >= 500;
--3단계 평균급여 오름차순으로 출력하기
SELECT job,avg(sal) FROM emp group by job having avg(sal) >= 500 order by avg(sal) asc;


SELECT * FROM student;
--최대나이
SELECT max(age) FROM student;

--최소나이 
SELECT min(age) FROM student;

--평균나이
SELECT avg(age) FROM student;

--남자 최대나이 , 여자 최대나이 
SELECT sex, max(age) FROM student group by sex;

--cou_id별로 평균나이 구하기
SELECT cou_id,avg(age) FROM student group by cou_id;

--cou_id별로 평균나이가 25세이상인 커스와 평균나이 구하기

SELECT cou_id,avg(age) FROM student  group by cou_id having avg(age) >= 25;

--남자인 경우 cou_id 별로 평균 나이가 25세 이상인 코스와 평균 나이 오름차순으로 구하기
--1단계 남자만 출력하기
SELECT * From student WHERE sex = 'M';
--2단계 남자인 경우 cou_id 별로 그룹
SELECT avg(age),cou_id FROM student WHERE sex = 'M' group by cou_id;
--3단계 남자인 경우 cou_id 별로 평균 나이가 25세 이상인 코스와 평균나이 
select avg(age), cou_id FROM student WHERE sex ='M'group by cou_id having avg( age ) >= 25 ;
--4단계 남자인 경우 cou_id 별로 평균 나이가 25세 이상인 코스와 평균나이 오름차순으로 구하기 
select avg(age), cou_id FROM student where sex ='M'group by cou_id having avg( age ) >= 25  order by avg( age ) ;
