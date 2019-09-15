
    #db HDwczlp52O
    #pass UaQzGsMrSL

CREATE TABLE Especialidad(
	idespecialidad int AUTO_INCREMENT PRIMARY KEY,
    nombre varchar(50)
);

CREATE TABLE Doctor(
	iddoctor int AUTO_INCREMENT PRIMARY KEY,
    nombre varchar(100),
    especialidad int,
    telefono varchar(15),
    FOREIGN KEY(especialidad) REFERENCES Especialidad(idespecialidad)
);

CREATE TABLE Paciente(
	idpaciente int AUTO_INCREMENT PRIMARY KEY,
    nombre varchar(100),
    telefono varchar(15),
    direccion varchar(100),
    fechanac date,
    email varchar(50),
    password varchar(20)
);

CREATE TABLE Cita(
	idcita int AUTO_INCREMENT PRIMARY KEY,
    doctor int,
    paciente int,
    fecha date,
    horainicio time,
    horafin time,
    FOREIGN KEY (doctor) REFERENCES Doctor(iddoctor),
    FOREIGN KEY (paciente) REFERENCES Paciente(idpaciente)
);