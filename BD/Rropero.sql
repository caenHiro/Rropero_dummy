--
--
--CATALOGOS
--
--

create table categorias_principales(
categoria varchar(15) ,
categoria_abrev  varchar(5),
sub_categoria varchar(15) ,
sub_categoria_abrev varchar(5),
sub_categoria_articulo varchar(50)  ,
sub_categoria_articulo_abrev varchar(5),
peso_ambiental float,
peso_envio float ,
primary key(categoria,sub_categoria,sub_categoria_articulo)
);


create table materiales (
id_material serial unique,
categoria_material varchar(15) , 
meterial varchar(50) , 
peso float,
densidad float,
factor_energia float,
factor_co2 float,
uso_agua float,
primary key (id_material , categoria_material,meterial)
);

create table catalagos_otros(
id_otro serial ,
sku varchar(150),
otro_desc varchar(150),
tabla varchar(150),
primary key (id_otro , sku , tabla)
);

create table tipo_entrega (
categoria_entrega varchar(15) primary key,
categoria_entrega_abrev varchar(5)
);


create table rango_precio(
categoria_marca varchar(50) , 
sub_categoria_articulo varchar(50) , 
precio_promedio float,
primary key (categoria_marca , sub_categoria_articulo)
);


--alter table rango_precio add constraint sub_categoria_articulo foreign key (sub_categoria_articulo) references categorias_principales (sub_categoria_articulo) ;


create table categoria_evaluacion (
marca varchar(25) primary key, 
categoria_marca  varchar(15) 
);

--alter table categoria_evaluacion add constraint categoria_marca foreign key (categoria_marca) references rango_precio (categoria_marca);


create table estado_prenda(
estado_prenda varchar(50) primary key, 
estado_prenda_abrev varchar(5) , 
porcentaje_descuento float
);

create table tallas (
id_talla  serial unique,
categoria varchar (15) , 
sub_categoria_articulo varchar (50) , 
us float,
us_desc varchar(20), 
eur float ,
eur_desc varchar(20),
uk float ,
mex float , 
mex_desc varchar(20),
it float , 
aus float ,
jap float ,
chi float , 
pecho float , 
cintura float , 
cadera float ,
pulgadas float,
cm float ,
primary key (id_talla)
);

--drop table tallas;
--alter table tallas add constraint id_talla primary key (id_talla);
--alter table tallas add constraint sub_categoria_articulo foreign key (sub_categoria_articulo) references categorias_principales (sub_categoria_articulo) ;
--alter table tallas add constraint categoria foreign key (categoria) references categorias_principales (categoria) ;


create table usuario_datos(
id_datos_cliente serial primary key  , 
tipo_cliente varchar(25)
);



create table usuario_login(
id_cliente serial unique ,
id_datos_cliente Integer   , 
nombre_cliente varchar(50),
e_mail varchar(30),
pass varchar(250),
primary key (id_cliente , id_datos_cliente)
);


alter table usuario_login add constraint id_datos_cliente foreign key (id_datos_cliente) references usuario_datos (id_datos_cliente);





create table producto (
SKU varchar(150) primary key, 
categoria varchar(15) ,
sub_categoria varchar(15)  ,
sub_categoria_articulo varchar(15)  ,
Marca varchar(20),
id_talla  Integer,
id_cliente Integer ,
id_material integer ,  
estado_prenda varchar(20)  ,  
categoria_entrega varchar(150) ,
precio float , 
FechaEntrega date,
Nombre_articulo varchar(150) ,
FechaVenta date, 
Descripcion varchar(150),
Shopify boolean, 
Precio_final float,
Existencia Integer 
);
--alter table producto add constraint categoria foreign key (categoria) references  categorias_principales (categoria) ;
--alter table producto add constraint sub_categoria foreign key (sub_categoria) references  categorias_principales (sub_categoria) ;
--alter table producto add constraint sub_categoria_articulo foreign key (sub_categoria_articulo) references  categorias_principales (sub_categoria_articulo) ;
--alter table producto add constraint id_talla foreign key (id_talla) references  tallas (id_talla);
--alter table producto add constraint id_cliente foreign key (id_cliente) references  usuario_login (id_cliente) ;
--alter table producto add constraint id_material foreign key (id_material) references  materiales (id_material ) ;
--alter table producto add constraint estado_prenda foreign key (estado_prenda) references  estado_prenda (estado_prenda);
--alter table producto add constraint categoria_entrega foreign key (categoria_entrega) references  tipo_entrega (categoria_entrega);
