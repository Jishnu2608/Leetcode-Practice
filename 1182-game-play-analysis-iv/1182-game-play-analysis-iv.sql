# Write your MySQL query statement below
select round(
    (select count(distinct a.player_id) from activity a
    join (
        select player_id, min(event_date) as first_login from activity group by player_id
    ) b on datediff(a.event_date, b.first_login) = 1 and a.player_id = b.player_id
) / (select count(distinct player_id) from activity), 2) as fraction