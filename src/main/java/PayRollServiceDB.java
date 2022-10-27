/* UC5
Ability to retrieve salary data for a particular
employee as well as all employees who have
joined in a particular data range from the
payroll service database
- Use SELECT salary FROM employee_payroll
WHERE name = 'Bill’ Query to View Bill’s salary
- Use Select query with Where condition View employees
between start dates
- Query: WHERE start BETWEEN CAST('2018-01-01'
AS DATE) AND DATE(NOW());
- Note: Where Condition Clause is used to retrieve the row needed
from the table
- Note: Use of Database Functions like CAST() and NOW() in the
Query
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

     ======================================*/

}
}