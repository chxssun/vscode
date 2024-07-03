-- CHAPTER 10. 서브쿼리

-- 서브쿼리 : SQL문을 실행하는데 필요한 데이터를 추가로 조회하기 위해
-- SQL 내부에서 사용하는 SELECT문을 의미합니다
-- 서브쿼리는 메인쿼리 안에 포함된 종속적인 관계

-- 메인쿼리 : 서브쿼리의 결과값을 사용하여 기능을 수행하는 영역
-- 서브쿼리 : 메인쿼리의 조건식에 들어가는 값을 의미

-- 실습) 직원테이블에서 FIRST_NAME이 'Jack'인 급여정보를 출력
SELECT SALARY, FIRST_NAME
FROM EMPLOYEES
WHERE FIRST_NAME = 'Jack';
-- Jack이라는 직원보다 급여가 낮은 직원의 이름과 급여 출력
SELECT SALARY, FIRST_NAME
FROM EMPLOYEES
WHERE SALARY <= (
                SELECT SALARY
                FROM EMPLOYEES
                WHERE FIRST_NAME = 'Jack'
                )
ORDER BY SALARY DESC;

-- 실습) 직원테이블에서 James의 급여보다 낮은 직원의 이름과 급여 출력
SELECT SALARY, FIRST_NAME
FROM EMPLOYEES
WHERE SALARY <ALL (SELECT SALARY
                   FROM EMPLOYEES
                   WHERE FIRST_NAME = 'James')
ORDER BY SALARY DESC;
-- ORA-01427: single-row subquery returns more than one row
-- > 단일행 서브쿼리는 하나의 행만 출력을 할 수가 있다.

-- 서브쿼리의 특징
-- 1. 서브쿼리는 연산자와 같은 비교 또는 조회 대상의 오른쪽에 놓이며 ()로 묶어서 사용
-- 2. 서브쿼리의 SELECT절에 명시한 컬럼은 메인쿼리의 비교대상과 같은 자료형과 개수를 지정
-- 3. 서브쿼리에 있는 SELECT문의 결과 행 수는 함께 사용하는 메인쿼리의 연산자 종류와 호환
-- > 단 하나의 데이터로만 연산이 가능한 연산자라면 서브 쿼리와 다중 행 서브쿼리로 나뉜다

-- 단일 행 서브쿼리 : 서브쿼리 결과가 1개의 행만 반환
--  연산자 : 등호 / 부등호 

-- 실습) 직원테이블에서 Nancy보다 빨리 입사한 직원의 이름과 입사일 출력
SELECT FIRST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE HIRE_DATE <= (SELECT HIRE_DATE
                    FROM EMPLOYEES
                    WHERE FIRST_NAME = 'Nancy')
ORDER BY HIRE_DATE DESC;

-- 실습) 직원테이블에서 평균급여보다 높은 급여를 받는 직원의 이름과 급여 출력
SELECT SALARY, FIRST_NAME
FROM EMPLOYEES
WHERE SALARY >= (SELECT AVG(SALARY)
                FROM EMPLOYEES)
ORDER BY SALARY DESC;

-- 다중 행 서브쿼리 : 서브쿼리 결과가 2개 이상 행을 반환
-- 연산자 : IN / ANY / ALL / EXISTS
-- IN : 메인쿼리의 데이터가 서브쿼리의 결과중 하나라도 일치한 데이터가 있으면 TRUE반환
-- 비교연산자ANY : 메인쿼리의 조건식을 만족하는 서브쿼리의 결과가 하나 이상이면 TRUE반환
-- 비교연산자ALL : 메인쿼리의 조건식을 서브쿼리의 결과 모두가 만족하면 TRUE반환 
-- EXISTS : 서브쿼리 결과 값이 존재하는지 여부를 확인( 행이 1개 이상이면 TRUE반환)

-- 실습) 각부서별 최고 급여 출력
SELECT MAX(SALARY), DEPARTMENT_ID
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
ORDER BY DEPARTMENT_ID;
-- 각부서별 최고급여와 동일한 급여를 받는 직원의 부서ID, 이름, 급여
SELECT DEPARTMENT_ID, FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY IN (SELECT MAX(SALARY)
                    FROM EMPLOYEES
                    GROUP BY DEPARTMENT_ID)
ORDER BY DEPARTMENT_ID;
-- 부서별 최고 급여와 같은 급여를 가지는 모든 직원 출력
-- IN 서브쿼리 결과에 존재하는 값들 중 일치해야한다

-- ANY활용
SELECT DEPARTMENT_ID, FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY =ANY (SELECT MAX(SALARY)
                    FROM EMPLOYEES
                    GROUP BY DEPARTMENT_ID)
ORDER BY DEPARTMENT_ID;
-- IN연산자와 같은 결과값 나온다
-- 조건에 만족하는 결과가 하나라도 참이면 참을 반환

-- ALL활용
SELECT DEPARTMENT_ID, FIRST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY >=ALL (SELECT MAX(SALARY)
                    FROM EMPLOYEES
                    GROUP BY DEPARTMENT_ID)
ORDER BY DEPARTMENT_ID;
-- ALL : 서브쿼리 결과에 존재하는 모든 값들에 대해 조건을 만족해야 한다
-- 메인쿼리는 서브쿼리의 모든 결과 값을 만족한다
-- 서브쿼리의 결과 값 중 가장 큰 값인 24000과 비교를 해서 크거나 같은 값을
-- 가진 데이터로만 출력

-- EXISTS : 존재여부만 확인
SELECT FIRST_NAME, DEPARTMENT_ID
FROM EMPLOYEES
WHERE EXISTS (SELECT 1
                FROM EMPLOYEES
                WHERE DEPARTMENT_ID = 100);


                
                
