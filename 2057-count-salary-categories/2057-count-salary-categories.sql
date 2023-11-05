# Write your MySQL query statement below
(select "Low Salary" as category, 
count(income) as accounts_count from accounts 
where income < 20000)
union
(select "Average Salary" as category, 
count(income) as accounts_count from accounts 
where 20000 <= income and income <= 50000)
union
(select "High Salary" as category, 
count(income) as accounts_count 
from accounts where 50000 < income)