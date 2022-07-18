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


