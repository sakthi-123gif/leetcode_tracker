-- Last updated: 7/10/2026, 9:33:50 AM
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;