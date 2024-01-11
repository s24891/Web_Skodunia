--liquibase formatted sql
--changeset alopalka:1
--comment: 2024-01-10
--dbms: h2

create table cars
(
    id               bigint not null AUTO_INCREMENT,
    make             varchar(255),
    model            varchar(255),
    description      varchar(255),
    manufacture_year integer,
    price_per_day      integer,
    primary key (id)
);
