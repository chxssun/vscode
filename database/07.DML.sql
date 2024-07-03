-- CHAPTER 07. DML (DATA MANIPULATION LANGUAGE)

-- DML : 데이터 조작어로 테이블에 데이터를 조회, 추가, 수정, 삭제 할때 사용하는 질의어
-- DML의 유형 -- 세인업데
-- SELECT : 조회
-- INSERT : 추가
-- UPDATE : 수정
-- DELETE : 삭제

-- INSERT 사용방법
-- INSERT INTO 테이블명(컬럼1, 컬럼2,...)
-- VALUES(값1, 값2,...)
-- INSERT에 입력한 컬럼과 VALUES에 입력한 값은 순서와 자료형에 맞게 써야한다
-- INSERT에 컬럼리스트 생략시 모든컬럼으로 간주, 대신 VALUES에 값을 넣을때 컬럼 총 개수에 맞게 입력

SELECT * FROM JO_JOIN;
-- 1. 나의 정보를 넣기
INSERT INTO JO_JOIN(ID, PW, NAME, JOIN_DATE, AGE, TEL, EMAIL)
VALUES('JOJO', '12345', 'KIMJO', SYSDATE, 30, '010-1234-5678', 'JO@내입버' );

-- 2. 나의 짝궁 정보 넣기
-- NULL값을 명시적으로 입력
INSERT INTO JO_JOIN VALUES('OO', '1111', '최영화', SYSDATE, 24, NULL, '');

-- 3. 나의 친구의 정보를 넣기
-- 전화번호와 이메일 정보를 null값으로 입력
-- NULL값을 암시적으로 입력
INSERT INTO JO_JOIN (ID, PW, NAME, JOIN_DATE, AGE)
VALUES ('11', '2222', '이도연', SYSDATE, 22);


-- 테이블에 데이터를 넣을 때 에러 리스트 

-- 1. 컬럼리스트와 입력 값의 개수가 다른 경우
INSERT INTO JO_JOIN (ID, PW, NAME, JOINDATE, AGE, TEL, EMAIL)
 VALUES ('호두아빠', '33333', '박병관' , SYSDATE, 29, '010-111-1111', 'HODO@GMAIL.COM', 'N');
 
--  SQL 오류: ORA-00913: too many values 
--> 컬럼 리스트의 갯수와 입력 값 개수는 일치해야 한다!

-- 2. 식별자에 NULL을 입력한 경우
INSERT INTO JO_JOIN (ID, PW, NAME, JOINDATE, AGE, TEL, EMAIL)
 VALUES (NULL, '33333', '박병관' , SYSDATE, 29, '010-111-1111', 'HODO@GMAIL.COM');

-- ORA-01400: cannot insert NULL into ("HR"."SMHRD_JOIN"."ID")
--> 컬럼에 대한 제약조건에 맞게 작성 해야함 (식별자는 NOT NULL + UNIQUE 중복불가)

-- 3. NOT NULL인 컬럼에 NULL을 넣은 경우
INSERT INTO JO_JOIN (ID, PW, NAME, JOINDATE, AGE, TEL, EMAIL)
 VALUES ('호두아빠', '33333', NULL , SYSDATE, 29, '010-111-1111', 'HODO@GMAIL.COM');

-- ORA-01400: cannot insert NULL into ("HR"."SMHRD_JOIN"."NAME")
--> 컬럼에 대한 제약조건에 맞게 작성 해야함 ( NOT NULL 조건 )

-- 4. 자료형에 맞지 않게 입력 값을 넣은 경우
INSERT INTO JO_JOIN (ID, PW, NAME, JOINDATE, AGE, TEL, EMAIL)
 VALUES ('호두아빠', '33333', '박병관' , SYSDATE, '29살', '010-111-1111', 'HODO@GMAIL.COM');

-- ORA-01722: invalid number
--> 컬럼에 대한 자료형에 맞게 작성이 되야 한다. (AGE는 숫자형 자료형)

-- 5. 식별자 컬럼에 중복 값을 넣을 려는 경우
INSERT INTO JO_JOIN (ID, PW, NAME, JOINDATE, AGE, TEL, EMAIL)
 VALUES ('호두아빠', '33333', '박병관' , SYSDATE, 29, '010-111-1111', 'HODO@GMAIL.COM');
 
-- unique constraint (HR.SYS_C007110) violated
--> 값이 들어간 상태에서 한번더 실행이 되면 식별자가 값이 중복이 되서 에러가 남

SELECT * FROM JO_JOIN;

-- 컬럼리스트를 쓰지 않고 INSERT하는 방법
INSERT INTO JO_JOIN 
VALUES ('22', '3333', '신범식', SYSDATE, 20, '010-1111-1111', '신@국글');

-- 실습) 
CREATE TABLE PLAY_LIST (
    NO NUMBER(3) PRIMARY KEY,
    TITLE VARCHAR2(20) NOT NULL,
    SINGER VARCHAR2(20),
    GENDER VARCHAR2(10) -- GENDER VARCHAR2(10) CHECK (GENDER IN ('남자', '여자'))
);
SELECT * FROM PLAY_LIST;
-- ALTER TABLE PLAY_LIST ADD CONSTRAINT NO__PK PRIMARY KEY (NO);
ALTER TABLE PLAY_LIST ADD CONSTRAINT GENDER_CHECK CHECK (GENDER = '남자' OR GENDER = '여자');

INSERT INTO 선플리 VALUES (1, '좋은날', '멜로망스', '남자');
INSERT INTO 선플리 VALUES (2, '야생화', '박효신', '남자');
INSERT INTO 선플리 VALUES (3, '좋아해요', '폴킴', '남자');

RENAME PLAY_LIST TO 선플리;
SELECT * FROM 선플리;

-- UPDATE : 테이블의 데이터를 변경하고 싶을 때 사용
-- 사용 방법
-- UPDATE 테이블명
-- SET 변경할 컬럼 = 데이터값, ...
-- WHERE 데이터를 변경할 행을 선별하기 위한 조건식;
-- > 조건절 생략시 테이블 내에 저장된 모든 컬럼의 데이터가 변경되어버릠 ㄷㄷ
SELECT * FROM JO_JOIN;
UPDATE JO_JOIN
SET AGE = 20
WHERE NAME = '최영화';
-- WHERE ID = '00'; -- > 조건을 걸때는 PK인 컬럼으로 하는게 맞다
SELECT * FROM JO_JOIN;

-- DELETE : 데이터를 삭제할 때 사용하는 명령어
-- 사용방법
-- DELETE 테이블명
-- WHERE 삭제할 대상 행을 선별하기 위한 조건식;
-- > **조건절 생략시 테이블의 모든 데이터 싸아악제되어버릠 ㄷㄷㄷㄷㄷ
DELETE JO_JOIN
WHERE AGE >= 30;
SELECT * FROM JO_JOIN;


