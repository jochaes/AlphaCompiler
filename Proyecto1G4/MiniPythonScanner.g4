
//Scanner Mini Python
//Proyecto 1: Scanner Mini Python
//Estudiante: Josué Chaves

lexer grammar MiniPythonScanner;


tokens {INDENT, DEDENT}
 //import com.yuvalshavit.antlr4.DenterHelper;
@lexer::header{
    import com.yuvalshavit.antlr4.DenterHelper;
}

@lexer::members{
//    private final DenterHelper denter = new DenterHelper(NL, MiniPythonScanner.INDENT, MiniPythonScanner.DEDENT) {
//        @Override
//        public Token pullToken(){
//            return MiniPythonScanner.super.nextToken();
//        }
//    };
    private final DenterHelper denter = DenterHelper.builder()
        .nl(NEWLINE)
        .indent(MiniPythonScanner.INDENT)
        .dedent(MiniPythonScanner.DEDENT)
        .pullToken(MiniPythonScanner.super::nextToken);

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
SUBSTRACTIONASSIGNMENTOP:'-=';
ADDITIONASSIGNMENTOP: '+=';
LESSTHAN            : '<';
GREATERTHAN         : '>';
LESSTHANEQUAL       : '<=';
GREATERTHANEQUAL    : '>=';
COMPARISON          : '==';

//palabras reservadas
IN                  : 'in';
DEF                 : 'def';
IF                  : 'if';
WHILE               : 'while';
FOR                 : 'for';
ELSE                : 'else';
DO                  : 'do';
CONST               : 'const';
VAR                 : 'var';
RETURN              : 'return';
PRINT               : 'print';
LEN                 : 'len';

IDENTIFIER : LETTER (LETTER|DIGIT)* ;
INTEGER : DIGIT DIGIT* ;
FLOAT : DIGIT DIGIT* '.' DIGIT DIGIT*;
CHARCONST : SINGLEQUOTE (LETTER|DIGIT) SINGLEQUOTE;       //TAREA: CHARLIT para crear literales de char: x:='h'
STRING: DOUBLEQUOTES .*? DOUBLEQUOTES;  //TAREA: STRLIT para crear literales de String: x:="hola"

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9' ;

NEWLINE: ('\r'? '\n' (' ' | '\t')*);

WS  : [ \r\n\t]+ -> skip ;

LINECOMMENT: '#' ~[\r\n]* -> skip;
COMMENT: '"""' .*? '"""' -> skip;
