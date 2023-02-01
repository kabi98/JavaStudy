=================================
-- ����Ŭ ��ġ�� ȯ�汸��
-- ����Ŭ ��ġ�� �ǽ�ȯ�� ����
C:\Users\smhrd> sqlplus / as sysdba

sql>@C:\Users\user\Desktop\DataBase\create_scott.sql

-- ����Ŭ ����
-- �������
C:\Users\smhrd>sqlplus hr/hr

-- �н��� table�� ��ȸ
select table_name from user_tables;

-- ���̺��� ������ ��ȸ
desc departments
desc employees

-- �μ� ���̺� �ڷ��� ��ȸ
select * from departments;

--sqlplus ����
show user;
COLUMN last_name format a18;
COLUMN department_name format a18;
show user;

-- ���� ����
ed  -- �޸��� ����
SQL> /   -- ����

=================================
-- 5�� DQL(Data Query language)
=================================
-- Select
--   From
-- [where
-- Group by
-- Having
-- Order By ]
--
-- 1.SELECT ���� ���
--  1-1 *  : from ���� ����� ���̺��� ����׸� ��ȸ
      select * from departments;  -- ������
	  select department_name from departments; -- ��������
--- 1-2 from���� ����� �÷��� ���, �������� �÷��� ','�� �����Ѵ�.
	  select department_id, department_name
	    from departments;  -- �������
--- 1-3 distinct : �ߺ��� �����Ѵ�.
      select job_id
	    from employees;
      select distinct job_id
	    from employees;
      select distinct job_id, department_id
	    from employees;
--- 1-4 ����(alias)
	  select last_name lname, salary
  	    from employees;
	  select last_name as lname, salary
		from employees;
	 -. ���Ӹ��� �빮�ڷ� ǥ��ǰ�, ���ڴ� ��������, ���ڴ� ������ �����Ѵ�.
	  select last_name "Lname", salary
  	    from employees;
	  select last_name as "Lname", salary
		from employees;
--- 1-5 ����(+, -, *, /)�� �����ϴ�.
      select last_name, (salary * 12) annsal
	      from employees;
	  -. ������ �켱������ ������.(*, /,+, -)
--- 1-6 ���꿡 null�� ������ ����� Null�̴�.
      select last_name, salary,
	       (salary * commission_pct) cmmsal
	  from employees;
--- 1-7. ���ڿ��� ����(||)
	  select (last_name || first_name) irum
        from employees;
   	  select (last_name || '-' || first_name) irum
        from employees;

-- 2.From�� �� ���
--- 2-1 ���̺� ��, view��
--- 2-2 ������ ��
--- 2-3 �������� ���̺���� ���(����)
--- 2-4 ������ ���̺� dual;

-- 3.where��(������) �� ���
--  3-1.���ǽ� ������� �ϼ��Ǿ�� �Ѵ�.
   ������ȣ�� 100�� ������ �̸��� ��ȸ�Ͻÿ�..
    select last_name
	  from employees
	 where employee_id = 100;
--  3-2.������ �������� ����(and, or)�����ϰ� ����
     ���ǵ� ������ ��� �����Ǿ�� �Ѵ�.
   �μ��� 50�μ��̰�, ������ 'IT_PROG'�� ������ �̸�, �޿��� ��ȸ�Ͻÿ�..
	  select last_name, job_id, salary
	    from employees
       where department_id = 50
         and job_id ='ST_MAN';
--  3-3.���ڿ�, ��¥�� ���Ҷ����� Ȭ����ǥ('')�ȿ� ǥ���Ѵ�.
--  3-4.���ڿ� ���� ���� ������ ��ҹ��ڰ� �����ȴ�.
--  3-5.������ �켱������ �ִ�.(and, or)
     select last_name, job_id, salary
	    from employees
       where job_id ='IT_PROG'
	      or job_id ='AD_PRES'
	     and salary > 15000;

--  3-6 ������ ��ȸ�ϴ� 2���� ���
     select last_name, job_id, salary
	    from employees
       where salary >=  5000
		 and salary <=  10000;
		(=)
      select last_name, job_id, salary
	    from employees
       where salary between 5000  and 10000;
--  3-7 ����(�Ҽ�) �ϴ� 2���� ���
     select last_name, department_id,
	          job_id, salary
	    from employees
       where department_id = 10
	      or department_id = 30
	      or department_id = 70;
		  (=)
	   select last_name, department_id,
	          job_id, salary
	    from employees
       where department_id IN (10,30,70);

--  3-8 ����� �ڷ� like
  	 last_name like 'M%'
  	 % : ��� ���ڿ��� �����ϴ�.
  	 _ : �� ���ڿ��� ����. ( last_name like '__c%')
     select last_name, salary
	   from employees
	  where last_name like 'M%';

	 select last_name, salary
	   from employees
	  where last_name like '__c%'

--  3-9 null �� ��
    -- �߸��� ��
  	 commission_pct = ''
    -- �ߵ� ��
  	 commission_pct is null
  	 commission_pct is not null
    -. 0�� ��ȸ
     select last_name, salary
       from employees
       where commission_pct is null;
--       where commission_pct is not null

-- 4. order by ����
    - �÷�, ���� [asc || desc]
        last_name desc
	-.�⺻�� asc
	    last_name
	-. �����÷��� ����
	-. col1 , col2 desc, col3

-- 5. Query�� ���� ����
	-. From > Where > Group By > Having > Select > Order By

=================================
-- 6�� ������ �Լ�
-- �Լ��� ���� : �����Լ�, ����� ���� �Լ�
-- �����Լ� ���� : ������ �Լ�, ������ �Լ�

-- ������ �Լ� ���� : ����, ����, ��¥�Լ�
-- �����Լ� : LOWER, upper, INITCAP, concat,
		   substr, length, instr, replace,
--		   trim
-- �����Լ� : round, trunc, mod
-- ��¥�Լ� :
		   sysdate, MONTHS_BETWEEN, ADD_MONTHS, LAST_DAY
-- �Ϲ� �Լ�:
		   nvl, case
=================================
-- �����Լ�
select lower('ABCD')   from dual;

select upper('abcd')   from dual;

select initcap('abcd') from dual;

select upper(last_name) from employees;

select CONCAT(FIRST_name, last_name) fname
from employees;

select last_name, length(last_name) len_name
from employees;

select last_name, instr(last_name,'i') in_name
from employees;

select last_name, substr(last_name,1,4) sub_name
from employees;

