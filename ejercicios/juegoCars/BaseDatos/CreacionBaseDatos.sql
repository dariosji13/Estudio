/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Daniel
 * Created: Apr 25, 2021
 */
                   
DROP SCHEMA IF EXISTS juego_cars;          
CREATE SCHEMA IF NOT EXISTS juego_cars;
USE juego_cars;
DROP TABLE IF EXISTS historia_podio;
CREATE TABLE IF NOT EXISTS historia_podio (
	id_juego INT NOT NULL AUTO_INCREMENT,
	nombre_jugador varchar(40) NOT NULL,
	cantidad_de_ganados INT NOT NULL,
	CONSTRAINT historia_podio PRIMARY KEY (id_juego)
);
DROP TABLE IF EXISTS judadores;
CREATE TABLE IF NOT EXISTS judadores (
         id_jugador INT NOT NULL AUTO_INCREMENT,
         nombre_jugador varchar(40) NOT NULL,
         CONSTRAINT judadores PRIMARY KEY (id_jugador)
);
DROP TABLE IF EXISTS pista;
CREATE TABLE IF NOT EXISTS pista (
         id_pista INT NOT NULL AUTO_INCREMENT,
         largo_pista INT NOT NULL,
         CONSTRAINT pista PRIMARY KEY (id_pista)
);



/*
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;
*/