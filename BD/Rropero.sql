create table producto (
SKU varchar(150) primary key, 
--Articulo varchar(), --tipo de articulo ¿ Categoria ?
--catalogos
CategoriaPrincipal Integer,
SubcategoriaPrincipal Integer,
Subcategoria Integer,
Marca varchar(20),
Talla varchar(20),
Cliente Integer,
Materia Integer, --catalogo 
--
FechaEntrega date, 
HoraEntrega time, 
FechaVenta date, 
HoraVenta time,
Estado varchar(20),
NombreDelArticuloVenta varchar(50),
CategoriaCalidad Integer, 
Descripcion varchar(150),
Shopify boolean, 
ModoEntrega varchar(150),

PrecioFinal float,
--calculados
PesoProducto Integer,
PesoProductoEnvio Integer,
Existencia Integer
);

--
--
--PesoTotalVendido ,
--PesoTotalDonado  ,
--NumeroDePiezasVendidas , 
--PromedioTiempoVenta , 
--DioxidoCarbonoNoEmitido,
--PuntosVerdes , 
--ValorObjetivo
--PorcentajeDescuento
--TiempoProcesoventa varchar(),
--


--
--
--CATALOGOS
--
--

create table categorias_principales(
categoria varchar(15) primary key,
categoria_abrev  varchar(5),
sub_categoria varchar(15) unique,
sub_categoria_abrev varchar(5),
sub_categoria_articulo varchar(15) unique,
sub_categoria_articulo_abrev varchar(5),
peso_ambiental float,
peros_envio float
);


create table materiales (
categoria_material varchar(15) primary key, 
meterial varchar(15) unique, 
peso float,
densidad float,
factor_energia float,
factor_co2 float,
uso_agua float
);



create table tipo_entrega (
categoria_entrega varchar(15) primary key,
categoria_entrega_abrev varchar(5)
);

create table rango_precio(
Categoria_marca varchar(15) primary key, -- podrian ser dominios
sub_categoria_articulo varchar(15) unique , --llave foranea a categorias_principales
precio_promedio float
);


create table categoria_evaluacion (
marca varchar(25) primary key, 
categoria_marca  varchar(15) -- dominio igual 
);


create table estado_prenda(
estado_prenda varchar(15) primary key, -- dominio 
porcentaje_descuento float
);

create table tallas (
tipo_medida varchar(15) primary key, 
talla varchar(15) unique,
categoria varchar (15) unique -- foranea
);

create table user1(
id_cliente integer primary key,
nombre_cliente varchar(50),
e_mail varchar(30)
);