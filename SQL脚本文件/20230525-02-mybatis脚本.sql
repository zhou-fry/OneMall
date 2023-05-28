--先删
drop table if exists `tb_user`;

--再新建表t_user
create table `tb_user` (
	`id` int(11) not null auto_increment comment '主键ID',
	`name` varchar(100) not null default '' comment '登录名',
	`password` varchar(100) not null default '' comment '登录密码',
	primary key(`id`)
) engine=innodb auto_increment=1 default charset=utf8;

--初始化数据
INSERT INTO `newbee_mall`.`tb_user`(`id`, `name`, `password`) VALUES (1, 'SpringBoot', '123456');
INSERT INTO `newbee_mall`.`tb_user`(`id`, `name`, `password`) VALUES (2, 'MyBatis', '123456');
INSERT INTO `newbee_mall`.`tb_user`(`id`, `name`, `password`) VALUES (3, 'Thymeleaf', '123456');
INSERT INTO `newbee_mall`.`tb_user`(`id`, `name`, `password`) VALUES (4, 'Java', '123456');
INSERT INTO `newbee_mall`.`tb_user`(`id`, `name`, `password`) VALUES (5, 'MySQL', '123456');
INSERT INTO `newbee_mall`.`tb_user`(`id`, `name`, `password`) VALUES (6, 'IDEA', '123456');