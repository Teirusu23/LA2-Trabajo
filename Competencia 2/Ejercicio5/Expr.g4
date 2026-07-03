grammar Expr;

root : expr EOF;

expr: EOF;

PRINT: 'print';
String : '"' ~["\r\n]* '"' ;
Identificador: [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;