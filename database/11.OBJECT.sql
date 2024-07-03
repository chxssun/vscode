-- 객체 (object)

-- view : 하나이상의 테이블에서 여러 정보를 토대로 만들어지는 가상의 테이블
--    - 편리성 : 자주쓰는 SELECT문장을 저장하기 위해
--    - 보안성 : 테이블의 특정 데이터를 노출시키지 않기 위해 사용

-- view 생성
-- 1. create view 뷰이름
-- 2. AS 저장할 SELECT문
CREATE VIEW VIEW_EMP100
    AS SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, JOB_ID, SALARY
        FROM EMPLOYEES
        WHERE EMPLOYEE_ID = 100;

-- view 사용
-- 1. select * from 뷰이름

SELECT * FROM VIEW_EMP100;

-- view 삭제
-- 1. drop view 뷰이름
DROP VIEW VIEW_EMP100;

----------------------------------------------

-- 시퀀스 : 특정 규칙에 맞는 연속 숫자를 생성, PK칼럼들의 유일한 값을 만들떄 활용
-- 사용법 : 시퀀스이름.CURRVALR : 마지막 생성 번호 반환
--        : 시퀀스이름.NEXTVAL : 다음 번호를 반환

-- 시퀀스 생성
CREATE SEQUENCE SEQ_DBSUN
    INCREMENT BY 1 -- 1씩 증가하겠다
    START WITH 10 -- 시작번호 10부터 시작
    MAXVALUE 20 -- 20까지 번호를 받겠다
    MINVALUE 0 -- 
    NOCYCLE; -- 20까지 도달하면 중단하겠다

    -- 시퀀스 조회
SELECT * FROM USER_SEQUENCES;

CREATE TABLE SUN_SEQUENCE (
    ID NUMBER PRIMARY KEY,
    NAME VARCHAR2(10),
    CLASS VARCHAR(50)
    );
SELECT * FROM SUN_SEQUENCE;
-- 시퀀스 활용
INSERT INTO SUN_SEQUENCE (ID, NAME, CLASS)
    VALUES (SEQ_DBSUN.NEXTVAL, '김창선', '웹기반 스프링');