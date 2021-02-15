create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria (
	id int(3) auto_increment, 
    nome_Pizzaria varchar(100),
    bairro_Pizzaria varchar (100),
    primary key (id)
);

insert into tb_categoria (nome_Pizzaria, UF_Pizzaria) values ("Pizzaria DiNapoli", "Cachoeirinha");
insert into tb_categoria (nome_Pizzaria, UF_Pizzaria) values ("Pizzaria Casa da Esfiha", "Cachoeirinha");
insert into tb_categoria (nome_Pizzaria, UF_Pizzaria) values ("Pizzaria Bruno", "Freguesia do Ó");
insert into tb_categoria (nome_Pizzaria, UF_Pizzaria) values ("Pizzaria Didio", "Freguesia do Ó");
insert into tb_categoria (nome_Pizzaria, UF_Pizzaria) values ("Pizzaria Ponto da Esfiha", "Casa Verde");

select * from tb_categoria;

create table tb_pizza(
	id int(3) auto_increment,
    nome_Pizza varchar(100),
    tipo_Pizza varchar(100),
    tamanho_Pizza varchar(100),
    preco_Pizza int(3.2),
    pizza_id int(3),
    primary key(id),
    foreign key (pizza_id) references tb_categoria (id)
);

insert into tb_pizza (nome_Pizza, tipo_Pizza, preco_Pizza, tamanho_Pizza, pizza_id) values ("Rúcula com tomate seco", "Salgada", 29.00, "Pizza Grande", 1);
insert into tb_pizza (nome_Pizza, tipo_Pizza, preco_Pizza, tamanho_Pizza, pizza_id) values ("Brócolis", "Salgada", 51.90, "Pizza Normal", 2);
insert into tb_pizza (nome_Pizza, tipo_Pizza, preco_Pizza, tamanho_Pizza, pizza_id) values ("4 Queijos", "Salgada", 53.90, "Pizza Normal", 2);
insert into tb_pizza (nome_Pizza, tipo_Pizza, preco_Pizza, tamanho_Pizza, pizza_id) values ("Mix de legumes", "Salgada", 40.90, "Pizza Brotinho", 3);
insert into tb_pizza (nome_Pizza, tipo_Pizza, preco_Pizza, tamanho_Pizza, pizza_id) values ("Palmito", "Salgada", 45.90, "Pizza Grande", 1);
insert into tb_pizza (nome_Pizza, tipo_Pizza, preco_Pizza, tamanho_Pizza, pizza_id) values ("Brigadeiro", "Doce", 49.90, "Pizza Grande", 1);
insert into tb_pizza (nome_Pizza, tipo_Pizza, preco_Pizza, tamanho_Pizza, pizza_id) values ("Romeu e Julieta", "Doce", 59.90, "Pizza Normal", 2);
insert into tb_pizza (nome_Pizza, tipo_Pizza, preco_Pizza, tamanho_Pizza, pizza_id) values ("Doce de Leite", "Doce", 69.90, "Pizza Brotinho", 3);

select * from tb_pizza;
select * from tb_pizza where preco_Pizza > 45;
select * from tb_pizza where preco_Pizza between 29 and 60;
select * from tb_pizza where nome_Pizza like "%c%";
select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.pizza_id;
select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.pizza_id where tipo_pizza = "Doce"


