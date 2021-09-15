create table board(
no number constraint board_no_pk primary key,
title varchar2(100),
writer varchar2(50),
content varchar2(400),
pwd varchar2(10),
hit number(5),
regdate date);

create sequence board_seq
increment by 1
start with 1;