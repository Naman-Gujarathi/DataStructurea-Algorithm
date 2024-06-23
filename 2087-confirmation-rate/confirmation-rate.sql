# Write your MySQL query statement below

With total_signups as (select s.user_id, count(*) as signup_count from Signups as s left join Confirmations as c  on s.user_id = c.user_id group by s.user_id),

confirmed_signup as (select s.user_id, count(c.action) as confirmed_count from Signups as s left join Confirmations as c on s.user_id = c.user_id and c.action = 'confirmed' group by s.user_id )

select t.user_id, Round((c.confirmed_count / t.signup_count), 2) as confirmation_rate from total_signups as t join confirmed_signup  as c
on t.user_id = c.user_id;