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