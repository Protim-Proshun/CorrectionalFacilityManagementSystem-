-- phpMyAdmin SQL Dump
-- version 3.1.3.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Sep 14, 2017 at 10:57 AM
-- Server version: 5.1.33
-- PHP Version: 5.2.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Database: `oop1`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE IF NOT EXISTS `doctor` (
  `ID` varchar(4) NOT NULL,
  `Password` varchar(4) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Age` int(3) NOT NULL,
  `Gender` varchar(1) NOT NULL,
  `Designation` varchar(50) DEFAULT NULL,
  `ActiveYears` int(3) DEFAULT NULL,
  `Patient` int(4) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`ID`, `Password`, `Name`, `Age`, `Gender`, `Designation`, `ActiveYears`, `Patient`) VALUES
('2001', 'pppp', 'Dip', 39, 'M', 'Senior Doctor', 10, 5001),
('2002', 'qqqq', 'Shanta', 37, 'F', 'Assistant Doctor', 6, 5002),
('2003', 'rrrr', 'Irfan', 30, 'M', 'Junior Doctor', 3, 5005),
('2004', 'wwww', 'Pranto', 42, 'M', 'Doctor', 3, 5123),
('2005', 'poiu', 'Alal', 40, 'M', 'Assistant Doctor', 15, 5555),
('2005', '1234', 'abcd', 12, 'm', 'sr', 5, 5003);

-- --------------------------------------------------------

--
-- Table structure for table `drugtrafficking`
--

CREATE TABLE IF NOT EXISTS `drugtrafficking` (
  `ID` int(4) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Age` int(3) NOT NULL,
  `Gender` varchar(1) NOT NULL,
  `No of Crime` int(10) NOT NULL,
  `Punishment` varchar(50) NOT NULL,
  `MedicalReport` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `drugtrafficking`
--

INSERT INTO `drugtrafficking` (`ID`, `Name`, `Age`, `Gender`, `No of Crime`, `Punishment`, `MedicalReport`) VALUES
(5001, 'Piash', 27, 'M', 6, '15 years', 'qwer'),
(5002, 'Belal', 29, 'M', 10, '11 years', NULL),
(5003, 'Dolon', 25, 'M', 4, '2 years', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `extortion`
--

CREATE TABLE IF NOT EXISTS `extortion` (
  `ID` int(4) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Age` int(3) NOT NULL,
  `Gender` varchar(1) NOT NULL,
  `No of Crime` int(10) NOT NULL,
  `Punishment` varchar(50) NOT NULL,
  `MedicalReport` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `extortion`
--

INSERT INTO `extortion` (`ID`, `Name`, `Age`, `Gender`, `No of Crime`, `Punishment`, `MedicalReport`) VALUES
(5010, 'Irfan', 30, 'M', 3, '5 years', NULL),
(5011, 'Babul', 31, 'M', 4, '5 years', NULL),
(5012, 'Param', 35, 'M', 6, '7 years', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `guard`
--

CREATE TABLE IF NOT EXISTS `guard` (
  `ID` int(4) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Age` int(3) NOT NULL,
  `Gender` varchar(1) NOT NULL,
  `ActiveYears` int(3) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `guard`
--

INSERT INTO `guard` (`ID`, `Name`, `Age`, `Gender`, `ActiveYears`) VALUES
(4001, 'Rahim', 43, 'M', 25),
(4002, 'Juli', 31, 'F', 16),
(4003, 'Abdul', 36, 'M', 18),
(4003, 'Jisa', 39, 'F', 7),
(4005, 'Talha', 29, 'M', 1),
(4006, 'Raju', 32, 'M', 2);

-- --------------------------------------------------------

--
-- Table structure for table `gunrunning`
--

CREATE TABLE IF NOT EXISTS `gunrunning` (
  `ID` int(4) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Age` int(3) NOT NULL,
  `Gender` varchar(1) NOT NULL,
  `No of Crime` int(10) NOT NULL,
  `Punishment` varchar(50) NOT NULL,
  `MedicalReport` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gunrunning`
--

INSERT INTO `gunrunning` (`ID`, `Name`, `Age`, `Gender`, `No of Crime`, `Punishment`, `MedicalReport`) VALUES
(5004, 'Shanto', 22, 'M', 4, '1 year', NULL),
(5005, 'Tonoy', 23, 'M', 5, '500$', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `ittechnician`
--

CREATE TABLE IF NOT EXISTS `ittechnician` (
  `ID` int(4) NOT NULL,
  `Password` varchar(4) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Age` int(3) NOT NULL,
  `Gender` varchar(1) NOT NULL,
  `Designation` varchar(50) NOT NULL,
  `ActiveYears` int(3) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ittechnician`
--

INSERT INTO `ittechnician` (`ID`, `Password`, `Name`, `Age`, `Gender`, `Designation`, `ActiveYears`) VALUES
(3001, 'efgh', 'Limon', 26, 'M', 'Maintenance', 3),
(3002, 'eeee', 'Anup', 27, 'M', 'Senior IT Technician ', 5),
(3003, 'ffff', 'Amit', 28, 'M', 'Technician ', 3),
(3004, 'wwww', 'Palash', 30, 'M', 'Maintenance', 2);

-- --------------------------------------------------------

--
-- Table structure for table `jailinspector`
--

CREATE TABLE IF NOT EXISTS `jailinspector` (
  `ID` int(4) NOT NULL,
  `Password` varchar(4) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Age` int(3) NOT NULL,
  `Gender` varchar(1) NOT NULL,
  `Designation` varchar(50) NOT NULL,
  `ActiveYears` int(3) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jailinspector`
--

INSERT INTO `jailinspector` (`ID`, `Password`, `Name`, `Age`, `Gender`, `Designation`, `ActiveYears`) VALUES
(1001, 'abcd', 'Bksh', 41, 'M', 'Inspector', 15),
(1002, 'aaaa', 'Alam', 38, 'M', 'Senior Inspector', 7),
(1004, 'cccc', 'Mokbul', 42, 'M', 'Senior inspector', 10),
(1006, 'qwer', 'Praful', 50, 'M', 'Superintendent', 10),
(1005, 'dddd', 'Midul', 45, 'M', 'Superintendent', 20),
(1007, 'jjjj', 'Jaber', 32, 'M', 'Inspector', 5);

-- --------------------------------------------------------

--
-- Table structure for table `moneylaundering`
--

CREATE TABLE IF NOT EXISTS `moneylaundering` (
  `ID` int(4) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Age` int(3) NOT NULL,
  `Gender` varchar(1) NOT NULL,
  `No of Crime` int(10) NOT NULL,
  `Punishment` varchar(50) NOT NULL,
  `MedicalReport` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `moneylaundering`
--

INSERT INTO `moneylaundering` (`ID`, `Name`, `Age`, `Gender`, `No of Crime`, `Punishment`, `MedicalReport`) VALUES
(5007, 'Habib', 42, 'M', 3, '5 years', NULL),
(5008, 'Imran', 45, 'M', 5, '15 years', NULL),
(5009, 'Tania', 43, 'F', 2, '5 years', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `murderforhire`
--

CREATE TABLE IF NOT EXISTS `murderforhire` (
  `ID` int(4) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Age` int(3) NOT NULL,
  `Gender` varchar(1) NOT NULL,
  `No of Crime` int(10) NOT NULL,
  `Punishment` varchar(50) NOT NULL,
  `MedicalReport` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `murderforhire`
--

INSERT INTO `murderforhire` (`ID`, `Name`, `Age`, `Gender`, `No of Crime`, `Punishment`, `MedicalReport`) VALUES
(5013, 'Hridoy', 33, 'M', 2, '3 years', NULL),
(5014, 'Iqubal', 40, 'M', 10, '20 years', NULL),
(5015, 'Toma', 25, 'F', 3, '5 years', NULL),
(5017, 'Kalam', 28, 'M', 2, '5 years', NULL);
