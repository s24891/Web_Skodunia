--liquibase formatted sql
--changeset alopalka:2
--comment: 2023-01-10

INSERT INTO CAR (id, make, model, year, pricePerDay)
VALUES (1, 'Mercedes', 'S-Class', 2020, 500),
       (2, 'BMW', '7 Series', 2019, 450),
       (3, 'Audi', 'A8', 2021, 480),
       (4, 'Lexus', 'LS', 2018, 430),
       (5, 'Jaguar', 'XJ', 2019, 470),
       (6, 'Porsche', 'Panamera', 2020, 550),
       (7, 'Tesla', 'Model S', 2021, 500),
       (8, 'Maserati', 'Quattroporte', 2019, 520),
       (9, 'Bentley', 'Flying Spur', 2020, 600),
       (10, 'Rolls Royce', 'Phantom', 2021, 700),
       (11, 'Ferrari', 'Portofino', 2018, 650),
       (12, 'Lamborghini', 'Huracan', 2020, 700),
       (13, 'Aston Martin', 'DB11', 2019, 550),
       (14, 'Alfa Romeo', 'Giulia', 2021, 400),
       (15, 'McLaren', 'GT', 2020, 750),
       (16, 'Bugatti', 'Chiron', 2021, 1500),
       (17, 'Koenigsegg', 'Jesko', 2020, 2000),
       (18, 'Pagani', 'Huayra', 2019, 1300),
       (19, 'Lotus', 'Evija', 2021, 950),
       (20, 'Polestar', '1', 2020, 500);
