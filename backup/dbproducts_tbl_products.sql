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
-- Table structure for table `tbl_products`
--

DROP TABLE IF EXISTS `tbl_products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_products` (
  `product_ID` int(11) NOT NULL AUTO_INCREMENT,
  `brand` varchar(50) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `details` varchar(500) DEFAULT NULL,
  `isactive` int(11) DEFAULT NULL,
  `picture1` varchar(100) DEFAULT NULL,
  `picture2` varchar(100) DEFAULT NULL,
  `picture3` varchar(100) DEFAULT NULL,
  `picture4` varchar(100) DEFAULT NULL,
  `picture5` varchar(100) DEFAULT NULL,
  `variant` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_ID`),
  UNIQUE KEY `product_ID_UNIQUE` (`product_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_products`
--

LOCK TABLES `tbl_products` WRITE;
/*!40000 ALTER TABLE `tbl_products` DISABLE KEYS */;
INSERT INTO `tbl_products` VALUES (17,'Indestro','Circular Saw Blade (wood)','',1,'images/IMG_0340_INDESTRO_CIRCULARSAWBLADEWOOD1.JPG','images/IMG_0341_INDESTRO_CIRCULARSAWBLADEWOOD2.JPG','images/IMG_0344_INDESTRO_CIRCULARSAWBLADEWOOD3.JPG','','',1),(18,'Simond','Circular Saw (Rip Cutting) for Wood','',1,'images/IMG_0345_SIMOND_CIRCULARSAWRIPCUTTING1.JPG','images/IMG_0346_SIMOND_CIRCULARSAWRIPCUTTING2.JPG','images/IMG_0347_SIMOND_CIRCULARSAWRIPCUTTING3.JPG','','',1),(19,'Simond','Circular Saw (Cross Cut) for Plywood 100 Teeth','',1,'images/IMG_0348_SIMOND_CIRCULARSAWCROSSCUT1.JPG','images/IMG_0349_SIMOND_CIRCULARSAWCROSSCUT2.JPG','images/IMG_0350_SIMOND_CIRCULARSAWCROSSCUT3.JPG','','',1),(20,'Hunter','Germany Circular Saw Blade (Rip Cut)','',1,'images/IMG_0351_HUNTER_CIRCULARSAWRIP1.JPG','','','','',1),(21,'Hunter','Germany Circular Saw Blade (Cross Cut)','',1,'images/IMG_0352_HUNTER_CIRCULARSAWCROSSCUT1.JPG','','','','',1),(22,'Nicholson','Carbide Tipped Circular Saw Blade (Wood)','',1,'images/IMG_0353_NICHOLSON_CIRCULARSAWWOOD1.JPG','images/IMG_0354_NICHOLSON_CIRCULARSAWWOOD2.JPG','','','',1),(23,'Nicholson','Carbide Tipped Circular Saw Blade (Aluminum)','',1,'images/IMG_0355_NICHOLSON_CIRCULARSAWALUMINUM1.JPG','images/IMG_0356_NICHOLSON_CIRCULARSAWALUMINUM2.JPG','','','',1),(24,'Irwin','Circular Saw Blade (Plywood)','',1,'images/IMG_0357_IRWIN_CIRCULARSAWPLYWOOD1.JPG','images/IMG_0358_IRWIN_CIRCULARSAWPLYWOOD2.JPG','','','',1),(25,'John Benzen (Robtol)','Tungsten Carbide Tipped Saw Blade (for Wood)','',1,'images/IMG_0359_JB_ROBTOLSAWBLADEWOOD1.JPG','','','','',1),(26,'John Benzen (Robtol)','Tunsten Carbide Tipped Saw Blade (for Wood)','',1,'images/IMG_0360_JB_ROBTOLSAWBLADEALUMINUM1.JPG','','','','',1),(27,'John Benzen (Robtol)','Diamond Blade','',1,'images/IMG_0361_JB_ROBTOLDIAMONDBLADE1.JPG','','','','',1),(29,'John Dexter','Diamond Blade Turbo (Wet & Dry)','',1,'images/IMG_0362_JOHNDEXTER_DIAMONDBLADETURBO1.JPG','images/IMG_0363_JOHNDEXTER_DIAMONDBLADETURBO2.JPG','','','',1),(30,'Indestro','Diamond Blade Super Thin with Bushing 4\"','',1,'images/IMG_0364_INDESTRO_DIAMONDBLADESUPERTHIN1.JPG','images/IMG_0365_INDESTRO_DIAMONDBLADESUPERTHIN2.JPG','','','',0),(31,'Mitsui','Diamond Blade Super Thin with Bushing 4\"','105 x 7.0 x 2.0 x 1.0 mm\nMax Speed: 1450 RPM\"?]\'',1,'images/IMG_0366_MITSUI_DIAMONDBLADESUPERTHIN1.JPG','images/IMG_0367_MITSUI_DIAMONDBLADESUPERTHIN2.JPG','','','',0),(32,'Sisa','Carborundum Emery Wheel Aluminum Oxide (Square Edge)','',1,'images/IMG_0368_SISA_EMERYWHEELALUMOXIDESQUARE1.JPG','','','','',1),(33,'','Emery Wheel Bushing Set (5/4 x 1-1/4 x 1 x 3/4 x 5/8 x 1/2)','',1,'images/IMG_0374_EMERYWHEELBUSHINGSET1.JPG','images/IMG_0375_EMERYWHEELBUSHINGSET2.JPG','','','',0),(34,'','Carborundum Emery Wheel (Round Edge)','',1,'images/IMG_0376_CARBORUNDUMEMERYWHEELROUNDEDGE.JPG','','','','',1),(35,'','Carborundum Emery Wheel (Square Edge)','',1,'images/IMG_0377_CARBORUNDUMEMERYWHEELSQUAREEDGE.JPG','','','','',1),(36,'Crossman','Mop Disc','',1,'images/IMG_0378_CROSSMANMOPDISC1.JPG','images/IMG_0379_CROSSMANMOPDISC2.JPG','','','',1),(37,'Solinnflex','Flap Disc with Backing Pad','',1,'images/IMG_0380_SOLINNFLEXFLAPDISC1.JPG','images/IMG_0384_SOLINNFLEXFLAPDISC2.JPG','images/IMG_0385_SOLINNFLEXFLAPDISC3.JPG','images/IMG_0389_SOLINNFLEXFLAPDISC4.JPG','',1),(38,'Solinnflex','Flap Wheel Brush 6\" Diameter x 1\"','',1,'images/IMG_0390_SOLINNFLEXFLAPWHEELBRUSH.JPG','','','','',1),(39,'Simond','Diamond Dished Grinding Cup Wheel','',1,'images/IMG_0391_SIMONDDIAMONDDISHEDGRINDINGCUPWHEEL1.JPG','images/IMG_0392_SIMONDDIAMONDDISHEDGRINDINGCUPWHEEL2.JPG','images/IMG_0393_SIMONDDIAMONDDISHEDGRINDINGCUPWHEEL3.JPG','','',1),(40,'Indestro','Diamond Cup Wheel 4\" x 5/8\" CW-9001','',1,'images/IMG_0394_INDESTRODIAMONDCUPWHEEL1.JPG','images/IMG_0395_INDESTRODIAMONDCUPWHEEL2.JPG','','','',0),(41,'Simond','Depressed Center Wheel 1/4\" x 4\" x 5/8\" x 3\" ply','',1,'images/IMG_0396_SIMONDDEPRESSEDCENTERWHEEL1.JPG','images/IMG_0397_SIMONDDEPRESSEDCETNERWHEEL2.JPG','','','',0),(42,'Mitsui','Depressed Center Wheel 1/4\" x 4\" Steel','',1,'images/IMG_0398_MITSUIDEPRESSEDCENTERWHEEL1.JPG','images/IMG_0399_MITSUIDEPRESSEDCENTERWHEEL2.JPG','','','',0),(43,'Kress','Depressed Center Wheel','',1,'images/IMG_0400_KRESSDEPRESSEDCENTERWHEEL1.JPG','images/IMG_0401_KRESSDEPRESSEDCENTERWHEEL2.JPG','','','',1),(44,'John Benzen','Depressed Center Wheel','',1,'images/IMG_0402_JOHNBENZEN_DEPRESSEDCENTERWHEEL1.JPG','images/IMG_0403_JOHNBENZEN_DEPRESSEDCENTERWHEEL2.JPG','','','',1),(45,'Sonnenflex','Depressed Center Wheel','',1,'images/IMG_0404_SONNENFLEX_DEPRESSEDCENTERWHEEL1.JPG','images/IMG_0405_SONNENFLEX_DEPRESSEDCENTERWHEEL2.JPG','','','',1),(46,'Nicholson','Depressed Center Wheel for Grinding Metal','',1,'images/IMG_0407_NICHOLSON_DEPRESSEDCENTERWHEEL1.JPG','images/IMG_0408_NICHOLSON_DEPRESSEDCENTERWHEEL2.JPG','','','',1),(47,'Mitsui','Abrasive Cut-off Wheel/Cutting Wheel (Stainless)','',1,'images/IMG_0409_MITSUI_CUTTINGWHEELSTAINLESS1.JPG','images/IMG_0410_MITSUI_CUTTINGWHEELSTAINLESS2.JPG','','','',0),(48,'Mitsui','Abrasive Cut-off Wheel/Cutting Wheel (Metal)','',1,'images/IMG_0411_MITSUI_CUTTINGWHEELMETAL1.JPG','images/IMG_0412_MITSUI_CUTTINGWHEELMETAL2.JPG','images/IMG_0413_MITSUI_CUTTINGWHEELMETAL3.JPG','images/IMG_0415_MITSUI_CUTTINGWHEELMETAL4.JPG','',1),(49,'Petersen','Diamond Cutting Wheel 4\" Dry','',1,'images/IMG_0416_PETERSEN_DIAMONDCUTTINGWHEELDRY1.JPG','images/IMG_0417_PETERSEN_DIAMONDCUTTINGWHEELDRY2.JPG','','','',1),(50,'Petersen','Diamond Cutting Wheel 4\" Turbo Wet & Dry','',1,'images/IMG_0418_PETERSEN_DIAMONDCUTTINGWHEELTURBO1.JPG','images/IMG_0419_PETERSEN_DIAMONDCUTTINGWHEELTURBO2.JPG','','','',1),(51,'Irwin','Diamond Cutter Wheel Dry (Segmented)','',1,'images/IMG_0420_IRWIN_DIAMONDCUTTERWHEELDRY1.JPG','images/IMG_0421_IRWIN_DIAMONDCUTTERWHEELDRY2.JPG','','','',1),(52,'Mitsui','Cutting Wheel (Steel)','',1,'images/IMG_0423_MITSUI_CUTTINGWHEELSTEEL1.JPG','images/IMG_0424_MITSUI_CUTTINGWHEELSTEEL2.JPG','','','',1),(53,'Solinnflex','Cutting Wheel (Stone)','',1,'images/IMG_0425_SOLINNFLEX_CUTTINGWHEELSTONE1.JPG','images/IMG_0426_SOLINNFLEX_CUTTINGWHEELSTONE2.JPG','','','',1),(54,'Solinnflex (Blue Power)','Cutting Wheel for Stainless','',1,'images/IMG_0427_BLUEPOWER_CUTTINGWHEELSTAINLESS1.JPG','images/IMG_0428_BLUEPOWER_CUTTINGWHEELSTAINLESS2.JPG','','','',1),(55,'Nicholson','Cutting Wheel for Metal','',1,'images/IMG_0429_NICHOLSON_CUTTINGWHEELMETAL1.JPG','images/IMG_0430_NICHOLSON_CUTTINGWHEELMETAL2.JPG','','','',1),(56,'Kress','Cutting Wheel 5\" Stone','',1,'images/IMG_0431_KRESS_CUTTINGWHEELSTONE1.JPG','images/IMG_0432_KRESS_CUTTINGWHEELSTONE2.JPG','','','',0),(57,'Nicholson','Cutting Wheel 4\" for Stainless Steel','',1,'images/IMG_0433_NICHOLSON_CUTTINGWHEELSTAINLESS1.JPG','images/IMG_0434_NICHOLSON_CUTTINGWHEELSTAINLESS2.JPG','','','',0),(58,'Solinnflex','Universal Cutting Wheel for Metal and Stone','',1,'images/IMG_0435_SOLINNFLEXUNIVERSAL_CUTTINGWHEEL1.JPG','images/IMG_0436_SOLINNFLEXUNIVERSAL_CUTTINGWHEEL2.JPG','','','',1),(59,'Solinnflex','Cup Brush (Ordinary)','',1,'images/IMG_0437_SOLINNFLEX_CUPBRUSHORDINARY1.JPG','images/IMG_0438_SOLINNFLEX_CUPBRUSHORDINARY2.JPG','images/IMG_0439_SOLINNFLEX_CUPBRUSHORDINARY3.JPG','','',1),(60,'Solinnflex','Cup Brush (Twisted)','',1,'images/IMG_0440_SOLINNFLEX_CUPBRUSHTWISTED1.JPG','images/IMG_0441_SOLINNFLEX_CUPBRUSHTWISTED2.JPG','images/IMG_0442_SOLINNFLEX_CUPBRUSHTWISTED3.JPG','','',1),(61,'Solinnflex','Wire Wheel Brush (Blue Box)','',1,'images/IMG_0443_SOLINNFLEX_WIREWHEELBRUSHBLUEBOX1.JPG','images/IMG_0444_SOLINNFLEX_WIREWHEELBRUSHBLUEBOX2.JPG','','','',1),(62,'Solinnflex','Wire Wheel Brush (Stainless)','',1,'images/IMG_0445_SOLINNFLEX_WIREWHEELBRUSHSTAINLESS1.JPG','images/IMG_0446_SOLINNFLEX_WIREWHEELBRUSHSTAINLESS2.JPG','','','',1),(63,'Solinnflex','Wire Wheel Brush Twisted','',1,'images/IMG_0447_SOLINNFLEX_WIREWHEELBRUSHTWISTED1.JPG','images/IMG_0448_SOLINNFLEX_WIREWHEELBRUSHTWISTED2.JPG','','','',1),(64,'Solinnflex','Wire Wheel Brush with Arbor','',1,'images/IMG_0450_SOLINNFLEX_WIREWHEELBRUSHWITHARBOR1.JPG','','','','',1),(65,'Solinnflex','Cup Brush with Arbor','',1,'images/IMG_0451_SOLINNFLEX_CUPBRUSHWITHARBOR1.JPG','','','','',1),(66,'Solinnflex','Wire Wheel Brush without Arbor 3\" x 1/2\" 8816','',1,'images/IMG_0452_SOLINNFLEX_WIREWHEELBRUSHWITHOUTARBOR1.JPG','','','','',0),(67,'Solinnflex','5 pcs. Wire Wheel Set (1\", 1-1/2\", 2\", 2-1/2\", 3\") with Detachable Arbor 8801','',1,'images/IMG_0453_SOLINNFLEX_WIREWHEELSET88011.JPG','','','','',0),(68,'Solinnflex','2 pcs. Cup Set (2\", 3\") with Built-in Arbor 9935','',1,'images/IMG_0454_SOLINNFLEX_CUPSET99351.JPG','','','','',0),(69,'Solinnflex','2 pcs. Combination Cup Set (3\" Knotted, 3\" Twisted) with Built-in Arbor 8889','',1,'images/IMG_0455_SOLINNFLEX_COMBINATIONCUPSET88891.JPG','','','','',0);
/*!40000 ALTER TABLE `tbl_products` ENABLE KEYS */;
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
