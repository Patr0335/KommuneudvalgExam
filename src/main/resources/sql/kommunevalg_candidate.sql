-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: kommunevalg
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `candidate`
--

DROP TABLE IF EXISTS `candidate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `candidate` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_Name` varchar(225) DEFAULT NULL,
  `last_Name` varchar(225) DEFAULT NULL,
  `party_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `party_id_idx` (`party_id`),
  CONSTRAINT `party_id` FOREIGN KEY (`party_id`) REFERENCES `party` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `candidate`
--

LOCK TABLES `candidate` WRITE;
/*!40000 ALTER TABLE `candidate` DISABLE KEYS */;
INSERT INTO `candidate` VALUES (12,'Marcel ','Meijer',1),(13,'Michael','Kristensen',1),(14,'Helle','Hansen',1),(15,'Karina','Knobelauch',1),(16,'Stefan','Hafstein Wolffbrandt',1),(17,'Robert','V. Rasmussen',1),(18,'Pia','Ramsing',1),(19,'Anders','Baun Sørensen',1),(20,'Per ','Urban Olsen',2),(21,'Peter','Askjær',2),(22,'Martin','Sørensen',2),(23,'Louise','Bramstorp',2),(24,'Sigfred','Jensen',2),(25,'Jørn','C. Nissen',2),(26,'Morten','Ø. Kristensen',2),(27,'Susanne','Andersen',2),(28,'Iulian','V. Paiu',2),(29,'Ulla','Holm',3),(30,'Kjeld','Bønkel',3),(31,'Anne','Grethe Olsen',3),(32,'Lone','Krag',3),(33,'Børge','S. Buur',3),(34,'Per','Mortensen',4),(35,'Søren','Wiese',5),(36,'Anita','Elgaard Højholt Olesen',5),(37,'Carsten','Bruun',5),(38,'Mogens','Exner',5),(39,'Anja','Guldborg',5),(40,'Klaus','Holdorf',5),(41,'Katrine','Høegh Mc Quaid',6),(42,'Jette','M. Søgaard',6),(43,'Pia','Birkmand',6);
/*!40000 ALTER TABLE `candidate` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-20 18:59:26
