grammar Expr;

root : expr EOF;

expr: IF Identificador Comp NUM 
      | IF NUM Comp Identificador 
      | IF Identificador Comp Identificador
      | NUM;

IF: 'if';
Comp: '>';
NUM: [0-9]+;
Identificador: [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip;