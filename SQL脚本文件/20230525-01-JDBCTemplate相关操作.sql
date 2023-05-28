--使用navicat工具连接MySQL
--新建数据库
create DATABASE newbee_mall;

--新建一张表
--先删除（保证可重复执行）
drop table if EXISTS jdbc_test;
--后新建
create table jdbc_test (
	ds_id int(11) not null auto_increment comment '主键ID',
	ds_type varchar(100) DEFAULT null COMMENT '数据源类型',
	ds_name varchar(100) DEFAULT null comment '数据源名称',
	PRIMARY KEY (ds_id) using BTREE 
) ENGINE = INNODB CHARACTER SET = utf8;
--数据初始化
INSERT INTO `newbee_mall`.`jdbc_test`(`ds_id`, `ds_type`, `ds_name`) VALUES (1, 'com.zaxxer.hikari.HikariDataSource', 'hikari数据源');
INSERT INTO `newbee_mall`.`jdbc_test`(`ds_id`, `ds_type`, `ds_name`) VALUES (2, 'org.apache.commons.dbcp2..BasicDataSource', 'dbcp2数据源');






