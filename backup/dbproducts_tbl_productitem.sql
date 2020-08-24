-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: dbproducts
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_productitem`
--

DROP TABLE IF EXISTS `tbl_productitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_productitem` (
  `item_ID` int(11) NOT NULL AUTO_INCREMENT,
  `product_ID` int(11) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  `price` decimal(12,2) DEFAULT NULL,
  PRIMARY KEY (`item_ID`),
  KEY `product_ID_idx` (`product_ID`),
  CONSTRAINT `product_ID` FOREIGN KEY (`product_ID`) REFERENCES `tbl_products` (`product_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_productitem`
--

LOCK TABLES `tbl_productitem` WRITE;
/*!40000 ALTER TABLE `tbl_productitem` DISABLE KEYS */;
INSERT INTO `tbl_productitem` VALUES (3,30,'Diamond Blade Super Thin with Bushing 4\"',195.00),(4,31,'Diamond Blade Super Thin with Bushing 4\"',165.00),(5,33,'Emery Wheel Bushing Set (5/4 x 1-1/4 x 1 x 3/4 x 5/8 x 1/2)',35.00),(6,40,'Diamond Cup Wheel 4\" x 5/8\" CW-9001',470.00),(7,41,'Depressed Center Wheel 1/4\" x 4\" x 5/8\" x 3\" ply',18.00),(8,42,'Depressed Center Wheel 1/4\" x 4\" Steel',18.00),(9,47,'Abrasive Cut-off Wheel/Cutting Wheel (Stainless)',17.50),(10,56,'Cutting Wheel 5\" Stone',28.50),(11,57,'Cutting Wheel 4\" for Stainless Steel',40.00),(12,66,'Wire Wheel Brush without Arbor 3\" x 1/2\" 8816',35.00),(13,67,'5 pcs. Wire Wheel Set (1\", 1-1/2\", 2\", 2-1/2\", 3\") with Detachable Arbor 8801',80.00),(14,68,'2 pcs. Cup Set (2\", 3\") with Built-in Arbor 9935',110.00),(15,69,'2 pcs. Combination Cup Set (3\" Knotted, 3\" Twisted) with Built-in Arbor 8889',160.00);
/*!40000 ALTER TABLE `tbl_productitem` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-29 22:44:40
