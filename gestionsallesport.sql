CREATE DATABASE gestionsallesport;
use gestionsallesport;

CREATE TABLE membre (
    idMembre INT PRIMARY KEY,         
    nom VARCHAR(20),
    dateNaissance DATE,
    sportPratique VARCHAR(20)
);

CREATE TABLE entraineur (
    idEntraineur INT PRIMARY KEY,     
    nom VARCHAR(20),
    specialite VARCHAR(20)
);

CREATE TABLE seance (
    idMembre INT, 
    idEntraineur INT,
    dateHeure DATETIME,
    FOREIGN KEY (idMembre) REFERENCES membre(idMembre),    
    FOREIGN KEY (idEntraineur) REFERENCES entraineur(idEntraineur) 
);