select lpad('inho', 10, '#') from dual;
select rpad('inho', 10, '#') from dual;

select '[' || '  abcd  ' || ']' from dual;
select trim('  abcd  ') from dual;
select '[' || trim('  abcd  ') || ']' from dual;
select trim('b' from 'abcd') from dual;

select replace('inho', 'in','Shin') from dual;
--
select substr('shin@navar.com', 1,4) as sub_irum,
	 instr('inho', 'h')            as in_irum,
	 instr('inho', 'A')            as in_irum2,
	 replace('inho', 'in', 'Shin') as re_irum
from dual;

--  �����Լ�
select 12.345678 as idat,
	mod(10,3) as div_mod,
	round(12.345678, 2) as run2,
	trunc(12.345678, 2) as trun2
from dual;
select round(avg(salary), 2) aa from employees;

select round(avg(salary), -1) aa from employees;

select 10/3 dd1, mod(10, 3) dd2, round(10/3, 2) dd3 from dual;

select trunc(45.3271,2) from dual;

-- ��¥
select last_name, hire_date,
       round((sysdate - hire_date) / 7, 0) weeks
from employees;

select MONTHS_BETWEEN(sysdate, '2022-01-01') from dual;

select add_MONTHS(sysdate, 3) from dual;

select last_day('2022.02.01') from dual;

select next_day('2022.02.01', 3) from dual;
   -- 1: �Ͽ���, 2: ������, 3: ȭ����, 4: ������, 5: �����, 6: �ݿ���, 7: �����
--
select sysdate as now_date,
	 MONTHS_BETWEEN(sysdate,'2022.12.31') as Betwmm
from dual;
select sysdate as now_date,
	MONTHS_BETWEEN(sysdate,'2022.12.31') as Betwmm,
	add_months(sysdate, 3) add_mon,
	last_day(sysdate) lday,
	-- 1: ��, 2: ��, 3: ȭ, 4: ��, 5:��, 6:��,7:��
	next_day(sysdate, '��')
from dual;

select sysdate - 7 as date7 from dual;

-- �������� ����ȭ : ������, ����� ����ȭ
-- �Ͻ���(������), ����� �� ��ȯ
select 100 + '200' from dual;

select 100 + '2a' from dual;

select '100' + '200' from dual;

select 100 || '200' from dual;

select 100 || 200, (100 || 200) + 100 from dual;
select 100 || 200, 100 || (200 + 100) from dual;

-- ����� ����ȯ(����, ����, ��¥.)
-- to_cahr, to_date, to_number

select ('1' + to_number('2')) as tmp from dual;

select to_number('123456') aa from dual;
select to_char(123456) aa from dual;
select to_date(123456) aa from dual;

select last_name, hire_date,
       to_char(hire_date,'yyyy-mm') �Ի���
from employees

select '2022-07-08' dat  from dual;
select to_date('2022-07-08') dat  from dual;

select '123', to_number('123')
  from dual;
select to_number('123') + 100
  from dual;

-- �������� ��ȸ ������ ����
select last_name, hire_date, salary
  from employees;
select last_name,
	   to_char(hire_date,'yyyy-mm-dd') hire_date,
	   to_char(salary, '999,999') salary
  from employees;
select TO_DATE('2022-09-08')
  from dual;
-- ����
select to_number('12345dd')
  from dual;

-- �Ϲ��Լ� : nvl, case
-- nvl(commission_pct,0)
select last_name, salary,
       (salary * 12 * commission_pct) annual
  from employees;

select last_name, salary, commission_pct,
       (salary * (1 + nvl(commission_pct,0))) sal_com,
       (salary * (1 + nvl(commission_pct,0)))*12 annual
  from employees;
-- ��ø�Լ�
select last_name,
       nvl(to_char(manager_id), 'No Manager') as mgr
  from employees;

-- ������ �ִ� ���� ��ȸ, ����..
--   case when then [when then ..] else end
-- ������ IT_PROG: 10%, ST_CLERK : 15%, SA_REP:20%�� ���ʽ��� �����Ͽ�
--  �̸�, ����, �޿�, ���ʽ������� �ݾ��� ��ȸ�Ͻÿ�
	select last_name, job_id, salary,
	    (case job_id
		   when 'IT_PROG'  then salary * 1.10
		   when 'ST_CLERK' then salary * 1.15
		   when 'SA_REP'   then salary * 1.20
		else salary
		end) as bonsal
	from employees;

	select last_name, job_id, salary,
	    decode(job_id,
		   'IT_PROG' ,  salary * 1.10,
		   'ST_CLERK',  salary * 1.15,
		   'SA_REP'  ,  salary * 1.20,
		   salary) as bonsal
	from employees;

=================================
-- 07�� ������ �Լ�(�׷��ռ�)
-- group by ������ �׷��Ϸ��� �׸�(�÷�)�� ����Ѵ�.
-- having ������ �׷��Ϸ��� �ڷḦ �����Ѵ�.
-- �׷��Լ� ����: sum(), avg(), count(), min(), max()
-- ���ڿ� ����ϴ� �׷��Լ�: sum(), avg()
-- ����, ���ڿ� ��� : max(), min(), count()
-- null ���� ���Ե��� �ʴ´�
=================================
select avg(salary) sal_avg,
       sum(salary) sal_sum,
	   max(salary) sal_max,
	   min(salary) sal_min,
	   count(salary) sal_cnt
from employees;

-- null ���� ���Ե� �׸��� �����Լ� 
-- sum, count, avg�� null�� �����ϰ� �����Ѵ�.
select max(commission_pct),
        count(commission_pct)as cnt_comm,
        count(nvl(commission_pct,1))as cnt_nvl,
        count(*)as cnt_comm,
        count(employee_id)as cnt_emp,
        count(department_id)as cnt_dept,
        avg(commission_pct),
        sum(commission_pct)
from employees;

select department_id,
	   avg(salary) sal_avg,
       sum(salary) sal_sum,
	   max(salary) sal_max,
	   min(salary) sal_min,
	   count(salary) sal_cnt
from employees
where department_id is not null
group by department_id
order by department_id;

select job_id,
	   avg(salary) sal_avg,
       sum(salary) sal_sum,
	   max(salary) sal_max,
	   min(salary) sal_min,
	   count(salary) sal_cnt
from employees
group by job_id
order by job_id;

-- group by ���� �÷��� �����ϰ� Select���� ����Ѵ�.
-- where : select���� data�� ����
-- having :group by(�����Լ�) ���� �����Ѵ�.
select department_id, job_id,
	   avg(salary) sal_avg,
       sum(salary) sal_sum,
	   count(salary) sal_cnt
