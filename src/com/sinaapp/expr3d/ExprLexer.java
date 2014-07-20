// Generated from Expr.g4 by ANTLR 4.2.2

package com.sinaapp.expr3d;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

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
		T__1=32, T__0=33, HZID=34, ID=35, INT=36, FLOAT=37, WS=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'continue'", "'def'", "'return'", "'{'", "'||'", "';'", "'&&'", 
		"'}'", "'if'", "'for'", "':='", "'<='", "'break'", "'('", "'*'", "','", 
		"'to'", "'>='", "'['", "'<'", "'=='", "']'", "'>'", "'!'", "'%'", "'else'", 
		"'begin'", "'end'", "')'", "'+'", "'then'", "'-'", "HZID", "ID", "INT", 
		"FLOAT", "WS"
	};
	public static final String[] ruleNames = {
		"T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", 
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"HZID", "ID", "INT", "FLOAT", "WS"
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
		case 37: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u00e3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3#\3#\7#\u00bc\n#\f#\16#\u00bf\13#\3$\3"+
		"$\7$\u00c3\n$\f$\16$\u00c6\13$\3%\6%\u00c9\n%\r%\16%\u00ca\3&\3&\3&\7"+
		"&\u00d0\n&\f&\16&\u00d3\13&\3&\3&\6&\u00d7\n&\r&\16&\u00d8\5&\u00db\n"+
		"&\3\'\6\'\u00de\n\'\r\'\16\'\u00df\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3"+
		"\2\6\7\2\62;C\\aac|\u4e02\u9fa7\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17"+
		"\17\"\"\u00e9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7"+
		"Z\3\2\2\2\t^\3\2\2\2\13e\3\2\2\2\rg\3\2\2\2\17j\3\2\2\2\21l\3\2\2\2\23"+
		"o\3\2\2\2\25q\3\2\2\2\27t\3\2\2\2\31x\3\2\2\2\33{\3\2\2\2\35~\3\2\2\2"+
		"\37\u0084\3\2\2\2!\u0086\3\2\2\2#\u0088\3\2\2\2%\u008a\3\2\2\2\'\u008d"+
		"\3\2\2\2)\u0090\3\2\2\2+\u0092\3\2\2\2-\u0094\3\2\2\2/\u0097\3\2\2\2\61"+
		"\u0099\3\2\2\2\63\u009b\3\2\2\2\65\u009d\3\2\2\2\67\u009f\3\2\2\29\u00a4"+
		"\3\2\2\2;\u00aa\3\2\2\2=\u00ae\3\2\2\2?\u00b0\3\2\2\2A\u00b2\3\2\2\2C"+
		"\u00b7\3\2\2\2E\u00b9\3\2\2\2G\u00c0\3\2\2\2I\u00c8\3\2\2\2K\u00da\3\2"+
		"\2\2M\u00dd\3\2\2\2OP\7\61\2\2P\4\3\2\2\2QR\7e\2\2RS\7q\2\2ST\7p\2\2T"+
		"U\7v\2\2UV\7k\2\2VW\7p\2\2WX\7w\2\2XY\7g\2\2Y\6\3\2\2\2Z[\7f\2\2[\\\7"+
		"g\2\2\\]\7h\2\2]\b\3\2\2\2^_\7t\2\2_`\7g\2\2`a\7v\2\2ab\7w\2\2bc\7t\2"+
		"\2cd\7p\2\2d\n\3\2\2\2ef\7}\2\2f\f\3\2\2\2gh\7~\2\2hi\7~\2\2i\16\3\2\2"+
		"\2jk\7=\2\2k\20\3\2\2\2lm\7(\2\2mn\7(\2\2n\22\3\2\2\2op\7\177\2\2p\24"+
		"\3\2\2\2qr\7k\2\2rs\7h\2\2s\26\3\2\2\2tu\7h\2\2uv\7q\2\2vw\7t\2\2w\30"+
		"\3\2\2\2xy\7<\2\2yz\7?\2\2z\32\3\2\2\2{|\7>\2\2|}\7?\2\2}\34\3\2\2\2~"+
		"\177\7d\2\2\177\u0080\7t\2\2\u0080\u0081\7g\2\2\u0081\u0082\7c\2\2\u0082"+
		"\u0083\7m\2\2\u0083\36\3\2\2\2\u0084\u0085\7*\2\2\u0085 \3\2\2\2\u0086"+
		"\u0087\7,\2\2\u0087\"\3\2\2\2\u0088\u0089\7.\2\2\u0089$\3\2\2\2\u008a"+
		"\u008b\7v\2\2\u008b\u008c\7q\2\2\u008c&\3\2\2\2\u008d\u008e\7@\2\2\u008e"+
		"\u008f\7?\2\2\u008f(\3\2\2\2\u0090\u0091\7]\2\2\u0091*\3\2\2\2\u0092\u0093"+
		"\7>\2\2\u0093,\3\2\2\2\u0094\u0095\7?\2\2\u0095\u0096\7?\2\2\u0096.\3"+
		"\2\2\2\u0097\u0098\7_\2\2\u0098\60\3\2\2\2\u0099\u009a\7@\2\2\u009a\62"+
		"\3\2\2\2\u009b\u009c\7#\2\2\u009c\64\3\2\2\2\u009d\u009e\7\'\2\2\u009e"+
		"\66\3\2\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7u\2\2\u00a2"+
		"\u00a3\7g\2\2\u00a38\3\2\2\2\u00a4\u00a5\7d\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7i\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9:\3\2\2\2\u00aa"+
		"\u00ab\7g\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7f\2\2\u00ad<\3\2\2\2\u00ae"+
		"\u00af\7+\2\2\u00af>\3\2\2\2\u00b0\u00b1\7-\2\2\u00b1@\3\2\2\2\u00b2\u00b3"+
		"\7v\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7p\2\2\u00b6"+
		"B\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8D\3\2\2\2\u00b9\u00bd\4\u4e02\u9fa7"+
		"\2\u00ba\u00bc\t\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00beF\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c4\t\3\2\2\u00c1\u00c3\t\4\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5H\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c7\u00c9\4\62;\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cbJ\3\2\2\2\u00cc\u00cd\5I%\2\u00cd"+
		"\u00d1\7\60\2\2\u00ce\u00d0\5I%\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00db\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00d6\7\60\2\2\u00d5\u00d7\5I%\2\u00d6\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00cc\3\2\2\2\u00da\u00d4\3\2\2\2\u00dbL\3\2\2\2"+
		"\u00dc\u00de\t\5\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\'\2\2\u00e2"+
		"N\3\2\2\2\n\2\u00bd\u00c4\u00ca\u00d1\u00d8\u00da\u00df\3\3\'\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}