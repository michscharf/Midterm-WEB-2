CREATE TABLE IF NOT EXISTS car_items (
                                         id INT AUTO_INCREMENT PRIMARY KEY,
                                         car_brand VARCHAR(255) NOT NULL,
    price DOUBLE NOT NULL,
    car_description VARCHAR(255) NOT NULL,
    hyperlink VARCHAR(255) NOT NULL
    );

INSERT INTO car_items (car_brand, price, car_description, hyperlink)
VALUES ('Brand 1', 10000, 'Description 1', 'http://www.example.com/1'),
       ('Brand 2', 20000, 'Description 2', 'http://www.example.com/2'),
       ('Brand 3', 30000, 'Description 3', 'http://www.example.com/3'),
       ('Brand 4', 40000, 'Description 4', 'http://www.example.com/4');
