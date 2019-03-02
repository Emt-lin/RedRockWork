SELECT * FROM `music`

SELECT *
FROM music m,singer s,album a
WHERE mname LIKE'%nihao%' AND m.sid=s.sid AND m.aid=a.aid

DELETE  from music

SELECT * FROM music m,singer s,album a WHERE mname LIKE'%nihao%' AND m.sid=s.sid AND m.aid=a.aid ORDER BY mname LIMIT 0,10

SELECT count(*) FROM music WHERE mname LIKE'%nihao%'

SELECT * FROM music ORDER BY mname LIMIT 1,1
 