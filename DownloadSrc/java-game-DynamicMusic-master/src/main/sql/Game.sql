## GAME 테이블 생성
CREATE TABLE GAME(
                     MEMBER_CODE BIGINT(20) PRIMARY KEY,
                     DM_SCORE bigint(20) NOT NULL DEFAULT '0',
                     DM_COMBO BIGINT(20) NOT NULL DEFAULT '0',
                     CONSTRAINT memberCODE_fk FOREIGN KEY(MEMBER_CODE) REFERENCES hjproject.MEMBER(MEMBER_CODE));

## GAME 테이블에 대한 trigger 생성
DELIMITER $$
CREATE TRIGGER playgame
    AFTER INSERT ON MEMBER FOR EACH ROW
BEGIN
    INSERT INTO GAME(MEMBER_CODE, DM_SCORE, DM_COMBO)
    VALUES (NEW.MEMBER_CODE, 0, 0);
END $$
DELIMITER;


## 기존 테이블 MEMBER_CODE 만 가져오기
INSERT INTO GAME(MEMBER_CODE)
SELECT MEMBER_CODE FROM MEMBER;

## 상위 N 개만 가져오기 + ORDER BY
N 개만 추출하는 방법은 LIMIT N => MYSQL 만 -> 나중에
정렬은 ORDER BY -> 먼저
합쳐서
SELECT DF_SCORE FROM DMUSIC ORDER BY DF_SCORE DESC LIMIT 5; 요런 느낌