create table funcionarios(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    cpf varchar(20) not null unique,
    telefone varchar(20) not null,

    primary key(id)

);