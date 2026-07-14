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
		ALTER=84, SUMA=85, RESTA=86, MULTIPLICACION=87, DIVISION=88, IGUAL=89, 
		COMA=90, PUNTO=91, PARENTA=92, PARENTC=93, PUNTOCOMA=94, ORSIMB=95, NOTSIMB=96, 
		EXCLAMACION=97, ANDSIMB=98, PREGUNTA=99, PORCENTAJE=100, GATO=101, ARROBA=102, 
		POTENCIA=103, COMP1=104, COMP2=105, COMPIG1=106, COMPIG2=107, CADENA=108, 
		NUM=109, IDF=110, COMENTARIO_LINEA=111, COMENTARIO_BLOQUE=112, WS=113;
	public static final int
		RULE_root = 0, RULE_palabras_no_reservadas = 1, RULE_tipo_dato = 2, RULE_identi = 3, 
		RULE_setencia = 4, RULE_select = 5, RULE_lista_expresiones = 6, RULE_ordenamiento = 7, 
		RULE_lista_ordenamiento = 8, RULE_lista_columnas = 9, RULE_lista_tablas = 10, 
		RULE_referencia_columna = 11, RULE_funciones_agg = 12, RULE_expr = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "palabras_no_reservadas", "tipo_dato", "identi", "setencia", 
			"select", "lista_expresiones", "ordenamiento", "lista_ordenamiento", 
			"lista_columnas", "lista_tablas", "referencia_columna", "funciones_agg", 
			"expr"
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
			"'COMMIT'", "'BEGIN'", "'ROLLBACK'", "'ALTER'", "'+'", "'-'", "'*'", 
			"'/'", "'='", "','", "'.'", "'('", "')'", "';'", "'|'", "'~'", "'!'", 
			"'&'", "'?'", "'%'", "'#'", "'@'", "'^'", "'<'", "'>'", "'<='", "'>='"
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
			"COMMIT", "BEGIN", "ROLLBACK", "ALTER", "SUMA", "RESTA", "MULTIPLICACION", 
			"DIVISION", "IGUAL", "COMA", "PUNTO", "PARENTA", "PARENTC", "PUNTOCOMA", 
			"ORSIMB", "NOTSIMB", "EXCLAMACION", "ANDSIMB", "PREGUNTA", "PORCENTAJE", 
			"GATO", "ARROBA", "POTENCIA", "COMP1", "COMP2", "COMPIG1", "COMPIG2", 
			"CADENA", "NUM", "IDF", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "WS"
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
		public List<SetenciaContext> setencia() {
			return getRuleContexts(SetenciaContext.class);
		}
		public SetenciaContext setencia(int i) {
			return getRuleContext(SetenciaContext.class,i);
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				setencia();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -536864620542L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 123145572843519L) != 0) );
			setState(33);
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
		public TerminalNode ALTER() { return getToken(ExprParser.ALTER, 0); }
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
			setState(35);
			_la = _input.LA(1);
			if ( !(((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 70368744177663L) != 0)) ) {
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(INT);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(DECIMAL);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(39);
					match(PARENTA);
					setState(40);
					match(NUM);
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMA) {
						{
						setState(41);
						match(COMA);
						setState(42);
						match(NUM);
						}
					}

					setState(45);
					match(PARENTC);
					}
				}

				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(NUMERIC);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(49);
					match(PARENTA);
					setState(50);
					match(NUM);
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMA) {
						{
						setState(51);
						match(COMA);
						setState(52);
						match(NUM);
						}
					}

					setState(55);
					match(PARENTC);
					}
				}

				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(CHAR);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(59);
					match(PARENTA);
					setState(60);
					match(NUM);
					setState(61);
					match(PARENTC);
					}
				}

				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				match(VARCHAR);
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
			case CHARACTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				match(CHARACTER);
				setState(71);
				match(VARYING);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(72);
					match(PARENTA);
					setState(73);
					match(NUM);
					setState(74);
					match(PARENTC);
					}
				}

				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				match(TEXT);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 8);
				{
				setState(78);
				match(INTEGER);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(79);
				match(SMALLINT);
				}
				break;
			case SERIAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(80);
				match(SERIAL);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 11);
				{
				setState(81);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 12);
				{
				setState(82);
				match(TIMESTAMP);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(83);
					match(PARENTA);
					setState(84);
					match(NUM);
					setState(85);
					match(PARENTC);
					}
				}

				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 13);
				{
				setState(88);
				match(TIME);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(89);
					match(PARENTA);
					setState(90);
					match(NUM);
					setState(91);
					match(PARENTC);
					}
				}

				}
				break;
			case TIMESTAMPZ:
				enterOuterAlt(_localctx, 14);
				{
				setState(94);
				match(TIMESTAMPZ);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(95);
					match(PARENTA);
					setState(96);
					match(NUM);
					setState(97);
					match(PARENTC);
					}
				}

				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 15);
				{
				setState(100);
				match(BIGINT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 16);
				{
				setState(101);
				match(REAL);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 17);
				{
				setState(102);
				match(BOOLEAN);
				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 18);
				{
				setState(103);
				match(JSON);
				}
				break;
			case JSONB:
				enterOuterAlt(_localctx, 19);
				{
				setState(104);
				match(JSONB);
				}
				break;
			case INET:
				enterOuterAlt(_localctx, 20);
				{
				setState(105);
				match(INET);
				}
				break;
			case CIDR:
				enterOuterAlt(_localctx, 21);
				{
				setState(106);
				match(CIDR);
				}
				break;
			case MACADDR:
				enterOuterAlt(_localctx, 22);
				{
				setState(107);
				match(MACADDR);
				}
				break;
			case BYTEA:
				enterOuterAlt(_localctx, 23);
				{
				setState(108);
				match(BYTEA);
				}
				break;
			case OID:
				enterOuterAlt(_localctx, 24);
				{
				setState(109);
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
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDF:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
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
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
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
	public static class SetenciaContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(ExprParser.PUNTOCOMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SetenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setencia; }
	}

	public final SetenciaContext setencia() throws RecognitionException {
		SetenciaContext _localctx = new SetenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_setencia);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				select();
				setState(117);
				match(PUNTOCOMA);
				}
				break;
			case NULL:
			case NOT:
			case TRUE:
			case FALSE:
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
			case ALTER:
			case PARENTA:
			case CADENA:
			case NUM:
			case IDF:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				expr(0);
				setState(120);
				match(PUNTOCOMA);
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
	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ExprParser.SELECT, 0); }
		public Lista_columnasContext lista_columnas() {
			return getRuleContext(Lista_columnasContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ExprParser.FROM, 0); }
		public Lista_tablasContext lista_tablas() {
			return getRuleContext(Lista_tablasContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(ExprParser.WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GROUP() { return getToken(ExprParser.GROUP, 0); }
		public List<TerminalNode> BY() { return getTokens(ExprParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(ExprParser.BY, i);
		}
		public Lista_expresionesContext lista_expresiones() {
			return getRuleContext(Lista_expresionesContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(ExprParser.HAVING, 0); }
		public TerminalNode ORDER() { return getToken(ExprParser.ORDER, 0); }
		public Lista_ordenamientoContext lista_ordenamiento() {
			return getRuleContext(Lista_ordenamientoContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(ExprParser.LIMIT, 0); }
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(SELECT);
			setState(125);
			lista_columnas();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(126);
				match(FROM);
				setState(127);
				lista_tablas();
				}
			}

			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(130);
				match(WHERE);
				setState(131);
				expr(0);
				}
			}

			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(134);
				match(GROUP);
				setState(135);
				match(BY);
				setState(136);
				lista_expresiones();
				}
			}

			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(139);
				match(HAVING);
				setState(140);
				expr(0);
				}
			}

			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(143);
				match(ORDER);
				setState(144);
				match(BY);
				setState(145);
				lista_ordenamiento();
				}
			}

			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(148);
				match(LIMIT);
				setState(149);
				match(NUM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_expresionesContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public Lista_expresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_expresiones; }
	}

	public final Lista_expresionesContext lista_expresiones() throws RecognitionException {
		Lista_expresionesContext _localctx = new Lista_expresionesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lista_expresiones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			expr(0);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(153);
				match(COMA);
				setState(154);
				expr(0);
				}
				}
				setState(159);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrdenamientoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(ExprParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(ExprParser.DESC, 0); }
		public OrdenamientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordenamiento; }
	}

	public final OrdenamientoContext ordenamiento() throws RecognitionException {
		OrdenamientoContext _localctx = new OrdenamientoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ordenamiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			expr(0);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(161);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_ordenamientoContext extends ParserRuleContext {
		public List<OrdenamientoContext> ordenamiento() {
			return getRuleContexts(OrdenamientoContext.class);
		}
		public OrdenamientoContext ordenamiento(int i) {
			return getRuleContext(OrdenamientoContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public Lista_ordenamientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_ordenamiento; }
	}

	public final Lista_ordenamientoContext lista_ordenamiento() throws RecognitionException {
		Lista_ordenamientoContext _localctx = new Lista_ordenamientoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lista_ordenamiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			ordenamiento();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(165);
				match(COMA);
				setState(166);
				ordenamiento();
				}
				}
				setState(171);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_columnasContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACION() { return getToken(ExprParser.MULTIPLICACION, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public Lista_columnasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_columnas; }
	}

	public final Lista_columnasContext lista_columnas() throws RecognitionException {
		Lista_columnasContext _localctx = new Lista_columnasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lista_columnas);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLICACION:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(MULTIPLICACION);
				}
				break;
			case NULL:
			case NOT:
			case TRUE:
			case FALSE:
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
			case ALTER:
			case PARENTA:
			case CADENA:
			case NUM:
			case IDF:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				expr(0);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(174);
					match(COMA);
					setState(175);
					expr(0);
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class Lista_tablasContext extends ParserRuleContext {
		public List<IdentiContext> identi() {
			return getRuleContexts(IdentiContext.class);
		}
		public IdentiContext identi(int i) {
			return getRuleContext(IdentiContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public Lista_tablasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_tablas; }
	}

	public final Lista_tablasContext lista_tablas() throws RecognitionException {
		Lista_tablasContext _localctx = new Lista_tablasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lista_tablas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			identi();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -549755813888L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 70368746274815L) != 0)) {
				{
				setState(184);
				identi();
				}
			}

			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(187);
				match(COMA);
				setState(188);
				identi();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -549755813888L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 70368746274815L) != 0)) {
					{
					setState(189);
					identi();
					}
				}

				}
				}
				setState(196);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Referencia_columnaContext extends ParserRuleContext {
		public List<IdentiContext> identi() {
			return getRuleContexts(IdentiContext.class);
		}
		public IdentiContext identi(int i) {
			return getRuleContext(IdentiContext.class,i);
		}
		public List<TerminalNode> PUNTO() { return getTokens(ExprParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(ExprParser.PUNTO, i);
		}
		public Referencia_columnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencia_columna; }
	}

	public final Referencia_columnaContext referencia_columna() throws RecognitionException {
		Referencia_columnaContext _localctx = new Referencia_columnaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_referencia_columna);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				identi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				identi();
				setState(199);
				match(PUNTO);
				setState(200);
				identi();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				identi();
				setState(203);
				match(PUNTO);
				setState(204);
				identi();
				setState(205);
				match(PUNTO);
				setState(206);
				identi();
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
	public static class Funciones_aggContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(ExprParser.SUM, 0); }
		public TerminalNode PARENTA() { return getToken(ExprParser.PARENTA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENTC() { return getToken(ExprParser.PARENTC, 0); }
		public TerminalNode AVG() { return getToken(ExprParser.AVG, 0); }
		public TerminalNode COUNT() { return getToken(ExprParser.COUNT, 0); }
		public TerminalNode MULTIPLICACION() { return getToken(ExprParser.MULTIPLICACION, 0); }
		public TerminalNode MIN() { return getToken(ExprParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(ExprParser.MAX, 0); }
		public TerminalNode RANK() { return getToken(ExprParser.RANK, 0); }
		public TerminalNode RANDOM() { return getToken(ExprParser.RANDOM, 0); }
		public TerminalNode MD5() { return getToken(ExprParser.MD5, 0); }
		public Funciones_aggContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciones_agg; }
	}

	public final Funciones_aggContext funciones_agg() throws RecognitionException {
		Funciones_aggContext _localctx = new Funciones_aggContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funciones_agg);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(SUM);
				setState(211);
				match(PARENTA);
				setState(212);
				expr(0);
				setState(213);
				match(PARENTC);
				}
				break;
			case AVG:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(AVG);
				setState(216);
				match(PARENTA);
				setState(217);
				expr(0);
				setState(218);
				match(PARENTC);
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(COUNT);
				setState(221);
				match(PARENTA);
				setState(224);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULTIPLICACION:
					{
					setState(222);
					match(MULTIPLICACION);
					}
					break;
				case NULL:
				case NOT:
				case TRUE:
				case FALSE:
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
				case ALTER:
				case PARENTA:
				case CADENA:
				case NUM:
				case IDF:
					{
					setState(223);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(226);
				match(PARENTC);
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(MIN);
				setState(228);
				match(PARENTA);
				setState(229);
				expr(0);
				setState(230);
				match(PARENTC);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(MAX);
				setState(233);
				match(PARENTA);
				setState(234);
				expr(0);
				setState(235);
				match(PARENTC);
				}
				break;
			case RANK:
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				match(RANK);
				setState(238);
				match(PARENTA);
				setState(239);
				expr(0);
				setState(240);
				match(PARENTC);
				}
				break;
			case RANDOM:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				match(RANDOM);
				setState(243);
				match(PARENTA);
				setState(244);
				match(PARENTC);
				}
				break;
			case MD5:
				enterOuterAlt(_localctx, 8);
				{
				setState(245);
				match(MD5);
				setState(246);
				match(PARENTA);
				setState(247);
				expr(0);
				setState(248);
				match(PARENTC);
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
		public TerminalNode PARENTA() { return getToken(ExprParser.PARENTA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PARENTC() { return getToken(ExprParser.PARENTC, 0); }
		public TerminalNode NOT() { return getToken(ExprParser.NOT, 0); }
		public Funciones_aggContext funciones_agg() {
			return getRuleContext(Funciones_aggContext.class,0);
		}
		public Referencia_columnaContext referencia_columna() {
			return getRuleContext(Referencia_columnaContext.class,0);
		}
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public TerminalNode CADENA() { return getToken(ExprParser.CADENA, 0); }
		public TerminalNode TRUE() { return getToken(ExprParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ExprParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public TerminalNode MULTIPLICACION() { return getToken(ExprParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(ExprParser.DIVISION, 0); }
		public TerminalNode SUMA() { return getToken(ExprParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(ExprParser.RESTA, 0); }
		public TerminalNode IGUAL() { return getToken(ExprParser.IGUAL, 0); }
		public TerminalNode COMP1() { return getToken(ExprParser.COMP1, 0); }
		public TerminalNode COMP2() { return getToken(ExprParser.COMP2, 0); }
		public TerminalNode COMPIG1() { return getToken(ExprParser.COMPIG1, 0); }
		public TerminalNode COMPIG2() { return getToken(ExprParser.COMPIG2, 0); }
		public TerminalNode LIKE() { return getToken(ExprParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(ExprParser.ILIKE, 0); }
		public TerminalNode AND() { return getToken(ExprParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExprParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(253);
				match(PARENTA);
				setState(254);
				expr(0);
				setState(255);
				match(PARENTC);
				}
				break;
			case 2:
				{
				setState(257);
				match(NOT);
				setState(258);
				expr(14);
				}
				break;
			case 3:
				{
				setState(259);
				funciones_agg();
				}
				break;
			case 4:
				{
				setState(260);
				referencia_columna();
				}
				break;
			case 5:
				{
				setState(261);
				match(NUM);
				}
				break;
			case 6:
				{
				setState(262);
				match(CADENA);
				}
				break;
			case 7:
				{
				setState(263);
				match(TRUE);
				}
				break;
			case 8:
				{
				setState(264);
				match(FALSE);
				}
				break;
			case 9:
				{
				setState(265);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(286);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(269);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLICACION || _la==DIVISION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(270);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(272);
						match(SUMA);
						setState(273);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(275);
						match(RESTA);
						setState(276);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(277);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(278);
						_la = _input.LA(1);
						if ( !(_la==LIKE || _la==ILIKE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 491521L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(279);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(281);
						match(AND);
						setState(282);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(284);
						match(OR);
						setState(285);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001q\u0124\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000\u000b"+
		"\u0000\f\u0000\u001f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002,\b\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0002"+
		"\u0003\u00029\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002?\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002E\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002L\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002W\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002]\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002c\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002o\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003s\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004{\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0081\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0085\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008a\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u008e\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0093\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0097\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u009c\b\u0006\n"+
		"\u0006\f\u0006\u009f\t\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00a3"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00a8\b\b\n\b\f\b\u00ab\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b1\b\t\n\t\f\t\u00b4\t\t\u0003\t"+
		"\u00b6\b\t\u0001\n\u0001\n\u0003\n\u00ba\b\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00bf\b\n\u0005\n\u00c1\b\n\n\n\f\n\u00c4\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d1\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e1\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00fb\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u010b\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u011f\b\r\n\r\f\r\u0122\t\r\u0001\r"+
		"\u0000\u0001\u001a\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u0000\u0004\u0001\u0000\'T\u0001\u0000\t\n\u0001"+
		"\u0000WX\u0003\u0000\u0007\bYYhk\u015f\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0002#\u0001\u0000\u0000\u0000\u0004n\u0001\u0000\u0000\u0000\u0006r"+
		"\u0001\u0000\u0000\u0000\bz\u0001\u0000\u0000\u0000\n|\u0001\u0000\u0000"+
		"\u0000\f\u0098\u0001\u0000\u0000\u0000\u000e\u00a0\u0001\u0000\u0000\u0000"+
		"\u0010\u00a4\u0001\u0000\u0000\u0000\u0012\u00b5\u0001\u0000\u0000\u0000"+
		"\u0014\u00b7\u0001\u0000\u0000\u0000\u0016\u00d0\u0001\u0000\u0000\u0000"+
		"\u0018\u00fa\u0001\u0000\u0000\u0000\u001a\u010a\u0001\u0000\u0000\u0000"+
		"\u001c\u001e\u0003\b\u0004\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0005\u0000\u0000"+
		"\u0001\"\u0001\u0001\u0000\u0000\u0000#$\u0007\u0000\u0000\u0000$\u0003"+
		"\u0001\u0000\u0000\u0000%o\u0005,\u0000\u0000&.\u0005-\u0000\u0000\'("+
		"\u0005\\\u0000\u0000(+\u0005m\u0000\u0000)*\u0005Z\u0000\u0000*,\u0005"+
		"m\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-/\u0005]\u0000\u0000.\'\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/o\u0001\u0000\u0000\u000008\u0005.\u0000\u000012\u0005"+
		"\\\u0000\u000025\u0005m\u0000\u000034\u0005Z\u0000\u000046\u0005m\u0000"+
		"\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000079\u0005]\u0000\u000081\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009o\u0001\u0000\u0000\u0000:>\u0005/\u0000\u0000;<\u0005\\"+
		"\u0000\u0000<=\u0005m\u0000\u0000=?\u0005]\u0000\u0000>;\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?o\u0001\u0000\u0000\u0000@D\u00050\u0000"+
		"\u0000AB\u0005\\\u0000\u0000BC\u0005m\u0000\u0000CE\u0005]\u0000\u0000"+
		"DA\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000Eo\u0001\u0000\u0000"+
		"\u0000FG\u0005O\u0000\u0000GK\u0005P\u0000\u0000HI\u0005\\\u0000\u0000"+
		"IJ\u0005m\u0000\u0000JL\u0005]\u0000\u0000KH\u0001\u0000\u0000\u0000K"+
		"L\u0001\u0000\u0000\u0000Lo\u0001\u0000\u0000\u0000Mo\u00051\u0000\u0000"+
		"No\u00052\u0000\u0000Oo\u00053\u0000\u0000Po\u00054\u0000\u0000Qo\u0005"+
		"6\u0000\u0000RV\u00057\u0000\u0000ST\u0005\\\u0000\u0000TU\u0005m\u0000"+
		"\u0000UW\u0005]\u0000\u0000VS\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000Wo\u0001\u0000\u0000\u0000X\\\u00058\u0000\u0000YZ\u0005\\\u0000"+
		"\u0000Z[\u0005m\u0000\u0000[]\u0005]\u0000\u0000\\Y\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]o\u0001\u0000\u0000\u0000^b\u00059\u0000"+
		"\u0000_`\u0005\\\u0000\u0000`a\u0005m\u0000\u0000ac\u0005]\u0000\u0000"+
		"b_\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000co\u0001\u0000\u0000"+
		"\u0000do\u0005:\u0000\u0000eo\u0005;\u0000\u0000fo\u0005<\u0000\u0000"+
		"go\u0005=\u0000\u0000ho\u0005>\u0000\u0000io\u0005?\u0000\u0000jo\u0005"+
		"@\u0000\u0000ko\u0005A\u0000\u0000lo\u0005B\u0000\u0000mo\u0005C\u0000"+
		"\u0000n%\u0001\u0000\u0000\u0000n&\u0001\u0000\u0000\u0000n0\u0001\u0000"+
		"\u0000\u0000n:\u0001\u0000\u0000\u0000n@\u0001\u0000\u0000\u0000nF\u0001"+
		"\u0000\u0000\u0000nM\u0001\u0000\u0000\u0000nN\u0001\u0000\u0000\u0000"+
		"nO\u0001\u0000\u0000\u0000nP\u0001\u0000\u0000\u0000nQ\u0001\u0000\u0000"+
		"\u0000nR\u0001\u0000\u0000\u0000nX\u0001\u0000\u0000\u0000n^\u0001\u0000"+
		"\u0000\u0000nd\u0001\u0000\u0000\u0000ne\u0001\u0000\u0000\u0000nf\u0001"+
		"\u0000\u0000\u0000ng\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000\u0000"+
		"ni\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000nk\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0005\u0001"+
		"\u0000\u0000\u0000ps\u0005n\u0000\u0000qs\u0003\u0002\u0001\u0000rp\u0001"+
		"\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u0007\u0001\u0000\u0000"+
		"\u0000tu\u0003\n\u0005\u0000uv\u0005^\u0000\u0000v{\u0001\u0000\u0000"+
		"\u0000wx\u0003\u001a\r\u0000xy\u0005^\u0000\u0000y{\u0001\u0000\u0000"+
		"\u0000zt\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000\u0000{\t\u0001\u0000"+
		"\u0000\u0000|}\u0005\u0001\u0000\u0000}\u0080\u0003\u0012\t\u0000~\u007f"+
		"\u0005\u0002\u0000\u0000\u007f\u0081\u0003\u0014\n\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0084\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005\u0004\u0000\u0000\u0083\u0085\u0003"+
		"\u001a\r\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0089\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0006"+
		"\u0000\u0000\u0087\u0088\u0005\'\u0000\u0000\u0088\u008a\u0003\f\u0006"+
		"\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u001a\u0000"+
		"\u0000\u008c\u008e\u0003\u001a\r\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0092\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0005\r\u0000\u0000\u0090\u0091\u0005\'\u0000\u0000\u0091"+
		"\u0093\u0003\u0010\b\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005\u0011\u0000\u0000\u0095\u0097\u0005m\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u000b\u0001"+
		"\u0000\u0000\u0000\u0098\u009d\u0003\u001a\r\u0000\u0099\u009a\u0005Z"+
		"\u0000\u0000\u009a\u009c\u0003\u001a\r\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\r\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003\u001a\r\u0000\u00a1"+
		"\u00a3\u0007\u0001\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u000f\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a9\u0003\u000e\u0007\u0000\u00a5\u00a6\u0005Z\u0000\u0000\u00a6\u00a8"+
		"\u0003\u000e\u0007\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u0011\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ac\u00b6\u0005W\u0000\u0000\u00ad\u00b2\u0003"+
		"\u001a\r\u0000\u00ae\u00af\u0005Z\u0000\u0000\u00af\u00b1\u0003\u001a"+
		"\r\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b5\u00ac\u0001\u0000\u0000\u0000\u00b5\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b6\u0013\u0001\u0000\u0000\u0000\u00b7\u00b9\u0003\u0006\u0003"+
		"\u0000\u00b8\u00ba\u0003\u0006\u0003\u0000\u00b9\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00c2\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0005Z\u0000\u0000\u00bc\u00be\u0003\u0006\u0003\u0000"+
		"\u00bd\u00bf\u0003\u0006\u0003\u0000\u00be\u00bd\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c0\u00bb\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3\u0015\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c5\u00d1\u0003\u0006\u0003\u0000\u00c6\u00c7\u0003\u0006\u0003\u0000"+
		"\u00c7\u00c8\u0005[\u0000\u0000\u00c8\u00c9\u0003\u0006\u0003\u0000\u00c9"+
		"\u00d1\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003\u0006\u0003\u0000\u00cb"+
		"\u00cc\u0005[\u0000\u0000\u00cc\u00cd\u0003\u0006\u0003\u0000\u00cd\u00ce"+
		"\u0005[\u0000\u0000\u00ce\u00cf\u0003\u0006\u0003\u0000\u00cf\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d0\u00c5\u0001\u0000\u0000\u0000\u00d0\u00c6\u0001"+
		"\u0000\u0000\u0000\u00d0\u00ca\u0001\u0000\u0000\u0000\u00d1\u0017\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005G\u0000\u0000\u00d3\u00d4\u0005\\"+
		"\u0000\u0000\u00d4\u00d5\u0003\u001a\r\u0000\u00d5\u00d6\u0005]\u0000"+
		"\u0000\u00d6\u00fb\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005H\u0000\u0000"+
		"\u00d8\u00d9\u0005\\\u0000\u0000\u00d9\u00da\u0003\u001a\r\u0000\u00da"+
		"\u00db\u0005]\u0000\u0000\u00db\u00fb\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0005I\u0000\u0000\u00dd\u00e0\u0005\\\u0000\u0000\u00de\u00e1\u0005"+
		"W\u0000\u0000\u00df\u00e1\u0003\u001a\r\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2\u00fb\u0005]\u0000\u0000\u00e3\u00e4\u0005J\u0000\u0000"+
		"\u00e4\u00e5\u0005\\\u0000\u0000\u00e5\u00e6\u0003\u001a\r\u0000\u00e6"+
		"\u00e7\u0005]\u0000\u0000\u00e7\u00fb\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0005K\u0000\u0000\u00e9\u00ea\u0005\\\u0000\u0000\u00ea\u00eb\u0003"+
		"\u001a\r\u0000\u00eb\u00ec\u0005]\u0000\u0000\u00ec\u00fb\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0005L\u0000\u0000\u00ee\u00ef\u0005\\\u0000"+
		"\u0000\u00ef\u00f0\u0003\u001a\r\u0000\u00f0\u00f1\u0005]\u0000\u0000"+
		"\u00f1\u00fb\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005M\u0000\u0000\u00f3"+
		"\u00f4\u0005\\\u0000\u0000\u00f4\u00fb\u0005]\u0000\u0000\u00f5\u00f6"+
		"\u0005N\u0000\u0000\u00f6\u00f7\u0005\\\u0000\u0000\u00f7\u00f8\u0003"+
		"\u001a\r\u0000\u00f8\u00f9\u0005]\u0000\u0000\u00f9\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fa\u00d2\u0001\u0000\u0000\u0000\u00fa\u00d7\u0001\u0000"+
		"\u0000\u0000\u00fa\u00dc\u0001\u0000\u0000\u0000\u00fa\u00e3\u0001\u0000"+
		"\u0000\u0000\u00fa\u00e8\u0001\u0000\u0000\u0000\u00fa\u00ed\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f2\u0001\u0000\u0000\u0000\u00fa\u00f5\u0001\u0000"+
		"\u0000\u0000\u00fb\u0019\u0001\u0000\u0000\u0000\u00fc\u00fd\u0006\r\uffff"+
		"\uffff\u0000\u00fd\u00fe\u0005\\\u0000\u0000\u00fe\u00ff\u0003\u001a\r"+
		"\u0000\u00ff\u0100\u0005]\u0000\u0000\u0100\u010b\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0005\u0016\u0000\u0000\u0102\u010b\u0003\u001a\r\u000e\u0103"+
		"\u010b\u0003\u0018\f\u0000\u0104\u010b\u0003\u0016\u000b\u0000\u0105\u010b"+
		"\u0005m\u0000\u0000\u0106\u010b\u0005l\u0000\u0000\u0107\u010b\u0005 "+
		"\u0000\u0000\u0108\u010b\u0005!\u0000\u0000\u0109\u010b\u0005\u0015\u0000"+
		"\u0000\u010a\u00fc\u0001\u0000\u0000\u0000\u010a\u0101\u0001\u0000\u0000"+
		"\u0000\u010a\u0103\u0001\u0000\u0000\u0000\u010a\u0104\u0001\u0000\u0000"+
		"\u0000\u010a\u0105\u0001\u0000\u0000\u0000\u010a\u0106\u0001\u0000\u0000"+
		"\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u0120\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\n\r\u0000\u0000\u010d\u010e\u0007\u0002\u0000\u0000"+
		"\u010e\u011f\u0003\u001a\r\u000e\u010f\u0110\n\f\u0000\u0000\u0110\u0111"+
		"\u0005U\u0000\u0000\u0111\u011f\u0003\u001a\r\r\u0112\u0113\n\u000b\u0000"+
		"\u0000\u0113\u0114\u0005V\u0000\u0000\u0114\u011f\u0003\u001a\r\f\u0115"+
		"\u0116\n\n\u0000\u0000\u0116\u0117\u0007\u0003\u0000\u0000\u0117\u011f"+
		"\u0003\u001a\r\u000b\u0118\u0119\n\t\u0000\u0000\u0119\u011a\u0005%\u0000"+
		"\u0000\u011a\u011f\u0003\u001a\r\n\u011b\u011c\n\b\u0000\u0000\u011c\u011d"+
		"\u0005$\u0000\u0000\u011d\u011f\u0003\u001a\r\t\u011e\u010c\u0001\u0000"+
		"\u0000\u0000\u011e\u010f\u0001\u0000\u0000\u0000\u011e\u0112\u0001\u0000"+
		"\u0000\u0000\u011e\u0115\u0001\u0000\u0000\u0000\u011e\u0118\u0001\u0000"+
		"\u0000\u0000\u011e\u011b\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121\u001b\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000"+
		"\u0000\u0000\"\u001f+.58>DKV\\bnrz\u0080\u0084\u0089\u008d\u0092\u0096"+
		"\u009d\u00a2\u00a9\u00b2\u00b5\u00b9\u00be\u00c2\u00d0\u00e0\u00fa\u010a"+
		"\u011e\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}