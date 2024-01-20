--liquibase formatted sql
--changeset alopalka:6
--comment: Create table rentals
--dbms: h2


CREATE TABLE rentals
(
    id        BIGINT AUTO_INCREMENT PRIMARY KEY,
    date_from TIMESTAMP NOT NULL,
    date_to   TIMESTAMP NOT NULL,
    car_id    BIGINT,
    user_id   BIGINT,
    FOREIGN KEY (car_id) REFERENCES cars (id),
    FOREIGN KEY (user_id) REFERENCES users (id)
);
