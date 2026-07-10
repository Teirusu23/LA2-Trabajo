grammar Expr;

root : expr EOF;

expr:  PRINT ParentA expr ParentC PuntoComa
       | Identificador | String;

PRINT: 'print';
ParentA: '(';
ParentC: ')';
PuntoComa: ';';
String : '"' ~["\r\n]* '"' ;
Identificador: [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;
