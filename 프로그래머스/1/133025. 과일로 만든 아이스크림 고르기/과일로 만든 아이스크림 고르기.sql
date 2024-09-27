-- 코드를 입력하세요
SELECT f.FLAVOR from FIRST_HALF f
inner join ICECREAM_INFO i
on f.flavor = i.flavor
where TOTAL_ORDER > 3000 and INGREDIENT_TYPE = 'fruit_based'
order by TOTAL_ORDER desc