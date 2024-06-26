# Write your MySQL query statement below

select contest_id, Round(Count(u.user_id) / (select Count(*) from Users) * 100, 2) as percentage from Users u join Register r on u.user_id = r.user_id group by contest_id order by percentage desc, contest_id asc;

