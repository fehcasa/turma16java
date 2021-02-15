create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria (
	id int(3) auto_increment,
	nome varchar (30) not null,
    tipo varchar (30) not null,
    primary key (id)
    );
    
insert into tb_categoria (nome, tipo) values ("Wizard", "Inglês");
insert into tb_categoria (nome, tipo) values ("Generation", "Desenvolvedor Java");
insert into tb_categoria (nome, tipo) values ("WizeUp", "Espanhol");
insert into tb_categoria (nome, tipo) values ("Senai", "Técnico em elétrica");
insert into tb_categoria (nome, tipo) values ("Academia", "Natação");

create table tb_produto (
	id int (3) auto_increment,
    modalidade varchar (20) not null,
    duracao varchar (20) not null,
    preco decimal (10,2), 
    produto_id int (3),
    primary key (id),
    foreign key (produto_id) references tb_categoria (id)
    );
    
insert into tb_produto (modalidade, duracao, preco, produto_id) values ("Presencial", "2 anos", 200.00, 1);
insert into tb_produto (modalidade, duracao, preco, produto_id) values ("EAD", "3 meses", 00.00, 2);
insert into tb_produto (modalidade, duracao, preco, produto_id) values ("Presencial", "2 anos", 250.00, 3);
insert into tb_produto (modalidade, duracao, preco, produto_id) values ("Presencial", "2 anos", 00.00, 4);
insert into tb_produto (modalidade, duracao, preco, produto_id) values ("Presencial", "2 anos", 269.00, 5);
insert into tb_produto (modalidade, duracao, preco, produto_id) values ("EAD", "2 anos e meio", 150.00, 1);
insert into tb_produto (modalidade, duracao, preco, produto_id) values ("EAD", "3 anos", 400.00, 3);
insert into tb_produto (modalidade, duracao, preco, produto_id) values ("Presencial", "1 ano", 100.00, 1);

select * from tb_produto;
select * from tb_produto where preco > 50;
select * from tb_produto where preco between 3 and 60;
select * from tb_categoria where tipo like "%j%";
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.produto_id;
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.produto_id where modalidade = "Presencial"
