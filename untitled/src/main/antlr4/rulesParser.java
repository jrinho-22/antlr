// Generated from rules.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class rulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, SUBTRACT=2, MULTIPLY=3, DIVIDE_FLOAT=4, DIVIDE_INT=5, REMAINDER=6, 
		EXPONENTIAL=7, LPAREN=8, RPAREN=9, PREV=10, ARMAZENAR=11, INT=12, REAL=13, 
		WS=14, NEWLINE=15;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_num = 2, RULE_num_inteiro = 3, RULE_num_real = 4, 
		RULE_last_inputs = 5, RULE_armazenamento_memoria = 6, RULE_get_armazenamento_memoria = 7, 
		RULE_sign = 8, RULE_expression = 9, RULE_operation = 10, RULE_simple_operation = 11, 
		RULE_float_division = 12, RULE_int_division = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "num", "num_inteiro", "num_real", "last_inputs", "armazenamento_memoria", 
			"get_armazenamento_memoria", "sign", "expression", "operation", "simple_operation", 
			"float_division", "int_division"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'|'", "'/'", "'%'", "'^'", "'('", "')'", 
			"'RES'", "'MEM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE_FLOAT", "DIVIDE_INT", "REMAINDER", 
			"EXPONENTIAL", "LPAREN", "RPAREN", "PREV", "ARMAZENAR", "INT", "REAL", 
			"WS", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "rules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public rulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(rulesParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(rulesParser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			line();
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(29);
				match(NEWLINE);
				}
				break;
			}
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(32);
					match(NEWLINE);
					setState(33);
					line();
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Armazenamento_memoriaContext armazenamento_memoria() {
			return getRuleContext(Armazenamento_memoriaContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				armazenamento_memoria();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext {
		public Num_inteiroContext num_inteiro() {
			return getRuleContext(Num_inteiroContext.class,0);
		}
		public Num_realContext num_real() {
			return getRuleContext(Num_realContext.class,0);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_num);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				num_inteiro();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				num_real();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Num_inteiroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(rulesParser.INT, 0); }
		public Num_inteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterNum_inteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitNum_inteiro(this);
		}
	}

	public final Num_inteiroContext num_inteiro() throws RecognitionException {
		Num_inteiroContext _localctx = new Num_inteiroContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_num_inteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Num_realContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(rulesParser.REAL, 0); }
		public Num_realContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterNum_real(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitNum_real(this);
		}
	}

	public final Num_realContext num_real() throws RecognitionException {
		Num_realContext _localctx = new Num_realContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_num_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Last_inputsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(rulesParser.LPAREN, 0); }
		public TerminalNode INT() { return getToken(rulesParser.INT, 0); }
		public TerminalNode PREV() { return getToken(rulesParser.PREV, 0); }
		public TerminalNode RPAREN() { return getToken(rulesParser.RPAREN, 0); }
		public Last_inputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_last_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterLast_inputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitLast_inputs(this);
		}
	}

	public final Last_inputsContext last_inputs() throws RecognitionException {
		Last_inputsContext _localctx = new Last_inputsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_last_inputs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(LPAREN);
			setState(52);
			match(INT);
			setState(53);
			match(PREV);
			setState(54);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Armazenamento_memoriaContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(rulesParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ARMAZENAR() { return getToken(rulesParser.ARMAZENAR, 0); }
		public TerminalNode RPAREN() { return getToken(rulesParser.RPAREN, 0); }
		public Armazenamento_memoriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_armazenamento_memoria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterArmazenamento_memoria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitArmazenamento_memoria(this);
		}
	}

	public final Armazenamento_memoriaContext armazenamento_memoria() throws RecognitionException {
		Armazenamento_memoriaContext _localctx = new Armazenamento_memoriaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_armazenamento_memoria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(LPAREN);
			setState(57);
			expression();
			setState(58);
			match(ARMAZENAR);
			setState(59);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Get_armazenamento_memoriaContext extends ParserRuleContext {
		public TerminalNode ARMAZENAR() { return getToken(rulesParser.ARMAZENAR, 0); }
		public Get_armazenamento_memoriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_armazenamento_memoria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterGet_armazenamento_memoria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitGet_armazenamento_memoria(this);
		}
	}

	public final Get_armazenamento_memoriaContext get_armazenamento_memoria() throws RecognitionException {
		Get_armazenamento_memoriaContext _localctx = new Get_armazenamento_memoriaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_get_armazenamento_memoria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ARMAZENAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(rulesParser.ADD, 0); }
		public TerminalNode SUBTRACT() { return getToken(rulesParser.SUBTRACT, 0); }
		public TerminalNode MULTIPLY() { return getToken(rulesParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE_FLOAT() { return getToken(rulesParser.DIVIDE_FLOAT, 0); }
		public TerminalNode DIVIDE_INT() { return getToken(rulesParser.DIVIDE_INT, 0); }
		public TerminalNode REMAINDER() { return getToken(rulesParser.REMAINDER, 0); }
		public TerminalNode EXPONENTIAL() { return getToken(rulesParser.EXPONENTIAL, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 254L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(rulesParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(rulesParser.RPAREN, 0); }
		public Last_inputsContext last_inputs() {
			return getRuleContext(Last_inputsContext.class,0);
		}
		public Get_armazenamento_memoriaContext get_armazenamento_memoria() {
			return getRuleContext(Get_armazenamento_memoriaContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(LPAREN);
				setState(67);
				expression();
				setState(68);
				expression();
				setState(69);
				sign();
				setState(70);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				last_inputs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				get_armazenamento_memoria();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				num();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public Float_divisionContext float_division() {
			return getRuleContext(Float_divisionContext.class,0);
		}
		public Int_divisionContext int_division() {
			return getRuleContext(Int_divisionContext.class,0);
		}
		public Simple_operationContext simple_operation() {
			return getRuleContext(Simple_operationContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operation);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				float_division();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				int_division();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				simple_operation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_operationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(rulesParser.LPAREN, 0); }
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(rulesParser.RPAREN, 0); }
		public Simple_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterSimple_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitSimple_operation(this);
		}
	}

	public final Simple_operationContext simple_operation() throws RecognitionException {
		Simple_operationContext _localctx = new Simple_operationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simple_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(LPAREN);
			setState(83);
			num();
			setState(84);
			num();
			setState(85);
			sign();
			setState(86);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Float_divisionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(rulesParser.LPAREN, 0); }
		public List<Num_realContext> num_real() {
			return getRuleContexts(Num_realContext.class);
		}
		public Num_realContext num_real(int i) {
			return getRuleContext(Num_realContext.class,i);
		}
		public TerminalNode DIVIDE_FLOAT() { return getToken(rulesParser.DIVIDE_FLOAT, 0); }
		public TerminalNode RPAREN() { return getToken(rulesParser.RPAREN, 0); }
		public Float_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterFloat_division(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitFloat_division(this);
		}
	}

	public final Float_divisionContext float_division() throws RecognitionException {
		Float_divisionContext _localctx = new Float_divisionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_float_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(LPAREN);
			setState(89);
			num_real();
			setState(90);
			num_real();
			setState(91);
			match(DIVIDE_FLOAT);
			setState(92);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Int_divisionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(rulesParser.LPAREN, 0); }
		public List<Num_inteiroContext> num_inteiro() {
			return getRuleContexts(Num_inteiroContext.class);
		}
		public Num_inteiroContext num_inteiro(int i) {
			return getRuleContext(Num_inteiroContext.class,i);
		}
		public TerminalNode DIVIDE_INT() { return getToken(rulesParser.DIVIDE_INT, 0); }
		public TerminalNode RPAREN() { return getToken(rulesParser.RPAREN, 0); }
		public Int_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterInt_division(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitInt_division(this);
		}
	}

	public final Int_divisionContext int_division() throws RecognitionException {
		Int_divisionContext _localctx = new Int_divisionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_int_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(LPAREN);
			setState(95);
			num_inteiro();
			setState(96);
			num_inteiro();
			setState(97);
			match(DIVIDE_INT);
			setState(98);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000fe\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0003\u0000\u001f\b"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000#\b\u0000\n\u0000\f\u0000&\t"+
		"\u0000\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0003\u0002.\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tL\b\t\u0001\n\u0001\n\u0001\n"+
		"\u0003\nQ\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001$\u0000\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0001"+
		"\u0001\u0000\u0001\u0007`\u0000\u001c\u0001\u0000\u0000\u0000\u0002)\u0001"+
		"\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000"+
		"\u0000\b1\u0001\u0000\u0000\u0000\n3\u0001\u0000\u0000\u0000\f8\u0001"+
		"\u0000\u0000\u0000\u000e=\u0001\u0000\u0000\u0000\u0010?\u0001\u0000\u0000"+
		"\u0000\u0012K\u0001\u0000\u0000\u0000\u0014P\u0001\u0000\u0000\u0000\u0016"+
		"R\u0001\u0000\u0000\u0000\u0018X\u0001\u0000\u0000\u0000\u001a^\u0001"+
		"\u0000\u0000\u0000\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001f\u0005"+
		"\u000f\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001e\u001f\u0001"+
		"\u0000\u0000\u0000\u001f$\u0001\u0000\u0000\u0000 !\u0005\u000f\u0000"+
		"\u0000!#\u0003\u0002\u0001\u0000\" \u0001\u0000\u0000\u0000#&\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%\u0001"+
		"\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'*\u0003\u0012\t\u0000"+
		"(*\u0003\f\u0006\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000"+
		"\u0000*\u0003\u0001\u0000\u0000\u0000+.\u0003\u0006\u0003\u0000,.\u0003"+
		"\b\u0004\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.\u0005"+
		"\u0001\u0000\u0000\u0000/0\u0005\f\u0000\u00000\u0007\u0001\u0000\u0000"+
		"\u000012\u0005\r\u0000\u00002\t\u0001\u0000\u0000\u000034\u0005\b\u0000"+
		"\u000045\u0005\f\u0000\u000056\u0005\n\u0000\u000067\u0005\t\u0000\u0000"+
		"7\u000b\u0001\u0000\u0000\u000089\u0005\b\u0000\u00009:\u0003\u0012\t"+
		"\u0000:;\u0005\u000b\u0000\u0000;<\u0005\t\u0000\u0000<\r\u0001\u0000"+
		"\u0000\u0000=>\u0005\u000b\u0000\u0000>\u000f\u0001\u0000\u0000\u0000"+
		"?@\u0007\u0000\u0000\u0000@\u0011\u0001\u0000\u0000\u0000AL\u0003\u0014"+
		"\n\u0000BC\u0005\b\u0000\u0000CD\u0003\u0012\t\u0000DE\u0003\u0012\t\u0000"+
		"EF\u0003\u0010\b\u0000FG\u0005\t\u0000\u0000GL\u0001\u0000\u0000\u0000"+
		"HL\u0003\n\u0005\u0000IL\u0003\u000e\u0007\u0000JL\u0003\u0004\u0002\u0000"+
		"KA\u0001\u0000\u0000\u0000KB\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000L\u0013\u0001"+
		"\u0000\u0000\u0000MQ\u0003\u0018\f\u0000NQ\u0003\u001a\r\u0000OQ\u0003"+
		"\u0016\u000b\u0000PM\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PO\u0001\u0000\u0000\u0000Q\u0015\u0001\u0000\u0000\u0000RS\u0005\b\u0000"+
		"\u0000ST\u0003\u0004\u0002\u0000TU\u0003\u0004\u0002\u0000UV\u0003\u0010"+
		"\b\u0000VW\u0005\t\u0000\u0000W\u0017\u0001\u0000\u0000\u0000XY\u0005"+
		"\b\u0000\u0000YZ\u0003\b\u0004\u0000Z[\u0003\b\u0004\u0000[\\\u0005\u0004"+
		"\u0000\u0000\\]\u0005\t\u0000\u0000]\u0019\u0001\u0000\u0000\u0000^_\u0005"+
		"\b\u0000\u0000_`\u0003\u0006\u0003\u0000`a\u0003\u0006\u0003\u0000ab\u0005"+
		"\u0005\u0000\u0000bc\u0005\t\u0000\u0000c\u001b\u0001\u0000\u0000\u0000"+
		"\u0006\u001e$)-KP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}