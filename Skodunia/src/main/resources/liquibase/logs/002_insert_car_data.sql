--liquibase formatted sql
--changeset alopalka:2
--comment: 2024-01-10
--dbms: h2

insert into cars (id, make, model, description, manufacture_year, price_per_day)
values (1, 'Mercedes', 'S-Class', 'Opis Mercedesa', 2020, 500),
       (2, 'BMW', '7 Series', 'Opis BMW', 2019, 450),
       (3, 'Audi', 'A8', 'Opis Audi', 2021, 480),
       (4, 'Lexus', 'LS', 'Opis Lexusa', 2018, 430),
       (5, 'Jaguar', 'XJ', 'Opis Jaguara', 2019, 470),
       (6, 'Porsche', 'Panamera', 'Opis Porsche', 2020, 550),
       (7, 'Tesla', 'Model S', 'Opis Tesli', 2021, 500),
       (8, 'Maserati', 'Quattroporte', 'Opis Maserati', 2019, 520),
       (9, 'Bentley', 'Flying Spur', 'Opis Bentleya', 2020, 600),
       (10, 'Rolls Royce', 'Phantom', 'Opis Rolls Royce', 2021, 700),
       (11, 'Ferrari', 'Portofino', 'Opis Ferrari', 2018, 650),
       (12, 'Lamborghini', 'Huracan', 'Opis Lamborghini', 2020, 700),
       (13, 'Aston Martin', 'DB11', 'Opis Aston Martina', 2019, 550),
       (14, 'Alfa Romeo', 'Giulia', 'Opis Alfy Romeo', 2021, 400),
       (15, 'McLaren', 'GT', 'Opis McLarena', 2020, 750),
       (16, 'Bugatti', 'Chiron', 'Opis Bugatti', 2021, 1500),
       (17, 'Koenigsegg', 'Jesko', 'Opis Koenigsegga', 2020, 2000),
       (18, 'Pagani', 'Huayra', 'Opis Paganiego', 2019, 1300),
       (19, 'Lotus', 'Evija', 'Opis Lotusa', 2021, 950),
       (20, 'Polestar', '1', 'Opis Polestara', 2020, 500);

