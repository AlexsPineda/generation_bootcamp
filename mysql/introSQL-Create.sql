-- Crear una base de datos
CREATE DATABASE familia;
-- seleccionar base de datos
USE familia; 
-- crear tabla es necesario tener minimo una columna
-- debemos especificar la lla ve primaria
-- para agregar valores unicos se utiliza unique
CREATE TABLE persona(
    persona_id int AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    correo VARCHAR(255) NOT NULL,
    ead INT NOT NULL,
    estado VARCHAR(255) DEFAULT "Desconocido",
    cumpleanios DATE,
    PRIMARY KEY(persona_id),
    CONSTRAINT correo_unico UNIQUE(correo) 
);



