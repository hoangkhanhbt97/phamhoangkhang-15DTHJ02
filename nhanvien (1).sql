-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 05, 2019 at 06:38 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 5.6.39

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nhanvien`
--

-- --------------------------------------------------------

--
-- Table structure for table `chucdanh`
--

CREATE TABLE `chucdanh` (
  `machucdanh` int(11) NOT NULL,
  `tenchucdanh` varchar(222) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `chucdanh`
--

INSERT INTO `chucdanh` (`machucdanh`, `tenchucdanh`) VALUES
(1, 'Truong phong'),
(2, 'Giam doc'),
(3, 'Pho giam doc');

-- --------------------------------------------------------

--
-- Table structure for table `chucvu`
--

CREATE TABLE `chucvu` (
  `machucvu` int(11) NOT NULL,
  `tenchucvu` varchar(222) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `chucvu`
--

INSERT INTO `chucvu` (`machucvu`, `tenchucvu`) VALUES
(1, 'Nhan vien'),
(2, 'Chuyen vien'),
(3, 'Co van');

-- --------------------------------------------------------

--
-- Table structure for table `dantoc`
--

CREATE TABLE `dantoc` (
  `madantoc` int(11) NOT NULL,
  `tendantoc` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dantoc`
--

INSERT INTO `dantoc` (`madantoc`, `tendantoc`) VALUES
(1, 'Kinh'),
(2, 'Thai'),
(3, 'Khome');

-- --------------------------------------------------------

--
-- Table structure for table `donvi`
--

