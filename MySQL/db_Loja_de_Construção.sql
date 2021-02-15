create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria (
	id int(3) auto_increment,
    nome_loja varchar (35) not null,
    tipo varchar (30) not null,
    primary key (id)
    );
    
insert into tb_categoria (nome_loja, tipo) values ("Leroy Merlin", "Acabamento");
insert into tb_categoria (nome_loja, tipo) values ("Joli", "Construção");
insert into tb_categoria (nome_loja, tipo) values ("Telhanorte", "Decoração");
insert into tb_categoria (nome_loja, tipo) values ("Leroy Merlin", "Piso");
insert into tb_categoria (nome_loja, tipo) values ("Telhanorte", "Telhado");
    
create table tb_produtos (
    id int(5) auto_increment,
    produto varchar (30) not null,
    preco decimal (10,2),
    estoque int (3),
	produtos_id int (3),
    primary key(id),
    foreign key (produtos_id) references tb_categoria (id)
);

insert into tb_produtos (produto, preco, estoque, produtos_id) values ("Telha", 15.90, 100, 5);
insert into tb_produtos (produto, preco, estoque, produtos_id) values ("Vaso", 29.90, 100, 3);
insert into tb_produtos (produto, preco, estoque, produtos_id) values ("Pia de Banheiro", 129.90, 20, 2);
insert into tb_produtos (produto, preco, estoque, produtos_id) values ("Pia de Cozinha", 159.90, 20, 2);
insert into tb_produtos (produto, preco, estoque, produtos_id) values ("Porcelanato", 90.99, 90, 4);
insert into tb_produtos (produto, preco, estoque, produtos_id) values ("Cortina", 69.90, 40, 3);
insert into tb_produtos (produto, preco, estoque, produtos_id) values ("Rejunte", 30.00, 60, 1);
insert into tb_produtos (produto, preco, estoque, produtos_id) values ("Tijolo", 10.00, 800, 1);

select * from tb_produtos;
select * from tb_produtos where preco > 50;
select * from tb_produtos where preco between 3 and 60;
select * from tb_produtos where produto like "%c%";
select * from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produto.produto_id;
select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.produto_id where tipo = "Acabamento";

    