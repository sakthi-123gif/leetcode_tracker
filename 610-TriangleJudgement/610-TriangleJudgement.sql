-- Last updated: 7/10/2026, 9:33:47 AM
# Write your MySQL query statement below
select *, if(x+y>z and y+z>x and x+z>y, "Yes","No") as triangle from triangle