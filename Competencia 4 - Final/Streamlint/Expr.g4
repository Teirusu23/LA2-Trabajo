grammar Expr;

options {
    caseInsensitive=true;
}

root: setencia+ EOF ;

palabras_no_reservadas
    : BY
    | UPDATE
    | SET
    | DELETE
    | SCHEMA
    | INT
    | DECIMAL
    | NUMERIC
    | CHAR
    | VARCHAR
    | TEXT
    | INTEGER
    | SMALLINT
    | SERIAL
    | KEY
    | DATE
    | TIMESTAMP
    | TIME
    | TIMESTAMPZ
    | BIGINT
    | REAL
    | BOOLEAN
    | JSON
    | JSONB
    | INET
    | CIDR
    | MACADDR
    | BYTEA
    | OID
    | INDEX
    | DOUBLE
    | PRECISION
    | SUM
    | AVG
    | COUNT
    | MIN
    | MAX
    | RANK
    | RANDOM
    | MD5
    | CHARACTER
    | VARYING
    | COMMIT
    | BEGIN
    | ROLLBACK
    | ALTER
    | DATABASE
    | PASSWORD
    | ADD
    | DROP
    | TYPE
    | RENAME
    | OWNER
    | LOGIN
    | NOLOGIN 
    | SUPERUSER
    | NOSUPERUSER
    | CREATEDB
    | NOCREATEDB
    | CREATEROLE
    | NOCREATEROLE
    | CASCADE
    | RESTRICT
    | IF
    | EXISTS
    | ROLE
    | VALUES
    | REVOKE
    | PRIVILEGES
    | REPLACE
    | VIEW
    ;

tipo_dato: INT 
         | DECIMAL (PARENTA NUM (COMA NUM)? PARENTC)?
         | NUMERIC (PARENTA NUM (COMA NUM)? PARENTC)?
         | CHAR (PARENTA NUM PARENTC)? 
         | VARCHAR (PARENTA NUM PARENTC)? 
         | CHARACTER VARYING (PARENTA NUM PARENTC)? 
         | TEXT | INTEGER | SMALLINT | SERIAL | DATE 
         | TIMESTAMP (PARENTA NUM PARENTC)?
         | TIME (PARENTA NUM PARENTC)?
         | TIMESTAMPZ (PARENTA NUM PARENTC)?
         | BIGINT | REAL | BOOLEAN | JSON | JSONB | INET | CIDR | MACADDR | BYTEA | OID ;


identi: IDF | palabras_no_reservadas;

setencia: select PUNTOCOMA | create PUNTOCOMA | expr PUNTOCOMA | delete PUNTOCOMA | update PUNTOCOMA | alter PUNTOCOMA | drop PUNTOCOMA
        | insert PUNTOCOMA | grant PUNTOCOMA  | revoke PUNTOCOMA | transaccion PUNTOCOMA;

select: SELECT lista_columnas 
        (FROM lista_tablas)? 
        (WHERE expr)? 
        (GROUP BY lista_expresiones)? 
        (HAVING expr)?
        (ORDER BY lista_ordenamiento)? 
        (LIMIT NUM)?;

lista_expresiones: expr (COMA expr)*;

tabla_origen: identi ((AS)? identi)?
            | PARENTA select PARENTC ((AS)? identi)?;

join: (INNER)? JOIN tabla_origen ON expr
    | (LEFT | RIGHT | FULL) (OUTER)? JOIN tabla_origen ON expr
    | CROSS JOIN tabla_origen;

tabla_ref: tabla_origen (join)*;

ordenamiento: expr (ASC | DESC)?;
lista_ordenamiento: ordenamiento (COMA ordenamiento)*;

lista_columnas: MULTIPLICACION | expr (COMA expr)*;

lista_tablas: tabla_ref (COMA tabla_ref)*;

referencia_columna: identi 
                  | identi PUNTO identi
                  | identi PUNTO identi PUNTO identi;

funciones_agg: SUM PARENTA expr PARENTC
          | AVG PARENTA expr PARENTC
          | COUNT PARENTA (MULTIPLICACION | expr) PARENTC
          | MIN PARENTA expr PARENTC
          | MAX PARENTA expr PARENTC
          | RANK PARENTA expr PARENTC
          | RANDOM PARENTA PARENTC
          | MD5 PARENTA expr PARENTC;

create: create_schema 
      | create_database
      | create_user 
      | create_table
      | create_index
      | create_view;

create_schema: CREATE SCHEMA identi ;
create_database: CREATE DATABASE identi ;
create_user: CREATE (USER | ROLE) identi (WITH)? (PASSWORD CADENA)? ;
create_table: CREATE TABLE identi PARENTA lista_columnas_def PARENTC;
create_view: CREATE VIEW identi AS select;

restriccion_col: PRIMARY KEY
               | NOT NULL
               | NOTNULL 
               | CHECK PARENTA expr PARENTC
               | UNIQUE
               | DEFAULT expr
               | REFERENCES identi (PARENTA identi PARENTC)?
               ;

