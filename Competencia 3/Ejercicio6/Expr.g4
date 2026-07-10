grammar Expr;

root : expr EOF;

expr:  expr Multi expr
       | expr MAS expr
       | NUM | Identificador;

MAS: '+';
Multi: '*';
NUM: [0-9]+;
Identificador: [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;