USE smartlibrary;
CREATE TABLE book (
    id INT unsigned not null primary key AUTO_INCREMENT COMMENT 'Id',
    title VARCHAR(20) not null COMMENT '书名',
    author VARCHAR(10) not null COMMENT '作者',
    press VARCHAR(20) not null COMMENT '出版社',
    location VARCHAR(20) not null COMMENT '位置',
    type VARCHAR(5) not null COMMENT '类别'
) COMMENT = '图书表';

CREATE TABLE book_info (
    id INT unsigned not null primary key AUTO_INCREMENT COMMENT 'Id',
    bar_code INT(13) not null COMMENT '条形码',
    description VARCHAR(20) not null COMMENT '描述'
) COMMENT = '图书详情表';

CREATE TABLE member (
    id INT unsigned not null primary key AUTO_INCREMENT COMMENT 'Id',
    name VARCHAR(6) not null COMMENT '会员姓名',
    gender VARCHAR(2) not null COMMENT '会员性别',
    level INT(1) not null COMMENT '会员级别'
) COMMENT = '会员表';

CREATE TABLE member_info (
    id INT unsigned not null primary key AUTO_INCREMENT COMMENT 'Id',
    email VARCHAR(20) not null COMMENT '电子邮箱',
    tel VARCHAR(11) not null COMMENT '手机号码'
) COMMENT = '会员详情表';

CREATE TABLE borrow (
    id INT unsigned not null primary key AUTO_INCREMENT COMMENT 'Id',
    book_id INT not null COMMENT '书籍id',
    member_id INT not null COMMENT '会员id',
    borrow_Time DATETIME not null COMMENT '借出时间',
    status VARCHAR(8) not null COMMENT '借阅状态'
) COMMENT = '借阅表';

CREATE TABLE authority (
    level INT(1) not null PRIMARY KEY COMMENT '权限级别',
    borrowing_limit INT not null COMMENT '借阅上限'
) COMMENT  = '权限表';