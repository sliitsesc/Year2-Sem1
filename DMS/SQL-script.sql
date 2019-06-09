-- Views
create view //

-- Funtions 
create Funtion getEmployeeSal(@did varchar) returns real
as
begin 
    declare @totSal real
    select @totSal = sum(salary)
    from emp e
    where e.did = @did
    return totSal
end

-- procedure 
create procedure increaseSalary(@pct float)
as 
begin
    update emp
    set salary = salary + salary * (pct/100)
end

-- stored procedure
create procedure get_stats(@did varchar(12), @maxm real output, @minm real output)
as
begin
    select @maxm = max(e.salary), @minm = min(e.salary)
    from dept d, works w, emp e
    where d.did = w.did and w.eid = e.eid and d.did = @did
end

-- Ex 3 
create procedure getManager(@did varchar(12), @name varchar(50) output, @salary real output)
as 
begin
    select @name = e.name, @salary = e.salary
    from emp e, dept d, works w
    where w.eid = e.eid and d.did = w.did and d.did = @did
end

-- triggers
/* 
    Create a trigger to track all inserts/updates done to the balance field of an Account table at a bank in 
    the AccountAudit table
 */
create trigger account
on account
for insert, update
as
begin
    declare @ano int 
    declare @balance float

    select @ano = accountNo, @balance = balance from inserted
    insert into accountAudit(@ano, @balance, getdate())
end