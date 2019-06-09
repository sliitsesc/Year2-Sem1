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
