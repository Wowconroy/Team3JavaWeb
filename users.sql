USE test;

DROP TABLE IF EXISTS user_db;
CREATE TABLE user_db
(
    user_id       SERIAL PRIMARY KEY,
    first_name    VARCHAR(255),
    last_name     VARCHAR(255),
    role_id       BIGINT,
    email         VARCHAR(255),
    password      VARCHAR(255),
    date_of_birth TIMESTAMP WITHOUT TIME ZONE,
    reg_date      TIMESTAMP WITHOUT TIME ZONE
);

ALTER TABLE user_db
    ADD CONSTRAINT FK_USER_DB_ON_ROLE FOREIGN KEY (role_id) REFERENCES role (role_id);

INSERT INTO user_db (first_name, last_name, role_id, email, password, date_of_birth, reg_date)
VALUES
()