-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema kommunevalg
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema kommunevalg
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `kommunevalg` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `kommunevalg` ;

-- -----------------------------------------------------
-- Table `kommunevalg`.`party`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `kommunevalg`.`party` (
                                                     `id` INT NOT NULL,
                                                     `party` VARCHAR(225) NULL DEFAULT NULL,
    PRIMARY KEY (`id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `kommunevalg`.`candidate`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `kommunevalg`.`candidate` (
                                                         `id` INT NOT NULL AUTO_INCREMENT,
                                                         `first_Name` VARCHAR(225) NULL DEFAULT NULL,
    `last_Name` VARCHAR(225) NULL DEFAULT NULL,
    `party_id` INT NULL DEFAULT NULL,
    PRIMARY KEY (`id`),
    INDEX `party_id_idx` (`party_id` ASC) VISIBLE,
    CONSTRAINT `party_id`
    FOREIGN KEY (`party_id`)
    REFERENCES `kommunevalg`.`party` (`id`))
    ENGINE = InnoDB
    AUTO_INCREMENT = 45
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `kommunevalg`.`votingresults`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `kommunevalg`.`votingresults` (
                                                             `id` INT NOT NULL,
                                                             `party` VARCHAR(225) NULL DEFAULT NULL,
    `votes` VARCHAR(225) NULL DEFAULT NULL,
    PRIMARY KEY (`id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