CREATE TABLE `donvi` (
  `madonvi` int(11) NOT NULL,
  `tendonvi` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donvi`
--

INSERT INTO `donvi` (`madonvi`, `tendonvi`) VALUES
(1, 'Phong ban'),
(2, 'Phong khoa'),
(3, 'Phoong chinh su');

-- --------------------------------------------------------

--
-- Table structure for table `honnhan`
--

CREATE TABLE `honnhan` (
  `mahonnhan` int(11) NOT NULL,
  `trinhtrang` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `honnhan`
--

INSERT INTO `honnhan` (`mahonnhan`, `trinhtrang`) VALUES
(1, 'doc than'),
(2, 'Da ket hon'),
(3, 'Ly di');

-- --------------------------------------------------------

--
-- Table structure for table `hoten`
--

CREATE TABLE `hoten` (
  `manv` int(11) NOT NULL,
  `ho` varchar(255) NOT NULL,
  `ten` varchar(255) NOT NULL,
  `hovaten` varchar(255) NOT NULL,
  `tengoikhac` varchar(255) NOT NULL,
  `gioitinh` varchar(255) NOT NULL,
  `ngaysinh` varchar(255) NOT NULL,
  `noisinh` varchar(255) NOT NULL,
  `socmnd` int(11) NOT NULL,
  `madantoc` int(11) NOT NULL,
  `matongiao` int(11) NOT NULL,
  `maquocgia` int(11) NOT NULL,
  `mahonnhan` int(11) NOT NULL,
  `quequan` varchar(255) NOT NULL,
  `diachithuongtru` varchar(225) NOT NULL,
  `noiohiennay` varchar(255) NOT NULL,
  `ghichu` varchar(255) NOT NULL,
  `madonvi` int(11) NOT NULL,
  `capbac` varchar(255) NOT NULL,
  `maloainhansu` int(11) NOT NULL,
  `ngaytuyendunghd` varchar(222) NOT NULL,
  `ngaybonhiem` varchar(222) NOT NULL,
  `machucdanh` int(11) NOT NULL,
  `machucvu` int(11) NOT NULL,
  `chieucao` float NOT NULL,
  `cannang` float NOT NULL,
  `manhommau` int(11) NOT NULL,
  `masuckhoe` int(11) NOT NULL,
  `maxuatthan` int(11) NOT NULL,
  `mauutiengiadinh` int(11) NOT NULL,
  `mauutienbanthan` int(11) NOT NULL,
  `nguontuyendung` varchar(222) NOT NULL,
  `ngaytuyendung` varchar(222) NOT NULL,
  `ngaycap` varchar(222) NOT NULL,
  `dtdidong` int(11) NOT NULL,
  `dtnharieng` int(11) NOT NULL,
  `email` varchar(222) NOT NULL,
  `mathanhpho` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hoten`
--

INSERT INTO `hoten` (`manv`, `ho`, `ten`, `hovaten`, `tengoikhac`, `gioitinh`, `ngaysinh`, `noisinh`, `socmnd`, `madantoc`, `matongiao`, `maquocgia`, `mahonnhan`, `quequan`, `diachithuongtru`, `noiohiennay`, `ghichu`, `madonvi`, `capbac`, `maloainhansu`, `ngaytuyendunghd`, `ngaybonhiem`, `machucdanh`, `machucvu`, `chieucao`, `cannang`, `manhommau`, `masuckhoe`, `maxuatthan`, `mauutiengiadinh`, `mauutienbanthan`, `nguontuyendung`, `ngaytuyendung`, `ngaycap`, `dtdidong`, `dtnharieng`, `email`, `mathanhpho`) VALUES
(1, 'Pham Hoang', 'Khang', 'Pham Hoang Khang', 'khang dep trai', 'Nam', '17/03/1997', 'Ben Tre', 123456789, 1, 1, 1, 1, 'Ben Tre', 'Tan Loi Thanh', 'HCM', 'Dep trai', 1, '??i bi?u qu?c h?i', 1, '10/10/2018', '12/12/2019', 1, 1, 1.78, 65, 1, 1, 1, 1, 1, 'khong biet', '03/03/2019', '02/02/2019', 123456789, 112345678, 'khang@gmail.com', 1),
(2, 'Pham Hoang', 'Khang', 'Pham Hoang Khang', 'khang dep trai', 'Nam', '17/03/1997', 'Ben Tre', 123456789, 2, 2, 2, 2, 'Ben Tre', 'Tan Loi Thanh', 'HCM', 'Dep trai', 2, '??i bi?u qu?c h?i', 2, '10/10/2018', '12/12/2019', 2, 2, 1.78, 65, 2, 2, 2, 2, 2, 'khong biet', '03/03/2019', '02/02/2019', 123456789, 112345678, 'khang@gmail.com', 2);

-- --------------------------------------------------------

--
-- Table structure for table `loainhansu`
--

CREATE TABLE `loainhansu` (
  `maloainhansu` int(11) NOT NULL,
  `tenloainhansu` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `loainhansu`
--

INSERT INTO `loainhansu` (`maloainhansu`, `tenloainhansu`) VALUES
(1, 'Cong Chuc'),
(2, 'Vien chuc'),
(3, 'Nhan Chuc');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `manv` int(11) NOT NULL,
  `mathanhpho` int(11) NOT NULL,
  `matongiao` int(11) NOT NULL,
  `maquocgia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `nhommau`
--

CREATE TABLE `nhommau` (
  `manhommau` int(11) NOT NULL,
  `tennhommau` varchar(222) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nhommau`
--

INSERT INTO `nhommau` (`manhommau`, `tennhommau`) VALUES
(1, 'Mau A'),
(2, 'Mau O'),
(3, 'Mau E');

-- --------------------------------------------------------

--
-- Table structure for table `quocgia`
--

CREATE TABLE `quocgia` (
  `maquocgia` int(11) NOT NULL,
  `tenquocgia` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quocgia`
--

INSERT INTO `quocgia` (`maquocgia`, `tenquocgia`) VALUES
(1, 'Viet Nam'),
(2, 'Phap'),
(3, 'My');

-- --------------------------------------------------------

--
-- Table structure for table `quoctich`
--

CREATE TABLE `quoctich` (
  `maquoctich` int(11) NOT NULL,
  `maquocgia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `suckhoe`
--

CREATE TABLE `suckhoe` (
  `masuckhoe` int(11) NOT NULL,
  `tensuckhoe` varchar(222) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `suckhoe`
--

INSERT INTO `suckhoe` (`masuckhoe`, `tensuckhoe`) VALUES
(1, 'Tot'),
(2, 'Binh Thuong'),
(3, 'Khong tot');

-- --------------------------------------------------------

--
-- Table structure for table `thanhpho`
--

CREATE TABLE `thanhpho` (
  `mathanhpho` int(11) NOT NULL,
  `tenthanhpho` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `thanhpho`
--

INSERT INTO `thanhpho` (`mathanhpho`, `tenthanhpho`) VALUES
(1, 'HCM'),
(2, 'Ben Tre'),
(3, 'Ha Noi');

-- --------------------------------------------------------

--
-- Table structure for table `thongtinlienlat`
--

CREATE TABLE `thongtinlienlat` (
  `mathongtinlienlat` int(11) NOT NULL,
  `manv` int(11) NOT NULL,
  `dtdidong` int(11) NOT NULL,
  `gmail` varchar(255) NOT NULL,
  `dtnharieng` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tongiao`
--

CREATE TABLE `tongiao` (
  `matongiao` int(11) NOT NULL,
  `tendantoc` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tongiao`
--

INSERT INTO `tongiao` (`matongiao`, `tendantoc`) VALUES
(1, 'Thien Chua Giao'),
(2, 'Phat Giao'),
(3, 'Ma giao');

-- --------------------------------------------------------

--
-- Table structure for table `uutienbanthan`
--

CREATE TABLE `uutienbanthan` (
  `mauutienbanthan` int(11) NOT NULL,
  `tenuutienbanthan` varchar(222) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `uutienbanthan`
--

INSERT INTO `uutienbanthan` (`mauutienbanthan`, `tenuutienbanthan`) VALUES
(1, 'Tan tat'),
(2, 'Benh tat'),
(3, 'Hoc Gioi');

-- --------------------------------------------------------

--
-- Table structure for table `uutiengiadinh`
--

CREATE TABLE `uutiengiadinh` (
  `mauutiengiadinh` int(11) NOT NULL,
  `tenuutiengiadinh` varchar(222) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `uutiengiadinh`
--

INSERT INTO `uutiengiadinh` (`mauutiengiadinh`, `tenuutiengiadinh`) VALUES
(1, 'Ho ngheo'),
(2, 'Nong thon'),
(3, 'Vung sau Vung xa');

-- --------------------------------------------------------

--
-- Table structure for table `xuatthan`
--

CREATE TABLE `xuatthan` (
  `maxuatthan` int(11) NOT NULL,
  `tenxuatthan` varchar(222) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `xuatthan`
--

INSERT INTO `xuatthan` (`maxuatthan`, `tenxuatthan`) VALUES
(1, 'Cach mang'),
(2, 'Van Hoa'),
(3, 'Yeu Nuoc');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chucdanh`
--
ALTER TABLE `chucdanh`
  ADD PRIMARY KEY (`machucdanh`);

--
-- Indexes for table `chucvu`
--
ALTER TABLE `chucvu`
  ADD PRIMARY KEY (`machucvu`);

--
-- Indexes for table `dantoc`
--
ALTER TABLE `dantoc`
  ADD PRIMARY KEY (`madantoc`);

--
-- Indexes for table `donvi`
--
ALTER TABLE `donvi`
  ADD PRIMARY KEY (`madonvi`);

--
-- Indexes for table `honnhan`
--
ALTER TABLE `honnhan`
  ADD PRIMARY KEY (`mahonnhan`);

--
-- Indexes for table `hoten`
--
ALTER TABLE `hoten`
  ADD PRIMARY KEY (`manv`),
  ADD KEY `madantoc` (`madantoc`),
  ADD KEY `matongiao` (`matongiao`),
  ADD KEY `madantoc_2` (`madantoc`),
  ADD KEY `maquocgia` (`maquocgia`),
  ADD KEY `mahonnhan` (`mahonnhan`),
  ADD KEY `madonvi` (`madonvi`),
  ADD KEY `maloainhansu` (`maloainhansu`),
  ADD KEY `machucdanh` (`machucdanh`),
  ADD KEY `machucvu` (`machucvu`),
  ADD KEY `manhommau` (`manhommau`),
  ADD KEY `masuckhoe` (`masuckhoe`),
  ADD KEY `maxuatthan` (`maxuatthan`),
  ADD KEY `mauutiengiadinh` (`mauutiengiadinh`),
  ADD KEY `mauutienbanthan` (`mauutienbanthan`),
  ADD KEY `mathanhpho` (`mathanhpho`);

--
-- Indexes for table `loainhansu`
--
ALTER TABLE `loainhansu`
  ADD PRIMARY KEY (`maloainhansu`);

--
-- Indexes for table `nhommau`
--
ALTER TABLE `nhommau`
  ADD PRIMARY KEY (`manhommau`);

--
-- Indexes for table `quocgia`
--
ALTER TABLE `quocgia`
  ADD PRIMARY KEY (`maquocgia`);

--
-- Indexes for table `suckhoe`
--
ALTER TABLE `suckhoe`
  ADD PRIMARY KEY (`masuckhoe`);

--
-- Indexes for table `thanhpho`
--
ALTER TABLE `thanhpho`
  ADD PRIMARY KEY (`mathanhpho`);

--
-- Indexes for table `tongiao`
--
ALTER TABLE `tongiao`
  ADD PRIMARY KEY (`matongiao`);

--
-- Indexes for table `uutienbanthan`
--
ALTER TABLE `uutienbanthan`
  ADD PRIMARY KEY (`mauutienbanthan`);

--
-- Indexes for table `uutiengiadinh`
--
ALTER TABLE `uutiengiadinh`
  ADD PRIMARY KEY (`mauutiengiadinh`);

--
-- Indexes for table `xuatthan`
--
ALTER TABLE `xuatthan`
  ADD PRIMARY KEY (`maxuatthan`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `hoten`
--
ALTER TABLE `hoten`
  ADD CONSTRAINT `hoten_ibfk_1` FOREIGN KEY (`machucdanh`) REFERENCES `chucdanh` (`machucdanh`),
  ADD CONSTRAINT `hoten_ibfk_10` FOREIGN KEY (`mahonnhan`) REFERENCES `honnhan` (`mahonnhan`),
  ADD CONSTRAINT `hoten_ibfk_11` FOREIGN KEY (`madonvi`) REFERENCES `donvi` (`madonvi`),
  ADD CONSTRAINT `hoten_ibfk_12` FOREIGN KEY (`mauutiengiadinh`) REFERENCES `uutiengiadinh` (`mauutiengiadinh`),
  ADD CONSTRAINT `hoten_ibfk_13` FOREIGN KEY (`maloainhansu`) REFERENCES `loainhansu` (`maloainhansu`),
  ADD CONSTRAINT `hoten_ibfk_14` FOREIGN KEY (`matongiao`) REFERENCES `tongiao` (`matongiao`),
  ADD CONSTRAINT `hoten_ibfk_2` FOREIGN KEY (`maxuatthan`) REFERENCES `xuatthan` (`maxuatthan`),
  ADD CONSTRAINT `hoten_ibfk_3` FOREIGN KEY (`manhommau`) REFERENCES `nhommau` (`manhommau`),
  ADD CONSTRAINT `hoten_ibfk_4` FOREIGN KEY (`maquocgia`) REFERENCES `quocgia` (`maquocgia`),
  ADD CONSTRAINT `hoten_ibfk_5` FOREIGN KEY (`mathanhpho`) REFERENCES `thanhpho` (`mathanhpho`),
  ADD CONSTRAINT `hoten_ibfk_6` FOREIGN KEY (`machucvu`) REFERENCES `chucvu` (`machucvu`),
  ADD CONSTRAINT `hoten_ibfk_7` FOREIGN KEY (`mauutienbanthan`) REFERENCES `uutienbanthan` (`mauutienbanthan`),
  ADD CONSTRAINT `hoten_ibfk_8` FOREIGN KEY (`madantoc`) REFERENCES `dantoc` (`madantoc`),
  ADD CONSTRAINT `hoten_ibfk_9` FOREIGN KEY (`masuckhoe`) REFERENCES `suckhoe` (`masuckhoe`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
