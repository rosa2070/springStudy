drop table board;
drop sequence board_seq;

create table board
(
	num number(7) primary key,
	writer varchar2(20),
	title varchar2(20),
	content clob,
	hit number(5), //조회수
	regdate date
);

create sequence board_seq;

-- 자바설정기반 mvc를 이용해서 글등록하는 기능
