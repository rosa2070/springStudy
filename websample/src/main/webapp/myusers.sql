CREATE TABLE MYUSERS
(
    USERNAME VARCHAR2(255 CHAR) NOT NULL
        CONSTRAINT MYUSERS_PK PRIMARY KEY,
    PASSWORD VARCHAR2(255 CHAR) NOT NULL,
    EMAIL    VARCHAR2(255 CHAR)
);

commit;
