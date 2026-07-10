grammar Expr;

root : expr EOF;

expr: NUM MAS NUM | NUM;

NUM : [0-9]+;
MAS : '+';
IDENTIFICADOR:[a-zA-Z]+; 


WS : [ \t\r\n]+ -> skip;