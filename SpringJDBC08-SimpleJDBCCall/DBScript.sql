CREATE OR REPLACE PROCEDURE P_AUTHENTICATION (USER IN VARCHAR2 , PASS IN VARCHAR2 , RESULT OUT VARCHAR2 ) AS 
 cnt NUMBER(5);
BEGIN
  SELECT COUNT(*) INTO CNT FROM USERSLIST WHERE  USERNAME=USER AND PASSWORD=PASS;
  IF(CNT<>0)THEN
    RESULT:='VALID CREDENTIALS';
   ELSE
   RESULT:='INVALID CREDENTIALS';
  END IF; 
END;
/
===============================
CREATE TABLE USERSLIST ("USERNAME" VARCHAR2(20) NOT NULL ENABLE, 
	"PASSWORD" VARCHAR2(20), 
	 CONSTRAINT "USERSLIST_PK" PRIMARY KEY ("USERNAME"));