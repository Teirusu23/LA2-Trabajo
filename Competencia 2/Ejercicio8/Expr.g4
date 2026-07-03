grammar Expr;

root : expr EOF;

expr: EOF;

CompIg: '>=';
NUM: [0-9]+;
Identificador: [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;