CREATE TABLE IF NOT EXISTS users (
                      id int auto_increment PRIMARY KEY,
                       user_id VARCHAR(255) NOT NULL,
                       first_name VARCHAR(255) NOT NULL,
                       last_name VARCHAR(255) NOT NULL,
                       email VARCHAR(255) NOT NULL,
                       password VARCHAR(255) NOT NULL
);
