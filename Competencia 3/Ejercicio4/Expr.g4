grammar Expr;

root : expr EOF;

expr: IF Comp NUM | IF Comp Identificador | NUM;

IF: 'if';
Comp: '>';
NUM: [0-9]+;
Identificador: [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;