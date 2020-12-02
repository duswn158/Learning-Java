DROP SEQUENCE MEMBERSEQ;
DROP TABLE TB_MEMBER;

CREATE SEQUENCE MEMBERSEQ;

-- 번호, 이름, 나이, 성별, 지역, 직업, 전화번호, 이메일
CREATE TABLE TB_MEMBER(
	M_NO NUMBER PRIMARY KEY,
	M_NAME VARCHAR2(100) NOT NULL,
	M_AGE NUMBER NOT NULL,
	M_GENDER VARCHAR2(2) CHECK(M_GENDER IN ('M', 'F')) NOT NULL,
	M_LOCATION VARCHAR2(100),
	M_JOB VARCHAR2(20),
	M_TEL VARCHAR2(20),
	M_EMAIL VARCHAR2(20)
);

INSERT INTO TB_MEMBER
VALUES(MEMBERSEQ.NEXTVAL, '유연주', 100, 'F', '서울시 노원', '학생', '010-0000-0000' , 'KH@KH.COM');

SELECT M_NO, M_NAME, M_AGE, M_GENDER, M_LOCATION, M_JOB, M_TEL, M_EMAIL
FROM TB_MEMBER;