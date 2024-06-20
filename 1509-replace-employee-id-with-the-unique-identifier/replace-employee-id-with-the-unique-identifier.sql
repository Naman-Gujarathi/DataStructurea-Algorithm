# Write your MySQL query statement below

select uni.unique_id, emp.name
 from Employees as emp
left JOIN EmployeeUNI as uni 
  on emp.id = uni.id; 


-- emp.id   emp.name    uni.id   uni.unique_id
-- 11        Meir.        11        2
-- 90.       winston      90        3
-- 3         jonathan     3         1
-- 1           Alice.     null     null
-- 7.         bob         null    null         