-- 모든 레코드 조회하기
SELECT * from ANIMAL_INS
order by ANIMAL_ID;

-- 역순 정렬하기
SELECT NAME, DATETIME 
from ANIMAL_INS
order by ANIMAL_ID DESC;

-- 아픈 동물 찾기
SELECT ANIMAL_ID, NAME 
from ANIMAL_INS
where INTAKE_CONDITION = 'Sick';

-- 어린 동물 찾기
SELECT ANIMAL_ID, NAME 
from ANIMAL_INS
where INTAKE_CONDITION != 'Aged';

-- 동물의 아이디와 이름
SELECT ANIMAL_ID, NAME 
from ANIMAL_INS
order by ANIMAL_ID;

-- 여러 기준으로 정렬하기
SELECT ANIMAL_ID, NAME, DATETIME
from ANIMAL_INS 
order by NAME, DATETIME DESC;

-- 상위 n개 레코드
SELECT NAME 
from ANIMAL_INS
order by DATETIME
limit 1;

-- 최댓값 구하기
SELECT DATETIME as 시간
from ANIMAL_INS
order by DATETIME DESC
limit 1;
