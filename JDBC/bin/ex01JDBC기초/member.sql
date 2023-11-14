 /*
    sql파일 실행 후 반드시 status 확인하기!
    만약, status가 disconnected 상태라면
    
    1) Data Source Explorer에서 Datebase Connections 연결고리(노란색)
       잘 연결되어있는 지 확인
    2) 위쪽에 Type --> 내가 원하는 DB 선택되었는지
            Name --> 내가 원하는 DB 선택되었는지
    
*/
 
 /*
  *테이블 명 : AIMEMBER
  *컬럼
  * 1) ID 문자열(50) 널이 아님, PK
  * 2) PW 문자열(100) 널이 아님
  * 3) NAME 문자열(50) 널이 아님
  * 4) AGE 숫자
 */
 
 CREATE TABLE AIMEMBER(
 ID VARCHAR2(50) PRIMARY KEY,
 PW VARCHAR2(100) NOT NULL,
 NAME VARCHAR2(50) NOT NULL,
 AGE NUMBER
 ) ; 
 
 INSERT INTO AIMEMBER VALUES('smhrd', '12345', '권용현', 24)
 
 SELECT * FROM AIMEMBER ;