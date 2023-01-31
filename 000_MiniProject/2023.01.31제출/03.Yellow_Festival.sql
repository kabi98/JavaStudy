CREATE TABLE Student (
	StudentID	VarChar2(20)		NOT NULL,
	SName	VarChar2(20)		NOT NULL,
	TeamName	VarChar2(20)		NULL
);

CREATE TABLE Question (
	QuestonID	NUMBER(5)		NOT NULL,
	QScore	NUMBER(5)		NOT NULL,
	QLevel	VarChar2(10)		NULL
);

CREATE TABLE TryResult (
	TResultID	NUMBER(10)		NOT NULL,
	StudentID	VarChar2(20)		NOT NULL,
	QuestonID	NUMBER(5)		NOT NULL,
	IsSuccess	VARCHAR(5)		NULL,
	GetScore	NUMBER(5)		NULL
);

ALTER TABLE Student ADD CONSTRAINT PK_STUDENT PRIMARY KEY (
	StudentID
);

ALTER TABLE Question ADD CONSTRAINT PK_QUESTION PRIMARY KEY (
	QuestonID
);

ALTER TABLE TryResult ADD CONSTRAINT PK_TRYRESULT PRIMARY KEY (
	TResultID
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

commit;

select * from Student;
select * from Question;
select * from TryResult;

drop table TryResult;
drop table Question;
drop table Student;



