use toeiconline;
ALTER TABLE userentity MODIFY COLUMN name VARCHAR (255) NOT NULL;
ALTER TABLE userentity MODIFY COLUMN password VARCHAR (255) NOT NULL;
ALTER TABLE userentity MODIFY COLUMN roleid BIGINT(20) NOT NULL;