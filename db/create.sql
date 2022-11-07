create or replace table bosch_repos
(
    id          int auto_increment
        primary key,
    name        varchar(25) not null,
    description text        null,
    language    smallint    not null,
    repo_url    tinytext    not null,
    constraint bosch_repos_id_uindex
        unique (id)
);