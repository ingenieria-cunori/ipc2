describe cliente;
insert into cliente 
	(nombre, apellido, esMasculino) values 
    ("Luis", "Pérez", True);
select * from cliente;
update cliente set nombre="Don Ramón", apellido="no se"
where idcliente = 2;
delete from cliente where idcliente = 2;

describe pedido;
insert into pedido (idcliente, fecha) values 
	(1,"2022-08-12");
    
insert into pedido (fecha) values 
	("2022-08-12");
select * from pedido;

select 
	p.idpedido as "Pedido",    
    c.nombre as "Nombre del cliente",
    c.apellido as "Apellido del cliente",
    c.esMasculino as "Sexo",
    p.fecha as "Fecha del pedido"
from pedido p 
inner join cliente c
on p.idcliente = c.idcliente;


select 
	p.idpedido as "Pedido",    
    c.nombre as "Nombre del cliente",
    c.apellido as "Apellido del cliente",
    c.esMasculino as "Sexo",
    p.fecha as "Fecha del pedido"
from pedido p 
right join cliente c
on p.idcliente = c.idcliente;


select 
	p.idpedido as "Pedido",    
    c.nombre as "Nombre del cliente",
    c.apellido as "Apellido del cliente",
    c.esMasculino as "Sexo",
    p.fecha as "Fecha del pedido"
from pedido p 
right join cliente c
on p.idcliente = c.idcliente
where p.idcliente is null;



    