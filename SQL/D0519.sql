CREATE DATABASE recruitDB;
USE recruitDB;

drop table if exists departments;
create table departments(
dept_id int not null primary key,
dept_name varchar(30) not null
);

drop table if exists applicants;
create table applicants(
applicant_id int primary key,
name varchar(50),
email varchar(50) unique key,
phone varchar(15),
dept_id int,
apply_date date,
foreign key(dept_id) references departments(dept_id)
);

ALTER TABLE applicants
MODIFY COLUMN apply_date DATE DEFAULT (CURDATE());

alter table applicants
modify column name varchar(50) check(name >= 2 and name <= 20);

alter table applicants
modify column name varchar(50) check(name >= 2 and name <= 20);
select * from applicants;
