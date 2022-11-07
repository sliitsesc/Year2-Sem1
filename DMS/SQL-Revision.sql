--Q1--

CREATE TABLE Emp
(
	eid INTEGER PRIMARY KEY,  --add primary key - 1st way
	ename VARCHAR(225) NOT NULL,
	age INTEGER,
	salary REAL,

	CONSTRAINT emp_chk CHECK (salary > 0)
);

--Q2--

CREATE TABLE Dept
(
	did VARCHAR (20),
	budger REAL,
	managerID INTEGER REFERENCES Emp, -- add foreign key - 1st way
	PRIMARY KEY (did) --add primary key - 2nd way
);

--Q3--

CREATE TABLE Works
(
	eid INTEGER,
	did VARCHAR (20),
	pct_time INTEGER, 

	CONSTRAINT Works_pk PRIMARY KEY (eid,did), -- add primary key - 3rd way
	CONSTRAINT Works_Emp_fk FOREIGN KEY (eid) REFERENCES Emp, -- add foreign key - 2nd way
	CONSTRAINT Works_Dept_fk FOREIGN KEY (did) REFERENCES Dept -- add foreign key - 2nd  way
);

--Q4--

INSERT INTO Emp VALUES (1000,'Ruwan', 33, 40000); -- insert value in to Emp table - 1st way
INSERT INTO Emp(eid,ename,salary) VALUES (1001,'Nuwan',55000); -- insert value in to Emp table - 2nd way(we can specify the table column)

-- get all data in the Emp 

SELECT *
FROM Emp;

-- Select clause - basic form --
		-- SELECT <attributes>
		-- FROM <one or more relations>
		-- WHERE <conditions>


--Q5--

ALTER TABLE Emp -- update table (ALTER)
ADD hireDate date DEFAULT getDate(); -- add hireDate column to the Emp table and the default hireDate value is todays date (getDate)
 
SELECT *
FROM Emp
-- Since this table was created and when we introduce a new value it will not get the default value, 
			-- unless we updates. The column will be added unless we updates it we won't able to get the default value.
 
INSERT INTO Emp(eid,ename,age,salary) VALUES (1002,'Shaml',25,45000);
  
SELECT *
FROM Emp


--Q6--
UPDATE Emp
SET hireDate = '1-Jan-2010'  -- update hireDate as '1-Jan-2010' whre the eid is '1000'
WHERE eid = 1000;

SELECT *
FROM Emp 

--Q7--
DELETE Emp
WHERE eid = 1000;  -- delete row whre the eid is '1000'

SELECT *
FROM Emp
-- but hireDate column is not possible to delete,
			-- since we added hireDate column with default constraints we cannot drop the column in normal way

-- inorder to drop the column with constraints,
		    -- 1st step - drop the constraints
			ALTER TABLE Emp
			DROP CONSTRAINT DF__Emp__hireDate__668030F6;  -- constraint name will be automatically generated

			-- 2nd step - drop the column
			ALTER TABLE Emp
			DROP COLUMN hireDate;

SELECT *
FROM Emp 

--Q9--
-- nommally if we want to delete the table we used,
DROP TABLE Emp;

--since it referenced by a foreign constraints we cannot drop the Emp table in nomal way
--inorder to drop the table
			-- 1st way - we can drop the Dept and Works tables
			-- 2nd way - we can drop the foreign keys in the Emp table


--Q10--
SELECT ename,salary
FROM Emp;

--Q11-List the name and the salary of all employees in the descending order of his/her salary--
SELECT ename,salary
FROM Emp
ORDER BY salary DESC;

--Q12-Display the name and the salary of all employees who obtain a salary greater than 50000.--
SELECT ename,salary
FROM Emp
WHERE salary > 50000;

--Q13-Display the name of all employees whose name starts with a letter ‘S’--
SELECT ename
FROM Emp
WHERE ename LIKE 'S%';


-- LIKE operator -- 

	-- used for match patterns 
	-- syntax : <string> LIKE <pattern>
	-- <pattern> may contain two special symbols: 
				-- (1)       %   - any sequence of characters
										-- Ex: LIKE '%i' - any sequence of characters can be before the 'i' and should end with 'i'
										-- Ex: LIKE 'i%' - any sequence of characters can be after the 'i' and should start with 'i'
				-- (2)       _   - any single characters
										-- Ex: LIKE '%i_' - any sequence of characters can be before the 'i' and should end with any single character											



--Q14-For each department display the department name and the name of the manager--
 
--insert values to Dept table--
INSERT INTO Dept VALUES ('D001',20000,1001);
 
SELECT d.did,e.ename
FROM Emp e, Dept d
WHERE e.eid = d.managerID;


--Q15-or each employee who is earning more than 75000 display the name of the employee and the id of the manager--

--insert values to Emp table--
INSERT INTO Emp VALUES (1003,'Anura',35,31000);
INSERT INTO Emp VALUES (1004,'Minura',37,45000);
INSERT INTO Emp VALUES (1005,'Ann',25,44000);
INSERT INTO Emp VALUES (1006,'Nusann',45,78000);
--insert values to Dept table--
INSERT INTO Dept VALUES ('D002',25000,1004);
INSERT INTO Dept VALUES ('D003',32000,1006);
--insert values to Works table--
INSERT INTO Works VALUES (1001,'D001',5);
INSERT INTO Works VALUES (1004,'D002',3);
INSERT INTO Works VALUES (1006,'D003',4);

--Display all the values of the tables--
SELECT * FROM Emp
SELECT * FROM Dept
SELECT * FROM Works


