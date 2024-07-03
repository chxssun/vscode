-- GROUP BY / HAVING

-- 내장함수 종류

-- 단일행 함수 : 입력된 하나의 행당 결과가 하나씩 나오는 함수
-- 단일행 함수 종류 : 문자형, 숫자형, 날짜형, 변환형, NULL관련, 조건
-- 다중행 함수 : 여러행을 입력받아 하나의 값으로 출력 (집계함수)
-- 다중행 함수(집계함수) 특징
-- 1. 집계함수는 NULL값을 제외하는 특성이 있다
-- 2. 집계함수는 그룹화(GROUP BY)가 되어 있는 상태에서만 사용 가능

-- 집계함수 종류
-- 1. COUNT() : 지정한 데이터의 개수 반환
-- 2. SUM() : 지정한 데이터의 합 반환
-- 3. MAX() : 지정한 데이터 중 최댓값 반환
-- 4. MIN() : 지정한 데이터 중 최솟값 반환
-- 5. AVG() : 지정한 데이터의 평균 값 반환

-- 실습) 직원테이블에서 부서ID 행의 갯수 조회
SELECT COUNT(DEPARTMENT_ID)
FROM EMPLOYEES;
-- NULL 값이 제외 되서 출력
SELECT COUNT(*)
FROM EMPLOYEES;
-- COUNT함수는 아스타리스크 사용 가능
-- 다른 집계함수는 *사용 불가

-- 실습) 직원테이블에서 급여의 총합, 급여의 최대/최솟값 출력
SELECT SUM(SALARY),
    MAX(SALARY),
    MIN(SALARY)
FROM EMPLOYEES;

-- 실습 직원테이블에서 부서ID가 100인 직원의 평균 급여 출력, 소수1자리만 출력

SELECT ROUND(AVG(SALARY),1)
FROM EMPLOYEES
WHERE DEPARTMENT_ID = 100;

--------------------------------------------

SELECT * FROM 수강생정보;
SELECT * FROM 성적표;

-- GROUP BY : 특정 컬럼을 기준으로 그룹화

-- 실습) 수강생정보 테이블에서 소속반별 학생의 인원수를 조회
SELECT 소속반, COUNT(학생ID)
FROM 수강생정보
GROUP BY 소속반;

-- SQL의 작성 순서
-- SELECT > FROM > WHERE > GROUP BY > HAVING > ORDER BY
-- *** SQL 실행 순서 ***
-- FROM > WHERE > GROUP BY > HAVING > SELECT > ORDER BY

-- GROUP BY 유의할 점
-- 1. 실제 출력되는 행의 개수가 감소하기 때문에 GROUP BY절 뒤에 실행되는
-- HAVING, SELECT, ORDER BY절에는 출력할수 있는 행이 제한이 된다
-- 2. 대신 집계함수로 처리하는 컬럼은 사용 가능

-- 실습) 성적표 테이블에서 학생별로 평균 점수를 출력
SELECT 학생ID,
    ROUND(AVG(성적),1)
FROM 성적표
GROUP BY 학생ID;

-- 실습) 성적표테이블에서 학생별로 JAVA, DATABASE의 과목의 합만 출력
SELECT 학생ID,
    SUM(성적)
FROM 성적표
WHERE 과목 IN ('JAVA', 'DATABASE')
GROUP BY 학생ID;

-- HAVING절 : GROUP BY절이 존재할때 만 사용가능
-- > 집계가 완료된 대상을 조건을 통해서 필터링
-- > 조건이 참인 결과만 출력 된다는 점에서 WHERE절과 비슷하지만
-- > HAVING절은 GROUP BY된 대상에서 출력된다는 점에서 다르다

-- 실습) 성적표테이블에서 학생별 평균 성적을 구하고, 평균 성적이 75이하인 학생만 출력
SELECT 학생ID,
    ROUND(AVG(성적),1)
FROM 성적표
GROUP BY 학생ID
HAVING AVG(성적) <= 75;

-- 실습) 수강생 정보테이블에서 소속반 별 인원수가 3명 이상인 반만 출력
SELECT* FROM 수강생정보;
SELECT 소속반, 
    COUNT(소속반)
FROM 수강생정보
GROUP BY 소속반
HAVING COUNT(소속반) >= 3;

-- 실습) 직원테이블에서 부서별 최고연봉이 100000 이상인 부서만 출력
SELECT * FROM EMPLOYEES;
SELECT DEPARTMENT_ID, MAX(SALARY*12)
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING MAX(SALARY*12) >= 100000;









