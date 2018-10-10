CREATE TABLE persona (
  id BIGINT NOT NULL,
  nombre VARCHAR(255) NOT NULL,
  rol_id BIGINT
);

CREATE TABLE rol (
  id BIGINT NOT NULL,
  descripcion VARCHAR(255) NOT NULL
);
