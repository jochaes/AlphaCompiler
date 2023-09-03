// Generated from /Users/jochaes/Documents/Repositorios/Compiladores/AlphaCompiler/Proyecto1G4/MiniPythonParser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniPythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniPythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link MiniPythonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramAST(MiniPythonParser.ProgramASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commandAST}
	 * labeled alternative in {@link MiniPythonParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandAST(MiniPythonParser.CommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignSCAST(MiniPythonParser.AssignSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSCAST(MiniPythonParser.CallSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSCAST(MiniPythonParser.IfSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileSCAST(MiniPythonParser.WhileSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetSCAST(MiniPythonParser.LetSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSCAST(MiniPythonParser.BlockSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationAST}
	 * labeled alternative in {@link MiniPythonParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationAST(MiniPythonParser.DeclarationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constSDAST}
	 * labeled alternative in {@link MiniPythonParser#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSDAST(MiniPythonParser.ConstSDASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varSDAST}
	 * labeled alternative in {@link MiniPythonParser#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSDAST(MiniPythonParser.VarSDASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defSDAST}
	 * labeled alternative in {@link MiniPythonParser#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefSDAST(MiniPythonParser.DefSDASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intTDAST}
	 * labeled alternative in {@link MiniPythonParser#typedenoter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntTDAST(MiniPythonParser.IntTDASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charTDAST}
	 * labeled alternative in {@link MiniPythonParser#typedenoter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharTDAST(MiniPythonParser.CharTDASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringTDAST}
	 * labeled alternative in {@link MiniPythonParser#typedenoter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTDAST(MiniPythonParser.StringTDASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link MiniPythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAST(MiniPythonParser.ExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numPEAST}
	 * labeled alternative in {@link MiniPythonParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumPEAST(MiniPythonParser.NumPEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idPEAST}
	 * labeled alternative in {@link MiniPythonParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPEAST(MiniPythonParser.IdPEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPEAST}
	 * labeled alternative in {@link MiniPythonParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPEAST(MiniPythonParser.ExpPEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charPEAST}
	 * labeled alternative in {@link MiniPythonParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharPEAST(MiniPythonParser.CharPEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strPEAST}
	 * labeled alternative in {@link MiniPythonParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrPEAST(MiniPythonParser.StrPEASTContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPythonParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(MiniPythonParser.OperatorContext ctx);
}