SHOW TABLES
CREATE TABLE tb_user(
 uid CHAR(32) PRIMARY KEY,
 username VARCHAR(50),
 `password` VARCHAR(50),
 email VARCHAR(50),
 sex VARCHAR(50),
 `code` CHAR(64),
 state boolean
 );
 DESC tb_user;
 
 CREATE TABLE music(
mid CHAR(32) PRIMARY KEY,
mname VARCHAR(50),
sid CHAR(32),
aid CHAR(32),
mtime VARCHAR(50),
FOREIGN KEY (sid) REFERENCES singer (sid),/*建立主外键关系*/
  FOREIGN KEY (aid) REFERENCES album (aid)/*建立主外键关系*/
)
ALTER TABLE music ADD FOREIGN KEY (aid) REFERENCES album (aid)

CREATE TABLE singer(
sid CHAR(32) PRIMARY KEY,
sname VARCHAR(50)
)
DESC singer

CREATE TABLE album(
aid CHAR(32) PRIMARY KEY,
anme VARCHAR(50)
)
ALTER TABLE album ADD(
sid CHAR(32))
ALTER TABLE album ADD FOREIGN KEY (sid) REFERENCES singer (sid)

DESC album

CREATE TABLE album_singer(
aid CHAR(32) ,
sid CHAR(32) ,
PRIMARY KEY(aid,sid),
FOREIGN KEY (aid) REFERENCES album (aid),
FOREIGN KEY (sid) REFERENCES singer (sid)
)
CREATE TABLE music_singer(
mid CHAR(32),
sid CHAR(32),
PRIMARY KEY(mid,sid),
FOREIGN KEY (mid) REFERENCES music (mid),
FOREIGN KEY (sid) REFERENCES singer (sid)
)
DELETE FROM singer


CREATE TABLE tb_user_music(
uid VARCHAR(20),
mid CHAR(32),
PRIMARY KEY(uid,mid),
FOREIGN KEY (uid) REFERENCES tb_user (uid),
FOREIGN KEY (mid) REFERENCES music (mid)
)
CREATE TABLE `comment`(
id INT(11),
uid CHAR(20),
text VARCHAR(255),
pid INT(11),
FOREIGN KEY (uid) REFERENCES tb_user (uid),
PRIMARY KEY (`id`) USING BTREE
)