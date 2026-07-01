grammar Expr;

root : expr EOF;

expr : expr MENOS expr | NUM;
IF: 'if';
MAYOR_QUE : '>';
NUM : [0-9]+;
IDENTIFICADOR:[a-zA-Z]+; 
MENOS : '-';

WS : [ \t\r\n]+ -> skip;