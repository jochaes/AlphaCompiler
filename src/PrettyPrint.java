import generated.AlphaParser;
import generated.AlphaParserBaseVisitor;
import generated.AlphaScanner;

public class PrettyPrint extends AlphaParserBaseVisitor<Object> {

    private int tabCounter;

    public PrettyPrint(){
        this.tabCounter = 0;
    }

    private void printTabs(int cant){
        for (int i = 0; i < cant ; i++) {
            System.out.print("\t");
        }
    }



    @Override
    public Object visitProgramAST(AlphaParser.ProgramASTContext ctx) {
        printTabs(this.tabCounter);
        System.out.println( ctx.getClass().getSimpleName());

        this.tabCounter++;
        visit(ctx.singleCommand());
        this.tabCounter--;

        return super.visitProgramAST(ctx);
    }

    @Override
    public Object visitCommandAST(AlphaParser.CommandASTContext ctx) {

        printTabs(this.tabCounter);
        System.out.println( ctx.getClass().getSimpleName());

        this.tabCounter++;
        visit(ctx.singleCommand(0));

        for (int i = 1; i < ctx.singleCommand().size() ; i++) {

            visit(ctx.singleCommand(i));
        }
        this.tabCounter--;
        return null;
    }

    @Override
    public Object visitAssignSCAST(AlphaParser.AssignSCASTContext ctx) {
        return super.visitAssignSCAST(ctx);
    }

    @Override
    public Object visitCallSCAST(AlphaParser.CallSCASTContext ctx) {
        return super.visitCallSCAST(ctx);
    }

    @Override
    public Object visitIfSCAST(AlphaParser.IfSCASTContext ctx) {
        return super.visitIfSCAST(ctx);
    }

    @Override
    public Object visitWhileSCAST(AlphaParser.WhileSCASTContext ctx) {
        return super.visitWhileSCAST(ctx);
    }

    @Override
    public Object visitLetSCAST(AlphaParser.LetSCASTContext ctx) {
        printTabs(this.tabCounter);
        System.out.println(ctx.getClass().getSimpleName());
        this.tabCounter++;
        printTabs(this.tabCounter);
        System.out.println(AlphaScanner.VOCABULARY.getSymbolicName( ctx.LET().getSymbol().getType()));

        visit(ctx.declaration());  //Para que imprima los declaration de primero
        printTabs(this.tabCounter);
        System.out.println("\u001B[31m"+AlphaScanner.VOCABULARY.getSymbolicName( ctx.IN().getSymbol().getType())+"\u001B[0m");
        visit(ctx.singleCommand());
        this.tabCounter--;

        return null;
    }

    @Override
    public Object visitBlockSCAST(AlphaParser.BlockSCASTContext ctx) {
        return super.visitBlockSCAST(ctx);
    }

    @Override
    public Object visitDeclarationAST(AlphaParser.DeclarationASTContext ctx) {

        printTabs(this.tabCounter);
        System.out.println(ctx.getClass().getSimpleName());
        //debo tomar el control de las visitas

        super.visitDeclarationAST(ctx);
        return null;
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
    public Object visitDefSDAST(AlphaParser.DefSDASTContext ctx) {
        return super.visitDefSDAST(ctx);
    }

    @Override
    public Object visitIntTDAST(AlphaParser.IntTDASTContext ctx) {
        return super.visitIntTDAST(ctx);
    }

    @Override
    public Object visitCharTDAST(AlphaParser.CharTDASTContext ctx) {
        return super.visitCharTDAST(ctx);
    }

    @Override
    public Object visitStringTDAST(AlphaParser.StringTDASTContext ctx) {
        return super.visitStringTDAST(ctx);
    }

    @Override
    public Object visitExpressionAST(AlphaParser.ExpressionASTContext ctx) {
        return super.visitExpressionAST(ctx);
    }

    @Override
    public Object visitNumPEAST(AlphaParser.NumPEASTContext ctx) {
        return super.visitNumPEAST(ctx);
    }

    @Override
    public Object visitIdPEAST(AlphaParser.IdPEASTContext ctx) {
        return super.visitIdPEAST(ctx);
    }

    @Override
    public Object visitExpPEAST(AlphaParser.ExpPEASTContext ctx) {
        return super.visitExpPEAST(ctx);
    }

    @Override
    public Object visitCharPEAST(AlphaParser.CharPEASTContext ctx) {
        return super.visitCharPEAST(ctx);
    }

    @Override
    public Object visitStrPEAST(AlphaParser.StrPEASTContext ctx) {
        return super.visitStrPEAST(ctx);
    }

    @Override
    public Object visitOperator(AlphaParser.OperatorContext ctx) {

        printTabs(this.tabCounter);

        if (ctx.SUM() != null){
            System.out.println("+");
        } else if (ctx.SUB() != null) {
            System.out.println("-");
        } else if (ctx.MUL() != null) {
            System.out.println("*");
        } else{
            System.out.println("/");
        }



        return null;
    }
}
