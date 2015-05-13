DROP TABLE IF EXISTS ranks;

CREATE TABLE ranks(
    id INT(11) NOT NULL AUTO_INCREMENT,
    order_history INT(11) NOT NULL,
    points INT(11) NOT NULL,
    user_id INT(11) NOT NULL,
  CONSTRAINT ranks_pk PRIMARY KEY (id)
);

DROP TABLE IF EXISTS users;

CREATE TABLE users(
    id INT(11) NOT NULL AUTO_INCREMENT,
    name VARCHAR(56),
    pass VARCHAR(56),
  CONSTRAINT users_pk PRIMARY KEY (id)
);
