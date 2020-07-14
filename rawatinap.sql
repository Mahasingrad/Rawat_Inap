-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.11-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             10.3.0.5771
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for rawatinap
CREATE DATABASE IF NOT EXISTS `rawatinap` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `rawatinap`;

-- Dumping structure for table rawatinap.dokter
CREATE TABLE IF NOT EXISTS `dokter` (
  `id_dokter` int(5) NOT NULL,
  `nama_dokter` varchar(50) NOT NULL,
  `alamat_dokter` varchar(50) NOT NULL,
  `tgllahir_dokter` date NOT NULL,
  `notelp_dokter` varchar(13) NOT NULL,
  `ket_dokter` enum('Spesialis Paruparu','Spesialis THT','Umum','Spesialis Anak','Spesialis Jantung','Spesialis Kulit','Spesialis Gigi') NOT NULL,
  PRIMARY KEY (`id_dokter`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table rawatinap.dokter: ~4 rows (approximately)
DELETE FROM `dokter`;
/*!40000 ALTER TABLE `dokter` DISABLE KEYS */;
INSERT INTO `dokter` (`id_dokter`, `nama_dokter`, `alamat_dokter`, `tgllahir_dokter`, `notelp_dokter`, `ket_dokter`) VALUES
	(101, 'Abdul', 'Antapani', '1990-02-02', '081321621821', 'Umum'),
	(102, 'Ucup', 'Arcamaik', '1995-01-20', '085325632532', 'Spesialis Kulit'),
	(103, 'Somad', 'Kircon', '1980-02-21', '089629329929', 'Spesialis Jantung'),
	(104, 'Reza', 'Buah Batu', '1999-02-10', '087327637827', 'Spesialis Paruparu'),
	(105, 'Mahmud', 'Cijagra', '1960-07-12', '088428628828', 'Spesialis Gigi');
/*!40000 ALTER TABLE `dokter` ENABLE KEYS */;

-- Dumping structure for table rawatinap.laporan_inap
CREATE TABLE IF NOT EXISTS `laporan_inap` (
  `id_laporan` int(3) NOT NULL AUTO_INCREMENT,
  `id_pasien` int(5) DEFAULT NULL,
  `id_dokter` int(5) DEFAULT NULL,
  `id_perawat` int(5) DEFAULT NULL,
  `id_ruangan` int(5) DEFAULT NULL,
  `tgl_inap` date DEFAULT NULL,
  `rincian_inap` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id_laporan`),
  KEY `FK_laporan_inap_pasien` (`id_pasien`),
  KEY `FK_laporan_inap_dokter` (`id_dokter`),
  KEY `FK_laporan_inap_perawat` (`id_perawat`),
  KEY `FK_laporan_inap_ruangan` (`id_ruangan`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table rawatinap.laporan_inap: ~0 rows (approximately)
DELETE FROM `laporan_inap`;
/*!40000 ALTER TABLE `laporan_inap` DISABLE KEYS */;
/*!40000 ALTER TABLE `laporan_inap` ENABLE KEYS */;

-- Dumping structure for table rawatinap.pasien
CREATE TABLE IF NOT EXISTS `pasien` (
  `id_pasien` int(5) NOT NULL,
  `nama_pasien` varchar(50) NOT NULL,
  `alamat_pasien` varchar(50) NOT NULL,
  `tgllahir_pasien` date NOT NULL,
  `notelp_pasien` varchar(13) NOT NULL,
  `goldarah_pasien` enum('A','AB','B','O') NOT NULL,
  `ket_pasien` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id_pasien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table rawatinap.pasien: ~5 rows (approximately)
DELETE FROM `pasien`;
/*!40000 ALTER TABLE `pasien` DISABLE KEYS */;
INSERT INTO `pasien` (`id_pasien`, `nama_pasien`, `alamat_pasien`, `tgllahir_pasien`, `notelp_pasien`, `goldarah_pasien`, `ket_pasien`) VALUES
	(201, 'Jopan', 'Cisaranten', '2000-02-10', '085100200300', 'AB', '-'),
	(202, 'Ridho', 'Cigadung', '1999-10-12', '081100200300', 'O', 'Alergi Penisilin'),
	(203, 'Erick', 'Cimahi', '1995-02-10', '083100200300', 'B', '-'),
	(204, 'Hapid', 'Sukasenang', '1980-01-01', '089100200300', 'A', '-'),
	(205, 'Rully', 'Panyileukan', '1990-05-10', '087250350450', 'O', '-');
/*!40000 ALTER TABLE `pasien` ENABLE KEYS */;

-- Dumping structure for table rawatinap.perawat
CREATE TABLE IF NOT EXISTS `perawat` (
  `id_perawat` int(5) NOT NULL,
  `nama_perawat` varchar(50) NOT NULL,
  `alamat_perawat` varchar(50) NOT NULL,
  `tgllahir_perawat` date NOT NULL,
  `notelp_perawat` varchar(13) NOT NULL,
  PRIMARY KEY (`id_perawat`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table rawatinap.perawat: ~4 rows (approximately)
DELETE FROM `perawat`;
/*!40000 ALTER TABLE `perawat` DISABLE KEYS */;
INSERT INTO `perawat` (`id_perawat`, `nama_perawat`, `alamat_perawat`, `tgllahir_perawat`, `notelp_perawat`) VALUES
	(301, 'Susi', 'Cileunyi', '1990-04-04', '0227208080'),
	(302, 'Sasa', 'Cibeureum', '1990-02-02', '0227207070'),
	(303, 'Sisi', 'Cibatu', '1990-01-01', '0227206060'),
	(304, 'Susu', 'Ciwastra', '1990-03-03', '0227205050'),
	(305, 'Susa', 'Cikijing', '1990-05-05', '0227204040');
/*!40000 ALTER TABLE `perawat` ENABLE KEYS */;

-- Dumping structure for table rawatinap.ruangan
CREATE TABLE IF NOT EXISTS `ruangan` (
  `id_ruangan` int(5) NOT NULL,
  `kondisi` enum('Isi','Kosong') NOT NULL DEFAULT 'Kosong',
  `kelas` enum('VVIP','VIP','REGULAR') NOT NULL DEFAULT 'REGULAR',
  PRIMARY KEY (`id_ruangan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table rawatinap.ruangan: ~11 rows (approximately)
DELETE FROM `ruangan`;
/*!40000 ALTER TABLE `ruangan` DISABLE KEYS */;
INSERT INTO `ruangan` (`id_ruangan`, `kondisi`, `kelas`) VALUES
	(401, 'Kosong', 'REGULAR'),
	(402, 'Kosong', 'REGULAR'),
	(403, 'Kosong', 'REGULAR'),
	(404, 'Kosong', 'REGULAR'),
	(411, 'Kosong', 'VIP'),
	(412, 'Kosong', 'VIP'),
	(413, 'Kosong', 'VIP'),
	(414, 'Kosong', 'VIP'),
	(421, 'Kosong', 'VVIP'),
	(422, 'Kosong', 'VVIP'),
	(423, 'Kosong', 'VVIP'),
	(424, 'Kosong', 'VVIP');
/*!40000 ALTER TABLE `ruangan` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
