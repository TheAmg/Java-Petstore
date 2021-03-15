-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3307
-- Generation Time: Nov 28, 2017 at 06:32 AM
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
-- Table structure for table `pet`
--

CREATE TABLE `pet` (
  `pid` int(10) NOT NULL,
  `pname` varchar(20) NOT NULL,
  `psubcat` varchar(20) NOT NULL,
  `pdesc` longtext NOT NULL,
  `price` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pet`
--

INSERT INTO `pet` (`pid`, `pname`, `psubcat`, `pdesc`, `price`) VALUES
(1, 'Cat', 'Tabby', 'A tabby is any domestic cat that has a coat \r\nfeaturing distinctive stripes, dots, lines \r\nor swirling patterns, usually together with\r\na mark resembling an \'M\' on its forehead.\r\nTabbies are sometimes erroneously assumed to be a cat breed.', 15000),
(2, 'Cat', 'Munchkin', 'The Munchkin is a relatively new breed of cat\r\ncharacterized by its very short legs, which are\r\ncaused by a genetic mutation. Much controversy erupted\r\nover the breed when it was recognized by \r\nThe International Cat Association in 1995 with critics\r\nvoicing concern over potential health and mobility issues.', 20000),
(3, 'Cat', 'Scottish Fold', 'The Scottish Fold is a breed of domestic cat\r\nwith a natural dominant-gene mutation that\r\naffects cartilage throughout the body, causing \r\nthe ears to \"fold,” bending forward and down towards\r\nthe front of the head, which gives the cat what is \r\noften described as an \"owl-like\" appearance.\r\n\r\n', 30000),
(4, 'Cat', 'Calico', 'Calico cats are domestic cats with a\r\nspotted or particolored coat that is\r\npredominantly white, with patches of\r\ntwo other colors (often, the two other \r\ncolors are orange and black). Outside\r\nNorth America, the pattern is more \r\nusually called tortoiseshell-and-white. \r\n\r\n', 16000),
(5, 'Cat', 'American Curl', 'The American Curl is a breed of cat \r\ncharacterized by its unusual ears, which curl back\r\nfrom the face toward the center of the back of the skull.\r\nAn American Curl\'s ears should be handled carefully\r\nbecause rough handling may damage the \r\ncartilage in the ear. The breed originated in \r\nLakewood, California, as the result\r\nof a spontaneous mutation.', 32000),
(6, 'Cat', 'Persian', 'The Persian cat is a long-haired breed of cat \r\ncharacterized by its round face and short muzzle. \r\nIt is also known as the Persian Longhair. \r\nIn the Middle East they are widely known as Iranian cat\r\nand in Iran they are known as Shirazi cat. The first \r\ndocumented ancestors of the Persian were imported into \r\nItaly from Iran (Persia) around 1620.The exact \r\nhistory of the Persian cat does seem to be a bit of a \r\nmystery but many of these long-haired cats were seen in\r\nhieroglyphics.\r\n\r\n', 40000),
(7, 'Dog', 'Husky', 'Husky is a general name for a sled-type\r\nof dog used in northern regions, differentiated\r\nfrom other sled-dog types by their fast pulling style.\r\nThey are an ever-changing cross-breed of the\r\nfastest dogs. The Alaskan Malamute, by contrast,\r\nis \"the largest and most powerful\" sled dog, \r\nand was used for heavier loads. ', 32000),
(8, 'Dog', 'Pitbull', 'Pit bull is the common name for a type of dog.\r\nFormal breeds often considered in North America\r\nto be of the pit bull type include the American \r\nPit Bull Terrier, American Staffordshire Terrier,\r\nAmerican Bully, and Staffordshire Bull Terrier.', 22000),
(9, 'Dog', 'German Shepherd', 'The German Shepherd is a breed of medium\r\nto large-sized working dog that originated \r\nin Germany. The breed\'s officially recognized\r\nname\r\nis German Shepherd Dog in the English language.\r\nThe breed is also known as the Alsatian in\r\nBritain and Ireland. The German Shepherd is a \r\nrelatively new breed of dog, with their origin \r\ndating to 1899. As part of the Herding Group, \r\nGerman Shepherds are working dogs developed \r\noriginally for herding sheep. ', 18000),
(10, 'Dog', 'Golden Retriever', 'The Golden Retriever is a large-sized breed of dog\r\nbred as gun dogs to retrieve shot waterfowl such\r\nas ducks and upland game birds during hunting and\r\nshooting parties, and were named \'retriever\' because\r\nof their ability to retrieve shot game undamaged. \r\nGolden Retrievers have an instinctive love of water,\r\nand are easy to train to basic or advanced obedience\r\nstandards. They are a long-coated breed, with a dense \r\ninner coat that provides them with adequate warmth in \r\nthe outdoors, and an outer coat that lies flat against\r\ntheir bodies and repels water. \r\n\r\n', 23000),
(11, 'Dog', 'Greyhound', 'The Greyhound is a breed of dog, a sighthound\r\nwhich has been bred for coursing game and \r\nGreyhound racing. Since the rise in large-scale\r\nadoption of retired racing Greyhounds, the breed\r\nhas seen a resurgence in popularity as a family pet.\r\n\r\n', 40000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pet`
--
ALTER TABLE `pet`
  ADD PRIMARY KEY (`pid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pet`
--
ALTER TABLE `pet`
  MODIFY `pid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
