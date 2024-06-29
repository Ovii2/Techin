
CREATE  TABLE MOKINIAI(
    ID INT NOT NULL,
    ASMENS_KODAS BIGINT NOT NULL,
    VARDAS VARCHAR(40),
    PAVARDE VARCHAR(40),
    GIMIMO_DATA DATE,
    SPECIALYBE VARCHAR(40),
    IMONES_KODAS INT
);         
INSERT INTO MOKINIAI(ID, ASMENS_KODAS, VARDAS, PAVARDE, GIMIMO_DATA, SPECIALYBE, IMONES_KODAS) VALUES
(1, 36521489520, 'Petras', 'Jonaitis', DATE '1991-08-15', 'Programuotojas', 1),
(2, 38541238521, 'Tomas', 'Jonaitis', DATE '1989-11-12', 'Testuotojas', 3),
(3, 4582135956, 'Rita', ('Jonaityte'), DATE '1980-09-24', 'Testuotojas', 2),
(4, 36584120583, 'Tomas', ('Uzkepalis'), DATE '1993-12-02', 'Programuotojas', 1),
(5, 40512560890, 'Galina', 'Ivanos', DATE '1985-01-08', 'Testuotojas', 2),
(6, 32350120580, 'Jouzas', ('Kaseta'), DATE '1995-10-24', 'Programuotojas', NULL),
(7, 40216305874, ('Urte'), ('Zirniauskiene'), DATE '1984-09-05', 'Testuotojas', NULL);    
CREATE  TABLE IMONES(
    ID INT NOT NULL,
    PAVADINIMAS VARCHAR(40),
    ADRESAS VARCHAR(50)
);
INSERT INTO IMONES(ID, PAVADINIMAS, ADRESAS) VALUES
(1, 'EisGroup Lietuva', 'Tentoji g.6'),
(2, 'Tieto', 'Tenanoji g.8'),
(3, 'Forbis', 'Vataita g.20');
CREATE  TABLE PAZYMIAI(
    MOKINIO_ID INT NOT NULL,
    MODULIO_ID INT NOT NULL,
    PAZYMYS INT
);              

INSERT INTO PAZYMIAI(MOKINIO_ID, MODULIO_ID, PAZYMYS) VALUES
(1, 1, 8),
(1, 2, 9),
(2, 1, 7),
(2, 2, 10),
(5, 1, 10),
(5, 2, 7),
(6, 2, 7),
(7, 1, 6),
(7, 2, 5),
(4, 1, 8),
(4, 2, 7),
(3, 1, 9),
(3, 2, 10);          
CREATE  TABLE MODULIAI(
    MODULIO_KODAS INT NOT NULL,
    PAVADINIMAS VARCHAR(40),
    VALANDU_SK INT
);        
INSERT INTO MODULIAI(MODULIO_KODAS, PAVADINIMAS, VALANDU_SK) VALUES
(1, 'JAVA pagrindai', 180),
(2, 'RDBVS', 40);       
