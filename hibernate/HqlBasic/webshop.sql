# MySQL-Front 5.1  (Build 3.80)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: 127.0.0.1    Database: webshop
# ------------------------------------------------------
# Server version 5.1.36-community

DROP DATABASE IF EXISTS `webshop`;
CREATE DATABASE `webshop` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `webshop`;

#
# Source for table commodity
#

DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `price` double(11,2) DEFAULT NULL,
  `unit` varchar(50) DEFAULT NULL,
  `category` varchar(100) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `seller` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

#
# Dumping data for table commodity
#

LOCK TABLES `commodity` WRITE;
/*!40000 ALTER TABLE `commodity` DISABLE KEYS */;
INSERT INTO `commodity` VALUES (1,'中式童装',120,'套','童装','中式童装',1);
INSERT INTO `commodity` VALUES (2,'女士套装',200,'套','女装','女士职业套装',1);
INSERT INTO `commodity` VALUES (3,'男士西服',200,'套','男装','男士西服套装',1);
INSERT INTO `commodity` VALUES (4,'笔记本电脑',4000,'台','电脑','双核笔记本电脑',2);
INSERT INTO `commodity` VALUES (5,'移动硬盘',400,'块','电脑周边','1t移动硬盘',2);
INSERT INTO `commodity` VALUES (6,'液晶电视',5000,'台','电视','4k高清液晶电视',3);
INSERT INTO `commodity` VALUES (7,'滚筒洗衣机',4000,'台','洗衣机','滚筒洗衣机',3);
INSERT INTO `commodity` VALUES (8,'《hibernate编程》',30,'本','实体书','介绍hibernate编程',4);
INSERT INTO `commodity` VALUES (9,'《Java核心》',50,'本','实体书','介绍Java编程核心',4);
INSERT INTO `commodity` VALUES (10,'《海底两万里》',40,'本','电子书','经典科幻小说',4);
INSERT INTO `commodity` VALUES (11,'优盘',30,'个','电脑周边','16G优盘',2);
/*!40000 ALTER TABLE `commodity` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table customer
#

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `tel` varchar(50) DEFAULT NULL,
  `address` varchar(1000) DEFAULT NULL,
  `email` varchar(300) DEFAULT NULL,
  `sex` varchar(30) DEFAULT NULL,
  `description` varchar(4000) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

#
# Dumping data for table customer
#

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'张三','13800000000','中国上海××区××路','13800000000@138.com','男','热爱编程的程序员',25,'1990-01-01');
INSERT INTO `customer` VALUES (2,'李四','13888888888','中国北京××区××路','13888888888@138.com','女','酷爱网购的白领',20,'1995-02-21');
INSERT INTO `customer` VALUES (3,'王五','15888888888','中国深圳××区××路','15888888888@158.com','男','这个家伙很懒，什么也没有留下',35,'1980-04-14');
INSERT INTO `customer` VALUES (4,'赵六','13900000000',NULL,NULL,'男',NULL,40,'1975-01-01');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table orderform
#

DROP TABLE IF EXISTS `orderform`;
CREATE TABLE `orderform` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `customer` int(11) DEFAULT NULL,
  `tradedate` date DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `amount` double(11,2) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

#
# Dumping data for table orderform
#

LOCK TABLES `orderform` WRITE;
/*!40000 ALTER TABLE `orderform` DISABLE KEYS */;
INSERT INTO `orderform` VALUES (1,1,'2015-04-30','已收货',4400);
INSERT INTO `orderform` VALUES (2,2,'2015-05-11','已发货',520);
INSERT INTO `orderform` VALUES (3,3,'2015-05-13','已付款',9120);
/*!40000 ALTER TABLE `orderform` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table orderitem
#

DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `ORDERID` int(11) DEFAULT NULL,
  `COMMODITY` int(11) DEFAULT NULL,
  `DISCOUNT` double(11,2) DEFAULT NULL,
  `ACTPRICE` double(11,2) DEFAULT NULL,
  `AMOUNT` double(11,2) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

#
# Dumping data for table orderitem
#

LOCK TABLES `orderitem` WRITE;
/*!40000 ALTER TABLE `orderitem` DISABLE KEYS */;
INSERT INTO `orderitem` VALUES (1,1,4,1,4000,1);
INSERT INTO `orderitem` VALUES (2,1,5,1,400,1);
INSERT INTO `orderitem` VALUES (3,2,1,1,120,1);
INSERT INTO `orderitem` VALUES (4,2,2,1,200,1);
INSERT INTO `orderitem` VALUES (5,2,3,1,200,1);
INSERT INTO `orderitem` VALUES (6,3,6,1,5000,1);
INSERT INTO `orderitem` VALUES (7,3,7,1,4000,1);
INSERT INTO `orderitem` VALUES (8,3,8,1,30,1);
INSERT INTO `orderitem` VALUES (9,3,9,1,50,1);
INSERT INTO `orderitem` VALUES (10,3,10,1,40,1);
/*!40000 ALTER TABLE `orderitem` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table seller
#

DROP TABLE IF EXISTS `seller`;
CREATE TABLE `seller` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `tel` varchar(1000) DEFAULT NULL,
  `address` varchar(2000) DEFAULT NULL,
  `website` varchar(500) DEFAULT NULL,
  `star` int(11) DEFAULT NULL,
  `business` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

#
# Dumping data for table seller
#

LOCK TABLES `seller` WRITE;
/*!40000 ALTER TABLE `seller` DISABLE KEYS */;
INSERT INTO `seller` VALUES (1,'A服装店','13000000000','中国北京××区','www.a.com',5,'经营各式服装');
INSERT INTO `seller` VALUES (2,'B数码店','15800000000','中国浙江杭州市××区','www.b.com',4,'经营各类数码电子产品');
INSERT INTO `seller` VALUES (3,'C电器店','13012341234','中国广东深圳市××区','www.c.com',4,'经营各类家电');
INSERT INTO `seller` VALUES (4,'D书店','18600000000','中国陕西西安市××区','www.d.com',5,'经营各类实体书与电子书');
/*!40000 ALTER TABLE `seller` ENABLE KEYS */;
UNLOCK TABLES;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
