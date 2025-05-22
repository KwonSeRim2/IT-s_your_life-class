use sqldb;
 select *
 from buytbl
 inner join usertbl
 on buytbl.userID = usertbl.userID
 where buytbl.userID = 'JYP';
 
 select *
 from buytbl
 right outer join usertbl
 on buytbl.userID = usertbl.userID;
 
 -- 구매 이력이 없는 사용자
 select *
 from buytbl b
 right outer join usertbl u 
 on b.userID = u.userID
 where ifnull(b.userID, true)
 order by b.userID;