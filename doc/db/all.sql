drop table if exists `test`;
create table `test` (
  `id` int(11) not null auto_increment,
  `name` varchar(50) not null,
  `age` int(11) not null,
  primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='测试';


insert `test` (`name`, `age`) values ('张三', 18);
insert `test` (`name`, `age`) values ('李四', 20);
select * from `test`;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `create_time` date NULL DEFAULT NULL COMMENT '创建时间',
  `modify_time` date NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

insert `user` (`username`, `password`, `create_time`, `modify_time`) values ('admin', 'admin', '2022-04-28', '2022-04-28');