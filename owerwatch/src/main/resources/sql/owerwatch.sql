-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        8.0.15 - MySQL Community Server - GPL
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  10.1.0.5464
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 owerwatch_league 的数据库结构
DROP DATABASE IF EXISTS `owerwatch_league`;
CREATE DATABASE IF NOT EXISTS `owerwatch_league` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `owerwatch_league`;

-- 导出  表 owerwatch_league.owl_player 结构
DROP TABLE IF EXISTS `owl_player`;
CREATE TABLE IF NOT EXISTS `owl_player` (
  `id` int(11) unsigned NOT NULL COMMENT '主键ID，自增序号',
  `team_id` int(11) NOT NULL COMMENT '选手所述队伍ID',
  `name` varchar(50) NOT NULL COMMENT '选手实际名称',
  `game_name` varchar(50) NOT NULL COMMENT '选手游戏ID',
  `gender` varchar(5) NOT NULL COMMENT '选手性别',
  `contury` varchar(50) NOT NULL COMMENT '选手国籍',
  `status` tinyint(1) NOT NULL COMMENT '选手状态(是否还在owl，0:否,1:是)',
  `update_time` timestamp NOT NULL COMMENT '数据更新时间',
  `create_time` timestamp NOT NULL COMMENT '数据创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='守望先锋联赛选手数据表';

-- 正在导出表  owerwatch_league.owl_player 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `owl_player` DISABLE KEYS */;
/*!40000 ALTER TABLE `owl_player` ENABLE KEYS */;

-- 导出  表 owerwatch_league.owl_team 结构
DROP TABLE IF EXISTS `owl_team`;
CREATE TABLE IF NOT EXISTS `owl_team` (
  `id` int(11) unsigned NOT NULL COMMENT '序号，自增id',
  `name_cn` varchar(50) NOT NULL COMMENT '队伍中文名字',
  `name_en` varchar(50) NOT NULL COMMENT '队伍英文名字',
  `re_city` varchar(50) NOT NULL COMMENT '队伍代表城市',
  `country` varchar(15) NOT NULL COMMENT '队伍所在国家',
  `division` varchar(50) NOT NULL COMMENT '队伍所在赛区',
  `update_time` timestamp NOT NULL COMMENT '数据更新时间',
  `create_time` timestamp NOT NULL COMMENT '数据创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='守望先锋联赛队伍数据表';

-- 正在导出表  owerwatch_league.owl_team 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `owl_team` DISABLE KEYS */;
/*!40000 ALTER TABLE `owl_team` ENABLE KEYS */;

-- 导出  表 owerwatch_league.ow_hero 结构
DROP TABLE IF EXISTS `ow_hero`;
CREATE TABLE IF NOT EXISTS `ow_hero` (
  `id` int(11) NOT NULL COMMENT '自增主键',
  `type` varchar(10) NOT NULL COMMENT '英雄所属位置',
  `name_en` varchar(50) NOT NULL COMMENT '英雄英文名称',
  `name_cn` varchar(50) NOT NULL COMMENT '英雄中文名称',
  `update_time` timestamp NOT NULL COMMENT '数据更新时间',
  `create_time` timestamp NOT NULL COMMENT '数据创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='守望先锋游戏英雄信息';

-- 正在导出表  owerwatch_league.ow_hero 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `ow_hero` DISABLE KEYS */;
/*!40000 ALTER TABLE `ow_hero` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
