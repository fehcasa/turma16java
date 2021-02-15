create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categorias (
	id int(3) auto_increment,
	nome varchar (30) not null,
    tipo varchar (20) not null,
    primary key (id)
    );
    
insert into tb_categorias (nome, tipo) values ("Açougue da Praça", "Ave");
insert into tb_categorias (nome, tipo) values ("Açougue da Vila", "Bovino");
insert into tb_categorias (nome, tipo) values ("Açougue da Galera", "Suíno");
insert into tb_categorias (nome, tipo) values ("Açougue dos Amigos", "Vegano");
insert into tb_categorias (nome, tipo) values ("Açougue da Famíligia", "Peixe");

create table tb_produto (
	id int (3) auto_increment,
    tipo2 varchar (30),
    preco decimal (10,2),
    embalagem varchar (30),
    corte varchar (30),
    produto_id int (3),
    primary key(id),
    foreign key (produto_id) references tb_categorias (id)
);

insert into tb_produto (tipo2, preco, embalagem, corte, produto_id) values ("Picanha", 69.90, "Vácuo", "Peça Inteira", 2);
insert into tb_produto (tipo2, preco, embalagem, corte, produto_id) values ("Linguiça", 28.90, "Bandeja", "Kilo", 3);
insert into tb_produto (tipo2, preco, embalagem, corte, produto_id) values ("Proteína de Soja", 25.90, "Pacote", "Kilo", 4);
insert into tb_produto (tipo2, preco, embalagem, corte, produto_id) values ("Hamburguer vegana", 23.90, "Bandeja", "Unidade", 4);
insert into tb_produto (tipo2, preco, embalagem, corte, produto_id) values ("Merluza", 19.90, "Bandeja", "Filé", 5);
insert into tb_produto (tipo2, preco, embalagem, corte, produto_id) values ("Tilápia", 18.90, "Bandeja", "Filé", 5);
insert into tb_produto (tipo2, preco, embalagem, corte, produto_id) values ("Peito de Frango", 26.90, "Bandeja", "Filé", 1);
insert into tb_produto (tipo2, preco, embalagem, corte, produto_id) values ("Costela", 54.90, "Vácuo", "Peça Inteira", 2);

select * from tb_produto;
select * from tb_produto where preco > 50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where tipo2 like "%c%"; 
select * from tb_produto inner join tb_categorias on tb_categorias.id = tb_produto.produto_id;
select * from tb_produto inner join tb_categorias on tb_categorias.id = tb_produto.produto_id where embalagem = "Vácuo"
