--删除
drop table if exists tb_newbee_mall_user;
--新增user表
create table tb_newbee_mall_user (
	user_id bigint(20) not null auto_increment comment '用户主键ID',
	nick_name varchar(50) not null default '' comment '用户昵称',
	login_name varchar(11) not null default '' comment '登录名称（默认为手机号）',
	password_md5 varchar(32) not null Default '' comment 'MD5加密后的密码',
	introduce_sign varchar(100) not null default '' comment '个性签名',
	is_deleted tinyint(4) not null default '0' comment '注销标识字段（0-正常，1-已注销）',
	locked_flag tinyint(4) not null default '0' comment '锁定标识字段（0-未锁定，1-已锁定）',
	create_time datetime not null default current_timestamp comment '注册时间',
	primary key(`user_id`) using btree
)engine=innodb default charset=utf8 row_format=dynamic;
--初始化数据
INSERT INTO `newbee_mall`.`tb_newbee_mall_user`(`user_id`, `nick_name`, `login_name`, `password_md5`, `introduce_sign`, `is_deleted`, `locked_flag`, `create_time`) VALUES (1, '十三', '13700002703', 'e10adc3949ba59abbe56e057f20f883e', '我不怕万人阻挡，只怕自己头像', 0, 0, '2023-05-27 16:05:57');
INSERT INTO `newbee_mall`.`tb_newbee_mall_user`(`user_id`, `nick_name`, `login_name`, `password_md5`, `introduce_sign`, `is_deleted`, `locked_flag`, `create_time`) VALUES (2, '陈尼克', '13711113333', 'e10adc3949ba59abbe56e057f20f883e', '测试用户陈尼克', 0, 0, '2023-05-27 16:06:23');
INSERT INTO `newbee_mall`.`tb_newbee_mall_user`(`user_id`, `nick_name`, `login_name`, `password_md5`, `introduce_sign`, `is_deleted`, `locked_flag`, `create_time`) VALUES (3, '测试用户', '13811113333', 'e10adc3949ba59abbe56e057f20f883e', '测试用户1', 0, 0, '2023-05-27 16:07:13');

drop table if exists tb_newbee_mall_user_token;

create table tb_newbee_mall_user_token (
	user_id bigint(20) not null auto_increment comment '用户主键ID',
	token varchar(32) not null comment 'token值（32位字符串）',
	update_time datetime not null default current_timestamp comment '修改时间',
	expire_time datetime not null default current_timestamp comment 'token过期时间',
	primary key(`user_id`) ,
	unique key uq_token (`token`)
)engine=innodb default charset=utf8;