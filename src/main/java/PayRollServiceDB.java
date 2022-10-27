/* UC10
Ability to make Terissa as part of
Sales and Marketing Department
- Note: The Complete employee payroll
roll need to be Inserted
- If a Salary is now going to be updated
multiple rows has to be updated
creating unnecessary redundancy
- Further There is 2 Employee ID so
according to Database there is two
different Terissa
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

    ======================================*/

}
}