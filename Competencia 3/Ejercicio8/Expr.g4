grammar Expr;

root : expr EOF;

expr:  expr CompIg expr
       | NUM | Identificador;

CompIg: '>=';
NUM: [0-9]+;
Identificador: [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;
