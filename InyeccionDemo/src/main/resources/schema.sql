CREATE TABLE rol (
  id BIGINT  NOT NULL,
  descripcion VARCHAR(255) NOT NULL
);

CREATE TABLE persona (
  id BIGINT NOT NULL,
  nombre VARCHAR(255) NOT NULL,
  idrol BIGINT, 
  FOREIGN KEY (idrol) REFERENCES rol(id)
);
