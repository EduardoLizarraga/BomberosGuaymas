-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: bomberosguaymasdb
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tblestacion`
--

DROP TABLE IF EXISTS `tblestacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblestacion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombreEstacion` varchar(45) DEFAULT NULL,
  `domicilioEstacion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblestacion`
--

LOCK TABLES `tblestacion` WRITE;
/*!40000 ALTER TABLE `tblestacion` DISABLE KEYS */;
INSERT INTO `tblestacion` VALUES (1,'Centro','Por donde están unos dogos mamalones krnal'),(2,'Sur','hnhnh'),(3,'Norte','Por donde están unos dogos mamalones krnal');
/*!40000 ALTER TABLE `tblestacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblincendio`
--

DROP TABLE IF EXISTS `tblincendio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblincendio` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipoIncendio` enum('CASA','VEHICULO','NEGOCIO','MALEZA') DEFAULT NULL,
  `fechaIncendio` date DEFAULT NULL,
  `direccionIncendio` varchar(45) DEFAULT NULL,
  `reportanteIncendio` varchar(45) DEFAULT NULL,
  `danoIncendio` varchar(45) DEFAULT NULL,
  `herramientaIncendio` varchar(45) DEFAULT NULL,
  `numUnidad` int(11) DEFAULT NULL,
  `nombreOperador` varchar(45) DEFAULT NULL,
  `descripcionIncendio` varchar(80) DEFAULT NULL,
  `tipoApoyo` enum('AMBULANCIA','POLICIAM','POLICIAF') DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblincendio`
--

LOCK TABLES `tblincendio` WRITE;
/*!40000 ALTER TABLE `tblincendio` DISABLE KEYS */;
INSERT INTO `tblincendio` VALUES (32,'NEGOCIO','2020-05-09','Guaymas Norte','6221083815','Se quemó un carrito de dogos','agua jeje',3,'92','Se controló la emergencia','POLICIAM'),(33,'CASA','2020-05-09','Gentro','6221083815','Se quemó una casita','agua jeje',3,'92','Se controló la emergencia','AMBULANCIA'),(34,'VEHICULO','2020-05-09','Gentro','6221083815','Se quemó un carro','agua jeje',3,'92','Se controló la emergencia','AMBULANCIA'),(35,'VEHICULO','2020-05-09','Gentro','6221083815','Se quemó un carro','agua jeje',3,'92','Se controló la emergencia','AMBULANCIA'),(36,'VEHICULO','2020-05-09','Gentro','6221083815','Se quemó un carro','agua jeje',3,'92','Se controló la emergencia','AMBULANCIA'),(37,'VEHICULO','2020-05-09','Gentro','6221083815','Se quemó un carro','agua jeje',3,'92','Se controló la emergencia','AMBULANCIA'),(38,'CASA','2020-05-09','Gentro','6221083815','casa','agua jeje',3,'92','Se controló la emergencia','AMBULANCIA'),(39,'CASA','2020-05-09','Gentro','6221083815','casa','agua jeje',3,'92','Se controló la emergencia','AMBULANCIA'),(40,'CASA','2020-05-09','Gentro','6221083815','casa','agua jeje',3,'92','Se controló la emergencia','AMBULANCIA'),(41,'CASA','2020-05-09','Gentro','6221083815','casa','agua jeje',3,'92','Se controló la emergencia','AMBULANCIA'),(42,'MALEZA','2020-05-09','errerf','FEFRE34343','erferrerer','ewdwed',7,'3','dwwdew','POLICIAM'),(44,'CASA','2020-07-20','FF','43434343','ERTRGWFFRFR','FRFRFRSFR',3,'2','RFRFRFRFRF','POLICIAM'),(45,'VEHICULO','2020-05-09','d6t6','56565656','6f6f6f','5656',1,'2','5656','POLICIAM'),(46,'VEHICULO','2020-05-09','liugliugiul','76576575','iohiuhhu','liuyliu',5,'92','kukyrt7t','POLICIAM'),(47,'NEGOCIO','2020-05-11','deeddededd','2323','edede','eded',3,'Lizarraga','ededed','POLICIAM'),(48,'NEGOCIO','2020-05-11','deeddededd','2323','edede','eded',3,'Mitotes','ededed','POLICIAM');
/*!40000 ALTER TABLE `tblincendio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblpersonal`
--

DROP TABLE IF EXISTS `tblpersonal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblpersonal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombrePersonal` varchar(45) NOT NULL,
  `apellidoPersonal` varchar(45) NOT NULL,
  `tipoPersonal` enum('DIRECTOR','SUPERVISOR','BOMBERO') DEFAULT NULL,
  `idEstacion` int(11) DEFAULT NULL,
  `numPersonal` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idEstacion_idx` (`idEstacion`),
  CONSTRAINT `idEstacion` FOREIGN KEY (`idEstacion`) REFERENCES `tblestacion` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblpersonal`
--

LOCK TABLES `tblpersonal` WRITE;
/*!40000 ALTER TABLE `tblpersonal` DISABLE KEYS */;
INSERT INTO `tblpersonal` VALUES (2,'Miguel','Torres','DIRECTOR',1,1),(92,'Eduardo','Lizarraga','BOMBERO',3,3),(107,'Pablo','Tigre','SUPERVISOR',2,4),(125,'Pedro','Ramirez','BOMBERO',2,7),(126,'Ramon','Castro','BOMBERO',2,8);
/*!40000 ALTER TABLE `tblpersonal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblunidad`
--

DROP TABLE IF EXISTS `tblunidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblunidad` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `numeroUnidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblunidad`
--

LOCK TABLES `tblunidad` WRITE;
/*!40000 ALTER TABLE `tblunidad` DISABLE KEYS */;
INSERT INTO `tblunidad` VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,8);
/*!40000 ALTER TABLE `tblunidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bomberosguaymasdb'
--

--
-- Dumping routines for database 'bomberosguaymasdb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-11 22:50:21
