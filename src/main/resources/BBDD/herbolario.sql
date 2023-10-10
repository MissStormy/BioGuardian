DROP DATABASE IF EXISTS Herbolario;
CREATE DATABASE Herbolario;
Use Herbolario;


CREATE TABLE PVenenosas(
Id int unsigned auto_increment primary key,
Nombre varchar(50),
Tipo enum('Interior', 'Exterior'),
NLatin varchar(50),
Mortal enum('Si', 'No'),
Imagen varchar(60)

 );
 INSERT INTO PVenenosas  VALUES
 (1,"Amarylis","Interior","Amaryllis","Si","Venenosas/Interior/amaryllis.jpg"),
 (2,"Amoena","Interior","Amoena","Si","Venenosas/Interior/"),
 (3,"Azucena","Interior","Lilium","Si","Venenosas/Interior/"),
 (4,"Caladio","Interior","Caladio","No","Venenosas/Interior/"),
 (5,"Filodendron","Interior","Philodendron","No","Venenosas/Interior/"),
 (6,"Hiedra del Diablo","Interior","Datura stramoniu","Si","Venenosas/Interior/"),
 (7,"Hiedra inglesa","Interior","Hedera helix","Si","Venenosas/Interior/"),
 (8,"Acacia negra","Exterior","Acacia melanoxylon","No","Venenosas/Exterior/"),
 (9,"Acebo","Exterior","Ilex aquifolium","No","Venenosas/Exterior/"),
 (10,"Adelfa","Exterior","Nerium oleander","Si","Venenosas/Exterior/"),
 (11,"Aji","Exterior","Capsicum","No","Venenosas/Exterior/"),
 (12,"Belladona","Exterior","Atropa belladonna","Si","Venenosas/Exterior/");
 
 CREATE TABLE PMedicinales(
 Id int unsigned auto_increment primary key,
 Nombre varchar(50),
 Tipo enum('Interior', 'Exterior'),
 NLatin varchar(50),
 Imagen varchar(60)
 );
 
 INSERT INTO PMedicinales VALUES
 (1, "Lavanda", "Exterior", "Lavandula angustifolia", "Medicinales/Exterior/"),
 (2, "Jengibre", "Exterior", "Zingiber officinale", "Medicinales/Exterior/"),
 (3, "Oregano", "Exterior", "Origanum vulgare", "Medicinales/Exterior/"),
 (4, "Ajo", "Interior", "Allium sativum", "Medicinales/Interior/"),
 (5, "Manzanilla", "Exterior", "Chamaemelum nobile", "Medicinales/Exterior/"),
 (6, "Tomillo", "Exterior", "Thymus vulgaris", "Medicinales/Exterior/"),
 (7, "Mate", "Interior", "Ilex paraguariensis", "Medicinales/Interior/"),
 (8, "Menta poleo", "Interior", "Mentha pulegium", "Medicinales/Interior/"),
 (9, "Ortiga", "Interior", "Urtica dioica", "Medicinales/Interior/"),
 (10, "Ruda", "Exterior", "Ruta graveolens", "Medicinales/Exterior/"),
 (11, "Artemisa", "Interior", "Artemisia vulgaris", "Medicinales/Interior/"),
 (12, "Valeriana", "Interior", "Valeriana officinalis", "Medicinales/Interior/");
 