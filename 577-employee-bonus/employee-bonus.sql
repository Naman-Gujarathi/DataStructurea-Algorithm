# Write your MySQL query statement below
Select e.name, b.bonus 
From Employee
As e LEFT JOIN Bonus As b
ON e.empId = b.empId 
Where bonus < 1000 OR bonus IS NULL;