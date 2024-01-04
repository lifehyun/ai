SELECT 24*60 as ��� FROM dual;

--����Ŭ�� �����ϴ� �⺻���
--�뵵�� �����̴�
SELECT * FROM dual;

SELECT sign(10) FROM dual;
SELECT round(3.456, 2) FROM dual;   --round:�Ҽ��� 2°�ڸ����� �ݿø��ϼ���
SELECT trunc(3.4567, -1) FROM dual;  --trunc :���̳ʽ��̸� �Ҽ����ڸ����� ������ . �������� �߶��ִ� �Լ�
SELECT trunc(5354.4567, 2) FROM dual;      -- ����̸� �Ҽ��� �ڷΰ��� �߶��ִ� �Լ�
SELECT mod(25,4)FROM dual;  --mod: �������Լ�


SELECT * FROM student;

 --upper:�빮�ڷ� �����ִ� �Լ�
 --lower:�ҹ��ڷ� �����ִ� �Լ�
SELECT upper(stu_email) FROM student;  
SELECT lower(stu_email) , initcap(stu_email) , upper(stu_email)  FROM student;  

--length �ε����� ���̸� �˷��ִ� �Լ�
--lengthb �ε����� ����Ʈ���� �˷��ִ� �Լ�
SELECT length('oracle'), length('����Ŭ') FROM dual;
SELECT lengthb('oracle'), lengthb('����Ŭ') FROM dual;

--substr( ��� , ������ġ , ������ ����)
SELECT substr('Welcome to Oracle', 9,2 ) FROM dual;

--�������� �̸����� �պκ��� �����ϱ� ��� : moon
SELECT substr(stu_email , 1 , 4) FROM student WHERE stu_name = '������';

--stu_id�� 101~110������ ������� �̸��� �� �޺κ� �� com�� �����ϱ�
SELECT substr(stu_email,-3,3) FROM student WHERE stu_id between 101 and 110 ;

--stu_id�� 110~116 ������ ������� �̸��� �� �޺κ� �� nate�� �����ϱ�
SELECT substr(stu_email,-8,4) FROM student WHERE stu_id between 110 and 116 ;

--instr(���,ã�¹���) ��󿡼� ã�¹����� ��ġ�� ���ڷ� ��ȯ��
SELECT instr('Welcome to Oracle','e')FROM dual; --���� �տ����� 'e'�� ã�� �ش�. 2��°�� �ִ�

--instr(���,ã�¹���) ��󿡼� ã�¹����� ��ġ�� ���ڷ� ��ȯ��
SELECT instr('Welcome to Oracle','e',3)FROM dual; --������ġ���� 'e'�� ã�� �ش�. 7��°�� �ִ�

--instr(���,ã�¹���) ��󿡼� ã�¹����� ��ġ�� ���ڷ� ��ȯ��
SELECT instr('Welcome to Oracle','e',3,2)FROM dual; --������ġ����'e'�� ã�µ� 2��° �߰��Ѱ�. 17���� �ִ�

SELECT * FROM student;
-- ����л��� �̸��Ͽ��� ����� ��ġ�� �˾ƺ���
SELECT instr(stu_email,'@') FROM student;

--����л��� id�� ���ϱ� ��� moon five again cook,
SELECT substr(stu_email,1 , instr(stu_email, '@')-1) id FROM student ; 

--PAD : �����ڸ� ��ŭ ä�����Ҷ� ����Ѵ�
--LPAD : left padding
--RPAD : right padding

SELECT lpad('Oracle',20,'#') FROM dual;
SELECT rpad('Oracle',20,'#') FROM dual;

SELECT lpad('Oracle',20,'#') FROM dual;
SELECT rpad('Oracle',20,'#') FROM dual;

SELECT * FROM emp;
SELECT lpad(job,10,'_') FROM emp;


--3.����ȯ�Լ�
-- ���ڰ� ���ڷ� �Ǵ°� 1 --> '1' , ���ڰ� ���ڷ� �Ǵ°� '1' --> 1 ,  01/04 --> 

--����ð��� �����ִ� �Լ� : sysdate
SELECT sysdate FROM dual;

SELECT sysdate, to_char(sysdate, 'YYYY-MM-DD DAY') FROM dual;
SELECT * FROM emp;
SELECT hiredate , to_char(hiredate, 'yyyy-mm-dd dy') FROM emp;


--�������� ���ڷ� ��ȯ�ϱ�
SELECT to_char(12345678,'000,000,000')FROM dual;--012,345,678 
SELECT to_char(12345678,'000,000')FROM dual;--�ڸ��� ���ڸ��� #����ä���

SELECT to_char(12345678,'999,999,999')FROM dual;--����12,,345,678
SELECT to_char(12345678,'999,999')FROM dual;--�ڸ��� ���ڸ��� #����ä���

SELECT to_char(12345678,'L999,999,999')FROM dual;--��ȭ��ȣ12,,345,678

