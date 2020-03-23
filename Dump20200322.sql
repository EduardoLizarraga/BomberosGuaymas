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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblestacion`
--

LOCK TABLES `tblestacion` WRITE;
/*!40000 ALTER TABLE `tblestacion` DISABLE KEYS */;
INSERT INTO `tblestacion` VALUES (1,'Centro','Por donde están unos dogos mamalones krnal'),(2,'Sur','hnhnh'),(3,'Norte','Por donde están unos dogos mamalones krnal'),(5,'klklk','klkljl');
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
  `idUnidad` int(11) DEFAULT NULL,
  `idBombero` int(11) DEFAULT NULL,
  `descripcionIncendio` varchar(80) DEFAULT NULL,
  `tipoApoyo` enum('AMBULANCIA','POLICIAM','POLICIAF') DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idUnidad_idx` (`idUnidad`),
  KEY `idBombero_idx` (`idBombero`),
  CONSTRAINT `idBombero` FOREIGN KEY (`idBombero`) REFERENCES `tblpersonal` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idUnidad` FOREIGN KEY (`idUnidad`) REFERENCES `tblunidad` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblincendio`
--

LOCK TABLES `tblincendio` WRITE;
/*!40000 ALTER TABLE `tblincendio` DISABLE KEYS */;
INSERT INTO `tblincendio` VALUES (20,'VEHICULO','2020-03-22','cccccccccccccc','23232','sssssssssssssss','eeeeeeeeeeee',1,1,'ffffffffffffffffff','AMBULANCIA'),(21,'VEHICULO','2020-03-22','poipipiopoi','777777777777777','khuhiuhiuh','iuioiou',1,1,'iuuhiuiu','AMBULANCIA'),(22,'VEHICULO','2020-03-22','kakkakaak','23232323','jejjejejej','',1,1,'r4r4r4r','AMBULANCIA');
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
  PRIMARY KEY (`id`),
  KEY `idEstacion_idx` (`idEstacion`),
  CONSTRAINT `idEstacion` FOREIGN KEY (`idEstacion`) REFERENCES `tblestacion` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblpersonal`
--

LOCK TABLES `tblpersonal` WRITE;
/*!40000 ALTER TABLE `tblpersonal` DISABLE KEYS */;
INSERT INTO `tblpersonal` VALUES (1,'erewr','rert','DIRECTOR',1),(2,'Miguel','Torres','DIRECTOR',1),(3,'Juanito ','Bombero','SUPERVISOR',1),(4,'kmmioio','moimio','BOMBERO',1),(16,'ojuuin','iuniuin','BOMBERO',1),(17,'ojuuin','iuniuin','BOMBERO',1),(18,'kemonito','hiuhi','BOMBERO',1),(19,'kjnnkj','jknkjn','BOMBERO',1),(20,'eded','eded','SUPERVISOR',1),(21,'uhuhuhuhu','huhuhu','DIRECTOR',1),(22,'kemonote','perro','DIRECTOR',1),(23,'kemonote','perro','DIRECTOR',1),(24,'kemonote','perro','SUPERVISOR',1),(25,'kemonote','perro','SUPERVISOR',1),(26,'kemonote','perro','SUPERVISOR',1),(27,'kemonote','perro','DIRECTOR',1),(28,'kemonote','perro','DIRECTOR',1),(29,'jedjed','jjji','BOMBERO',1),(30,'eded','eede','BOMBERO',1),(31,'eded','eede','BOMBERO',1),(32,'juas','eede','BOMBERO',1),(33,'juas','eede','DIRECTOR',1),(34,'juas','eede','SUPERVISOR',1),(35,'monchis','giuigugyu','SUPERVISOR',1),(36,'goku','kakaroto','BOMBERO',1),(37,'goku','kakaroto','SUPERVISOR',1),(38,'jkjkjh','iuhiuhh','SUPERVISOR',1),(39,'tfyuguiiu','piopi','DIRECTOR',1),(40,'kakakaka','kakakaka','BOMBERO',1),(41,'hhi','hkjjk','DIRECTOR',3),(42,'hhi','hkjjk','DIRECTOR',3),(43,'kakak','ksksks','DIRECTOR',3),(44,'kakak','ksksks','DIRECTOR',2),(46,'frfrfrfrffrf','frfrf','DIRECTOR',5),(47,'frfrfrfrffrf','frfrf','DIRECTOR',5),(48,'frfrfrfrffrf','frfrf','DIRECTOR',5),(49,'frfrfrfrffrf','frfrf','DIRECTOR',5),(50,'frfrfrfrffrf','frfrf','DIRECTOR',5),(51,'frfrfrfrffrf','frfrf','DIRECTOR',5),(52,'frfrfrfrffrf','frfrf','DIRECTOR',5),(53,'frfrfrfrffrf','frfrf','DIRECTOR',5),(54,'frfrfrfrffrf','frfrf','DIRECTOR',5),(55,'frfrfrfrffrf','frfrf','DIRECTOR',5),(56,'frfrfrfrffrf','frfrf','DIRECTOR',5),(57,'frfrfrfrffrf','frfrf','DIRECTOR',5),(58,'frfrfrfrffrf','frfrf','DIRECTOR',5),(59,'hhhhhhhh','hhhhhhhhhh','DIRECTOR',5),(60,'hhhhhhhh','hhhhhhhhhh','DIRECTOR',5),(63,'ggggggggggg','ggggggg','DIRECTOR',1),(64,'ggggggggggg','ggggggg','BOMBERO',1),(65,'ggggggggggg','ggggggg','BOMBERO',3);
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblunidad`
--

LOCK TABLES `tblunidad` WRITE;
/*!40000 ALTER TABLE `tblunidad` DISABLE KEYS */;
INSERT INTO `tblunidad` VALUES (1,2);
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

-- Dump completed on 2020-03-22 20:32:13
