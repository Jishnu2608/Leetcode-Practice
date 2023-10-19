# Write your MySQL query statement below
delete x from person as x, person as y
where x.email = y.email
and x.id > y.id