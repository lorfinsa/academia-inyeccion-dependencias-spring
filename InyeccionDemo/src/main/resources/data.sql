INSERT INTO rol 
(id, descripcion)
VALUES
(1, 'Administrador'),
(2, 'Operador');

INSERT INTO persona
(id, nombre, idrol) VALUES
(1, 'Nestor', 1),
(2, 'Juana', 2),
(3, 'Thor', 2);
