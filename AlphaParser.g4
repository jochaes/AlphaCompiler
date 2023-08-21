parser grammar AlphaParser;

options {
  tokenVocab = AlphaScanner;
}

program : singleCommand;
command : singleCommand (PyCOMA singleCommand)* ;
singleCommand : ID ( ASSIGN expression | PIZQ expression PDER )
        | IF expression THEN singleCommand ELSE singleCommand
        | WHILE expression DO singleCommand
        | LET declaration IN singleCommand
        | BEGIN command END;

declaration  : singleDeclaration (PyCOMA singleDeclaration)*;

singleDeclaration : CONST ID VIR expression | VAR ID DOSPUN typedenoter | DEF ID (PIZQ PDER | PIZQ ID DOSPUN typedenoter (COMA ID DOSPUN typedenoter)* PDER ) CIZQ command CDER;

typedenoter : INTEGER | CHAR | STRING;
expression : primaryExpression (operator primaryExpression)*;
//Se agregan las últimas dos de primaryExpression para verifiar "ddd" string o '1' 'd' char
primaryExpression : NUM | ID | PIZQ expression PDER | CHARLIT | STRLIT;
operator : SUM | SUB | MUL | DIV;


//parser grammar AlphaParser;
//
//options {
//  tokenVocab = AlphaScanner;
//}
//
//program : singleCommand EOF;
//command : singleCommand (PyCOMA singleCommand)* ;
//singleCommand : ID ( ASSIGN expression
//                     | PIZQ expression PDER )
//        | IF expression THEN singleCommand
//                        ELSE singleCommand
//        | WHILE expression DO singleCommand
//        | LET declaration IN singleCommand
//        | BEGIN command END ;
//declaration  : singleDeclaration (PyCOMA singleDeclaration)* ;
//singleDeclaration : CONST ID VIR expression
//    	   | VAR ID DOSPUN typedenoter ;
//typedenoter : ID ;
//expression : primaryExpression (operator primaryExpression)* ;
//primaryExpression : NUM | ID | PIZQ expression PDER ;
//operator : SUM | SUB | MUL | DIV ;
