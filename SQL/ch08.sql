drop database tabledb; -- 데이터베이스 삭제
create database tabledb; -- 데이터베이스 생성
use tabledb;

drop table if exists usertbl; -- 만약 usertbl이 있다면 삭제
create table usertbl(
userID char(10) not null primary key,
name varchar(10) not null,
birthyear int not null,
addr char(2) not null,
mobile1 char(3) null,
mobile2 char(8) null,
height smallint null,
mDate Date null
);

drop table if exists buytbl;

create table buytbl(
num int auto_increment not null primary key,
userid char(8) not null, 
prodName char(6) not null,
groupName char(4) null,
price int not null,
amount smallint not null,
foreign key(userid) references usertbl(userID)
);

insert into usertbl -- 회원테이블 데이터 입력
values
('LSG', '이승기', 1987,'서울', '011', '11111111', 182, '2008-8-8'),
('KBS', '김범수', 1977,'경남', '011', '22222222', 173, '2012-4-4'),
('KKH', '김경호', 1971,'전남', '019', '33333333', 177, '2007-7-7');

insert into buytbl -- 구매테이블 데이터 입력
values
(null, 'KBS', '운동화', null, 30, 2),
(null, 'KBS', '노트북', '전자', 1000, 1),
(null, 'KBS', '청바지', '전자', 1000, 1);


drop  table if  exists usertbl2;

create table usertbl2(
userID char(8) not null, 
name varchar(10) not null,
birthyear int not null,
constraint primary key PK_userTBL_userID(userID)
);

drop table if exists prodtbl;

create table prodtbl(
prodCode char(3) not null, 
prodID char(3) not null, 
prodDate Datetime not null,
prodCur char(10) null,
constraint PK_prodtbl_prodCode_prodID
PRIMARY KEY (prodCode, prodID) -- 복합키로 기본기 설정
);

create view view1 as 
select u.userID, u.name, b.prodname, u.addr, concat(u.mobile1, u.mobile2) as '연락처'
from usertbl u inner join buytbl b 
on u.userID = b.userID;

select * from view1 where userID = 'KBS';

drop table if exists usertbl;
drop table if exists buytbl;
create table usertbl(
userID char(8) not null primary key,
name varchar(10) not null,
birthyear int not null
);
create table buytbl(
num int not null auto_increment primary key,
userID char(8) not null,
prodName char(6) not null,
foreign key(userID) references usertbl(userID)
);
