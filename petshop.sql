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
-- Database: `petshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `atlogs`
--

CREATE TABLE `atlogs` (
  `logno` int(50) NOT NULL,
  `logname` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `atlogs`
--

INSERT INTO `atlogs` (`logno`, `logname`) VALUES
(1, 'mark');

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `cname` varchar(20) NOT NULL,
  `pet` varchar(20) NOT NULL,
  `petcost` varchar(20) NOT NULL,
  `cid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`cname`, `pet`, `petcost`, `cid`) VALUES
('2', 'Husky', '32000', 1),
('1', 'Munchkin', '20000', 2);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `cid` int(10) NOT NULL,
  `cname` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`cid`, `cname`) VALUES
(1, 'Cat'),
(2, 'Dog');

-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

CREATE TABLE `contact` (
  `conid` int(10) NOT NULL,
  `cname` varchar(20) NOT NULL,
  `mail` varchar(30) NOT NULL,
  `intro` varchar(500) NOT NULL,
  `designation` varchar(20) NOT NULL,
  `contactno` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contact`
--

INSERT INTO `contact` (`conid`, `cname`, `mail`, `intro`, `designation`, `contactno`) VALUES
(1, 'Deepak', 'deepak@gmail.com', 'greetings there,\r\nare you intrested in pets?\r\nwould you take home and nurture/care for one of these abandoned animals,\r\nif yes, you are at the right place.\r\nTake a look around and see if you like one of our animals.', 'Manager', '9741555125'),
(2, 'Amogh', 'Amogh@gmail.com', 'greetings there,\r\nAny Suggestions to improve our page Please contact and do send in your suggestions ', 'Support', '8321543376');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `custid` int(50) NOT NULL,
  `cname` varchar(20) NOT NULL,
  `petname` varchar(20) NOT NULL,
  `price` int(11) NOT NULL,
  `pincode` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`custid`, `cname`, `petname`, `price`, `pincode`) VALUES
(13, 'noob', 'Tabby', 15000, 666);

-- --------------------------------------------------------

--
-- Table structure for table `pet`
--

CREATE TABLE `pet` (
  `pid` int(10) NOT NULL,
  `pname` varchar(20) NOT NULL,
  `psubcat` varchar(20) NOT NULL,
  `pdesc` longtext NOT NULL,
  `price` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pet`
--

INSERT INTO `pet` (`pid`, `pname`, `psubcat`, `pdesc`, `price`) VALUES
(1, 'Cat', 'Tabby', 'A tabby is any domestic cat that has a coat \r\nfeaturing distinctive stripes, dots, lines \r\nor swirling patterns, usually together with\r\na mark resembling an \'M\' on its forehead.\r\nTabbies are sometimes erroneously assumed to be a cat breed.', '15000'),
(2, 'Cat', 'Munchkin', 'The Munchkin is a relatively new breed of cat\r\ncharacterized by its very short legs, which are\r\ncaused by a genetic mutation. Much controversy erupted\r\nover the breed when it was recognized by \r\nThe International Cat Association in 1995 with critics\r\nvoicing concern over potential health and mobility issues.', '20000'),
(3, 'Cat', 'Scottish Fold', 'The Scottish Fold is a breed of domestic cat\r\nwith a natural dominant-gene mutation that\r\naffects cartilage throughout the body, causing \r\nthe ears to \"fold,” bending forward and down towards\r\nthe front of the head, which gives the cat what is \r\noften described as an \"owl-like\" appearance.\r\n\r\n', '30000'),
(4, 'Cat', 'Calico', 'Calico cats are domestic cats with a\r\nspotted or particolored coat that is\r\npredominantly white, with patches of\r\ntwo other colors (often, the two other \r\ncolors are orange and black). Outside\r\nNorth America, the pattern is more \r\nusually called tortoiseshell-and-white. \r\n\r\n', '16000'),
(5, 'Cat', 'American Curl', 'The American Curl is a breed of cat \r\ncharacterized by its unusual ears, which curl back\r\nfrom the face toward the center of the back of the skull.\r\nAn American Curl\'s ears should be handled carefully\r\nbecause rough handling may damage the \r\ncartilage in the ear. The breed originated in \r\nLakewood, California, as the result\r\nof a spontaneous mutation.', '32000'),
(6, 'Cat', 'Persian', 'The Persian cat is a long-haired breed of cat \r\ncharacterized by its round face and short muzzle. \r\nIt is also known as the Persian Longhair. \r\nIn the Middle East they are widely known as Iranian cat\r\nand in Iran they are known as Shirazi cat. The first \r\ndocumented ancestors of the Persian were imported into \r\nItaly from Iran (Persia) around 1620.The exact \r\nhistory of the Persian cat does seem to be a bit of a \r\nmystery but many of these long-haired cats were seen in\r\nhieroglyphics.\r\n\r\n', '40000'),
(7, 'Dog', 'Husky', 'Husky is a general name for a sled-type\r\nof dog used in northern regions, differentiated\r\nfrom other sled-dog types by their fast pulling style.\r\nThey are an ever-changing cross-breed of the\r\nfastest dogs. The Alaskan Malamute, by contrast,\r\nis \"the largest and most powerful\" sled dog, \r\nand was used for heavier loads. ', '32000'),
(8, 'Dog', 'Pitbull', 'Pit bull is the common name for a type of dog.\r\nFormal breeds often considered in North America\r\nto be of the pit bull type include the American \r\nPit Bull Terrier, American Staffordshire Terrier,\r\nAmerican Bully, and Staffordshire Bull Terrier.', '22000'),
(9, 'Dog', 'German Shepherd', 'The German Shepherd is a breed of medium\r\nto large-sized working dog that originated \r\nin Germany. The breed\'s officially recognized\r\nname\r\nis German Shepherd Dog in the English language.\r\nThe breed is also known as the Alsatian in\r\nBritain and Ireland. The German Shepherd is a \r\nrelatively new breed of dog, with their origin \r\ndating to 1899. As part of the Herding Group, \r\nGerman Shepherds are working dogs developed \r\noriginally for herding sheep. ', '18000'),
(10, 'Dog', 'Golden Retriever', 'The Golden Retriever is a large-sized breed of dog\r\nbred as gun dogs to retrieve shot waterfowl such\r\nas ducks and upland game birds during hunting and\r\nshooting parties, and were named \'retriever\' because\r\nof their ability to retrieve shot game undamaged. \r\nGolden Retrievers have an instinctive love of water,\r\nand are easy to train to basic or advanced obedience\r\nstandards. They are a long-coated breed, with a dense \r\ninner coat that provides them with adequate warmth in \r\nthe outdoors, and an outer coat that lies flat against\r\ntheir bodies and repels water. \r\n\r\n', '23000'),
(11, 'Dog', 'Greyhound', 'The Greyhound is a breed of dog, a sighthound\r\nwhich has been bred for coursing game and \r\nGreyhound racing. Since the rise in large-scale\r\nadoption of retired racing Greyhounds, the breed\r\nhas seen a resurgence in popularity as a family pet.\r\n\r\n', '40000');

-- --------------------------------------------------------

--
-- Table structure for table `shipping`
--

CREATE TABLE `shipping` (
  `sid` int(10) NOT NULL,
  `sname` varchar(20) NOT NULL,
  `pcode` int(10) NOT NULL,
  `state` varchar(30) NOT NULL,
  `phno` int(20) NOT NULL,
  `petname` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shipping`
--

INSERT INTO `shipping` (`sid`, `sname`, `pcode`, `state`, `phno`, `petname`) VALUES
(1, 'Akshay', 560056, 'Karnataka', 65566458, 'Husky'),
(2, 'Pavan', 560001, 'karnataka', 78654987, 'Husky'),
(3, '7', 7, '7', 7, 'Husky'),
(4, 'nigger', 56, 'noobville', 666, 'Husky'),
(5, '8', 8, '8', 8, 'Husky');

-- --------------------------------------------------------

--
-- Table structure for table `subcat`
--

CREATE TABLE `subcat` (
  `subid` int(10) NOT NULL,
  `parentid` int(10) NOT NULL,
  `catname` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subcat`
--

INSERT INTO `subcat` (`subid`, `parentid`, `catname`) VALUES
(1, 1, 'Tabby Cat'),
(2, 1, 'Munchkin'),
(3, 1, 'Scottish Fold'),
(4, 1, 'Calico'),
(5, 1, 'American Curl'),
(6, 1, 'Persian'),
(7, 2, 'Husky'),
(8, 2, 'Pitbull'),
(9, 2, 'German Shephard'),
(10, 2, 'Golden Retriever'),
(11, 2, 'Greyhound'),
(12, 2, 'Labrador');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `uid` int(10) NOT NULL,
  `uname` varchar(30) NOT NULL,
  `upwd` varchar(100) NOT NULL,
  `priv` varchar(10) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `uphno` int(20) NOT NULL,
  `pcode` int(20) NOT NULL,
  `state` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`uid`, `uname`, `upwd`, `priv`, `mail`, `uphno`, `pcode`, `state`) VALUES
(1, 'admin', 'admin', 'admin', 'admin@gmail.com', 789456321, 560010, 'Karnataka'),
(3, 'noob', 'noob', 'support', 'noobmail', 666, 56, 'karnataka'),
(10, 'mark', 'nigger', 'customer', 'niggmail@gmail.com', 69, 141, 'uttarpradesh');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `atlogs`
--
ALTER TABLE `atlogs`
  ADD PRIMARY KEY (`logno`);

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`cid`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`cid`);

--
-- Indexes for table `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`conid`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`custid`);

--
-- Indexes for table `pet`
--
ALTER TABLE `pet`
  ADD PRIMARY KEY (`pid`);

--
-- Indexes for table `shipping`
--
ALTER TABLE `shipping`
  ADD PRIMARY KEY (`sid`);

--
-- Indexes for table `subcat`
--
ALTER TABLE `subcat`
  ADD PRIMARY KEY (`subid`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`uid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `atlogs`
--
ALTER TABLE `atlogs`
  MODIFY `logno` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `cart`
--
ALTER TABLE `cart`
  MODIFY `cid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `cid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `contact`
--
ALTER TABLE `contact`
  MODIFY `conid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `custid` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT for table `pet`
--
ALTER TABLE `pet`
  MODIFY `pid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `shipping`
--
ALTER TABLE `shipping`
  MODIFY `sid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `subcat`
--
ALTER TABLE `subcat`
  MODIFY `subid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `uid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
