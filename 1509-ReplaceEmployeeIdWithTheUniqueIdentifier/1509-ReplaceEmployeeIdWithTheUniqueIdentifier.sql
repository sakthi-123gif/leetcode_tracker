-- Last updated: 7/10/2026, 9:32:16 AM
# Write your MySQL query statement below
SELECT euni.unique_id,e.name
FROM Employees e
LEFT JOIN EmployeeUNI euni
ON e.id=euni.id;