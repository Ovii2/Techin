-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 28, 2024 at 07:13 PM
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
-- Database: `books`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `id` bigint(68) NOT NULL,
  `category_id` bigint(68) NOT NULL,
  `title` varchar(255) NOT NULL,
  `isbn` varchar(255) NOT NULL,
  `image` varchar(255) NOT NULL,
  `pages` int(11) NOT NULL,
  `description` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`id`, `category_id`, `title`, `isbn`, `image`, `pages`, `description`) VALUES
(1, 155, 'Effective Java 3rd Edition', '7044099223768', 'https://m.media-amazon.com/images/I/7167aaVxs3L._AC_UF1000,1000_QL80_.jpg', 485, 'Since this Jolt-award winning classic was last updated in 2008, the Java programming environment has changed dramatically. Java 7 and Java 8 introduced new features and functions including, forEach() method in Iterable interface, default and static methods in Interfaces, Functional Interfaces and Lambda Expressions, Java Stream API for Bulk Data Operations on Collections, Java Time API, Collection API improvements, Concurrency API improvements, and Java IO improvements.'),
(53, 154, 'Harry Potter and the Philosopher\'s Stone', '4582209227106', 'https://m.media-amazon.com/images/I/71-++hbbERL.jpg', 450, 'Harry Potter and the Philosopher\'s Stone is the first novel in J.K. Rowling\'s acclaimed Harry Potter series. The book follows the adventures of an eleven-year-old boy, Harry Potter, who discovers he is a wizard on his birthday. Rescued from his abusive relatives by a giant named Hagrid, Harry is introduced to the magical world and attends Hogwarts School of Witchcraft and Wizardry. There, he befriends Ron Weasley and Hermione Granger, learns about his mysterious past, and confronts the dark wizard Voldemort, who is determined to regain power. The novel combines fantasy, friendship, and the battle between good and evil, captivating readers of all ages.'),
(102, 155, 'Clean Code: A Handbook of Agile Software Craftsmanship', '0997915271468', 'https://m.media-amazon.com/images/I/51E2055ZGUL._AC_UF1000,1000_QL80_.jpg', 500, 'Noted software expert Robert C. Martin, presents a revolutionary paradigm with Clean Code: A Handbook of Agile Software Craftsmanship. Martin, who has helped bring agile principles from a practitioner’s point of view to tens of thousands of programmers, has teamed up with his colleagues from Object Mentor to distill their best agile practice of cleaning code “on the fly” into a book that will instill within you the values of software craftsman, and make you a better programmer―but only if you work at it.'),
(103, 154, 'Harry Potter and the Prisoner of Azkaban', '2511965258804', 'https://m.media-amazon.com/images/I/91ar+YVpLML._AC_UF1000,1000_QL80_.jpg', 420, 'For twelve long years, the dread fortress of Azkaban held an infamous prisoner named Sirius Black. Convicted of killing thirteen people with a single curse, he was said to be the heir apparent to the Dark Lord, Voldemort.\nNow he has escaped, leaving only two clues as to where he might be headed: Harry Potter\'s defeat of You-Know-Who was Black\'s downfall as well. And the Azkban guards heard Black muttering in his sleep, \"He\'s at Hogwarts...he\'s at Hogwarts.\"\nHarry Potter isn\'t safe, not even within the walls of his magical school, surrounded by his friends. Because on top of it all, there may well be a traitor in their midst.');

-- --------------------------------------------------------

--
-- Table structure for table `books_seq`
--

CREATE TABLE `books_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `books_seq`
--

INSERT INTO `books_seq` (`next_val`) VALUES
(51);

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `id` bigint(68) NOT NULL,
  `title` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`id`, `title`, `description`) VALUES
(2, 'Fantasy', 'cccpp'),
(3, 'Self-help', 'aaa'),
(5, 'Drama', 'ok'),
(105, 'Memoir', 'tttrzz'),
(154, 'Novel', 'qqq'),
(155, 'Software', 'aaab');

-- --------------------------------------------------------

--
-- Table structure for table `categories_seq`
--

CREATE TABLE `categories_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `categories_seq`
--

INSERT INTO `categories_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `id` bigint(20) NOT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `book_id` bigint(20) NOT NULL,
  `author_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `comments`
--

INSERT INTO `comments` (`id`, `comment`, `date`, `book_id`, `author_id`) VALUES
(302, 'qqq wwww', '2024-06-26', 103, 1),
(452, 'new comment', '2024-06-26', 1, 1),
(504, 'test comment', '2024-06-26', 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `comments_seq`
--

CREATE TABLE `comments_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `comments_seq`
--

INSERT INTO `comments_seq` (`next_val`) VALUES
(601);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint(68) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `user_name`, `email`, `password`, `role`) VALUES
(1, 'admin', 'admin@email.com', '$2a$10$UCNGpDjGHlJo.CvfB7Lx3eJUKVznEgVejdncuH4RDeCHUzRlrdaSS', 'ADMIN'),
(2, 'test', 'test@email.com', '$2a$10$t7Vx8C7uPK5e4QINY85c0O/3ZYRtxtdK.xmT16NUT9L8ybsBrSCNe', 'USER'),
(6, 'test2', 'test2@email.com', '$2a$10$/cYYkYB7gmIDN00nR3u93.8iAmf2bt1Fk7jrapHyFkWaYMDkOALxG', 'USER'),
(7, 'test3', 'test3@email.com', '$2a$10$GCDNhKSezhVpQlMdrgf9nOu43pyYdj/t0qeHC0R/iU3NjTQ3X1qBq', 'USER');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_categories` (`category_id`);

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK1ey8gegnanvybix5a025vepf4` (`book_id`),
  ADD KEY `FKn2na60ukhs76ibtpt9burkm27` (`author_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(68) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `books`
--
ALTER TABLE `books`
  ADD CONSTRAINT `fk_categories` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`);

--
-- Constraints for table `comments`
--
ALTER TABLE `comments`
  ADD CONSTRAINT `FK1ey8gegnanvybix5a025vepf4` FOREIGN KEY (`book_id`) REFERENCES `books` (`id`),
  ADD CONSTRAINT `FKn2na60ukhs76ibtpt9burkm27` FOREIGN KEY (`author_id`) REFERENCES `users` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
