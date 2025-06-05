create database job_platform;
use job_platform;
create table company (
company_id INT PRIMARY KEY AUTO_INCREMENT,
company_name VARCHAR(100) NOT NULL,
industry VARCHAR(50) null, -- 허용, 인덱스 생성 대상
founded_year INT CHECK (founded_year >=1900)
);
create index idx_company_industry on company(industry);

create table recruit_post (
post_id INT PRIMARY KEY AUTO_INCREMENT,
company_id INT,
title VARCHAR(100) NULL,
job_type VARCHAR(20)
CHECK ( job_type in('정규직', '계약직', '인턴' )),
deadline DATE NULL,
is_active BOOLEAN default TRUE
);
-- -----------------------------------------------------
insert into company (company_name, industry, founded_year)
values
('카카오', 'IT', 2010),
('현대자동차', '제조업', 1967),
('토스', '핀테크', 2015),
('쿠팡', '물류/유통', 2010),
('CJ ENM', '미디어', 1995),
('배달의민족', 'IT', 2011);
select * from company;

insert into recruit_post (company_id ,title ,job_type ,deadline ,is_active)
values
((select company_id from company where company_name = '카카오'), '백엔드 개발자 채용', '정규직', '2025-06-15', TRUE),
((select company_id from company where company_name = '현대자동차'), '생산관리 신입 모집', '정규직', '2025-06-20', TRUE),
((select company_id from company where company_name = '토스'), '데이터 분석 인턴', '인턴', '2025-05-31', TRUE),
((select company_id from company where company_name = '카카오'), 'UX 디자이너 계약직', '계약직', '2025-06-10', false),
((select company_id from company where company_name = '쿠팡'), '물류센터 관리자 채용', '정규직', '2025-06-25', TRUE),
((select company_id from company where company_name = 'CJ ENM'), '콘텐츠 마케팅 인턴', '인턴', '2025-05-30', TRUE),
((select company_id from company where company_name = '배달의민족'), '앱 서비스 운영 계약직', '계약직', '2025-06-12', TRUE),
((select company_id from company where company_name = '배달의민족'), '데이터 엔지니어 채용', '정규직', '2025-06-18', TRUE),
((select company_id from company where company_name = '현대자동차'), '브랜드전략팀 계약직 채용', '계약직', '2025-06-08', false),
((select company_id from company where company_name = '쿠팡'), '풀필먼트 혁신 프로젝트 인턴', '인턴', '2025-05-27', TRUE);

select * from recruit_post;
-- ---------------------------------------------------------------------------------------------------
select post_id, title, job_type, deadline, is_active from recruit_post where is_active = true order by deadline ;
-- ----------------------------------------------------------------------------------------
select c.company_name as '기업명', r.title as '공고 제목', r.job_type as '채용 유형', r.deadline as '마김일', r.is_active as '활겅화 영부'
from company c join recruit_post r
on c.company_id = r.company_id
order by c.company_name;
-- ------------------------------------------------------------------------------------------
select c.company_name ,c.industry , r.title , r.job_type , r.deadline , r.is_active 
from company c join recruit_post r
on c.company_id = r.company_id
where c.industry = 'IT' or  c.industry = '핀테크'
order by r.deadline desc;
-- ----------------------------------------------------
select c.company_name , r.title , r.job_type , r.deadline 
from company c join recruit_post r
on c.company_id = r.company_id
where r.deadline BETWEEN '2025-05-25' and '2025-06-01'
order by r.deadline ;
-- -------------------------------------------------------
select c.company_name  , r.title , r.job_type , r.deadline , r.is_active 
from company c join recruit_post r
on c.company_id = r.company_id
where r.title like '%데이터%'
order by r.deadline;
-- ----------------------------------------------------------
select c.company_name  , count(*) as '공고수'
from company c join recruit_post r
on c.company_id = r.company_id
group by c.company_name
order by count(*) desc;
-- ------------------------------------------
select c.company_name  , count(*) as '공고수'
from company c join recruit_post r
on c.company_id = r.company_id
group by c.company_name
having count(*)>=2
order by count(*) desc;
-- --------------------------------------------
select job_type, count(*) as '공고수' from recruit_post 
group by job_type
order by count(*) desc;
-- -------------------------------------------
select c.company_name  , r.title , r.job_type , r.deadline , r.is_active 
from company c join recruit_post r
on c.company_id = r.company_id
where c.industry = 'IT' and job_type= '정규직'
order by r.deadline;
-- ----------------------------------------------
INSERT INTO company (company_name, industry, founded_year)
VALUES ('네이버', 'IT', 1999);

select c.company_name  , r.title , r.job_type , r.deadline 
from company c left join recruit_post r
on c.company_id = r.company_id
order by c.company_name;