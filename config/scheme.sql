-- tabla users
DROP TABLE IF EXISTS users;

CREATE TABLE users(
    id INT(11) NOT NULL AUTO_INCREMENT,
    name VARCHAR(56),
    pass VARCHAR(56),
  CONSTRAINT users_pk PRIMARY KEY (id)
);

-- tabla ranks un user tiene muchos ranks
DROP TABLE IF EXISTS ranks;

CREATE TABLE ranks(
    id INT(11) NOT NULL AUTO_INCREMENT,
    order_history INT(11) NOT NULL,
    points INT(11) NOT NULL,
    user_id INT(11) NOT NULL,
  CONSTRAINT ranks_pk PRIMARY KEY (id)
);

-- tabla grids
DROP TABLE IF EXISTS grids;

CREATE TABLE grids(
    id INT(11) NOT NULL AUTO_INCREMENT,
    rows INT(11) NOT NULL,
    columns INT(11) NOT NULL,
  CONSTRAINT grids_pk PRIMARY KEY (id)
);

-- tabla relacion muchos users (en nuestro caso 2) tienen muchos grids
DROP TABLE IF EXISTS grids_users;

CREATE TABLE grids_users(
    id INT(11) NOT NULL AUTO_INCREMENT,
    grid_id INT(11) NOT NULL,
    user_id INT(11) NOT NULL,
  CONSTRAINT grids_users_pk PRIMARY KEY (id)
);

-- tabla cells un grid tiene muchos cells
DROP TABLE IF EXISTS cells;

CREATE TABLE cells(
    id INT(11) NOT NULL AUTO_INCREMENT,
    x INT(11) NOT NULL,
    y INT(11) NOT NULL,
    state INT(11) NOT NULL,
    grid_id INT(11) NOT NULL,
  CONSTRAINT cells_pk PRIMARY KEY (id)
);
