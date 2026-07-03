grammar Expr;

root : expr EOF;

expr: EOF;

IF: 'if';
Comp: '>';
NUM: [0-9]+;
Identificador: [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;