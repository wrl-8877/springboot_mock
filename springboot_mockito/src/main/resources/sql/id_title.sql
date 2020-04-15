/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-08-07 01:58:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for id_title
-- ----------------------------
DROP TABLE IF EXISTS `id_title`;
CREATE TABLE `id_title` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `title` varchar(128) DEFAULT NULL COMMENT '标题',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
