CREATE DATABASE  IF NOT EXISTS `time_management_system` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `time_management_system`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: time_management_system
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `tasks`
--

DROP TABLE IF EXISTS `tasks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tasks` (
  `id` varchar(20) NOT NULL,
  `task_name` varchar(50) DEFAULT NULL,
  `description` varchar(100) NOT NULL,
  `assigned_to` int NOT NULL,
  `status` varchar(20) NOT NULL,
  `priority` int NOT NULL,
  `sprint_number` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `assigned_to` (`assigned_to`),
  KEY `sprint_id` (`sprint_number`),
  CONSTRAINT `tasks_ibfk_1` FOREIGN KEY (`assigned_to`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tasks`
--

LOCK TABLES `tasks` WRITE;
/*!40000 ALTER TABLE `tasks` DISABLE KEYS */;
INSERT INTO `tasks` VALUES ('1','UI design','designing the UI/UX ',2,'In Progress',2,11),('10','Final test run','testing the final product',5,'To do',6,23),('11','Design ER diagram','Designing the ER diagram in mysql workbench',2,'Done',1,31),('12','Design UI/UX','Designing the UI/UX design  ',3,'Done',2,31),('13','Connection to database','Using mysql connector to connect the project to database',2,'Done',3,32),('14','Code Developement for insertion and deletion','Writing code for inserting and deleting data',3,'Done',4,32),('15','Code Development for displaying needed data','Writing code for displaying the data that we need',2,'Done',5,33),('16','Testing and debugging','Testing for errors and debugging the errors occured',3,'Done',6,33),('17','Project Setup and Package structure','setting up project and defining package structure',4,'Done',1,41),('18','Designing the ER diagram and UI design','Designing ER diagram and UI designing',5,'Done',2,41),('19','Code Developement ','Writing code for implementing all functionalities',4,'Done',3,42),('2','Backend functionality','implementing backend operations',3,'In Progress',1,11),('20','Testing and debugging','Testing for errrors and debuggin them',1,'Done',4,42),('21','Designing UI design in figma','Designing UI design for the website',1,'Done',1,51),('22','Project Setup using React framework','Setting a empty react project and install dependencies',1,'Done',2,51),('23','Development ','Writing code for implementing the UI design onto a webpage',1,'Done',3,52),('24','Deployement','Deploying the project using web hosting infrastructre like netlify',1,'Done',4,52),('3','Connection to database','connecting database to backend',2,'To do',3,12),('4','Deployment','deploying the site to internet',3,'To do',4,12),('5','Game Character Design','designing characters',1,'In Progress',1,21),('6','Background Design','designing the 3D background',4,'In Progress',2,21),('7','Character sprite animation','creating sprite animation for character movement',5,'To do',3,22),('8','Action Scripting','writing c# script for actions',4,'To do',4,22),('9','Connecting objects to C# script','connecting the C# scripts to game objects',1,'To do',5,23);
/*!40000 ALTER TABLE `tasks` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-07 11:35:17
