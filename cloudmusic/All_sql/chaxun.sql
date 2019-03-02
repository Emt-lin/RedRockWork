SELECT *
FROM music m,singer s,music_singer m_s
WHERE m.mid=m_s.mid AND s.sid=m_s.sid