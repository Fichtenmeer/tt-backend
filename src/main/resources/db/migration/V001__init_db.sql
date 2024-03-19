create table news
(
    id    UUID primary key,
    title varchar(255) not null,
    typ   varchar(255) not null,
    date  date         not null,
    html  text         not null
);

create table img_meta
(
    id       UUID primary key,
    filename varchar(255) not null,
    alt      text         not null,
    news_id  UUID         not null,
    foreign key (news_id) references news (id)
);

create table dokument
(
    id       UUID primary key,
    filename varchar(255) not null,
    title    varchar(255) not null,
    news_id  UUID         not null,
    foreign key (news_id) references news (id)
);
