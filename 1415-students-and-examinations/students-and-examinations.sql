# Write your MySQL query statement below
Select s.student_id, s.student_name, sub.subject_name, count(e.subject_name) As attended_exams 
From  Students as s Cross Join Subjects as sub LEFT JOIN Examinations as e 
ON s.student_id = e.student_id AND sub.subject_name = e.subject_name
Group by s.student_id, s.student_name, sub.subject_name
Order by s.student_id, s.student_name ;

