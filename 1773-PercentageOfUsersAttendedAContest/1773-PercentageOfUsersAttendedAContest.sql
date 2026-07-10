-- Last updated: 7/10/2026, 9:31:53 AM
SELECT DISTINCT
    contest_id,
    ROUND(
        (COUNT(contest_id) * 100) / (SELECT COUNT(*) FROM Users),
        2
    ) AS percentage
FROM Register
GROUP BY contest_id
ORDER BY percentage DESC, contest_id ASC;