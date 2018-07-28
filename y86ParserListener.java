// Generated from y86Parser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link y86Parser}.
 */
public interface y86ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link y86Parser#functionOrMemoryDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionOrMemoryDeclaration(y86Parser.FunctionOrMemoryDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link y86Parser#functionOrMemoryDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionOrMemoryDeclaration(y86Parser.FunctionOrMemoryDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link y86Parser#doOperation}.
	 * @param ctx the parse tree
	 */
	void enterDoOperation(y86Parser.DoOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link y86Parser#doOperation}.
	 * @param ctx the parse tree
	 */
	void exitDoOperation(y86Parser.DoOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link y86Parser#doRegisterMove}.
	 * @param ctx the parse tree
	 */
	void enterDoRegisterMove(y86Parser.DoRegisterMoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link y86Parser#doRegisterMove}.
	 * @param ctx the parse tree
	 */
	void exitDoRegisterMove(y86Parser.DoRegisterMoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link y86Parser#doImmediateMove}.
	 * @param ctx the parse tree
	 */
	void enterDoImmediateMove(y86Parser.DoImmediateMoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link y86Parser#doImmediateMove}.
	 * @param ctx the parse tree
	 */
	void exitDoImmediateMove(y86Parser.DoImmediateMoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link y86Parser#doMemoryMove}.
	 * @param ctx the parse tree
	 */
	void enterDoMemoryMove(y86Parser.DoMemoryMoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link y86Parser#doMemoryMove}.
	 * @param ctx the parse tree
	 */
	void exitDoMemoryMove(y86Parser.DoMemoryMoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link y86Parser#doJumporCall}.
	 * @param ctx the parse tree
	 */
	void enterDoJumporCall(y86Parser.DoJumporCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link y86Parser#doJumporCall}.
	 * @param ctx the parse tree
	 */
	void exitDoJumporCall(y86Parser.DoJumporCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link y86Parser#doStackOp}.
	 * @param ctx the parse tree
	 */
	void enterDoStackOp(y86Parser.DoStackOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link y86Parser#doStackOp}.
	 * @param ctx the parse tree
	 */
	void exitDoStackOp(y86Parser.DoStackOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link y86Parser#doNoValueNeeded}.
	 * @param ctx the parse tree
	 */
	void enterDoNoValueNeeded(y86Parser.DoNoValueNeededContext ctx);
	/**
	 * Exit a parse tree produced by {@link y86Parser#doNoValueNeeded}.
	 * @param ctx the parse tree
	 */
	void exitDoNoValueNeeded(y86Parser.DoNoValueNeededContext ctx);
	/**
	 * Enter a parse tree produced by {@link y86Parser#directiveDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveDeclaration(y86Parser.DirectiveDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link y86Parser#directiveDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveDeclaration(y86Parser.DirectiveDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link y86Parser#validY86}.
	 * @param ctx the parse tree
	 */
	void enterValidY86(y86Parser.ValidY86Context ctx);
	/**
	 * Exit a parse tree produced by {@link y86Parser#validY86}.
	 * @param ctx the parse tree
	 */
	void exitValidY86(y86Parser.ValidY86Context ctx);
	/**
	 * Enter a parse tree produced by {@link y86Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(y86Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link y86Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(y86Parser.ProgramContext ctx);
}