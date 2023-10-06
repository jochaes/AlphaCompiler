import generatedMiniPython.MiniPythonBaseVisitor;
import generatedMiniPython.MiniPythonParser;
import org.antlr.v4.runtime.*;
import java.util.ArrayList;
import java.util.List;

public class Checker extends MiniPythonBaseVisitor<Object> {

    public Checker(){

    }

    @Override
    public Object visitProgram_AST(MiniPythonParser.Program_ASTContext ctx) {
        return super.visitProgram_AST(ctx);
    }

    @Override
    public Object visitDef_MS_AST(MiniPythonParser.Def_MS_ASTContext ctx) {
        return super.visitDef_MS_AST(ctx);
    }

    @Override
    public Object visitAssign_MS_AST(MiniPythonParser.Assign_MS_ASTContext ctx) {
        return super.visitAssign_MS_AST(ctx);
    }

    @Override
    public Object visitFunctionCall_MS_AST(MiniPythonParser.FunctionCall_MS_ASTContext ctx) {
        return super.visitFunctionCall_MS_AST(ctx);
    }

    @Override
    public Object visitPrint_MS_AST(MiniPythonParser.Print_MS_ASTContext ctx) {
        return super.visitPrint_MS_AST(ctx);
    }

    @Override
    public Object visitIf_ST_AST(MiniPythonParser.If_ST_ASTContext ctx) {
        return super.visitIf_ST_AST(ctx);
    }

    @Override
    public Object visitReturn_ST_AST(MiniPythonParser.Return_ST_ASTContext ctx) {
        return super.visitReturn_ST_AST(ctx);
    }

    @Override
    public Object visitPrint_ST_AST(MiniPythonParser.Print_ST_ASTContext ctx) {
        return super.visitPrint_ST_AST(ctx);
    }

    @Override
    public Object visitWhile_ST_AST(MiniPythonParser.While_ST_ASTContext ctx) {
        return super.visitWhile_ST_AST(ctx);
    }

    @Override
    public Object visitFor_ST_AST(MiniPythonParser.For_ST_ASTContext ctx) {
        return super.visitFor_ST_AST(ctx);
    }

    @Override
    public Object visitAssign_ST_AST(MiniPythonParser.Assign_ST_ASTContext ctx) {
        return super.visitAssign_ST_AST(ctx);
    }

    @Override
    public Object visitFunctionCall_ST_AST(MiniPythonParser.FunctionCall_ST_ASTContext ctx) {
        return super.visitFunctionCall_ST_AST(ctx);
    }

    @Override
    public Object visitAssignStaOpe_ST_AST(MiniPythonParser.AssignStaOpe_ST_ASTContext ctx) {
        return super.visitAssignStaOpe_ST_AST(ctx);
    }

    @Override
    public Object visitDefStatement_AST(MiniPythonParser.DefStatement_ASTContext ctx) {
        return super.visitDefStatement_AST(ctx);
    }

    @Override
    public Object visitArgList_AST(MiniPythonParser.ArgList_ASTContext ctx) {
        return super.visitArgList_AST(ctx);
    }

    @Override
    public Object visitIfStatement_AST(MiniPythonParser.IfStatement_ASTContext ctx) {
        return super.visitIfStatement_AST(ctx);
    }

    @Override
    public Object visitWhileStatement_AST(MiniPythonParser.WhileStatement_ASTContext ctx) {
        return super.visitWhileStatement_AST(ctx);
    }

    @Override
    public Object visitForStatement_AST(MiniPythonParser.ForStatement_ASTContext ctx) {
        return super.visitForStatement_AST(ctx);
    }

    @Override
    public Object visitReturnStatement_AST(MiniPythonParser.ReturnStatement_ASTContext ctx) {
        return super.visitReturnStatement_AST(ctx);
    }

    @Override
    public Object visitPrintStatement_AST(MiniPythonParser.PrintStatement_ASTContext ctx) {
        return super.visitPrintStatement_AST(ctx);
    }

    @Override
    public Object visitAssignStatement_AST(MiniPythonParser.AssignStatement_ASTContext ctx) {
        return super.visitAssignStatement_AST(ctx);
    }

    @Override
    public Object visitAssignStaOpe_AST(MiniPythonParser.AssignStaOpe_ASTContext ctx) {
        return super.visitAssignStaOpe_AST(ctx);
    }

    @Override
    public Object visitFunctionCallStatement_AST(MiniPythonParser.FunctionCallStatement_ASTContext ctx) {
        return super.visitFunctionCallStatement_AST(ctx);
    }

