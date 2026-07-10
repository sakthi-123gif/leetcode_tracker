-- Last updated: 7/10/2026, 9:33:13 AM
# Write your MySQL query statement below
# Write your MySQL query statement below

SELECT  customer_id FROM Customer GROUP BY customer_id
HAVING COUNT(distinct product_key) = (SELECT COUNT(product_key) FROM Product)