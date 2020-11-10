// Generated from exemplo.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class exemploParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, INPUT=24, 
		ELSE=25, ID=26, WS=27, NUMBER=28, INT=29, FLOAT=30, STRING=31;
	public static final int
		RULE_start = 0, RULE_func = 1, RULE_args = 2, RULE_statms = 3, RULE_statm = 4, 
		RULE_call = 5, RULE_exprs = 6, RULE_expr = 7, RULE_summ = 8, RULE_mult = 9, 
		RULE_atom = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "func", "args", "statms", "statm", "call", "exprs", "expr", 
			"summ", "mult", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'('", "')'", "','", "'{'", "'}'", "'='", "';'", "'print'", 
			"'if'", "'while'", "'for'", "'return'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'input'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INPUT", "ELSE", "ID", "WS", "NUMBER", "INT", "FLOAT", "STRING"
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
	public String getGrammarFileName() { return "exemplo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public exemploParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(exemploParser.EOF, 0); }
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(22);
				func();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(EOF);
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

	public static class FuncContext extends ParserRuleContext {
		public Token name;
		public StatmsContext statms() {
			return getRuleContext(StatmsContext.class,0);
		}
		public TerminalNode ID() { return getToken(exemploParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			((FuncContext)_localctx).name = match(ID);
			setState(32);
			match(T__1);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(33);
				args();
				}
			}

			setState(36);
			match(T__2);
			setState(37);
			statms();
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

	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(exemploParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(exemploParser.ID, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ID);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(40);
				match(T__3);
				setState(41);
				match(ID);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatmsContext extends ParserRuleContext {
		public List<StatmContext> statm() {
			return getRuleContexts(StatmContext.class);
		}
		public StatmContext statm(int i) {
			return getRuleContext(StatmContext.class,i);
		}
		public StatmsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).enterStatms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).exitStatms(this);
		}
	}

	public final StatmsContext statms() throws RecognitionException {
		StatmsContext _localctx = new StatmsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statms);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(T__4);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << ID))) != 0)) {
					{
					{
					setState(48);
					statm();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				match(T__5);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				statm();
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

	public static class StatmContext extends ParserRuleContext {
		public StatmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statm; }
	 
		public StatmContext() { }
		public void copyFrom(StatmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends StatmContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(StatmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).exitPrint(this);
		}
	}
	public static class ForContext extends StatmContext {
		public ExprContext cond;
		public List<StatmsContext> statms() {
			return getRuleContexts(StatmsContext.class);
		}
		public StatmsContext statms(int i) {
			return getRuleContext(StatmsContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForContext(StatmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).exitFor(this);
		}
	}
	public static class WhileContext extends StatmContext {
		public ExprContext cond;
		public StatmsContext statms() {
			return getRuleContext(StatmsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileContext(StatmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).exitWhile(this);
		}
	}
	public static class IfContext extends StatmContext {
		public ExprContext cond;
		public StatmsContext then;
		public StatmsContext otherwise;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatmsContext> statms() {
			return getRuleContexts(StatmsContext.class);
		}
		public StatmsContext statms(int i) {
			return getRuleContext(StatmsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(exemploParser.ELSE, 0); }
		public IfContext(StatmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).exitIf(this);
		}
	}
	public static class ReturnContext extends StatmContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(StatmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).exitReturn(this);
		}
	}
	public static class AssignContext extends StatmContext {
		public TerminalNode ID() { return getToken(exemploParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(StatmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).exitAssign(this);
		}
	}

	public final StatmContext statm() throws RecognitionException {
		StatmContext _localctx = new StatmContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statm);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(ID);
				setState(59);
				match(T__6);
				setState(60);
				expr();
				setState(61);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(T__8);
				setState(64);
				expr();
				setState(65);
				match(T__7);
				}
				break;
			case T__9:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(T__9);
				setState(68);
				((IfContext)_localctx).cond = expr();
				setState(69);
				((IfContext)_localctx).then = statms();
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(70);
					match(ELSE);
					setState(71);
					((IfContext)_localctx).otherwise = statms();
					}
					break;
				}
				}
				break;
			case T__10:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(T__10);
				setState(75);
				((WhileContext)_localctx).cond = expr();
				setState(76);
				statms();
				}
				break;
			case T__11:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				match(T__11);
				setState(79);
				match(T__1);
				setState(80);
				statms();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << INPUT) | (1L << ID) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(81);
					((ForContext)_localctx).cond = expr();
					}
				}

				setState(84);
				match(T__7);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << INPUT) | (1L << ID) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(85);
					expr();
					}
				}

				setState(88);
				match(T__2);
				setState(89);
				statms();
				}
				break;
			case T__12:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				match(T__12);
				setState(92);
				expr();
				setState(93);
				match(T__7);
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

	public static class CallContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(exemploParser.ID, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			((CallContext)_localctx).name = match(ID);
			setState(98);
			match(T__1);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << INPUT) | (1L << ID) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(99);
				exprs();
				}
			}

			setState(102);
			match(T__2);
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

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).exitExprs(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			expr();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(105);
				match(T__3);
				setState(106);
				expr();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExprContext extends ParserRuleContext {
		public SummContext left;
		public Token op;
		public ExprContext right;
		public SummContext summ() {
			return getRuleContext(SummContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		int _la;
		try {
			int _alt;
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				((ExprContext)_localctx).left = summ();
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(113);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(114);
						((ExprContext)_localctx).right = expr();
						}
						} 
					}
					setState(119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				atom();
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

	public static class SummContext extends ParserRuleContext {
		public MultContext left;
		public Token op;
		public SummContext right;
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public List<SummContext> summ() {
			return getRuleContexts(SummContext.class);
		}
		public SummContext summ(int i) {
			return getRuleContext(SummContext.class,i);
		}
		public SummContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).enterSumm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).exitSumm(this);
		}
	}

	public final SummContext summ() throws RecognitionException {
		SummContext _localctx = new SummContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_summ);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((SummContext)_localctx).left = mult();
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					((SummContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__19 || _la==T__20) ) {
						((SummContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(125);
					((SummContext)_localctx).right = summ();
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class MultContext extends ParserRuleContext {
		public AtomContext left;
		public Token op;
		public MultContext right;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<MultContext> mult() {
			return getRuleContexts(MultContext.class);
		}
		public MultContext mult(int i) {
			return getRuleContext(MultContext.class,i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).exitMult(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mult);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((MultContext)_localctx).left = atom();
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					((MultContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__21 || _la==T__22) ) {
						((MultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(133);
					((MultContext)_localctx).right = mult();
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(exemploParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(exemploParser.STRING, 0); }
		public TerminalNode ID() { return getToken(exemploParser.ID, 0); }
		public TerminalNode INPUT() { return getToken(exemploParser.INPUT, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exemploListener ) ((exemploListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atom);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(T__1);
				setState(140);
				expr();
				setState(141);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				match(INPUT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				call();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u0099\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5"+
		"\3%\n\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\5\3\5\7\5"+
		"\64\n\5\f\5\16\5\67\13\5\3\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6K\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6U\n\6\3\6\3\6\5\6Y\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6b\n\6\3\7\3"+
		"\7\3\7\5\7g\n\7\3\7\3\7\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\t\3\t\3"+
		"\t\7\tv\n\t\f\t\16\ty\13\t\3\t\5\t|\n\t\3\n\3\n\3\n\7\n\u0081\n\n\f\n"+
		"\16\n\u0084\13\n\3\13\3\13\3\13\7\13\u0089\n\13\f\13\16\13\u008c\13\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0097\n\f\3\f\2\2\r\2\4\6\b\n"+
		"\f\16\20\22\24\26\2\5\3\2\20\25\3\2\26\27\3\2\30\31\2\u00a5\2\33\3\2\2"+
		"\2\4 \3\2\2\2\6)\3\2\2\2\b:\3\2\2\2\na\3\2\2\2\fc\3\2\2\2\16j\3\2\2\2"+
		"\20{\3\2\2\2\22}\3\2\2\2\24\u0085\3\2\2\2\26\u0096\3\2\2\2\30\32\5\4\3"+
		"\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2"+
		"\2\35\33\3\2\2\2\36\37\7\2\2\3\37\3\3\2\2\2 !\7\3\2\2!\"\7\34\2\2\"$\7"+
		"\4\2\2#%\5\6\4\2$#\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\5\2\2\'(\5\b\5\2("+
		"\5\3\2\2\2).\7\34\2\2*+\7\6\2\2+-\7\34\2\2,*\3\2\2\2-\60\3\2\2\2.,\3\2"+
		"\2\2./\3\2\2\2/\7\3\2\2\2\60.\3\2\2\2\61\65\7\7\2\2\62\64\5\n\6\2\63\62"+
		"\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3"+
		"\2\2\28;\7\b\2\29;\5\n\6\2:\61\3\2\2\2:9\3\2\2\2;\t\3\2\2\2<=\7\34\2\2"+
		"=>\7\t\2\2>?\5\20\t\2?@\7\n\2\2@b\3\2\2\2AB\7\13\2\2BC\5\20\t\2CD\7\n"+
		"\2\2Db\3\2\2\2EF\7\f\2\2FG\5\20\t\2GJ\5\b\5\2HI\7\33\2\2IK\5\b\5\2JH\3"+
		"\2\2\2JK\3\2\2\2Kb\3\2\2\2LM\7\r\2\2MN\5\20\t\2NO\5\b\5\2Ob\3\2\2\2PQ"+
		"\7\16\2\2QR\7\4\2\2RT\5\b\5\2SU\5\20\t\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2"+
		"VX\7\n\2\2WY\5\20\t\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\5\2\2[\\\5\b\5"+
		"\2\\b\3\2\2\2]^\7\17\2\2^_\5\20\t\2_`\7\n\2\2`b\3\2\2\2a<\3\2\2\2aA\3"+
		"\2\2\2aE\3\2\2\2aL\3\2\2\2aP\3\2\2\2a]\3\2\2\2b\13\3\2\2\2cd\7\34\2\2"+
		"df\7\4\2\2eg\5\16\b\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\5\2\2i\r\3\2\2"+
		"\2jo\5\20\t\2kl\7\6\2\2ln\5\20\t\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2"+
		"\2\2p\17\3\2\2\2qo\3\2\2\2rw\5\22\n\2st\t\2\2\2tv\5\20\t\2us\3\2\2\2v"+
		"y\3\2\2\2wu\3\2\2\2wx\3\2\2\2x|\3\2\2\2yw\3\2\2\2z|\5\26\f\2{r\3\2\2\2"+
		"{z\3\2\2\2|\21\3\2\2\2}\u0082\5\24\13\2~\177\t\3\2\2\177\u0081\5\22\n"+
		"\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\23\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u008a\5\26\f\2\u0086"+
		"\u0087\t\4\2\2\u0087\u0089\5\24\13\2\u0088\u0086\3\2\2\2\u0089\u008c\3"+
		"\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\25\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\7\4\2\2\u008e\u008f\5\20\t\2\u008f\u0090\7"+
		"\5\2\2\u0090\u0097\3\2\2\2\u0091\u0097\7\36\2\2\u0092\u0097\7!\2\2\u0093"+
		"\u0097\7\34\2\2\u0094\u0097\7\32\2\2\u0095\u0097\5\f\7\2\u0096\u008d\3"+
		"\2\2\2\u0096\u0091\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\27\3\2\2\2\22\33$.\65:JTXafo"+
		"w{\u0082\u008a\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}