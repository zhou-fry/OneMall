--ʹ��navicat��������MySQL
--�½����ݿ�
create DATABASE newbee_mall;

--�½�һ�ű�
--��ɾ������֤���ظ�ִ�У�
drop table if EXISTS jdbc_test;
--���½�
create table jdbc_test (
	ds_id int(11) not null auto_increment comment '����ID',
	ds_type varchar(100) DEFAULT null COMMENT '����Դ����',
	ds_name varchar(100) DEFAULT null comment '����Դ����',
	PRIMARY KEY (ds_id) using BTREE 
) ENGINE = INNODB CHARACTER SET = utf8;
--���ݳ�ʼ��
INSERT INTO `newbee_mall`.`jdbc_test`(`ds_id`, `ds_type`, `ds_name`) VALUES (1, 'com.zaxxer.hikari.HikariDataSource', 'hikari����Դ');
INSERT INTO `newbee_mall`.`jdbc_test`(`ds_id`, `ds_type`, `ds_name`) VALUES (2, 'org.apache.commons.dbcp2..BasicDataSource', 'dbcp2����Դ');






