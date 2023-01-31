CREATE TABLE Student (
	StudentID	VarChar2(20)		NOT NULL,
	SName	VarChar2(20)		NOT NULL,
	TeamName	VarChar2(20)		NULL
);
ALTER TABLE Student ADD CONSTRAINT PK_STUDENT PRIMARY KEY (
	StudentID
);



CREATE TABLE Question (
	QuestonID	NUMBER(5)		NOT NULL,
	QScore	NUMBER(5)		NOT NULL,
	QLevel	VarChar2(10)		NULL
);
ALTER TABLE Question ADD CONSTRAINT PK_QUESTION PRIMARY KEY (
	QuestonID
);

ALTER TABLE Question RENAME COLUMN QuestonID TO QuestionID;
commit;

create sequence TRID_seq;

CREATE TABLE TryResult (
	TRID_seq 	NUMBER		PRIMARY KEY,
	StudentID	VarChar2(20)		NOT NULL,
	QuestonID	NUMBER(5)		NOT NULL,
	IsSuccess	VARCHAR(5)		NULL,
	GetScore	NUMBER(5)		NULL
);

ALTER TABLE TryResult ADD CONSTRAINT FK_Student_TO_TryResult FOREIGN KEY (
	StudentID
)
REFERENCES Student (
	StudentID
);

ALTER TABLE TryResult ADD CONSTRAINT FK_Question_TO_TryResult FOREIGN KEY (
	QuestonID
)
REFERENCES Question (
	QuestonID
);


ALTER TABLE TryResult RENAME COLUMN QuestonID TO QuestionID;
commit;

commit;

select * from Student;
select * from Question;
select * from TryResult;

drop table TryResult;
drop table Question;
drop table Student;

select * from Question;

commit;

insert into STUDENT 
        values (101, '윤상재', 'Yellow');        
insert into STUDENT 
        values (102, '남하은', 'Yellow');
insert into STUDENT 
        values (103, '장이수', 'Yellow');
insert into STUDENT 
        values (104, '문경수', 'Yellow');
insert into STUDENT
        values (105, '구소현', 'Yellow');
        
       commit;

insert into Question values (1, 10, 'Easy');   
insert into Question values (2, 10, 'Easy');   
insert into Question values (3, 10, 'Easy');   
insert into Question values (4, 10, 'Easy');   
insert into Question values (5, 10, 'Easy');   
insert into Question values (6, 10, 'Easy');   
insert into Question values (7, 10, 'Easy');   
insert into Question values (8, 10, 'Easy');   
insert into Question values (9, 10, 'Easy');   
insert into Question values (10, 10, 'Easy');   
insert into Question values (11, 15, 'Mid');   
insert into Question values (12, 15, 'Mid');   
insert into Question values (13, 15, 'Mid');   
insert into Question values (14, 15, 'Mid');   
insert into Question values (15, 15, 'Mid');   
insert into Question values (16, 15, 'Mid');   
insert into Question values (17, 15, 'Mid');   
insert into Question values (18, 15, 'Mid');   
insert into Question values (19, 15, 'Mid');   
insert into Question values (20, 15, 'Mid');   
insert into Question values (21, 20, 'Hard');   
insert into Question values (22, 20, 'Hard');   
insert into Question values (23, 20, 'Hard');   
insert into Question values (24, 20, 'Hard');   
insert into Question values (25, 20, 'Hard');   
insert into Question values (26, 20, 'Hard');   
insert into Question values (27, 20, 'Hard');   
insert into Question values (28, 20, 'Hard');   
insert into Question values (29, 20, 'Hard');   
insert into Question values (30, 20, 'Hard');   
insert into Question values (31, 30, 'Hard');   
insert into Question values (32, 30, 'Hard');   
insert into Question values (33, 30, 'Hard');   
insert into Question values (34, 30, 'Hard');   
insert into Question values (35, 30, 'Hard');   
insert into Question values (36, 30, 'Hard');   
insert into Question values (37, 30, 'Hard');   

select * from student;
select * from question;
select * from TryResult;

