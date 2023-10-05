// Generated from /Users/gilda/Desktop/Repositorios/AlphaCompiler/Proyecto1G4/MiniPython.g4 by ANTLR 4.12.0
package generatedMiniPython;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniPythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniPythonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code program_AST}
	 * labeled alternative in {@link MiniPythonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_AST(MiniPythonParser.Program_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code def_MS_AST}
	 * labeled alternative in {@link MiniPythonParser#mainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_MS_AST(MiniPythonParser.Def_MS_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign_MS_AST}
	 * labeled alternative in {@link MiniPythonParser#mainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_MS_AST(MiniPythonParser.Assign_MS_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall_MS_AST}
	 * labeled alternative in {@link MiniPythonParser#mainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall_MS_AST(MiniPythonParser.FunctionCall_MS_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print_MS_AST}
	 * labeled alternative in {@link MiniPythonParser#mainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_MS_AST(MiniPythonParser.Print_MS_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_ST_AST(MiniPythonParser.If_ST_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_ST_AST(MiniPythonParser.Return_ST_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_ST_AST(MiniPythonParser.Print_ST_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_ST_AST(MiniPythonParser.While_ST_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_ST_AST(MiniPythonParser.For_ST_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_ST_AST(MiniPythonParser.Assign_ST_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall_ST_AST(MiniPythonParser.FunctionCall_ST_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_ST_AST(MiniPythonParser.Expression_ST_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStaOpe_ST_AST}
	 * labeled alternative in {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStaOpe_ST_AST(MiniPythonParser.AssignStaOpe_ST_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#defStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefStatement_AST(MiniPythonParser.DefStatement_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argList_AST}
	 * labeled alternative in {@link MiniPythonParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList_AST(MiniPythonParser.ArgList_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement_AST(MiniPythonParser.IfStatement_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement_AST(MiniPythonParser.WhileStatement_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement_AST(MiniPythonParser.ForStatement_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement_AST(MiniPythonParser.ReturnStatement_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement_AST(MiniPythonParser.PrintStatement_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement_AST(MiniPythonParser.AssignStatement_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStaOpe_AST}
	 * labeled alternative in {@link MiniPythonParser#assignStatementOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStaOpe_AST(MiniPythonParser.AssignStaOpe_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement_AST(MiniPythonParser.FunctionCallStatement_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStatement_AST}
	 * labeled alternative in {@link MiniPythonParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement_AST(MiniPythonParser.ExpressionStatement_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sequence_AST}
	 * labeled alternative in {@link MiniPythonParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_AST(MiniPythonParser.Sequence_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_AST}
	 * labeled alternative in {@link MiniPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_AST(MiniPythonParser.Expression_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison_AST}
	 * labeled alternative in {@link MiniPythonParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_AST(MiniPythonParser.Comparison_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThan_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan_CO_AST(MiniPythonParser.LessThan_CO_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThan_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan_CO_AST(MiniPythonParser.GreaterThan_CO_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanEqual_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanEqual_CO_AST(MiniPythonParser.LessThanEqual_CO_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanEqual_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanEqual_CO_AST(MiniPythonParser.GreaterThanEqual_CO_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison_CO_AST}
	 * labeled alternative in {@link MiniPythonParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_CO_AST(MiniPythonParser.Comparison_CO_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionExpression_AST}
	 * labeled alternative in {@link MiniPythonParser#additionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression_AST(MiniPythonParser.AdditionExpression_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionFactor_AST}
	 * labeled alternative in {@link MiniPythonParser#additionFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionFactor_AST(MiniPythonParser.AdditionFactor_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpression_AST}
	 * labeled alternative in {@link MiniPythonParser#multiplicationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression_AST(MiniPythonParser.MultiplicationExpression_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationFactor_AST}
	 * labeled alternative in {@link MiniPythonParser#multiplicationFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationFactor_AST(MiniPythonParser.MultiplicationFactor_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementExpression_AST}
	 * labeled alternative in {@link MiniPythonParser#elementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementExpression_AST(MiniPythonParser.ElementExpression_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementAccess_AST}
	 * labeled alternative in {@link MiniPythonParser#elementAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAccess_AST(MiniPythonParser.ElementAccess_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionList_AST}
	 * labeled alternative in {@link MiniPythonParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList_AST(MiniPythonParser.ExpressionList_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_PE_AST(MiniPythonParser.Integer_PE_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_PE_AST(MiniPythonParser.Float_PE_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_PE_AST(MiniPythonParser.Identifier_PE_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code char_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_PE_AST(MiniPythonParser.Char_PE_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_PE_AST(MiniPythonParser.String_PE_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierOrFunction_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierOrFunction_PE_AST(MiniPythonParser.IdentifierOrFunction_PE_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressioParen_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressioParen_PE_AST(MiniPythonParser.ExpressioParen_PE_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExpression_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression_PE_AST(MiniPythonParser.ListExpression_PE_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code len_PE_AST}
	 * labeled alternative in {@link MiniPythonParser#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen_PE_AST(MiniPythonParser.Len_PE_ASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExpression_AST}
	 * labeled alternative in {@link MiniPythonParser#listExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression_AST(MiniPythonParser.ListExpression_ASTContext ctx);
}