SELECT*FROM  emp;
SELECT*FROM Student;
SELECT*FROM dept;
SELECT dname FROM dept;

SELECT empno, ename, sal, job FROM emp;
/* ������ �ּ� */
-- ���� �ּ�
-- stu_id stu_name,sex �÷��� �˻��ϱ�,��ҹ� ������ ����
SELECT stu_id ,stu_name,sex FROM student;

--���������
SELECT empno, ename, sal*12, job FROM emp;
SELECT empno, ename, sal*12, sal*12.033, job FROM emp;
--�÷���[as]:��Ī�̴�
SELECT empno as �����ȣ, ename as �����, sal as �޿� ,sal*12 as ���� , sal*12.033 as ������ , job as ���� FROM emp;
--[as]�� �����Ҽ� �ִ�
SELECT empno �����ȣ, ename �����, sal �޿� ,sal*12 ���� , sal*12.033 ������ , job ���� FROM emp;

SELECT * FROM salgrade;
--��������� Hisal + 1000 Losal+ 1500 ���ϱ��ؼ� ����ϱ�
SELECT grade, losal, losal + 1500 , hisal, hisal + 1000 FROM salgrade;

--��Ī�� �������� as�� �ᵵ �ǰ� �Ƚᵵ�ȴ�
--��Ī�ȿ� ���⸦ �ϰ� ������ ""���ؼ� ����ϸ�ȴ�
--���,�����ݾ�,�λ������ݾ�,�ִ�ݾ�,�λ��ִ�ݾ�
SELECT grade as ��� , losal as �����ݾ�, losal + 1500 as �λ������ݾ� , hisal as �ִ�ݾ�, hisal + 1000 as �λ��ִ�ݾ� FROM salgrade;

--null�̶�? 0�� �ƴ�, ������� �ƴϴ� , ��Ȯ�� , �˼����� �ǹ� , ������� ���� �𸥴� , �����Ҽ� ����
SELECT * FROM emp;

--COMM ���ʽ���  + 100������ ��������
SELECT comm, comm + 100 FROM emp; --null�� �÷���  + 100�� �ȵǰ� null�� ��Ÿ����.
SELECT comm, nvl(comm ,0) + 100 "�� �� ��" FROM emp; --nvl(comm,0) null�̸� 0���� ��� , null�� �ƴϸ� comm ������ ���

--���ڿ� ����:||�� ���ָ�ȴ�
SELECT ename || '�� ������' || job || '�Դϴ�'  ���� FROM emp;

-- student���� �ڷḦ �����´�
SELECT * FROM student;
--�������� ���̴� 24���Դϴ�
SELECT stu_name || '�� ���̴�' || age || '�Դϴ�' ���� FROM student;

--�ߺ������ϱ� �ϴ� �Լ� : distinct
-- ��ü�ڽ��� �����ΰ���? 
SELECT distinct cou_id FROM student;

SELECT * FROM emp;
--�μ���(deptno)�� ������ (�ߺ������ϱ�)
SELECT distinct deptno FROM emp;

--Ư�������� �����͸� ��ȸ�ϴ°͸� �����ִ� �Լ� : where

--�μ����� 20�� ����鸸 ����ʹ�
SELECT * FROM emp WHERE deptno = 20; 
--JOB�� ����� ����� ����ʹ�
SELECT * FROM emp WHERE job = '���' or job = '����';
--sal�� 400���� �̻��� ����� ����ʹ�
SELECT empno �����ȣ, ename �̸�, sal �޿� FROM emp WHERE sal >= 400; 
--sal�� 400���� �̻��̰� job�� ������ ����� �����ȣ,�̸�,����,�޿�����
SELECT empno �����ȣ, ename �̸�, sal �޿� FROM emp WHERE sal >=400 AND job = '����';

SELECT * FROM emp;
--Hiredate �Ի���
--�Ի����� 2005/01/01 ������ �Ի��� ���
SELECT * FROM emp WHERE hiredate < '05/01/01';

--�Ի����� 2005/01/01 ���Ŀ� �Ի��� ���
SELECT * FROM emp WHERE hiredate > '05/01/01';

--�Ի����� 2006/01/01 ~ 2007/12/31 ���̿� �Ի��� ���
SELECT * FROM emp WHERE '06/01/01' <= hiredate AND  hiredate <= '07/12/31';

-- �����ϰ� ��ġ�ϴٶ�� �Լ�: like % 

--�̾� ���� ���� �����
SELECT * FROM emp WHERE ename like '��%'; 

--�̾��� �Ǵ� ������ ���� �����
SELECT * FROM emp WHERE ename like '��%' OR ename like '��%';

