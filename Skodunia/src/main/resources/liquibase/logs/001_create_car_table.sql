--liquibase formatted sql
--changeset alopalka:1
--comment: 2024-01-10

CREATE TABLE CAR
(
    id          INT PRIMARY KEY NOT NULL,
    make        TEXT,
    model       TEXT,
    year        INT,
    pricePerDay INT
);