lista_identi: identi (COMA identi)*;

restricciones_tabla: (CONSTRAINT identi)? PRIMARY KEY PARENTA lista_identi PARENTC
                   | (CONSTRAINT identi)? FOREIGN KEY PARENTA lista_identi PARENTC REFERENCES identi PARENTA lista_identi PARENTC
                   | (CONSTRAINT identi)? UNIQUE PARENTA lista_identi PARENTC
                   | (CONSTRAINT identi)? CHECK PARENTA expr PARENTC
                   ;

elemento_tabla: columna_def | restricciones_tabla;
lista_columnas_def: elemento_tabla (COMA elemento_tabla)*;
columna_def: identi tipo_dato (restriccion_col)*;

create_index: CREATE (UNIQUE)? INDEX identi ON identi (USING identi)? PARENTA lista_ordenamiento PARENTC;

delete: DELETE FROM tabla_origen (WHERE expr)?;

update: UPDATE tabla_origen SET asignacion_upd (COMA asignacion_upd)* (WHERE expr)?;

asignacion_upd: referencia_columna IGUAL expr;

alter_accion: ADD (COLUMN)? columna_def
            | DROP (COLUMN)? identi
            | ADD restricciones_tabla
            | DROP CONSTRAINT identi
            | ALTER (COLUMN)? identi SET tipo_dato
            | ALTER (COLUMN)? identi SET DEFAULT expr
            | ALTER (COLUMN)? identi DROP DEFAULT
            | ALTER (COLUMN)? identi (SET | DROP) NOT NULL
            | RENAME (COLUMN)? identi TO identi
            | RENAME TO identi
            ;
alter: alter_table | alter_schema | alter_database | alter_user | alter_index;

alter_table: ALTER TABLE identi alter_accion (COMA alter_accion)*
     | ALTER TABLE identi RENAME TO identi;

alter_schema: ALTER SCHEMA identi RENAME TO identi
            | ALTER SCHEMA identi OWNER TO identi;

alter_database: ALTER DATABASE identi RENAME TO identi
              | ALTER DATABASE identi OWNER TO identi;

opcion_usuario: LOGIN | NOLOGIN 
              | SUPERUSER | NOSUPERUSER 
              | CREATEDB | NOCREATEDB 
              | CREATEROLE | NOCREATEROLE;

alter_user: ALTER (USER | ROLE) identi RENAME TO identi
           | ALTER (USER | ROLE) identi (WITH)? PASSWORD CADENA
           | ALTER (USER | ROLE) identi (WITH)? (opcion_usuario)+
           ;

alter_index: ALTER INDEX identi RENAME TO identi
            | ALTER ;

drop: drop_table | drop_schema | drop_user | drop_database | drop_index | drop_view;

drop_table: DROP TABLE (IF EXISTS)? lista_identi (CASCADE | RESTRICT)?;
drop_schema: DROP SCHEMA (IF EXISTS)? identi (CASCADE | RESTRICT)?;
drop_database: DROP DATABASE (IF EXISTS)? identi;
drop_user: DROP (USER | ROLE) (IF EXISTS)? lista_identi;
drop_index: DROP INDEX (IF EXISTS)? lista_identi (CASCADE | RESTRICT);
drop_view: DROP VIEW (IF EXISTS)? lista_identi (CASCADE | RESTRICT);

valores_fila: PARENTA lista_expresiones PARENTC;

insert: INSERT INTO identi (PARENTA lista_identi PARENTC)? VALUES valores_fila (COMA valores_fila)*;

privilegios: INSERT | DELETE | UPDATE | CREATE | INSERT | ALL (PRIVILEGES)?;

lista_previ: privilegios (COMA privilegios)*;

grant: GRANT lista_previ ON (TABLE)? identi TO identi;

revoke: REVOKE lista_previ ON (TABLE)? identi TO identi;

transaccion: BEGIN (TRANSACTION)?
           | COMMIT (TRANSACTION)?
           | ROLLBACK (TRANSACTION)?;

expr: PARENTA expr PARENTC
    | NOT expr
    | expr (MULTIPLICACION | DIVISION) expr
    | expr SUMA expr
    | expr RESTA expr
    | expr (IGUAL | COMP1 | COMP2 | COMPIG1 | COMPIG2 | LIKE | ILIKE) expr
    | expr AND expr
    | expr OR expr
    | PARENTA select PARENTC
    | funciones_agg
    | referencia_columna
    | NUM
    | CADENA
    | TRUE | FALSE | NULL
    ;


