create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe (
id int(5) auto_increment,
tipo varchar (30) not null,
ataque bigint (255),
defesa bigint (255),
primary key (id)
);

insert into tb_classe (nome, ataque, defesa) values ("Suporte", 1260, 4480);
insert into tb_classe (nome, ataque, defesa) values ("Tiro Preciso", 3080, 4480);
insert into tb_classe (nome, ataque, defesa) values ("Peso-Pesado", 1820, 5880);
insert into tb_classe (nome, ataque, defesa) values ("Lutador", 1512, 4200);
insert into tb_classe (nome, ataque, defesa) values ("Lançador", 2184, 5040);

create table tb_personagem (
id int(5) auto_increment,
nome varchar (30) not null,
ult varchar (30) not null,
alcance varchar (30) not null,
vida varchar (30) not null,
velocidade varchar (30) not null,
tipo_id int(5),
primary key (id),
foreign key (tipo_id) references tb_classe(id)
);

insert into tb_personagem (nome, ult, alcance, vida, velocidade, tipo_id) values ("Penny", "Atirador Experiente",
 "Longo", "4480", "Normal", 2);
 insert into tb_personagem (nome, ult, alcance, vida, velocidade, tipo_id) values ("Jacky", "Sem chão", "Curto", 
 "7000", "Rápida", 3);
 insert into tb_personagem (nome, ult, alcance, vida, velocidade, tipo_id) values ("Wattson", "Truque de festa", 
 "Normal", "3920", "Lento", 4);
 insert into tb_personagem (nome, ult, alcance, vida, velocidade, tipo_id) values ("Nita", "Garra de Urso", 
 "Normal", "5600", "Normal", 4);
 insert into tb_personagem (nome, ult, alcance, vida, velocidade, tipo_id) values ("Bea", "Colméia Robótica", 
 "Muito longo", "3360", "Normal", 2);
 insert into tb_personagem (nome, ult, alcance, vida, velocidade, tipo_id) values ("Pam", "Xodó da Mamãe", "Longo",
 "6720", "Normal", 1);
 insert into tb_personagem (nome, ult, alcance, vida, velocidade, tipo_id) values ("Dynamike", "Barril Bombástico",
 "Longo", "3920", "Normal", 5);
 insert into tb_personagem (nome, ult, alcance, vida, velocidade, tipo_id) values ("Jessie", "Lata-Velha", "Longo",
 "4480", "Normal", 4);
 
 select * from tb_personagem
 inner join tb_classe on tb_classe.id = tb_personagem.tipo_id where ataque > 2000;
 
 select * from tb_personagem
inner join tb_classe on tb_classe.id = tb_personagem.tipo_id where ataque between 1000 and 2000;

select * from tb_personagem
inner join tb_classe on tb_classe.id = tb_personagem.tipo_id;

select * from tb_personagem where nome like '%J%';

select * from tb_personagem
inner join tb_classe on tb_classe.id = tb_personagem.tipo_id where tipo = 'Suporte'
 