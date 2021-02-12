create database db_Escola;

use db_Escola;

create table tb_Alunos(
id bigint(5) auto_increment,
Nome varchar(20) not null,
Cargo varchar(50),
Idade bigint (2),
Nota bigint (2),
Altura decimal(2,2),
primary key (id)
);

use db_Escola;
insert into tb_cadastrofuncionarios (Nome, Cargo, Idade, Nota, Altura) values ("Paola","Aluno",22,10,1.55);
insert into tb_cadastrofuncionarios (Nome, Cargo, Idade, Nota, Altura) values ("Rui","Aluno",24,10,1.70);
insert into tb_cadastrofuncionarios (Nome, Cargo, Idade, Nota, Altura) values ("Osvaldo","Aluno",27,10,1.80);
insert into tb_cadastrofuncionarios (Nome, Cargo, Idade, Nota, Altura) values ("Felipe","Aluno",24,10,1.75);
insert into tb_cadastrofuncionarios (Nome, Cargo, Idade, Nota, Altura) values ("Gustavo Lima","Aluno",22,10,1.70);
insert into tb_cadastrofuncionarios (Nome, Cargo, Idade, Nota, Altura) values ("Gustavo Esteban","Aluno",23,10,1.73);
insert into tb_cadastrofuncionarios (Nome, Cargo, Idade, Nota, Altura) values ("Jean","Aluno",28,9,1.78);
insert into tb_cadastrofuncionarios (Nome, Cargo, Idade, Nota, Altura) values ("Athos","Aluno",26,9,1.75);

select * from tb_CadastroFuncionarios where Nota >= 7;

select * from tb_CadastroFuncionarios where Nota < 7;

update tb_cadastrofuncionarios set nome = "Candido"
where id = 3