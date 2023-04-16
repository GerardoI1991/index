-- MySQL Script generated by MySQL Workbench
-- Sun Apr 16 19:29:21 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema qatar2022
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema qatar2022
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `qatar2022` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `qatar2022` ;

-- -----------------------------------------------------
-- Table `qatar2022`.`departamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `qatar2022`.`departamento` (
  `DepNro` INT NOT NULL,
  `DepNom` VARCHAR(30) NOT NULL,
  `DepPres` INT NOT NULL,
  PRIMARY KEY (`DepNro`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `qatar2022`.`empleados`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `qatar2022`.`empleados` (
  `EmpDni` INT NOT NULL,
  `EmpNom` VARCHAR(30) NOT NULL,
  `EmpApe` VARCHAR(30) NOT NULL,
  `EmpNac` VARCHAR(30) NOT NULL,
  `EmpDep` INT NULL DEFAULT NULL,
  PRIMARY KEY (`EmpDni`),
  INDEX `EmpDep` (`EmpDep` ASC) VISIBLE,
  CONSTRAINT `empleados_ibfk_1`
    FOREIGN KEY (`EmpDep`)
    REFERENCES `qatar2022`.`departamento` (`DepNro`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;