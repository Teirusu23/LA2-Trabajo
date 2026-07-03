grammar Expr;

root : expr EOF;

expr : expr MAS expr | NUM;
IF: 'if';
MAYOR_QUE : '>';
NUM : [0-9]+;
IDENTIFICADOR:[a-zA-Z]+; 
MAS : '+';

WS : [ \t\r\n]+ -> skip;