-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
    `id` bigint(32) NOT NULL AUTO_INCREMENT,
    `name` varchar(10) DEFAULT NULL,
    `password` varchar(64) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'Vim', '123');
INSERT INTO `user` VALUES ('2', 'Emacs', '123');
