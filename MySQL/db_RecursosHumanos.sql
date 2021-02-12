create database db_RecursosHumanos;

use db_RecursosHumanos;

create table tb_CadastroFuncionarios(
id bigint(5) auto_increment,
Nome varchar(20) not null,
Cargo varchar(50),
Idade bigint (2),
CPF varchar (20),
Salario decimal(10,2),
primary key (id)
);

use db_RecursosHumanos;
insert into tb_cadastrofuncionarios (Nome, Cargo, Idade, CPF, Salario) values ("Paola","Dev. Java Jr.",22,"123.456.789-10",4000.00);
insert into tb_cadastrofuncionarios (Nome, Cargo, Idade, CPF, Salario) values ("Rui","Dev. Java Jr.",24,"987.654.321-09",4000.00);
insert into tb_cadastrofuncionarios (Nome, Cargo, Idade, CPF, Salario) values ("Rafão","Professor",40,"321.456.987-99",9000.00);
insert into tb_cadastrofuncionarios (Nome, Cargo, Idade, CPF, Salario) values ("Felipe","Dev. Java Jr.",24,"578.951.159-34",4000.00);
insert into tb_cadastrofuncionarios (Nome, Cargo, Idade, CPF, Salario) values ("Gustavo Lima","Representante de turma",22,"369.258.147-47",3000.00);
insert into tb_cadastrofuncionarios (Nome, Cargo, Idade, CPF, Salario) values ("Gustavo Esteban","Dev. Java Jr.",23,"234.567.812-48",4000.00);
insert into tb_cadastrofuncionarios (Nome, Cargo, Idade, CPF, Salario) values ("Jean","Dev. Java Sênior.",28,"258.943.481-63",8000.00);
insert into tb_cadastrofuncionarios (Nome, Cargo, Idade, CPF, Salario) values ("Athos","Dev. Java Jr.",26,"569.753.137-78",4000.00);

select * from tb_CadastroFuncionarios where Salario >= 2000.00;

select * from tb_CadastroFuncionarios where Salario < 2000.00;

update tb_cadastrofuncionarios set nome = "Ed"
where id = 3