from employees
where department_id is not null
group by department_id, job_id
order by department_id;


select min(hire_date), max(hire_date)
from employees;

select min(hire_date), max(hire_date),
      round(( max(hire_date) - min(hire_date))/365, 0) �ٹ����
from employees;

-- �μ��� ��ձ޿��� ���� ���� �ݾ�..
select max(avg(salary))
FROM employees
group by department_id;

-- ������ �������� ����: having
-- where : select ��(��)�� ���� ����
-- having : group by �� ���� ����
SELECT job_id, avg(salary)
FROM employees
group BY job_id
HAVING avg(salary) > 15000
;
select department_id, job_id,
       to_char(sum(salary), '999,999') sum_sal,
	   to_char(avg(salary), '999,999.99') avg_sal
  from employees
group by department_id, job_id
having  sum(salary) > 10000
order by department_id, job_id;

=================================

-- 8�� ���� ���̺��� ������ ǥ��(����)
-- : �ΰ� �̻��� ���̺��� ���η� ���̴� ȿ��
-- from ���� n���� ���̺��� ���
--       ����� ���̺��� �� -1�� where ������ �ʿ��ϴ�..
=================================
-- 2889��
select employees.department_id, departments.department_name
from employees, departments

-- 106�� / 107��
select e.department_id, d.department_id, d.department_name
from employees e, departments d
where e.department_id = d.department_id;

-- ������ ����
-- �(=):inner, ��, ��ü����, ����(left,right join)

-- � ����(inner join)
--��� ��) �����: pk, fk,���� ����Ǵ� �����͸� ��ȸ
-- 50�μ��� �ٹ��ϴ� ������ �̸�, �μ��ڵ�, �μ���, ����, �޿��� ��ȸ..
select e.last_name, e.department_id, d.department_name, job_id, salary
from employees e, departments d
where e.department_id = d.department_id
  and e.department_id = 50
;
-- �� ����(>,<, >=, <=)
--��� ��) ������:  ������ ������ ����
select e.last_name, e.salary, j.GRADE_LEVEL
from employees e, job_grades j
where e.salary between j.LOWEST_SAL and j.HIGHEST_SAL;

-- ��ü����...
-- ������ �̸�, ����� �̸�, ����, �޿� ��ȸ�Ͻÿ�..
select emp.employee_id, emp.last_name, mgr.last_name as manager_irum,
       emp.job_id, emp.salary
from employees emp, employees mgr
where emp.manager_id = mgr.employee_id;

-- ��������(outer join)
106�� > 107�� > 122��
--107��
select e.last_name, e.department_id, d.department_name, job_id, salary
from employees e, departments d
where e.department_id = d.department_id(+)
;
-- 122��
select e.last_name, e.department_id, d.department_name, job_id, salary
from employees e, departments d
where e.department_id(+) = d.department_id
;
-- ǥ�������� ����.
-- 107��
select e.last_name, e.department_id, d.department_name, job_id, salary
from employees e left join departments d
  on  e.department_id = d.department_id
-- 122��
select e.last_name, e.department_id, d.department_name, job_id, salary
from employees e right join departments d
  on  e.department_id = d.department_id
-- 106��(�����)
select e.last_name, e.department_id, d.department_name, job_id, salary
from employees e inner join departments d
  on  e.department_id = d.department_id

-- full ���� 123��
select e.last_name, e.department_id, d.department_name, job_id, salary
from employees e full join departments d
  on e.department_id = d.department_id
;

=================================
-- 9�� ��������(Sub Query)
-- ���� ���� : �����ȿ� ������ �ִ� ������
-- ��ȸ�ϰ��� �ϴ� ���� �𸣴� ��� Ȱ��
-- ����: ������, ������ ��ȯ ��������
=================================

select last_name, job_id, salary
from employees
where salary > (6461);

-- ������ ������(=,>,<,>=,<=, <>)
-- ȸ���� �����߿��� ��ձ޿� ���� ���� �޴� ������ �̸�, ����, �޿��� ��ȸ..
select last_name, job_id, salary
from employees
where salary > (select avg(salary)
                  from employees);
;
				 
--------
-- from���� ���������� ���
select *
from (select last_name, salary, e.department_id, d.department_name
        from employees e, departments d
       where e.department_id = d.department_id
         and e.department_id = 80)
;
select *
from (select last_name, salary, e.department_id
        from employees e
       where e.employee_id = 176)
;
select last_name,
      (select department_name
         from departments d
        where d.department_id = e.department_id
       ) dept_name,
       salary
from employees e
;

-- ������ �������� ���
-- in, >all, <all, >any, <any
-- in(or)  : ��� ���� ���� �����ϴ� ���� ��ȯ
-- any(or) : <any �ִ밪 ���� ������, >any �ּҰ����� ū��(10,20,30,40)
-- all(and): <all �ּҰ����� ������,  >all �ִ밪���� ū��(10,20,30,40)

--(9000,6000,4800,4200)
select employee_id, department_id, job_id, last_name, salary
  FROM employees
 where salary in (select salary
                     from employees
                    where department_id = 60)
;                    
select employee_id, last_name, job_id, salary
  FROM employees
 where salary <all (select salary
                     from employees
                    where department_id = 60)
;                    
select employee_id, last_name, job_id, salary
  FROM employees
 where salary <any (select salary
                     from employees
                    where department_id = 60)
;  

=================================
-- 10�� DML(Data manipulation Language)
-- insert, update, delete, commit, rollback, savepoint
-- insert ��
-- Ʈ������(TRANSACTION)
=================================
  1) ���̺� ���ο� ���� �߰� �Ѵ�. ������� �۾��� ����ȴ�.
  2) ����
    -. ����, �Ӽ�, ������  �����Ǿ�� �Ѵ�.
    (1) insert into ���̺�� values (); ���̺� �ִ� ��� �÷� �� 1:1 ����
      ��) insert into departments values (300, 'AI Big Data', 114, 1400);
      select * from departments;
    (2) insert into ���̺�� [(�÷���)] values (); : ����� ��� �÷� �� 1:1 ����
      ��) insert into departments (DEPARTMENT_ID,DEPARTMENT_NAME,MANAGER_ID,LOCATION_ID)
        values (310, 'AI Big Data', null, null);
    (3) insert into ���̺�� [(�Ϻ� �÷���)] values (); : ���������� ���� �÷� �� 1:1 ����
      ��) insert into departments (DEPARTMENT_ID,DEPARTMENT_NAME)
           values (320, 'AI Big Data');
        insert into departments (DEPARTMENT_ID,DEPARTMENT_NAME)
        values ('330', 'AI Big Data');
      insert into employees (EMPLOYEE_ID,LAST_NAME,EMAIL,HIRE_DATE,JOB_ID)
      values (340, 'inho', 'shin@smrd.co.kr', sysdate, 'IT_PROG');

 delete from employees where EMPLOYEE_ID >= 300;
 delete from departments where department_id >= 300;

