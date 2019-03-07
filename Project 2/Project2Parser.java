// Generated from Project2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Project2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, VAR=23, ID=24, DBL=25, 
		COMMENT=26, WS=27;
	public static final int
		RULE_exprList = 0, RULE_varDef = 1, RULE_topExpr = 2, RULE_expr = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"exprList", "varDef", "topExpr", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'*'", "'/'", "'+'", "'-'", "'%'", "'^'", "'++'", 
			"'--'", "'&&'", "'||'", "'!'", "'sqrt('", "')'", "'s('", "'c('", "'l('", 
			"'e('", "'print('", "'read()'", "'('", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "VAR", 
			"ID", "DBL", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Project2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Project2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<TopExprContext> topExpr() {
			return getRuleContexts(TopExprContext.class);
		}
		public TopExprContext topExpr(int i) {
			return getRuleContext(TopExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exprList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			topExpr();
			setState(13);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(9);
					match(T__0);
					setState(10);
					topExpr();
					}
					} 
				}
				setState(15);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(16);
				match(T__0);
				}
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

	public static class VarDefContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Project2Parser.VAR, 0); }
		public TerminalNode ID() { return getToken(Project2Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(VAR);
			setState(20);
			match(ID);
			setState(21);
			match(T__1);
			setState(22);
			expr(0);
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

	public static class TopExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TopExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterTopExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitTopExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitTopExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopExprContext topExpr() throws RecognitionException {
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_topExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext el;
		public Token op;
		public ExprContext e;
		public ExprContext er;
		public TerminalNode ID() { return getToken(Project2Parser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DBL() { return getToken(Project2Parser.DBL, 0); }
		public TerminalNode COMMENT() { return getToken(Project2Parser.COMMENT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Project2Listener ) ((Project2Listener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Project2Visitor ) return ((Project2Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(27);
				((ExprContext)_localctx).op = match(T__8);
				setState(28);
				match(ID);
				}
				break;
			case 2:
				{
				setState(29);
				((ExprContext)_localctx).op = match(T__9);
				setState(30);
				match(ID);
				}
				break;
			case 3:
				{
				setState(31);
				match(ID);
				setState(32);
				((ExprContext)_localctx).op = match(T__8);
				}
				break;
			case 4:
				{
				setState(33);
				match(ID);
				setState(34);
				((ExprContext)_localctx).op = match(T__9);
				}
				break;
			case 5:
				{
				setState(35);
				((ExprContext)_localctx).op = match(T__12);
				setState(36);
				((ExprContext)_localctx).e = expr(13);
				}
				break;
			case 6:
				{
				setState(37);
				((ExprContext)_localctx).op = match(T__13);
				setState(38);
				((ExprContext)_localctx).e = expr(0);
				setState(39);
				match(T__14);
				}
				break;
			case 7:
				{
				setState(41);
				((ExprContext)_localctx).op = match(T__15);
				setState(42);
				((ExprContext)_localctx).e = expr(0);
				setState(43);
				match(T__14);
				}
				break;
			case 8:
				{
				setState(45);
				((ExprContext)_localctx).op = match(T__16);
				setState(46);
				((ExprContext)_localctx).e = expr(0);
				setState(47);
				match(T__14);
				}
				break;
			case 9:
				{
				setState(49);
				((ExprContext)_localctx).op = match(T__17);
				setState(50);
				((ExprContext)_localctx).e = expr(0);
				setState(51);
				match(T__14);
				}
				break;
			case 10:
				{
				setState(53);
				((ExprContext)_localctx).op = match(T__18);
				setState(54);
				((ExprContext)_localctx).e = expr(0);
				setState(55);
				match(T__14);
				}
				break;
			case 11:
				{
				setState(57);
				((ExprContext)_localctx).op = match(T__19);
				setState(58);
				((ExprContext)_localctx).e = expr(0);
				setState(59);
				match(T__14);
				}
				break;
			case 12:
				{
				setState(61);
				((ExprContext)_localctx).op = match(T__20);
				}
				break;
			case 13:
				{
				setState(62);
				match(ID);
				setState(63);
				match(T__1);
				setState(64);
				((ExprContext)_localctx).e = expr(5);
				}
				break;
			case 14:
				{
				setState(65);
				match(DBL);
				}
				break;
			case 15:
				{
				setState(66);
				match(ID);
				}
				break;
			case 16:
				{
				setState(67);
				match(COMMENT);
				}
				break;
			case 17:
				{
				setState(68);
				match(T__21);
				setState(69);
				((ExprContext)_localctx).e = expr(0);
				setState(70);
				match(T__14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(98);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(74);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(75);
						((ExprContext)_localctx).op = match(T__2);
						setState(76);
						((ExprContext)_localctx).er = expr(26);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(77);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(78);
						((ExprContext)_localctx).op = match(T__3);
						setState(79);
						((ExprContext)_localctx).er = expr(25);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(80);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(81);
						((ExprContext)_localctx).op = match(T__4);
						setState(82);
						((ExprContext)_localctx).er = expr(24);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(83);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(84);
						((ExprContext)_localctx).op = match(T__5);
						setState(85);
						((ExprContext)_localctx).er = expr(23);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(87);
						((ExprContext)_localctx).op = match(T__6);
						setState(88);
						((ExprContext)_localctx).er = expr(22);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(90);
						((ExprContext)_localctx).op = match(T__7);
						setState(91);
						((ExprContext)_localctx).er = expr(21);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(92);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(93);
						((ExprContext)_localctx).op = match(T__10);
						setState(94);
						((ExprContext)_localctx).er = expr(16);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(95);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(96);
						((ExprContext)_localctx).op = match(T__11);
						setState(97);
						((ExprContext)_localctx).er = expr(15);
						}
						break;
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 25);
		case 1:
			return precpred(_ctx, 24);
		case 2:
			return precpred(_ctx, 23);
		case 3:
			return precpred(_ctx, 22);
		case 4:
			return precpred(_ctx, 21);
		case 5:
			return precpred(_ctx, 20);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\5\2\24"+
		"\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5K\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\3\5"+
		"\2\3\b\6\2\4\6\b\2\2\2\177\2\n\3\2\2\2\4\25\3\2\2\2\6\32\3\2\2\2\bJ\3"+
		"\2\2\2\n\17\5\6\4\2\13\f\7\3\2\2\f\16\5\6\4\2\r\13\3\2\2\2\16\21\3\2\2"+
		"\2\17\r\3\2\2\2\17\20\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\22\24\7\3\2"+
		"\2\23\22\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\26\7\31\2\2\26\27\7\32"+
		"\2\2\27\30\7\4\2\2\30\31\5\b\5\2\31\5\3\2\2\2\32\33\5\b\5\2\33\7\3\2\2"+
		"\2\34\35\b\5\1\2\35\36\7\13\2\2\36K\7\32\2\2\37 \7\f\2\2 K\7\32\2\2!\""+
		"\7\32\2\2\"K\7\13\2\2#$\7\32\2\2$K\7\f\2\2%&\7\17\2\2&K\5\b\5\17\'(\7"+
		"\20\2\2()\5\b\5\2)*\7\21\2\2*K\3\2\2\2+,\7\22\2\2,-\5\b\5\2-.\7\21\2\2"+
		".K\3\2\2\2/\60\7\23\2\2\60\61\5\b\5\2\61\62\7\21\2\2\62K\3\2\2\2\63\64"+
		"\7\24\2\2\64\65\5\b\5\2\65\66\7\21\2\2\66K\3\2\2\2\678\7\25\2\289\5\b"+
		"\5\29:\7\21\2\2:K\3\2\2\2;<\7\26\2\2<=\5\b\5\2=>\7\21\2\2>K\3\2\2\2?K"+
		"\7\27\2\2@A\7\32\2\2AB\7\4\2\2BK\5\b\5\7CK\7\33\2\2DK\7\32\2\2EK\7\34"+
		"\2\2FG\7\30\2\2GH\5\b\5\2HI\7\21\2\2IK\3\2\2\2J\34\3\2\2\2J\37\3\2\2\2"+
		"J!\3\2\2\2J#\3\2\2\2J%\3\2\2\2J\'\3\2\2\2J+\3\2\2\2J/\3\2\2\2J\63\3\2"+
		"\2\2J\67\3\2\2\2J;\3\2\2\2J?\3\2\2\2J@\3\2\2\2JC\3\2\2\2JD\3\2\2\2JE\3"+
		"\2\2\2JF\3\2\2\2Kf\3\2\2\2LM\f\33\2\2MN\7\5\2\2Ne\5\b\5\34OP\f\32\2\2"+
		"PQ\7\6\2\2Qe\5\b\5\33RS\f\31\2\2ST\7\7\2\2Te\5\b\5\32UV\f\30\2\2VW\7\b"+
		"\2\2We\5\b\5\31XY\f\27\2\2YZ\7\t\2\2Ze\5\b\5\30[\\\f\26\2\2\\]\7\n\2\2"+
		"]e\5\b\5\27^_\f\21\2\2_`\7\r\2\2`e\5\b\5\22ab\f\20\2\2bc\7\16\2\2ce\5"+
		"\b\5\21dL\3\2\2\2dO\3\2\2\2dR\3\2\2\2dU\3\2\2\2dX\3\2\2\2d[\3\2\2\2d^"+
		"\3\2\2\2da\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\t\3\2\2\2hf\3\2\2\2"+
		"\7\17\23Jdf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}