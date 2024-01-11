--liquibase formatted sql
--changeset alopalka:3
--comment: 2024-01-10
--dbms: h2

create table images
(
    id      BIGINT AUTO_INCREMENT PRIMARY KEY,
    car_id  BIGINT,
    content BLOB,
    name    VARCHAR(255),
    FOREIGN KEY (car_id) REFERENCES cars (id)
);

