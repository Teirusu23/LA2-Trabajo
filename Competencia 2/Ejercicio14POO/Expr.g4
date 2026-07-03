grammar Expr;

root: expr EOF ;    

expr: NUM | Identificador ;

CREATE: 'CREATE';
TABLE: 'TABLE';
PRIMARY: 'primary';
NOT: 'NOT';
NULL: 'NULL';
INSERT: 'INSERT';
INTO: 'INTO';
SELECT: 'SELECT';
FROM: 'FROM';
INNER: 'INNER';
JOIN: 'JOIN';
ON: 'ON';
WHERE: 'WHERE';

ParentA: '(';
ParentC: ')';
Coma: ',';
PuntoComa: ';';
Igual: '=';
Punto: '.';

Cadena: '\'' ~[\r\n]* '\'';


NUM: [0-9]+;

Identificador: [a-zA-Z_][a-zA-Z_0-9$]*;



WS: [ \t\r\n]+ -> skip ;