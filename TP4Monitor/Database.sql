browser
operativeSystem


Create database TP4Database;

USE TP4Database;

CREATE TABLE operativeSystems(
id_op int not null AUTO_INCREMENT,
name varchar(30) not null,
primary key id_op
);

CREATE TABLE browsers(
id_browser int not null AUTO_INCREMENT,
name varchar(30) not null,
primary key(id_browser)
);

CREATE TABLE browserPerOperativeSystem(
fpk_id_opSystem int not null,
fpk_id_browser int not null,
primary key(id_opSystem, id_browser)
);

ALTER TABLE browserPerOperativeSystem ADD CONSTRAINT
		FOREIGN KEY(fpk_id_opSystem) REFERENCES operativeSystems(id_op),
		FOREIGN KEY(fpk_id_browser) REFERENCES browsers(id_browser);

