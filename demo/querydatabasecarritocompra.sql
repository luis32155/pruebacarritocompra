-- creacion de la base de datos
create database carritocompra;
-- uso de la base de datos
use carritocompra;
-- creacion de la tabla productos 
create table producto(
idProducto int(11) auto_increment not null,
nombre varchar(200) not null,
precio decimal(10,2) not null,
constraint fk_productokey primary key(idProducto)
);
-- creacion de la tabla clientes 
create table cliente(
idCliente int(11) auto_increment not null,
nombre varchar(200) not null ,
apellido varchar(200) not null,
dni int(8) not null,
telefono varchar(10) null,
email varchar(150) not null,
constraint fk_clientekey primary key(idCliente)
);
-- creacion de la tabla ventas 
create table venta(
idVenta int(11) auto_increment not null,
idCliente int(11) not null,
fecha date not null,
constraint fk_ventakey primary key(idVenta),
constraint fk_clientekey foreign key(idCliente) references cliente(idCliente));
-- creacion de la tabla detalleventa
create table detalleventa(
idDetalleVenta int(11) not null,
idVenta int(11) not null,
idProducto int(11) not null,
constraint fk_detallekey primary key(idDetalleVenta),
constraint fk_ventakey foreign key(idVenta) references venta(idVenta),
constraint fk_producto foreign key(idProducto) references producto(idProducto)
);

