SELECT*FROM  emp;
SELECT*FROM Student;
SELECT*FROM dept;
SELECT dname FROM dept;

SELECT empno, ename, sal, job FROM emp;
/* 여러줄 주석 */
-- 한줄 주석
-- stu_id stu_name,sex 컬럼만 검색하기,대소문 구분이 없음
SELECT stu_id ,stu_name,sex FROM student;

--산술연산자
SELECT empno, ename, sal*12, job FROM emp;
SELECT empno, ename, sal*12, sal*12.033, job FROM emp;
--컬럼명[as]:별칭이다
SELECT empno as 사원번호, ename as 사원명, sal as 급여 ,sal*12 as 연봉 , sal*12.033 as 연세금 , job as 직급 FROM emp;
--[as]를 생략할수 있다
SELECT empno 사원번호, ename 사원명, sal 급여 ,sal*12 연봉 , sal*12.033 연세금 , job 직급 FROM emp;

SELECT * FROM salgrade;
--산술연산자 Hisal + 1000 Losal+ 1500 더하기해서 출력하기
SELECT grade, losal, losal + 1500 , hisal, hisal + 1000 FROM salgrade;

--별칭을 붙히세요 as를 써도 되고 안써도된다
--별칭안에 띄어쓰기를 하고 싶으면 ""를해서 사용하면된다
--등급,최저금액,인상최저금액,최대금액,인상최대금액
SELECT grade as 등급 , losal as 최저금액, losal + 1500 as 인상최저금액 , hisal as 최대금액, hisal + 1000 as 인상최대금액 FROM salgrade;

--null이란? 0이 아님, 빈공간이 아니다 , 미확정 , 알수없는 의미 , 어떤값인지 아직 모른다 , 연산할수 없다
SELECT * FROM emp;

--COMM 보너스를  + 100만원씩 지급하자
SELECT comm, comm + 100 FROM emp; --null인 컬럼은  + 100이 안되고 null로 나타난다.
SELECT comm, nvl(comm ,0) + 100 "보 너 스" FROM emp; --nvl(comm,0) null이면 0으로 출력 , null이 아니면 comm 값으로 출력

--문자열 연결:||로 해주면된다
SELECT ename || '의 직급은' || job || '입니다'  직급 FROM emp;

-- student에서 자료를 가져온다
SELECT * FROM student;
--문종헌의 나이는 24살입니다
SELECT stu_name || '의 나이는' || age || '입니다' 나이 FROM student;

--중복제거하기 하는 함수 : distinct
-- 전체코스는 무엇인가요? 
SELECT distinct cou_id FROM student;

SELECT * FROM emp;
--부서명(deptno)의 종류는 (중복제거하기)
SELECT distinct deptno FROM emp;

--특정조건의 데이터만 조회하는것만 보여주는 함수 : where

--부서명이 20인 사원들만 보고싶다
SELECT * FROM emp WHERE deptno = 20; 
--JOB이 사원인 사람만 보고싶다
SELECT * FROM emp WHERE job = '사원' or job = '과장';
--sal이 400만원 이상인 사람만 보고싶다
SELECT empno 사원번호, ename 이름, sal 급여 FROM emp WHERE sal >= 400; 
--sal이 400만원 이상이고 job이 부장인 사람의 사원번호,이름,직급,급여보기
SELECT empno 사원번호, ename 이름, sal 급여 FROM emp WHERE sal >=400 AND job = '부장';

SELECT * FROM emp;
--Hiredate 입사인
--입사일이 2005/01/01 이전에 입사한 사람
SELECT * FROM emp WHERE hiredate < '05/01/01';

--입사일이 2005/01/01 이후에 입사한 사람
SELECT * FROM emp WHERE hiredate > '05/01/01';

--입사일이 2006/01/01 ~ 2007/12/31 사이에 입사한 사람
SELECT * FROM emp WHERE '06/01/01' <= hiredate AND  hiredate <= '07/12/31';

-- 유사하게 일치하다라는 함수: like % 

--이씨 성을 가진 사람만
SELECT * FROM emp WHERE ename like '이%'; 

--이씨성 또는 오씨성 가진 사람만
SELECT * FROM emp WHERE ename like '이%' OR ename like '오%';

-- 아닌것 : not 

--이씨 성이 아닌사람
SELECT * FROM emp WHERE not ename like '이%';
SELECT * FROM emp WHERE ename not like '이%';

