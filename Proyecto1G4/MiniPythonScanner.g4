
//Scanner Mini Python
//Proyecto 1: Scanner Mini Python
//Estudiante: Josué Chaves

lexer grammar MiniPythonScanner;


tokens {INDENT, DEDENT}

@lexer::header{
    import com.yuvalshavit.antlr4.DenterHelper;
}

@lexer::members{
    private final DenterHelper denter = new DenterHelper(NL, MiniPythonScanner.INDENT, MiniPythonScanner.DEDENT) {
        @Override
        public Token pullToken(){
            return MiniPythonScanner.super.nextToken();
        }
    };

    @Override
    public Token nextToken(){
        return denter.nextToken();
    }
}

//Symbols
COMMA               : ',';
COLON               : ':';
OPENPARENTHESIS     : '(';
CLOSEPARENTHESIS    : ')';
OPENCURLYBRACE      : '{';
CLOSECURLYBRACE     : '}';
OPENSQRBRACKET      : '[';
CLOSESQRBRACKET     : ']';

DOUBLEQUOTES        : '"';
SINGLEQUOTE         : '\'';

PLUSSIGN            : '+';
MINUSSIGN           : '-';
ASTERISK            : '*';
SLASH               : '/';

ASSIGNMENT          : '=';
LESSTHAN            : '<';
GREATERTHAN         : '>';
LESSTHANEQUAL       : '<=';
GREATERTHANEQUAL    : '>=';
COMPARISON          : '==';

//palabras reservadas
DEF                 : 'def';
IF                  : 'if';
WHILE               : 'while';
FOR                 : 'for';
//LET     : 'let';
//THEN    : 'then';
ELSE                : 'else';
IN                  : 'in';
DO                  : 'do';
//BEGIN   : 'begin';
//END     : 'end';
CONST               : 'const';
VAR                 : 'var';
RETURN              : 'return';
PRINT               : 'print';
LEN                 : 'len';
//CHAR                : 'char';
//STRING              : 'string';
//INTEGER             : 'int';


IDENTIFIER : LETTER (LETTER|DIGIT)* ;
INTEGER : DIGIT DIGIT* ;
FLOAT : DIGIT DIGIT* '.' DIGIT DIGIT*;
CHARCONST : SINGLEQUOTE (LETTER|DIGIT) SINGLEQUOTE;       //TAREA: CHARLIT para crear literales de char: x:='h'
STRING: DOUBLEQUOTES IDENTIFIER (IDENTIFIER|[ \t\n\r]+)* DOUBLEQUOTES;  //TAREA: STRLIT para crear literales de String: x:="hola"

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9' ;

NEWLINE : '\n';
NL: ('\r'? '\n' ' '*);
WS  : [ \n]+ -> skip ;
