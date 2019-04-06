-- Create TAble
CREATE TABLE emp(
	eid VARCHAR(5) PRIMARY KEY,
	ename VARCHAR(50),
	age int,
	salary DECIMAL(10,2)
)

--Insert 
INSERT INTO emp VALUES(1010, '','');


-- Trigger
CREATE TRIGGER addLog
ON emp
FOR INSERT
AS
BEGIN
DECLARE @eid INT
SELECT @eid=eid FROM inserted
INSERT INTO empLog VALUES(@eid,getdate())
END

DROP TRIGGER addLog

-- work trigger
create trigger numEmpChk
on works
for insert, update
as 
begin



end

insert into emp values(1000,'Admin',10)
