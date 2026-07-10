-- Last updated: 7/10/2026, 9:31:38 AM
# Write your MySQL query statement below
SELECT user_id , COUNT(follower_id) as followers_count
FROM Followers
GROUP BY user_id
ORDER BY user_id ASC;