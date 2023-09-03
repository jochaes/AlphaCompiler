// Generated from /Users/jochaes/Documents/Repositorios/Compiladores/AlphaCompiler/Proyecto1G4/MiniPythonParser.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniPythonParser}.
 */
public interface MiniPythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link MiniPythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramAST(MiniPythonParser.ProgramASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link MiniPythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramAST(MiniPythonParser.ProgramASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commandAST}
	 * labeled alternative in {@link MiniPythonParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommandAST(MiniPythonParser.CommandASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commandAST}
	 * labeled alternative in {@link MiniPythonParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommandAST(MiniPythonParser.CommandASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterAssignSCAST(MiniPythonParser.AssignSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitAssignSCAST(MiniPythonParser.AssignSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterCallSCAST(MiniPythonParser.CallSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitCallSCAST(MiniPythonParser.CallSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterIfSCAST(MiniPythonParser.IfSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitIfSCAST(MiniPythonParser.IfSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterWhileSCAST(MiniPythonParser.WhileSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitWhileSCAST(MiniPythonParser.WhileSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterLetSCAST(MiniPythonParser.LetSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitLetSCAST(MiniPythonParser.LetSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterBlockSCAST(MiniPythonParser.BlockSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockSCAST}
	 * labeled alternative in {@link MiniPythonParser#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitBlockSCAST(MiniPythonParser.BlockSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationAST}
	 * labeled alternative in {@link MiniPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationAST(MiniPythonParser.DeclarationASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationAST}
	 * labeled alternative in {@link MiniPythonParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationAST(MiniPythonParser.DeclarationASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constSDAST}
	 * labeled alternative in {@link MiniPythonParser#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstSDAST(MiniPythonParser.ConstSDASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constSDAST}
	 * labeled alternative in {@link MiniPythonParser#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstSDAST(MiniPythonParser.ConstSDASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varSDAST}
	 * labeled alternative in {@link MiniPythonParser#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarSDAST(MiniPythonParser.VarSDASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varSDAST}
	 * labeled alternative in {@link MiniPythonParser#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarSDAST(MiniPythonParser.VarSDASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defSDAST}
	 * labeled alternative in {@link MiniPythonParser#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDefSDAST(MiniPythonParser.DefSDASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defSDAST}
	 * labeled alternative in {@link MiniPythonParser#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDefSDAST(MiniPythonParser.DefSDASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intTDAST}
	 * labeled alternative in {@link MiniPythonParser#typedenoter}.
	 * @param ctx the parse tree
	 */
	void enterIntTDAST(MiniPythonParser.IntTDASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intTDAST}
	 * labeled alternative in {@link MiniPythonParser#typedenoter}.
	 * @param ctx the parse tree
	 */
	void exitIntTDAST(MiniPythonParser.IntTDASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charTDAST}
	 * labeled alternative in {@link MiniPythonParser#typedenoter}.
	 * @param ctx the parse tree
	 */
	void enterCharTDAST(MiniPythonParser.CharTDASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charTDAST}
	 * labeled alternative in {@link MiniPythonParser#typedenoter}.
	 * @param ctx the parse tree
	 */
	void exitCharTDAST(MiniPythonParser.CharTDASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringTDAST}
	 * labeled alternative in {@link MiniPythonParser#typedenoter}.
	 * @param ctx the parse tree
	 */
	void enterStringTDAST(MiniPythonParser.StringTDASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringTDAST}
	 * labeled alternative in {@link MiniPythonParser#typedenoter}.
	 * @param ctx the parse tree
	 */
	void exitStringTDAST(MiniPythonParser.StringTDASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link MiniPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAST(MiniPythonParser.ExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link MiniPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAST(MiniPythonParser.ExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numPEAST}
	 * labeled alternative in {@link MiniPythonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumPEAST(MiniPythonParser.NumPEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numPEAST}
	 * labeled alternative in {@link MiniPythonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumPEAST(MiniPythonParser.NumPEASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idPEAST}
	 * labeled alternative in {@link MiniPythonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdPEAST(MiniPythonParser.IdPEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idPEAST}
	 * labeled alternative in {@link MiniPythonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdPEAST(MiniPythonParser.IdPEASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPEAST}
	 * labeled alternative in {@link MiniPythonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExpPEAST(MiniPythonParser.ExpPEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPEAST}
	 * labeled alternative in {@link MiniPythonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExpPEAST(MiniPythonParser.ExpPEASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charPEAST}
	 * labeled alternative in {@link MiniPythonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCharPEAST(MiniPythonParser.CharPEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charPEAST}
	 * labeled alternative in {@link MiniPythonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCharPEAST(MiniPythonParser.CharPEASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strPEAST}
	 * labeled alternative in {@link MiniPythonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStrPEAST(MiniPythonParser.StrPEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strPEAST}
	 * labeled alternative in {@link MiniPythonParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStrPEAST(MiniPythonParser.StrPEASTContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(MiniPythonParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(MiniPythonParser.OperatorContext ctx);
}