import generated.AlphaScanner;
import org.antlr.v4.runtime.Token;

//Algoritmo de Descenso recursivo
//Tarea 1: Parser
//Estudiante: Josué Chaves

//Constantes y tipos String
// Para las declaraciones de constantes strings de la manera:
//      const ID~"hola"
// Se agrega al parsePrimaryExpression un if que verifique STRLIT
//
// Para los tipos String de la manera:
//      var y:string
//Se agrega un if que verifique STRING en parseTypeDenoter

//Constantes y tipos Char
// Para las declaraciones de constantes char de la manera:
//      const ID~'h'
// Se agrega al parsePrimaryExpression un if que verifique CHARLIT
//
// Para los tipos Char de la manera:
//      var y:char
//Se agrega un if que verifique CHAR en parseTypeDenoter


//Declaración y uso de métodos

//Declaración de Métodos de la manera:
// def ID(x:int, y:string){command}
// Se verifica en parseSingleDeclaration, que se cumpla lo siguiente:
//DEF ID (PIZQ PDER | PIZQ ID DOSPUN typedenoter (COMA ID DOSPUN typedenoter)* PDER ) CIZQ command CDER

//Uso de Métodos
//Uso de métodos de la manera:
// ID(x,"y",'z',10)
//Se agrega al single command en el primer if, la validación de
// PIZQ expression (COMA expression)* PDER
// Para que puedan haber varias expresiones de un ID pegado con ()


public class AlphaParserManual {

    private AlphaScanner elScanner;
    private Token tokenActual;          //Utilizar Siempre el v4

    public AlphaParserManual(AlphaScanner pElScanner) {
        this.elScanner = pElScanner;
        this.tokenActual = pElScanner.nextToken();
    }

    //Cambia al siguiente Token si el token actual es igual al expected token
    private void accept( int expectedToken ){
        if (this.tokenActual.getType() == expectedToken){
            this.tokenActual = this.elScanner.nextToken();
        }else{
            System.out.println( "Se espera el token "
                    + AlphaScanner.ruleNames[expectedToken-1]
                    + " pero viene " + AlphaScanner.ruleNames[this.tokenActual.getType()-1]
                    + "en la posicion ["+this.tokenActual.getLine() + ":" + this.tokenActual.getCharPositionInLine() + "]"
            );
        }
    }

    //Cambia el token actual al siguiente token
    private  void acceptIt(){
        this.tokenActual = this.elScanner.nextToken();
    }

    //Imprime el Error
    private void printError( String msg ){
        System.out.println(msg);
    }

    // Parser del Token No Terminal: Program
    //    program ::=
    //      singleCommand
    public void parseProgram(){
        parseSingleCommand();
    }


    // Parser del Token No Terminal: command
    //    command ::=
    //                singleCommand (; singleCommand)*
    public void parseCommand(){
        parseSingleCommand();

        //Cuando uno define un Token, el token no es sólo en nombre
        //Los scanner cuando detecta un token devuelve un objeto con 4 cosas,
        // Varibale, fila, columna,
        //Acá preguntamos si el tipo de token actual sea
        while(this.tokenActual.getType() == AlphaScanner.PyCOMA){
            acceptIt(); //Next token
            parseSingleCommand();
        }
    }

    // Parser del Token No Terminal: singleCommand
    //    singleCommand ::=
    //                  Identifier (:= expression | ( expression ))
    //                  | if expression then singleCommand else singleCommand
    //                  | while expression do singleCommand
    //                  | let declaration in singleCommand
    //                  | begin command end
    //Identificar el conjunto de iniciadores de esa regla, cuando hay varias opciones, estos son los terminales
    public void parseSingleCommand(){
        if (tokenActual.getType() == AlphaScanner.ID){  //si el token actual es un identificador
            acceptIt();

            if ( tokenActual.getType() == AlphaScanner.ASSIGN ){
                acceptIt();
                parseExpression();

            }else if( tokenActual.getType() == AlphaScanner.PIZQ ){
                acceptIt();
                parseExpression();
/*
 *
 * Uso de Métodos de la manera:
 *   ID (x,'y', "HOLA, 20)
 *
 * */
                while(this.tokenActual.getType() == AlphaScanner.COMA){
                    acceptIt();
                    parseExpression();
                }
                accept(AlphaScanner.PDER);

            }else {
                printError("Se esperaba una asignación o un aexprecion entre ()");

            }

        }else if(tokenActual.getType() == AlphaScanner.IF ) {
            acceptIt(); //Acepta el IF y lee el siguiente
            parseExpression();
            accept(AlphaScanner.THEN);
            parseSingleCommand();
            accept(AlphaScanner.ELSE);
            parseSingleCommand();
        }else if(tokenActual.getType() == AlphaScanner.WHILE ) {
            acceptIt();
            parseExpression();
            accept(AlphaScanner.DO);
            parseSingleCommand();

        }else if(tokenActual.getType() == AlphaScanner.LET ) {
            acceptIt();
            parseDeclaration();
            accept(AlphaScanner.IN);
            parseSingleCommand();
        }else if(tokenActual.getType() == AlphaScanner.BEGIN ) {
            acceptIt();
            parseCommand();
            accept(AlphaScanner.END);
        }else{
            //Se puede hacer una función que
            printError("Error, se esperaban {if,else,while,let,begin}, pero viene otra cosa");
        }
    }