insert into TryResult values (8, '101', 3 , 'O', 10);   
commit;
------------------------------------------------------------

drop table seqtest;
drop table TryResult;

select * from tryresult;
delete tryresult;

commit;

delete from TryResult;
select * from TryResult;
select * from Student;
select * from Question;

delete tryresult;
commit;


insert into TryResult values (TRID_seq.NEXTVAL, '101', 3 , 'O', 10);   
insert into TryResult values (TRID_seq.NEXTVAL, '102', 3 , 'O', 10);   
insert into TryResult values (TRID_seq.NEXTVAL, '103', 3 , 'O', 10);   
insert into TryResult values (TRID_seq.NEXTVAL, '104', 3 , 'O', 10);   
insert into TryResult values (TRID_seq.NEXTVAL, '105', 3 , 'O', 10);   

insert into TryResult values (TRID_seq.NEXTVAL, '101', 8, 'O', 10);   
insert into TryResult values (TRID_seq.NEXTVAL, '102', 8, 'O', 10);   
insert into TryResult values (TRID_seq.NEXTVAL, '103', 8, 'X', 0);   
insert into TryResult values (TRID_seq.NEXTVAL, '104', 8, 'O', 10);   
insert into TryResult values (TRID_seq.NEXTVAL, '105', 8, 'X', 0);   

insert into TryResult values (TRID_seq.NEXTVAL, '101', 12 , 'X', 0);   
insert into TryResult values (TRID_seq.NEXTVAL, '102', 12 , 'O', 15);   
insert into TryResult values (TRID_seq.NEXTVAL, '103', 12 , 'O', 15);   
insert into TryResult values (TRID_seq.NEXTVAL, '104', 12 , 'O', 15);   
insert into TryResult values (TRID_seq.NEXTVAL, '105', 12 , 'O', 15);   


insert into TryResult values (TRID_seq.NEXTVAL, '101', 15 , 'O', 15);   
insert into TryResult values (TRID_seq.NEXTVAL, '102', 15 , 'O', 15);   
insert into TryResult values (TRID_seq.NEXTVAL, '103', 15 , 'X', 0);   
insert into TryResult values (TRID_seq.NEXTVAL, '104', 15 , 'X', 0);   
insert into TryResult values (TRID_seq.NEXTVAL, '105', 15, 'X', 0);   

insert into TryResult values (TRID_seq.NEXTVAL, '101', 18 , 'O', 15);   
insert into TryResult values (TRID_seq.NEXTVAL, '102', 18 , 'O', 15);   
insert into TryResult values (TRID_seq.NEXTVAL, '103', 18 , 'O', 15);   
insert into TryResult values (TRID_seq.NEXTVAL, '104', 18 , 'O', 15);   
insert into TryResult values (TRID_seq.NEXTVAL, '105', 18 , 'O', 15);   

insert into TryResult values (TRID_seq.NEXTVAL, '101', 25 , 'X', 0);   
insert into TryResult values (TRID_seq.NEXTVAL, '102', 25 , 'X', 0);   
insert into TryResult values (TRID_seq.NEXTVAL, '103', 25 , 'X', 0);   
insert into TryResult values (TRID_seq.NEXTVAL, '104', 25 , 'O', 20);   
insert into TryResult values (TRID_seq.NEXTVAL, '105', 25 , 'O', 20);   

insert into TryResult values (TRID_seq.NEXTVAL, '101', 31 , 'O', 30);   
insert into TryResult values (TRID_seq.NEXTVAL, '102', 31 , 'X', 0);   
insert into TryResult values (TRID_seq.NEXTVAL, '103', 31 , 'X', 0);   
insert into TryResult values (TRID_seq.NEXTVAL, '104', 31 , 'X', 0);   
insert into TryResult values (TRID_seq.NEXTVAL, '105', 31 , 'X', 0);   

insert into TryResult values (TRID_seq.NEXTVAL, '101', 35 , 'X', 0);   
insert into TryResult values (TRID_seq.NEXTVAL, '102', 35, 'X', 0);   
insert into TryResult values (TRID_seq.NEXTVAL, '103', 35, 'O', 30);   
insert into TryResult values (TRID_seq.NEXTVAL, '104', 35 , 'O', 30);   
insert into TryResult values (TRID_seq.NEXTVAL, '105', 35, 'O', 30);   

