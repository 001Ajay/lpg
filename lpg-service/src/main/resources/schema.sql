DROP TABLE IF EXISTS categories;

CREATE TABLE categories (
  id INT PRIMARY KEY,
  name VARCHAR(30) NOT NULL
);

DROP TABLE IF EXISTS products;

CREATE TABLE products (
  id INT PRIMARY KEY,
  name VARCHAR(30) NOT NULL,
  description VARCHAR(250) NOT NULL,
  category_id INT NOT NULL,
  creation_date VARCHAR(50) NOT NULL,
  update_date VARCHAR(50) NOT NULL,
  last_purchased VARCHAR(250) DEFAULT NULL
);
