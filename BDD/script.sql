--Script DB "GESTION COMMERCIALE"
--VERSION 2017

Prompt **********************************************
Prompt DB "GESTION COMMERCIALE"
--SUPPRESSION DES TABLES
Prompt **********************************************
Prompt SUPPRESSION DES TABLES
Prompt **********************************************

drop table representant cascade constraints purge;
drop table client cascade constraints purge;
drop table article cascade constraints purge;
drop table commande cascade constraints purge;
drop table ligne_com cascade constraints purge;



--CREATION DES TABLES

Prompt **********************************************
Prompt CREATION DES TABLES
Prompt **********************************************


Prompt CREATION DE LA TABLE REPRESENTANT

create table representant
( idrep          integer constraint pk_idrep primary key,
  prenomrep      varchar(20),
  nomrep         varchar(20),
  adresse        varchar2(20),
  codepostal     number(5),
  ville          varchar (30),
  telephone      varchar(10) );

Prompt CREATION DE LA TABLE CLIENT

create table client
( idclient       integer constraint pk_idcli primary key,
  raisonsociale  varchar(20), 
  Adresse        varchar(60),
  codepostal     number(5),
  Ville          varchar(30),
  Telephone      varchar(20),
  idrep          integer constraint fk_idrep references representant(idrep));

Prompt CREATION DE LA TABLE ARTICLE

create table article
( idarticle      integer constraint pk_idart primary key,
  designation    varchar(30), 
  prixunit       number(8,2),
  qtestock       number);

Prompt CREATION DE LA TABLE COMMANDE
create table commande
( numcom         integer constraint pk_num primary key,
  idclient       integer constraint fk_idcl references client(idclient),
  datecom        date);

Prompt CREATION DE LA TABLE LIGNE_COM
CREATE TABLE ligne_com
( numcom         integer constraint fk_num references commande (numcom),
  idarticle      integer constraint fk_idar references article(idarticle),
  numlig         integer ,
  qtecom         integer ,
  Constraint pk_ligne_com primary key (numcom,idarticle) );


Prompt ***********INSERTION DES DONNEES**************
Prompt REPRESENTANT
insert into representant values (1,'Paul','Dupond','20 Rue des Jardins',69000,'Lyon','0425124556');
insert into representant values (2,'Jean','Fontaine','10 Place des Armes',75000,'Paris','0125194556');
insert into representant values (3,'Remi','Hoareau','5 Rue des Acacias',13012,'Marseille','0425194576');
insert into representant values (4,'Pierre','Sanchez','Rue des Roses',90145,'Belfort','0325129551');
insert into representant values (5,'Patrick','Garcia','2 bis rue des lilas',33016,'Bordeaux','0515128556');
insert into representant values (6,'Patrick','lebeaux','80 Rue des Amandines',62000,'Lille','0229123554');
insert into representant values (7,'David','Legrand','12 Rue des Muguets',18000,'Bourges','0325134556');


Prompt CLIENT
insert into client values(1,'DARTY','',75005,'paris','0126597820',4);
insert into client values(2,'INFO SYSTEM','15 rue de la boeme',75007,'PARIS','0135678712',4);
insert into client values(3,'CD PRO','1 RUE JEAN MERMOZ',45900,'LA SOURCE','0302345698',5);
insert into client values(4,'Multimedia','13 avenue des Tilleuls',92310,'SEVRES','0134568934',5);
insert into client values(5,'CARREFOUR','',13008,'MARSEILLE','0456788932',7);
insert into client values(6,'THOMSON','',33000,'BORDEAUX','0455237806',null);


prompt ARTICLE
insert into article values (1,'Moniteur 28"',300,30);
insert into article values (2,'Moniteur 19"',169,20);
insert into article values (3,'Disque dur 5To',240,250);
insert into article values (4,'Disque dur 2To',104,350);
insert into article values (5,'Clavier SF',79,200);
insert into article values (6,'UC HP500-310',514,50);
insert into article values (7,'TV LED-3D',399,10);


Prompt COMMANDE
alter session set nls_date_format='dd/mm/yyyy';

insert into commande 
values (1,1,'12/12/'||(to_char(sysdate, 'YYYY')-2));
insert into commande 
values (2,3,'25/12/'||(to_char(sysdate, 'YYYY')-2));
insert into commande 
values (3,5,'12/02/'||(to_char(sysdate, 'YYYY')-1));
insert into commande values (4,1,sysdate);
insert into commande values (5,2,sysdate-4);
insert into commande values (6,4,sysdate-7);


Prompt LIGNE_COM
insert into ligne_com values(1,2,1,3);
insert into ligne_com values(1,6,2,1);
insert into ligne_com values(2,4,1,10);
insert into ligne_com values(3,1,1,1);
insert into ligne_com values(3,5,2,1);
insert into ligne_com values(3,2,3,15); 
insert into ligne_com values(4,2,1,2);
insert into ligne_com values(4,6,2,3);
insert into ligne_com values(4,1,3,3);
insert into ligne_com values(5,1,1,1);
insert into ligne_com values(6,3,1,3);
insert into ligne_com values(6,4,2,1);
insert into ligne_com values(6,6,3,4);


Prompt **********************************************
Prompt Validation des Donnees
Prompt **********************************************

commit;
Prompt FIN DE CREATION DE LA BASE COMMANDE.
Prompt **********************************************
Prompt **************BONNE FORMATION*****************                                  