insert into TryResult values (TRID_seq.NEXTVAL, '101', 1 , 'O', 10);   
insert into TryResult values (TRID_seq.NEXTVAL, '102', 1 , 'O', 10);   
insert into TryResult values (TRID_seq.NEXTVAL, '103', 1 , 'O', 10);   
insert into TryResult values (TRID_seq.NEXTVAL, '104', 1 , 'O', 10);   
insert into TryResult values (TRID_seq.NEXTVAL, '105', 1 , 'O', 10);   

insert into TryResult values (TRID_seq.NEXTVAL, '101', 5 , 'X', 0);   
insert into TryResult values (TRID_seq.NEXTVAL, '102', 5 , 'X', 0);   
insert into TryResult values (TRID_seq.NEXTVAL, '103', 5 , 'O', 10);   
insert into TryResult values (TRID_seq.NEXTVAL, '104', 5 , 'O', 10);   
insert into TryResult values (TRID_seq.NEXTVAL, '105', 5 , 'O', 10);   

insert into TryResult values (TRID_seq.NEXTVAL, '101', 13 , 'O', 15);   
insert into TryResult values (TRID_seq.NEXTVAL, '102', 13 , 'O', 15);   
insert into TryResult values (TRID_seq.NEXTVAL, '103', 13 , 'O', 15);   
insert into TryResult values (TRID_seq.NEXTVAL, '104', 13 , 'O', 15);   
insert into TryResult values (TRID_seq.NEXTVAL, '105', 13 , 'O', 15);   

commit;

select * from tryresult;

select * from question;

delete TryResult;

select * from student s;

select * from student s, tryresult t
where s.studentid = t.studentid;

select * from student s, tryresult t
where s.studentid = t.studentid
and t.isSuccess like '%O%';

select count(*) from student s, tryresult t
where s.studentid = t.studentid
and t.isSuccess like '%O%';

select count(*) from student s, tryresult t
where s.studentid = t.studentid;


select * from tryresult;

SELECT S.TEAMNAME,TRY.GETSCORE
        FROM STUDENT S,TRYRESULT TRY 
        WHERE TRY.ISSUCCESS LIKE '%O%'
        AND S.STUDENTID = TRY.STUDENTID ;




CREATE VIEW VW_SCOREVIEW (TEAMNAME,FINALSCORE)
    AS(SELECT S.TEAMNAME,SUM(TRY.GETSCORE)
        FROM STUDENT S,TRYRESULT TRY 
        WHERE TRY.ISSUCCESS LIKE '%O%'
        AND S.STUDENTID = TRY.STUDENTID 
        group by S.TEAMNAME
        );
        
DROP VIEW VW_SCOREVIEW;
SELECT * FROM VW_SCOREVIEW;
SELECT * FROM TRYRESULT;


/*
insert into TryResult values (2, '101', 2 , 'O', 20);   
insert into TryResult values (3, '101', 2 , 'O', 30);   
insert into TryResult values (4, '101', 2 , 'O', 40);   
insert into TryResult values (5, '101', 2 , 'O', 50);   
insert into TryResult values (6, '101', 2 , 'O', 60);
insert into TryResult values (7, '101', 2 , 'X', 100);
*/

commit; 

TRUNCATE TABLE STUDENT;
truncate table tryresult;

commit;

/*
insert into STUDENT values (50, 'kakako', 'black');  
insert into STUDENT values (51, 'adw', 'black'); 
insert into STUDENT values (52, 'knkpnm', 'black'); 
insert into STUDENT values (53, 'kjgim', 'black'); 

insert into TryResult values (7, 50, 2 , 'O', 30);
insert into TryResult values (7, 50, 2 , 'O', 100);
insert into TryResult values (7, 51, 2 , 'O', 450);
insert into TryResult values (7, 52, 2 , 'O', 80);
insert into TryResult values (7, 53, 2 , 'X', 100);
