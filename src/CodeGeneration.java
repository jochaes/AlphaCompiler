import generated.*;

import java.util.ArrayList;

public class CodeGeneration extends AlphaBaseVisitor<Object> {

    //La lista que va a tener todas las instrucciones generadas
    private ArrayList<String> bytecode;


    public CodeGeneration(){
        this.bytecode = new ArrayList<>();

    }

    //Imprimer todas las instrucciones de bytecode
    public void printByteCode(){

//        System.out.println("Imprimiendo Instrucciones de ByteCode");
//        for (String instruction:
//             this.bytecode) {
//            System.out.println(instruction);
//        }

        for(int i = 0; i<this.bytecode.size(); i++){
            System.out.println(i + " " + bytecode.get(i));
        }

    }

    @Override
    public Object visitProgramAST(AlphaParser.ProgramASTContext ctx) {
        return super.visitProgramAST(ctx);
    }

    @Override
    public Object visitCommandAST(AlphaParser.CommandASTContext ctx) {
        return super.visitCommandAST(ctx);
    }

    @Override
    public Object visitAssignSCAST(AlphaParser.AssignSCASTContext ctx) {

        //Se pueden devolver cosas, por ejemplo la cantidad de argumentos
        //Para hacerlo al propio ponemos esto de primero
        //Nos tira esto:
//        STORE_FAST x
//        LOAD_CONST 10
        //Lo cual está mal, el orden importa
//        bytecode.add("STORE_FAST "+ ctx.ID().getText());
//        visit(ctx.expression());

        //Se tiene que hacer así:
        visit(ctx.expression());
//        bytecode.add("STORE_FAST "+ ctx.ID().getText());
        //Todo: que pasa si es global?? falta STORE_GLOBAL
        //Se debe hacer así:
        if (ctx.isLocal == false){      //Es sólo para que me de siempre storefast
            bytecode.add("STORE_FAST "+ ctx.ID().getText());
        }else {
            bytecode.add("STORE_GLOBAL "+ ctx.ID().getText());
        }


        //Yo puedo agregar en cada token id, yo puedo agregarle una variable en el nodo de arboles.
        // Por ejemplo yo podria agregarle una variable que sea local o global,
        // Entonces en el analisis contextual, yo sabia cuales variables son globales y locales, entonces yo podría
        // ponerles un floag a los nodos de los arboles, para que aquí ya saber la info.
        // Esto se llamada decorar el arbol


        return null;
    }

    @OverrideOverride
    public Object visitIfSCAST(AlphaParser.IfSCASTContext ctx) {


        visit(ctx.expression());
        bytecode.add("JUMP_IF_FALSE " + 0); //0 es una dirección fantasma que luego debe cambiarse
        int numLine = bytecode.size()-1;
        visit(ctx.singleCommand(0));

        if(ctx.singleCommand(1) != null){
            bytecode.add("JUMP_ABSOLUTE " + 0);
            //devuelvase a cambiar la dirección que ya conoce
            bytecode.set(numLine, "JUMP_IF_FALSE " + bytecode.size());
            numLine = bytecode.size()-1;
            visit(ctx.singleCommand(1));
            bytecode.set(numLine, "JUMP_ABSOLUTE " + bytecode.size());
        } else {
            bytecode.set(numLine, "JUMP_IF_FALSE " + bytecode.size());
        }

        return null;
    }
    public Object visitCallSCAST(AlphaParser.CallSCASTContext ctx) {
        return super.visitCallSCAST(ctx);
    }

    @

//            7 COMPARE_OP >
//            8 JUMP_IF_FALSE 12
//            9 LOAD_CONST 10
//            10 STORE_FAST r
//            11 JUMP_ABSOLUTE 14
//            12 LOAD_CONST 1
//            13 STORE_FAST r
//            14 LOAD_FAST x

//    while x < 10:
//        x = x + 1

//    1 LOAD_FAST x
//    2 LOAD_CONST 10
//    3 COMPARE_OP <
//    4 JUMP_IF_FALSE 10
//    5 LOAD_FAST x
//    6 LOAD_CONST 1
//    7 BINARY_ADD
//    8 STORE_FAST x
//    9 JUMP_ABSOLUTE 1
//    10 ........


    @Override
    public Object visitWhileSCAST(AlphaParser.WhileSCASTContext ctx) {
        // Etiqueta para el inicio del bucle
        int antesDelBucle = bytecode.size();

        // Visita y evalúa la condición
        visit(ctx.expression());
        int numLine = bytecode.size();
        bytecode.add("JUMP_IF_FALSE " + 0);

        // Cuerpo del bucle
        visit(ctx.singleCommand());

        // Salto de regreso al inicio del bucle
        bytecode.add("JUMP_ABSOLUTE " + antesDelBucle);

        bytecode.set(numLine,"JUMP_IF_FALSE " + bytecode.size() );

        return null;
    }

    @Override
    public Object visitLetSCAST(AlphaParser.LetSCASTContext ctx) {
        return super.visitLetSCAST(ctx);
    }

    @Override
    public Object visitBlockSCAST(AlphaParser.BlockSCASTContext ctx) {
        return super.visitBlockSCAST(ctx);
    }

