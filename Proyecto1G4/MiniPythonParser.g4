//Algoritmo de Descenso recursivo
//Proyecto 1: Parser Mini Python
//Estudiante: Josué Chaves


parser grammar MiniPythonParser;

options {
  tokenVocab = MiniPythonScanner;
}

program : singleCommand                                                                             #programAST;
command : singleCommand (PyCOMA singleCommand)*                                                     #commandAST;
                                        //Para uso de métodos
singleCommand :
        ID  ASSIGN expression                                                                       #assignSCAST
        | ID PIZQ expression (COMA expression)* PDER                                                #callSCAST
        | IF expression THEN singleCommand ELSE singleCommand                                       #ifSCAST
        | WHILE expression DO singleCommand                                                         #whileSCAST
        | LET declaration IN singleCommand                                                          #letSCAST
        | BEGIN command END                                                                         #blockSCAST;

declaration  : singleDeclaration (PyCOMA singleDeclaration)*                                        #declarationAST;
                                                                          //Para declaración de métodos:
singleDeclaration :
        CONST ID VIR expression                                                                     #constSDAST
        | VAR ID DOSPUN typedenoter                                                                 #varSDAST
        | DEF ID (PIZQ PDER | PIZQ ID DOSPUN typedenoter (COMA ID DOSPUN typedenoter)* PDER ) CIZQ command CDER #defSDAST;

                  //Tipos CHAR y STRING
typedenoter :
        INTEGER                                                                                     #intTDAST
        | CHAR                                                                                      #charTDAST
        | STRING                                                                                    #stringTDAST;
expression : primaryExpression (operator primaryExpression)*                                        #expressionAST;
                                               //Literales CHAR y STRING
primaryExpression :
        NUM                                                                                         #numPEAST
        | ID                                                                                        #idPEAST
        | PIZQ expression PDER                                                                      #expPEAST
        | CHARLIT                                                                                   #charPEAST
        | STRLIT                                                                                    #strPEAST;
operator : SUM | SUB | MUL | DIV                                                                    #operator;