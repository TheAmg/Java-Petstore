-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3307
-- Generation Time: Dec 01, 2017 at 02:36 AM
-- Server version: 5.7.20
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bankdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `aid` int(11) NOT NULL,
  `amount` varchar(20) NOT NULL,
  `uname` varchar(20) NOT NULL,
  `upwd` varchar(20) NOT NULL,
  `actype` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`aid`, `amount`, `uname`, `upwd`, `actype`) VALUES
(1, '90000', 'noob', 'noob', 'customer'),
(2, '200000', 'petsowner', 'pet', 'customer'),
(3, '104000', 'mark', 'nigger', 'customer'),
(4, '1000', 'admin', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `atlogs`
--

CREATE TABLE `atlogs` (
  `atno` int(11) NOT NULL,
  `atname` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `card`
--

CREATE TABLE `card` (
  `cardid` int(11) NOT NULL,
  `cardno` varchar(30) NOT NULL,
  `cvv` int(3) NOT NULL,
  `uname` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `card`
--

INSERT INTO `card` (`cardid`, `cardno`, `cvv`, `uname`) VALUES
(1, '1234', 123, 'admin'),
(2, '2345', 234, 'petsowner'),
(3, '3456', 345, 'noob'),
(4, '4567', 456, 'mark');

-- --------------------------------------------------------

--
-- Table structure for table `logverify`
--

CREATE TABLE `logverify` (
  `otp` int(11) NOT NULL,
  `uname` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `logverify`
--

INSERT INTO `logverify` (`otp`, `uname`) VALUES
(1, 'noob');

-- --------------------------------------------------------

--
-- Table structure for table `translog`
--

CREATE TABLE `translog` (
  `transid` int(11) NOT NULL,
  `uname` varchar(20) NOT NULL,
  `amount` varchar(20) NOT NULL,
  `transtype` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `translog`
--

INSERT INTO `translog` (`transid`, `uname`, `amount`, `transtype`) VALUES
(6, 'mark', '52000', 'Deducted'),
(7, 'mark', '52000', 'Added');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`aid`);

--
-- Indexes for table `atlogs`
--
ALTER TABLE `atlogs`
  ADD PRIMARY KEY (`atno`);

--
-- Indexes for table `card`
--
ALTER TABLE `card`
  ADD PRIMARY KEY (`cardid`);

--
-- Indexes for table `logverify`
--
ALTER TABLE `logverify`
  ADD PRIMARY KEY (`otp`);

--
-- Indexes for table `translog`
--
ALTER TABLE `translog`
  ADD PRIMARY KEY (`transid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `aid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `atlogs`
--
ALTER TABLE `atlogs`
  MODIFY `atno` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `card`
--
ALTER TABLE `card`
  MODIFY `cardid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `logverify`
--
ALTER TABLE `logverify`
  MODIFY `otp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `translog`
--
ALTER TABLE `translog`
  MODIFY `transid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
