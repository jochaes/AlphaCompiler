import AST.*;
import generated.AlphaScanner;
import org.antlr.v4.runtime.Token;

import java.beans.Expression;
import java.util.LinkedList;

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
//
//Constantes y tipos Char
// Para las declaraciones de constantes char de la manera:
//      const ID~'h'
// Se agrega al parsePrimaryExpression un if que verifique CHARLIT
//
// Para los tipos Char de la manera:
//      var y:char
//Se agrega un if que verifique CHAR en parseTypeDenoter
//
//
//Declaración y uso de métodos
//
//Declaración de Métodos de la manera:
// def ID(x:int, y:string){command}
// Se verifica en parseSingleDeclaration, que se cumpla lo siguiente:
//DEF ID (PIZQ PDER | PIZQ ID DOSPUN typedenoter (COMA ID DOSPUN typedenoter)* PDER ) CIZQ command CDER
//
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
    //    public void parseProgram(){
    //        parseSingleCommand();
    //    }

    //Para la tarea del Arbol:::
    public ProgramASTree parseProgram(){
        ProgramASTree res;
        SingleCommandASTree sc = parseSingleCommand();
        res  = new ProgramASTree(sc);
        return res;
    }

    // Parser del Token No Terminal: command
    //    command ::=
    //                singleCommand (; singleCommand)*
    public CommandASTree parseCommand(){
        CommandASTree res;
        SingleCommandASTree SC1 = parseSingleCommand();
        LinkedList<SingleCommandASTree> SCLIST= new LinkedList<SingleCommandASTree>();

        //Cuando uno define un Token, el token no es sólo en nombre
        //Los scanner cuando detecta un token devuelve un objeto con 4 cosas,
        // Varibale, fila, columna,
        //Acá preguntamos si el tipo de token actual sea
        while(this.tokenActual.getType() == AlphaScanner.PyCOMA){
            acceptIt(); //Next token
            SingleCommandASTree temp = parseSingleCommand();
            SCLIST.add( temp);
        }

        res = new CommandASTree(SC1, SCLIST);
        return res;  //Antes de devolverlo hay que hacerle new,
    }


    // Parser del Token No Terminal: singleCommand
    //    singleCommand ::=
    //                  Identifier (:= expression | ( expression ))
    //                  | if expression then singleCommand else singleCommand
    //                  | while expression do singleCommand
    //                  | let declaration in singleCommand
    //                  | begin command end
    //Identificar el conjunto de iniciadores de esa regla, cuando hay varias opciones, estos son los terminales
    public SingleCommandASTree parseSingleCommand(){
        SingleCommandASTree res = new SingleCommandASTree();
        ExpressionASTree expressionAST;
        LinkedList<ExpressionASTree> expressionList= new LinkedList<ExpressionASTree>();
        if (tokenActual.getType() == AlphaScanner.ID){  //si el token actual es un identificador
            //Puede Ser Un Assign
            AssignSCASTree assignSC = new AssignSCASTree();
            assignSC.setIdToken(tokenActual);

            // O Puede ser una llamada
            CallSCASTree callSC = new CallSCASTree();
            callSC.setIdToken(tokenActual);


            acceptIt();

            if ( tokenActual.getType() == AlphaScanner.ASSIGN ){
                assignSC.setAssignToken(tokenActual);
                acceptIt();

                expressionAST = parseExpression();
                assignSC.setExpression(expressionAST);
                res.setSingleCommand(assignSC);
                return res;

            }else if( tokenActual.getType() == AlphaScanner.PIZQ ){
                callSC.setPizqToken(tokenActual);
                acceptIt();

                expressionAST = parseExpression();
                callSC.setExpression(expressionAST);
                /*
                 *
                 * Uso de Métodos de la manera:
                 *   ID (x,'y', "HOLA, 20)
                 *
                 * */
                while(this.tokenActual.getType() == AlphaScanner.COMA){
                    acceptIt();

                    ExpressionASTree tempExpression =  parseExpression();
                    expressionList.add(tempExpression);
                }
                callSC.setExpressionList(expressionList);
                accept(AlphaScanner.PDER);
                //Falta colocar el PDER en en callSC
                res.setSingleCommand(callSC);
                return res;


            }else {
                printError("Se esperaba una asignación o un aexprecion entre ()");
                return null;
            }

        }else if(tokenActual.getType() == AlphaScanner.IF ) {
            IfSCASTree ifSC = new IfSCASTree();

            acceptIt(); //Acepta el IF y lee el siguiente
            ifSC.setExpression( parseExpression() );

            accept(AlphaScanner.THEN);

            ifSC.setSingleCommand( parseSingleCommand() );
            accept(AlphaScanner.ELSE);

            ifSC.setSingleCommand( parseSingleCommand() );

            res.setSingleCommand(ifSC);
            return res;

        }else if(tokenActual.getType() == AlphaScanner.WHILE ) {
            WhileSCASTree whileSC = new WhileSCASTree();

            acceptIt();
            whileSC.setExpression( parseExpression() );
            accept(AlphaScanner.DO);
            whileSC.setSingleCommand(parseSingleCommand());

            res.setSingleCommand(whileSC);
            return res;
        }else if(tokenActual.getType() == AlphaScanner.LET ) {
            LetSCASTree letSC = new LetSCASTree();
            acceptIt();
            letSC.setDeclaration( parseDeclaration() );
            accept(AlphaScanner.IN);
            letSC.setSingleCommand( parseSingleCommand() );
            res.setSingleCommand(letSC);
            return res;
        }else if(tokenActual.getType() == AlphaScanner.BEGIN ) {
            BlockSCASTree blockSCASTree = new BlockSCASTree();
            acceptIt();
            blockSCASTree.setCommand( parseCommand() );
            accept(AlphaScanner.END);
            res.setSingleCommand(blockSCASTree);
            return res;
        }else{
            //Se puede hacer una función que
            printError("Error, se esperaban {if,else,while,let,begin}, pero viene otra cosa");
            return null;
        }

    }

    // Parser del Token No Terminal: declaration
    //    declaration ::=
    //                  singleDeclaration (; singleDeclaration)*
    public DeclarationASTree parseDeclaration(){
        DeclarationASTree declaration;
        SingleDeclarationASTree singleDeclaration = parseSingleDeclaration();
        LinkedList<SingleDeclarationASTree> singleDeclarationList = new LinkedList<SingleDeclarationASTree>();


        while(this.tokenActual.getType() == AlphaScanner.PyCOMA){
            acceptIt();
            SingleDeclarationASTree tmpSingleDeclaration =  parseSingleDeclaration();
            singleDeclarationList.add(tmpSingleDeclaration);
        }

        declaration = new DeclarationASTree(singleDeclaration, singleDeclarationList);
        return declaration;

    }

    // Parser del Token No Terminal: singleDeclaration
    //    singleDeclaration ::=
    //                  const Identifier ~ expression
    //                  | var Identifier : typeDenoter
    public SingleDeclarationASTree parseSingleDeclaration(){
        SingleDeclarationASTree singleDeclaration;

        if ( tokenActual.getType() == AlphaScanner.CONST ){

            acceptIt();
            Token idtoken = tokenActual;
            accept( AlphaScanner.ID );
            accept(AlphaScanner.VIR);
            ExpressionASTree expression =  parseExpression();
            ConstSDASTree constSD = new ConstSDASTree(expression, idtoken);
            singleDeclaration = new SingleDeclarationASTree(constSD);


        } else if( tokenActual.getType() == AlphaScanner.VAR ){

            acceptIt();
            Token idtoken = tokenActual;
            accept( AlphaScanner.ID );
            accept(AlphaScanner.DOSPUN);
            TypeDenoterASTree tp = parseTypeDenoter();
            VarSDASTree varSD = new VarSDASTree(idtoken, tp );
            singleDeclaration = new SingleDeclarationASTree(varSD);
        /*
        *
        * Declaración de Métodos de la manera:
        *   def ID(x:int,y:string){command}
        *
        * */
        // DEF ID (PIZQ PDER | PIZQ ID DOSPUN typedenoter (COMA ID DOSPUN typedenoter)* PDER ) CIZQ command CDER
        } else if(tokenActual.getType() == AlphaScanner.DEF){
            DefSDAST defSD = new DefSDAST();

            acceptIt();
            if (tokenActual.getType() == AlphaScanner.ID){
                defSD.setFunctionName(tokenActual);
            }
            accept(AlphaScanner.ID);
            accept(AlphaScanner.PIZQ);

            if (tokenActual.getType() == AlphaScanner.PDER){
                acceptIt();
                accept(AlphaScanner.CIZQ);
                defSD.setFunctionBody(parseCommand());
                accept(AlphaScanner.CDER);
                singleDeclaration = new SingleDeclarationASTree(defSD);
            } else if (tokenActual.getType() == AlphaScanner.ID) {
                defSD.setArgumentName(tokenActual);
                acceptIt();
                accept(AlphaScanner.DOSPUN);

                defSD.setArgumentType(parseTypeDenoter());
                LinkedList<Token> tokenLinkedList = new LinkedList<Token>();
                LinkedList<TypeDenoterASTree> typesList = new LinkedList<TypeDenoterASTree>();

                while(this.tokenActual.getType() == AlphaScanner.COMA){
                    acceptIt(); //Next token
                    tokenLinkedList.add(tokenActual);
                    accept(AlphaScanner.ID);
                    accept(AlphaScanner.DOSPUN);
                    TypeDenoterASTree tmpTD = parseTypeDenoter();
                    typesList.add(tmpTD);
                }

                defSD.setArgs(tokenLinkedList);
                defSD.setArgsTypes(typesList);

                accept(AlphaScanner.PDER);
                accept(AlphaScanner.CIZQ);
                defSD.setFunctionBody(parseCommand());
                accept(AlphaScanner.CDER);
                singleDeclaration = new SingleDeclarationASTree(defSD);
            }else{
                printError("Error de validación de función");
                singleDeclaration = null;
            }

        }
        else {
            printError("Debia venir un const o un var o un DEF, pero llegó otra cosa");
            singleDeclaration = null;
        }

        return singleDeclaration;
    }

    // Parser del Token No Terminal: typeDenoter
    //    typeDenoter ::=
    //                  Identifier
    public TypeDenoterASTree parseTypeDenoter(){
        TypeDenoterASTree typeDenoter;
//        accept(AlphaScanner.ID);

        if (tokenActual.getType() == AlphaScanner.INTEGER) {
            IntTDASTree intTP = new IntTDASTree(tokenActual);
            acceptIt();
            typeDenoter = intTP;
        /*
         *
         * Tipos CHAR:
         *   x:char
         *
         * */
        } else if (tokenActual.getType() == AlphaScanner.CHAR) {
            CharTDASTree charTD = new CharTDASTree(tokenActual);
            acceptIt();
            typeDenoter = charTD;
        /*
         *
         * Tipos STRING:
         *   x:string
         *
         * */
        } else if (tokenActual.getType() == AlphaScanner.STRING) {
            StringTDASTree stringTD = new StringTDASTree(tokenActual);
            acceptIt();
            typeDenoter = stringTD;
        }else {
            printError("Debia venir un Integer, Char o String");
            return null;
        }
        return typeDenoter;
    }

    // Parser del Token No Terminal: expression
    //    expression ::=
    //              primaryExpression (operator primaryExpression)*
    public ExpressionASTree parseExpression(){
        ExpressionASTree expression = new ExpressionASTree();
        LinkedList<Token> operators = new LinkedList<Token>();
        LinkedList<PrimaryExpressionASTree> primaryexpList = new LinkedList<PrimaryExpressionASTree>();
        expression.setPrimaryExpression( parsePrimaryExpression() );

        while( this.tokenActual.getType() == AlphaScanner.SUM ||
                this.tokenActual.getType() == AlphaScanner.SUB ||
                this.tokenActual.getType() == AlphaScanner.MUL ||
                this.tokenActual.getType() == AlphaScanner.DIV
        ){
            operators.add(tokenActual);
            acceptIt();
            PrimaryExpressionASTree tmpPE = parsePrimaryExpression();
            primaryexpList.add(tmpPE);
        }

        expression.setPrimaryExpressionList(primaryexpList);
        expression.setOperators(operators);

        return expression;
    }

    // Parser del Token No Terminal: primaryExpression
    //    primaryExpression ::=
    //                  Literal | Identifier | ( expression )

    public PrimaryExpressionASTree parsePrimaryExpression(){

        PrimaryExpressionASTree primaryExpression;
        Token tokenPrimaryExp = null;
        ExpressionASTree expression = null;

        if( tokenActual.getType() == AlphaScanner.NUM ){
            tokenPrimaryExp = tokenActual;
            acceptIt();
        }else if( tokenActual.getType() == AlphaScanner.ID ){
            tokenPrimaryExp = tokenActual;
            acceptIt();
        }else if( tokenActual.getType() == AlphaScanner.PIZQ ){

            acceptIt();
            expression = parseExpression();
            accept(AlphaScanner.PDER);
        } else if (tokenActual.getType() == AlphaScanner.CHARLIT) {
            tokenPrimaryExp = tokenActual;
            acceptIt();
        } else if (tokenActual.getType() == AlphaScanner.STRLIT) {
            tokenPrimaryExp = tokenActual;
            acceptIt();
        }else {
            printError("Debia venir un Num, ID, (Expression), Charlit, Strlit");
            return null;
        }
        primaryExpression = new PrimaryExpressionASTree(tokenPrimaryExp, expression);
        return primaryExpression;
    }

}
