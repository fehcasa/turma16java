create database sistema_ecommerce; 

use sistema_ecommerce;

create table produtos(
id bigint (5) auto_increment,
tipo varchar (30) not null,
nome varchar (30),
marca varchar (10),
preço decimal (5,2),
cor varchar (20),
primary key (id)
);

use Ecommerce;
insert into produtos (tipo, nome, marca, preço, cor) values ("Camiseta","Comum","ChicoRei",49.90, "Preta");
insert into produtos (tipo, nome, marca, preço, cor) values ("Camiseta","Regata","Nike",69.90, "Branca");
insert into produtos (tipo, nome, marca, preço, cor) values ("Camiseta","Manga comprida","Nike",99.90, "Estampada");
insert into produtos (tipo, nome, marca, preço, cor) values ("Camiseta","Regata","Adidas",109.90, "Estampada");
insert into produtos (tipo, nome, marca, preço, cor) values ("Camiseta","Regata","Pernambucanas",29.90, "Estampada");
insert into produtos (tipo, nome, marca, preço, cor) values ("Camiseta","Comum","Nike",89.90, "Preta");
insert into produtos (tipo, nome, marca, preço, cor) values ("Camiseta","Comum","Vans",69.99, "Preta");
insert into produtos (tipo, nome, marca, preço, cor) values ("Camiseta","Comum","Vans",69.90, "Laranja");

select * from produtos
where preço >= 500;

select * from produtos
where preço < 500;

update produtos set nome = "Regata"
where id = 3;