    @Override
    public Object visitMethodCallAST(AlphaParser.MethodCallASTContext ctx) {
        int numArgs = 0;
        //numArgs = (int) visit(ctx.actualParam()); //Esto me regresa la cantidad de parametros
        //Todos los métodos son globales, siempre tienen la misma vara,
        // solo que el print, es diferente

        if (ctx.ID().getText().equals("print")){
            numArgs = (int) visit(ctx.actualParam()); //Esto me regresa la cantidad de parametros
            bytecode.add("LOAD_GLOBAL print");
        }
        else bytecode.add("LOAD_GLOBAL "+ctx.ID().getText());


        bytecode.add("CALL_FUNCTION "+numArgs);


        return null;
    }

    @Override
    public Object visitActualParamAST(AlphaParser.ActualParamASTContext ctx) {

        super.visitActualParamAST(ctx); //Visita todas la expresiones

        return ctx.expression().size(); //Retorna el size de la lista
    }

    @Override
    public Object visitDeclarationAST(AlphaParser.DeclarationASTContext ctx) {
        return super.visitDeclarationAST(ctx);
    }

    @Override
    public Object visitConstSDAST(AlphaParser.ConstSDASTContext ctx) {
        return super.visitConstSDAST(ctx);
    }

    @Override
    public Object visitVarSDAST(AlphaParser.VarSDASTContext ctx) {

        return super.visitVarSDAST(ctx);
    }

    @Override
    public Object visitMethodSDAST(AlphaParser.MethodSDASTContext ctx) {

        bytecode.add("DEF "+ctx.ID().getText());

        //TODO: Visitar declaracion de argumentos
        
        visit(ctx.singleCommand());

        if (ctx.ID().getText().equals("Main")){
            bytecode.add("END");
        }

        //Todo: considerar otros métodos que hagan RETURN o RETURN_VALUE

        //Manerar en los returns un result, en my bytecode, y cuadno tenga el visit de un return, hacer return von result
        // Hacer un RETURN al final del método con result, osea no hagamos RESULT_VALUE
        //EL RETURN DEBE VENIR DE ULTIMO EN EL DEF
        return null;
    }

    @Override
    public Object visitIdDeclAST(AlphaParser.IdDeclASTContext ctx) {
        //Se hace el push
        bytecode.add("PUSH_LOCAL " +ctx.ID().getText());
        //Todo: Considerar el push global
        return null;
    }

    @Override
    public Object visitParamDeclsAST(AlphaParser.ParamDeclsASTContext ctx) {
        return super.visitParamDeclsAST(ctx);
    }

    @Override
    public Object visitTypeAST(AlphaParser.TypeASTContext ctx) {
        return super.visitTypeAST(ctx);
    }

    @Override
    public Object visitExpressionAST(AlphaParser.ExpressionASTContext ctx) {

        visit(ctx.primaryExpression(0));

        for (int i = 1; i < ctx.primaryExpression().size(); i++ ){

            visit( ctx.primaryExpression(i) );
            //el if es solo para saber cual operador es
            if (ctx.operator(i-1).SUM() != null ){
                bytecode.add("BINARY_ADD");
            } else if (ctx.operator(i-1).SUB() != null ) {
                bytecode.add("BINARY_SUBTRACT");
            }else if(ctx.operator(i-1).MUL() != null ) {
                bytecode.add("BINARY_MULTIPLY");
            }else if(ctx.operator(i-1).DIV() != null ) {
                bytecode.add("BINARY_DIVIDE");
            }

            //Para Las Comparaciones
            else if(ctx.operator(i-1).IGUAL() != null ) {
                bytecode.add("COMPARE_OP =");
            } else if(ctx.operator(i-1).MAYOR() != null ) {
                bytecode.add("COMPARE_OP >");
            } else if(ctx.operator(i-1).MENOR() != null ) {
                bytecode.add("COMPARE_OP <");
            } else if(ctx.operator(i-1).MAYORIGUAL() != null ) {
                bytecode.add("COMPARE_OP >=");
            } else if(ctx.operator(i-1).MENORIGUAL() != null ) {
                bytecode.add("COMPARE_OP <=");
            } else{ //SI NO ES NINGUNO, ES DIFERENTE
                bytecode.add("COMPARE_OP !=");
            }
        }
        return null;
//        return super.visitExpressionAST(ctx);
    }
    @Override
    public Object visitNumPEAST(AlphaParser.NumPEASTContext ctx) {

        bytecode.add("LOAD_CONST " + ctx.NUM().getText());

        return null;
    }

    @Override
    public Object visitIdPEAST(AlphaParser.IdPEASTContext ctx) {

        bytecode.add("LOAD_FAST "+ctx.ID().getText());
        //TODO: Considerar LOAD_GLOBAL

        return null;

        //return super.visitIdPEAST(ctx);
    }

    @Override
    public Object visitCharPEAST(AlphaParser.CharPEASTContext ctx) {
        return super.visitCharPEAST(ctx);
    }

    @Override
    public Object visitGroupPEAST(AlphaParser.GroupPEASTContext ctx) {
        return super.visitGroupPEAST(ctx);
    }

    @Override
    public Object visitCallPEAST(AlphaParser.CallPEASTContext ctx) {
        return super.visitCallPEAST(ctx);
    }

    @Override
    public Object visitOperator(AlphaParser.OperatorContext ctx) {
        return super.visitOperator(ctx);
    }
}


