grammar Expr;

root: expr EOF ;    

expr: NUM | IDENTIFICADOR ;

CREATE: [CREATEcreate];


WS: [ \t\r\n]+ -> skip ;