    // Parser del Token No Terminal: declaration
    //    declaration ::=
    //                  singleDeclaration (; singleDeclaration)*
    public void parseDeclaration(){
        parseSingleDeclaration();

        while(this.tokenActual.getType() == AlphaScanner.PyCOMA){
            acceptIt();
            parseSingleDeclaration();
        }
    }

    // Parser del Token No Terminal: singleDeclaration
    //    singleDeclaration ::=
    //                  const Identifier ~ expression
    //                  | var Identifier : typeDenoter
    public void parseSingleDeclaration(){

        if ( tokenActual.getType() == AlphaScanner.CONST ){
            acceptIt();
            accept( AlphaScanner.ID );
            accept(AlphaScanner.VIR);
            parseExpression();

        } else if( tokenActual.getType() == AlphaScanner.VAR ){
            acceptIt();
            accept( AlphaScanner.ID );
            accept(AlphaScanner.DOSPUN);
            parseTypeDenoter();
/*
*
* Declaración de Métodos de la manera:
*   def ID(x:int,y:string){command}
*
* */
// DEF ID (PIZQ PDER | PIZQ ID DOSPUN typedenoter (COMA ID DOSPUN typedenoter)* PDER ) CIZQ command CDER
        } else if(tokenActual.getType() == AlphaScanner.DEF){
            acceptIt();
            accept(AlphaScanner.ID);
            accept(AlphaScanner.PIZQ);

            if (tokenActual.getType() == AlphaScanner.PDER){
                acceptIt();
                accept(AlphaScanner.CIZQ);
                parseCommand();
                accept(AlphaScanner.CDER);
            } else if (tokenActual.getType() == AlphaScanner.ID) {
                acceptIt();
                accept(AlphaScanner.DOSPUN);
                parseTypeDenoter();

                while(this.tokenActual.getType() == AlphaScanner.COMA){
                    acceptIt(); //Next token
                    accept(AlphaScanner.ID);
                    accept(AlphaScanner.DOSPUN);
                    parseTypeDenoter();
                }
                accept(AlphaScanner.PDER);
                accept(AlphaScanner.CIZQ);
                parseCommand();
                accept(AlphaScanner.CDER);
            }else{
                printError("Error de validación de función");
            }

        }
        else {
            printError("Debia venir un const o un var o un DEF, pero llegó otra cosa");
        }
    }

    // Parser del Token No Terminal: typeDenoter
    //    typeDenoter ::=
    //                  Identifier
    public void parseTypeDenoter(){
//        accept(AlphaScanner.ID);

        if (tokenActual.getType() == AlphaScanner.INTEGER) {
            acceptIt();
/*
 *
 * Tipos CHAR:
 *   x:char
 *
 * */
        } else if (tokenActual.getType() == AlphaScanner.CHAR) {
            acceptIt();
/*
 *
 * Tipos STRING:
 *   x:string
 *
 * */
        } else if (tokenActual.getType() == AlphaScanner.STRING) {
            acceptIt();
        }else {
            printError("Debia venir un Integer, Char o String");
        }
    }

    // Parser del Token No Terminal: expression
    //    expression ::=
    //              primaryExpression (operator primaryExpression)*
    public void parseExpression(){
        parsePrimaryExpression();

        while( this.tokenActual.getType() == AlphaScanner.SUM ||
                this.tokenActual.getType() == AlphaScanner.SUB ||
                this.tokenActual.getType() == AlphaScanner.MUL ||
                this.tokenActual.getType() == AlphaScanner.DIV
        ){
            acceptIt();
            parsePrimaryExpression();
        }
    }

    // Parser del Token No Terminal: primaryExpression
    //    primaryExpression ::=
    //                  Literal | Identifier | ( expression )

    public void parsePrimaryExpression(){

        if( tokenActual.getType() == AlphaScanner.NUM ){
            acceptIt();
        }else if( tokenActual.getType() == AlphaScanner.ID ){
            acceptIt();
        }else if( tokenActual.getType() == AlphaScanner.PIZQ ){
            acceptIt();
            parseExpression();
            accept(AlphaScanner.PDER);
/*
 *
 * Verificación de Constantes CHAR:
 *   const x~'c'
 *
 * */
        } else if (tokenActual.getType() == AlphaScanner.CHARLIT) {
            acceptIt();
/*
 *
 * Verificación de Constantes String:
 *   const x~"hola"
 *
 * */
        } else if (tokenActual.getType() == AlphaScanner.STRLIT) {
            acceptIt();
        }else {
            printError("Debia venir un Num, ID, (Expression), Charlit, Strlit");

        }
    }
}
