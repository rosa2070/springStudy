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

-- where절이 select전에 실행됨
-- 페이징


insert into board values(2, 'aa', 'bb', 'cc', 0, sysdate);
insert into board values(6, 'aa', 'bb', 'cc', 0, sysdate);
insert into board values(3, 'aa', 'bb', 'cc', 0, sysdate);
insert into board values(88, 'aa', 'bb', 'cc', 0,sysdate);
insert into board values(99, 'aa', 'bb', 'cc', 0, sysdate);

select * from
(
    select b.*, rownum rnum
    from (
        select * from board
        order by num desc
    ) b
)
where rnum>=1 and rnum<=10;

commit;


-- 이전글을 얻어오는 sql 구문
select * from board where num  = (select MAX(num) from board where num<99);

select * from (
    select * from board where num<99 order by num desc
) where rownum = 1;   


-- 다음글을 얻어오는 sql 구문
select * from board where num=(select min(num) from board where num>88);

select * from 
(
    select * from board where num>88 order by num asc
) where rownum=1;

