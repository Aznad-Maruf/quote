CREATE TABLE quote (
    id SERIAL PRIMARY KEY,
    author VARCHAR(255),
    content VARCHAR(500) NOT NULL
);