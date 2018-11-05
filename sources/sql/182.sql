# Write your MySQL query statement below
# GROUP BY 语句用于结合合计函数(比如SUM)，根据一个或多个列对结果集进行分组。
# 使用HAVING子句的原因是WHERE无法与合计函数一起使用
SELECT Email FROM Person GROUP BY Email HAVING COUNT(Email) > 1;
