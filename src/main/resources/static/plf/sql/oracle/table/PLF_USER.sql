-- Create table
create table PLF_USER
(
  id        VARCHAR2(42) not null,
  user_code VARCHAR2(30),
  user_name VARCHAR2(30),
  user_psw  VARCHAR2(42),
  telephone CHAR(11),
  email     VARCHAR2(50)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
-- Add comments to the columns
comment on column PLF_USER.id
  is 'ID';
comment on column PLF_USER.user_code
  is '登录名';
comment on column PLF_USER.user_name
  is '用户名';
comment on column PLF_USER.user_psw
  is '密码（密文）';
comment on column PLF_USER.telephone
  is '手机号码，登录用';
comment on column PLF_USER.email
  is '电子邮箱，登录用';
-- Create/Recreate primary, unique and foreign key constraints
alter table PLF_USER
  add constraint PLF_USER_PK primary key (ID)
  using index
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

--测试数据
insert into PLF_USER (ID, USER_CODE, USER_NAME, USER_PSW, TELEPHONE, EMAIL)
values ('1', 'sa', 'sa', '1', '1          ', '1');