create table emp_ddl (
     emp_id  number
    ,Lname varchar(30)
    ,sal   number
    ,bouns number(5,2)
    ,dept_id  number
    ,cdate  date
 );
-- SUB Query�� �̿��� data�� ����
insert into emp_ddl (
   select employee_id, last_name, salary, commission_pct, sysdate
     from employees);

 insert into emp_ddl (
   select employee_id, last_name, salary, commission_pct, department_id, sysdate
     from employees);

commit;
delete from emp_ddl;
select * from emp_ddl;

-- update��
-- �÷������� ������ �����ϴ�.
update table��
   set col1 = val01,
       col2 = val02,
       col3 = val03
 where ���ǽ�  ;
-- ��� ��)
--������ ������ Ȯ��
select lname, sal, bouns 
from emp_dll
where emp_id = 156;

update emp_ddl
  set lanme = 'Shin inho',
      sal = 2400
where emp_id = 156;

-- emp_ddl ���̺��� ��ü ������ ��ձ޿����� ���� �����鿡�� �޿��� 5% �λ��ϱ�..
update emp_ddl
   set sal = sal + (sal * 0.05)
where sal < (select avg(sal) from emp_ddl);

update emp_ddl
   set sal = (select sal from emp_ddl where emp_id= 125)
where emp_id = 112;

select * from emp_ddl where emp_id = 112;

commit;
-- delete��
-- �� ������ �۾��� ����ȴ�.
delete [ from ] table��
 where ���ǽ�..
-- ��� ��)
  delete from emp_ddl
  where emp_id = 156;

  delete from emp_ddl
  where emp_id = 112;

=================================
-- 11�� TCL Ʈ�����(Transaction Control Language)
-- DML �۾��� �����ϸ� Ʈ������� �߻��Ѵ�.
-- Ʈ�������� �����۾����� �ϳ��� ���� �����Դϴ�. 
--  �� ����� �۾����� ��� ����ǰų�,������� �ʽ��ϴ�.(all-or-nothing)
-- ACID : �������� ��ȿ���� �����ϱ� ����, Ʈ�������� Ư¡���� �ձ��ڸ� �� �ܾ��Դϴ�.
  - ���ڼ�(Atomicity) : ��� �۾��� �ݿ��ǰų� ��� �ѹ�Ǵ� Ư���Դϴ�
  - �ϰ���(Consistency): �����ʹ� �̸� ���ǵ� ��Ģ������ ������ ������ Ư���� �ǹ��մϴ�.
      �����÷��� ���ڿ����� ������ �ȵǵ��� �������ݴϴ�.
  - �ݸ���(Isolation): A�� B �ΰ��� Ʈ�������� ����ǰ� ���� ��,
      A�� �۾����� B���� �������� ������ �ǹ��մϴ�.
  - ���Ӽ�(Durability): �ѹ� �ݿ�(Ŀ��)�� Ʈ�������� ������ ������ ����Ǵ� Ư���� �ǹ��մϴ�.
-- ��ɾ� : commit, rollback, savepoint
=================================
commit;

savepoint abc;

rollback to abc;

rollback ;

LOCK /  UNLOCK

-- insert > savepoint > delete > rollback to > update > rollback > delete > commit
-- 1. insert
insert into emp_ddl ( 
select employee_id, last_name, salary, commission_pct, sysdate
  from employees
);
-- 2. savepoint
savepoint sp_int;
-- 3. delete
delete from emp_ddl;
-- 4. rollback to
rollback to sp_int;
-- 5. update
update emp_ddl
   set sal = sal + (sal * 0.05)
 where sal < (select avg(sal) from emp_ddl);
-- 6. rollback
rollback;
-- 7. delete
delete from emp_ddl;
 where sal >= (select avg(sal) from emp_ddl);
-- 8. commit
commit;

-- Ʈ�����(Transaction)�� ����
-- ����� : commit, rollbcak
-- �Ϲ��� : ������ ����, ddl�� ����(commit)

=================================

-- 12�� DDL(Data Definition Language)
-- ddl ���� : create, alter, drop,
--          truncate, rename, comment
=================================

-- �÷��� �Ӽ�
-- ����
   char, varchar, varchar2
-- ����
   number, number(5), number(5,2)
-- ��¥
   date
   TimeStamp

-- ���̺��� ����
create table emp_ddl (
    emp_id  number,
    lname varchar(30),
    sal   number,
    bouns number(5,2),
	dept_id  number,
    cdate  date
);
-- ���������� �̿��� ���̺��� ����
create table ���̺��̸� as (��������)
;
-- ��)
create table emp_ddl10 as (
   select employee_id as emp_id
         ,last_name as lname
		 ,salary as sal
		 ,commission_pct as bonus
		 ,department_id as dept_id
		 ,sysdate as cdate
      from employees
);
select * from emp_ddl10;
-- �� ���̺� ����
create table emp_ddl20 as (
   select employee_id as emp_id
         ,last_name as lname
		 ,salary as sal
		 ,commission_pct as bonus
		 ,department_id as dept_id
		 ,sysdate as cdate
     from employees
    where 1 <> 1
);

--drop table emp_ddl30;

-- ���� �������� Ȱ�� ���̺� ����
create table emp_ddl30 as (
   select e.department_id as dept_id, d.department_name as dname,
          avg(salary) avg_sal
      from employees e, departments d
     where e.department_id = d.department_id
    group by e.department_id,d.department_name
);
select * from emp_ddl30;

-- ���̺��� ����(alter)
-- alter table ���̺��
-- add, modify, rename, drop

alter table emp_ddl30 add( cdate date default sysdate );

DESCRIBE emp_ddl;

alter table emp_ddl modify( lname varchar(40) );

DESCRIBE emp_ddl;

alter table emp_ddl30 rename column dname to last_nm;

alter table emp_ddl30 drop (cdate);

select * from emp_ddl30;

-- �÷��� �ּ� �ޱ�..

