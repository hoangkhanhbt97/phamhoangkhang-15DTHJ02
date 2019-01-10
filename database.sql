-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 10, 2019 lúc 04:22 AM
-- Phiên bản máy phục vụ: 10.1.37-MariaDB
-- Phiên bản PHP: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `database`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dantoc`
--

CREATE TABLE `dantoc` (
  `MaDT` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TenDT` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `dantoc`
--

INSERT INTO `dantoc` (`MaDT`, `TenDT`) VALUES
('1', 'Kinh'),
('2', 'Tay'),
('3', 'Thai');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `gioitinh`
--

CREATE TABLE `gioitinh` (
  `MaGT` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `GT` varchar(30) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `gioitinh`
--

INSERT INTO `gioitinh` (`MaGT`, `GT`) VALUES
('1', 'Nam'),
('2', 'Nu');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `honnhan`
--

CREATE TABLE `honnhan` (
  `MaHN` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TTrang` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `honnhan`
--

INSERT INTO `honnhan` (`MaHN`, `TTrang`) VALUES
('1', 'Doc Than'),
('2', 'Co Gia Dinh'),
('3', 'Ly Than'),
('4', 'Ly Hon'),
('5', 'Goa chong/vo');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` int(11) NOT NULL,
  `Img` blob NOT NULL,
  `TenNV` varchar(255) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `TenDN` varchar(255) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `Matkhau` char(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TenKhac` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Ngaysinh` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaGT` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Noisinh` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `DNCuoi` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `sohieuCC` char(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `hoatdong` char(2) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `CMND` char(12) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ngaycap` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `noicap` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `tenntat` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaDT` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaTG` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaQT` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaTinh` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TP` varchar(255) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `Phuong` varchar(255) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `ThonXom` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `DiaChi` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `NoiOHT` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `DTCQ` char(12) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `DTNR` char(12) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `DTDD` char(12) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Email` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaHN` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaTPXT` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaUTBT` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaUTGD` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `NangKhieu` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaSK` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaNM` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ChieuCao` int(3) NOT NULL,
  `CanNang` int(3) NOT NULL,
  `KhuyetTat` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `SoTK` char(30) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `NHMTK` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `NgayDongBHXH` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `SoBHXH` char(10) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `Img`, `TenNV`, `TenDN`, `Matkhau`, `TenKhac`, `Ngaysinh`, `MaGT`, `Noisinh`, `DNCuoi`, `sohieuCC`, `hoatdong`, `CMND`, `ngaycap`, `noicap`, `tenntat`, `MaDT`, `MaTG`, `MaQT`, `MaTinh`, `TP`, `Phuong`, `ThonXom`, `DiaChi`, `NoiOHT`, `DTCQ`, `DTNR`, `DTDD`, `Email`, `MaHN`, `MaTPXT`, `MaUTBT`, `MaUTGD`, `NangKhieu`, `MaSK`, `MaNM`, `ChieuCao`, `CanNang`, `KhuyetTat`, `SoTK`, `NHMTK`, `NgayDongBHXH`, `SoBHXH`) VALUES
(1, 0x6e756c6c, 'fadf', 'fadf', 'null', 'fdsaf', 'Jan 2, 2019', '1', 'fdasf', 'Jan 2, 2019', 'fadsfds', '', 'fadsf', 'Jan 25, 2019', 'fdsafdsa', 'fsdafdsa', '1', '1', '1', '0', '1', '2', 'Phuong', 'fsdaf', 'fdsaf', 'sadf', 'fsadf', 'fdsa', 'fadsfdsa', '1', '1', '1', '1', 'fdsafsda', '1', '1', 180, 75, 'fdsfdas', 'fdsafa', 'fsadf', 'Jan 2, 2019', 'fdsaf'),
(2, 0x6e756c6c, '7', '7', 'null', '7', 'Jan 9, 2019', '1', '7', 'Jan 3, 2019', '7', '', '7', 'Jan 10, 2019', '7', '7', '1', '1', '1', '0', '1', '2', 'Phuong', '7', '7', '7', '7', '7', '7', '1', '1', '1', '1', '7', '1', '1', 7, 7, '7', '7', '7', 'Jan 9, 2019', '7');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhommau`
--

CREATE TABLE `nhommau` (
  `MaNM` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TenNM` char(2) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `nhommau`
--

INSERT INTO `nhommau` (`MaNM`, `TenNM`) VALUES
('1', 'A'),
('2', 'AB'),
('3', 'O'),
('4', 'D');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phuong`
--

CREATE TABLE `phuong` (
  `MaPhuong` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TenPhuong` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `phuong`
--

INSERT INTO `phuong` (`MaPhuong`, `TenPhuong`) VALUES
('1', 'Quan 1'),
('2', 'Quan Tan Binh'),
('3', 'Quan Hai Chau'),
('4', 'Quan Lien Chieu'),
('5', 'Huyen Đat Đo'),
('6', 'Huyen Long Son');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `quoctich`
--

CREATE TABLE `quoctich` (
  `MaQT` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TenQT` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `quoctich`
--

INSERT INTO `quoctich` (`MaQT`, `TenQT`) VALUES
('1', 'Viet Nam'),
('2', 'Thai Lan'),
('3', 'My');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `suckhoe`
--

CREATE TABLE `suckhoe` (
  `MaSK` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TTSK` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `suckhoe`
--

INSERT INTO `suckhoe` (`MaSK`, `TTSK`) VALUES
('1', 'Tot'),
('2', 'Khong Tot');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thanhpho`
--

CREATE TABLE `thanhpho` (
  `MaTP` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TenTP` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `thanhpho`
--

INSERT INTO `thanhpho` (`MaTP`, `TenTP`) VALUES
('1', 'TP Ho Chi Minh'),
('2', 'TP Da Nang'),
('3', 'TP Vung Tau');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tinh`
--

CREATE TABLE `tinh` (
  `MaTinh` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TenTinh` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `tinh`
--

INSERT INTO `tinh` (`MaTinh`, `TenTinh`) VALUES
('0', '0'),
('1', 'Ba Ria - Vung Tau');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tinh_thanh`
--

CREATE TABLE `tinh_thanh` (
  `MaTinh` char(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaTP` char(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `tinh_thanh`
--

INSERT INTO `tinh_thanh` (`MaTinh`, `MaTP`) VALUES
('0', '1'),
('0', '2'),
('1', '3');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tongiao`
--

CREATE TABLE `tongiao` (
  `MaTG` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TenTG` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `tongiao`
--

INSERT INTO `tongiao` (`MaTG`, `TenTG`) VALUES
('1', 'Dao Cong Giao'),
('2', 'Phat Giao'),
('3', 'Dao Cao Đai'),
('4', 'Tin Lanh');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tpxuatthan`
--

CREATE TABLE `tpxuatthan` (
  `MaTPXT` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TPXT` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `tpxuatthan`
--

INSERT INTO `tpxuatthan` (`MaTPXT`, `TPXT`) VALUES
('1', 'Cong Chuc Can Bo'),
('2', 'Hoc Sinh'),
('3', 'Sinh Vien'),
('4', 'Cong Nhan'),
('5', 'Dan Ngheo');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tp_phuong`
--

CREATE TABLE `tp_phuong` (
  `MaTP` char(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaPhuong` char(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `tp_phuong`
--

INSERT INTO `tp_phuong` (`MaTP`, `MaPhuong`) VALUES
('1', '1'),
('1', '2'),
('2', '3'),
('2', '4'),
('3', '5'),
('3', '6');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `uutienbt`
--

CREATE TABLE `uutienbt` (
  `MaUTBT` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `LoaiUTBT` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `uutienbt`
--

INSERT INTO `uutienbt` (`MaUTBT`, `LoaiUTBT`) VALUES
('1', 'Anh Hung Lao Dong'),
('2', 'Thuong Binh Liet Si'),
('3', 'Dan Toc Thieu So');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `uutiengd`
--

CREATE TABLE `uutiengd` (
  `MaUTGD` char(3) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `LoaiUTGD` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `uutiengd`
--

INSERT INTO `uutiengd` (`MaUTGD`, `LoaiUTGD`) VALUES
('1', 'Ho Ngheo'),
('2', 'Co Cong Voi Cach Mang'),
('3', 'Thuong Binh Liet Si');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `dantoc`
--
ALTER TABLE `dantoc`
  ADD PRIMARY KEY (`MaDT`);

--
-- Chỉ mục cho bảng `gioitinh`
--
ALTER TABLE `gioitinh`
  ADD PRIMARY KEY (`MaGT`);

--
-- Chỉ mục cho bảng `honnhan`
--
ALTER TABLE `honnhan`
  ADD PRIMARY KEY (`MaHN`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`),
  ADD UNIQUE KEY `TenDN` (`TenDN`),
  ADD KEY `MaGT` (`MaGT`),
  ADD KEY `MaDT` (`MaDT`),
  ADD KEY `MaTG` (`MaTG`),
  ADD KEY `MaQT` (`MaQT`),
  ADD KEY `MaTinh` (`MaTinh`),
  ADD KEY `MaHN` (`MaHN`),
  ADD KEY `MaTPXT` (`MaTPXT`),
  ADD KEY `MaUTBT` (`MaUTBT`),
  ADD KEY `MaUTGD` (`MaUTGD`),
  ADD KEY `MaSK` (`MaSK`),
  ADD KEY `MaNM` (`MaNM`);

--
-- Chỉ mục cho bảng `nhommau`
--
ALTER TABLE `nhommau`
  ADD PRIMARY KEY (`MaNM`);

--
-- Chỉ mục cho bảng `phuong`
--
ALTER TABLE `phuong`
  ADD PRIMARY KEY (`MaPhuong`);

--
-- Chỉ mục cho bảng `quoctich`
--
ALTER TABLE `quoctich`
  ADD PRIMARY KEY (`MaQT`);

--
-- Chỉ mục cho bảng `suckhoe`
--
ALTER TABLE `suckhoe`
  ADD PRIMARY KEY (`MaSK`);

--
-- Chỉ mục cho bảng `thanhpho`
--
ALTER TABLE `thanhpho`
  ADD PRIMARY KEY (`MaTP`);

--
-- Chỉ mục cho bảng `tinh`
--
ALTER TABLE `tinh`
  ADD PRIMARY KEY (`MaTinh`);

--
-- Chỉ mục cho bảng `tinh_thanh`
--
ALTER TABLE `tinh_thanh`
  ADD PRIMARY KEY (`MaTinh`,`MaTP`),
  ADD KEY `MaTP` (`MaTP`);

--
-- Chỉ mục cho bảng `tongiao`
--
ALTER TABLE `tongiao`
  ADD PRIMARY KEY (`MaTG`);

--
-- Chỉ mục cho bảng `tpxuatthan`
--
ALTER TABLE `tpxuatthan`
  ADD PRIMARY KEY (`MaTPXT`);

--
-- Chỉ mục cho bảng `tp_phuong`
--
ALTER TABLE `tp_phuong`
  ADD PRIMARY KEY (`MaTP`,`MaPhuong`),
  ADD KEY `MaPhuong` (`MaPhuong`);

--
-- Chỉ mục cho bảng `uutienbt`
--
ALTER TABLE `uutienbt`
  ADD PRIMARY KEY (`MaUTBT`);

--
-- Chỉ mục cho bảng `uutiengd`
--
ALTER TABLE `uutiengd`
  ADD PRIMARY KEY (`MaUTGD`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `MaNV` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`MaUTBT`) REFERENCES `uutienbt` (`MaUTBT`),
  ADD CONSTRAINT `nhanvien_ibfk_10` FOREIGN KEY (`MaUTGD`) REFERENCES `uutiengd` (`MaUTGD`),
  ADD CONSTRAINT `nhanvien_ibfk_11` FOREIGN KEY (`MaTPXT`) REFERENCES `tpxuatthan` (`MaTPXT`),
  ADD CONSTRAINT `nhanvien_ibfk_12` FOREIGN KEY (`MaTinh`) REFERENCES `tinh` (`MaTinh`),
  ADD CONSTRAINT `nhanvien_ibfk_2` FOREIGN KEY (`MaNM`) REFERENCES `nhommau` (`MaNM`),
  ADD CONSTRAINT `nhanvien_ibfk_4` FOREIGN KEY (`MaTG`) REFERENCES `tongiao` (`MaTG`),
  ADD CONSTRAINT `nhanvien_ibfk_5` FOREIGN KEY (`MaQT`) REFERENCES `quoctich` (`MaQT`),
  ADD CONSTRAINT `nhanvien_ibfk_6` FOREIGN KEY (`MaGT`) REFERENCES `gioitinh` (`MaGT`),
  ADD CONSTRAINT `nhanvien_ibfk_7` FOREIGN KEY (`MaDT`) REFERENCES `dantoc` (`MaDT`),
  ADD CONSTRAINT `nhanvien_ibfk_8` FOREIGN KEY (`MaSK`) REFERENCES `suckhoe` (`MaSK`),
  ADD CONSTRAINT `nhanvien_ibfk_9` FOREIGN KEY (`MaHN`) REFERENCES `honnhan` (`MaHN`);

--
-- Các ràng buộc cho bảng `tinh_thanh`
--
ALTER TABLE `tinh_thanh`
  ADD CONSTRAINT `tinh_thanh_ibfk_1` FOREIGN KEY (`MaTP`) REFERENCES `thanhpho` (`MaTP`),
  ADD CONSTRAINT `tinh_thanh_ibfk_2` FOREIGN KEY (`MaTinh`) REFERENCES `tinh` (`MaTinh`);

--
-- Các ràng buộc cho bảng `tp_phuong`
--
ALTER TABLE `tp_phuong`
  ADD CONSTRAINT `tp_phuong_ibfk_1` FOREIGN KEY (`MaTP`) REFERENCES `thanhpho` (`MaTP`),
  ADD CONSTRAINT `tp_phuong_ibfk_2` FOREIGN KEY (`MaPhuong`) REFERENCES `phuong` (`MaPhuong`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
