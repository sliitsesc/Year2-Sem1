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


