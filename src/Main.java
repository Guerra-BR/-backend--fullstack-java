public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/*

create sequence sq_cliente_2
start 1
increment 1
owned by tb_cliente_2.id;

create table tb_cliente_2(
	id bigint,
	nome varchar(50) not null,
	codigo varchar(50) not null,
	constraint pk_id_cliente_2 primary key(id)
)

select * from tb_cliente_2;


create sequence sq_produto_2
start 1
increment 1
owned by tb_produto_2;

create table tb_produto_2(
    id bigint,
    nome varchar(50),
    codigo varchar(50)
    valor decimal,
    constraint pk_id_produto_2 primary key (id)
)

select * from tb_produto_2
 */