SELECT: 'SELECT';
FROM: 'FROM';
CREATE: 'CREATE';
WHERE: 'WHERE';
CHECK: 'CHECK';
GROUP:'GROUP';
LIKE: 'LIKE';
ILIKE: 'ILIKE';
ASC: 'ASC';
DESC: 'DESC';
TABLE: 'TABLE';
COLUMN: 'COLUMN';
ORDER: 'ORDER';
JOIN: 'JOIN';
RIGHT: 'RIGHT';
LEFT: 'LEFT';
LIMIT: 'LIMIT';
ON: 'ON';
INNER: 'INNER';
USER: 'USER';
NULL: 'NULL';
NOT: 'NOT';
NOTNULL: 'NOTNULL';
OUTER: 'OUTER';
PRIMARY: 'PRIMARY';
HAVING: 'HAVING';
GRANT: 'GRANT';
REFERENCES: 'REFERENCES';
FOREIGN: 'FOREIGN';
INSERT: 'INSERT';
INTO: 'INTO';
TRUE: 'TRUE';
FALSE: 'FALSE';
END: 'END';
DEFAULT: 'DEFAULT';
OR: 'OR';
AND: 'AND';
WITH: 'WITH';
UNIQUE: 'UNIQUE';
CONSTRAINT: 'CONSTRAINT';
AS: 'AS';
FULL: 'FULL';
CROSS: 'CROSS';
USING: 'USING';
TO: 'TO';
ALL: 'ALL';

BY: 'BY';
UPDATE: 'UPDATE';
SET: 'SET';
DELETE: 'DELETE';
SCHEMA: 'SCHEMA';
INT: 'INT';
DECIMAL: 'DECIMAL';
NUMERIC: 'NUMERIC';
CHAR: 'CHAR';
VARCHAR: 'VARCHAR';
TEXT: 'TEXT';
INTEGER: 'INTEGER';
SMALLINT: 'SMALLINT';
SERIAL: 'SERIAL';
KEY: 'KEY';
DATE: 'DATE';
TIMESTAMP: 'TIMESTAMP';
TIME: 'TIME';
TIMESTAMPZ: 'TIMESTAMPZ';
BIGINT: 'BIGINT';
REAL: 'REAL';
BOOLEAN: 'BOOLEAN';
JSON: 'JSON';
JSONB: 'JSONB';
INET: 'INET';
CIDR: 'CIDR';
MACADDR: 'MACADDR';
BYTEA: 'BYTEA';
OID: 'OID';
INDEX: 'INDEX';
DOUBLE: 'DOUBLE';
PRECISION: 'PRECISION';
SUM: 'SUM';
AVG: 'AVG';
COUNT: 'COUNT';
MIN: 'MIN';
MAX: 'MAX';
RANK: 'RANK';
RANDOM: 'RANDOM';
MD5: 'MD5';
CHARACTER: 'CHARACTER';
VARYING: 'VARYING';
COMMIT: 'COMMIT';
BEGIN: 'BEGIN';
ROLLBACK: 'ROLLBACK';
ALTER: 'ALTER';
DATABASE: 'DATABASE';
PASSWORD: 'PASSWORD';
ADD: 'ADD';
DROP: 'DROP';
TYPE: 'TYPE';
RENAME: 'RENAME';
OWNER: 'OWNER';
LOGIN: 'LOGIN';
NOLOGIN: 'NOLOGIN';
SUPERUSER: 'SUPERUSER';
NOSUPERUSER: 'NOSUPERUSER';
CREATEDB: 'CREATEDB';
NOCREATEDB: 'NOCREATEDB';
CREATEROLE: 'CREATEROLE';
NOCREATEROLE: 'NOCREATEROLE';
CASCADE: 'CASCADE';
RESTRICT: 'RESTRICT';
IF: 'IF';
EXISTS: 'EXISTS';
ROLE: 'ROLE';
VALUES: 'VALUES';
REVOKE: 'REVOKE';
PRIVILEGES: 'PRIVILEGES';
TRANSACTION: 'TRANSACTION';
REPLACE: 'REPLACE';
VIEW: 'VIEW';

SUMA: '+' ;
RESTA: '-' ;
MULTIPLICACION: '*' ;
DIVISION: '/' ;
IGUAL: '=' ;
COMA: ',' ;
PUNTO: '.' ;
PARENTA: '(';
PARENTC: ')';
PUNTOCOMA: ';' ;
ORSIMB: '|';
NOTSIMB: '~';
EXCLAMACION: '!' ;
ANDSIMB: '&';
PREGUNTA: '?' ;
PORCENTAJE: '%' ;
GATO: '#' ;
ARROBA: '@' ;
POTENCIA: '^' ;
COMP1: '<' ;
COMP2: '>' ;
COMPIG1: '<=' ;
COMPIG2: '>=' ;

CADENA: '\'' ( '\'\'' | ~'\'' )* '\'' ;
NUM: [+-]?[0-9]+('.'[0-9]+)?('e'[+-]?[0-9]+)? ;
IDF: ([a-z_][a-z_0-9$]*) | ('"' ( '""' | ~'"' )* '"') ;

COMENTARIO_LINEA : '--' ~[\r\n]* -> skip ;
COMENTARIO_BLOQUE : '/*' .*? '*/' -> skip ;
WS: [ \t\r\n]+ -> skip ;