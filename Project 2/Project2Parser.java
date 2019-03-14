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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, VAR=36, ID=37, DBL=38, COMMENT=39, 
		WS=40;
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
			"'--'", "'&&'", "'||'", "'!'", "'>'", "'>='", "'<'", "'<='", "'sqrt('", 
			"')'", "'s('", "'c('", "'l('", "'e('", "'print('", "'read()'", "'if('", 
			"'then'", "'{'", "'}'", "'else'", "'for('", "'while('", "'define'", "'('", 
			"'return'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"VAR", "ID", "DBL", "COMMENT", "WS"
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
		public ExprListContext et;
		public ExprListContext ef;
		public ExprContext e1;
		public ExprContext e2;
		public ExprContext e3;
		public ExprListContext ew;
		public ExprListContext ep;
		public ExprListContext ec;
		public ExprContext ert;
		public ExprContext er;
		public TerminalNode ID() { return getToken(Project2Parser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprListContext> exprList() {
			return getRuleContexts(ExprListContext.class);
		}
		public ExprListContext exprList(int i) {
			return getRuleContext(ExprListContext.class,i);
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
			setState(117);
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
				((ExprContext)_localctx).e = expr(22);
				}
				break;
			case 6:
				{
				setState(37);
				((ExprContext)_localctx).op = match(T__17);
				setState(38);
				((ExprContext)_localctx).e = expr(0);
				setState(39);
				match(T__18);
				}
				break;
			case 7:
				{
				setState(41);
				((ExprContext)_localctx).op = match(T__19);
				setState(42);
				((ExprContext)_localctx).e = expr(0);
				setState(43);
				match(T__18);
				}
				break;
			case 8:
				{
				setState(45);
				((ExprContext)_localctx).op = match(T__20);
				setState(46);
				((ExprContext)_localctx).e = expr(0);
				setState(47);
				match(T__18);
				}
				break;
			case 9:
				{
				setState(49);
				((ExprContext)_localctx).op = match(T__21);
				setState(50);
				((ExprContext)_localctx).e = expr(0);
				setState(51);
				match(T__18);
				}
				break;
			case 10:
				{
				setState(53);
				((ExprContext)_localctx).op = match(T__22);
				setState(54);
				((ExprContext)_localctx).e = expr(0);
				setState(55);
				match(T__18);
				}
				break;
			case 11:
				{
				setState(57);
				((ExprContext)_localctx).op = match(T__23);
				setState(58);
				((ExprContext)_localctx).e = expr(0);
				setState(59);
				match(T__18);
				}
				break;
			case 12:
				{
				setState(61);
				((ExprContext)_localctx).op = match(T__24);
				}
				break;
			case 13:
				{
				setState(62);
				match(ID);
				setState(63);
				match(T__1);
				setState(64);
				((ExprContext)_localctx).e = expr(10);
				}
				break;
			case 14:
				{
				setState(65);
				((ExprContext)_localctx).op = match(T__25);
				setState(66);
				((ExprContext)_localctx).e = expr(0);
				setState(67);
				match(T__18);
				setState(68);
				match(T__26);
				setState(69);
				match(T__27);
				setState(70);
				((ExprContext)_localctx).et = exprList();
				setState(71);
				match(T__28);
				setState(72);
				match(T__29);
				setState(73);
				match(T__27);
				setState(74);
				((ExprContext)_localctx).ef = exprList();
				setState(75);
				match(T__28);
				}
				break;
			case 15:
				{
				setState(77);
				((ExprContext)_localctx).op = match(T__30);
				setState(78);
				((ExprContext)_localctx).e1 = expr(0);
				setState(79);
				((ExprContext)_localctx).e2 = expr(0);
				setState(80);
				((ExprContext)_localctx).e3 = expr(0);
				setState(81);
				match(T__18);
				setState(82);
				match(T__27);
				setState(83);
				((ExprContext)_localctx).ef = exprList();
				setState(84);
				match(T__28);
				}
				break;
			case 16:
				{
				setState(86);
				((ExprContext)_localctx).op = match(T__31);
				setState(87);
				((ExprContext)_localctx).e = expr(0);
				setState(88);
				match(T__18);
				setState(89);
				match(T__27);
				setState(90);
				((ExprContext)_localctx).ew = exprList();
				setState(91);
				match(T__28);
				}
				break;
			case 17:
				{
				setState(93);
				match(T__32);
				setState(94);
				((ExprContext)_localctx).op = match(ID);
				setState(95);
				match(T__33);
				setState(96);
				((ExprContext)_localctx).ep = exprList();
				setState(97);
				match(T__18);
				setState(98);
				match(T__27);
				setState(99);
				((ExprContext)_localctx).ec = exprList();
				setState(100);
				match(T__34);
				setState(101);
				((ExprContext)_localctx).ert = expr(0);
				setState(102);
				match(T__0);
				setState(103);
				match(T__28);
				}
				break;
			case 18:
				{
				setState(105);
				((ExprContext)_localctx).op = match(ID);
				setState(106);
				match(T__33);
				setState(107);
				((ExprContext)_localctx).ep = exprList();
				setState(108);
				match(T__18);
				}
				break;
			case 19:
				{
				setState(110);
				match(DBL);
				}
				break;
			case 20:
				{
				setState(111);
				match(ID);
				}
				break;
			case 21:
				{
				setState(112);
				match(COMMENT);
				}
				break;
			case 22:
				{
				setState(113);
				match(T__33);
				setState(114);
				((ExprContext)_localctx).e = expr(0);
				setState(115);
				match(T__18);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(120);
						((ExprContext)_localctx).op = match(T__2);
						setState(121);
						((ExprContext)_localctx).er = expr(35);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(123);
						((ExprContext)_localctx).op = match(T__3);
						setState(124);
						((ExprContext)_localctx).er = expr(34);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(126);
						((ExprContext)_localctx).op = match(T__4);
						setState(127);
						((ExprContext)_localctx).er = expr(33);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(129);
						((ExprContext)_localctx).op = match(T__5);
						setState(130);
						((ExprContext)_localctx).er = expr(32);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(132);
						((ExprContext)_localctx).op = match(T__6);
						setState(133);
						((ExprContext)_localctx).er = expr(31);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(135);
						((ExprContext)_localctx).op = match(T__7);
						setState(136);
						((ExprContext)_localctx).er = expr(30);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(138);
						((ExprContext)_localctx).op = match(T__10);
						setState(139);
						((ExprContext)_localctx).er = expr(25);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(141);
						((ExprContext)_localctx).op = match(T__11);
						setState(142);
						((ExprContext)_localctx).er = expr(24);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(144);
						((ExprContext)_localctx).op = match(T__13);
						setState(145);
						((ExprContext)_localctx).er = expr(22);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(147);
						((ExprContext)_localctx).op = match(T__14);
						setState(148);
						((ExprContext)_localctx).er = expr(21);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(150);
						((ExprContext)_localctx).op = match(T__15);
						setState(151);
						((ExprContext)_localctx).er = expr(20);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(153);
						((ExprContext)_localctx).op = match(T__16);
						setState(154);
						((ExprContext)_localctx).er = expr(19);
						}
						break;
					}
					} 
				}
				setState(159);
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
			return precpred(_ctx, 34);
		case 1:
			return precpred(_ctx, 33);
		case 2:
			return precpred(_ctx, 32);
		case 3:
			return precpred(_ctx, 31);
		case 4:
			return precpred(_ctx, 30);
		case 5:
			return precpred(_ctx, 29);
		case 6:
			return precpred(_ctx, 24);
		case 7:
			return precpred(_ctx, 23);
		case 8:
			return precpred(_ctx, 21);
		case 9:
			return precpred(_ctx, 20);
		case 10:
			return precpred(_ctx, 19);
		case 11:
			return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00a3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\5\2"+
		"\24\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5x\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u009e"+
		"\n\5\f\5\16\5\u00a1\13\5\3\5\2\3\b\6\2\4\6\b\2\2\2\u00c1\2\n\3\2\2\2\4"+
		"\25\3\2\2\2\6\32\3\2\2\2\bw\3\2\2\2\n\17\5\6\4\2\13\f\7\3\2\2\f\16\5\6"+
		"\4\2\r\13\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\23\3\2\2"+
		"\2\21\17\3\2\2\2\22\24\7\3\2\2\23\22\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2"+
		"\2\25\26\7&\2\2\26\27\7\'\2\2\27\30\7\4\2\2\30\31\5\b\5\2\31\5\3\2\2\2"+
		"\32\33\5\b\5\2\33\7\3\2\2\2\34\35\b\5\1\2\35\36\7\13\2\2\36x\7\'\2\2\37"+
		" \7\f\2\2 x\7\'\2\2!\"\7\'\2\2\"x\7\13\2\2#$\7\'\2\2$x\7\f\2\2%&\7\17"+
		"\2\2&x\5\b\5\30\'(\7\24\2\2()\5\b\5\2)*\7\25\2\2*x\3\2\2\2+,\7\26\2\2"+
		",-\5\b\5\2-.\7\25\2\2.x\3\2\2\2/\60\7\27\2\2\60\61\5\b\5\2\61\62\7\25"+
		"\2\2\62x\3\2\2\2\63\64\7\30\2\2\64\65\5\b\5\2\65\66\7\25\2\2\66x\3\2\2"+
		"\2\678\7\31\2\289\5\b\5\29:\7\25\2\2:x\3\2\2\2;<\7\32\2\2<=\5\b\5\2=>"+
		"\7\25\2\2>x\3\2\2\2?x\7\33\2\2@A\7\'\2\2AB\7\4\2\2Bx\5\b\5\fCD\7\34\2"+
		"\2DE\5\b\5\2EF\7\25\2\2FG\7\35\2\2GH\7\36\2\2HI\5\2\2\2IJ\7\37\2\2JK\7"+
		" \2\2KL\7\36\2\2LM\5\2\2\2MN\7\37\2\2Nx\3\2\2\2OP\7!\2\2PQ\5\b\5\2QR\5"+
		"\b\5\2RS\5\b\5\2ST\7\25\2\2TU\7\36\2\2UV\5\2\2\2VW\7\37\2\2Wx\3\2\2\2"+
		"XY\7\"\2\2YZ\5\b\5\2Z[\7\25\2\2[\\\7\36\2\2\\]\5\2\2\2]^\7\37\2\2^x\3"+
		"\2\2\2_`\7#\2\2`a\7\'\2\2ab\7$\2\2bc\5\2\2\2cd\7\25\2\2de\7\36\2\2ef\5"+
		"\2\2\2fg\7%\2\2gh\5\b\5\2hi\7\3\2\2ij\7\37\2\2jx\3\2\2\2kl\7\'\2\2lm\7"+
		"$\2\2mn\5\2\2\2no\7\25\2\2ox\3\2\2\2px\7(\2\2qx\7\'\2\2rx\7)\2\2st\7$"+
		"\2\2tu\5\b\5\2uv\7\25\2\2vx\3\2\2\2w\34\3\2\2\2w\37\3\2\2\2w!\3\2\2\2"+
		"w#\3\2\2\2w%\3\2\2\2w\'\3\2\2\2w+\3\2\2\2w/\3\2\2\2w\63\3\2\2\2w\67\3"+
		"\2\2\2w;\3\2\2\2w?\3\2\2\2w@\3\2\2\2wC\3\2\2\2wO\3\2\2\2wX\3\2\2\2w_\3"+
		"\2\2\2wk\3\2\2\2wp\3\2\2\2wq\3\2\2\2wr\3\2\2\2ws\3\2\2\2x\u009f\3\2\2"+
		"\2yz\f$\2\2z{\7\5\2\2{\u009e\5\b\5%|}\f#\2\2}~\7\6\2\2~\u009e\5\b\5$\177"+
		"\u0080\f\"\2\2\u0080\u0081\7\7\2\2\u0081\u009e\5\b\5#\u0082\u0083\f!\2"+
		"\2\u0083\u0084\7\b\2\2\u0084\u009e\5\b\5\"\u0085\u0086\f \2\2\u0086\u0087"+
		"\7\t\2\2\u0087\u009e\5\b\5!\u0088\u0089\f\37\2\2\u0089\u008a\7\n\2\2\u008a"+
		"\u009e\5\b\5 \u008b\u008c\f\32\2\2\u008c\u008d\7\r\2\2\u008d\u009e\5\b"+
		"\5\33\u008e\u008f\f\31\2\2\u008f\u0090\7\16\2\2\u0090\u009e\5\b\5\32\u0091"+
		"\u0092\f\27\2\2\u0092\u0093\7\20\2\2\u0093\u009e\5\b\5\30\u0094\u0095"+
		"\f\26\2\2\u0095\u0096\7\21\2\2\u0096\u009e\5\b\5\27\u0097\u0098\f\25\2"+
		"\2\u0098\u0099\7\22\2\2\u0099\u009e\5\b\5\26\u009a\u009b\f\24\2\2\u009b"+
		"\u009c\7\23\2\2\u009c\u009e\5\b\5\25\u009dy\3\2\2\2\u009d|\3\2\2\2\u009d"+
		"\177\3\2\2\2\u009d\u0082\3\2\2\2\u009d\u0085\3\2\2\2\u009d\u0088\3\2\2"+
		"\2\u009d\u008b\3\2\2\2\u009d\u008e\3\2\2\2\u009d\u0091\3\2\2\2\u009d\u0094"+
		"\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u009a\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\t\3\2\2\2\u00a1\u009f\3\2\2\2"+
		"\7\17\23w\u009d\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}