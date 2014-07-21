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
		T__34=1, T__33=2, T__32=3, T__31=4, T__30=5, T__29=6, T__28=7, T__27=8, 
		T__26=9, T__25=10, T__24=11, T__23=12, T__22=13, T__21=14, T__20=15, T__19=16, 
		T__18=17, T__17=18, T__16=19, T__15=20, T__14=21, T__13=22, T__12=23, 
		T__11=24, T__10=25, T__9=26, T__8=27, T__7=28, T__6=29, T__5=30, T__4=31, 
		T__3=32, T__2=33, T__1=34, T__0=35, HZID=36, ID=37, INT=38, FLOAT=39, 
		WS=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'continue'", "'def'", "'return'", "'{'", "'||'", "';'", "'&&'", 
		"'}'", "'if'", "'for'", "':='", "'<='", "'break'", "'('", "'*'", "','", 
		"'to'", "'>='", "'['", "'<'", "'=='", "']'", "'test'", "'>'", "'!'", "'%'", 
		"'else'", "'begin'", "'end'", "')'", "'+'", "'then'", "'-'", "'����'", 
		"HZID", "ID", "INT", "FLOAT", "WS"
	};
	public static final String[] ruleNames = {
		"T__34", "T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", 
		"T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", 
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "HZID", "ID", "INT", "FLOAT", "WS"
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
		case 39: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u00f1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$"+
		"\3$\3$\3$\3%\3%\7%\u00ca\n%\f%\16%\u00cd\13%\3&\3&\7&\u00d1\n&\f&\16&"+
		"\u00d4\13&\3\'\6\'\u00d7\n\'\r\'\16\'\u00d8\3(\3(\3(\7(\u00de\n(\f(\16"+
		"(\u00e1\13(\3(\3(\6(\u00e5\n(\r(\16(\u00e6\5(\u00e9\n(\3)\6)\u00ec\n)"+
		"\r)\16)\u00ed\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\6\7\2\62;C\\aac|\u4e02"+
		"\u9fa7\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u00f7\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7^"+
		"\3\2\2\2\tb\3\2\2\2\13i\3\2\2\2\rk\3\2\2\2\17n\3\2\2\2\21p\3\2\2\2\23"+
		"s\3\2\2\2\25u\3\2\2\2\27x\3\2\2\2\31|\3\2\2\2\33\177\3\2\2\2\35\u0082"+
		"\3\2\2\2\37\u0088\3\2\2\2!\u008a\3\2\2\2#\u008c\3\2\2\2%\u008e\3\2\2\2"+
		"\'\u0091\3\2\2\2)\u0094\3\2\2\2+\u0096\3\2\2\2-\u0098\3\2\2\2/\u009b\3"+
		"\2\2\2\61\u009d\3\2\2\2\63\u00a2\3\2\2\2\65\u00a4\3\2\2\2\67\u00a6\3\2"+
		"\2\29\u00a8\3\2\2\2;\u00ad\3\2\2\2=\u00b3\3\2\2\2?\u00b7\3\2\2\2A\u00b9"+
		"\3\2\2\2C\u00bb\3\2\2\2E\u00c0\3\2\2\2G\u00c2\3\2\2\2I\u00c7\3\2\2\2K"+
		"\u00ce\3\2\2\2M\u00d6\3\2\2\2O\u00e8\3\2\2\2Q\u00eb\3\2\2\2ST\7\61\2\2"+
		"T\4\3\2\2\2UV\7e\2\2VW\7q\2\2WX\7p\2\2XY\7v\2\2YZ\7k\2\2Z[\7p\2\2[\\\7"+
		"w\2\2\\]\7g\2\2]\6\3\2\2\2^_\7f\2\2_`\7g\2\2`a\7h\2\2a\b\3\2\2\2bc\7t"+
		"\2\2cd\7g\2\2de\7v\2\2ef\7w\2\2fg\7t\2\2gh\7p\2\2h\n\3\2\2\2ij\7}\2\2"+
		"j\f\3\2\2\2kl\7~\2\2lm\7~\2\2m\16\3\2\2\2no\7=\2\2o\20\3\2\2\2pq\7(\2"+
		"\2qr\7(\2\2r\22\3\2\2\2st\7\177\2\2t\24\3\2\2\2uv\7k\2\2vw\7h\2\2w\26"+
		"\3\2\2\2xy\7h\2\2yz\7q\2\2z{\7t\2\2{\30\3\2\2\2|}\7<\2\2}~\7?\2\2~\32"+
		"\3\2\2\2\177\u0080\7>\2\2\u0080\u0081\7?\2\2\u0081\34\3\2\2\2\u0082\u0083"+
		"\7d\2\2\u0083\u0084\7t\2\2\u0084\u0085\7g\2\2\u0085\u0086\7c\2\2\u0086"+
		"\u0087\7m\2\2\u0087\36\3\2\2\2\u0088\u0089\7*\2\2\u0089 \3\2\2\2\u008a"+
		"\u008b\7,\2\2\u008b\"\3\2\2\2\u008c\u008d\7.\2\2\u008d$\3\2\2\2\u008e"+
		"\u008f\7v\2\2\u008f\u0090\7q\2\2\u0090&\3\2\2\2\u0091\u0092\7@\2\2\u0092"+
		"\u0093\7?\2\2\u0093(\3\2\2\2\u0094\u0095\7]\2\2\u0095*\3\2\2\2\u0096\u0097"+
		"\7>\2\2\u0097,\3\2\2\2\u0098\u0099\7?\2\2\u0099\u009a\7?\2\2\u009a.\3"+
		"\2\2\2\u009b\u009c\7_\2\2\u009c\60\3\2\2\2\u009d\u009e\7v\2\2\u009e\u009f"+
		"\7g\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7v\2\2\u00a1\62\3\2\2\2\u00a2\u00a3"+
		"\7@\2\2\u00a3\64\3\2\2\2\u00a4\u00a5\7#\2\2\u00a5\66\3\2\2\2\u00a6\u00a7"+
		"\7\'\2\2\u00a78\3\2\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab"+
		"\7u\2\2\u00ab\u00ac\7g\2\2\u00ac:\3\2\2\2\u00ad\u00ae\7d\2\2\u00ae\u00af"+
		"\7g\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2"+
		"<\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7f\2\2\u00b6"+
		">\3\2\2\2\u00b7\u00b8\7+\2\2\u00b8@\3\2\2\2\u00b9\u00ba\7-\2\2\u00baB"+
		"\3\2\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7g\2\2\u00be"+
		"\u00bf\7p\2\2\u00bfD\3\2\2\2\u00c0\u00c1\7/\2\2\u00c1F\3\2\2\2\u00c2\u00c3"+
		"\7\uffff\2\2\u00c3\u00c4\7\uffff\2\2\u00c4\u00c5\7\uffff\2\2\u00c5\u00c6"+
		"\7\uffff\2\2\u00c6H\3\2\2\2\u00c7\u00cb\4\u4e02\u9fa7\2\u00c8\u00ca\t"+
		"\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00ccJ\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d2\t\3\2\2"+
		"\u00cf\u00d1\t\4\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3L\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d7\4\62;\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9N\3\2\2\2\u00da\u00db\5M\'\2\u00db\u00df"+
		"\7\60\2\2\u00dc\u00de\5M\'\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e9\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e2\u00e4\7\60\2\2\u00e3\u00e5\5M\'\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2"+
		"\2\2\u00e8\u00da\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e9P\3\2\2\2\u00ea\u00ec"+
		"\t\5\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\b)\2\2\u00f0R\3\2\2\2\n"+
		"\2\u00cb\u00d2\u00d8\u00df\u00e6\u00e8\u00ed\3\3)\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}