--to_date() ��¥������ �ٲٱ� 
--����Ŭ���� �⺻��¥���� 'mm/dd/yy'
--to_date('����','����') ���ڰ� �������� �ٲ� ��¥���� �ȴ�
SELECT * FROM emp;
--SELECT * FROM emp WHERE hirdate = 20070402; �����߻� : ���ڰ� �ƴ϶� 
--���ڸ� ���������� �ٲٱ�
SELECT * FROM emp WHERE hiredate = to_date(20070402,'yyyymmdd');
--���ڸ� ���������� �ٲٱ�
SELECT * FROM emp WHERE hiredate = to_date('20070402','yyyymmdd');

--���ó�¥���� Ư������ �󸶳� ���������� ���ض�
--SELECT sysdate - '2023/10/02' FROM dual; 
SELECT trunc(sysdate - to_date(20231002 ,'yyyymmdd') , 0)FROM dual;

SELECT * FROM emp;
--�ȼ��⾾�� �Ի��� - �������� �Ի��� ���ض�
SELECT to_date('20070321','yyyymmdd') - to_date('20070310','yyyymmdd') FROM dual;

--to_number(',�� �ִ¼���' , '����')
SELECT to_number('20,000','99,999') - to_number('10,000','99,999') FROM dual;

SELECT '20000' - '10000' FROM dual;

--��¥�Լ�
SELECT sysdate - 2 ������ FROM dual; --��Ʋ��
SELECT sysdate + 2 ���ϸ� FROM dual; --��Ʋ��

SELECT sysdate -1 ���� , sysdate ���� , sysdate +1 ���� FROM dual;
SELECT to_char(sysdate -1 , 'yyyy-mm-dd day' ) ����, sysdate ���� , sysdate +1 ���� FROM dual;

--months_between
SELECT months_between( sysdate, '2023/12/04') FROM dual;
SELECT add_months('2023/10/01',10) FROM dual;
SELECT round(to_date('20/07/17', 'yy/mm/dd'),'month')FROM dual; 

SELECT hiredate,trunc(hiredate,'month') FROM emp; --�Ի����� �޷� �߶� , ���� ��� 01�� ��ġ��

SELECT * FROM emp;

--�ٹ���� , �ٹ��޼� 
--���ó�¥ - �Ի��� ��� �޼�
SELECT ename , sysdate , hiredate FROM emp;

SELECT ename ����� , sysdate ������ , hiredate �Ի���, months_between(sysdate , hiredate) �ٹ��޼�  FROM emp;
-- SELECT ename ����� , sysdate ������ , hiredate �Ի���, years_between(sysdate , hiredate) �ٹ��޼�  FROM emp;
-- years_between() �Ҽ��� ����. �׷��� month_between()���� �ٹ��� ���� ������ /12�γ�����
SELECT ename �����, sysdate ������ , hiredate �Ի���, trunc(months_between(sysdate, hiredate)/12,0) �ٹ���� FROM emp;

--������� �Ի��� ���糯¥ �ټӳ� �ټӿ� �ټ���
SELECT  hiredate �Ի��� , sysdate ���糯¥ , trunc(months_between(sysdate, hiredate)/12,0) �ٹ���� ,
        trunc(months_between(sysdate, hiredate),0) �ٹ�����,
        trunc(months_between(sysdate, hiredate),0) * 30 �ٹ��ϼ�
FROM emp;

--���� ��¥�� �������� ���ʷ� �����ϴ� �������� ��¥��?
SELECT to_char(next_day(sysdate,'��'),'yyyy/mm/dd') FROM dual; 

SELECT last_day('24/01/01') FROM dual;

SELECT * FROM emp;

--�޿��� �ִ³��� �״��� ���������̴�
SELECT ename �����ȣ, last_day(sysdate)�޿��� FROM emp;

SELECT * FROM emp;

-- nvl(comm,0) 
SELECT comm,nvl(comm,0) FROM emp;

SELECT * FROM emp WHERE hiredate is null; --�Ի����� null�λ���� �����ּ���

--�Ի����� null�̸� ���ó�¥ �־��ֱ� 
SELECT hiredate,nvl(hiredate,sysdate) FROM emp WHERE hiredate is null;
SELECT hiredate,nvl(hiredate,sysdate) FROM emp;


--�̸��� null �̸� '����' , job�� null�̸� '���'
SELECT ename,nvl(ename,'����') ,nvl(job,'���') FROM emp;

-- insert 19 , 20
insert into emp values(1019,null,'�븮',1003,sysdate,null,null,20); 
insert into emp values(1020,null,'�븮',1003,sysdate,null,100,20); 


SELECT comm,sal,coalesce(comm,sal,0) FROM emp;

--������ ���� decode�Լ�(switch ~case���� �����)
/*decode(ǥ����,����1,���1,
                ����2,���2,
                ����3,���3,
                �⺻���n
*/               

