/*Question 1*/
create table emp(
	eid integer primary key,
	ename varchar(25) not null,
	age int,
	salary real,
    constraint s check (salary > 0)
);