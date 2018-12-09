/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : mydb1

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 30/11/2018 17:00:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu`  (
  `sid` int(11) NOT NULL,
  `sname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gander` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `province` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `tuition` int(11) DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES (1, '王永', 23, '男', '北京', 1500);
INSERT INTO `stu` VALUES (2, '张雷', 25, '男', '辽宁', 2500);
INSERT INTO `stu` VALUES (3, '李强', 22, '男', '北京', 3500);
INSERT INTO `stu` VALUES (4, '宋永合', 25, '男', '北京', 1500);
INSERT INTO `stu` VALUES (5, '叙美丽', 23, '女', '北京', 1000);
INSERT INTO `stu` VALUES (6, '陈宁', 22, '女', '山东', 2500);
INSERT INTO `stu` VALUES (7, '王丽', 21, '女', '北京', 1600);
INSERT INTO `stu` VALUES (8, '李永', 23, '男', '北京', 3500);
INSERT INTO `stu` VALUES (9, '张玲', 23, '女', '广州', 2500);
INSERT INTO `stu` VALUES (10, '啊历', 18, '男', '山西', 3500);
INSERT INTO `stu` VALUES (11, '王刚', 23, '男', '湖北', 4500);
INSERT INTO `stu` VALUES (12, '陈永', 24, '男', '北京', 1500);
INSERT INTO `stu` VALUES (13, '李雷', 24, '男', '辽宁', 2500);
INSERT INTO `stu` VALUES (14, '李沿', 22, '男', '北京', 3500);
INSERT INTO `stu` VALUES (15, '王小明', 25, '男', '北京', 1500);
INSERT INTO `stu` VALUES (16, '王小丽', 23, '女', '北京', 1000);
INSERT INTO `stu` VALUES (17, '唐宁', 22, '女', '山东', 2500);
INSERT INTO `stu` VALUES (18, '唐丽', 21, '女', '北京', 1600);
INSERT INTO `stu` VALUES (19, '啊永', 23, '男', '北京', 3500);
INSERT INTO `stu` VALUES (20, '唐玲', 23, '女', '广州', 2500);
INSERT INTO `stu` VALUES (21, '叙刚', 18, '男', '山西', 3500);
INSERT INTO `stu` VALUES (22, '王累', 23, '男', '湖北', 4500);
INSERT INTO `stu` VALUES (23, '赵安', 23, '男', '北京', 1500);
INSERT INTO `stu` VALUES (24, '关雷', 25, '男', '辽宁', 2500);
INSERT INTO `stu` VALUES (25, '李字', 22, '男', '北京', 3500);
INSERT INTO `stu` VALUES (26, '小王', 21, '男', '北京', 2300);

SET FOREIGN_KEY_CHECKS = 1;
