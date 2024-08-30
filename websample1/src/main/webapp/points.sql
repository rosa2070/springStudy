create table memberpoint
(
	pointnum number(5) primary key, -- 포인트 번호
	num number(5) references members(num), --회원번호
	point number(4) -- 적립금(포인트)
);
create sequence point_seq;