use userdb;

CREATE TABLE users
(
    id       INT PRIMARY KEY AUTO_INCREMENT,
    first_name    VARCHAR(30) NOT NULL,
    last_name    VARCHAR(30) NOT NULL,
    login    VARCHAR(30) NOT NULL UNIQUE,
    password VARCHAR(30) NOT NULL

);