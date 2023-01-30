select * from employees;

create table big_member(
    id 		varchar2(50) primary key 
   ,pw 		varchar2(50) not null
   ,name	varchar2(50) 
   ,tel 	varchar2(50) 
);

select * from employees;
---------------------------------------------------------
create table big_member(
    id 		varchar2(50) primary key 
   ,pw 		varchar2(50) not null
   ,name	varchar2(50) 
   ,tel 	varchar2(50) 
);

;;
commit;

select * from big_member;

insert into big_member
           values ('smhrd', 'smhrd', '스마트', '062-655-3506');

commit;
