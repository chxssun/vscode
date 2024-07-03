-- 03. 오라클 함수
-- 1) 사용자 정의 함수
-- 2) 내장 함수 : 문자형, 숫자형, 날짜형, 변환형, NULL관련, 조건
-- DUAL테이블 : 임시연산이나 함수의 결과 확인 용도로 사용하는 테스트용 테이블

-- 1. 문자형 함수
-- UPPER() : 모두 대문자로 변환
-- LOWER() : 모두 소문자로 변환
SELECT 'abcde@123@@'
FROM DUAL;
-- 실습) 직원테이블에서 직원의 이름은 대문자로, 메일은 소문자로 출력
SELECT UPPER(FIRST_NAME),
       LOWER(EMAIL)
FROM EMPLOYEES;

-- INITCAP() : 첫글자만 대문자로 변환
-- 실습) 직원테이블에서 직원의 이름 첫글자만 대문자로 출력
SELECT INITCAP(FIRST_NAME)
FROM EMPLOYEES;

-- LENGTH() : 문자열의 길이
-- 실습) 직원이 이름 길이가 5이상인 직원의 이름과 직원ID 출력
SELECT FIRST_NAME, EMPLOYEE_ID,
       LENGTH(FIRST_NAME)     
FROM EMPLOYEES
WHERE LENGTH(FIRST_NAME) >= 5
ORDER BY EMPLOYEE_ID;

-- SUBSTR() : 문자열을 추출하는 함수
-- SUBSTR(입력값, 시작위치, 추출길이) : 추출길이 생략시 시작위치 부터 끝까지 출력
-- 실습) 직원테이블에서 입사날짜를 연도 월 일별로 잘라서 출력
SELECT HIRE_DATE,
       SUBSTR(HIRE_DATE, 1, 2) AS 일,
       SUBSTR(HIRE_DATE, 4, 2) AS 월,
       SUBSTR(HIRE_DATE, 7, 2) AS 연도
FROM EMPLOYEES
ORDER BY HIRE_DATE;

-- REPLACE() : 특정문자를 다른 문자로 바꾼다
-- REPLACE(문자열데이터, 바꾸고 싶은 문자, 바꿔야할 문자) : 바꿔야할 문자 생략시 바꾸고 싶은 문자가 삭제된다
-- 실습) 직원테이블에서 입사일에/(슬러쉬)를 -(하이픈)으로 바꿔 출력
SELECT HIRE_DATE,
       REPLACE(HIRE_DATE, '/', '-'),
       REPLACE(HIRE_DATE, '/', '')
FROM EMPLOYEES;

-- CONCAT() : 두 문자열 데이터를 합친다
-- 2개의 문자열만 합칠수 있지만 ||연산자 이용시 무한대로 가능
-- 실습) 직원테이블에서 이름과 성을 합쳐서 출력
SELECT CONCAT(FIRST_NAME, LAST_NAME),
    CONCAT(FIRST_NAME, LAST_NAME) || '이름' || '연결',
    FIRST_NAME,
    LAST_NAME
FROM EMPLOYEES;

-- TRIM() : 입력받은 데이터의 양끝 공백제거
SELECT '  공백 제거 함수   ',
       TRIM('  공백 제거 함수   '),
       REPLACE(TRIM('   공백 제거 함수    '), ' '),
       REPLACE('    공백 제거 함수    ', ' ')
FROM DUAL;

-- 2. 숫자형 함수
-- ROUND() : 반올림
-- ROUND(반올림 할 숫자, 위치) : 위치 생략시 첫째 자리에서 강제 반올림
SELECT 1234.56789,
    ROUND(1234.56789, 1),
    ROUND(1234.56789, 3),
    ROUND(1234.56789)
FROM DUAL;

-- TRUNC() : 버림
-- TRUNC(버림할 숫자, 위치) : 위치 생략시 첫째 자리에서 강제 버림
SELECT 1234.56789,
    TRUNC(1234.56789, 1),
    TRUNC(1234.56789)
FROM DUAL; 

-- MOD() : 숫자를 나눈 나머지 값을 구하는 함수
-- MOD(나눗셈 될 숫자, 나눌 숫자)
SELECT MOD(10, 2) AS "0",
    MOD(10, 3) AS "1",
    MOD(15, 6) AS "3"
