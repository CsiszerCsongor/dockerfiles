CREATE TABLE films (
    code        varchar(5),
    title       varchar(40),
    did         integer,
    date_prod   date,
    kind        varchar(20),
    CONSTRAINT production UNIQUE(date_prod)
);

insert into films(code, title, did, date_prod, kind)
values ( 'fc_1', 'film_title_1', 1, '2025-04-24', 'film_kind_1' ),
       ( 'fc_2', 'film_title_2', 2, '2025-04-25', 'film_kind_2' );