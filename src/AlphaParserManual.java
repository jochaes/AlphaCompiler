import generated.AlphaScanner;
import org.antlr.v4.runtime.Token;

//Algoritmo de Descenso recursivo
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

//            if (tokenActual.getType() == AlphaScanner.VIR){
//                acceptIt();
//                parseExpression();
//            }else{
//                printError( "Debia venir un ~ pero llegó otra cosa" );
//            }

        } else if( tokenActual.getType() == AlphaScanner.VAR ){
            acceptIt();
            accept( AlphaScanner.ID );
            accept(AlphaScanner.DOSPUN);
            parseTypeDenoter();

//            if (tokenActual.getType() == AlphaScanner.DOSPUN){
//                acceptIt();
//                parseTypeDenoter();
//            }else{
//                printError( "Debia venir un : pero llegó otra cosa" );
//            }
        }else {
            printError("Debia venir un const o un var, pero llegó otra cosa");
        }
    }

    // Parser del Token No Terminal: typeDenoter
    //    typeDenoter ::=
    //                  Identifier
    public void parseTypeDenoter(){
        accept(AlphaScanner.ID);

//        if (tokenActual.getType() == AlphaScanner.ID){
//            acceptIt();
//        }else {
//            printError("Debia venir un identificador");
//        }
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
        }
    }




}
