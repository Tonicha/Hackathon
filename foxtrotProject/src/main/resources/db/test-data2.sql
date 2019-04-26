-- we don't know how to generate database FOXTROT (class Database) :(
create table CUSTOMER
(
  ID           INTEGER default (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_080CC5E3_FD45_4173_B066_E13DBDB97707) auto_increment,
  CREATIONTIME TIMESTAMP,
  UPDATETIME   TIMESTAMP,
  VERSION      INTEGER,
  EMAIL        VARCHAR(255),
  PASSWORD     VARCHAR(255),
  USERNAME     VARCHAR(255)
);

create unique index PRIMARY_KEY_5
  on CUSTOMER (ID);

alter table CUSTOMER
  add constraint CONSTRAINT_5
    primary key (ID);

create table INGREDIENT
(
  ID           INTEGER default (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_FBD48A3F_492F_415E_9D89_E80A4262A243) auto_increment,
  CREATIONTIME TIMESTAMP,
  UPDATETIME   TIMESTAMP,
  VERSION      INTEGER,
  NAME         VARCHAR(255)
);

create unique index PRIMARY_KEY_1
  on INGREDIENT (ID);

alter table INGREDIENT
  add constraint CONSTRAINT_1
    primary key (ID);

create table RECIPE
(
  ID           INTEGER default (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_E91CD45F_B46C_4182_A59B_D156F3E029C1) auto_increment,
  CREATIONTIME TIMESTAMP,
  UPDATETIME   TIMESTAMP,
  VERSION      INTEGER,
  DESCRIPTION  VARCHAR(255),
  NAME         VARCHAR(255),
  CUSTOMER_ID  INTEGER,
  constraint FKSASLTMYKL49B1JCTS21NX1P5I
    foreign key (CUSTOMER_ID) references CUSTOMER
);

create unique index PRIMARY_KEY_8
  on RECIPE (ID);

alter table RECIPE
  add constraint CONSTRAINT_8
    primary key (ID);

create table RECIPE_INGREDIENT
(
  RECIPES_ID     INTEGER not null,
  INGREDIENTS_ID INTEGER not null,
  constraint FKA0REYRPHLHU1SQEKSM9W2JF72
    foreign key (INGREDIENTS_ID) references INGREDIENT,
  constraint FKL14JF0D0QB9Y9AAQWF35UG5B0
    foreign key (RECIPES_ID) references RECIPE
);


