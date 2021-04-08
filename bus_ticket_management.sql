-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 17, 2018 at 09:48 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bus_ticket_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `admininfo`
--

CREATE TABLE `admininfo` (
  `fname` varchar(30) NOT NULL,
  `adminEmail` varchar(30) NOT NULL,
  `adminPhone` int(11) NOT NULL,
  `pass` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admininfo`
--

INSERT INTO `admininfo` (`fname`, `adminEmail`, `adminPhone`, `pass`) VALUES
('rafat', 'rafat@gmail.com', 1515657545, 'rafat456');

-- --------------------------------------------------------

--
-- Table structure for table `businfo`
--

CREATE TABLE `businfo` (
  `busid` int(4) NOT NULL,
  `busName` varchar(30) NOT NULL,
  `fromWhere` varchar(30) NOT NULL,
  `toWhere` varchar(30) NOT NULL,
  `deptTime` varchar(10) NOT NULL,
  `arrTime` varchar(10) NOT NULL,
  `totalSeat` int(2) NOT NULL,
  `fare` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `businfo`
--

INSERT INTO `businfo` (`busid`, `busName`, `fromWhere`, `toWhere`, `deptTime`, `arrTime`, `totalSeat`, `fare`) VALUES
(1101, 'Hanif', 'Dhaka', 'Chottogram', '10:00 pm', '06:00 am', 18, 800),
(1102, 'Hanif', 'Chottogram', 'Dhaka', '11:00 pm', '05:00 am', 18, 800),
(2101, 'Desh Travels', 'Dhaka', 'Khulna', '09:00 pm', '06:00 am', 18, 1000),
(2102, 'Desh Travels', 'Khulna', 'Dhaka', '08:00 pm', '05:00 am', 18, 1000),
(3001, 'Green Line', 'Dhaka', 'Sylhet', '10:00 am', '03:00 pm', 18, 1500),
(3002, 'Green Line', 'Sylhet', 'Dhaka', '08:00 pm', '02:00 am', 18, 1500),
(3221, 'Shohag', 'Chottogram', 'Dhaka', '11:00 pm', '07:00 am', 18, 1250),
(3222, 'Shohag', 'Dhaka', 'Chottogram', '12:00 pm', '08:00 pm', 18, 1250),
(4101, 'Saudia', 'Dhaka', 'Rajshahi', '02:00 pm', '11:00 am', 18, 800),
(4102, 'Saudia', 'Rajshahi', 'Dhaka', '04:00 pm', '01:00 am', 18, 800),
(4201, 'Ena', 'Dhaka', 'Sylhet', '11:00 pm', '05:00 am', 18, 1600),
(4202, 'Ena', 'Sylhet', 'Dhaka', '11:00 pm', '05:00 am', 18, 1600),
(5001, 'Eagle', 'Rangpur', 'Barishal', '10:00 am', '08:00 am', 18, 1200),
(5002, 'Eagle', 'Barishal', 'Rangpur', '07:00 pm', '05:00 am', 18, 1200);

-- --------------------------------------------------------

--
-- Table structure for table `busseat`
--

CREATE TABLE `busseat` (
  `Busid` int(10) NOT NULL,
  `seat_num` varchar(20) NOT NULL,
  `status` varchar(20) NOT NULL,
  `date` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `busseat`
--

INSERT INTO `busseat` (`Busid`, `seat_num`, `status`, `date`) VALUES
(1101, 'a1', 'available', '16 dec 2018'),
(1101, 'a2', 'booked', '16 dec 2018'),
(1101, 'a3', 'available', '16 dec 2018'),
(1101, 'b1', 'booked', '16 dec 2018'),
(1101, 'b2', 'available', '16 dec 2018'),
(1101, 'b3', 'available', '16 dec 2018'),
(1101, 'c1', 'available', '16 dec 2018'),
(1101, 'c2', 'booked', '16 dec 2018'),
(1101, 'c3', 'booked', '16 dec 2018'),
(1101, 'd1', 'available', '16 dec 2018'),
(1101, 'd2', 'available', '16 dec 2018'),
(1101, 'd3', 'available', '16 dec 2018'),
(1101, 'e1', 'available', '16 dec 2018'),
(1101, 'e2', 'available', '16 dec 2018'),
(1101, 'e3', 'available', '16 dec 2018'),
(1101, 'f1', 'available', '16 dec 2018'),
(1101, 'f2', 'available', '16 dec 2018'),
(1101, 'f3', 'available', '16 dec 2018'),
(1102, 'a1', 'available', '16 dec 2018'),
(1102, 'a2', 'booked', '16 dec 2018'),
(1102, 'a3', 'available', '16 dec 2018'),
(1102, 'b1', 'booked', '16 dec 2018'),
(1102, 'b2', 'available', '16 dec 2018'),
(1102, 'b3', 'available', '16 dec 2018'),
(1102, 'c1', 'available', '16 dec 2018'),
(1102, 'c2', 'booked', '16 dec 2018'),
(1102, 'c3', 'booked', '16 dec 2018'),
(1102, 'd1', 'available', '16 dec 2018'),
(1102, 'd2', 'available', '16 dec 2018'),
(1102, 'd3', 'available', '16 dec 2018'),
(1102, 'e1', 'available', '16 dec 2018'),
(1102, 'e2', 'available', '16 dec 2018'),
(1102, 'e3', 'available', '16 dec 2018'),
(1102, 'f1', 'available', '16 dec 2018'),
(1102, 'f2', 'available', '16 dec 2018'),
(1102, 'f3', 'available', '16 dec 2018'),
(2101, 'a1', 'available', '16 dec 2018'),
(2101, 'a2', 'booked', '16 dec 2018'),
(2101, 'a3', 'available', '16 dec 2018'),
(2101, 'b1', 'booked', '16 dec 2018'),
(2101, 'b2', 'available', '16 dec 2018'),
(2101, 'b3', 'available', '16 dec 2018'),
(2101, 'c1', 'available', '16 dec 2018'),
(2101, 'c2', 'booked', '16 dec 2018'),
(2101, 'c3', 'booked', '16 dec 2018'),
(2101, 'd1', 'available', '16 dec 2018'),
(2101, 'd2', 'available', '16 dec 2018'),
(2101, 'd3', 'available', '16 dec 2018'),
(2101, 'e1', 'available', '16 dec 2018'),
(2101, 'e2', 'available', '16 dec 2018'),
(2101, 'e3', 'available', '16 dec 2018'),
(2101, 'f1', 'available', '16 dec 2018'),
(2101, 'f2', 'available', '16 dec 2018'),
(2101, 'f3', 'available', '16 dec 2018'),
(2102, 'a1', 'available', '16 dec 2018'),
(2102, 'a2', 'booked', '16 dec 2018'),
(2102, 'a3', 'available', '16 dec 2018'),
(2102, 'b1', 'booked', '16 dec 2018'),
(2102, 'b2', 'available', '16 dec 2018'),
(2102, 'b3', 'available', '16 dec 2018'),
(2102, 'c1', 'available', '16 dec 2018'),
(2102, 'c2', 'booked', '16 dec 2018'),
(2102, 'c3', 'booked', '16 dec 2018'),
(2102, 'd1', 'available', '16 dec 2018'),
(2102, 'd2', 'available', '16 dec 2018'),
(2102, 'd3', 'available', '16 dec 2018'),
(2102, 'e1', 'available', '16 dec 2018'),
(2102, 'e2', 'available', '16 dec 2018'),
(2102, 'e3', 'available', '16 dec 2018'),
(2102, 'f1', 'available', '16 dec 2018'),
(2102, 'f2', 'available', '16 dec 2018'),
(2102, 'f3', 'available', '16 dec 2018'),
(3001, 'a1', 'available', '16 dec 2018'),
(3001, 'a2', 'available', '16 dec 2018'),
(3001, 'a3', 'available', '16 dec 2018'),
(3001, 'b1', 'booked', '16 dec 2018'),
(3001, 'b2', 'available', '16 dec 2018'),
(3001, 'b3', 'available', '16 dec 2018'),
(3001, 'c1', 'available', '16 dec 2018'),
(3001, 'c2', 'booked', '16 dec 2018'),
(3001, 'c3', 'booked', '16 dec 2018'),
(3001, 'd1', 'available', '16 dec 2018'),
(3001, 'd2', 'available', '16 dec 2018'),
(3001, 'd3', 'available', '16 dec 2018'),
(3001, 'e1', 'available', '16 dec 2018'),
(3001, 'e2', 'available', '16 dec 2018'),
(3001, 'e3', 'available', '16 dec 2018'),
(3001, 'f1', 'available', '16 dec 2018'),
(3001, 'f2', 'available', '16 dec 2018'),
(3001, 'f3', 'available', '16 dec 2018'),
(3002, 'a1', 'available', '16 dec 2018'),
(3002, 'a2', 'available', '16 dec 2018'),
(3002, 'a3', 'available', '16 dec 2018'),
(3002, 'b1', 'booked', '16 dec 2018'),
(3002, 'b2', 'available', '16 dec 2018'),
(3002, 'b3', 'available', '16 dec 2018'),
(3002, 'c1', 'available', '16 dec 2018'),
(3002, 'c2', 'booked', '16 dec 2018'),
(3002, 'c3', 'booked', '16 dec 2018'),
(3002, 'd1', 'available', '16 dec 2018'),
(3002, 'd2', 'available', '16 dec 2018'),
(3002, 'd3', 'available', '16 dec 2018'),
(3002, 'e1', 'available', '16 dec 2018'),
(3002, 'e2', 'available', '16 dec 2018'),
(3002, 'e3', 'available', '16 dec 2018'),
(3002, 'f1', 'available', '16 dec 2018'),
(3002, 'f2', 'available', '16 dec 2018'),
(3002, 'f3', 'available', '16 dec 2018'),
(3221, 'a1', 'available', '16 dec 2018'),
(3221, 'a2', 'available', '16 dec 2018'),
(3221, 'a3', 'available', '16 dec 2018'),
(3221, 'b1', 'booked', '16 dec 2018'),
(3221, 'b2', 'available', '16 dec 2018'),
(3221, 'b3', 'available', '16 dec 2018'),
(3221, 'c1', 'available', '16 dec 2018'),
(3221, 'c2', 'booked', '16 dec 2018'),
(3221, 'c3', 'booked', '16 dec 2018'),
(3221, 'd1', 'available', '16 dec 2018'),
(3221, 'd2', 'available', '16 dec 2018'),
(3221, 'd3', 'available', '16 dec 2018'),
(3221, 'e1', 'available', '16 dec 2018'),
(3221, 'e2', 'available', '16 dec 2018'),
(3221, 'e3', 'available', '16 dec 2018'),
(3221, 'f1', 'available', '16 dec 2018'),
(3221, 'f2', 'available', '16 dec 2018'),
(3221, 'f3', 'available', '16 dec 2018'),
(3222, 'a1', 'available', '16 dec 2018'),
(3222, 'a2', 'available', '16 dec 2018'),
(3222, 'a3', 'available', '16 dec 2018'),
(3222, 'b1', 'booked', '16 dec 2018'),
(3222, 'b2', 'available', '16 dec 2018'),
(3222, 'b3', 'available', '16 dec 2018'),
(3222, 'c1', 'available', '16 dec 2018'),
(3222, 'c2', 'booked', '16 dec 2018'),
(3222, 'c3', 'booked', '16 dec 2018'),
(3222, 'd1', 'available', '16 dec 2018'),
(3222, 'd2', 'available', '16 dec 2018'),
(3222, 'd3', 'available', '16 dec 2018'),
(3222, 'e1', 'available', '16 dec 2018'),
(3222, 'e2', 'available', '16 dec 2018'),
(3222, 'e3', 'available', '16 dec 2018'),
(3222, 'f1', 'available', '16 dec 2018'),
(3222, 'f2', 'available', '16 dec 2018'),
(3222, 'f3', 'available', '16 dec 2018'),
(4101, 'a1', 'available', '16 dec 2018'),
(4101, 'a2', 'available', '16 dec 2018'),
(4101, 'a3', 'available', '16 dec 2018'),
(4101, 'b1', 'booked', '16 dec 2018'),
(4101, 'b2', 'available', '16 dec 2018'),
(4101, 'b3', 'available', '16 dec 2018'),
(4101, 'c1', 'available', '16 dec 2018'),
(4101, 'c2', 'booked', '16 dec 2018'),
(4101, 'c3', 'booked', '16 dec 2018'),
(4101, 'd1', 'available', '16 dec 2018'),
(4101, 'd2', 'available', '16 dec 2018'),
(4101, 'd3', 'available', '16 dec 2018'),
(4101, 'e1', 'available', '16 dec 2018'),
(4101, 'e2', 'available', '16 dec 2018'),
(4101, 'e3', 'available', '16 dec 2018'),
(4101, 'f1', 'available', '16 dec 2018'),
(4101, 'f2', 'available', '16 dec 2018'),
(4101, 'f3', 'available', '16 dec 2018'),
(4102, 'a1', 'available', '16 dec 2018'),
(4102, 'a2', 'available', '16 dec 2018'),
(4102, 'a3', 'available', '16 dec 2018'),
(4102, 'b1', 'booked', '16 dec 2018'),
(4102, 'b2', 'available', '16 dec 2018'),
(4102, 'b3', 'available', '16 dec 2018'),
(4102, 'c1', 'available', '16 dec 2018'),
(4102, 'c2', 'booked', '16 dec 2018'),
(4102, 'c3', 'booked', '16 dec 2018'),
(4102, 'd1', 'available', '16 dec 2018'),
(4102, 'd2', 'available', '16 dec 2018'),
(4102, 'd3', 'available', '16 dec 2018'),
(4102, 'e1', 'available', '16 dec 2018'),
(4102, 'e2', 'available', '16 dec 2018'),
(4102, 'e3', 'available', '16 dec 2018'),
(4102, 'f1', 'available', '16 dec 2018'),
(4102, 'f2', 'available', '16 dec 2018'),
(4102, 'f3', 'available', '16 dec 2018'),
(4201, 'a1', 'available', '16 dec 2018'),
(4201, 'a2', 'available', '16 dec 2018'),
(4201, 'a3', 'available', '16 dec 2018'),
(4201, 'b1', 'booked', '16 dec 2018'),
(4201, 'b2', 'available', '16 dec 2018'),
(4201, 'b3', 'available', '16 dec 2018'),
(4201, 'c1', 'available', '16 dec 2018'),
(4201, 'c2', 'booked', '16 dec 2018'),
(4201, 'c3', 'booked', '16 dec 2018'),
(4201, 'd1', 'available', '16 dec 2018'),
(4201, 'd2', 'available', '16 dec 2018'),
(4201, 'd3', 'available', '16 dec 2018'),
(4201, 'e1', 'available', '16 dec 2018'),
(4201, 'e2', 'available', '16 dec 2018'),
(4201, 'e3', 'available', '16 dec 2018'),
(4201, 'f1', 'available', '16 dec 2018'),
(4201, 'f2', 'available', '16 dec 2018'),
(4201, 'f3', 'available', '16 dec 2018'),
(4202, 'a1', 'available', '16 dec 2018'),
(4202, 'a2', 'available', '16 dec 2018'),
(4202, 'a3', 'available', '16 dec 2018'),
(4202, 'b1', 'booked', '16 dec 2018'),
(4202, 'b2', 'available', '16 dec 2018'),
(4202, 'b3', 'available', '16 dec 2018'),
(4202, 'c1', 'available', '16 dec 2018'),
(4202, 'c2', 'booked', '16 dec 2018'),
(4202, 'c3', 'booked', '16 dec 2018'),
(4202, 'd1', 'available', '16 dec 2018'),
(4202, 'd2', 'available', '16 dec 2018'),
(4202, 'd3', 'available', '16 dec 2018'),
(4202, 'e1', 'available', '16 dec 2018'),
(4202, 'e2', 'available', '16 dec 2018'),
(4202, 'e3', 'available', '16 dec 2018'),
(4202, 'f1', 'available', '16 dec 2018'),
(4202, 'f2', 'available', '16 dec 2018'),
(4202, 'f3', 'available', '16 dec 2018'),
(5001, 'a1', 'available', '16 dec 2018'),
(5001, 'a2', 'available', '16 dec 2018'),
(5001, 'a3', 'available', '16 dec 2018'),
(5001, 'b1', 'booked', '16 dec 2018'),
(5001, 'b2', 'available', '16 dec 2018'),
(5001, 'b3', 'available', '16 dec 2018'),
(5001, 'c1', 'available', '16 dec 2018'),
(5001, 'c2', 'booked', '16 dec 2018'),
(5001, 'c3', 'booked', '16 dec 2018'),
(5001, 'd1', 'available', '16 dec 2018'),
(5001, 'd2', 'available', '16 dec 2018'),
(5001, 'd3', 'available', '16 dec 2018'),
(5001, 'e1', 'available', '16 dec 2018'),
(5001, 'e2', 'available', '16 dec 2018'),
(5001, 'e3', 'available', '16 dec 2018'),
(5001, 'f1', 'available', '16 dec 2018'),
(5001, 'f2', 'available', '16 dec 2018'),
(5001, 'f3', 'available', '16 dec 2018'),
(5002, 'a1', 'available', '16 dec 2018'),
(5002, 'a2', 'available', '16 dec 2018'),
(5002, 'a3', 'available', '16 dec 2018'),
(5002, 'b1', 'booked', '16 dec 2018'),
(5002, 'b2', 'available', '16 dec 2018'),
(5002, 'b3', 'available', '16 dec 2018'),
(5002, 'c1', 'available', '16 dec 2018'),
(5002, 'c2', 'booked', '16 dec 2018'),
(5002, 'c3', 'booked', '16 dec 2018'),
(5002, 'd1', 'available', '16 dec 2018'),
(5002, 'd2', 'available', '16 dec 2018'),
(5002, 'd3', 'available', '16 dec 2018'),
(5002, 'e1', 'available', '16 dec 2018'),
(5002, 'e2', 'available', '16 dec 2018'),
(5002, 'e3', 'available', '16 dec 2018'),
(5002, 'f1', 'available', '16 dec 2018'),
(5002, 'f2', 'available', '16 dec 2018'),
(5002, 'f3', 'available', '16 dec 2018');

-- --------------------------------------------------------

--
-- Table structure for table `custminfo`
--

CREATE TABLE `custminfo` (
  `fname` varchar(44) NOT NULL,
  `lname` varchar(44) NOT NULL,
  `email` varchar(44) NOT NULL,
  `pass` varchar(44) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `custminfo`
--

INSERT INTO `custminfo` (`fname`, `lname`, `email`, `pass`) VALUES
('alib', 'rahman', 'alib@gmail.com', '123'),
('ahmed', 'tajbiul', 'ahmel@ymail.com', '456'),
('rafat', 'hasan', 'hasan@gmail.com', '123'),
('hasan', 'khandaker', 'hasan@hotmail.com', '123'),
('anik', 'das', 'anik@hotmail.com', 'anik12'),
('rahman', 'hasan', 'hasan@yahoo.com', 'rahman1'),
('hossain', 'ahmed', 'hossain@gmail.com', '145');

-- --------------------------------------------------------

--
-- Table structure for table `empinfo`
--

CREATE TABLE `empinfo` (
  `ename` varchar(30) NOT NULL,
  `empJob` varchar(30) NOT NULL,
  `empPhone` int(11) NOT NULL,
  `empEmail` varchar(20) NOT NULL,
  `empSal` int(5) NOT NULL,
  `pass` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `empinfo`
--

INSERT INTO `empinfo` (`ename`, `empJob`, `empPhone`, `empEmail`, `empSal`, `pass`) VALUES
('jahid', 'driver', 1711122345, 'jahid@gmail.com', 15000, '123'),
('dipto', 'driver', 1711112234, 'dipto@gmail.com', 15000, 'd123'),
('mohammad', 'supervisor', 1711122344, 'md@gmail.com', 12000, '456'),
('aziz', 'supervisor', 1711112237, 'aziz@ymail.com', 12000, 'aziz123'),
('rahman', 'salesman', 1711122347, 'rahman@gmail.com', 8000, '123'),
('sakib', 'salesman', 1711112236, 'sakib@gmail.com', 8000, '123');

-- --------------------------------------------------------

--
-- Table structure for table `ticket_sold`
--

CREATE TABLE `ticket_sold` (
  `fname` varchar(20) NOT NULL,
  `seat_num` varchar(20) NOT NULL,
  `busid` int(10) NOT NULL,
  `date` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ticket_sold`
--

INSERT INTO `ticket_sold` (`fname`, `seat_num`, `busid`, `date`) VALUES
('null', 'a2', 1101, '16 dec 2018'),
('null', 'a2', 1102, '16 dec 2018'),
('null', 'a2', 2101, '16 dec 2018'),
('null', 'a2', 2102, '16 dec 2018');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `businfo`
--
ALTER TABLE `businfo`
  ADD PRIMARY KEY (`busid`),
  ADD UNIQUE KEY `busid` (`busid`);

--
-- Indexes for table `busseat`
--
ALTER TABLE `busseat`
  ADD KEY `Busid` (`Busid`);

--
-- Indexes for table `ticket_sold`
--
ALTER TABLE `ticket_sold`
  ADD PRIMARY KEY (`busid`),
  ADD UNIQUE KEY `busid` (`busid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
