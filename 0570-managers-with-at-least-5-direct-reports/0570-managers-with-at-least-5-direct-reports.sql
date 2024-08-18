# Write your MySQL query statement below
select e1.name 
from Employee e1
inner join Employee e3
on e1.id=e3.managerId
group by e1.name,e1.id
having count(e3.managerId)>= 5;