# Write your MySQL query statement below
(
    select u.name as results from movierating mr, users u
    where mr.user_id = u.user_id
    group by mr.user_id order by count(1) desc, u.name limit 1
)
union all
(
    select m.title as results from movierating mr, movies m
    where mr.movie_id = m.movie_id and mr.created_at like '2020-02%'
    group by mr.movie_id order by avg(rating) desc, m.title limit 1
)