FROM DUAL;

-- 3. 날짜형 함수
-- SYSDATE : 현재 날짜와 시간 출력
-- 날짜데이터 끼리 연산 불가능
SELECT SYSDATE AS 오늘,
    SYSDATE -1 AS 어제,
    SYSDATE +1 AS 내일,
    SYSDATE +1/24 AS 한시간더함,
    SYSDATE +1/24/60 AS 일분더함,
    SYSDATE +1/24/60/60 AS 일초더함
FROM DUAL;

-- ADD_MONTHS() : 몇개월 이후 날짜를 구하는 함수
-- ADD_MONTHS(날짜데이터, 더하거나 뺄 개월수)
SELECT SYSDATE AS 오늘,
    ADD_MONTHS(SYSDATE, 3) AS "3개월후",
    ADD_MONTHS(SYSDATE, -3) AS "3개월전"
FROM DUAL;

-- 4. 변환형 함수
-- 암시적 형변환 : 데이터베이스가 자동으로 형변환
SELECT SALARY*12,
    SALARY*'12'
FROM EMPLOYEES;

-- 명시적 형변환 : 데이터 변환형 함수를 사용해서 직접 형변환
-- TO_CHAR() : 날짜, 숫자 데이터를 문자데이터로 변환
-- TO_CHAR(변환할 데이터, 출력형태)
SELECT SALARY AS 급여,
    TO_CHAR(SALARY, 'L999,999')
FROM EMPLOYEES;

-- TO_NUMBER() : 문자데이터를 숫자데이터로 변환
-- TO_NUMBER(문자열데이터, 인식될 숫자 형태)
SELECT 1000 + 500,
    '1000' + 500,
    TO_NUMBER('1000', '9999') + 500
    -- TO_NUMBER('10000','9999') +500 인식될 숫자 형태가 문자열 데이터보다 작으면 에러
FROM DUAL;

-- TO_DATE() : 문자데이터를 날짜데이터로 변환
-- TO_DATE(문자열데이터, 인식될 날짜 형태)
SELECT '2024/06/02',
    TO_DATE('2024/06/02', 'YYYY-MM-DD')
FROM DUAL;

-- 5. NULL관련 함수 : NULL값을 대체할 수 있는 함수
-- NVL(NULL인지 여부를 검사할 데이터<1>, <1>이 NULL일경우 반환할 데이터)
-- 실습) 직원테이블에서 이름과 부서ID출력, 부서ID가 NULL이면 0으로 출력
SELECT FIRST_NAME, DEPARTMENT_ID FROM EMPLOYEES;
SELECT FIRST_NAME,
    DEPARTMENT_ID,
    NVL(DEPARTMENT_ID, 0)
FROM EMPLOYEES;
-- 실습) 직원테이블에서 보너스가 없으면 0으로 출력
SELECT FIRST_NAME,
    COMMISSION_PCT,
    NVL(COMMISSION_PCT, 0)
FROM EMPLOYEES;

-- NVL2(NULL인지 여부를 검사할 데이터<1>, 
--      <1>이 NULL이 아닐 경우 반환할 데이터<2>,
--      <2>이 NULL일 경우 반환할 데이터<3>
SELECT FIRST_NAME,
    DEPARTMENT_ID,
    NVL(DEPARTMENT_ID, 0),
    NVL2(DEPARTMENT_ID, '있음', '없음')
FROM EMPLOYEES;
-- 실습) 직원테이블에서 직원ID, 이름, 매니저ID출력 단. 매니저가 있으면 직원, 없으면 대표로 출력
SELECT EMPLOYEE_ID, 
    FIRST_NAME,
    MANAGER_ID,
    NVL2(MANAGER_ID, '직원', '대표')
FROM EMPLOYEES;

-- 조건함수
-- DECODE() : 상황에 따라 다른 데이터를 반환하는 함수
-- 검사대상과 비교해서 지정한 값을 반환
-- DECODE(검사 대상이 될 컬럼 또는 데이터<1, 기준값>, 비교값<2>,
-- 일치시 반환할 값 <3>, 일치하지 않을 때 반환 값<마지막>)
SELECT FIRST_NAME, DEPARTMENT_ID,
    DECODE(DEPARTMENT_ID, NULL, '부서없음', '부서있음')
FROM EMPLOYEES;

