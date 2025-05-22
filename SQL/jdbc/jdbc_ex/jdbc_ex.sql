use jdbc_ex;

CREATE TABLE USERS(
    ID VARCHAR(12) NOT NULL PRIMARY KEY,
    PASSWORD VARCHAR(12) NOT NULL,
    NAME VARCHAR(30) NOT NULL,
    ROLE VARCHAR(6) NOT NULL
);

INSERT INTO USERS
VALUES
    ('guest', 'guest123', '방문자', 'USER'),
    ('admin', 'admine123', '관리자', 'ADMIN'),
    ('member', 'member123', '일반회원', 'USER');

SELECT * FROM USERS

