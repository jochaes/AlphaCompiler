//Tarea 1: Parser
//Estudiante: Josué Chaves

lexer grammar AlphaScanner;

//símbolos
PyCOMA  : ';';
COMA    : ',';     //TAREA: Se agrega la coma para poder utilizar varias expresiones en las declaraciones y uso de metodos
ASSIGN  : ':=';
PIZQ    : '(';
PDER    : ')';
CIZQ    :'{';
CDER    :'}';
VIR     : '~';
DOSPUN  : ':';
DOUBLEQUOTES: '"';   //TAREA: Se agrega ", para que una expression pueda ser un string
SINGLEQUOTE: '\'';   //TAREA: Se agrega ', para que una expression pueda ser un char
SUM     : '+';
SUB     : '-';
MUL     : '*';
DIV     : '/';

//palabras reservadas
DEF     : 'def';   //TAREA: Se agrega DEF para indicar que inicia un método
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
CHAR    : 'char';    //TAREA: Se agrega CHAR para verificacion de tipo char
STRING  : 'string';  //TAREA: Se agrega STRING para verificacion de tipo string
INTEGER : 'int';


ID : LETTER (LETTER|DIGIT)* ;
NUM : DIGIT DIGIT* ;
CHARLIT : SINGLEQUOTE (LETTER|DIGIT) SINGLEQUOTE;       //TAREA: CHARLIT para crear literales de char: x:='h'
STRLIT: DOUBLEQUOTES ID (ID|[ \t\n\r]+)* DOUBLEQUOTES;  //TAREA: STRLIT para crear literales de String: x:="hola"

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