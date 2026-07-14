// Generated from c:/Users/Teirusu/Documents/LA Git/Competencia 4 - Final/Streamlint/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, CREATE=3, WHERE=4, CHECK=5, GROUP=6, LIKE=7, ILIKE=8, 
		ASC=9, DESC=10, TABLE=11, COLUMN=12, ORDER=13, JOIN=14, RIGHT=15, LEFT=16, 
		LIMIT=17, ON=18, INNER=19, USER=20, NULL=21, NOT=22, NOTNULL=23, OUTER=24, 
		PRIMARY=25, HAVING=26, GRANT=27, REFERENCES=28, FOREIGN=29, INSERT=30, 
		INTO=31, TRUE=32, FALSE=33, END=34, DEFAULT=35, OR=36, AND=37, WITH=38, 
		BY=39, UPDATE=40, SET=41, DELETE=42, SCHEMA=43, INT=44, DECIMAL=45, NUMERIC=46, 
		CHAR=47, VARCHAR=48, TEXT=49, INTEGER=50, SMALLINT=51, SERIAL=52, KEY=53, 
		DATE=54, TIMESTAMP=55, TIME=56, TIMESTAMPZ=57, BIGINT=58, REAL=59, BOOLEAN=60, 
		JSON=61, JSONB=62, INET=63, CIDR=64, MACADDR=65, BYTEA=66, OID=67, INDEX=68, 
		DOUBLE=69, PRECISION=70, SUM=71, AVG=72, COUNT=73, MIN=74, MAX=75, RANK=76, 
		RANDOM=77, MD5=78, CHARACTER=79, VARYING=80, COMMIT=81, BEGIN=82, ROLLBACK=83, 
		SUMA=84, RESTA=85, MULTIPLICACION=86, DIVISION=87, IGUAL=88, COMA=89, 
		PARENTA=90, PARENTC=91, PUNTOCOMA=92, ORSIMB=93, NOTSIMB=94, EXCLAMACION=95, 
		ANDSIMB=96, PREGUNTA=97, PORCENTAJE=98, GATO=99, ARROBA=100, POTENCIA=101, 
		COMP1=102, COMP2=103, COMPIG1=104, COMPIG2=105, CADENA=106, NUM=107, IDF=108, 
		COMENTARIO_LINEA=109, COMENTARIO_BLOQUE=110, WS=111;
	public static final int
		RULE_root = 0, RULE_palabras_no_reservadas = 1, RULE_tipo_dato = 2, RULE_identi = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "palabras_no_reservadas", "tipo_dato", "identi", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELECT'", "'FROM'", "'CREATE'", "'WHERE'", "'CHECK'", "'GROUP'", 
			"'LIKE'", "'ILIKE'", "'ASC'", "'DESC'", "'TABLE'", "'COLUMN'", "'ORDER'", 
			"'JOIN'", "'RIGHT'", "'LEFT'", "'LIMIT'", "'ON'", "'INNER'", "'USER'", 
			"'NULL'", "'NOT'", "'NOTNULL'", "'OUTER'", "'PRIMARY'", "'HAVING'", "'GRANT'", 
			"'REFERENCES'", "'FOREIGN'", "'INSERT'", "'INTO'", "'TRUE'", "'FALSE'", 
			"'END'", "'DEFAULT'", "'OR'", "'AND'", "'WITH'", "'BY'", "'UPDATE'", 
			"'SET'", "'DELETE'", "'SCHEMA'", "'INT'", "'DECIMAL'", "'NUMERIC'", "'CHAR'", 
			"'VARCHAR'", "'TEXT'", "'INTEGER'", "'SMALLINT'", "'SERIAL'", "'KEY'", 
			"'DATE'", "'TIMESTAMP'", "'TIME'", "'TIMESTAMPZ'", "'BIGINT'", "'REAL'", 
			"'BOOLEAN'", "'JSON'", "'JSONB'", "'INET'", "'CIDR'", "'MACADDR'", "'BYTEA'", 
			"'OID'", "'INDEX'", "'DOUBLE'", "'PRECISION'", "'SUM'", "'AVG'", "'COUNT'", 
			"'MIN'", "'MAX'", "'RANK'", "'RANDOM'", "'MD5'", "'CHARACTER'", "'VARYING'", 
			"'COMMIT'", "'BEGIN'", "'ROLLBACK'", "'+'", "'-'", "'*'", "'/'", "'='", 
			"','", "'('", "')'", "';'", "'|'", "'~'", "'!'", "'&'", "'?'", "'%'", 
			"'#'", "'@'", "'^'", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "CREATE", "WHERE", "CHECK", "GROUP", "LIKE", 
			"ILIKE", "ASC", "DESC", "TABLE", "COLUMN", "ORDER", "JOIN", "RIGHT", 
			"LEFT", "LIMIT", "ON", "INNER", "USER", "NULL", "NOT", "NOTNULL", "OUTER", 
			"PRIMARY", "HAVING", "GRANT", "REFERENCES", "FOREIGN", "INSERT", "INTO", 
			"TRUE", "FALSE", "END", "DEFAULT", "OR", "AND", "WITH", "BY", "UPDATE", 
			"SET", "DELETE", "SCHEMA", "INT", "DECIMAL", "NUMERIC", "CHAR", "VARCHAR", 
			"TEXT", "INTEGER", "SMALLINT", "SERIAL", "KEY", "DATE", "TIMESTAMP", 
			"TIME", "TIMESTAMPZ", "BIGINT", "REAL", "BOOLEAN", "JSON", "JSONB", "INET", 
			"CIDR", "MACADDR", "BYTEA", "OID", "INDEX", "DOUBLE", "PRECISION", "SUM", 
			"AVG", "COUNT", "MIN", "MAX", "RANK", "RANDOM", "MD5", "CHARACTER", "VARYING", 
			"COMMIT", "BEGIN", "ROLLBACK", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", 
			"IGUAL", "COMA", "PARENTA", "PARENTC", "PUNTOCOMA", "ORSIMB", "NOTSIMB", 
			"EXCLAMACION", "ANDSIMB", "PREGUNTA", "PORCENTAJE", "GATO", "ARROBA", 
			"POTENCIA", "COMP1", "COMP2", "COMPIG1", "COMPIG2", "CADENA", "NUM", 
			"IDF", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "WS"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				expr();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUM );
			setState(15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Palabras_no_reservadasContext extends ParserRuleContext {
		public TerminalNode BY() { return getToken(ExprParser.BY, 0); }
		public TerminalNode UPDATE() { return getToken(ExprParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(ExprParser.SET, 0); }
		public TerminalNode DELETE() { return getToken(ExprParser.DELETE, 0); }
		public TerminalNode SCHEMA() { return getToken(ExprParser.SCHEMA, 0); }
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(ExprParser.DECIMAL, 0); }
		public TerminalNode NUMERIC() { return getToken(ExprParser.NUMERIC, 0); }
		public TerminalNode CHAR() { return getToken(ExprParser.CHAR, 0); }
		public TerminalNode VARCHAR() { return getToken(ExprParser.VARCHAR, 0); }
		public TerminalNode TEXT() { return getToken(ExprParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(ExprParser.INTEGER, 0); }
		public TerminalNode SMALLINT() { return getToken(ExprParser.SMALLINT, 0); }
		public TerminalNode SERIAL() { return getToken(ExprParser.SERIAL, 0); }
		public TerminalNode KEY() { return getToken(ExprParser.KEY, 0); }
		public TerminalNode DATE() { return getToken(ExprParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(ExprParser.TIMESTAMP, 0); }
		public TerminalNode TIME() { return getToken(ExprParser.TIME, 0); }
		public TerminalNode TIMESTAMPZ() { return getToken(ExprParser.TIMESTAMPZ, 0); }
		public TerminalNode BIGINT() { return getToken(ExprParser.BIGINT, 0); }
		public TerminalNode REAL() { return getToken(ExprParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(ExprParser.BOOLEAN, 0); }
		public TerminalNode JSON() { return getToken(ExprParser.JSON, 0); }
		public TerminalNode JSONB() { return getToken(ExprParser.JSONB, 0); }
		public TerminalNode INET() { return getToken(ExprParser.INET, 0); }
		public TerminalNode CIDR() { return getToken(ExprParser.CIDR, 0); }
		public TerminalNode MACADDR() { return getToken(ExprParser.MACADDR, 0); }
		public TerminalNode BYTEA() { return getToken(ExprParser.BYTEA, 0); }
		public TerminalNode OID() { return getToken(ExprParser.OID, 0); }
		public TerminalNode INDEX() { return getToken(ExprParser.INDEX, 0); }
		public TerminalNode DOUBLE() { return getToken(ExprParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(ExprParser.PRECISION, 0); }
		public TerminalNode SUM() { return getToken(ExprParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(ExprParser.AVG, 0); }
		public TerminalNode COUNT() { return getToken(ExprParser.COUNT, 0); }
		public TerminalNode MIN() { return getToken(ExprParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(ExprParser.MAX, 0); }
		public TerminalNode RANK() { return getToken(ExprParser.RANK, 0); }
		public TerminalNode RANDOM() { return getToken(ExprParser.RANDOM, 0); }
		public TerminalNode MD5() { return getToken(ExprParser.MD5, 0); }
		public TerminalNode CHARACTER() { return getToken(ExprParser.CHARACTER, 0); }
		public TerminalNode VARYING() { return getToken(ExprParser.VARYING, 0); }
		public TerminalNode COMMIT() { return getToken(ExprParser.COMMIT, 0); }
		public TerminalNode BEGIN() { return getToken(ExprParser.BEGIN, 0); }
		public TerminalNode ROLLBACK() { return getToken(ExprParser.ROLLBACK, 0); }
		public Palabras_no_reservadasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palabras_no_reservadas; }
	}

	public final Palabras_no_reservadasContext palabras_no_reservadas() throws RecognitionException {
		Palabras_no_reservadasContext _localctx = new Palabras_no_reservadasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_palabras_no_reservadas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_la = _input.LA(1);
			if ( !(((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 35184372088831L) != 0)) ) {
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
	public static class Tipo_datoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(ExprParser.DECIMAL, 0); }
		public TerminalNode PARENTA() { return getToken(ExprParser.PARENTA, 0); }
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public TerminalNode PARENTC() { return getToken(ExprParser.PARENTC, 0); }
		public TerminalNode COMA() { return getToken(ExprParser.COMA, 0); }
		public TerminalNode NUMERIC() { return getToken(ExprParser.NUMERIC, 0); }
		public TerminalNode CHAR() { return getToken(ExprParser.CHAR, 0); }
		public TerminalNode VARCHAR() { return getToken(ExprParser.VARCHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(ExprParser.CHARACTER, 0); }
		public TerminalNode VARYING() { return getToken(ExprParser.VARYING, 0); }
		public TerminalNode TEXT() { return getToken(ExprParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(ExprParser.INTEGER, 0); }
		public TerminalNode SMALLINT() { return getToken(ExprParser.SMALLINT, 0); }
		public TerminalNode SERIAL() { return getToken(ExprParser.SERIAL, 0); }
		public TerminalNode DATE() { return getToken(ExprParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(ExprParser.TIMESTAMP, 0); }
		public TerminalNode TIME() { return getToken(ExprParser.TIME, 0); }
		public TerminalNode TIMESTAMPZ() { return getToken(ExprParser.TIMESTAMPZ, 0); }
		public TerminalNode BIGINT() { return getToken(ExprParser.BIGINT, 0); }
		public TerminalNode REAL() { return getToken(ExprParser.REAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(ExprParser.BOOLEAN, 0); }
		public TerminalNode JSON() { return getToken(ExprParser.JSON, 0); }
		public TerminalNode JSONB() { return getToken(ExprParser.JSONB, 0); }
		public TerminalNode INET() { return getToken(ExprParser.INET, 0); }
		public TerminalNode CIDR() { return getToken(ExprParser.CIDR, 0); }
		public TerminalNode MACADDR() { return getToken(ExprParser.MACADDR, 0); }
		public TerminalNode BYTEA() { return getToken(ExprParser.BYTEA, 0); }
		public TerminalNode OID() { return getToken(ExprParser.OID, 0); }
		public Tipo_datoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_dato; }
	}

	public final Tipo_datoContext tipo_dato() throws RecognitionException {
		Tipo_datoContext _localctx = new Tipo_datoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo_dato);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(INT);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(DECIMAL);
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(21);
					match(PARENTA);
					setState(22);
					match(NUM);
					setState(25);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMA) {
						{
						setState(23);
						match(COMA);
						setState(24);
						match(NUM);
						}
					}

					setState(27);
					match(PARENTC);
					}
				}

				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(NUMERIC);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(31);
					match(PARENTA);
					setState(32);
					match(NUM);
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMA) {
						{
						setState(33);
						match(COMA);
						setState(34);
						match(NUM);
						}
					}

					setState(37);
					match(PARENTC);
					}
				}

				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				match(CHAR);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(41);
					match(PARENTA);
					setState(42);
					match(NUM);
					setState(43);
					match(PARENTC);
					}
				}

				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				match(VARCHAR);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(47);
					match(PARENTA);
					setState(48);
					match(NUM);
					setState(49);
					match(PARENTC);
					}
				}

				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				match(CHARACTER);
				setState(53);
				match(VARYING);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(54);
					match(PARENTA);
					setState(55);
					match(NUM);
					setState(56);
					match(PARENTC);
					}
				}

				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				match(TEXT);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				match(INTEGER);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(61);
				match(SMALLINT);
				}
				break;
			case SERIAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(62);
				match(SERIAL);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 11);
				{
				setState(63);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 12);
				{
				setState(64);
				match(TIMESTAMP);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(65);
					match(PARENTA);
					setState(66);
					match(NUM);
					setState(67);
					match(PARENTC);
					}
				}

				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 13);
				{
				setState(70);
				match(TIME);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(71);
					match(PARENTA);
					setState(72);
					match(NUM);
					setState(73);
					match(PARENTC);
					}
				}

				}
				break;
			case TIMESTAMPZ:
				enterOuterAlt(_localctx, 14);
				{
				setState(76);
				match(TIMESTAMPZ);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(77);
					match(PARENTA);
					setState(78);
					match(NUM);
					setState(79);
					match(PARENTC);
					}
				}

				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 15);
				{
				setState(82);
				match(BIGINT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 16);
				{
				setState(83);
				match(REAL);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 17);
				{
				setState(84);
				match(BOOLEAN);
				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 18);
				{
				setState(85);
				match(JSON);
				}
				break;
			case JSONB:
				enterOuterAlt(_localctx, 19);
				{
				setState(86);
				match(JSONB);
				}
				break;
			case INET:
				enterOuterAlt(_localctx, 20);
				{
				setState(87);
				match(INET);
				}
				break;
			case CIDR:
				enterOuterAlt(_localctx, 21);
				{
				setState(88);
				match(CIDR);
				}
				break;
			case MACADDR:
				enterOuterAlt(_localctx, 22);
				{
				setState(89);
				match(MACADDR);
				}
				break;
			case BYTEA:
				enterOuterAlt(_localctx, 23);
				{
				setState(90);
				match(BYTEA);
				}
				break;
			case OID:
				enterOuterAlt(_localctx, 24);
				{
				setState(91);
				match(OID);
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
	public static class IdentiContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(ExprParser.IDF, 0); }
		public Palabras_no_reservadasContext palabras_no_reservadas() {
			return getRuleContext(Palabras_no_reservadasContext.class,0);
		}
		public IdentiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identi; }
	}

	public final IdentiContext identi() throws RecognitionException {
		IdentiContext _localctx = new IdentiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identi);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDF:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(IDF);
				}
				break;
			case BY:
			case UPDATE:
			case SET:
			case DELETE:
			case SCHEMA:
			case INT:
			case DECIMAL:
			case NUMERIC:
			case CHAR:
			case VARCHAR:
			case TEXT:
			case INTEGER:
			case SMALLINT:
			case SERIAL:
			case KEY:
			case DATE:
			case TIMESTAMP:
			case TIME:
			case TIMESTAMPZ:
			case BIGINT:
			case REAL:
			case BOOLEAN:
			case JSON:
			case JSONB:
			case INET:
			case CIDR:
			case MACADDR:
			case BYTEA:
			case OID:
			case INDEX:
			case DOUBLE:
			case PRECISION:
			case SUM:
			case AVG:
			case COUNT:
			case MIN:
			case MAX:
			case RANK:
			case RANDOM:
			case MD5:
			case CHARACTER:
			case VARYING:
			case COMMIT:
			case BEGIN:
			case ROLLBACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				palabras_no_reservadas();
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(NUM);
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
		"\u0004\u0001oe\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000"+
		"\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u001a\b\u0002\u0001\u0002\u0003\u0002\u001d"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002$\b\u0002\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00023\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002:\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002E\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002K\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002Q\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002]\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0003\u0003a\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000"+
		"\u0005\u0000\u0002\u0004\u0006\b\u0000\u0001\u0001\u0000\'S\u0082\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0002\u0011\u0001\u0000\u0000\u0000\u0004"+
		"\\\u0001\u0000\u0000\u0000\u0006`\u0001\u0000\u0000\u0000\bb\u0001\u0000"+
		"\u0000\u0000\n\f\u0003\b\u0004\u0000\u000b\n\u0001\u0000\u0000\u0000\f"+
		"\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0010\u0005"+
		"\u0000\u0000\u0001\u0010\u0001\u0001\u0000\u0000\u0000\u0011\u0012\u0007"+
		"\u0000\u0000\u0000\u0012\u0003\u0001\u0000\u0000\u0000\u0013]\u0005,\u0000"+
		"\u0000\u0014\u001c\u0005-\u0000\u0000\u0015\u0016\u0005Z\u0000\u0000\u0016"+
		"\u0019\u0005k\u0000\u0000\u0017\u0018\u0005Y\u0000\u0000\u0018\u001a\u0005"+
		"k\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001d\u0005[\u0000"+
		"\u0000\u001c\u0015\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000"+
		"\u0000\u001d]\u0001\u0000\u0000\u0000\u001e&\u0005.\u0000\u0000\u001f"+
		" \u0005Z\u0000\u0000 #\u0005k\u0000\u0000!\"\u0005Y\u0000\u0000\"$\u0005"+
		"k\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000%\'\u0005[\u0000\u0000&\u001f\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\']\u0001\u0000\u0000\u0000(,\u0005/\u0000"+
		"\u0000)*\u0005Z\u0000\u0000*+\u0005k\u0000\u0000+-\u0005[\u0000\u0000"+
		",)\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-]\u0001\u0000\u0000"+
		"\u0000.2\u00050\u0000\u0000/0\u0005Z\u0000\u000001\u0005k\u0000\u0000"+
		"13\u0005[\u0000\u00002/\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"3]\u0001\u0000\u0000\u000045\u0005O\u0000\u000059\u0005P\u0000\u00006"+
		"7\u0005Z\u0000\u000078\u0005k\u0000\u00008:\u0005[\u0000\u000096\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:]\u0001\u0000\u0000\u0000"+
		";]\u00051\u0000\u0000<]\u00052\u0000\u0000=]\u00053\u0000\u0000>]\u0005"+
		"4\u0000\u0000?]\u00056\u0000\u0000@D\u00057\u0000\u0000AB\u0005Z\u0000"+
		"\u0000BC\u0005k\u0000\u0000CE\u0005[\u0000\u0000DA\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000E]\u0001\u0000\u0000\u0000FJ\u00058\u0000\u0000"+
		"GH\u0005Z\u0000\u0000HI\u0005k\u0000\u0000IK\u0005[\u0000\u0000JG\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K]\u0001\u0000\u0000\u0000"+
		"LP\u00059\u0000\u0000MN\u0005Z\u0000\u0000NO\u0005k\u0000\u0000OQ\u0005"+
		"[\u0000\u0000PM\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q]\u0001"+
		"\u0000\u0000\u0000R]\u0005:\u0000\u0000S]\u0005;\u0000\u0000T]\u0005<"+
		"\u0000\u0000U]\u0005=\u0000\u0000V]\u0005>\u0000\u0000W]\u0005?\u0000"+
		"\u0000X]\u0005@\u0000\u0000Y]\u0005A\u0000\u0000Z]\u0005B\u0000\u0000"+
		"[]\u0005C\u0000\u0000\\\u0013\u0001\u0000\u0000\u0000\\\u0014\u0001\u0000"+
		"\u0000\u0000\\\u001e\u0001\u0000\u0000\u0000\\(\u0001\u0000\u0000\u0000"+
		"\\.\u0001\u0000\u0000\u0000\\4\u0001\u0000\u0000\u0000\\;\u0001\u0000"+
		"\u0000\u0000\\<\u0001\u0000\u0000\u0000\\=\u0001\u0000\u0000\u0000\\>"+
		"\u0001\u0000\u0000\u0000\\?\u0001\u0000\u0000\u0000\\@\u0001\u0000\u0000"+
		"\u0000\\F\u0001\u0000\u0000\u0000\\L\u0001\u0000\u0000\u0000\\R\u0001"+
		"\u0000\u0000\u0000\\S\u0001\u0000\u0000\u0000\\T\u0001\u0000\u0000\u0000"+
		"\\U\u0001\u0000\u0000\u0000\\V\u0001\u0000\u0000\u0000\\W\u0001\u0000"+
		"\u0000\u0000\\X\u0001\u0000\u0000\u0000\\Y\u0001\u0000\u0000\u0000\\Z"+
		"\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u0005\u0001\u0000"+
		"\u0000\u0000^a\u0005l\u0000\u0000_a\u0003\u0002\u0001\u0000`^\u0001\u0000"+
		"\u0000\u0000`_\u0001\u0000\u0000\u0000a\u0007\u0001\u0000\u0000\u0000"+
		"bc\u0005k\u0000\u0000c\t\u0001\u0000\u0000\u0000\r\r\u0019\u001c#&,29"+
		"DJP\\`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}