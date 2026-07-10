-- Last updated: 7/10/2026, 9:33:58 AM
# Write your MySQL query statement below
Select m.name
from employee as e
inner join employee as m
on e.managerId=m.id
group by e.managerId 
having count(e.id)>=5