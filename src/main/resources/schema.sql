CREATE DATABASE IF NOT EXISTS carDB;

USE carDB;

CREATE TABLE IF NOT EXISTS car_items (
                                         id INT AUTO_INCREMENT PRIMARY KEY,
                                         car_brand VARCHAR(255) NOT NULL,
    price DOUBLE NOT NULL,
    car_description VARCHAR(255) NOT NULL,
    hyperlink VARCHAR(255) NOT NULL
    );
