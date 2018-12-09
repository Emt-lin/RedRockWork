/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : mydb

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 30/11/2018 23:32:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` int(11) NOT NULL,
  `fee` int(11) DEFAULT NULL,
  `dname` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `pnumber` int(11) DEFAULT NULL,
  `address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `gname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`deptno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (10, 1000, '熟食', 123, 'aaa', '零食');
INSERT INTO `dept` VALUES (20, 1000, '熟食', 123, 'aaa', '零食');

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`  (
  `empno` int(11) NOT NULL,
  `ename` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `job` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `epnumber` int(11) DEFAULT NULL,
  `eaddress` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `deptno` int(11) DEFAULT NULL,
  PRIMARY KEY (`empno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `gnumber` int(11) DEFAULT NULL,
  `gname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `cost` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `deptno` int(11) DEFAULT NULL,
  `sname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`gname`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier`  (
  `sname` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `spnumber` int(11) DEFAULT NULL,
  `sadderess` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`sname`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for warehouse
-- ----------------------------
DROP TABLE IF EXISTS `warehouse`;
CREATE TABLE `warehouse`  (
  `wnumber` int(11) DEFAULT NULL,
  `wname` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `wpnumber` int(11) DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
