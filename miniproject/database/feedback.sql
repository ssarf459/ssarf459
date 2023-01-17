create database feedback;

use feedback;

show tables;

create table feedback_table(name varchar(50) not null, id int not null, primary key(id), dept varchar(50) not null, feedbacks varchar(255) not null, suggestions varchar(255) not null);
create table user_table(u_id int not null auto_increment, email varchar(50) not null, primary key(u_id), password varchar(50) not null);

desc feedback_table;
desc user_table;

drop table feedback_table;
drop table user_table;

select * from feedback_table;
select * from user_table;

insert into user_table values(8,"hello@xyz.com", "root");

truncate table user_table;