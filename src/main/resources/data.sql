INSERT INTO CATEGORY(id, name) VALUES (1, 'Eurogames');
INSERT INTO CATEGORY(id, name) VALUES (2, 'Ameritrash');
INSERT INTO CATEGORY(id, name) VALUES (3, 'Familiar');

INSERT INTO AUTHOR(id, name, nationality) VALUES (1, 'Alan R. Moon', 'US');
INSERT INTO AUTHOR(id, name, nationality) VALUES (2, 'Vital Lacerda', 'PT');
INSERT INTO AUTHOR(id, name, nationality) VALUES (3, 'Simone Luciani', 'IT');
INSERT INTO AUTHOR(id, name, nationality) VALUES (4, 'Perepau Llistosella', 'ES');
INSERT INTO AUTHOR(id, name, nationality) VALUES (5, 'Michael Kiesling', 'DE');
INSERT INTO AUTHOR(id, name, nationality) VALUES (6, 'Phil Walker-Harding', 'US');

INSERT INTO GAME(id, title, age, category_id, author_id) VALUES (1, 'On Mars', '14', 1, 2);
INSERT INTO GAME(id, title, age, category_id, author_id) VALUES (2, 'Aventureros al tren', '8', 3, 1);
INSERT INTO GAME(id, title, age, category_id, author_id) VALUES (3, '1920: Wall Street', '12', 1, 4);
INSERT INTO GAME(id, title, age, category_id, author_id) VALUES (4, 'Barrage', '14', 1, 3);
INSERT INTO GAME(id, title, age, category_id, author_id) VALUES (5, 'Los viajes de Marco Polo', '12', 1, 3);
INSERT INTO GAME(id, title, age, category_id, author_id) VALUES (6, 'Azul', '8', 3, 5);

INSERT INTO CLIENT(id, name) VALUES (1, 'Cliente 1');
INSERT INTO CLIENT(id, name) VALUES (2, 'Cliente 2');
INSERT INTO CLIENT(id, name) VALUES (3, 'Cliente 3');
INSERT INTO CLIENT(id, name) VALUES (4, 'Cliente 4');
INSERT INTO CLIENT(id, name) VALUES (5, 'Cliente 5');

INSERT INTO PRESTAMO(id, title, client, prestamo_date, dev_date) VALUES (1, 'Juego 1', 'CLIENTE 1', '2022-01-01', '2022-01-01');
INSERT INTO PRESTAMO(id, title, client, prestamo_date, dev_date) VALUES (2, 'Juego 2', 'CLIENTE 2', '2022-01-01', '2022-01-01');
INSERT INTO PRESTAMO(id, title, client, prestamo_date, dev_date) VALUES (3, 'Juego 3', 'CLIENTE 3', '2022-01-01', '2022-01-01');
INSERT INTO PRESTAMO(id, title, client, prestamo_date, dev_date) VALUES (4, 'Juego 4', 'CLIENTE 4', '2022-01-01', '2022-01-01');
INSERT INTO PRESTAMO(id, title, client, prestamo_date, dev_date) VALUES (5, 'Juego 5', 'CLIENTE 5', '2022-01-01', '2022-01-01');