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
DROP TABLE IF EXISTS jugadores;
CREATE TABLE IF NOT EXISTS jugadores (
         id_jugador INT NOT NULL AUTO_INCREMENT,
         nombre_jugador varchar(40) NOT NULL, 
         color_carro varchar (40) NOT NULL,
         PRIMARY KEY (id_jugador,nombre_jugador ),
         UNIQUE (nombre_jugador)
);
DROP TABLE IF EXISTS historia_podio;
CREATE TABLE IF NOT EXISTS historia_podio (
	id_juego INT NOT NULL AUTO_INCREMENT,
	nombre_jugador varchar(40) NOT NULL,
	cantidad_de_ganados INT NOT NULL,
        PRIMARY KEY (id_juego),
        CONSTRAINT FOREIGN KEY  (nombre_jugador) REFERENCES jugadores (nombre_jugador) 
);
DROP TABLE IF EXISTS pista;
CREATE TABLE IF NOT EXISTS pista (
	nombre_jugador varchar(40) NOT NULL,
        carril INT NOT NULL,
        lardo_Pista_Metros DOUBLE NOT NULL,
        distancia_avanzada_metros DOUBLE NOT NULL,
        distancia_faltante_metros DOUBLE NOT NULL,
        PRIMARY KEY (nombre_jugador),
	CONSTRAINT FOREIGN KEY  (nombre_jugador) REFERENCES jugadores (nombre_jugador) 
);





/*
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;
*/