grammar Expr;

root: expr EOF ;    

expr: NUM | Identificador ;

NMPAP: 'nmap';
SS: 'ss';
SUDO: 'sudo';
TCPDUMP: 'tcpdump';
JOURNALCTL: 'journalctl';
DIG:'dig';
UFW: 'ufw';
DENY: 'deny';
FROM: 'from';


IP: [0-9]+'.'[0-9]+'.'[0-9]+'.'[0-9]+('/'[0-9]+)?;
BANDERA_C: '-'[A-Za-z]+;
BANDERA_L: '--'[A-Za-z0-9\-]+;
TIMING: '-T'[0-5];
DOMINIO: [a-zA-Z]+'.'[a-z]+;
UBICACION_ARCH: '/' [a-zA-Z0-9_.\-]+ ('/' [a-zA-Z0-9_.\-]+)* ;

Coma: ',';
PuntoComa: ';';
Igual: '=';
Punto: '.';

Cadena: '"' ~["\r\n]* '"';

NUM: [0-9]+;
Identificador: [a-zA-Z][a-zA-Z_0-9]*;

WS: [ \t\r\n]+ -> skip ;