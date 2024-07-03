-- 01. SELECT 
-- 1) 문법 구조
-- : SELECT 컬럼명1,2,...
--   FROM 테이블명;
-- 실습) 직원 테이블에서 이름 출력
SELECT FIRST_NAME 
FROM EMPLOYEES;
-- 실습) 직원 테이블에서 이름, 이메일 출력
SELECT FIRST_NAME, EMAIL 
FROM EMPLOYEES;

-- 2) 아스타리스크(*)
-- : SELECT 절에 사용 컬럼 전체를 의미
-- 실습) 직원테이블의 모든 정보 출력
SELECT * 
FROM EMPLOYEES;

-- 3) DISTINCT (데이터 중복제거)
-- 실습) 직원테이블에서 직업ID 출력
SELECT JOB_ID 
FROM EMPLOYEES; 
-- 실습) 직원테이블에서 직업ID 중복제거후 출력
SELECT DISTINCT JOB_ID
FROM EMPLOYEES;
-- 한쪽 컬럼에 중복이 있어도 다른 컬럼의 값이 다르면 다르게 취급
SELECT DISTINCT JOB_ID, DEPARTMENT_ID
FROM EMPLOYEES;

-- 4) 칼럼에 숫자연산 가능
-- 실습) 직원테이블에서 급여 출력
SELECT FIRST_NAME, SALARY
FROM EMPLOYEES;
-- 실습) 직원테이블에서 연봉 출력
SELECT FIRST_NAME, SALARY*12
FROM EMPLOYEES;

-- 5) 별칭(ALIAS)사용하기
-- 1. SELECT 칼럼명 별칭
-- 2. SELECT 칼럼명 "별 칭"
-- 3. SELECT 칼럼명 AS 별칭
-- 4. SELECT 칼럼명 AS "별 칭"
-- 실습) 직원테이블에서 FIRST_NAME은 이름,  SALARY는 급여, SALARY*12는 연봉으로 출력
SELECT FIRST_NAME AS 이름,
    SALARY 급여,
    SALARY*12 AS "1년 연봉"
FROM EMPLOYEES;

-- 6) ORDER BY절 
-- : 특정 칼럼을 기준으로 정렬
-- ASC : 오름차순 1.2.3
-- DESC : 내림차순 3.2.1
DESC EMPLOYEES; -- 여기서 DESC는 테이블 구조 확인 하는 명령어
-- 실습) 직원테이블에서 이름, 입사일 출력하는데 입사일 기준으로 내림차순 정렬
SELECT FIRST_NAME, HIRE_DATE
FROM EMPLOYEES
ORDER BY HIRE_DATE DESC;