    @Override
    public Object visitSequence_AST(MiniPythonParser.Sequence_ASTContext ctx) {
        return super.visitSequence_AST(ctx);
    }

    @Override
    public Object visitExpression_AST(MiniPythonParser.Expression_ASTContext ctx) {
        return super.visitExpression_AST(ctx);
    }

    @Override
    public Object visitAddition_EO_AST(MiniPythonParser.Addition_EO_ASTContext ctx) {
        return super.visitAddition_EO_AST(ctx);
    }

    @Override
    public Object visitSubstraction_EO_AST(MiniPythonParser.Substraction_EO_ASTContext ctx) {
        return super.visitSubstraction_EO_AST(ctx);
    }

    @Override
    public Object visitMultiplication_EO_AST(MiniPythonParser.Multiplication_EO_ASTContext ctx) {
        return super.visitMultiplication_EO_AST(ctx);
    }

    @Override
    public Object visitDivision_EO_AST(MiniPythonParser.Division_EO_ASTContext ctx) {
        return super.visitDivision_EO_AST(ctx);
    }

    @Override
    public Object visitComparison_AST(MiniPythonParser.Comparison_ASTContext ctx) {
        return super.visitComparison_AST(ctx);
    }

    @Override
    public Object visitLessThan_CO_AST(MiniPythonParser.LessThan_CO_ASTContext ctx) {
        return super.visitLessThan_CO_AST(ctx);
    }

    @Override
    public Object visitGreaterThan_CO_AST(MiniPythonParser.GreaterThan_CO_ASTContext ctx) {
        return super.visitGreaterThan_CO_AST(ctx);
    }

    @Override
    public Object visitLessThanEqual_CO_AST(MiniPythonParser.LessThanEqual_CO_ASTContext ctx) {
        return super.visitLessThanEqual_CO_AST(ctx);
    }

    @Override
    public Object visitGreaterThanEqual_CO_AST(MiniPythonParser.GreaterThanEqual_CO_ASTContext ctx) {
        return super.visitGreaterThanEqual_CO_AST(ctx);
    }

    @Override
    public Object visitComparison_CO_AST(MiniPythonParser.Comparison_CO_ASTContext ctx) {
        return super.visitComparison_CO_AST(ctx);
    }

    @Override
    public Object visitExpressionList_AST(MiniPythonParser.ExpressionList_ASTContext ctx) {
        return super.visitExpressionList_AST(ctx);
    }

    @Override
    public Object visitInteger_PE_AST(MiniPythonParser.Integer_PE_ASTContext ctx) {
        return super.visitInteger_PE_AST(ctx);
    }

    @Override
    public Object visitFloat_PE_AST(MiniPythonParser.Float_PE_ASTContext ctx) {
        return super.visitFloat_PE_AST(ctx);
    }

    @Override
    public Object visitIdentifier_PE_AST(MiniPythonParser.Identifier_PE_ASTContext ctx) {
        return super.visitIdentifier_PE_AST(ctx);
    }

    @Override
    public Object visitChar_PE_AST(MiniPythonParser.Char_PE_ASTContext ctx) {
        return super.visitChar_PE_AST(ctx);
    }

    @Override
    public Object visitString_PE_AST(MiniPythonParser.String_PE_ASTContext ctx) {
        return super.visitString_PE_AST(ctx);
    }

    @Override
    public Object visitFunctionCall_PE_AST(MiniPythonParser.FunctionCall_PE_ASTContext ctx) {
        return super.visitFunctionCall_PE_AST(ctx);
    }

    @Override
    public Object visitExpressioParen_PE_AST(MiniPythonParser.ExpressioParen_PE_ASTContext ctx) {
        return super.visitExpressioParen_PE_AST(ctx);
    }

    @Override
    public Object visitListExpression_PE_AST(MiniPythonParser.ListExpression_PE_ASTContext ctx) {
        return super.visitListExpression_PE_AST(ctx);
    }

    @Override
    public Object visitLen_PE_AST(MiniPythonParser.Len_PE_ASTContext ctx) {
        return super.visitLen_PE_AST(ctx);
    }

    @Override
    public Object visitElementAccess_PE_AST(MiniPythonParser.ElementAccess_PE_ASTContext ctx) {
        return super.visitElementAccess_PE_AST(ctx);
    }

    @Override
    public Object visitListExpression_AST(MiniPythonParser.ListExpression_ASTContext ctx) {
        return super.visitListExpression_AST(ctx);
    }
}
