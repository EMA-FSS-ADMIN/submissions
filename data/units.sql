CREATE TABLE unit(
        id SERIAL UNIQUE PRIMARY KEY NOT NULL, 
        name VARCHAR(255) NOT NULL, 
        abbreviation VARCHAR(255) NOT NULL,
        version integer NOT NULL);