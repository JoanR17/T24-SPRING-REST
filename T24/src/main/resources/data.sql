
DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
	trabajo enum('Junior','Senior','Analista Programador','Analista Organico','Arquitecto'),
	salario double,
    fecha date
);

insert into empleado (nombre, trabajo, salario, fecha) values('Jose', 'Junior', 1200.50, NOW());
insert into empleado (nombre, trabajo, salario, fecha) values('Juan', 'Senior', 1500.75, NOW());
insert into empleado (nombre, trabajo, salario, fecha) values('Pedro', 'Analista Programador', 1800.63, NOW());
insert into empleado (nombre, trabajo, salario, fecha) values('Jordi', 'Analista Organico', 2125.35, NOW());
insert into empleado (nombre, trabajo, salario, fecha) values('Jonatan', 'Arquitecto', 2750.14, NOW());