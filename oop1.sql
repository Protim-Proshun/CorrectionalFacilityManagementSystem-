-- phpMyAdmin SQL Dump
-- version 3.1.3.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 15, 2017 at 05:30 PM
-- Server version: 5.1.33
-- PHP Version: 5.2.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `oop1`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE IF NOT EXISTS `account` (
  `UserId` varchar(6) NOT NULL,
  `Password` varchar(8) NOT NULL,
  `AccountNumber` int(10) NOT NULL,
  `AccountHolderName` varchar(10) NOT NULL,
  `Balance` double(8,2) NOT NULL,
  PRIMARY KEY (`AccountNumber`),
  UNIQUE KEY `UserId` (`UserId`),
  UNIQUE KEY `UserId_2` (`UserId`),
  UNIQUE KEY `UserId_3` (`UserId`),
  UNIQUE KEY `UserId_4` (`UserId`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`UserId`, `Password`, `AccountNumber`, `AccountHolderName`, `Balance`) VALUES
('OOP1 F', 'abcd', 1000000001, 'AIUB', 15000.00),
('OOP1 H', '1234', 1000000002, 'CS', 10000.00),
('niloy', 'niloy', 1000000004, 'Mohaimen', 51000.00);