;;
comment on column emp_ddl.emp_id is '���� ��ȣ';

select * from emp_ddl;

-- ���̺� �ּ� �ޱ�..
comment on table  emp_ddl30 is '���� ����';

-- ���̺� �̸��� �ٲٱ�
rename emp_ddl30 to emp_ddl35;

select * from emp_ddl35;

-- ddl����� ������ auto commit;
-- DDL���� commit,  rollback; ���� �ʴ´�..

-- truncate
select * from  emp_ddl;

delete from emp_ddl;  -- dml


select * from  emp_ddl10;
delete from emp_ddl10;  -- dml
rollback;
select * from  emp_ddl10;


select * from  emp_ddl10;

truncate table emp_ddl10;  --ddl

rollback;

select * from  emp_ddl10;

select * from  emp_ddl;
select * from  emp_ddl10;
select * from  emp_ddl20;
select * from  emp_ddl35;


-- ���̺��� ����
drop table emp_ddl;
drop table emp_ddl10;
drop table emp_ddl20;
drop table emp_ddl35;

--select * from  emp_ddl35;

=================================
-- 13�� ��������
-- �������� ���Ἲ�� �����ϱ� ���Ͽ� �ʿ��ϴ�.
--  ���Ἲ: �������� ��Ȯ���� �ϰ����� ����
--   (����(null),��ü(Pk),����(Fk)���Ἲ)
-- ����:
    primary key, not null, unique, 
	foreign key, check, [ default ]
-- primary key : not null, unique
-- not null : � ���̵��� �־�� �Ѵ�.
-- unique   : �ߺ��� ������� �ʴ´�. null ���
-- foreign key : �ܺ�Ű�� ����
-- check : �ԷµǴ� ���� ������ ����

select table_name from user_tables;


-- ���������� �ο��ϴ� ���
   -. �� ���ؿ���  �ִ¹��
   -. ���̺� ���ؿ��� �ִ¹��
   -. ���� ������ �̸��� �ߺ����� �ʴ´�.
=================================
-- ���������� ��ȸ
select * from user_constraints
where table_name = 'DEPT';

select * from user_constraints;

-- �������� �����ϴ� ���� ���� -> ���� ����Ȱ��

-- �������� ���� ���� �ο�..
-- sys_c123456

DESCRIBE emp_cnst;

select * from emp_cnst;

drop table emp_cnst;

create table emp_cnst(
    emp_id number(4)  primary key
   ,lname varchar2(30) constraint emp_lname_nn not null
   ,email varchar2(30) unique
   ,hdate date  default sysdate
   ,job_id varchar2(15)
   ,sal    number(8,2) constraint emp_sal_ck check (sal between 1000 and 10000)
   ,bonus  number(5,2)
   ,mgr_id   number(4)
   ,dept_id number(4) references departments(department_id)
);

select * from emp_cnst;

select * from user_constraints;

create table emp_cnst(
    emp_id number(4)  constraint emp_pk primary key
   ,lname varchar2(30) constraint emp_lname_nn not null
   ,email varchar2(30) unique
   ,hdate date  default sysdate
   ,job_id varchar2(15)
   ,sal    number(8,2) constraint emp_sal_ck check (sal between 1000 and 10000)
   ,bonus  number(5,2)
   ,mgr_id   number(4)
   ,dept_id number(4) references departments(department_id)
);
select * from emp_cnst;

insert into emp_cnst (emp_id, lname, email)
   values (10, 'shin inho', 'inho@smhr.or.kr');
select * from emp_cnst;

insert into emp_cnst (emp_id, lname, email)
   values (12, 'shin inho', 'inho1@smhr.or.kr');
select * from emp_cnst;
   
insert into emp_cnst (emp_id, lname, email)
   values (12, 'shin inho', 'inho2@smhr.or.kr');
select * from emp_cnst;
   
   
insert into emp_cnst (emp_id, lname, email, sal)
   values (20, 'shin inho01', 'inho01@smhr.or.kr', 12000);
   
insert into emp_cnst (emp_id, lname, email, hdate)
   values (30, 'shin inho', 'inho02@smhr.or.kr', sysdate);

insert into emp_cnst (emp_id, lname, email, hdate, dept_id)
   values (40, 'shin inho', 'inho03@smhr.or.kr', sysdate, 350);

insert into emp_cnst (emp_id, lname, email, hdate, dept_id)
   values (50, 'shin inho', null, sysdate, 100);
select * from emp_cnst;

insert into emp_cnst (emp_id, lname, email, hdate, dept_id)
   values (60, 'shin inho', null, sysdate, 100);

rollback;

-----------------
--  ���̺� ���ؿ����� ���� ���� �ο�..
drop table emp_cnst;
drop table dept_cnst;

select * from departments;

create table emp_cnst(
    emp_id number(4)
   ,lname varchar2(30) not null
   ,email varchar2(30)
   ,hdate date
   ,job_id varchar2(15)
   ,sal    number(8,2)
   ,bonus  number(5,2)
   ,mgr_id   number(4)
   ,dept_id number(4)
   ,constraint emp_pk primary key (emp_id)
   ,unique (email)
   ,constraint emp_sal_ck check (sal between 1000 and 10000)
   ,foreign key (dept_id) references departments(department_id)
);

-- �������� Ǯ���� ����
-- ������ �޿��� 5000���� ���� �޴� ������
-- ������ȣ, �̸�, ����, �Ի���,�޿�, �μ���, �����ڸ��� ��ȸ�Ͻÿ�..
-- �޿��� 3�ڸ����� ','�� �����Ѵ�.
select e.empno, e.ename, e.jobid,
    to_char(e.hiredate, 'yyyy-mm-dd') hiredate,
    to_char(e.sal, '999,999') sal,
    d.dname,             -- �μ��̸�
    m.ename as mgr_name  -- ������ �̸�
 from dept d, emp e, emp m
where d.deptno = e.deptno
  and e.mgr = m.empno
  and e.sal > 5000;

------------------------------------
--  ���������� ����
drop table emp_cnst;
create table emp_cnst(
    emp_id number(4)
   ,lname varchar2(30)
   ,email varchar2(30)
   ,hdate date 
   ,job_id varchar2(15)
   ,sal    number(8,2)
   ,bonus  number(5,2)
   ,mgr_id   number(4)
   ,dept_id number(4) 
);

alter table emp_cnst
  add primary key(emp_id);
alter table emp_cnst
  add not null(lname);
alter table emp_cnst
  add unique(email);
