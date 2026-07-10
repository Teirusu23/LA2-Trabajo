grammar Expr;

root : expr EOF;

expr:  INT Identificador IGUAL expr
       |Identificador | NUM;

INT: 'int';
IGUAL: '=';
NUM: [0-9]+;
Identificador: [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;
