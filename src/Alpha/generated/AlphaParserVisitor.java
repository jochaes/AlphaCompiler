// Generated from /Users/jochaes/Documents/Repositorios/Compiladores/AlphaCompiler/AlphaParser.g4 by ANTLR 4.12.0
package Alpha.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlphaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlphaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link AlphaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramAST(AlphaParser.ProgramASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commandAST}
	 * labeled alternative in {@link AlphaParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandAST(AlphaParser.CommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignSCAST}
	 * labeled alternative in {@link AlphaParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignSCAST(AlphaParser.AssignSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callSCAST}
	 * labeled alternative in {@link AlphaParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSCAST(AlphaParser.CallSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifSCAST}
	 * labeled alternative in {@link AlphaParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSCAST(AlphaParser.IfSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileSCAST}
	 * labeled alternative in {@link AlphaParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileSCAST(AlphaParser.WhileSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letSCAST}
	 * labeled alternative in {@link AlphaParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetSCAST(AlphaParser.LetSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockSCAST}
	 * labeled alternative in {@link AlphaParser#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSCAST(AlphaParser.BlockSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationAST}
	 * labeled alternative in {@link AlphaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationAST(AlphaParser.DeclarationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constSDAST}
	 * labeled alternative in {@link AlphaParser#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSDAST(AlphaParser.ConstSDASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varSDAST}
	 * labeled alternative in {@link AlphaParser#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSDAST(AlphaParser.VarSDASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defSDAST}
	 * labeled alternative in {@link AlphaParser#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefSDAST(AlphaParser.DefSDASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intTDAST}
	 * labeled alternative in {@link AlphaParser#typedenoter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntTDAST(AlphaParser.IntTDASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charTDAST}
	 * labeled alternative in {@link AlphaParser#typedenoter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharTDAST(AlphaParser.CharTDASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringTDAST}
	 * labeled alternative in {@link AlphaParser#typedenoter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringTDAST(AlphaParser.StringTDASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link AlphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAST(AlphaParser.ExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numPEAST}
	 * labeled alternative in {@link AlphaParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumPEAST(AlphaParser.NumPEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idPEAST}
	 * labeled alternative in {@link AlphaParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPEAST(AlphaParser.IdPEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expPEAST}
	 * labeled alternative in {@link AlphaParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPEAST(AlphaParser.ExpPEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charPEAST}
	 * labeled alternative in {@link AlphaParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharPEAST(AlphaParser.CharPEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strPEAST}
	 * labeled alternative in {@link AlphaParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrPEAST(AlphaParser.StrPEASTContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlphaParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(AlphaParser.OperatorContext ctx);
}