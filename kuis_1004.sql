-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 13, 2017 at 09:39 AM
-- Server version: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis_1004`
--

-- --------------------------------------------------------

--
-- Table structure for table `identitas_1004`
--

CREATE TABLE `identitas_1004` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `jenis_kelamin` varchar(255) DEFAULT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `identitas_1004`
--

INSERT INTO `identitas_1004` (`id`, `email`, `jenis_kelamin`, `name`) VALUES
(1, 'adrian15ti@mahasiswa.pcr.ac.id', 'Laki-Laki', 'Adrian Hartanto Osman'),
(2, 'prayogi15ti@mahasiswa.pcr.ac.id', 'Perempuan', 'Prayogi Adhi');

-- --------------------------------------------------------

--
-- Table structure for table `ipk_1004`
--

CREATE TABLE `ipk_1004` (
  `id` bigint(20) NOT NULL,
  `ipk` double NOT NULL,
  `jurusan` varchar(150) NOT NULL,
  `identitas_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ipk_1004`
--

INSERT INTO `ipk_1004` (`id`, `ipk`, `jurusan`, `identitas_id`) VALUES
(1, 4, 'Teknik Informatika', 2),
(2, 4.1, 'Ilmu Komputer', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1004`
--
ALTER TABLE `identitas_1004`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ipk_1004`
--
ALTER TABLE `ipk_1004`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK2eu6peiw2o1n1yvakrolt6agb` (`identitas_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_1004`
--
ALTER TABLE `identitas_1004`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `ipk_1004`
--
ALTER TABLE `ipk_1004`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `ipk_1004`
--
ALTER TABLE `ipk_1004`
  ADD CONSTRAINT `FK2eu6peiw2o1n1yvakrolt6agb` FOREIGN KEY (`identitas_id`) REFERENCES `identitas_1004` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
