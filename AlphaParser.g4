//Algoritmo de Descenso recursivo
//Tarea 1: Parser
//Estudiante: Josué Chaves

//Constantes y tipos String
// Para las declaraciones de constantes strings de la manera:
//      const ID~"hola"
// Se agrega al primaryExpression un or que verifique STRLIT
//
// Para los tipos String de la manera:
//      var y:string
//Se agrega un or que verifique STRING en TypeDenoter

//Constantes y tipos Char
// Para las declaraciones de constantes char de la manera:
//      const ID~'h'
// Se agrega al PrimaryExpression un or que verifique CHARLIT
//
// Para los tipos Char de la manera:
//      var y:char
//Se agrega un or que verifique CHAR en parseTypeDenoter


//Declaración y uso de métodos

//Declaración de Métodos de la manera:
// def ID(x:int, y:string){command}
// Se verifica en SingleDeclaration, que se cumpla lo siguiente:
//DEF ID (PIZQ PDER | PIZQ ID DOSPUN typedenoter (COMA ID DOSPUN typedenoter)* PDER ) CIZQ command CDER

//Uso de Métodos
//Uso de métodos de la manera:
// ID(x,"y",'z',10)
//Se agrega al single command en el primer OR, la validación de
// PIZQ expression (COMA expression)* PDER
// Para que puedan haber varias expresiones dentro de () cuando ID()



parser grammar AlphaParser;

options {
  tokenVocab = AlphaScanner;
}

program : singleCommand;
command : singleCommand (PyCOMA singleCommand)* ;
                                        //Para uso de métodos
singleCommand : ID ( ASSIGN expression | PIZQ expression (COMA expression)* PDER )
        | IF expression THEN singleCommand ELSE singleCommand
        | WHILE expression DO singleCommand
        | LET declaration IN singleCommand
        | BEGIN command END;

declaration  : singleDeclaration (PyCOMA singleDeclaration)*;
                                                                          //Para declaración de métodos:
singleDeclaration : CONST ID VIR expression | VAR ID DOSPUN typedenoter | DEF ID (PIZQ PDER | PIZQ ID DOSPUN typedenoter (COMA ID DOSPUN typedenoter)* PDER ) CIZQ command CDER;

                  //Tipos CHAR y STRING
typedenoter : INTEGER | CHAR | STRING;
expression : primaryExpression (operator primaryExpression)*;
                                               //Literales CHAR y STRING
primaryExpression : NUM | ID | PIZQ expression PDER | CHARLIT | STRLIT;
operator : SUM | SUB | MUL | DIV;