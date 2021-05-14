select user(),database();

create table member(
id varchar(15) not null,
passwd char(41),
name varchar(10),
age int(11),
gender varchar(5),
email varchar(30),
primary key(id)
);

insert into member values(1, password('1111'), '김상건', 40, '여자', 'test@test.co.kr');

select id, name, age, gender, email
from member
where id = 1 and passwd = password('1111');