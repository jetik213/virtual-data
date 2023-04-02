INSERT INTO carrera (carrera_id, carrera_nombre) VALUES (1,'Computación e Informática') ON CONFLICT (carrera_id) DO NOTHING;
INSERT INTO carrera (carrera_id, carrera_nombre) VALUES (2,'Administración y Sistemas') ON CONFLICT (carrera_id) DO NOTHING;
INSERT INTO carrera (carrera_id, carrera_nombre) VALUES (3,'Industrial y Sistemas') ON CONFLICT (carrera_id) DO NOTHING;
INSERT INTO carrera (carrera_id, carrera_nombre) VALUES (4,'Administración de Redes y Comunicaciones') ON CONFLICT (carrera_id) DO NOTHING;
INSERT INTO carrera (carrera_id, carrera_nombre) VALUES (5,'Arquitectura de datos') ON CONFLICT (carrera_id) DO NOTHING;
INSERT INTO carrera (carrera_id, carrera_nombre) VALUES (6,'Dibujo de Arquitectura y Obras Civiles') ON CONFLICT (carrera_id) DO NOTHING;
INSERT INTO carrera (carrera_id, carrera_nombre) VALUES (7,'Seguridad y Prevención de Riesgos') ON CONFLICT (carrera_id) DO NOTHING;
INSERT INTO carrera (carrera_id, carrera_nombre) VALUES (8,'Mecatrónica Industrial') ON CONFLICT (carrera_id) DO NOTHING;
INSERT INTO carrera (carrera_id, carrera_nombre) VALUES (9,'Electricidad Industrial') ON CONFLICT (carrera_id) DO NOTHING;
INSERT INTO carrera (carrera_id, carrera_nombre) VALUES (10,'Mecánica Automotriz') ON CONFLICT (carrera_id) DO NOTHING;

INSERT INTO ciclo (ciclo_id, ciclo_nombre) VALUES (1,'Primer Ciclo') ON CONFLICT (ciclo_id) DO NOTHING;
INSERT INTO ciclo (ciclo_id, ciclo_nombre) VALUES (2,'Segundo Ciclo') ON CONFLICT (ciclo_id) DO NOTHING;
INSERT INTO ciclo (ciclo_id, ciclo_nombre) VALUES (3,'Tercer Ciclo') ON CONFLICT (ciclo_id) DO NOTHING;
INSERT INTO ciclo (ciclo_id, ciclo_nombre) VALUES (4,'Cuarto Ciclo') ON CONFLICT (ciclo_id) DO NOTHING;
INSERT INTO ciclo (ciclo_id, ciclo_nombre) VALUES (5,'Quinto Ciclo') ON CONFLICT (ciclo_id) DO NOTHING;
INSERT INTO ciclo (ciclo_id, ciclo_nombre) VALUES (6,'Sexto Ciclo') ON CONFLICT (ciclo_id) DO NOTHING;

INSERT INTO horario (horario_id, horario_nombre) VALUES (1,'08:00-10:00') ON CONFLICT (horario_id) DO NOTHING;
INSERT INTO horario (horario_id, horario_nombre) VALUES (2,'10:00-12:00') ON CONFLICT (horario_id) DO NOTHING;
INSERT INTO horario (horario_id, horario_nombre) VALUES (3,'12:00-14:00') ON CONFLICT (horario_id) DO NOTHING;
INSERT INTO horario (horario_id, horario_nombre) VALUES (4,'14:00-16:00') ON CONFLICT (horario_id) DO NOTHING;
INSERT INTO horario (horario_id, horario_nombre) VALUES (5,'16:00-18:00') ON CONFLICT (horario_id) DO NOTHING;
