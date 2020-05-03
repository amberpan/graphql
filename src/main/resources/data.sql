drop table if exists employee
drop table if exists address

create table employee(employee_id INTEGER primary key,first_name varchar(25) not null,last_name varchar(25) not null,department varchar(25) null,zip INTEGER)
create table address(zip INTEGER primary key,city varchar(25) not null,state varchar(25) not null,country varchar(25) null)

insert into employee values(1, 'A','Z','WM',111)
insert into employee values(2, 'B','Y','WM',111)
insert into employee values(3, 'C','X','WM',111)
insert into employee values(4, 'D','W','WM',111)
insert into employee values(5, 'E','V','WM',112)
insert into employee values(6, 'E','V','WM',112)
insert into employee values(7, 'E','V','WM',112)
insert into employee values(8, 'E','V','WM',113)
insert into employee values(9, 'E','V','WM',113)


insert into address values(111, 'ABC','XYZ','IN')
insert into address values(112, 'DEF','XYZ','US')
insert into address values(113, 'GHI','XYZ','US')
