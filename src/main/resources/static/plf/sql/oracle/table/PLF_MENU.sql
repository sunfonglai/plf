-- Create table
create table PLF_MENU
(
  id                 VARCHAR2(42) not null,
  menu_code          VARCHAR2(42),
  menu_name          VARCHAR2(42),
  url                VARCHAR2(200),
  moudle_id          VARCHAR2(10),
  menu_level         NUMBER,
  is_leaf            CHAR(1),
  parent_id          VARCHAR2(42),
  order_idx          NUMBER,
  moudle_display_idx NUMBER
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
comment on column PLF_MENU.id
  is 'id';
comment on column PLF_MENU.menu_code
  is '菜单代码';
comment on column PLF_MENU.menu_name
  is '菜单名称';
comment on column PLF_MENU.url
  is '路径';
comment on column PLF_MENU.moudle_id
  is '归属模块标识';
comment on column PLF_MENU.menu_level
  is '1,2,3';
comment on column PLF_MENU.is_leaf
  is 'Y/N';
comment on column PLF_MENU.parent_id
  is '上级菜单ID';
comment on column PLF_MENU.order_idx
  is '菜单显示排序';
comment on column PLF_MENU.moudle_display_idx
  is '模块显示顺序';
-- Create/Recreate primary, unique and foreign key constraints
alter table PLF_MENU
  add constraint PLF_MENU_PK primary key (ID)
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

--预置测试数据
insert into plf_menu (ID, MENU_CODE, MENU_NAME, URL, MOUDLE_ID, MENU_LEVEL, IS_LEAF, PARENT_ID, ORDER_IDX, MOUDLE_DISPLAY_IDX)
values ('sasdsfdf', '999', '系统设置', null, 'pf', '1', 'N', null, '0', '100');

insert into plf_menu (ID, MENU_CODE, MENU_NAME, URL, MOUDLE_ID, MENU_LEVEL, IS_LEAF, PARENT_ID, ORDER_IDX, MOUDLE_DISPLAY_IDX)
values ('sasdsfdf1231231', '999001', '系统管理', null, 'pf', '2', 'N', 'sasdsfdf', '100', '100');

insert into plf_menu (ID, MENU_CODE, MENU_NAME, URL, MOUDLE_ID, MENU_LEVEL, IS_LEAF, PARENT_ID, ORDER_IDX, MOUDLE_DISPLAY_IDX)
values ('sasdsfdf123123', '999001001', '菜单管理', null, 'pf', '3', 'Y', 'sasdsfdf1231231', '101', '100');

insert into plf_menu (ID, MENU_CODE, MENU_NAME, URL, MOUDLE_ID, MENU_LEVEL, IS_LEAF, PARENT_ID, ORDER_IDX, MOUDLE_DISPLAY_IDX)
values ('gadfadf', '999001002', '用户管理', null, 'pf', '3', 'Y', 'sasdsfdf1231231', '102', '100');

insert into plf_menu (ID, MENU_CODE, MENU_NAME, URL, MOUDLE_ID, MENU_LEVEL, IS_LEAF, PARENT_ID, ORDER_IDX, MOUDLE_DISPLAY_IDX)
values ('gsfgs56456', '900', '数据中心', null, 'dc', '1', 'N', null, '0', '90');

insert into plf_menu (ID, MENU_CODE, MENU_NAME, URL, MOUDLE_ID, MENU_LEVEL, IS_LEAF, PARENT_ID, ORDER_IDX, MOUDLE_DISPLAY_IDX)
values ('gsfgs56456213213', '900001', '数据处理', null, 'dc', '2', 'N', 'gsfgs56456', '100', '90');

insert into plf_menu (ID, MENU_CODE, MENU_NAME, URL, MOUDLE_ID, MENU_LEVEL, IS_LEAF, PARENT_ID, ORDER_IDX, MOUDLE_DISPLAY_IDX)
values ('gsfgs56456213213213123', '900001001', '数据同步', null, 'dc', '3', 'Y', 'gsfgs56456213213', '101', '90');

--修改表结构
-- Add/modify columns
alter table PLF_MENU add page_id VARCHAR2(42);
-- Add comments to the columns
comment on column PLF_MENU.page_id
  is '页面的ID';

--修改表结构
alter table PLF_MENU add icon_id VARCHAR2(42);
alter table PLF_MENU add path VARCHAR2(100);
-- Add comments to the columns
comment on column PLF_MENU.icon_id
  is '图标类型';
comment on column PLF_MENU.path
  is '访问路径';


