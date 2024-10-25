delete from foo;
delete from bar;

insert into bar( id ) values( 1 );
insert into foo( bar_id ) values( 1 );