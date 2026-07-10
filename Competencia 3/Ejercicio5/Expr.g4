grammar Expr;

root : expr EOF;

expr:  PRINT expr | String | Identificador;

PRINT: 'print';
String : '"' ~["\r\n]* '"' ;
Identificador: [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;