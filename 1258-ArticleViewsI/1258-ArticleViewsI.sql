-- Last updated: 7/10/2026, 9:32:44 AM
# Write your MySQL query statement below
select distinct author_id as id from Views
where author_id=viewer_id
order by id;