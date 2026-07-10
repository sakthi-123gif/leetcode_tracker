-- Last updated: 7/10/2026, 9:33:43 AM
# Write your MySQL query statement below
select * from Cinema Where id%2=1 AND description!='boring'
ORDER BY rating DESC;