alter table emp_cnst
  add check(sal between 1000 and 10000);
alter table emp_cnst
  add foreign key (dept_id) references dept_cnst(dept_id);

alter table emp_cnst
  add constraint emp99_pk primary key(emp_id);
alter table emp_cnst
  drop primary key;
alter table emp_cnst
  drop constraint sys_c0007009;

=================================
-- 14�� ��Ÿ ��ü
-- ���̺�, ��, �ε���, ������, ���Ǿ�
=================================
-- �����ͻ���
select * from user_tables;
select * from all_tables;
select * from all_objects where owner ='HR';
select * from user_objects;

select * from user_col_comments
where table_name = 'DEPARTMENTS';
select * from all_col_comments
where table_name = 'DEPARTMENTS';

select * from user_tab_comments
where table_name = 'DEPARTMENTS';
select * from all_tab_comments
where table_name = 'DEPARTMENTS';

select * from user_constraints
where table_name = 'DEPT';

select * from user_cons_columns
where table_name = 'DEPT';

-----------------

create ��ü������ ��ü�� ...
;
-- 1. view
-- create view ��� as (select from ..)
-- �������� ������ ���� �Ҷ�
-- ������ ���Ǹ� ���� �Ҷ�
-- �������� �������� �����Ҷ�..

create view vw_emp80 as
  (select employee_id, last_name, job_id, salary, (salary * 12 ) as  annual
     from employees
    where department_id = 80
  );

select * from vw_emp80;

-- in Line ��
-- ȸ�系�� �޿��� ���� �޴� ���� ���� 5���� �̸��� �޿� ��ȸ..
select rownum, a.*
from (select last_name, salary
        from employees
        order by salary desc) a
where rownum < 6 ;

SELECT *
    FROM    employees;
    
;;;;    
select rownum, a.*
from (select last_name, salary
        from employees
        order by salary desc) a
where rownum < 6 ;
;;;    

-- 2. �ε���
-- �˻��� �ӵ��� ���δ�.
-- �������� ���� ������ ������ �ִ�.
-- DML�� ����ϰ� �Ͼ�� Tablel�� ���ؼ��� ������ ���� �����´�.
-- �ε��� ����� �������
--  1) ���� ������ �������ϰ� ���ԵǴ� ���
--  2) ������, ������ ���� �Ͼ�� �׸�
--  3) ��κ��� ���ǿ� ���� �˻���� 2-4%�̸��� ���

select * from emp_ddl;

create index emp_name_idx
   on emp_ddl (lname);

select * from emp_ddl
where lname like '��%';

select * from user_indexes;
select * from user_ind_columns;

drop index emp_name_idx;

-- 3. ������(Sequence)
--  ������ ��ȣ�� �ڵ����� �����Ѵ�.
--  ������ �����ϴ�.
--  �Ϲ����� �⺻Ű(pK)�� ����Ѵ�.

drop sequence emp_seq;
create sequence emp_seq
   increment by 10
   start with 100
   maxvalue 999999999999999
   nocache
   nocycle;

drop table  emp;
insert into emp (empno, lname, sal)
  (select emp_seq.nextval,last_name, salary
    from employees);
commit;

select emp_seq.nextval from dual;
select emp_seq.currval from dual;

alter sequence emp_seq
   increment by 5
   maxvalue 9999999
   nocache
   nocycle;


-- 4. ���Ǿ�(Synonym)
-- ��ü�� ���� ������ �ο��Ѵ�.
create Synonym emps for employees;

select * from emps;

drop Synonym emps;

select Synonym_name from user_synonyms;

-- 5. ����� ���� �Լ�
--  �Լ��� �ǵ��ƿ��� ��(return)�� �ִ�.
--  ������ ����̴�.
select substr('ajkdaskjd', 2,3) from dual;
select upper('asasdasdf') from dual;
select fn_dname(10) from dual;

-- ����� ���� �Լ�
-- �μ��̸��� ��ȯ�ϴ� �Լ�..
create or replace function fn_dname (dept_id in int)
   return varchar
is
   dnm varchar2(30);
begin
   select department_name into dnm
     from departments
     where department_id = dept_id;
   return dnm;
end;

;;;;;;;
/
-- �μ����� ��ȸ�ϴ� ����� �����Լ� �̿��Ͽ� ������ �̸�, �μ��̸�, �Ի���, �޿��� ��ȸ�Ͻÿ�..
select last_name, fn_dname(department_id), hire_date, salary
  from employees;


-- 6. TRIGGER
--
create table emp_bak as ( select * from emp where 1 <> 1)
;
create or replace TRIGGER emp_delete
  before delete on emp for each row
begin
  insert into emp_bak values (
    :old.EMP_NO ,:old.LNAME ,:old.EMAIL ,:old.HDATE
    ,:old.JOB_ID ,:old.SAL ,:old.BONUS ,:old.MGR_ID
    ,:old.DEPTNO
  );
end;
/
delete emp where EMP_NO in (150,160);
commit;

=================================
-- 15�� DCL(Dta Control Language)
-- DCL : grant to, revoke from
=================================
-- System �������� ����
show user;
-- ������ ����
create user inho IDENTIFIED by inho;

-- ��������� �ο�
grant create session to inho;

-- ���̺� ���������� �ο�
grant create table to inho;
grant create view to inho;

-- �ڿ��� ������ �ο�
grant resource to inho;

grant create session, RESOURCE,
      create table,create view,
      create sequence
to inho;
-- �ٸ� ������� ��ü�� ��ȸ
grant select on hr.employees to inho;
-- �ٸ� ����ڿ��� ������ �ο��� �� �ִ� ������ �����մϴ�.
grant select, insert on departments
to inho with grant option;
-- ��� ����鿡�� ���� �ο�
grant select on hr.departments to scott;
grant select on hr.departments to public;

-- ��ȣ ����
alter user inho IDENTIFIED by shin account lock;

alter user inho IDENTIFIED by shin account unlock;

-- �ο��� ������ Ȯ��
select * from role_sys_privs;
select * from role_tab_privs;

--**
select * from user_sys_privs;

-- ������ ȸ��
revoke create table from inho;

revoke create session, RESOURCE,
  create table,create view,
  create sequence
from inho;

-- ��Ȱ�� ����
create  role mgr;

grant create session, RESOURCE,
  create table,create view,
  create sequence
to mgr;
-- ��Ȱ�� Ȱ��.
grant mgr to inho, hr, scott;

drop user inho cascade;

===============================
-- ����� �������� ����
show user;

