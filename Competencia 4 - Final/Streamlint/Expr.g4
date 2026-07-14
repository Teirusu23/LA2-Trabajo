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

setencia: select PUNTOCOMA | expr PUNTOCOMA;

select: SELECT lista_columnas 
        (FROM lista_tablas)? 
        (WHERE expr)? 
        (GROUP BY lista_expresiones)? 
        (HAVING expr)?
        (ORDER BY lista_ordenamiento)? 
        (LIMIT NUM)?;

lista_expresiones: expr (COMA expr)*;

ordenamiento: expr (ASC | DESC)?;
lista_ordenamiento: ordenamiento (COMA ordenamiento)*;

lista_columnas: MULTIPLICACION | expr (COMA expr)*;

lista_tablas: identi (identi)? (COMA identi (identi)?)*;

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

expr: PARENTA expr PARENTC
    | NOT expr
    | expr (MULTIPLICACION | DIVISION) expr
    | expr SUMA expr
    | expr RESTA expr
    | expr (IGUAL | COMP1 | COMP2 | COMPIG1 | COMPIG2 | LIKE | ILIKE) expr
    | expr AND expr
    | expr OR expr
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