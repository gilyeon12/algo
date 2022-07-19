-- 고양이와 개는 몇 마리 있을까
SELECT ANIMAL_TYPE, count(ANIMAL_TYPE) AS count 
from ANIMAL_INS
group by ANIMAL_TYPE
order by ANIMAL_TYPE; -- order by 추가 필수!

-- 동명 동물 수 찾기
SELECT NAME, count(NAME)
from ANIMAL_INS
group by NAME
having count(NAME) >= 2
order by NAME asc;

-- 입양 시각 구하기(1)
SELECT HOUR(DATETIME) HOUR, COUNT(DATETIME) COUNT
FROM ANIMAL_OUTS
GROUP BY HOUR(DATETIME)
HAVING HOUR BETWEEN 9 AND 19
ORDER BY HOUR ASC;

-- 입양 시각 구하기(2)
SET @hour := -1; -- 변수 선언

SELECT (@hour := @hour + 1) as HOUR, 
(SELECT COUNT(DATETIME) FROM ANIMAL_OUTS WHERE HOUR(DATETIME) = @hour) as COUNT
FROM ANIMAL_OUTS
WHERE @hour < 23;


