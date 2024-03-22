create table article
(
    id    UUID primary key,
    title varchar(255) not null,
    typ   varchar(255) not null,
    date  date         not null,
    html  text         not null
);

create table img_meta
(
    id         UUID primary key,
    name       varchar(255) not null,
    alt        text         not null,
    article_id UUID         not null,
    foreign key (article_id) references article (id)
);

create table dokument
(
    id         UUID primary key,
    name       varchar(255) not null,
    title      varchar(255) not null,
    article_id UUID         not null,
    foreign key (article_id) references article (id)
);
