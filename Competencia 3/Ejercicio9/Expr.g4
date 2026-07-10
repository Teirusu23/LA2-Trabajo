grammar Expr;

root : expr EOF;

expr:  IF ParentA expr COMP expr ParentC
       | NUM | Identificador;

IF: 'if';
ParentA: '(';
COMP: '>';
ParentC: ')';
NUM: [0-9]+;
Identificador: [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;
