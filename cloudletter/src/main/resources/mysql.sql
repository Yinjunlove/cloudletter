-- 2019.3.10 by jonny demo表和测试数据
CREATE TABLE `demo`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uuid` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'uuid',
  `creater` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '创建人',
  `editor` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '编辑人',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `edit_date` datetime DEFAULT NULL COMMENT '编辑时间',
  `record_status` int(1) DEFAULT NULL COMMENT '记录状态(0:未删除,1:删除)',
  `sort` int(10) DEFAULT NULL COMMENT '排序',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin COMMENT '内容',
  `comment` text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;
INSERT INTO `demo` VALUES (1, '1111111111111111', '1', '1', '2019-03-10 21:19:09', '2019-03-10 21:19:32', 0, 1, '无', '无');
INSERT INTO `demo` VALUES (2, '1111111111111111', '2', '2', '2019-03-10 23:09:26', '2019-03-10 23:09:56', 0, 1, '内容', '备注');