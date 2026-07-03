grammar Expr;

root: expr EOF ;    

expr: NUM | Identificador ;

UPDATE: 'UPDATE';
SET: 'SET';
WHERE: 'WHERE';

Coma: ',';
PuntoComa: ';';
Igual: '=';
Punto: '.';

Cadena: '\'' ~['\r\n]* '\'';

NUM: [0-9]+;
Identificador: [a-zA-Z_][a-zA-Z_0-9$]*;

WS: [ \t\r\n]+ -> skip ;