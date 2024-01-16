--liquibase formatted sql
--changeset alopalka:4
--comment: Create table roles
--dbms: h2

CREATE TABLE roles
(
    id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE
);
