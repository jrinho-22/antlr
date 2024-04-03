// Generated from rules.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rulesParser}.
 */
public interface rulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link rulesParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(rulesParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(rulesParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(rulesParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(rulesParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(rulesParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(rulesParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#num_inteiro}.
	 * @param ctx the parse tree
	 */
	void enterNum_inteiro(rulesParser.Num_inteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#num_inteiro}.
	 * @param ctx the parse tree
	 */
	void exitNum_inteiro(rulesParser.Num_inteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#num_real}.
	 * @param ctx the parse tree
	 */
	void enterNum_real(rulesParser.Num_realContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#num_real}.
	 * @param ctx the parse tree
	 */
	void exitNum_real(rulesParser.Num_realContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#last_inputs}.
	 * @param ctx the parse tree
	 */
	void enterLast_inputs(rulesParser.Last_inputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#last_inputs}.
	 * @param ctx the parse tree
	 */
	void exitLast_inputs(rulesParser.Last_inputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#armazenamento_memoria}.
	 * @param ctx the parse tree
	 */
	void enterArmazenamento_memoria(rulesParser.Armazenamento_memoriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#armazenamento_memoria}.
	 * @param ctx the parse tree
	 */
	void exitArmazenamento_memoria(rulesParser.Armazenamento_memoriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#get_armazenamento_memoria}.
	 * @param ctx the parse tree
	 */
	void enterGet_armazenamento_memoria(rulesParser.Get_armazenamento_memoriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#get_armazenamento_memoria}.
	 * @param ctx the parse tree
	 */
	void exitGet_armazenamento_memoria(rulesParser.Get_armazenamento_memoriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(rulesParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(rulesParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(rulesParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(rulesParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(rulesParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(rulesParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#simple_operation}.
	 * @param ctx the parse tree
	 */
	void enterSimple_operation(rulesParser.Simple_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#simple_operation}.
	 * @param ctx the parse tree
	 */
	void exitSimple_operation(rulesParser.Simple_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#float_division}.
	 * @param ctx the parse tree
	 */
	void enterFloat_division(rulesParser.Float_divisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#float_division}.
	 * @param ctx the parse tree
	 */
	void exitFloat_division(rulesParser.Float_divisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#int_division}.
	 * @param ctx the parse tree
	 */
	void enterInt_division(rulesParser.Int_divisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#int_division}.
	 * @param ctx the parse tree
	 */
	void exitInt_division(rulesParser.Int_divisionContext ctx);
}