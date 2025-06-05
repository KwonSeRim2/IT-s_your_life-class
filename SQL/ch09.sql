create database scoula_db;
use scoula_db;

drop user if exists 'scoula'@'%';

create user 'scoula'@'%' identified by '1234';

grant all privileges on scoula_db.* to 'scoula'@'%';
grant all privileges on sqldb.* to 'scoula'@'%';

flush privileges;

select @@autocommit;

use sqldb;

select * from buytbl;

start transaction;
delete from buytbl where num = 1;
delete from buytbl where num = 2;

select * from buytbl;

rollback;

select * from buytbl

-- sqldb 데이터베이스에 다음과 같은 컬럼을 가지는 테이블 tbl1을 생성하고,자동 생성된 인덱스 목록을 확인하세요.
use sqldb;
create table tbl1 (
a int primary key,
b int,
c int
);

select * from tbl1;
show index from tbl1; -- 인텍스 조최alter

create table tbl2(
a int primary key, -- 클러스트 인텍스
b int unique, -- 보조 안텍스
c int unique, -- 보조 인덱스
d int
);

show index from tbl2; -- 인텍스 조최alter

create table tbl3(
a int unique, -- 보조인텍스
b int unique, -- 보조 안텍스
c int unique, -- 보조 인덱스
d int
);
show index from tbl3; -- 인텍스 조최alter

create table tbl4(
a int unique not null, -- 클러스트 인텍스
b int unique, -- 보조 안텍스
c int unique, -- 보조 인덱스
d int
);
show index from tbl4; -- 인텍스 조최alter

create table tbl5(
a int unique not null, 
b int unique, -- 보조 안텍스
c int unique, -- 보조 인덱스
d int primary key -- 클러스트형 인텍스 -> not null unique와 primarykey가 같이 있다면 pk가 클러스터
);
show index from tbl5; -- 인텍스 조최alter

create database if not exists testdb;
use testdb; 

drop table if exists usertbl;
create table usertbl(
userID char(8) not null primary key,
name varchar(10) not null,
birthyear int not null, 
addr nchar(2) not null
);

insert into usertbl -- 회원테이블 데이터 입력
values
('LSG', '이승기', 1987,'서울'),
('KBS', '김범수', 1977,'경남'),
('KKH', '김경호', 1971,'전남'),
('JYP', '조용필', 1950,'경기'),
('SSK', '성시경', 1979,'서울');

select * FROM USERTBL;

-- ALTER를 사용하여 usertbl에서 PRIMARY KEY 제약조건을 제거하고, name 컬럼에 pk_name이라는 제약조건명으로 기본키를 설정하세요.
-- 1. 기존의 PRIMARY KEY 제약조건 제거 (제약조건 이름이 필요)
ALTER TABLE USERTBL
DROP PRIMARY KEY;

-- 2. name 컬럼에 pk_name이라는 이름으로 PRIMARY KEY 제약조건 추가
ALTER TABLE USERTBL
ADD CONSTRAINT pk_name PRIMARY KEY (name);

-- usertbl의 내용을 출력하여, 새로운 클러스터형 인덱스를 확인하세요
show index from usertbl;

-- sqldb에서 usertbl 테이블에서 다음 내용들을 확인하세요
use sqldb;

select * from usertbl;
show index from usertbl;
show table status like 'usertbl';

-- usertbl의 상태를 출력하여 인덱스의 내용이 만들어졌는지 확인
create index idx_usertbl_addr on usertbl(addr);
show index from usertbl;
-- 내용이 없다면 실제 적용되도록 한 후, 인덱스의 크기를 확인하세요.
show table status like 'usertbl';
analyze table usertbl; -- 생성한 인덱스를 실제로 적용 시킴

create unique index idx_usertbl_birthyear
on usertbl(birthyear); -- unique는 중보값이 있음 안됨

create unique index idx_usertbl_name
on usertbl(name); -- 이름에 보조 인덱스 생성alter
show index from usertbl;

drop index idx_usertbl_name on usertbl;

create unique index idx_usertbl_name_birthyear
on usertbl(name, birthyear);
show index from usertbl;

drop index idx_usertbl_name_birthyear on usertbl;
drop index idx_usertbl_addr on usertbl;
show index from usertbl;
