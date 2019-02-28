SQL> create table businessauto1(question_id number(10),q1 varchar2(50),vehicletype varchar2(20),q2 varchar2(50),vehiclemy varchar2(20),q3 varchar2(50),vehiclemodel varchar2(20),q4 varchar2(50),dailycd varchar2(20),q5 varchar2(50),servicecenter varchar2(20),q6 varchar2(50),limit varchar2(20),q7 varchar2(50),limit2 varchar2(20));

Table created.

SQL> create sequence questionid start with 1000;

Sequence created.


SQL> desc accountcreation;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 INSURED_NAME                                       VARCHAR2(30)
 INSURED_STREET                                     VARCHAR2(30)
 INSURED_CITY                                       VARCHAR2(15)
 INSURED_STATE                                      VARCHAR2(15)
 INSURED_ZIP                                        NUMBER(10)
 BUSINESS_SEGMENT                                   VARCHAR2(30)
 ACCOUNT_NUMBER                                     NUMBER(10)
 
 
 
 create table accountcreation(INSURED_NAME VARCHAR2(30),INSURED_STREET  VARCHAR2(30),INSURED_CITY  VARCHAR2(15),INSURED_STATE VARCHAR2(15),INSURED_ZIP NUMBER(10),BUSINESS_SEGMENT VARCHAR2(30),ACCOUNT_NUMBER NUMBER(10))
 
 

 desc userrole;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 USERNAME                                           VARCHAR2(20)
 PASSWORD                                           VARCHAR2(10)
 ROLECODE                                           VARCHAR2(10)