-- CHAPTER 05. JOIN

-- join : 여러 테이블에서 필요한 데이터를 한번에 가져오는 기술

-- 비등가 조인(NON EQUI JOIN)
-- > 두 개의 테이블 간에 서로 정확하게 일치하지 않는 경우 활용
-- > 등가연산자(=) 가 아닌 연산자들을 사용한 조인을 의미 (>, >=, <, <=, BEETWEEN)

-- 등가 조인(EQUI JOIN)
-- > 두 개의 테이블 간에 서로 정확하게 일치하는 경우 활용
-- > 등가연산자를 사용해서 조인을 의미(=)

-- > 등가조인의 사용 방법
-- SELECT 테이블1.컬럼명, 테이블2.컬럼명
-- FROM 테이블1, 테이블2
-- WHERE 테이블1.컬럼명 = 테이블2.컬럼명;

-- 실습) 수강생정보 테이블과 성적표테이블에서 학생ID, 이름, 과목, 성적 출력
SELECT * FROM 수강생정보;
SELECT * FROM 성적표;

SELECT 성적표.학생ID, 수강생정보.학생이름, 성적표.과목, 성적표.성적
FROM 수강생정보, 성적표
WHERE 수강생정보.학생ID = 성적표.학생ID;

-- 실습) 직원의 직원ID와 이름, 부서이름
SELECT * FROM EMPLOYEES;
SELECT * FROM DEPARTMENTS;

SELECT E.EMPLOYEE_ID, 
       E.FIRST_NAME, 
       D.DEPARTMENT_NAME
FROM   EMPLOYEES E, DEPARTMENTS D
WHERE  E.DEPARTMENT_ID = D.DEPARTMENT_ID;

-- 실습) 직원ID가 100인 직원의 이름, 부서이름
SELECT E.EMPLOYEE_ID 직원ID,
       E.FIRST_NAME 이름, 
       D.DEPARTMENT_NAME 부서명
FROM   EMPLOYEES E, 
       DEPARTMENTS D
WHERE  E.DEPARTMENT_ID = D.DEPARTMENT_ID
AND    E.EMPLOYEE_ID = 100;

-- ANSI 조인문법 : 미국 표준협회에서 만든 모든 DBMS에서 사용가능한 조인 문법
-- INNER JOIN : 내부조인, 조인조건에서 동일한 값이 있는 행만 반환
-- > EQUI(등가조인)과 동일한 내용
-- 사용방법
-- 3. SELECT 컬럼명~~
-- 1. FROM 테이블1 INNER JOIN 테이블2
--    ON (테이블1.컬럼 = 테이블2.컬럼) -> 조인 조건 기술
-- 2. WHERE 일반조건 기술

-- 실습) 직원테이블에서 직원ID, 부서ID / 부서테이블에서 부서이름
SELECT E.EMPLOYEE_ID, 
        E.DEPARTMENT_ID, 
        D.DEPARTMENT_NAME
FROM EMPLOYEES E 
    JOIN DEPARTMENTS D
    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID;
-- 조인할 테이블의 단독 컬럼이면 SELECT절에 .(경로)를 안적어줘도 되지만 
-- 현업에서는 적어주는것이 좋다 보기 편함

-- 조인 조건이 되는 컬럼은 PK와 FK관계로 거의 이루어진다
-- 하지만 다 그런것은 아니다!!!!!!!!!!!!!!!!!!!!!

-- 실습) 직원ID, 직업ID, JOB_TITLE 정보 출력
SELECT E.EMPLOYEE_ID,
        E.JOB_ID,
        J.JOB_TITLE
FROM EMPLOYEES E 
    JOIN JOBS J
    ON E.JOB_ID = J.JOB_ID;

-- CROSS JOIN : 조인 조건절을 적지 않고 테이블의 모든 데이터를 가지고 오는 방법
-- > 조인 조건이 없는 경우 생길 수 있는 모든 데이터의 조합을 조회
-- > 카티션 곱 : 모든 경우의 수가 나오는 것

-- 실습) 직원ID, 부서ID, 부서이름
SELECT E.EMPLOYEE_ID,
        E.DEPARTMENT_ID,
        D.DEPARTMENT_ID
FROM EMPLOYEES E
    CROSS JOIN DEPARTMENTS D;
-- ON이 없으면 CROSS키워드 생략 가능
-- > 직원테이블 107 X 부서테이블 27 = 2889의 행이 출력

-- OUTER JOIN : 외부조인, 두개의 테이블을 간의 교집합을 조회하고
-- 한쪽 테이블에만 있는 데이터도 포함시켜 조회할 때 사용
-- > 한쪽 데이터의 NULL값고 출력하고자 할때 사용

-- LEFT OUTER JOIN : 왼쪽 테이블을 기준으로 NULL값도 포함하여 출력
-- 오라클 문법 조인시 : 조인 조건절에 반대인 오른쪽 컬럼에(+)기호를 작성

-- RIGHT OUTER JOIN : 오른쪽 테이블을 기준으로 NULL값도 포함하여 출력
--  오라클 문법 조인시 : 조인 조건절에 반대인 왼쪽 컬럼에 (+) 기호를 작성

-- FULL OUTER JOIN : 양쪽의 NULL값도 포함하여 출력
-- 오라클 문법에선 지원 안함, UNION연산자를 이용해서 출력해야 한다

-- 실습) 각 부서의 매니저 직원들의 부서 이름과 매니저ID, 이름 출력
SELECT * FROM EMPLOYEES;
-- ANSI 문법
SELECT D.DEPARTMENT_NAME, D.MANAGER_ID, E.FIRST_NAME
FROM EMPLOYEES E JOIN DEPARTMENTS D
    ON E.EMPLOYEE_ID = D.MANAGER_ID;
-- 오라클 문법
SELECT D.DEPARTMENT_NAME, D.MANAGER_ID, E.FIRST_NAME
  FROM DEPARTMENTS D, EMPLOYEES E
 WHERE D.MANAGER_ID = E.EMPLOYEE_ID;



