/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : studb

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 09/12/2018 15:59:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score`  (
  `xh` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gaoshu` int(11) DEFAULT NULL,
  `english` int(11) DEFAULT NULL,
  `c` int(11) DEFAULT NULL,
  PRIMARY KEY (`xh`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_stu
-- ----------------------------
DROP TABLE IF EXISTS `t_stu`;
CREATE TABLE `t_stu`  (
  `cde` int(11) DEFAULT NULL,
  `info` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `bj` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `csrq` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `mz` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `nj` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `rxrq` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `xb` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `xh` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `xjzt` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `xm` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `xmEn` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `xz` int(11) DEFAULT NULL,
  `yxh` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `yxm` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `yxmen` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `zyh` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `zym` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `zymEn` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_stu
-- ----------------------------
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19990417', '汉族                ', '2017', '201709', '女', '2017211760', '在校', '汤尹思', 'Tang Yin Si ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '20000911', '汉族                ', '2017', '201709', '女', '2017211761', '在校', '熊吉蓉', 'Xiong Ji Rong ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19990429', '汉族                ', '2017', '201709', '女', '2017211763', '在校', '尹奕萌', 'Yin Yi Meng ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19991128', '汉族                ', '2017', '201709', '男', '2017211769', '在校', '刘峻卓', 'Liu Jun Zhuo ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '20001015', '汉族                ', '2017', '201709', '男', '2017211772', '在校', '李博涵', 'Li Bo Han ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19990914', '汉                  ', '2017', '201709', '男', '2017211776', '在校', '俞一航', 'Yu Yi Hang ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19990312', '汉族                ', '2017', '201709', '男', '2017211780', '在校', '薛礼', 'Xue Li ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19990221', '汉族                ', '2017', '201709', '男', '2017211783', '在校', '刘一峰', 'Liu Yi Feng ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19980819', '汉族                ', '2017', '201709', '男', '2017211791', '在校', '彭浩航', 'Peng Hao Hang ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19970402', '土家族              ', '2017', '201709', '男', '2017211794', '在校', '田越胜', 'Tian Yue Sheng ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19981218', '苗族                ', '2017', '201709', '男', '2017211795', '在校', '张绍', 'Zhang Shao ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19990120', '汉族                ', '2017', '201709', '女', '2017211904', '在校', '叶春璐', 'Ye Chun Lu ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19981219', '汉族                ', '2017', '201709', '女', '2017211905', '在校', '韩梦圆', 'Han Meng Yuan ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19980412', '汉族                ', '2017', '201709', '女', '2017211906', '在校', '颜西鞠', 'Yan Xi Ju ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19980924', '汉族                ', '2017', '201709', '女', '2017211908', '在校', '李鑫', 'Li Xin ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19981106', '汉族                ', '2017', '201709', '女', '2017211909', '在校', '付美玲', 'Fu Mei Ling ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19991012', '汉族                ', '2017', '201709', '女', '2017211910', '在校', '肖喆', 'Xiao Zhe ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19990111', '汉族                ', '2017', '201709', '男', '2017211911', '在校', '许翰林', 'Xu Han Lin ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '20000309', '汉族                ', '2017', '201709', '男', '2017211913', '在校', '项天晟', 'Xiang Tian Sheng ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19990309', '汉族                ', '2017', '201709', '男', '2017211916', '在校', '蒲爱军', 'Pu Ai Jun ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19981006', '汉                  ', '2017', '201709', '男', '2017211920', '在校', '施成博', 'Shi Cheng Bo ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19981209', '汉族                ', '2017', '201709', '男', '2017211921', '在校', '唐寅', 'Tang Yin ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19990115', '汉族                ', '2017', '201709', '男', '2017211922', '在校', '张钱隆', 'Zhang Qian Long ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19970615', '汉族                ', '2017', '201709', '男', '2017211924', '在校', '李欣宇', 'Li Xin Yu ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19990508', '汉族                ', '2017', '201709', '男', '2017211926', '在校', '昌楚钦', 'Chang Chu Qin ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19990817', '汉族                ', '2017', '201709', '男', '2017211927', '在校', '李红余', 'Li Hong Yu ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19990123', '汉族                ', '2017', '201709', '男', '2017211928', '在校', '李宜伟', 'Li Yi Wei ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19981125', '汉族                ', '2017', '201709', '男', '2017211930', '在校', '张远昌', 'Zhang Yuan Chang ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19980805', '汉族                ', '2017', '201709', '男', '2017211931', '在校', '张云洋', 'Zhang Yun Yang ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19980627', '汉族                ', '2017', '201709', '男', '2017211932', '在校', '王绪康', 'Wang Xu Kang ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19990408', '汉族                ', '2017', '201709', '男', '2017211933', '在校', '邬俊洁', 'Wu Jun Jie ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19980830', '汉族                ', '2017', '201709', '男', '2017211934', '在校', '周渝人', 'Zhou Yu Ren ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19990909', '汉族                ', '2017', '201709', '男', '2017211935', '在校', '钟家强', 'Zhong Jia Qiang ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '19990508', '汉族                ', '2017', '201709', '男', '2017211936', '在校', '杨鑫', 'Yang Xin ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');
INSERT INTO `t_stu` VALUES (0, 'ok', '04011701', '20000120', '汉族                ', '2017', '201709', '男', '2017211937', '在校', '蒲森林', 'Pu Sen Lin ', 4, '04', '计算机科学与技术学院', 'School of Computer Science and Technology ', '0401', '计算机科学与技术', 'Computer Science and Technology');

SET FOREIGN_KEY_CHECKS = 1;