--이름 중간 글씨가 '동'자가 들어가는 사람
SELECT * FROM emp WHERE ename like '%동%';

--이름 마지막 글씨가 기인 사람
SELECT * FROM emp WHERE ename like '%%기';

--in ~안에
--job 사원이거나 과장이거나 부장인 사람 출력하기
SELECT * FROM emp WHERE job = '사원' or job = '과장' or job ='부장';
SELECT * FROM emp WHERE job in('사원','과장','부장');

--컬럼명 between 시작수 and 끝수  시작수~끝수 사이
--300 <= sal <= 600 사이인 사람 출력하기
SELECT * FROM emp WHERE sal between 300 and 600;

--입사일 2006/01/01~ 2007/12/31 사이에 입사한 사람
SELECT * FROM emp WHERE '06/01/01' <= hiredate and hiredate <= '07/12/31';
SELECT * FROM emp WHERE hiredate BETWEEN '06/01/01' and '07/12/31';

--MGR(멘토사번)이 1010~1020사이
SELECT * FROM emp WHERE mgr BETWEEN '1010' and '1020';

--comm 이 null인 사람 출력하기
--SELECT * FROM emp WHERE comm  = 'null'은 안됨
SELECT * FROM emp WHERE comm is null;

-- 오름차순으로 출력하는 함수 : asc; ascending  생략가능하다
-- 내림차순으로 출력하는 함수 : desc; descending

--이름으로 오름차순 출력하기
SELECT * FROM emp ORDER BY ename asc;
SELECT * FROM emp ORDER BY ename;

--급여 내림차순으로 출력하기
SELECT * FROM emp ORDER BY sal desc;

--부서번호 오름차순으로 출력하기
SELECT * FROM emp ORDER BY deptno;

--job 내림차순으로 출력하기
SELECT * FROM emp ORDER BY job desc;

--부서번호 오름차순, 만약 동일하면 sal 내림차순 순서대로 출력하기
SELECT * FROM emp ORDER BY deptno, sal desc ;

--job이 과장이거나 부장인 사람의 job 오름차순으로 출력하기
SELECT * FROM emp WHERE job in('과장','부장') order by job asc;

--depto가 10이거나 30인 사람의 mgr 오름차순,deptno 오름차순으로
SELECT * FROM emp WHERE deptno in(10,30) order by mgr , deptno;

--합집합
SELECT * FROM group_star
union
SELECT * FROM single_star;

--합집합
SELECT * FROM group_star
union all
SELECT * FROM single_star;

--교집합 
SELECT * FROM group_star
intersect
SELECT * FROM single_star;

--차집합 : 그룹활동만 하고있는 스타들
SELECT * FROM group_star
minus
SELECT * FROM single_star;

--차집합 : 싱글활동만 하고있는 스타들
SELECT * FROM single_star
minus
SELECT * FROM group_star;

SELECT * FROM emp;

--급여가 300이하인 사원의 사원번호,사원이름 ,급여를 출력하기
SELECT  empno , ename ,  sal  FROM emp  WHERE sal <= 300 ;

--이름이 '오지호'인 사원의 시원번호,사원명,급여를 출력하기
SELECT empno , ename , sal FROM emp WHERE ename = '오지호';

--급여가 250이거나 300이거나 500인 사원들의 사원번호와 사원명과 급여를 출력하기
SELECT empno, ename , sal FROM emp WHERE sal in (250,300,500) ;

--급여가 250도 300도 500도 아닌 사원들 출력하기
SELECT * FROM emp WHERE not sal in  (250,300,500) ;

--이름이 '김'으로 시작하는 사람과 이름중 기를 포함하는 사원번호와 사원이름 출력하기
SELECT  empno , ename FROM  emp WHERE ename like '김%%' or ename like '%기%' ;

--상급자(mgr)가 없는 사원을 출력하기 
SELECT * FROM emp WHERE mgr is null;

--부서번호가 빠른 사원부터 출력하되 같은 부서 내의 사원을 출력할 경우 입사한 지 가장 오래된 사원부터 출력하기
SELECT * FROM emp ORDER BY deptno,hiredate;

SELECT * FROM emp WHERE job in('과장','부장') ORDER BY job ;
--처리순서 
-- 3       1      2(조건)                     4