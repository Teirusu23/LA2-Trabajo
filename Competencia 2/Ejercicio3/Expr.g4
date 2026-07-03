grammar Expr;

root : expr EOF;

expr: EOF;

NUM: [0-9]+;
Igual: '=';
Identificador: [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;