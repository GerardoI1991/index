-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema consultorioclinicadelsol
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema consultorioclinicadelsol
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `consultorioclinicadelsol` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `consultorioclinicadelsol` ;

-- -----------------------------------------------------
-- Table `consultorioclinicadelsol`.`pacientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `consultorioclinicadelsol`.`pacientes` (
  `PacDNI` INT NOT NULL,
  `PacNom` VARCHAR(45) NOT NULL,
  `PacDom` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`PacDNI`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `consultorioclinicadelsol`.`medicos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `consultorioclinicadelsol`.`medicos` (
  `MedMat` INT NOT NULL,
  `MedNom` VARCHAR(45) NOT NULL,
  `MedEsp` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`MedMat`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `consultorioclinicadelsol`.`historiaclinica`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `consultorioclinicadelsol`.`historiaclinica` (
  `HCNum` INT NOT NULL,
  `HCFec` DATE NOT NULL,
  `HCPacDNI` INT NOT NULL,
  `HCMedMat` INT NOT NULL,
  `HCTrat` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`HCNum`),
  INDEX `HCPacDNI` (`HCPacDNI` ASC) VISIBLE,
  INDEX `HCMedMat` (`HCMedMat` ASC) VISIBLE,
  CONSTRAINT `historiaclinica_ibfk_1`
    FOREIGN KEY (`HCPacDNI`)
    REFERENCES `consultorioclinicadelsol`.`pacientes` (`PacDNI`),
  CONSTRAINT `historiaclinica_ibfk_2`
    FOREIGN KEY (`HCMedMat`)
    REFERENCES `consultorioclinicadelsol`.`medicos` (`MedMat`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
