-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2024 at 05:58 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pets`
--

-- --------------------------------------------------------

--
-- Table structure for table `pet_appointments`
--

CREATE TABLE `pet_appointments` (
  `appointment_id` bigint(20) NOT NULL,
  `user_id` smallint(68) NOT NULL,
  `owner_name` varchar(255) NOT NULL,
  `pet_name` varchar(255) NOT NULL,
  `date` date DEFAULT NULL,
  `time` time(6) DEFAULT NULL,
  `notes` varchar(255) NOT NULL,
  `status` enum('PENDING','APPROVED') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pet_appointments`
--

INSERT INTO `pet_appointments` (`appointment_id`, `user_id`, `owner_name`, `pet_name`, `date`, `time`, `notes`, `status`) VALUES
(17, 1, 'admin', 'parrot', '2024-06-08', '17:01:00.000000', 'sick or', 'PENDING'),
(18, 19, 'test2', 'dog', '2024-06-09', '10:20:00.000000', 'dog sick', 'PENDING'),
(19, 2, 'test', 'guinea pig', '2024-06-20', '10:25:00.000000', 'loss appetite', 'PENDING');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` smallint(20) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `user_name`, `email`, `password`, `role`) VALUES
(1, 'admin', 'admin@mail.com', '$2a$10$5ynwjSejBGaKpT2/lgbH7eOdDxTAHT5gthKuvf97ABj1p3aIwI3Jy', 'ADMIN'),
(2, 'test', 'test@email.com', '$2a$10$0dP3gzq/OOTDprF.og5eJekkl3SFwSGlR7SIUxKk1u0F/110rOnNq', 'USER'),
(19, 'test2', 'test2@email.com', '$2a$10$bjRz9A77/wsB2/liHqiKheW8AQA1Y7VEXaRB3dQf2JvnPmgXD4keG', 'USER');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pet_appointments`
--
ALTER TABLE `pet_appointments`
  ADD PRIMARY KEY (`appointment_id`),
  ADD KEY `fk_user_id` (`user_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pet_appointments`
--
ALTER TABLE `pet_appointments`
  MODIFY `appointment_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` smallint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pet_appointments`
--
ALTER TABLE `pet_appointments`
  ADD CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
