-- cria novo banco de dados UNIP
create database unip_alpoo;
-- determina UNIP como o banco de dados padrão
use unip_alpoo;
-- cria tabela tbLivro
create table tbLivro (
	idLivro int(6)      auto_increment primary key,
    titulo  varchar(30),
    edicao  int(2)
);
-- insere 5 registros
insert into tbLivro (titulo, edicao) values ('Java: como programar',  1);
insert into tbLivro (titulo, edicao) values ('My-SQL pocket',         1);
insert into tbLivro (titulo, edicao) values ('Meu cavalo e eu',       1);
insert into tbLivro (titulo, edicao) values ('Violao e seus atalhos', 1);
insert into tbLivro (titulo, edicao) values ('Aprenda a votar',       1);
-- exibe registros contidos na tabela tbLivro
select * from tbLivro;