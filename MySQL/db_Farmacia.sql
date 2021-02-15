create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria (
	id int(3) auto_increment, 
    nome_Farmacia varchar(100),
    categoria varchar(30),
    primary key (id)
);

insert into tb_categoria (nome_Farmacia, categoria) values ("DrogaVerde", "Comercial");
insert into tb_categoria (nome_Farmacia, categoria) values ("Droga Onofre", "Comercial");
insert into tb_categoria (nome_Farmacia, categoria) values ("Drogaria São Paulo", "Comercial");
insert into tb_categoria (nome_Farmacia, categoria) values ("Bifarma", "Comercial");
insert into tb_categoria (nome_Farmacia, categoria) values ("Droga Raia", "Comercial");

create table tb_produto(
	id int(3) auto_increment,
    nome varchar(50),
    valor decimal (10,2),
    tipo varchar (30),
    uso varchar(30),
    produto_id int (3),
    primary key(id),
    foreign key (produto_id) references tb_categoria (id)
);

insert into tb_produto (nome, valor, tipo, uso, produto_id) values ("Polaramine", 15.99, "Antialérgico","Líquido",1);
insert into tb_produto (nome, valor, tipo, uso, produto_id) values ("Advil", 2.99, "Analgésico","Comprimido",3);
insert into tb_produto (nome, valor, tipo, uso, produto_id) values ("Dorflex", 9.99, "Analgésico","Comprimido",2);
insert into tb_produto (nome, valor, tipo, uso, produto_id) values ("Soro Fisiológico", 10.99, "Outros","Líquido",3);
insert into tb_produto (nome, valor, tipo, uso, produto_id) values ("Gel Secativo", 34.95, "Estético","Gel",4);
insert into tb_produto (nome, valor, tipo, uso, produto_id) values ("Novalgina", 12.99, "Analgésico","Líquido",1);
insert into tb_produto (nome, valor, tipo, uso, produto_id) values ("Ibuprofeno", 95.99, "Anti-inflamatório","Líquido",3);
insert into tb_produto (nome, valor, tipo, uso, produto_id) values ("Hixizine", 15.99, "Antialérgico","Líquido",4);

select * from tb_produto;
select * from tb_produto where valor > 50;
select * from tb_produto where valor between 3 and 60;
select * from tb_produto where nome like "%b%";
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.produto_id;
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.produto_id where tipo = "Antialérgico"