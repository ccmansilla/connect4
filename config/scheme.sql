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
  game_id INT(11) NOT NULL,
  CONSTRAINT grids_pk PRIMARY KEY (id)
);

-- tabla cells un grid tiene muchos cells
DROP TABLE IF EXISTS cells;
CREATE TABLE cells(
  id INT(11) NOT NULL AUTO_INCREMENT,
  row INT(11) NOT NULL,
  col INT(11) NOT NULL,
  user_id INT(11)NOT NULL,
  grid_id INT(11)NOT NULL,
  CONSTRAINT cells_pk PRIMARY KEY (id)
);

DROP TABLE IF EXISTS games;
CREATE TABLE games(
	id INT(11) NOT NULL AUTO_INCREMENT,
  CONSTRAINT games_id primary key (id)
);

DROP TABLE IF EXISTS games_users;
CREATE TABLE games_users(
  id INT(11) NOT NULL AUTO_INCREMENT,
	game_id INT(11) NOT NULL,
	user_id INT(11) NOT NULL,
  CONSTRAINT games_users_id PRIMARY KEY (id)
);
