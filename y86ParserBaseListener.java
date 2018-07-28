// Generated from y86Parser.g4 by ANTLR 4.7.1

import java.util.*;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link y86ParserListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
@Slf4j
public class y86ParserBaseListener implements y86ParserListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	private ParserRuleContext prevInstruction = null;
	@Override public void enterFunctionOrMemoryDeclaration(y86Parser.FunctionOrMemoryDeclarationContext ctx) {
	    System.out.println(ctx instanceof y86Parser.DirectiveDeclarationContext);
	    System.out.println("Starting a function or memory declaration");

          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunctionOrMemoryDeclaration(y86Parser.FunctionOrMemoryDeclarationContext ctx) {
              System.out.println("Ending a function or memory declaration");
              prevInstruction = ctx;
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDoOperation(y86Parser.DoOperationContext ctx) {
              System.out.println("Starting an operation");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDoOperation(y86Parser.DoOperationContext ctx) {
              System.out.println("Ending an operation");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDoRegisterMove(y86Parser.DoRegisterMoveContext ctx) {
	    System.out.println(ctx);
              System.out.println("Starting a register to register move");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDoRegisterMove(y86Parser.DoRegisterMoveContext ctx) {
              System.out.println("Ending a register to register move");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDoImmediateMove(y86Parser.DoImmediateMoveContext ctx) {
              System.out.println("Starting an immediate to register move");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDoImmediateMove(y86Parser.DoImmediateMoveContext ctx) {
              System.out.println("Ending an immediate to register move");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDoMemoryMove(y86Parser.DoMemoryMoveContext ctx) {
              System.out.println("Starting an memory to register move");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDoMemoryMove(y86Parser.DoMemoryMoveContext ctx) {
              System.out.println("Ending an memory to register move");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDoJumporCall(y86Parser.DoJumporCallContext ctx) {
              System.out.println("Starting a jump or a call");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDoJumporCall(y86Parser.DoJumporCallContext ctx) {
              System.out.println("Ending a jump or a call");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDoStackOp(y86Parser.DoStackOpContext ctx) {
              System.out.println("Starting a stack operation");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDoStackOp(y86Parser.DoStackOpContext ctx) {
              System.out.println("Ending a stack operation");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDoNoValueNeeded(y86Parser.DoNoValueNeededContext ctx) {
              System.out.println("Starting a command with no value needed");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDoNoValueNeeded(y86Parser.DoNoValueNeededContext ctx) {
              System.out.println("Ending a command with no value needed");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDirectiveDeclaration(y86Parser.DirectiveDeclarationContext ctx) {
              System.out.println("Starting a directive declaration");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDirectiveDeclaration(y86Parser.DirectiveDeclarationContext ctx) {
              System.out.println("Ending a directive declaration");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterValidY86(y86Parser.ValidY86Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitValidY86(y86Parser.ValidY86Context ctx) {

          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProgram(y86Parser.ProgramContext ctx) {
              System.out.println("Starting program");
          }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(y86Parser.ProgramContext ctx) {
              System.out.println("Ending program");
          }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}