CREATE TABLE card( --ī��� ���̺��� �����
    cardNumber number(10)  not null primary key,
    accounNumber number(12) not null,
    cardKind varchar(8),
    orderDate date,
    limitAmout number(15),
    paymentDate date
    );
    
-- card ���̺� �ȿ� ���� �־��ش�
insert into card values(1001 , 556677,'����',sysdate, 5000,'2024/01/10');
insert into card values(1002 , 556677,'����',sysdate, 5000,'2024/01/10');
insert into card values(1003 , 556679,'master',sysdate, 10000,'2024/01/10');
insert into card values(1004 , 556680,'check',sysdate, null,'2024/01/10');
insert into card values(1005 , 556681,'check',sysdate, null,'2024/01/10');

-- �߸������� delete  FROM card; , drop table userTbl; ���� �����ȴ�.
delete FROM card;

SELECT * FROM card;


--���� 121�� �����̺�, �������̺� ����
create table userTbl(
    userName varchar2(10) not null primary key,
    birthYear date not null,
    addr varchar2(20) not null,
    mobil varchar2(15)

);

drop table userTbl;
drop table buyTbl;

-- �θ��÷��̶� �ڽ��÷��� �����ؾ��Ѵ� ���� �����ؾ��Ѵ�  
    -- ����: constraint �ܷ�Ű�� foreign key(�ܷ�Ű��� �÷���) references �θ����̺��(�ܷ�Ű��� �÷���)

create table buyTbl(
    userName varchar2(10) not null primary key,
    prodName varchar2(20)not null,
    price number(10) not null,
    amount number(5) not null,
    constraint userName_fk foreign key(userName) references userTbl(userName)  
    
);

insert into userTbl values( '�̽±�','87/12/10', '����', '010-111-1111');
insert into userTbl values( '���ȣ','71/12/10', '����', '010-111-1111');

insert into buytbl values( '�̽±�','�ȭ',1000, 1);
insert into buytbl values( '���ȣ','��Ʈ��',10000, 2);

SELECT * FROM buytbl;


--���� �θ� , master,��
CREATE TABLE bank(
    bankName varchar2(20) not null primary key,
    jijum varchar2(20) not null
);

insert into bank values ('����','����');
insert into bank values ('����','����');
insert into bank values ('�츮','����');


drop table bank;
drop table deAcc;

--���ݰ��� ���̺� �ڽ�, sub ,��
CREATE TABLE deACC(
    bankName varchar2(20) not null primary key,
    accKind varchar2(20),
    constraint bankName_fk foreign key(bankName) references bank(bankName)
);

SELECT * FROM bank;
SELECT * FROM deACC;


INSERT into deACC values('�츮','�Ϲݰ���');
INSERT into deACC values('����','�������');
INSERT into deACC values('����','���ǰ���');


--�����̺� :master ,�θ�,��  
CREATE TABLE custom(
    cardNb number(10) not null primary key,
    cName varchar2(20)
);

drop table custom;

SELECT * from custom;

--ī�����̺� : �ڽ�,sub,��
CREATE TABLE cardTbl(
    cardNb number(10) not null primary key,
    limitPrice number(10),
    constraint cardNb_fk foreign key(cardNb) references custom(cardNb)
    );

insert into custom values(1234,'ȫ�浿');
insert into custom values(1235,'�̼���');
insert into custom values(1236,'������');


SELECT * FROM custom;
SELECT * FROM cardTbl;

insert into cardTbl values(1234,11111111);
insert into cardTbl values(1235,999999999);
insert into cardTbl values(1236,845132522);

SELECT * FROM custom,cardTbl 

