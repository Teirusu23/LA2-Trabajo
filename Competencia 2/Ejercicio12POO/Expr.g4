grammar Expr;

root: expr EOF ;    

expr: NUM | IDENTIFICADOR ;

PUBLIC: 'public';
CLASS: 'class';
LlaveA: '{';
STATIC: 'static';
VOID: 'void';
ParentA: '(';
STRING: 'String';
CorchA: '[';
CorchC: ']';
ParentC: ')';
INT: 'int';
Igual: '=';
PuntoComa: ';' ;
IF: 'if';
CompIg: '>=';
LlaveC: '}';
Punto: '.';
Suma: '+';

CADENA : '"' ~["\r\n]* '"' ;
NUM: [0-9]+ ;
IDENTIFICADOR: [_a-zA-Z][a-zA-Z0-9_]* ;

WS: [ \t\r\n]+ -> skip ;