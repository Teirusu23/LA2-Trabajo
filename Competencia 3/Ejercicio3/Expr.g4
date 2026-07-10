grammar Expr;

root : expr EOF;

expr: Identificador Igual NUM | Identificador Igual Identificador | NUM;

NUM: [0-9]+;
Igual: '=';
Identificador: [a-zA-Z]+;


WS : [ \t\r\n]+ -> skip;