-- �ƴѰ� : not 

--�̾� ���� �ƴѻ��
SELECT * FROM emp WHERE not ename like '��%';
SELECT * FROM emp WHERE ename not like '��%';

--�̸� �߰� �۾��� '��'�ڰ� ���� ���
SELECT * FROM emp WHERE ename like '%��%';

--�̸� ������ �۾��� ���� ���
SELECT * FROM emp WHERE ename like '%%��';

--in ~�ȿ�
--job ����̰ų� �����̰ų� ������ ��� ����ϱ�
SELECT * FROM emp WHERE job = '���' or job = '����' or job ='����';
SELECT * FROM emp WHERE job in('���','����','����');

--�÷��� between ���ۼ� and ����  ���ۼ�~���� ����
--300 <= sal <= 600 ������ ��� ����ϱ�
SELECT * FROM emp WHERE sal between 300 and 600;

--�Ի��� 2006/01/01~ 2007/12/31 ���̿� �Ի��� ���
SELECT * FROM emp WHERE '06/01/01' <= hiredate and hiredate <= '07/12/31';
SELECT * FROM emp WHERE hiredate BETWEEN '06/01/01' and '07/12/31';

--MGR(������)�� 1010~1020����
SELECT * FROM emp WHERE mgr BETWEEN '1010' and '1020';

--comm �� null�� ��� ����ϱ�
--SELECT * FROM emp WHERE comm  = 'null'�� �ȵ�
SELECT * FROM emp WHERE comm is null;

-- ������������ ����ϴ� �Լ� : asc; ascending  ���������ϴ�
-- ������������ ����ϴ� �Լ� : desc; descending

--�̸����� �������� ����ϱ�
SELECT * FROM emp ORDER BY ename asc;
SELECT * FROM emp ORDER BY ename;

--�޿� ������������ ����ϱ�
SELECT * FROM emp ORDER BY sal desc;

--�μ���ȣ ������������ ����ϱ�
SELECT * FROM emp ORDER BY deptno;

--job ������������ ����ϱ�
SELECT * FROM emp ORDER BY job desc;

--�μ���ȣ ��������, ���� �����ϸ� sal �������� ������� ����ϱ�
SELECT * FROM emp ORDER BY deptno, sal desc ;

--job�� �����̰ų� ������ ����� job ������������ ����ϱ�
SELECT * FROM emp WHERE job in('����','����') order by job asc;

--depto�� 10�̰ų� 30�� ����� mgr ��������,deptno ������������
SELECT * FROM emp WHERE deptno in(10,30) order by mgr , deptno;

--������
SELECT * FROM group_star
union
SELECT * FROM single_star;

--������
SELECT * FROM group_star
union all
SELECT * FROM single_star;

--������ 
SELECT * FROM group_star
intersect
SELECT * FROM single_star;

--������ : �׷�Ȱ���� �ϰ��ִ� ��Ÿ��
SELECT * FROM group_star
minus
SELECT * FROM single_star;

--������ : �̱�Ȱ���� �ϰ��ִ� ��Ÿ��
SELECT * FROM single_star
minus
SELECT * FROM group_star;

SELECT * FROM emp;

--�޿��� 300������ ����� �����ȣ,����̸� ,�޿��� ����ϱ�
SELECT  empno , ename ,  sal  FROM emp  WHERE sal <= 300 ;

--�̸��� '����ȣ'�� ����� �ÿ���ȣ,�����,�޿��� ����ϱ�
SELECT empno , ename , sal FROM emp WHERE ename = '����ȣ';

--�޿��� 250�̰ų� 300�̰ų� 500�� ������� �����ȣ�� ������ �޿��� ����ϱ�
SELECT empno, ename , sal FROM emp WHERE sal in (250,300,500) ;

--�޿��� 250�� 300�� 500�� �ƴ� ����� ����ϱ�
SELECT * FROM emp WHERE not sal in  (250,300,500) ;

--�̸��� '��'���� �����ϴ� ����� �̸��� �⸦ �����ϴ� �����ȣ�� ����̸� ����ϱ�
SELECT  empno , ename FROM  emp WHERE ename like '��%%' or ename like '%��%' ;

--�����(mgr)�� ���� ����� ����ϱ� 
SELECT * FROM emp WHERE mgr is null;

--�μ���ȣ�� ���� ������� ����ϵ� ���� �μ� ���� ����� ����� ��� �Ի��� �� ���� ������ ������� ����ϱ�
SELECT * FROM emp ORDER BY deptno,hiredate;

SELECT * FROM emp WHERE job in('����','����') ORDER BY job ;
--ó������ 
-- 3       1      2(����)                     4