/*고양이와 개는 몇 마리 있을까*/
SELECT ANIMAL_TYPE,COUNT(*) AS COUNT
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE;

/*동명 동물 수 찾기*/
SELECT NAME, COUNT(*) AS COUNT
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
GROUP BY NAME
HAVING COUNT(NAME)>1
ORDER BY NAME;

/*입양 시각 구하기(1)*/

SELECT HOUR(DATETIME) AS HOUR, COUNT(*) AS COUNT
FROM ANIMAL_OUTS
GROUP BY HOUR
HAVING HOUR>=9 AND HOUR<=19
ORDER BY HOUR;

/*입양 시각 구하기(2)*/
/*모든 시간대(0시~23시)를 조회, 쿼리문에서 로컬 변수를 활용하는 문제*/
SET @HOUR=-1;

SELECT @HOUR:=@HOUR+1,
(SELECT COUNT(HOUR(DATETIME))  
FROM ANIMAL_OUTS 
WHERE @HOUR=HOUR(DATETIME)) AS COUNT
FROM ANIMAL_OUTS
WHERE @HOUR<23;
