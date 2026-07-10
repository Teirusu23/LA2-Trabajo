grammar Expr;

root : expr EOF;

expr: NUM MENOS NUM | NUM;

NUM : [0-9]+;
MENOS : '-';
IDENTIFICADOR:[a-zA-Z]+; 


WS : [ \t\r\n]+ -> skip;