/* UC11
Implement the ER Diagram
into Payroll Service DB
- Create the corresponding tables as
identified in the ER Diagram along
with attributes
- For Many-to-Many relationship,
create new Table called Employee
Department having Employee id and
Department ID and redo the UC 7
 */
public class PayRollServiceDB {
    public static void main(String[] args) {

    /*=====================================
 create database  payroll_service;
 show databases;
 use payroll_service;
 create table employee_payroll(id int auto_increment,name varchar(255) Not Null,salary double Not Null,startdate date Not Null,primary key (id));
 select * from employee_payroll;
 insert into employee_payroll (name,salary,startdate)values('Radhika','1000000','23-10-2022'),
 ('Radhika','1000000','23-10-2022'),
 ('Ramu','2000000','24-10-2022'),
 ('Harsha','3000000','23-10-2022');
 select * from employee_payroll;
 select * from employee_payroll where name='Radhika';
 select * from employee_payroll where startdate between cast('23-10-2022' as date) and date(now());
 alter table employee_payroll add gender char(1) after name;
 update employee_payroll set gender ='M' where name = 'Ramu' or name ='Harsha';
 update employee_payroll set gender ='F' where name = 'Radhika';
 select * from employee_payroll;
 select sum(salary) from employee_payroll where gender ='M' group by gender;
 select avg(salary) from employee_payroll group by gender;
 select min(salary) from employee_payroll group by gender;
 select max(salary) from employee_payroll group by gender;
 alter table employee_payroll add empPhn varchar(25) not null,add address varchar(255) default 'Hyd',add department varchar(255) not null;
 alter table employee_payroll rename column salary to basicPay;
 alter table employee_payroll add deductions varchar(255) not null after basicPay,
 add taxablePay varchar(255) not null after deductions,
 add incomeTax varchar(255) not null after taxablePay,
 add netPay varchar(255) not null after incomeTax;
 insert into employee_payroll (empName,basicPay,deductions,taxablePay,incomeTax,netPay,startdate,gender,empPhn,address,department)values('Terrisa','300000','3000','1000','200','200000','2022-10-26','F','33333333','mumbai','Sales');
 insert into employee_payroll (empName,basicPay,deductions,taxablePay,incomeTax,netPay,startdate,gender,empPhn,address,department)values('Terrisa','300000','3000','1000','200','200000','2022-10-26','F','33333333','mumbai','marketing');
 create table employee_department(departmentId int auto_increment,empId int Not Null,primary key (departmentId),foreign key(empId) references employee(empId));
 create table company(companyName varchar(255),noOfEmployees int Not Null,companyPhno int Not Null,departments int Not Null,departmentName varchar(255));
 create table employee(empId int auto_increment,empName varchar(25) not null,departmentName varchar(255),empSalary double Not Null,empPhno int Not Null,companyName varchar(255),startdate date Not Null);
 create table payroll(basicPay double Not Null,deductions double Not Null,taxablePay double Not Null,incomeTax double Not Null,netPay double Not Null,empName varchar(25),departmentName varchar(255));
 create table department(departmentId int,departmentName varchar(255),empName varchar(25));
 insert into employee_department(empId) values('1'),('2'),('3');
 insert into employee(empName,departmentName,empSalary,empPhno,companyName,startdate)
 values('Radhika','TechnicalSupport','1000000','222222222','DigitalRupay','25-10-2022'),
 ('Ramu','Sales','2000000','333333333','wipro','26-10-2022'),
 ('Harsha','HR','5000000','2345678678','Google','25-10-2022');
 insert into payroll(basicPay,deductions,taxablePay,incomeTax,netPay,empName,departmentName)
 values('1000000','1000','100','200','150000','Radhika','TechnicalSupport'),
 ('2000000','2000','1000','2000','250000','Ramu','Sales'),
 ('5000000','2000','10000','20000','550000','Harsha','HR');
 select count(departmentName) from department group by empName;
 select sum(empSalary) from employee where departmentName ='sales' group by empName;
 select avg(basicPay) from payroll;
 select min(basicPay) from payroll;
 select max(basicPay) from payroll;
 select * from employee where startdate between cast('23-10-2022' as date) and date(now());
 select * from payroll;
    ======================================*/

}
}