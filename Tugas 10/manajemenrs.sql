-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 06, 2025 at 10:24 AM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `manajemenrs`
--

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `id` int NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `umur` int DEFAULT NULL,
  `alamat` text,
  `jenis_pasien` enum('Rawat Inap','Rawat Jalan') DEFAULT NULL,
  `lama_inap` int DEFAULT NULL,
  `jadwal_kontrol` date DEFAULT NULL,
  `tanggal_input` timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `rekam_medis`
--

CREATE TABLE `rekam_medis` (
  `id` int NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `umur` int DEFAULT NULL,
  `alamat` text,
  `diagnosis` text,
  `dokter` varchar(100) DEFAULT NULL,
  `jenis_obat` varchar(100) DEFAULT NULL,
  `dosis_obat` varchar(50) DEFAULT NULL,
  `harga_obat` decimal(10,2) DEFAULT NULL,
  `metode_bayar` varchar(50) DEFAULT NULL,
  `asuransi` tinyint(1) DEFAULT NULL,
  `nama_asuransi` varchar(100) DEFAULT NULL,
  `persentase_asuransi` decimal(5,2) DEFAULT NULL,
  `total_biaya` decimal(10,2) DEFAULT NULL,
  `tanggal_input` timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `rekam_medis`
--

INSERT INTO `rekam_medis` (`id`, `nama`, `umur`, `alamat`, `diagnosis`, `dokter`, `jenis_obat`, `dosis_obat`, `harga_obat`, `metode_bayar`, `asuransi`, `nama_asuransi`, `persentase_asuransi`, `total_biaya`, `tanggal_input`) VALUES
(1, 'Eolia Shalbillah', 20, 'Malang', 'Rabun jauh', NULL, NULL, '1 tetes 3x', '15000.00', 'Tunai', NULL, NULL, NULL, NULL, '2025-06-05 05:20:43'),
(3, 'Jey', 10, 'Isekai', 'terlalu aktif', 'Dr. Dika - Anak', 'Uum', '2x sehari', '50000.00', 'Transfer', NULL, NULL, NULL, NULL, '2025-06-05 05:59:31');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rekam_medis`
--
ALTER TABLE `rekam_medis`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pasien`
--
ALTER TABLE `pasien`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `rekam_medis`
--
ALTER TABLE `rekam_medis`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