create TABLE temp04 (
    irum varchar(20),
    phon varchar(20)
);
-- ������ ���̺��� ��ȸ
select table_name from user_tables;

create view vw_temp as
  (select * from temp);

create sequence temp_seq
   increment by 10
   start with 100
   maxvalue 999999999999999
   nocache
   nocycle;

select * from hr.employees;



select * from dept;

create table dept(
    deptno number(2)  primary key 
   ,dname varchar2(14) constraint dept_dname_nn not null
   ,loc varchar2(13) 
);

select * from dept;

select * from emp;

create table emp(
    empno number(4)  primary key 
   ,ename varchar2(10) constraint nemp_ename_nn not null
   ,job varchar2(9) constraint nemp_job_nn not null
   ,mgr number(4)
   ,hiredate date
   ,sal number(7,2) constraint nemp_sal_nn not null
   ,comm number(7,2)
   ,deptno  number(2)
);

select * from emp;


select * from dept;

insert into dept 
        values (10, 'Adminstration', 1700);
        
insert into dept 
        values (20, 'Marketing', 1800);
insert into dept 
        values (30, 'Purchasing', 1700);
insert into dept 
        values (40, 'Human', 2400);
insert into dept 
        values (50, 'Shipping', 1500);
        
select * from dept;

select * from emp;
        
insert into emp
           values (100, 'King', 'AD_PRES', null, '1987-01-17', 24000, null, 10);        

insert into emp
           values (101, 'Kochar', 'AD_VP', 100, '1989-09-21', 17000, null, 50);        

insert into emp
           values (102, 'DE Haen', 'AD_VP', 100, '1993-01-13', 17000, null, 50);        

insert into emp
           values (103, 'Hunold', 'IT_PROG', 102, '1990-07-03', 9000, null, 40);        

insert into emp
           values (104, 'Ernst', 'IT_PROG', 103, '1997-07-25', 4800, null, 40);        

select * from dept;

select * from emp;

-- ������ �޿��� 5000���� ���� �޴� ������
-- ������ȣ, �̸�, ����, �Ի���,�޿�, �μ���, �����ڸ��� ��ȸ�Ͻÿ�..
-- �޿��� 3�ڸ����� ','�� �����Ѵ�.
-- �����ڰ� ���� ������ ����Ѵ�.
;;
-- ������ �޿��� 5000���� ���� �޴� ����
select * from emp
where sal > 5000;
;;
-- ������ �޿��� 5000���� ���� �޴� ������
-- ������ȣ, �̸�, ����, �Ի���,�޿�, �μ���, �����ڸ��� ��ȸ�Ͻÿ�..
select empno, ename, hiredate, deptno, mgr 
from emp
where sal > 5000;
;;
;;;;
-- ������ �޿��� 5000���� ���� �޴� ������
-- ������ȣ, �̸�, ����, �Ի���,�޿�, �μ���, �����ڸ��� ��ȸ�Ͻÿ�..
SELECT
    e.empno,
    e.ename,
    e.hiredate,
    e.sal,
    d.dname,
    e.mgr
FROM
    emp  e,
    dept d
WHERE
        e.deptno = d.deptno
    AND sal > 5000;

;;
-- ������ �޿��� 5000���� ���� �޴� ������
-- ������ȣ, �̸�, ����, �Ի���,�޿�, �μ���, �����ڸ��� ��ȸ�Ͻÿ�..
SELECT
    e.empno,
    e.ename,
    e.hiredate,
    e.sal,
    d.dname,
    m.ename
FROM
    emp  e,
    emp  m,
    dept d
WHERE
        e.deptno = d.deptno
    AND e.mgr = m.empno
        AND e.sal > 5000;

-- ������ �޿��� 5000���� ���� �޴� ������
-- ������ȣ, �̸�, ����, �Ի���,�޿�, �μ���, �����ڸ��� ��ȸ�Ͻÿ�..
-- �����ڰ� ���� ������ ����Ѵ�.
SELECT
    e.empno,
    e.ename,
    e.hiredate,
    e.sal,
    d.dname,
    m.ename
FROM
    emp  e,
    emp  m,
    dept d
WHERE
        e.deptno = d.deptno
    AND e.mgr = m.empno (+)
        AND e.sal > 5000;

-- ������ �޿��� 5000���� ���� �޴� ������
-- ������ȣ, �̸�, ����, �Ի���,�޿�, �μ���, �����ڸ��� ��ȸ�Ͻÿ�..
-- �޿��� 3�ڸ����� ','�� �����Ѵ�.
-- �����ڰ� ���� ������ ����Ѵ�.
SELECT
    e.empno,
    e.ename,
    e.hiredate,
    to_char(e.sal, '999,999'),
    d.dname,
    m.ename
FROM
    emp  e,
    emp  m,
    dept d
WHERE
        e.deptno = d.deptno
    AND e.mgr = m.empno (+)
        AND e.sal > 5000;
  
;;;;;;;;;;;;;;;;;;
  
drop table emp_ddl;


create table emp_ddl (
     emp_id  number
    ,Lname varchar(30)
    ,sal   number
    ,bouns number(5,2)
    ,dept_id  number
    ,cdate  date
 );
 
  insert into emp_ddl (
   select employee_id, last_name, salary, commission_pct, department_id, sysdate
     from employees);

-- SUB Query�� �̿��� data�� ����
insert into emp_ddl (
   select employee_id, last_name, salary, commission_pct, sysdate
     from employees);

select * from   emp_ddl;

insert into emp_ddl (
select employee_id, last_name, salary, commission_pct, department_id, sysdate
     from employees);
     
     
select * from emp_ddl
where lname like 'K%';

drop index emp_name_idx;

select * from emp_ddl;

create index emp_name_idx
   on emp_ddl (lname);

select * from emp_ddl
where lname like 'i%';

drop index emp_name_idx;


------------------------------------------------------------------

drop table emp_ddl;

create table emp_ddl (
     emp_id  number
    ,Lname varchar(30)
    ,sal   number
    ,bouns number(5,2)
    ,dept_id  number
    ,cdate  date
 );

select * from emp_ddl;

drop sequence empddl_seq;

create sequence empddl_seq
   increment by 10
   start with 300
   maxvalue 999999999999999
   nocache
   nocycle;

select * from emp_ddl;

insert into emp_ddl (emp_id, lname, sal)
  (select empddl_seq.nextval,last_name, salary
    from employees);

select * from emp_ddl;
    
commit;

select empddl_seq.nextval from dual;