--answer--
SELECT e.ename, d.managerID
FROM Emp e, Works w, Dept d
WHERE e.eid = w.eid AND d.did = w.did AND e.salary  >75000


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Drop Table Works
Drop Table Dept
Drop Table Emp


CREATE TABLE Emp
(
	eid INTEGER PRIMARY KEY,  --add primary key - 1st way
	ename VARCHAR(225) NOT NULL,
	age INTEGER,
	salary REAL,

	CONSTRAINT emp_chk CHECK (salary > 0)
);


CREATE TABLE Dept
(
	did VARCHAR (20),
	budger REAL,
	managerID INTEGER REFERENCES Emp, -- add foreign key - 1st way
	PRIMARY KEY (did) --add primary key - 2nd way
);


CREATE TABLE Works
(
	eid INTEGER,
	did VARCHAR (20),
	pct_time INTEGER, 

	CONSTRAINT Works_pk PRIMARY KEY (eid,did), -- add primary key - 3rd way
	CONSTRAINT Works_Emp_fk FOREIGN KEY (eid) REFERENCES Emp, -- add foreign key - 2nd way
	CONSTRAINT Works_Dept_fk FOREIGN KEY (did) REFERENCES Dept -- add foreign key - 2nd  way
);

INSERT INTO Emp VALUES(1000,'Lakmal',33,90000);
INSERT INTO Emp VALUES(1001,'Nadeeka',24,28000);
INSERT INTO Emp VALUES(1002,'Amila',26,35000);
INSERT INTO Emp VALUES(1003,'Nishani',28,60000);
INSERT INTO Emp VALUES(1004,'Krishan',36,95000);
INSERT INTO Emp VALUES(1005,'Surangi',37,22000);
INSERT INTO Emp VALUES(1006,'Shanika',24,18000);
INSERT INTO Emp VALUES(1007,'Amali',21,20000);
INSERT INTO Emp VALUES(1008,'Charith',28,35000);
INSERT INTO Emp VALUES(1009,'Prasad',40,905000);

INSERT INTO Dept VALUES('Academic',900000,1002);
INSERT INTO Dept VALUES('Admin',120000,1000);
INSERT INTO Dept VALUES('Finance',3000000,1008);
INSERT INTO Dept VALUES('ITSD',45000000,1000);
INSERT INTO Dept VALUES('Maintenance',40000,1004);
INSERT INTO Dept VALUES('SESD',20000,1004);
INSERT INTO Dept VALUES('Marketing',90000,1008);

INSERT INTO Works VALUES(1000,'Admin',40);
INSERT INTO Works VALUES(1000,'ITSD',50);
INSERT INTO Works VALUES(1001,'Admin',100);
INSERT INTO Works VALUES(1002,'Academic',100);
INSERT INTO Works VALUES(1003,'Academic',20);
INSERT INTO Works VALUES(1003,'Admin',20);
INSERT INTO Works VALUES(1003,'ITSD',45);
INSERT INTO Works VALUES(1004,'Academic',60);
INSERT INTO Works VALUES(1004,'Finance',30);
INSERT INTO Works VALUES(1006,'Finance',30);
INSERT INTO Works VALUES(1006,'Maintenance',52);
INSERT INTO Works VALUES(1008,'Finance',35);
INSERT INTO Works VALUES(1008,'ITSD',30);
INSERT INTO Works VALUES(1008,'Maintenance',30);
INSERT INTO Works VALUES(1009,'Admin',100);

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

--Q16-Display the names of employees who are not assigned to any department yet --

-- 1st way - using NOT IN
SELECT ename 
FROM Emp
WHERE eid NOT IN ( SELECT DISTINCT eid    -- DISTINCT - remove duplicates
				   FROM Works );

-- 2nd way - using NOT EXISTS
SELECT e.ename 
FROM Emp e
WHERE NOT EXISTS ( SELECT *    
				   FROM Works w
				   WHERE w.eid = e.eid);

-- 3rd way - outer join
SELECT e.ename
FROM Emp e LEFT OUTER JOIN Works w ON e.eid = w.eid
WHERE w.did IS NULL;

--Q17 -Display the names and the ages of each employee who works in either ‘ITSD’ or ‘Academic’ departments--

-- 1st way - using IN
SELECT DISTINCT e.ename , e.age
FROM Emp e, Works w
WHERE e.eid = w.eid AND w.did IN ('ITSD','Academic');


-- 2nd way - using OR                                                                     
SELECT DISTINCT e.ename , e.age
FROM Emp e, Works w
WHERE e.eid = w.eid AND (w.did = 'ITSD' OR w.did = 'Academic');


--Q18 - Display the names and the ages of each employee who works in both ‘ITSD’ and ‘Academic’ departments--

--1st way 
SELECT DISTINCT e.ename , e.age
FROM Emp e, Works w
WHERE e.eid = w.eid AND w.did = 'ITSD' AND w.eid IN (SELECT eid 
													 FROM Works 
--2nd way 
SELECT DISTINCT e.ename , e.age
FROM Emp e, Works w
WHERE e.eid = w.eid AND w.eid IN (SELECT eid 
								  FROM Works 
								  WHERE did = 'ITSD')  AND 
						w.eid IN (SELECT eid 
								  FROM Works 
								  WHERE did = 'Academic');	
								  


--Q19-For all departments, display the name of the department and the names of the employees working in it--

SELECT e.ename, w.did 
FROM Works w, Emp e
WHERE w.eid = e.eid


--Q20-Display the minimum and maximum salary of employees.

SELECT ename, MAX(salary) AS 'Maximum Salary', MIN(salary) AS 'Minimun Salary'
FROM Emp
GROUP BY ename
											 WHERE did ='Academic');