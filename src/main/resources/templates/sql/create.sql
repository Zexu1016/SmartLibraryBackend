USE smartlibrary;
CREATE TABLE book (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Id',
    title VARCHAR(20) NOT NULL COMMENT '书名',
    author VARCHAR(10) NOT NULL COMMENT '作者',
    press VARCHAR(20) NOT NULL COMMENT '出版社',
    bookshelf VARCHAR(20) NOT NULL COMMENT '所在书架号',
    layer INT NOT NULL COMMENT '所在层',
    type VARCHAR(5) NOT NULL COMMENT '类别'
) COMMENT = '图书表';

CREATE TABLE book_info (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Id',
    bar_code INT(13) NOT NULL COMMENT '条形码',
    description VARCHAR(20) NOT NULL COMMENT '描述'
) COMMENT = '图书详情表';

CREATE TABLE user (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Id',
    password VARCHAR(64) NOT NULL COMMENT '密码',
    username VARCHAR(6) NOT NULL COMMENT '用户名',
    name VARCHAR(6) NOT NULL COMMENT '用户姓名',
    gender VARCHAR(2) NOT NULL COMMENT '用户性别',
    borrowed_count INT NOT NULL COMMENT '已借书数'
) COMMENT = '会员表';

CREATE TABLE permission (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Id',
    permission_name VARCHAR(64) NOT NULL COMMENT '权限名'
) COMMENT = '权限表';

CREATE TABLE role (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Id',
    role_name VARCHAR(64) NOT NULL COMMENT '角色名'
) COMMENT = '角色表';

CREATE TABLE role_menu (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Id',
    role_id INT NOT NULL COMMENT '角色id',
    permission_id INT NOT NULL COMMENT '权限id'
) COMMENT = '角色-权限表';

CREATE TABLE user_role (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Id',
    user_id INT NOT NULL COMMENT '用户id',
    role_id INT NOT NULL COMMENT '角色id'
) COMMENT = '用户-角色表';

CREATE TABLE member_info (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Id',
    email VARCHAR(20) NOT NULL COMMENT '电子邮箱',
    tel VARCHAR(11) NOT NULL COMMENT '手机号码'
) COMMENT = '会员详情表';

CREATE TABLE borrow (
    id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'Id',
    book_id INT NOT NULL COMMENT '书籍id',
    member_id INT NOT NULL COMMENT '会员id',
    borrow_Time DATETIME NOT NULL COMMENT '借出时间',
    status VARCHAR(8) NOT NULL COMMENT '借阅状态'
) COMMENT = '借阅表';

CREATE TABLE authority (
    level INT(1) NOT NULL PRIMARY KEY COMMENT '权限级别',
    borrowing_limit INT NOT NULL COMMENT '借阅上限'
) COMMENT  = '权限表';