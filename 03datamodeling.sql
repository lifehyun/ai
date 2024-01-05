CREATE TABLE card( --카드란 테이블을 만든다
    cardNumber number(10)  not null primary key,
    accounNumber number(12) not null,
    cardKind varchar(8),
    orderDate date,
    limitAmout number(15),
    paymentDate date
    );
    
-- card 테이블 안에 값을 넣어준다
insert into card values(1001 , 556677,'비자',sysdate, 5000,'2024/01/10');
insert into card values(1002 , 556677,'비자',sysdate, 5000,'2024/01/10');
insert into card values(1003 , 556679,'master',sysdate, 10000,'2024/01/10');
insert into card values(1004 , 556680,'check',sysdate, null,'2024/01/10');
insert into card values(1005 , 556681,'check',sysdate, null,'2024/01/10');

-- 잘못썻을시 delete  FROM card; , drop table userTbl; 으로 지우면된다.
delete FROM card;

SELECT * FROM card;


--교재 121쪽 고객테이블, 구매테이블 구현
create table userTbl(
    userName varchar2(10) not null primary key,
    birthYear date not null,
    addr varchar2(20) not null,
    mobil varchar2(15)

);

drop table userTbl;
drop table buyTbl;

-- 부모컬럼이랑 자식컬럼이 동일해야한다 값이 동일해야한다  
    -- 형식: constraint 외래키명 foreign key(외래키대상 컬럼명) references 부모테이블명(외래키대상 컬럼명)

create table buyTbl(
    userName varchar2(10) not null primary key,
    prodName varchar2(20)not null,
    price number(10) not null,
    amount number(5) not null,
    constraint userName_fk foreign key(userName) references userTbl(userName)  
    
);

insert into userTbl values( '이승기','87/12/10', '서울', '010-111-1111');
insert into userTbl values( '김경호','71/12/10', '전남', '010-111-1111');

insert into buytbl values( '이승기','운동화',1000, 1);
insert into buytbl values( '김경호','노트북',10000, 2);

SELECT * FROM buytbl;


--은행 부모 , master,주
CREATE TABLE bank(
    bankName varchar2(20) not null primary key,
    jijum varchar2(20) not null
);

insert into bank values ('국민','강동');
insert into bank values ('신한','강남');
insert into bank values ('우리','송파');


drop table bank;
drop table deAcc;

--예금계좌 테이블 자식, sub ,종
CREATE TABLE deACC(
    bankName varchar2(20) not null primary key,
    accKind varchar2(20),
    constraint bankName_fk foreign key(bankName) references bank(bankName)
);

SELECT * FROM bank;
SELECT * FROM deACC;


INSERT into deACC values('우리','일반계좌');
INSERT into deACC values('신한','대출계좌');
INSERT into deACC values('국민','증권계좌');


--고객테이블 :master ,부모,주  
CREATE TABLE custom(
    cardNb number(10) not null primary key,
    cName varchar2(20)
);

drop table custom;

SELECT * from custom;

--카드테이블 : 자식,sub,종
CREATE TABLE cardTbl(
    cardNb number(10) not null primary key,
    limitPrice number(10),
    constraint cardNb_fk foreign key(cardNb) references custom(cardNb)
    );

insert into custom values(1234,'홍길동');
insert into custom values(1235,'이순신');
insert into custom values(1236,'김지수');


SELECT * FROM custom;
SELECT * FROM cardTbl;

insert into cardTbl values(1234,11111111);
insert into cardTbl values(1235,999999999);
insert into cardTbl values(1236,845132522);

SELECT * FROM custom,cardTbl 

