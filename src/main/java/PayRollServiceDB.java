/* UC6
Ability to add Gender to Employee
Payroll Table and Update the Rows to
reflect the correct Employee Gender
- Use payroll_service database in MSSQL Client
- Use Alter Table Command to add Field gender after
the name field
- Use Update Query to set the gender using where
condition with the employee name
- E.g. UPDATE employee_payroll set gender =
'M' where name = 'Bill' or name =
'Charlie';
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
    ======================================*/

}
}