grammar Expr;

root : expr EOF;

expr: EOF;

PRINT: 'print';
ParentA: '(';
ParentC: ')';
PuntoComa: ';';
String : '"' ~["\r\n]* '"' ;
Identificador: [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;