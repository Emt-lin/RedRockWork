DESC album
SELECT * FROM album
ALTER  TABLE album ADD (
mid CHAR(32))
ALTER TABLE album ADD FOREIGN KEY (mid) REFERENCES music (mid)

select * 
from album a,music m,singer s 
where aname like 'nihao' and a.sid=s.sid and a.aid=m.aid order by aname limit 0,10


SELECT * FROM album WHERE aname LIKE '%nihao%' order by aname limit 0,10
SELECT * FROM music WHERE sid=1
