-- 02. WHERE
-- 1) 문법구조
-- SELECT 컬럼명1,2,...
-- FROM 테이블명
-- WHERE 조건;
-- 실습) 직원테이블에서 직원ID가 100인 직원의 직원ID, 이름, 성 출력
SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME
  FROM EMPLOYEES
 WHERE EMPLOYEE_ID = 100;

 -- 2) 산술연산자 : +, -, *, /
 -- 3) 비교연산자 : <, <=, >, >=
 -- 실습) 직원테이블에서 급여가 5000미만인 직원들의 이름, 급여를 내림차순해서 출력
SELECT FIRST_NAME, SALARY
  FROM EMPLOYEES
 WHERE SALARY < 5000
 ORDER BY SALARY DESC;
-- 실습) 직원테이블에서 연봉이 50000이하인 직원의 이름, 연봉을 내림차순 출력 
SELECT FIRST_NAME, SALARY*12 AS 연봉
  FROM EMPLOYEES
 WHERE SALARY*12 <= 50000
 ORDER BY 연봉 DESC;

 --4) 등가 비교 연산자
 -- = : 같다
 -- !=, <>, ^= : 같지 않다
 -- NOT A = B : 같지 않다
 -- 실습) 직원테이블에서 직업ID가 IT_PROG인 직원의 이름, 직업ID 출력
SELECT FIRST_NAME, JOB_ID
  FROM EMPLOYEES
 WHERE JOB_ID = 'IT_PROG';

-- 5) 논리연산자(참/거짓)
-- AND : 조건 모두 만족해야 TRUE
-- OR : 하나라도 만족하면 TRUE
-- 실습) 직원테이블에서 부서ID가 100이거나 90인 직원중 직원ID가 101인 직원ID, 이름, 연봉 출력
SELECT EMPLOYEE_ID, DEPARTMENT_ID, FIRST_NAME, SALARY*12 AS ANNSAL
  FROM EMPLOYEES
 WHERE (DEPARTMENT_ID = 100 OR DEPARTMENT_ID = 90)
   AND EMPLOYEE_ID = 101;
-- AND 연산자가 OR연산자보다 우선 순위가 높다

-- 6) NULL 연산자
-- IS NULL : 데이터값이 NULL인 값으로 조회
-- IS NOT NULL : 데이터 값이 NULL이 아닌 값을 조회
-- 실습) 직원테이블에서 보너스가 있는 직원의 이름과 보너스 정보를 출력
SELECT FIRST_NAME, COMMISSION_PCT
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL;

-- 7) SQL연산자 IN, BETWEEN, LIKE
-- 1. IN : 특정 칼럼에 포함된 데이터를 여러개 조회할 때 활용
-- 실습) 직원테이블에서 부서ID가 30이거나 50이거나 90인 직원의 모든 정보 출력
SELECT *
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 30
OR DEPARTMENT_ID = 50
OR DEPARTMENT_ID = 90;
-- IN연산자 활용
SELECT *
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (30, 50, 90);
-- 실습) 직원테이블에서 매니저ID가 100, 120, 121이 아닌 직원의 이름과 매니저ID를 출력
SELECT FIRST_NAME, MANAGER_ID
FROM EMPLOYEES
WHERE MANAGER_ID NOT IN (100, 120, 121);

-- 2. BETWEEN : 특정 범위의 값을 조회할 때 활용
-- 실습) 직원테이블에서 급여가 10000이상 20000이하인 직원의 이름과 급여 출력
SELECT FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY BETWEEN 10000 AND 20000;
-- 실습) 직원테이블에서 05년에 입사한 직원의 이름, 입사일 출력
SELECT FIRST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE BETWEEN '01/01/05' AND '31/12/05';

-- 3. LIKE : 특정 문자열이 포함된 데이터를 조회할때 활용
-- % : 0개 이상의 문자열
-- _ : 1개의 문자열
-- 실습) 직원테이블에서 번호가 650으로 시작하는 직원의 이름과 번호 출력
SELECT FIRST_NAME, PHONE_NUMBER
FROM EMPLOYEES
WHERE PHONE_NUMBER LIKE '650%';
-- 실습) 직원테이블에서 이름의 2번째 글자가e인 직원 출력
SELECT FIRST_NAME 
FROM EMPLOYEES
WHERE FIRST_NAME LIKE '_e%';
