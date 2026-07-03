grammar Expr;

root : expr EOF;

expr: EOF;

NUM : [0-9]+;
MAS : '+';
IDENTIFICADOR:[a-zA-Z]+; 


WS : [ \t\r\n]+ -> skip;