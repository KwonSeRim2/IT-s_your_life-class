select COUNT(*) FROM employees.employees;

select * from employees.employees
where employees.last_name = 'Facello';

select * from employees.employees
where employees.emp_no = '32138';

use sakila;
select * from sakila.actor_info; 

create database jdbc_ex;
grant all privileges on jdbc_ex.* to 'scoula'@'%';