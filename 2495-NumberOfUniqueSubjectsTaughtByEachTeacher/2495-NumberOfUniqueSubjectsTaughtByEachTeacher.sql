-- Last updated: 7/10/2026, 9:30:50 AM
# Write your MySQL query statement below
select teacher_id ,  COUNT(DISTINCT(subject_id)) as cnt
from teacher
GROUP BY teacher_id;