--Q1--

CREATE TABLE Emp
(
	eid INTEGER PRIMARY KEY,  --add primary key - 1st way
	ename VARCHAR(225) NOT NULL,
	age INTEGER,
	salary REAL,

	CONSTRAINT emp_chk CHECK (salary > 0)
);

