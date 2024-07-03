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

-- ----------------------------------------
-- Table structure for ice_user_address
-- ----------------------------------------
DROP TABLE IF EXISTS `ice_user_address`;
CREATE TABLE `ice_user_address` (
    `id` bigint(32) NOT NULL,
    `name` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- -------------------------------
-- Records of ice_user_address
-- -------------------------------
INSERT INTO `ice_user_address` VALUES ('1', 'https://www.vim.org/');
INSERT INTO `ice_user_address` VALUES ('2', 'https://www.gnu.org/software/emacs/');
    
-- --------------------------------
-- Table structure for ice_user
-- --------------------------------
DROP TABLE IF EXISTS `ice_user`;
CREATE TABLE `ice_user` (
    `id` bigint(32) NOT NULL AUTO_INCREMENT,
    `name` varchar(10) DEFAULT NULL,
    `password` varchar(64) DEFAULT NULL,
    `age` int(10) DEFAULT NULL,
    `address_id` bigint(32) DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `FK_address_id` (`address_id`),
    CONSTRAINT `FK_address_id` FOREIGN KEY (`address_id`) REFERENCES `ice_user_address` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ice_user
-- ----------------------------
INSERT INTO `ice_user` VALUES ('1', 'Vim', '123', 35, 1);
INSERT INTO `ice_user` VALUES ('2', 'Emacs', '123', 50, 2);

-- ----------------------------------------
-- Table structure for ice_school
-- ----------------------------------------
DROP TABLE IF EXISTS `ice_school`;
CREATE TABLE `ice_school` (
    `id` bigint(32) NOT NULL,
    `name` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- -------------------------------
-- Records of ice_school
-- -------------------------------
INSERT INTO `ice_school` VALUES ('1', 'CMU');
INSERT INTO `ice_school` VALUES ('2', 'MIT');

-- ----------------------------------------
-- Table structure for ice_student
-- ----------------------------------------
DROP TABLE IF EXISTS `ice_student`;
CREATE TABLE `ice_student` (
    `id` bigint(32) NOT NULL,
    `name` varchar(255) DEFAULT NULL,
    `age` int(2) DEFAULT NULL,
    `school_id` bigint(32) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- -------------------------------
-- Records of ice_student
-- -------------------------------
INSERT INTO `ice_student` VALUES ('1', 'QianXuesen', 24, 2);
INSERT INTO `ice_student` VALUES ('2', 'ZhangChaoyang', 25, 2);
INSERT INTO `ice_student` VALUES ('3', 'LiKaifu', 25, 1);
INSERT INTO `ice_student` VALUES ('4', 'LuQi', 25, 1);
