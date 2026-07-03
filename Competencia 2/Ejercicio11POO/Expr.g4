grammar Expr;

root: expr EOF ;    

expr: NUM | IDENTIFICADOR ;

PUBLIC: 'public';
CLASS: 'class';
LLAVEA: '{';
STATIC: 'static';
VOID: 'void';
ParentA: '(';
STRING: 'String';
CorchA: '[';
CorchC: ']';
INT: 'int';
Igual: '=';
MAYOR: '+';
Punto: '.';
ParentC: ')';
PuntoComa: ';';
LLAVEC: '}';
CADENA : '"' ~["\r\n]* '"' ;
NUM: [0-9]+ ;
IDENTIFICADOR: [_a-zA-Z][a-zA-Z0-9_]* ;
WS: [ \t\r\n]+ -> skip ;