-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 26, 2025 at 03:19 PM
-- Server version: 8.0.41
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventory`
--

-- --------------------------------------------------------

--
-- Table structure for table `appuser`
--

CREATE TABLE `appuser` (
  `appuser_pk` int NOT NULL,
  `userRole` varchar(50) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `mobileNumber` varchar(50) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `appuser`
--

INSERT INTO `appuser` (`appuser_pk`, `userRole`, `name`, `mobileNumber`, `email`, `password`, `address`, `status`) VALUES
(1, 'supperAdmin', 'Super Admin', '0700000000', 'superadmin@gmail.com', 'admin', 'kenya', 'Active'),
(3, 'Admin', 'Test User 1', '0711111111', 'testuser1@testemail.com', '123', 'Test', 'Active'),
(4, 'Admin', 'top shotter', '0700000010', 'example9@gmail.com', '97688f05950c296d31e745e02704b9e9614b73fa1d0b436342967836c5f09e05', 'Sydnee', 'Active'),
(5, 'Admin', 'Test User 7', '0777777777', 'testuser7@testemail.com', '17d6c4b0b01c6e9a26d277a21e884e9ccf168dd8bf3c719e1cecd5946e8d2ead', 'Test 7', 'Active'),
(6, 'Admin', 'njugu', '0799999999', 'kujawewe11@gmail.com', '2aaaf037c313767c5dda219999e6d66e4dbc54ac3ff01e7902bce7ccee36e2c8', 'Msumarini', 'InActive');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `category_pk` int NOT NULL,
  `name` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`category_pk`, `name`) VALUES
(1, 'Test 1'),
(2, 'New Test'),
(3, 'Top Test');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customer_pk` int NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `mobileNumber` varchar(50) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_pk`, `name`, `mobileNumber`, `email`) VALUES
(1, 'dume fighter', '0711111111', 'example22@gmail.com'),
(2, 'boss', '0700000011', 'example11a@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `orderdetails`
--

CREATE TABLE `orderdetails` (
  `order_pk` int NOT NULL,
  `orderId` varchar(200) DEFAULT NULL,
  `customer_fk` int DEFAULT NULL,
  `orderDate` varchar(50) DEFAULT NULL,
  `totalPaid` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `orderdetails`
--

INSERT INTO `orderdetails` (`order_pk`, `orderId`, `customer_fk`, `orderDate`, `totalPaid`) VALUES
(1, 'Bill-102641305481100', 1, '26-02-2025', 1100),
(2, 'Bill-102844515977800', 2, '26-02-2025', 100),
(3, 'Bill-102945928803500', 2, '26-02-2025', 200),
(4, 'Bill-103245889115300', 2, '26-02-2025', 400),
(5, 'Bill-103359334118200', 1, '26-02-2025', 11600);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `product_pk` int NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `qty` int DEFAULT NULL,
  `price` int DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `category_fk` int DEFAULT NULL,
  `categoryName` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`product_pk`, `name`, `qty`, `price`, `description`, `category_fk`, `categoryName`) VALUES
(1, 'Test 1', 0, 100, 'Test 1 description', 3, 'Top Test'),
(2, 'Top Notch', 0, 200, 'Top Notch description', 3, 'Top Test');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appuser`
--
ALTER TABLE `appuser`
  ADD PRIMARY KEY (`appuser_pk`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`category_pk`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_pk`);

--
-- Indexes for table `orderdetails`
--
ALTER TABLE `orderdetails`
  ADD PRIMARY KEY (`order_pk`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`product_pk`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `appuser`
--
ALTER TABLE `appuser`
  MODIFY `appuser_pk` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `category_pk` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `customer_pk` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `orderdetails`
--
ALTER TABLE `orderdetails`
  MODIFY `order_pk` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `product_pk` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
