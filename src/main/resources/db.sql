CREATE TABLE `t_user` (
  `user_id` int(64) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(40) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '用户名称',
  `user_gender` int(1) DEFAULT NULL COMMENT '用户性别(0-男性，1-女性)',
  `user_phone` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '用户电话',
  `user_avatar` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户头像',
  `user_address` varchar(128) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户地址',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户表';