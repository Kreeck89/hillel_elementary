CREATE TABLE accounts (
id serial CONSTRAINT pk_id primary key,
email varchar NOT NULL CONSTRAINT uniq_email UNIQUE,
password varchar(16) NOT NULL,
subs_id int
);

CREATE TABLE subs (
id serial CONSTRAINT pk_subs_id primary key,
name varchar(20) NOT NULL CONSTRAINT uniq_name UNIQUE,
description text NOT NULL
);
