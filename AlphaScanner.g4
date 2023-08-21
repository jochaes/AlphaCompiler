lexer grammar AlphaScanner;

//símbolos
PyCOMA  : ';';
COMA    : ',';
ASSIGN  : ':=';
PIZQ    : '(';
PDER    : ')';
VIR     : '~';
DOSPUN  : ':';
DOUBLEQUOTES: '"';   //TAREA: Se agrega ", para que una expression pueda ser un string
SINGLEQUOTE: '\'';   //TAREA: Se agrega ', para que una expression pueda ser un char
SUM     : '+';
SUB     : '-';
MUL     : '*';
DIV     : '/';

//palabras reservadas
IF      : 'if';
WHILE   : 'while';
LET     : 'let';
THEN    : 'then';
ELSE    : 'else';
IN      : 'in';
DO      : 'do';
BEGIN   : 'begin';
END     : 'end';
CONST   : 'const';
VAR     : 'var';
CHAR    : 'char';
STRING  : 'string';
INTEGER : 'int';


ID : LETTER (LETTER|DIGIT)* ;    //TAREA: Se toma el ID cómo String Literal
NUM : DIGIT DIGIT* ;
CHARLIT : SINGLEQUOTE (LETTER|DIGIT) SINGLEQUOTE;
STRLIT: DOUBLEQUOTES ID (ID|[ \t\n\r]+)* DOUBLEQUOTES;

fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment DIGIT : '0'..'9' ;


WS  :   [ \t\n\r]+ -> skip ;


//lexer grammar AlphaScanner;
////símbolos
//PyCOMA  : ';';
//ASSIGN  : ':=';
//PIZQ    : '(';
//PDER    : ')';
//VIR     : '~';
//DOSPUN  : ':';
//
//SUM     : '+';
//SUB     : '-';
//MUL     : '*';
//DIV     : '/';
//
////palabras reservadas
//IF      : 'if' ;
//WHILE   : 'while';
//LET     : 'let';
//THEN    : 'then';
//ELSE    : 'else';
//IN      : 'in';
//DO      : 'do';
//BEGIN   : 'begin';
//END     : 'end';
//CONST   : 'const';
//VAR     : 'var';
//
//
//ID : LETTER (LETTER|DIGIT)* ;
//NUM : DIGIT DIGIT* ;
//
//fragment LETTER : 'a'..'z' | 'A'..'Z';
//fragment DIGIT : '0'..'9' ;
//
//WS  :   [ \t\n\r]+ -> skip ;