create table if not exists lab8_productos (
	codigo int(3)  auto_increment,
	nombre varchar(50) not null,
	precio decimal(5,2) not null,
	stock int(4) unsigned,
	primary key(codigo)
);

select * from lab8_productos;

drop table lab8_productos;
