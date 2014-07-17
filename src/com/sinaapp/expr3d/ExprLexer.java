// Generated from Expr.g4 by ANTLR 4.2.2

package com.sinaapp.expr3d;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__32=1, T__31=2, T__30=3, T__29=4, T__28=5, T__27=6, T__26=7, T__25=8, 
		T__24=9, T__23=10, T__22=11, T__21=12, T__20=13, T__19=14, T__18=15, T__17=16, 
		T__16=17, T__15=18, T__14=19, T__13=20, T__12=21, T__11=22, T__10=23, 
		T__9=24, T__8=25, T__7=26, T__6=27, T__5=28, T__4=29, T__3=30, T__2=31, 
		T__1=32, T__0=33, ID=34, INT=35, FLOAT=36, WS=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'continue'", "'def'", "'return'", "'{'", "'||'", "';'", "'&&'", 
		"'}'", "'if'", "'for'", "':='", "'<='", "'break'", "'('", "'*'", "','", 
		"'to'", "'>='", "'['", "'<'", "'=='", "']'", "'>'", "'!'", "'%'", "'else'", 
		"'begin'", "'end'", "')'", "'+'", "'then'", "'-'", "ID", "INT", "FLOAT", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", 
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"ID", "INT", "FLOAT", "WS"
	};


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 36: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u00da\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3!\3!\3!\3\"\3\"\3#\3#\7#\u00ba\n#\f#\16#\u00bd\13#\3$\6$\u00c0\n"+
		"$\r$\16$\u00c1\3%\3%\3%\7%\u00c7\n%\f%\16%\u00ca\13%\3%\3%\6%\u00ce\n"+
		"%\r%\16%\u00cf\5%\u00d2\n%\3&\6&\u00d5\n&\r&\16&\u00d6\3&\3&\2\2\'\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'\3\2\5\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u00df"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7X\3\2\2\2\t\\\3\2\2\2"+
		"\13c\3\2\2\2\re\3\2\2\2\17h\3\2\2\2\21j\3\2\2\2\23m\3\2\2\2\25o\3\2\2"+
		"\2\27r\3\2\2\2\31v\3\2\2\2\33y\3\2\2\2\35|\3\2\2\2\37\u0082\3\2\2\2!\u0084"+
		"\3\2\2\2#\u0086\3\2\2\2%\u0088\3\2\2\2\'\u008b\3\2\2\2)\u008e\3\2\2\2"+
		"+\u0090\3\2\2\2-\u0092\3\2\2\2/\u0095\3\2\2\2\61\u0097\3\2\2\2\63\u0099"+
		"\3\2\2\2\65\u009b\3\2\2\2\67\u009d\3\2\2\29\u00a2\3\2\2\2;\u00a8\3\2\2"+
		"\2=\u00ac\3\2\2\2?\u00ae\3\2\2\2A\u00b0\3\2\2\2C\u00b5\3\2\2\2E\u00b7"+
		"\3\2\2\2G\u00bf\3\2\2\2I\u00d1\3\2\2\2K\u00d4\3\2\2\2MN\7\61\2\2N\4\3"+
		"\2\2\2OP\7e\2\2PQ\7q\2\2QR\7p\2\2RS\7v\2\2ST\7k\2\2TU\7p\2\2UV\7w\2\2"+
		"VW\7g\2\2W\6\3\2\2\2XY\7f\2\2YZ\7g\2\2Z[\7h\2\2[\b\3\2\2\2\\]\7t\2\2]"+
		"^\7g\2\2^_\7v\2\2_`\7w\2\2`a\7t\2\2ab\7p\2\2b\n\3\2\2\2cd\7}\2\2d\f\3"+
		"\2\2\2ef\7~\2\2fg\7~\2\2g\16\3\2\2\2hi\7=\2\2i\20\3\2\2\2jk\7(\2\2kl\7"+
		"(\2\2l\22\3\2\2\2mn\7\177\2\2n\24\3\2\2\2op\7k\2\2pq\7h\2\2q\26\3\2\2"+
		"\2rs\7h\2\2st\7q\2\2tu\7t\2\2u\30\3\2\2\2vw\7<\2\2wx\7?\2\2x\32\3\2\2"+
		"\2yz\7>\2\2z{\7?\2\2{\34\3\2\2\2|}\7d\2\2}~\7t\2\2~\177\7g\2\2\177\u0080"+
		"\7c\2\2\u0080\u0081\7m\2\2\u0081\36\3\2\2\2\u0082\u0083\7*\2\2\u0083 "+
		"\3\2\2\2\u0084\u0085\7,\2\2\u0085\"\3\2\2\2\u0086\u0087\7.\2\2\u0087$"+
		"\3\2\2\2\u0088\u0089\7v\2\2\u0089\u008a\7q\2\2\u008a&\3\2\2\2\u008b\u008c"+
		"\7@\2\2\u008c\u008d\7?\2\2\u008d(\3\2\2\2\u008e\u008f\7]\2\2\u008f*\3"+
		"\2\2\2\u0090\u0091\7>\2\2\u0091,\3\2\2\2\u0092\u0093\7?\2\2\u0093\u0094"+
		"\7?\2\2\u0094.\3\2\2\2\u0095\u0096\7_\2\2\u0096\60\3\2\2\2\u0097\u0098"+
		"\7@\2\2\u0098\62\3\2\2\2\u0099\u009a\7#\2\2\u009a\64\3\2\2\2\u009b\u009c"+
		"\7\'\2\2\u009c\66\3\2\2\2\u009d\u009e\7g\2\2\u009e\u009f\7n\2\2\u009f"+
		"\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a18\3\2\2\2\u00a2\u00a3\7d\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7i\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2"+
		"\u00a7:\3\2\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7f\2"+
		"\2\u00ab<\3\2\2\2\u00ac\u00ad\7+\2\2\u00ad>\3\2\2\2\u00ae\u00af\7-\2\2"+
		"\u00af@\3\2\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7g\2"+
		"\2\u00b3\u00b4\7p\2\2\u00b4B\3\2\2\2\u00b5\u00b6\7/\2\2\u00b6D\3\2\2\2"+
		"\u00b7\u00bb\t\2\2\2\u00b8\u00ba\t\3\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bcF\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00c0\4\62;\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2H\3\2\2\2\u00c3\u00c4"+
		"\5G$\2\u00c4\u00c8\7\60\2\2\u00c5\u00c7\5G$\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00d2\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\7\60\2\2\u00cc\u00ce\5G$\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c3\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d2"+
		"J\3\2\2\2\u00d3\u00d5\t\4\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9"+
		"\b&\2\2\u00d9L\3\2\2\2\t\2\u00bb\u00c1\u00c8\u00cf\u00d1\u00d6\3\3&\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}