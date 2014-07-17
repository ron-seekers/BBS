
drop table  userinfo;
create table userinfo(
  id int(10) not null primary key auto_increment,   --自动增长
  username varchar(100) not null ,                  --用户名
  password varchar(100)  not null ,                  --密码
  nickname varchar(50) not null,                    --昵称
  email varchar(50) not null ,                      --Email
  QQ varchar(15) not null ,                         --QQ号
  province varchar(20) not null ,                   --省份
  city varchar (20) not null ,                       ---市
  sex int not null,                                   --性别
  tel varchar(20) not null
);