select empddl_seq.currval from dual;


select substr('ajkdaskjd', 2,3) from dual;

select upper('asasdasdf') from dual;

select fn_dname(10) from dual;

select fn_dname(20) from dual;

;;;;;;;;
---------------------------------------------------
-- Ʈ����, �Լ� �� ���� ;
/ �� ������.
---------------------------------------------------

create or replace function fn_dname (dept_id in int)
   return varchar
is
   dnm varchar2(30);
begin
   select department_name into dnm
     from departments
     where department_id = dept_id;
   return dnm;
end;
/


;;;;;;;;;;;



   select department_name 
     from departments;

;;;
create or replace function fn_dname (dept_id in int)
   return varchar
is
   dnm varchar2(30);
begin
   select department_name into dnm
     from departments
     where department_id = dept_id;
   return dnm;
end;
;;;;


---------------------------------------------------
-- Ʈ����, �Լ� �� ���� ;
/ �� ������.
---------------------------------------------------

-- 6. TRIGGER
--
create table emp_bak as ( select * from emp where 1 <> 1);
;

create or replace TRIGGER emp_delete
  before delete on emp for each row
begin
  insert into emp_bak values (
    :old.EMP_NO ,:old.LNAME ,:old.EMAIL ,:old.HDATE
    ,:old.JOB_ID ,:old.SAL ,:old.BONUS ,:old.MGR_ID
    ,:old.DEPTNO
  );
end;
/

;
select * from emp;

select * from emp_bak;


delete emp where EMP_NO in (150,160);
commit;

-- ������ �޿��� 5000���� ���� �޴� ����
select * from emp
where sal > 5000;



----------------------------------------------------------------------------------------
;;;;;;;;;;;;;
-- 6. TRIGGER

-- ���� �۾� emp ���̺� �����.
drop table emp;

create table emp(
    empno number(4)  primary key 
   ,ename varchar2(10) constraint nemp_ename_nn not null
   ,job varchar2(9) constraint nemp_job_nn not null
   ,mgr number(4)
   ,hiredate date
   ,sal number(7,2) constraint nemp_sal_nn not null
   ,comm number(7,2)
   ,deptno  number(2)
);

select * from emp;

insert into emp
           values (100, 'King', 'AD_PRES', null, '1987-01-17', 24000, null, 10);        

insert into emp
           values (101, 'Kochar', 'AD_VP', 100, '1989-09-21', 17000, null, 50);        

insert into emp
           values (102, 'DE Haen', 'AD_VP', 100, '1993-01-13', 17000, null, 50);        

insert into emp
           values (103, 'Hunold', 'IT_PROG', 102, '1990-07-03', 9000, null, 40);        

insert into emp
           values (104, 'Ernst', 'IT_PROG', 103, '1997-07-25', 4800, null, 40);        
           
select * from emp;

-- 1. emp_bak ���̺� �ֳ� �˻�, ���� ���� ����
select * from emp_bak;

-- 2. emp_bak ���̺� �����.
drop table emp_bak;
create table emp_bak as ( select emp.*, sysdate as cdate from emp where 1 <> 1);

-- 3. emp_bak ���̺� �ֳ� �˻�, ���̺� �ʵ常 ��
select * from emp_bak;

-- 4. emp ���̺� �ֳ� �˻�
select * from emp;

select * from user_triggers;

-- 5. Ʈ���� �ۼ�.
-- Ʈ����, �Լ� �� ���� ;/ �� ������.
;;
create or replace TRIGGER emp_delete
  before delete on emp for each row
begin
  insert into emp_bak values (
    :old.EMPNO ,:old.ENAME ,:old.JOB ,:old.MGR
    ,:old.HIREDATE ,:old.SAL ,:old.COMM ,:old.DEPTNO
    , sysdate
  );
end;
/
;;;
select * from user_triggers;

-- 6. emp ���̺� ��ȸ
;;
SELECT * FROM emp;

-- 7. emp ���̺� ����
DELETE emp WHERE empno IN (101, 102 );

-- 8. emp ���̺� ��ȸ
;;
SELECT * FROM emp;
;;
-- 9. emp_bak ���̺� ��ȸ
SELECT * FROM emp_bak;

-- 10. �۾� ���� ����
COMMIT;

;;;;;;;;;;;;;
----------------------------------------------------------------------------------------





=================================
-- 15�� DCL(Dta Control Language)
-- DCL : grant to, revoke from
=================================
-- ���� ������ �����ؾ� ��.

-- System �������� ����
show user;

-- ������ ����
create user inho IDENTIFIED by inho;

-- ��������� �ο�
grant create session to inho;

-- ���̺� ���������� �ο�
grant create table to inho;

grant create view to inho;

-- �ڿ��� ������ �ο�
grant resource to inho;

grant create session, 
        RESOURCE,
        create table,
        create view,
        create sequence
to inho;


-- �ٸ� ������� ��ü�� ��ȸ
grant select on hr.employees to inho;

-- �ٸ� ����ڿ��� ������ �ο��� �� �ִ� ������ �����մϴ�.
grant select, insert on hr.departments
to inho with grant option;




-- ��� ����鿡�� ���� �ο�
grant select on hr.departments to scott;

grant select on hr.departments to public;

-- ��ȣ ����

alter user inho IDENTIFIED by shin account lock;

alter user inho IDENTIFIED by shin account lock;

alter user inho IDENTIFIED by inho account unlock;

-- �ο��� ������ Ȯ��
select * from role_sys_privs;
select * from role_tab_privs;

--**
select * from user_sys_privs;

-- ������ ȸ��
revoke create table from inho;

revoke create session, RESOURCE,
  create table,create view,
  create sequence
from inho;

-- ��Ȱ�� ����
create  role mgr;

grant create session, RESOURCE,
  create table,create view,
  create sequence
to mgr;
-- ��Ȱ�� Ȱ��.
grant mgr to inho, hr, scott;

drop user inho cascade;

===============================




inho �������� �Է�

show user;

CREATE TABLE temp_tbl (
    irum VARCHAR2(30),
    addr VARCHAR2(100)
);

select table_name from user_tables;

select * from temp_tbl;

create view vw_tmp as
select * from temp_tbl;

select * from vw_tmp;

select * from hr.employees;

select * from hr.departments;


CREATE TABLE temp_tbl_02 (
    irum VARCHAR2(30),
    addr VARCHAR2(100)
);



select object_name from user_objects;

select table_name from user_tables;

show user;


===============================

select * from user_sys_privs;


select * from employees;