--��)deptno�� 10�̸� '�渮��' , 20�̸� �λ�� 30�̸� ������ 40�̸� ����η� ����ϱ�
SELECT * FROM emp;
SELECT deptno , decode ( deptno, 10, '�渮��',
                                 20, '�λ��',
                                 30, '������',
                                 40, '�����')
FROM
emp;

SELECT * FROM student;
--sex�� 'M'���� , 'F;����
SELECT sex, decode ( sex, 'M','����',
                           'F','����')
FROM
student;

--�׷��Լ� 
--������ �Լ��� �׷��Լ��� ���� ��������
SELECT count(ename) FROM emp; -- 20�� �Է� �����  : �׷��Լ�
SELECT ename FROM emp; --20�� �Է� 20�� ��� : ������ �Լ�
-- SELECT ename,count(ename) from emp ; ������� ������ �޶� ���� ���� ����.

SELECT sum(sal) FROM emp;
SELECT sum(sal), count(ename), avg(sal), max(sal), min(sal) FROM emp;
--�׷��Լ����� sum,count���� null���꿡�� ����

--���ʽ� �� �޴� �������?
SELECT count(comm) FROM emp;

--���������� ����?
--��������
SELECT distinct job FROM emp;

SELECT * FROM emp;

SELECT * FROM emp ORDER BY deptno;

--group by: �׷캰�� �����ش� 
-- ���μ����� ���� ���� �޿� ����ϱ�
SELECT deptno , max(sal) FROM emp group by deptno ORDER BY deptno;

-- job���� �޿��� ���� ���� �޿� ����ϱ�
SELECT job, min(sal) FROM emp group by job ORDER BY job;

-- job���� �޿� ��� ����ϱ�
SELECT job, avg(sal) FROM emp group by job ORDER BY job ;


-- ����̰ų� �븮�̰ų� ������ �޿� �հ踦 ���ϼ���.
--1�ܰ� ���,�븮,�������� ����ϱ�
SELECT * FROM emp WHERE job in('���','�븮','����');
--2�ܰ� �׷����� �����ϱ�
SELECT job, round(avg(sal)) FROM emp WHERE job in('���','�븮','����') group by job;

--�ִ�޿��� 700�� �ʰ��ϴ� �μ��� ���ؼ� �ִ�޿��� �ּұ޿��� ���ϱ�
--��� 20 1000 300
--1�ܰ� �μ��� �ִ�޿� ���ϱ�
SELECT deptno, max(sal) FROM emp group by deptno;
--2�ܰ� �ִ� �޿��� 700�� �Ѵ°���? �׷��Լ��� ����
SELECT deptno, max(sal) FROM emp group by deptno having max(sal) > 700;

--���޺��� �޿��� ����� 500�̻��� ����,�޿����,�μ����� ����ϱ�
--1�ܰ� ���޺� �׷��ϱ�
SELECT job,avg(sal) FROM emp group by job;
--2�ܰ� �޿��� ����� 500�̻����� ����ϱ�
SELECT job,avg(sal) FROM emp group by job having avg(sal) >= 500;
--3�ܰ� ��ձ޿� ������������ ����ϱ�
SELECT job,avg(sal) FROM emp group by job having avg(sal) >= 500 order by avg(sal) asc;


SELECT * FROM student;
--�ִ볪��
SELECT max(age) FROM student;

--�ּҳ��� 
SELECT min(age) FROM student;

--��ճ���
SELECT avg(age) FROM student;

--���� �ִ볪�� , ���� �ִ볪�� 
SELECT sex, max(age) FROM student group by sex;

--cou_id���� ��ճ��� ���ϱ�
SELECT cou_id,avg(age) FROM student group by cou_id;

--cou_id���� ��ճ��̰� 25���̻��� Ŀ���� ��ճ��� ���ϱ�

SELECT cou_id,avg(age) FROM student  group by cou_id having avg(age) >= 25;

--������ ��� cou_id ���� ��� ���̰� 25�� �̻��� �ڽ��� ��� ���� ������������ ���ϱ�
--1�ܰ� ���ڸ� ����ϱ�
SELECT * From student WHERE sex = 'M';
--2�ܰ� ������ ��� cou_id ���� �׷�
SELECT avg(age),cou_id FROM student WHERE sex = 'M' group by cou_id;
--3�ܰ� ������ ��� cou_id ���� ��� ���̰� 25�� �̻��� �ڽ��� ��ճ��� 
select avg(age), cou_id FROM student WHERE sex ='M'group by cou_id having avg( age ) >= 25 ;
--4�ܰ� ������ ��� cou_id ���� ��� ���̰� 25�� �̻��� �ڽ��� ��ճ��� ������������ ���ϱ� 
select avg(age), cou_id FROM student where sex ='M'group by cou_id having avg( age ) >= 25  order by avg( age ) ;
