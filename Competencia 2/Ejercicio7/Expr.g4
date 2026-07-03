grammar Expr;

root : expr EOF;

expr: EOF;

INT: 'int';
IGUAL: '=';
NUM: [0-9]+;
Identificador: [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;