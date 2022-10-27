/* UC7
Ability to find sum, average, min, max
and number of male and female
employees
- Use payroll_service database in MSSQL Client
- Use Database Function SUM, AVG, MIN, MAX, COUNT
to do analysis by Male or Female.
- Note: You will need to use GROUP BY GENDER grouping to
get the result
- E.g. SELECT SUM(salary) FROM employee_payroll
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
    ======================================*/

}
}