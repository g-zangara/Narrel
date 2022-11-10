create table condominio(
                           id integer auto_increment primary key,
                           nome varchar(100) not null,
                           via varchar(100) not null,
                           garage integer not null,
                           unique(nome,via)
);

create table appartamento(
                             id integer auto_increment primary key ,
                             condominio integer not null,
                             piano int not null,
                             numero int not null ,
                             metratura double not null,
                             consumo_ris double  null,
                             foreign key (condominio) references condominio(id) on delete cascade,
                             unique (condominio,piano,numero)
);

create table garage(
                       id integer auto_increment primary key ,
                       condominio integer not null ,
                       numero int not null,
                       consumo_elettrico double null,
                       foreign key(condominio) references condominio(id) on delete cascade,
                       unique (condominio,numero)
);

create table persona(
                        id integer auto_increment primary key ,
                        nome varchar(50),
                        cognome varchar(50),
                        codice_fiscale varchar(16) not null unique
);

create table riunione(
                         id integer auto_increment primary key ,
                         data Date not null unique
);

create table appartamento_proprietario(
                                          id_appartamento integer not null,
                                          id_persona integer not null,
                                          foreign key (id_appartamento) references appartamento(id) on delete cascade,
                                          foreign key (id_persona) references persona(id) on delete cascade,
                                          primary key (id_persona,id_appartamento)
);

create table riunione_invitati(
                                  id_riunione integer not null,
                                  id_persona integer not null,
                                  foreign key(id_riunione) references riunione(id) on delete cascade,
                                  foreign key(id_persona) references persona(id) on delete cascade,
                                  primary key(id_riunione,id_persona)
);

create table riunione_partecipanti(
                                      id_riunione integer not null,
                                      id_persona integer not null,
                                      foreign key(id_riunione) references riunione(id) on delete cascade,
                                      foreign key(id_persona) references persona(id) on delete cascade,
                                      primary key(id_riunione,id_persona)
);