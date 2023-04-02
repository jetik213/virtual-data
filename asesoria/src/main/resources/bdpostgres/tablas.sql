create table if not exists carrera (carrera_id integer not null, carrera_nombre varchar(255), primary key (carrera_id));
create table if not exists ciclo (ciclo_id integer not null, ciclo_nombre varchar(255), primary key (ciclo_id));
create table if not exists horario (horario_id integer not null, horario_nombre varchar(255), primary key (horario_id));