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
		UNIQUE=39, CONSTRAINT=40, AS=41, FULL=42, CROSS=43, USING=44, TO=45, ALL=46, 
		BY=47, UPDATE=48, SET=49, DELETE=50, SCHEMA=51, INT=52, DECIMAL=53, NUMERIC=54, 
		CHAR=55, VARCHAR=56, TEXT=57, INTEGER=58, SMALLINT=59, SERIAL=60, KEY=61, 
		DATE=62, TIMESTAMP=63, TIME=64, TIMESTAMPZ=65, BIGINT=66, REAL=67, BOOLEAN=68, 
		JSON=69, JSONB=70, INET=71, CIDR=72, MACADDR=73, BYTEA=74, OID=75, INDEX=76, 
		DOUBLE=77, PRECISION=78, SUM=79, AVG=80, COUNT=81, MIN=82, MAX=83, RANK=84, 
		RANDOM=85, MD5=86, CHARACTER=87, VARYING=88, COMMIT=89, BEGIN=90, ROLLBACK=91, 
		ALTER=92, DATABASE=93, PASSWORD=94, ADD=95, DROP=96, TYPE=97, RENAME=98, 
		OWNER=99, LOGIN=100, NOLOGIN=101, SUPERUSER=102, NOSUPERUSER=103, CREATEDB=104, 
		NOCREATEDB=105, CREATEROLE=106, NOCREATEROLE=107, CASCADE=108, RESTRICT=109, 
		IF=110, EXISTS=111, ROLE=112, VALUES=113, REVOKE=114, PRIVILEGES=115, 
		TRANSACTION=116, REPLACE=117, VIEW=118, SUMA=119, RESTA=120, MULTIPLICACION=121, 
		DIVISION=122, IGUAL=123, COMA=124, PUNTO=125, PARENTA=126, PARENTC=127, 
		PUNTOCOMA=128, ORSIMB=129, NOTSIMB=130, EXCLAMACION=131, ANDSIMB=132, 
		PREGUNTA=133, PORCENTAJE=134, GATO=135, ARROBA=136, POTENCIA=137, COMP1=138, 
		COMP2=139, COMPIG1=140, COMPIG2=141, CADENA=142, NUM=143, IDF=144, COMENTARIO_LINEA=145, 
		COMENTARIO_BLOQUE=146, WS=147;
	public static final int
		RULE_root = 0, RULE_palabras_no_reservadas = 1, RULE_tipo_dato = 2, RULE_identi = 3, 
		RULE_setencia = 4, RULE_select = 5, RULE_lista_expresiones = 6, RULE_tabla_origen = 7, 
		RULE_join = 8, RULE_tabla_ref = 9, RULE_ordenamiento = 10, RULE_lista_ordenamiento = 11, 
		RULE_lista_columnas = 12, RULE_lista_tablas = 13, RULE_referencia_columna = 14, 
		RULE_funciones_agg = 15, RULE_create = 16, RULE_create_schema = 17, RULE_create_database = 18, 
		RULE_create_user = 19, RULE_create_table = 20, RULE_create_view = 21, 
		RULE_restriccion_col = 22, RULE_lista_identi = 23, RULE_restricciones_tabla = 24, 
		RULE_elemento_tabla = 25, RULE_lista_columnas_def = 26, RULE_columna_def = 27, 
		RULE_create_index = 28, RULE_delete = 29, RULE_update = 30, RULE_asignacion_upd = 31, 
		RULE_alter_accion = 32, RULE_alter = 33, RULE_alter_table = 34, RULE_alter_schema = 35, 
		RULE_alter_database = 36, RULE_opcion_usuario = 37, RULE_alter_user = 38, 
		RULE_alter_index = 39, RULE_drop = 40, RULE_drop_table = 41, RULE_drop_schema = 42, 
		RULE_drop_database = 43, RULE_drop_user = 44, RULE_drop_index = 45, RULE_drop_view = 46, 
		RULE_valores_fila = 47, RULE_insert = 48, RULE_privilegios = 49, RULE_lista_previ = 50, 
		RULE_grant = 51, RULE_revoke = 52, RULE_transaccion = 53, RULE_expr = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "palabras_no_reservadas", "tipo_dato", "identi", "setencia", 
			"select", "lista_expresiones", "tabla_origen", "join", "tabla_ref", "ordenamiento", 
			"lista_ordenamiento", "lista_columnas", "lista_tablas", "referencia_columna", 
			"funciones_agg", "create", "create_schema", "create_database", "create_user", 
			"create_table", "create_view", "restriccion_col", "lista_identi", "restricciones_tabla", 
			"elemento_tabla", "lista_columnas_def", "columna_def", "create_index", 
			"delete", "update", "asignacion_upd", "alter_accion", "alter", "alter_table", 
			"alter_schema", "alter_database", "opcion_usuario", "alter_user", "alter_index", 
			"drop", "drop_table", "drop_schema", "drop_database", "drop_user", "drop_index", 
			"drop_view", "valores_fila", "insert", "privilegios", "lista_previ", 
			"grant", "revoke", "transaccion", "expr"
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
			"'END'", "'DEFAULT'", "'OR'", "'AND'", "'WITH'", "'UNIQUE'", "'CONSTRAINT'", 
			"'AS'", "'FULL'", "'CROSS'", "'USING'", "'TO'", "'ALL'", "'BY'", "'UPDATE'", 
			"'SET'", "'DELETE'", "'SCHEMA'", "'INT'", "'DECIMAL'", "'NUMERIC'", "'CHAR'", 
			"'VARCHAR'", "'TEXT'", "'INTEGER'", "'SMALLINT'", "'SERIAL'", "'KEY'", 
			"'DATE'", "'TIMESTAMP'", "'TIME'", "'TIMESTAMPZ'", "'BIGINT'", "'REAL'", 
			"'BOOLEAN'", "'JSON'", "'JSONB'", "'INET'", "'CIDR'", "'MACADDR'", "'BYTEA'", 
			"'OID'", "'INDEX'", "'DOUBLE'", "'PRECISION'", "'SUM'", "'AVG'", "'COUNT'", 
			"'MIN'", "'MAX'", "'RANK'", "'RANDOM'", "'MD5'", "'CHARACTER'", "'VARYING'", 
			"'COMMIT'", "'BEGIN'", "'ROLLBACK'", "'ALTER'", "'DATABASE'", "'PASSWORD'", 
			"'ADD'", "'DROP'", "'TYPE'", "'RENAME'", "'OWNER'", "'LOGIN'", "'NOLOGIN'", 
			"'SUPERUSER'", "'NOSUPERUSER'", "'CREATEDB'", "'NOCREATEDB'", "'CREATEROLE'", 
			"'NOCREATEROLE'", "'CASCADE'", "'RESTRICT'", "'IF'", "'EXISTS'", "'ROLE'", 
			"'VALUES'", "'REVOKE'", "'PRIVILEGES'", "'TRANSACTION'", "'REPLACE'", 
			"'VIEW'", "'+'", "'-'", "'*'", "'/'", "'='", "','", "'.'", "'('", "')'", 
			"';'", "'|'", "'~'", "'!'", "'&'", "'?'", "'%'", "'#'", "'@'", "'^'", 
			"'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "CREATE", "WHERE", "CHECK", "GROUP", "LIKE", 
			"ILIKE", "ASC", "DESC", "TABLE", "COLUMN", "ORDER", "JOIN", "RIGHT", 
			"LEFT", "LIMIT", "ON", "INNER", "USER", "NULL", "NOT", "NOTNULL", "OUTER", 
			"PRIMARY", "HAVING", "GRANT", "REFERENCES", "FOREIGN", "INSERT", "INTO", 
			"TRUE", "FALSE", "END", "DEFAULT", "OR", "AND", "WITH", "UNIQUE", "CONSTRAINT", 
			"AS", "FULL", "CROSS", "USING", "TO", "ALL", "BY", "UPDATE", "SET", "DELETE", 
			"SCHEMA", "INT", "DECIMAL", "NUMERIC", "CHAR", "VARCHAR", "TEXT", "INTEGER", 
			"SMALLINT", "SERIAL", "KEY", "DATE", "TIMESTAMP", "TIME", "TIMESTAMPZ", 
			"BIGINT", "REAL", "BOOLEAN", "JSON", "JSONB", "INET", "CIDR", "MACADDR", 
			"BYTEA", "OID", "INDEX", "DOUBLE", "PRECISION", "SUM", "AVG", "COUNT", 
			"MIN", "MAX", "RANK", "RANDOM", "MD5", "CHARACTER", "VARYING", "COMMIT", 
			"BEGIN", "ROLLBACK", "ALTER", "DATABASE", "PASSWORD", "ADD", "DROP", 
			"TYPE", "RENAME", "OWNER", "LOGIN", "NOLOGIN", "SUPERUSER", "NOSUPERUSER", 
			"CREATEDB", "NOCREATEDB", "CREATEROLE", "NOCREATEROLE", "CASCADE", "RESTRICT", 
			"IF", "EXISTS", "ROLE", "VALUES", "REVOKE", "PRIVILEGES", "TRANSACTION", 
			"REPLACE", "VIEW", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "IGUAL", 
			"COMA", "PUNTO", "PARENTA", "PARENTC", "PUNTOCOMA", "ORSIMB", "NOTSIMB", 
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
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				setencia();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -140723389202422L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4643211215818981375L) != 0) || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & 7L) != 0) );
			setState(115);
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
		public TerminalNode DATABASE() { return getToken(ExprParser.DATABASE, 0); }
		public TerminalNode PASSWORD() { return getToken(ExprParser.PASSWORD, 0); }
		public TerminalNode ADD() { return getToken(ExprParser.ADD, 0); }
		public TerminalNode DROP() { return getToken(ExprParser.DROP, 0); }
		public TerminalNode TYPE() { return getToken(ExprParser.TYPE, 0); }
		public TerminalNode RENAME() { return getToken(ExprParser.RENAME, 0); }
		public TerminalNode OWNER() { return getToken(ExprParser.OWNER, 0); }
		public TerminalNode LOGIN() { return getToken(ExprParser.LOGIN, 0); }
		public TerminalNode NOLOGIN() { return getToken(ExprParser.NOLOGIN, 0); }
		public TerminalNode SUPERUSER() { return getToken(ExprParser.SUPERUSER, 0); }
		public TerminalNode NOSUPERUSER() { return getToken(ExprParser.NOSUPERUSER, 0); }
		public TerminalNode CREATEDB() { return getToken(ExprParser.CREATEDB, 0); }
		public TerminalNode NOCREATEDB() { return getToken(ExprParser.NOCREATEDB, 0); }
		public TerminalNode CREATEROLE() { return getToken(ExprParser.CREATEROLE, 0); }
		public TerminalNode NOCREATEROLE() { return getToken(ExprParser.NOCREATEROLE, 0); }
		public TerminalNode CASCADE() { return getToken(ExprParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(ExprParser.RESTRICT, 0); }
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExprParser.EXISTS, 0); }
		public TerminalNode ROLE() { return getToken(ExprParser.ROLE, 0); }
		public TerminalNode VALUES() { return getToken(ExprParser.VALUES, 0); }
		public TerminalNode REVOKE() { return getToken(ExprParser.REVOKE, 0); }
		public TerminalNode PRIVILEGES() { return getToken(ExprParser.PRIVILEGES, 0); }
		public TerminalNode REPLACE() { return getToken(ExprParser.REPLACE, 0); }
		public TerminalNode VIEW() { return getToken(ExprParser.VIEW, 0); }
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
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -140737488355328L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31525197391593471L) != 0)) ) {
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
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(INT);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(DECIMAL);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(121);
					match(PARENTA);
					setState(122);
					match(NUM);
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMA) {
						{
						setState(123);
						match(COMA);
						setState(124);
						match(NUM);
						}
					}

					setState(127);
					match(PARENTC);
					}
				}

				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(NUMERIC);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(131);
					match(PARENTA);
					setState(132);
					match(NUM);
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMA) {
						{
						setState(133);
						match(COMA);
						setState(134);
						match(NUM);
						}
					}

					setState(137);
					match(PARENTC);
					}
				}

				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(CHAR);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(141);
					match(PARENTA);
					setState(142);
					match(NUM);
					setState(143);
					match(PARENTC);
					}
				}

				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				match(VARCHAR);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(147);
					match(PARENTA);
					setState(148);
					match(NUM);
					setState(149);
					match(PARENTC);
					}
				}

				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				match(CHARACTER);
				setState(153);
				match(VARYING);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(154);
					match(PARENTA);
					setState(155);
					match(NUM);
					setState(156);
					match(PARENTC);
					}
				}

				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				match(TEXT);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				match(INTEGER);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(161);
				match(SMALLINT);
				}
				break;
			case SERIAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(162);
				match(SERIAL);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 11);
				{
				setState(163);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 12);
				{
				setState(164);
				match(TIMESTAMP);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(165);
					match(PARENTA);
					setState(166);
					match(NUM);
					setState(167);
					match(PARENTC);
					}
				}

				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 13);
				{
				setState(170);
				match(TIME);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(171);
					match(PARENTA);
					setState(172);
					match(NUM);
					setState(173);
					match(PARENTC);
					}
				}

				}
				break;
			case TIMESTAMPZ:
				enterOuterAlt(_localctx, 14);
				{
				setState(176);
				match(TIMESTAMPZ);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(177);
					match(PARENTA);
					setState(178);
					match(NUM);
					setState(179);
					match(PARENTC);
					}
				}

				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 15);
				{
				setState(182);
				match(BIGINT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 16);
				{
				setState(183);
				match(REAL);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 17);
				{
				setState(184);
				match(BOOLEAN);
				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 18);
				{
				setState(185);
				match(JSON);
				}
				break;
			case JSONB:
				enterOuterAlt(_localctx, 19);
				{
				setState(186);
				match(JSONB);
				}
				break;
			case INET:
				enterOuterAlt(_localctx, 20);
				{
				setState(187);
				match(INET);
				}
				break;
			case CIDR:
				enterOuterAlt(_localctx, 21);
				{
				setState(188);
				match(CIDR);
				}
				break;
			case MACADDR:
				enterOuterAlt(_localctx, 22);
				{
				setState(189);
				match(MACADDR);
				}
				break;
			case BYTEA:
				enterOuterAlt(_localctx, 23);
				{
				setState(190);
				match(BYTEA);
				}
				break;
			case OID:
				enterOuterAlt(_localctx, 24);
				{
				setState(191);
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
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDF:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
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
			case DATABASE:
			case PASSWORD:
			case ADD:
			case DROP:
			case TYPE:
			case RENAME:
			case OWNER:
			case LOGIN:
			case NOLOGIN:
			case SUPERUSER:
			case NOSUPERUSER:
			case CREATEDB:
			case NOCREATEDB:
			case CREATEROLE:
			case NOCREATEROLE:
			case CASCADE:
			case RESTRICT:
			case IF:
			case EXISTS:
			case ROLE:
			case VALUES:
			case REVOKE:
			case PRIVILEGES:
			case REPLACE:
			case VIEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
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
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public AlterContext alter() {
			return getRuleContext(AlterContext.class,0);
		}
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public GrantContext grant() {
			return getRuleContext(GrantContext.class,0);
		}
		public RevokeContext revoke() {
			return getRuleContext(RevokeContext.class,0);
		}
		public TransaccionContext transaccion() {
			return getRuleContext(TransaccionContext.class,0);
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
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				select();
				setState(199);
				match(PUNTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				create();
				setState(202);
				match(PUNTOCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				expr(0);
				setState(205);
				match(PUNTOCOMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				delete();
				setState(208);
				match(PUNTOCOMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				update();
				setState(211);
				match(PUNTOCOMA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				alter();
				setState(214);
				match(PUNTOCOMA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(216);
				drop();
				setState(217);
				match(PUNTOCOMA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(219);
				insert();
				setState(220);
				match(PUNTOCOMA);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(222);
				grant();
				setState(223);
				match(PUNTOCOMA);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(225);
				revoke();
				setState(226);
				match(PUNTOCOMA);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(228);
				transaccion();
				setState(229);
				match(PUNTOCOMA);
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
			setState(233);
			match(SELECT);
			setState(234);
			lista_columnas();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(235);
				match(FROM);
				setState(236);
				lista_tablas();
				}
			}

			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(239);
				match(WHERE);
				setState(240);
				expr(0);
				}
			}

			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(243);
				match(GROUP);
				setState(244);
				match(BY);
				setState(245);
				lista_expresiones();
				}
			}

			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(248);
				match(HAVING);
				setState(249);
				expr(0);
				}
			}

			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(252);
				match(ORDER);
				setState(253);
				match(BY);
				setState(254);
				lista_ordenamiento();
				}
			}

			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(257);
				match(LIMIT);
				setState(258);
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
			setState(261);
			expr(0);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(262);
				match(COMA);
				setState(263);
				expr(0);
				}
				}
				setState(268);
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
	public static class Tabla_origenContext extends ParserRuleContext {
		public List<IdentiContext> identi() {
			return getRuleContexts(IdentiContext.class);
		}
		public IdentiContext identi(int i) {
			return getRuleContext(IdentiContext.class,i);
		}
		public TerminalNode AS() { return getToken(ExprParser.AS, 0); }
		public TerminalNode PARENTA() { return getToken(ExprParser.PARENTA, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode PARENTC() { return getToken(ExprParser.PARENTC, 0); }
		public Tabla_origenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabla_origen; }
	}

	public final Tabla_origenContext tabla_origen() throws RecognitionException {
		Tabla_origenContext _localctx = new Tabla_origenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tabla_origen);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
			case DATABASE:
			case PASSWORD:
			case ADD:
			case DROP:
			case TYPE:
			case RENAME:
			case OWNER:
			case LOGIN:
			case NOLOGIN:
			case SUPERUSER:
			case NOSUPERUSER:
			case CREATEDB:
			case NOCREATEDB:
			case CREATEROLE:
			case NOCREATEROLE:
			case CASCADE:
			case RESTRICT:
			case IF:
			case EXISTS:
			case ROLE:
			case VALUES:
			case REVOKE:
			case PRIVILEGES:
			case REPLACE:
			case VIEW:
			case IDF:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				identi();
				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(270);
						match(AS);
						}
					}

					setState(273);
					identi();
					}
					break;
				}
				}
				break;
			case PARENTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(PARENTA);
				setState(277);
				select();
				setState(278);
				match(PARENTC);
				setState(283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(279);
						match(AS);
						}
					}

					setState(282);
					identi();
					}
					break;
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
	public static class JoinContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(ExprParser.JOIN, 0); }
		public Tabla_origenContext tabla_origen() {
			return getRuleContext(Tabla_origenContext.class,0);
		}
		public TerminalNode ON() { return getToken(ExprParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INNER() { return getToken(ExprParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(ExprParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(ExprParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(ExprParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(ExprParser.OUTER, 0); }
		public TerminalNode CROSS() { return getToken(ExprParser.CROSS, 0); }
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_join);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(287);
					match(INNER);
					}
				}

				setState(290);
				match(JOIN);
				setState(291);
				tabla_origen();
				setState(292);
				match(ON);
				setState(293);
				expr(0);
				}
				break;
			case RIGHT:
			case LEFT:
			case FULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046609408L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(296);
					match(OUTER);
					}
				}

				setState(299);
				match(JOIN);
				setState(300);
				tabla_origen();
				setState(301);
				match(ON);
				setState(302);
				expr(0);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(CROSS);
				setState(305);
				match(JOIN);
				setState(306);
				tabla_origen();
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
	public static class Tabla_refContext extends ParserRuleContext {
		public Tabla_origenContext tabla_origen() {
			return getRuleContext(Tabla_origenContext.class,0);
		}
		public List<JoinContext> join() {
			return getRuleContexts(JoinContext.class);
		}
		public JoinContext join(int i) {
			return getRuleContext(JoinContext.class,i);
		}
		public Tabla_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabla_ref; }
	}

	public final Tabla_refContext tabla_ref() throws RecognitionException {
		Tabla_refContext _localctx = new Tabla_refContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tabla_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			tabla_origen();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13194140172288L) != 0)) {
				{
				{
				setState(310);
				join();
				}
				}
				setState(315);
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
		enterRule(_localctx, 20, RULE_ordenamiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			expr(0);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(317);
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
		enterRule(_localctx, 22, RULE_lista_ordenamiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			ordenamiento();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(321);
				match(COMA);
				setState(322);
				ordenamiento();
				}
				}
				setState(327);
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
		enterRule(_localctx, 24, RULE_lista_columnas);
		int _la;
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLICACION:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
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
			case DATABASE:
			case PASSWORD:
			case ADD:
			case DROP:
			case TYPE:
			case RENAME:
			case OWNER:
			case LOGIN:
			case NOLOGIN:
			case SUPERUSER:
			case NOSUPERUSER:
			case CREATEDB:
			case NOCREATEDB:
			case CREATEROLE:
			case NOCREATEROLE:
			case CASCADE:
			case RESTRICT:
			case IF:
			case EXISTS:
			case ROLE:
			case VALUES:
			case REVOKE:
			case PRIVILEGES:
			case REPLACE:
			case VIEW:
			case PARENTA:
			case CADENA:
			case NUM:
			case IDF:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				expr(0);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(330);
					match(COMA);
					setState(331);
					expr(0);
					}
					}
					setState(336);
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
		public List<Tabla_refContext> tabla_ref() {
			return getRuleContexts(Tabla_refContext.class);
		}
		public Tabla_refContext tabla_ref(int i) {
			return getRuleContext(Tabla_refContext.class,i);
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
		enterRule(_localctx, 26, RULE_lista_tablas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			tabla_ref();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(340);
				match(COMA);
				setState(341);
				tabla_ref();
				}
				}
				setState(346);
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
		enterRule(_localctx, 28, RULE_referencia_columna);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				identi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				identi();
				setState(349);
				match(PUNTO);
				setState(350);
				identi();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				identi();
				setState(353);
				match(PUNTO);
				setState(354);
				identi();
				setState(355);
				match(PUNTO);
				setState(356);
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
		enterRule(_localctx, 30, RULE_funciones_agg);
		try {
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(SUM);
				setState(361);
				match(PARENTA);
				setState(362);
				expr(0);
				setState(363);
				match(PARENTC);
				}
				break;
			case AVG:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(AVG);
				setState(366);
				match(PARENTA);
				setState(367);
				expr(0);
				setState(368);
				match(PARENTC);
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(COUNT);
				setState(371);
				match(PARENTA);
				setState(374);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULTIPLICACION:
					{
					setState(372);
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
				case DATABASE:
				case PASSWORD:
				case ADD:
				case DROP:
				case TYPE:
				case RENAME:
				case OWNER:
				case LOGIN:
				case NOLOGIN:
				case SUPERUSER:
				case NOSUPERUSER:
				case CREATEDB:
				case NOCREATEDB:
				case CREATEROLE:
				case NOCREATEROLE:
				case CASCADE:
				case RESTRICT:
				case IF:
				case EXISTS:
				case ROLE:
				case VALUES:
				case REVOKE:
				case PRIVILEGES:
				case REPLACE:
				case VIEW:
				case PARENTA:
				case CADENA:
				case NUM:
				case IDF:
					{
					setState(373);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(376);
				match(PARENTC);
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				match(MIN);
				setState(378);
				match(PARENTA);
				setState(379);
				expr(0);
				setState(380);
				match(PARENTC);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				match(MAX);
				setState(383);
				match(PARENTA);
				setState(384);
				expr(0);
				setState(385);
				match(PARENTC);
				}
				break;
			case RANK:
				enterOuterAlt(_localctx, 6);
				{
				setState(387);
				match(RANK);
				setState(388);
				match(PARENTA);
				setState(389);
				expr(0);
				setState(390);
				match(PARENTC);
				}
				break;
			case RANDOM:
				enterOuterAlt(_localctx, 7);
				{
				setState(392);
				match(RANDOM);
				setState(393);
				match(PARENTA);
				setState(394);
				match(PARENTC);
				}
				break;
			case MD5:
				enterOuterAlt(_localctx, 8);
				{
				setState(395);
				match(MD5);
				setState(396);
				match(PARENTA);
				setState(397);
				expr(0);
				setState(398);
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
	public static class CreateContext extends ParserRuleContext {
		public Create_schemaContext create_schema() {
			return getRuleContext(Create_schemaContext.class,0);
		}
		public Create_databaseContext create_database() {
			return getRuleContext(Create_databaseContext.class,0);
		}
		public Create_userContext create_user() {
			return getRuleContext(Create_userContext.class,0);
		}
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Create_indexContext create_index() {
			return getRuleContext(Create_indexContext.class,0);
		}
		public Create_viewContext create_view() {
			return getRuleContext(Create_viewContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_create);
		try {
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				create_schema();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				create_database();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				create_user();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(405);
				create_table();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(406);
				create_index();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(407);
				create_view();
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
	public static class Create_schemaContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(ExprParser.SCHEMA, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public Create_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_schema; }
	}

	public final Create_schemaContext create_schema() throws RecognitionException {
		Create_schemaContext _localctx = new Create_schemaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_create_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(CREATE);
			setState(411);
			match(SCHEMA);
			setState(412);
			identi();
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
	public static class Create_databaseContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(ExprParser.DATABASE, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public Create_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database; }
	}

	public final Create_databaseContext create_database() throws RecognitionException {
		Create_databaseContext _localctx = new Create_databaseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_create_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(CREATE);
			setState(415);
			match(DATABASE);
			setState(416);
			identi();
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
	public static class Create_userContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode USER() { return getToken(ExprParser.USER, 0); }
		public TerminalNode ROLE() { return getToken(ExprParser.ROLE, 0); }
		public TerminalNode WITH() { return getToken(ExprParser.WITH, 0); }
		public TerminalNode PASSWORD() { return getToken(ExprParser.PASSWORD, 0); }
		public TerminalNode CADENA() { return getToken(ExprParser.CADENA, 0); }
		public Create_userContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_user; }
	}

	public final Create_userContext create_user() throws RecognitionException {
		Create_userContext _localctx = new Create_userContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_create_user);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(CREATE);
			setState(419);
			_la = _input.LA(1);
			if ( !(_la==USER || _la==ROLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(420);
			identi();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(421);
				match(WITH);
				}
			}

			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PASSWORD) {
				{
				setState(424);
				match(PASSWORD);
				setState(425);
				match(CADENA);
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
	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode PARENTA() { return getToken(ExprParser.PARENTA, 0); }
		public Lista_columnas_defContext lista_columnas_def() {
			return getRuleContext(Lista_columnas_defContext.class,0);
		}
		public TerminalNode PARENTC() { return getToken(ExprParser.PARENTC, 0); }
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_create_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(CREATE);
			setState(429);
			match(TABLE);
			setState(430);
			identi();
			setState(431);
			match(PARENTA);
			setState(432);
			lista_columnas_def();
			setState(433);
			match(PARENTC);
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
	public static class Create_viewContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(ExprParser.VIEW, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExprParser.AS, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public Create_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view; }
	}

	public final Create_viewContext create_view() throws RecognitionException {
		Create_viewContext _localctx = new Create_viewContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_create_view);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(CREATE);
			setState(436);
			match(VIEW);
			setState(437);
			identi();
			setState(438);
			match(AS);
			setState(439);
			select();
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
	public static class Restriccion_colContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ExprParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ExprParser.KEY, 0); }
		public TerminalNode NOT() { return getToken(ExprParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public TerminalNode NOTNULL() { return getToken(ExprParser.NOTNULL, 0); }
		public TerminalNode CHECK() { return getToken(ExprParser.CHECK, 0); }
		public TerminalNode PARENTA() { return getToken(ExprParser.PARENTA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENTC() { return getToken(ExprParser.PARENTC, 0); }
		public TerminalNode UNIQUE() { return getToken(ExprParser.UNIQUE, 0); }
		public TerminalNode DEFAULT() { return getToken(ExprParser.DEFAULT, 0); }
		public TerminalNode REFERENCES() { return getToken(ExprParser.REFERENCES, 0); }
		public List<IdentiContext> identi() {
			return getRuleContexts(IdentiContext.class);
		}
		public IdentiContext identi(int i) {
			return getRuleContext(IdentiContext.class,i);
		}
		public Restriccion_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restriccion_col; }
	}

	public final Restriccion_colContext restriccion_col() throws RecognitionException {
		Restriccion_colContext _localctx = new Restriccion_colContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_restriccion_col);
		int _la;
		try {
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(PRIMARY);
				setState(442);
				match(KEY);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				match(NOT);
				setState(444);
				match(NULL);
				}
				break;
			case NOTNULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				match(NOTNULL);
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				match(CHECK);
				setState(447);
				match(PARENTA);
				setState(448);
				expr(0);
				setState(449);
				match(PARENTC);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
				match(UNIQUE);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 6);
				{
				setState(452);
				match(DEFAULT);
				setState(453);
				expr(0);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 7);
				{
				setState(454);
				match(REFERENCES);
				setState(455);
				identi();
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(456);
					match(PARENTA);
					setState(457);
					identi();
					setState(458);
					match(PARENTC);
					}
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
	public static class Lista_identiContext extends ParserRuleContext {
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
		public Lista_identiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_identi; }
	}

	public final Lista_identiContext lista_identi() throws RecognitionException {
		Lista_identiContext _localctx = new Lista_identiContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lista_identi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			identi();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(465);
				match(COMA);
				setState(466);
				identi();
				}
				}
				setState(471);
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
	public static class Restricciones_tablaContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ExprParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ExprParser.KEY, 0); }
		public List<TerminalNode> PARENTA() { return getTokens(ExprParser.PARENTA); }
		public TerminalNode PARENTA(int i) {
			return getToken(ExprParser.PARENTA, i);
		}
		public List<Lista_identiContext> lista_identi() {
			return getRuleContexts(Lista_identiContext.class);
		}
		public Lista_identiContext lista_identi(int i) {
			return getRuleContext(Lista_identiContext.class,i);
		}
		public List<TerminalNode> PARENTC() { return getTokens(ExprParser.PARENTC); }
		public TerminalNode PARENTC(int i) {
			return getToken(ExprParser.PARENTC, i);
		}
		public TerminalNode CONSTRAINT() { return getToken(ExprParser.CONSTRAINT, 0); }
		public List<IdentiContext> identi() {
			return getRuleContexts(IdentiContext.class);
		}
		public IdentiContext identi(int i) {
			return getRuleContext(IdentiContext.class,i);
		}
		public TerminalNode FOREIGN() { return getToken(ExprParser.FOREIGN, 0); }
		public TerminalNode REFERENCES() { return getToken(ExprParser.REFERENCES, 0); }
		public TerminalNode UNIQUE() { return getToken(ExprParser.UNIQUE, 0); }
		public TerminalNode CHECK() { return getToken(ExprParser.CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Restricciones_tablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restricciones_tabla; }
	}

	public final Restricciones_tablaContext restricciones_tabla() throws RecognitionException {
		Restricciones_tablaContext _localctx = new Restricciones_tablaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_restricciones_tabla);
		int _la;
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(472);
					match(CONSTRAINT);
					setState(473);
					identi();
					}
				}

				setState(476);
				match(PRIMARY);
				setState(477);
				match(KEY);
				setState(478);
				match(PARENTA);
				setState(479);
				lista_identi();
				setState(480);
				match(PARENTC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(482);
					match(CONSTRAINT);
					setState(483);
					identi();
					}
				}

				setState(486);
				match(FOREIGN);
				setState(487);
				match(KEY);
				setState(488);
				match(PARENTA);
				setState(489);
				lista_identi();
				setState(490);
				match(PARENTC);
				setState(491);
				match(REFERENCES);
				setState(492);
				identi();
				setState(493);
				match(PARENTA);
				setState(494);
				lista_identi();
				setState(495);
				match(PARENTC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(497);
					match(CONSTRAINT);
					setState(498);
					identi();
					}
				}

				setState(501);
				match(UNIQUE);
				setState(502);
				match(PARENTA);
				setState(503);
				lista_identi();
				setState(504);
				match(PARENTC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(506);
					match(CONSTRAINT);
					setState(507);
					identi();
					}
				}

				setState(510);
				match(CHECK);
				setState(511);
				match(PARENTA);
				setState(512);
				expr(0);
				setState(513);
				match(PARENTC);
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
	public static class Elemento_tablaContext extends ParserRuleContext {
		public Columna_defContext columna_def() {
			return getRuleContext(Columna_defContext.class,0);
		}
		public Restricciones_tablaContext restricciones_tabla() {
			return getRuleContext(Restricciones_tablaContext.class,0);
		}
		public Elemento_tablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento_tabla; }
	}

	public final Elemento_tablaContext elemento_tabla() throws RecognitionException {
		Elemento_tablaContext _localctx = new Elemento_tablaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elemento_tabla);
		try {
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
			case DATABASE:
			case PASSWORD:
			case ADD:
			case DROP:
			case TYPE:
			case RENAME:
			case OWNER:
			case LOGIN:
			case NOLOGIN:
			case SUPERUSER:
			case NOSUPERUSER:
			case CREATEDB:
			case NOCREATEDB:
			case CREATEROLE:
			case NOCREATEROLE:
			case CASCADE:
			case RESTRICT:
			case IF:
			case EXISTS:
			case ROLE:
			case VALUES:
			case REVOKE:
			case PRIVILEGES:
			case REPLACE:
			case VIEW:
			case IDF:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				columna_def();
				}
				break;
			case CHECK:
			case PRIMARY:
			case FOREIGN:
			case UNIQUE:
			case CONSTRAINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				restricciones_tabla();
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
	public static class Lista_columnas_defContext extends ParserRuleContext {
		public List<Elemento_tablaContext> elemento_tabla() {
			return getRuleContexts(Elemento_tablaContext.class);
		}
		public Elemento_tablaContext elemento_tabla(int i) {
			return getRuleContext(Elemento_tablaContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public Lista_columnas_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_columnas_def; }
	}

	public final Lista_columnas_defContext lista_columnas_def() throws RecognitionException {
		Lista_columnas_defContext _localctx = new Lista_columnas_defContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lista_columnas_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			elemento_tabla();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(522);
				match(COMA);
				setState(523);
				elemento_tabla();
				}
				}
				setState(528);
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
	public static class Columna_defContext extends ParserRuleContext {
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public List<Restriccion_colContext> restriccion_col() {
			return getRuleContexts(Restriccion_colContext.class);
		}
		public Restriccion_colContext restriccion_col(int i) {
			return getRuleContext(Restriccion_colContext.class,i);
		}
		public Columna_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columna_def; }
	}

	public final Columna_defContext columna_def() throws RecognitionException {
		Columna_defContext _localctx = new Columna_defContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_columna_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			identi();
			setState(530);
			tipo_dato();
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 584430125088L) != 0)) {
				{
				{
				setState(531);
				restriccion_col();
				}
				}
				setState(536);
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
	public static class Create_indexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(ExprParser.INDEX, 0); }
		public List<IdentiContext> identi() {
			return getRuleContexts(IdentiContext.class);
		}
		public IdentiContext identi(int i) {
			return getRuleContext(IdentiContext.class,i);
		}
		public TerminalNode ON() { return getToken(ExprParser.ON, 0); }
		public TerminalNode PARENTA() { return getToken(ExprParser.PARENTA, 0); }
		public Lista_ordenamientoContext lista_ordenamiento() {
			return getRuleContext(Lista_ordenamientoContext.class,0);
		}
		public TerminalNode PARENTC() { return getToken(ExprParser.PARENTC, 0); }
		public TerminalNode UNIQUE() { return getToken(ExprParser.UNIQUE, 0); }
		public TerminalNode USING() { return getToken(ExprParser.USING, 0); }
		public Create_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index; }
	}

	public final Create_indexContext create_index() throws RecognitionException {
		Create_indexContext _localctx = new Create_indexContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_create_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(CREATE);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(538);
				match(UNIQUE);
				}
			}

			setState(541);
			match(INDEX);
			setState(542);
			identi();
			setState(543);
			match(ON);
			setState(544);
			identi();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(545);
				match(USING);
				setState(546);
				identi();
				}
			}

			setState(549);
			match(PARENTA);
			setState(550);
			lista_ordenamiento();
			setState(551);
			match(PARENTC);
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
	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(ExprParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(ExprParser.FROM, 0); }
		public Tabla_origenContext tabla_origen() {
			return getRuleContext(Tabla_origenContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(ExprParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(DELETE);
			setState(554);
			match(FROM);
			setState(555);
			tabla_origen();
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(556);
				match(WHERE);
				setState(557);
				expr(0);
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
	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(ExprParser.UPDATE, 0); }
		public Tabla_origenContext tabla_origen() {
			return getRuleContext(Tabla_origenContext.class,0);
		}
		public TerminalNode SET() { return getToken(ExprParser.SET, 0); }
		public List<Asignacion_updContext> asignacion_upd() {
			return getRuleContexts(Asignacion_updContext.class);
		}
		public Asignacion_updContext asignacion_upd(int i) {
			return getRuleContext(Asignacion_updContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public TerminalNode WHERE() { return getToken(ExprParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(UPDATE);
			setState(561);
			tabla_origen();
			setState(562);
			match(SET);
			setState(563);
			asignacion_upd();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(564);
				match(COMA);
				setState(565);
				asignacion_upd();
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(571);
				match(WHERE);
				setState(572);
				expr(0);
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
	public static class Asignacion_updContext extends ParserRuleContext {
		public Referencia_columnaContext referencia_columna() {
			return getRuleContext(Referencia_columnaContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(ExprParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Asignacion_updContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_upd; }
	}

	public final Asignacion_updContext asignacion_upd() throws RecognitionException {
		Asignacion_updContext _localctx = new Asignacion_updContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_asignacion_upd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			referencia_columna();
			setState(576);
			match(IGUAL);
			setState(577);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Alter_accionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ExprParser.ADD, 0); }
		public Columna_defContext columna_def() {
			return getRuleContext(Columna_defContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(ExprParser.COLUMN, 0); }
		public TerminalNode DROP() { return getToken(ExprParser.DROP, 0); }
		public List<IdentiContext> identi() {
			return getRuleContexts(IdentiContext.class);
		}
		public IdentiContext identi(int i) {
			return getRuleContext(IdentiContext.class,i);
		}
		public Restricciones_tablaContext restricciones_tabla() {
			return getRuleContext(Restricciones_tablaContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(ExprParser.CONSTRAINT, 0); }
		public TerminalNode ALTER() { return getToken(ExprParser.ALTER, 0); }
		public TerminalNode SET() { return getToken(ExprParser.SET, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(ExprParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ExprParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public TerminalNode RENAME() { return getToken(ExprParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(ExprParser.TO, 0); }
		public Alter_accionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_accion; }
	}

	public final Alter_accionContext alter_accion() throws RecognitionException {
		Alter_accionContext _localctx = new Alter_accionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_alter_accion);
		int _la;
		try {
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(ADD);
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(580);
					match(COLUMN);
					}
				}

				setState(583);
				columna_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				match(DROP);
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(585);
					match(COLUMN);
					}
				}

				setState(588);
				identi();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				match(ADD);
				setState(590);
				restricciones_tabla();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				match(DROP);
				setState(592);
				match(CONSTRAINT);
				setState(593);
				identi();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(594);
				match(ALTER);
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(595);
					match(COLUMN);
					}
				}

				setState(598);
				identi();
				setState(599);
				match(SET);
				setState(600);
				tipo_dato();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(602);
				match(ALTER);
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(603);
					match(COLUMN);
					}
				}

				setState(606);
				identi();
				setState(607);
				match(SET);
				setState(608);
				match(DEFAULT);
				setState(609);
				expr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(611);
				match(ALTER);
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(612);
					match(COLUMN);
					}
				}

				setState(615);
				identi();
				setState(616);
				match(DROP);
				setState(617);
				match(DEFAULT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(619);
				match(ALTER);
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(620);
					match(COLUMN);
					}
				}

				setState(623);
				identi();
				setState(624);
				_la = _input.LA(1);
				if ( !(_la==SET || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(625);
				match(NOT);
				setState(626);
				match(NULL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(628);
				match(RENAME);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(629);
					match(COLUMN);
					}
				}

				setState(632);
				identi();
				setState(633);
				match(TO);
				setState(634);
				identi();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(636);
				match(RENAME);
				setState(637);
				match(TO);
				setState(638);
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
	public static class AlterContext extends ParserRuleContext {
		public Alter_tableContext alter_table() {
			return getRuleContext(Alter_tableContext.class,0);
		}
		public Alter_schemaContext alter_schema() {
			return getRuleContext(Alter_schemaContext.class,0);
		}
		public Alter_databaseContext alter_database() {
			return getRuleContext(Alter_databaseContext.class,0);
		}
		public Alter_userContext alter_user() {
			return getRuleContext(Alter_userContext.class,0);
		}
		public Alter_indexContext alter_index() {
			return getRuleContext(Alter_indexContext.class,0);
		}
		public AlterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter; }
	}

	public final AlterContext alter() throws RecognitionException {
		AlterContext _localctx = new AlterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_alter);
		try {
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				alter_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				alter_schema();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(643);
				alter_database();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(644);
				alter_user();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(645);
				alter_index();
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
	public static class Alter_tableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(ExprParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public List<IdentiContext> identi() {
			return getRuleContexts(IdentiContext.class);
		}
		public IdentiContext identi(int i) {
			return getRuleContext(IdentiContext.class,i);
		}
		public List<Alter_accionContext> alter_accion() {
			return getRuleContexts(Alter_accionContext.class);
		}
		public Alter_accionContext alter_accion(int i) {
			return getRuleContext(Alter_accionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public TerminalNode RENAME() { return getToken(ExprParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(ExprParser.TO, 0); }
		public Alter_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table; }
	}

	public final Alter_tableContext alter_table() throws RecognitionException {
		Alter_tableContext _localctx = new Alter_tableContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_alter_table);
		int _la;
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				match(ALTER);
				setState(649);
				match(TABLE);
				setState(650);
				identi();
				setState(651);
				alter_accion();
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(652);
					match(COMA);
					setState(653);
					alter_accion();
					}
					}
					setState(658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				match(ALTER);
				setState(660);
				match(TABLE);
				setState(661);
				identi();
				setState(662);
				match(RENAME);
				setState(663);
				match(TO);
				setState(664);
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
	public static class Alter_schemaContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(ExprParser.ALTER, 0); }
		public TerminalNode SCHEMA() { return getToken(ExprParser.SCHEMA, 0); }
		public List<IdentiContext> identi() {
			return getRuleContexts(IdentiContext.class);
		}
		public IdentiContext identi(int i) {
			return getRuleContext(IdentiContext.class,i);
		}
		public TerminalNode RENAME() { return getToken(ExprParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(ExprParser.TO, 0); }
		public TerminalNode OWNER() { return getToken(ExprParser.OWNER, 0); }
		public Alter_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_schema; }
	}

	public final Alter_schemaContext alter_schema() throws RecognitionException {
		Alter_schemaContext _localctx = new Alter_schemaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_alter_schema);
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				match(ALTER);
				setState(669);
				match(SCHEMA);
				setState(670);
				identi();
				setState(671);
				match(RENAME);
				setState(672);
				match(TO);
				setState(673);
				identi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				match(ALTER);
				setState(676);
				match(SCHEMA);
				setState(677);
				identi();
				setState(678);
				match(OWNER);
				setState(679);
				match(TO);
				setState(680);
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
	public static class Alter_databaseContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(ExprParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(ExprParser.DATABASE, 0); }
		public List<IdentiContext> identi() {
			return getRuleContexts(IdentiContext.class);
		}
		public IdentiContext identi(int i) {
			return getRuleContext(IdentiContext.class,i);
		}
		public TerminalNode RENAME() { return getToken(ExprParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(ExprParser.TO, 0); }
		public TerminalNode OWNER() { return getToken(ExprParser.OWNER, 0); }
		public Alter_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database; }
	}

	public final Alter_databaseContext alter_database() throws RecognitionException {
		Alter_databaseContext _localctx = new Alter_databaseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_alter_database);
		try {
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				match(ALTER);
				setState(685);
				match(DATABASE);
				setState(686);
				identi();
				setState(687);
				match(RENAME);
				setState(688);
				match(TO);
				setState(689);
				identi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				match(ALTER);
				setState(692);
				match(DATABASE);
				setState(693);
				identi();
				setState(694);
				match(OWNER);
				setState(695);
				match(TO);
				setState(696);
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
	public static class Opcion_usuarioContext extends ParserRuleContext {
		public TerminalNode LOGIN() { return getToken(ExprParser.LOGIN, 0); }
		public TerminalNode NOLOGIN() { return getToken(ExprParser.NOLOGIN, 0); }
		public TerminalNode SUPERUSER() { return getToken(ExprParser.SUPERUSER, 0); }
		public TerminalNode NOSUPERUSER() { return getToken(ExprParser.NOSUPERUSER, 0); }
		public TerminalNode CREATEDB() { return getToken(ExprParser.CREATEDB, 0); }
		public TerminalNode NOCREATEDB() { return getToken(ExprParser.NOCREATEDB, 0); }
		public TerminalNode CREATEROLE() { return getToken(ExprParser.CREATEROLE, 0); }
		public TerminalNode NOCREATEROLE() { return getToken(ExprParser.NOCREATEROLE, 0); }
		public Opcion_usuarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcion_usuario; }
	}

	public final Opcion_usuarioContext opcion_usuario() throws RecognitionException {
		Opcion_usuarioContext _localctx = new Opcion_usuarioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_opcion_usuario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_la = _input.LA(1);
			if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 255L) != 0)) ) {
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
	public static class Alter_userContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(ExprParser.ALTER, 0); }
		public List<IdentiContext> identi() {
			return getRuleContexts(IdentiContext.class);
		}
		public IdentiContext identi(int i) {
			return getRuleContext(IdentiContext.class,i);
		}
		public TerminalNode RENAME() { return getToken(ExprParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(ExprParser.TO, 0); }
		public TerminalNode USER() { return getToken(ExprParser.USER, 0); }
		public TerminalNode ROLE() { return getToken(ExprParser.ROLE, 0); }
		public TerminalNode PASSWORD() { return getToken(ExprParser.PASSWORD, 0); }
		public TerminalNode CADENA() { return getToken(ExprParser.CADENA, 0); }
		public TerminalNode WITH() { return getToken(ExprParser.WITH, 0); }
		public List<Opcion_usuarioContext> opcion_usuario() {
			return getRuleContexts(Opcion_usuarioContext.class);
		}
		public Opcion_usuarioContext opcion_usuario(int i) {
			return getRuleContext(Opcion_usuarioContext.class,i);
		}
		public Alter_userContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_user; }
	}

	public final Alter_userContext alter_user() throws RecognitionException {
		Alter_userContext _localctx = new Alter_userContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_alter_user);
		int _la;
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				match(ALTER);
				setState(703);
				_la = _input.LA(1);
				if ( !(_la==USER || _la==ROLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(704);
				identi();
				setState(705);
				match(RENAME);
				setState(706);
				match(TO);
				setState(707);
				identi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				match(ALTER);
				setState(710);
				_la = _input.LA(1);
				if ( !(_la==USER || _la==ROLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(711);
				identi();
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(712);
					match(WITH);
					}
				}

				setState(715);
				match(PASSWORD);
				setState(716);
				match(CADENA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(718);
				match(ALTER);
				setState(719);
				_la = _input.LA(1);
				if ( !(_la==USER || _la==ROLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(720);
				identi();
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(721);
					match(WITH);
					}
				}

				setState(725); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(724);
					opcion_usuario();
					}
					}
					setState(727); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 255L) != 0) );
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
	public static class Alter_indexContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(ExprParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(ExprParser.INDEX, 0); }
		public List<IdentiContext> identi() {
			return getRuleContexts(IdentiContext.class);
		}
		public IdentiContext identi(int i) {
			return getRuleContext(IdentiContext.class,i);
		}
		public TerminalNode RENAME() { return getToken(ExprParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(ExprParser.TO, 0); }
		public Alter_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_index; }
	}

	public final Alter_indexContext alter_index() throws RecognitionException {
		Alter_indexContext _localctx = new Alter_indexContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_alter_index);
		try {
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				match(ALTER);
				setState(732);
				match(INDEX);
				setState(733);
				identi();
				setState(734);
				match(RENAME);
				setState(735);
				match(TO);
				setState(736);
				identi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				match(ALTER);
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
	public static class DropContext extends ParserRuleContext {
		public Drop_tableContext drop_table() {
			return getRuleContext(Drop_tableContext.class,0);
		}
		public Drop_schemaContext drop_schema() {
			return getRuleContext(Drop_schemaContext.class,0);
		}
		public Drop_userContext drop_user() {
			return getRuleContext(Drop_userContext.class,0);
		}
		public Drop_databaseContext drop_database() {
			return getRuleContext(Drop_databaseContext.class,0);
		}
		public Drop_indexContext drop_index() {
			return getRuleContext(Drop_indexContext.class,0);
		}
		public Drop_viewContext drop_view() {
			return getRuleContext(Drop_viewContext.class,0);
		}
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop; }
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_drop);
		try {
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(741);
				drop_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
				drop_schema();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(743);
				drop_user();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(744);
				drop_database();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(745);
				drop_index();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(746);
				drop_view();
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
	public static class Drop_tableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ExprParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public Lista_identiContext lista_identi() {
			return getRuleContext(Lista_identiContext.class,0);
		}
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExprParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(ExprParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(ExprParser.RESTRICT, 0); }
		public Drop_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table; }
	}

	public final Drop_tableContext drop_table() throws RecognitionException {
		Drop_tableContext _localctx = new Drop_tableContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_drop_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(DROP);
			setState(750);
			match(TABLE);
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(751);
				match(IF);
				setState(752);
				match(EXISTS);
				}
				break;
			}
			setState(755);
			lista_identi();
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(756);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
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
	public static class Drop_schemaContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ExprParser.DROP, 0); }
		public TerminalNode SCHEMA() { return getToken(ExprParser.SCHEMA, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExprParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(ExprParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(ExprParser.RESTRICT, 0); }
		public Drop_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_schema; }
	}

	public final Drop_schemaContext drop_schema() throws RecognitionException {
		Drop_schemaContext _localctx = new Drop_schemaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_drop_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(DROP);
			setState(760);
			match(SCHEMA);
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(761);
				match(IF);
				setState(762);
				match(EXISTS);
				}
				break;
			}
			setState(765);
			identi();
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(766);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
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
	public static class Drop_databaseContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ExprParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(ExprParser.DATABASE, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExprParser.EXISTS, 0); }
		public Drop_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_database; }
	}

	public final Drop_databaseContext drop_database() throws RecognitionException {
		Drop_databaseContext _localctx = new Drop_databaseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_drop_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(DROP);
			setState(770);
			match(DATABASE);
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(771);
				match(IF);
				setState(772);
				match(EXISTS);
				}
				break;
			}
			setState(775);
			identi();
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
	public static class Drop_userContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ExprParser.DROP, 0); }
		public Lista_identiContext lista_identi() {
			return getRuleContext(Lista_identiContext.class,0);
		}
		public TerminalNode USER() { return getToken(ExprParser.USER, 0); }
		public TerminalNode ROLE() { return getToken(ExprParser.ROLE, 0); }
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExprParser.EXISTS, 0); }
		public Drop_userContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_user; }
	}

	public final Drop_userContext drop_user() throws RecognitionException {
		Drop_userContext _localctx = new Drop_userContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_drop_user);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(DROP);
			setState(778);
			_la = _input.LA(1);
			if ( !(_la==USER || _la==ROLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(779);
				match(IF);
				setState(780);
				match(EXISTS);
				}
				break;
			}
			setState(783);
			lista_identi();
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
	public static class Drop_indexContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ExprParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(ExprParser.INDEX, 0); }
		public Lista_identiContext lista_identi() {
			return getRuleContext(Lista_identiContext.class,0);
		}
		public TerminalNode CASCADE() { return getToken(ExprParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(ExprParser.RESTRICT, 0); }
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExprParser.EXISTS, 0); }
		public Drop_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index; }
	}

	public final Drop_indexContext drop_index() throws RecognitionException {
		Drop_indexContext _localctx = new Drop_indexContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_drop_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(DROP);
			setState(786);
			match(INDEX);
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(787);
				match(IF);
				setState(788);
				match(EXISTS);
				}
				break;
			}
			setState(791);
			lista_identi();
			setState(792);
			_la = _input.LA(1);
			if ( !(_la==CASCADE || _la==RESTRICT) ) {
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
	public static class Drop_viewContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ExprParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(ExprParser.VIEW, 0); }
		public Lista_identiContext lista_identi() {
			return getRuleContext(Lista_identiContext.class,0);
		}
		public TerminalNode CASCADE() { return getToken(ExprParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(ExprParser.RESTRICT, 0); }
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExprParser.EXISTS, 0); }
		public Drop_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view; }
	}

	public final Drop_viewContext drop_view() throws RecognitionException {
		Drop_viewContext _localctx = new Drop_viewContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_drop_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(DROP);
			setState(795);
			match(VIEW);
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(796);
				match(IF);
				setState(797);
				match(EXISTS);
				}
				break;
			}
			setState(800);
			lista_identi();
			setState(801);
			_la = _input.LA(1);
			if ( !(_la==CASCADE || _la==RESTRICT) ) {
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
	public static class Valores_filaContext extends ParserRuleContext {
		public TerminalNode PARENTA() { return getToken(ExprParser.PARENTA, 0); }
		public Lista_expresionesContext lista_expresiones() {
			return getRuleContext(Lista_expresionesContext.class,0);
		}
		public TerminalNode PARENTC() { return getToken(ExprParser.PARENTC, 0); }
		public Valores_filaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores_fila; }
	}

	public final Valores_filaContext valores_fila() throws RecognitionException {
		Valores_filaContext _localctx = new Valores_filaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_valores_fila);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(PARENTA);
			setState(804);
			lista_expresiones();
			setState(805);
			match(PARENTC);
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
	public static class InsertContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ExprParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(ExprParser.INTO, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(ExprParser.VALUES, 0); }
		public List<Valores_filaContext> valores_fila() {
			return getRuleContexts(Valores_filaContext.class);
		}
		public Valores_filaContext valores_fila(int i) {
			return getRuleContext(Valores_filaContext.class,i);
		}
		public TerminalNode PARENTA() { return getToken(ExprParser.PARENTA, 0); }
		public Lista_identiContext lista_identi() {
			return getRuleContext(Lista_identiContext.class,0);
		}
		public TerminalNode PARENTC() { return getToken(ExprParser.PARENTC, 0); }
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(INSERT);
			setState(808);
			match(INTO);
			setState(809);
			identi();
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTA) {
				{
				setState(810);
				match(PARENTA);
				setState(811);
				lista_identi();
				setState(812);
				match(PARENTC);
				}
			}

			setState(816);
			match(VALUES);
			setState(817);
			valores_fila();
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(818);
				match(COMA);
				setState(819);
				valores_fila();
				}
				}
				setState(824);
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
	public static class PrivilegiosContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ExprParser.INSERT, 0); }
		public TerminalNode DELETE() { return getToken(ExprParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(ExprParser.UPDATE, 0); }
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode ALL() { return getToken(ExprParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(ExprParser.PRIVILEGES, 0); }
		public PrivilegiosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegios; }
	}

	public final PrivilegiosContext privilegios() throws RecognitionException {
		PrivilegiosContext _localctx = new PrivilegiosContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_privilegios);
		int _la;
		try {
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(825);
				match(INSERT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(826);
				match(DELETE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(827);
				match(UPDATE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(828);
				match(CREATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(829);
				match(INSERT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(830);
				match(ALL);
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(831);
					match(PRIVILEGES);
					}
				}

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
	public static class Lista_previContext extends ParserRuleContext {
		public List<PrivilegiosContext> privilegios() {
			return getRuleContexts(PrivilegiosContext.class);
		}
		public PrivilegiosContext privilegios(int i) {
			return getRuleContext(PrivilegiosContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public Lista_previContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_previ; }
	}

	public final Lista_previContext lista_previ() throws RecognitionException {
		Lista_previContext _localctx = new Lista_previContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_lista_previ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			privilegios();
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(837);
				match(COMA);
				setState(838);
				privilegios();
				}
				}
				setState(843);
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
	public static class GrantContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(ExprParser.GRANT, 0); }
		public Lista_previContext lista_previ() {
			return getRuleContext(Lista_previContext.class,0);
		}
		public TerminalNode ON() { return getToken(ExprParser.ON, 0); }
		public List<IdentiContext> identi() {
			return getRuleContexts(IdentiContext.class);
		}
		public IdentiContext identi(int i) {
			return getRuleContext(IdentiContext.class,i);
		}
		public TerminalNode TO() { return getToken(ExprParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_grant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(GRANT);
			setState(845);
			lista_previ();
			setState(846);
			match(ON);
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(847);
				match(TABLE);
				}
			}

			setState(850);
			identi();
			setState(851);
			match(TO);
			setState(852);
			identi();
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
	public static class RevokeContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(ExprParser.REVOKE, 0); }
		public Lista_previContext lista_previ() {
			return getRuleContext(Lista_previContext.class,0);
		}
		public TerminalNode ON() { return getToken(ExprParser.ON, 0); }
		public List<IdentiContext> identi() {
			return getRuleContexts(IdentiContext.class);
		}
		public IdentiContext identi(int i) {
			return getRuleContext(IdentiContext.class,i);
		}
		public TerminalNode TO() { return getToken(ExprParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_revoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(REVOKE);
			setState(855);
			lista_previ();
			setState(856);
			match(ON);
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(857);
				match(TABLE);
				}
			}

			setState(860);
			identi();
			setState(861);
			match(TO);
			setState(862);
			identi();
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
	public static class TransaccionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ExprParser.BEGIN, 0); }
		public TerminalNode TRANSACTION() { return getToken(ExprParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(ExprParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(ExprParser.ROLLBACK, 0); }
		public TransaccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaccion; }
	}

	public final TransaccionContext transaccion() throws RecognitionException {
		TransaccionContext _localctx = new TransaccionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_transaccion);
		int _la;
		try {
			setState(876);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(864);
				match(BEGIN);
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSACTION) {
					{
					setState(865);
					match(TRANSACTION);
					}
				}

				}
				break;
			case COMMIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(868);
				match(COMMIT);
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSACTION) {
					{
					setState(869);
					match(TRANSACTION);
					}
				}

				}
				break;
			case ROLLBACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(872);
				match(ROLLBACK);
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSACTION) {
					{
					setState(873);
					match(TRANSACTION);
					}
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
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(879);
				match(PARENTA);
				setState(880);
				expr(0);
				setState(881);
				match(PARENTC);
				}
				break;
			case 2:
				{
				setState(883);
				match(NOT);
				setState(884);
				expr(15);
				}
				break;
			case 3:
				{
				setState(885);
				match(PARENTA);
				setState(886);
				select();
				setState(887);
				match(PARENTC);
				}
				break;
			case 4:
				{
				setState(889);
				funciones_agg();
				}
				break;
			case 5:
				{
				setState(890);
				referencia_columna();
				}
				break;
			case 6:
				{
				setState(891);
				match(NUM);
				}
				break;
			case 7:
				{
				setState(892);
				match(CADENA);
				}
				break;
			case 8:
				{
				setState(893);
				match(TRUE);
				}
				break;
			case 9:
				{
				setState(894);
				match(FALSE);
				}
				break;
			case 10:
				{
				setState(895);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(918);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(916);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(898);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(899);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLICACION || _la==DIVISION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(900);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(901);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(902);
						match(SUMA);
						setState(903);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(904);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(905);
						match(RESTA);
						setState(906);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(907);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(908);
						_la = _input.LA(1);
						if ( !(_la==LIKE || _la==ILIKE || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & 491521L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(909);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(910);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(911);
						match(AND);
						setState(912);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(913);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(914);
						match(OR);
						setState(915);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(920);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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
		case 54:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0093\u039a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u0001\u0000\u0004\u0000p\b\u0000\u000b\u0000\f\u0000q\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002~\b\u0002\u0001\u0002\u0003"+
		"\u0002\u0081\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0088\b\u0002\u0001\u0002\u0003\u0002\u008b\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0091\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0097\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u009e\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00a9\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00af\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00b5\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00c1\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00c5\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00e8\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00ee\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00f2\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00f7\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00fb\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0100\b\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0104\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0109"+
		"\b\u0006\n\u0006\f\u0006\u010c\t\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0110\b\u0007\u0001\u0007\u0003\u0007\u0113\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0119\b\u0007\u0001\u0007\u0003"+
		"\u0007\u011c\b\u0007\u0003\u0007\u011e\b\u0007\u0001\b\u0003\b\u0121\b"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u012a"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0134\b\b\u0001\t\u0001\t\u0005\t\u0138\b\t\n\t\f\t\u013b\t\t\u0001"+
		"\n\u0001\n\u0003\n\u013f\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0144\b\u000b\n\u000b\f\u000b\u0147\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u014d\b\f\n\f\f\f\u0150\t\f\u0003\f\u0152\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u0157\b\r\n\r\f\r\u015a\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0167\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0177\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0191\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0199\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u01a7\b\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u01ab\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01cd\b\u0016\u0003"+
		"\u0016\u01cf\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01d4"+
		"\b\u0017\n\u0017\f\u0017\u01d7\t\u0017\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u01db\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01e5\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u01f4\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01fd\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0204\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0208\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u020d\b\u001a\n\u001a\f\u001a\u0210\t\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0215\b\u001b\n\u001b\f\u001b"+
		"\u0218\t\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u021c\b\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u0224\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u022f"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0005\u001e\u0237\b\u001e\n\u001e\f\u001e\u023a\t\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u023e\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0003 \u0246\b \u0001 \u0001 \u0001 \u0003"+
		" \u024b\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u0255\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u025d\b \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0266\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u026e\b \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u0277\b \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u0280\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0003"+
		"!\u0287\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u028f"+
		"\b\"\n\"\f\"\u0292\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0003\"\u029b\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u02ab\b#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u02bb\b$\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02ca"+
		"\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02d3\b&\u0001"+
		"&\u0004&\u02d6\b&\u000b&\f&\u02d7\u0003&\u02da\b&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u02e4\b\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u02ec\b(\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u02f2\b)\u0001)\u0001)\u0003)\u02f6\b)\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u02fc\b*\u0001*\u0001*\u0003*\u0300\b*\u0001+\u0001+\u0001+\u0001"+
		"+\u0003+\u0306\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0003,\u030e"+
		"\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0003-\u0316\b-\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0003.\u031f\b.\u0001.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00030\u032f\b0\u00010\u00010\u00010\u00010\u00050\u0335\b0\n"+
		"0\f0\u0338\t0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00031"+
		"\u0341\b1\u00031\u0343\b1\u00012\u00012\u00012\u00052\u0348\b2\n2\f2\u034b"+
		"\t2\u00013\u00013\u00013\u00013\u00033\u0351\b3\u00013\u00013\u00013\u0001"+
		"3\u00014\u00014\u00014\u00014\u00034\u035b\b4\u00014\u00014\u00014\u0001"+
		"4\u00015\u00015\u00035\u0363\b5\u00015\u00015\u00035\u0367\b5\u00015\u0001"+
		"5\u00035\u036b\b5\u00035\u036d\b5\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00036\u0381\b6\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00056\u0395\b6\n6\f6\u0398\t6\u00016\u0000\u0001l7\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjl\u0000\t\u0002\u0000/s"+
		"uv\u0002\u0000\u000f\u0010**\u0001\u0000\t\n\u0002\u0000\u0014\u0014p"+
		"p\u0002\u000011``\u0001\u0000dk\u0001\u0000lm\u0001\u0000yz\u0003\u0000"+
		"\u0007\b{{\u008a\u008d\u0417\u0000o\u0001\u0000\u0000\u0000\u0002u\u0001"+
		"\u0000\u0000\u0000\u0004\u00c0\u0001\u0000\u0000\u0000\u0006\u00c4\u0001"+
		"\u0000\u0000\u0000\b\u00e7\u0001\u0000\u0000\u0000\n\u00e9\u0001\u0000"+
		"\u0000\u0000\f\u0105\u0001\u0000\u0000\u0000\u000e\u011d\u0001\u0000\u0000"+
		"\u0000\u0010\u0133\u0001\u0000\u0000\u0000\u0012\u0135\u0001\u0000\u0000"+
		"\u0000\u0014\u013c\u0001\u0000\u0000\u0000\u0016\u0140\u0001\u0000\u0000"+
		"\u0000\u0018\u0151\u0001\u0000\u0000\u0000\u001a\u0153\u0001\u0000\u0000"+
		"\u0000\u001c\u0166\u0001\u0000\u0000\u0000\u001e\u0190\u0001\u0000\u0000"+
		"\u0000 \u0198\u0001\u0000\u0000\u0000\"\u019a\u0001\u0000\u0000\u0000"+
		"$\u019e\u0001\u0000\u0000\u0000&\u01a2\u0001\u0000\u0000\u0000(\u01ac"+
		"\u0001\u0000\u0000\u0000*\u01b3\u0001\u0000\u0000\u0000,\u01ce\u0001\u0000"+
		"\u0000\u0000.\u01d0\u0001\u0000\u0000\u00000\u0203\u0001\u0000\u0000\u0000"+
		"2\u0207\u0001\u0000\u0000\u00004\u0209\u0001\u0000\u0000\u00006\u0211"+
		"\u0001\u0000\u0000\u00008\u0219\u0001\u0000\u0000\u0000:\u0229\u0001\u0000"+
		"\u0000\u0000<\u0230\u0001\u0000\u0000\u0000>\u023f\u0001\u0000\u0000\u0000"+
		"@\u027f\u0001\u0000\u0000\u0000B\u0286\u0001\u0000\u0000\u0000D\u029a"+
		"\u0001\u0000\u0000\u0000F\u02aa\u0001\u0000\u0000\u0000H\u02ba\u0001\u0000"+
		"\u0000\u0000J\u02bc\u0001\u0000\u0000\u0000L\u02d9\u0001\u0000\u0000\u0000"+
		"N\u02e3\u0001\u0000\u0000\u0000P\u02eb\u0001\u0000\u0000\u0000R\u02ed"+
		"\u0001\u0000\u0000\u0000T\u02f7\u0001\u0000\u0000\u0000V\u0301\u0001\u0000"+
		"\u0000\u0000X\u0309\u0001\u0000\u0000\u0000Z\u0311\u0001\u0000\u0000\u0000"+
		"\\\u031a\u0001\u0000\u0000\u0000^\u0323\u0001\u0000\u0000\u0000`\u0327"+
		"\u0001\u0000\u0000\u0000b\u0342\u0001\u0000\u0000\u0000d\u0344\u0001\u0000"+
		"\u0000\u0000f\u034c\u0001\u0000\u0000\u0000h\u0356\u0001\u0000\u0000\u0000"+
		"j\u036c\u0001\u0000\u0000\u0000l\u0380\u0001\u0000\u0000\u0000np\u0003"+
		"\b\u0004\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"st\u0005\u0000\u0000\u0001t\u0001\u0001\u0000\u0000\u0000uv\u0007\u0000"+
		"\u0000\u0000v\u0003\u0001\u0000\u0000\u0000w\u00c1\u00054\u0000\u0000"+
		"x\u0080\u00055\u0000\u0000yz\u0005~\u0000\u0000z}\u0005\u008f\u0000\u0000"+
		"{|\u0005|\u0000\u0000|~\u0005\u008f\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081"+
		"\u0005\u007f\u0000\u0000\u0080y\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u00c1\u0001\u0000\u0000\u0000\u0082\u008a\u0005"+
		"6\u0000\u0000\u0083\u0084\u0005~\u0000\u0000\u0084\u0087\u0005\u008f\u0000"+
		"\u0000\u0085\u0086\u0005|\u0000\u0000\u0086\u0088\u0005\u008f\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0005\u007f\u0000\u0000"+
		"\u008a\u0083\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u00c1\u0001\u0000\u0000\u0000\u008c\u0090\u00057\u0000\u0000\u008d"+
		"\u008e\u0005~\u0000\u0000\u008e\u008f\u0005\u008f\u0000\u0000\u008f\u0091"+
		"\u0005\u007f\u0000\u0000\u0090\u008d\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u00c1\u0001\u0000\u0000\u0000\u0092\u0096"+
		"\u00058\u0000\u0000\u0093\u0094\u0005~\u0000\u0000\u0094\u0095\u0005\u008f"+
		"\u0000\u0000\u0095\u0097\u0005\u007f\u0000\u0000\u0096\u0093\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u00c1\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0005W\u0000\u0000\u0099\u009d\u0005X\u0000\u0000"+
		"\u009a\u009b\u0005~\u0000\u0000\u009b\u009c\u0005\u008f\u0000\u0000\u009c"+
		"\u009e\u0005\u007f\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u00c1\u0001\u0000\u0000\u0000\u009f"+
		"\u00c1\u00059\u0000\u0000\u00a0\u00c1\u0005:\u0000\u0000\u00a1\u00c1\u0005"+
		";\u0000\u0000\u00a2\u00c1\u0005<\u0000\u0000\u00a3\u00c1\u0005>\u0000"+
		"\u0000\u00a4\u00a8\u0005?\u0000\u0000\u00a5\u00a6\u0005~\u0000\u0000\u00a6"+
		"\u00a7\u0005\u008f\u0000\u0000\u00a7\u00a9\u0005\u007f\u0000\u0000\u00a8"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00c1\u0001\u0000\u0000\u0000\u00aa\u00ae\u0005@\u0000\u0000\u00ab\u00ac"+
		"\u0005~\u0000\u0000\u00ac\u00ad\u0005\u008f\u0000\u0000\u00ad\u00af\u0005"+
		"\u007f\u0000\u0000\u00ae\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00c1\u0001\u0000\u0000\u0000\u00b0\u00b4\u0005"+
		"A\u0000\u0000\u00b1\u00b2\u0005~\u0000\u0000\u00b2\u00b3\u0005\u008f\u0000"+
		"\u0000\u00b3\u00b5\u0005\u007f\u0000\u0000\u00b4\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00c1\u0001\u0000\u0000"+
		"\u0000\u00b6\u00c1\u0005B\u0000\u0000\u00b7\u00c1\u0005C\u0000\u0000\u00b8"+
		"\u00c1\u0005D\u0000\u0000\u00b9\u00c1\u0005E\u0000\u0000\u00ba\u00c1\u0005"+
		"F\u0000\u0000\u00bb\u00c1\u0005G\u0000\u0000\u00bc\u00c1\u0005H\u0000"+
		"\u0000\u00bd\u00c1\u0005I\u0000\u0000\u00be\u00c1\u0005J\u0000\u0000\u00bf"+
		"\u00c1\u0005K\u0000\u0000\u00c0w\u0001\u0000\u0000\u0000\u00c0x\u0001"+
		"\u0000\u0000\u0000\u00c0\u0082\u0001\u0000\u0000\u0000\u00c0\u008c\u0001"+
		"\u0000\u0000\u0000\u00c0\u0092\u0001\u0000\u0000\u0000\u00c0\u0098\u0001"+
		"\u0000\u0000\u0000\u00c0\u009f\u0001\u0000\u0000\u0000\u00c0\u00a0\u0001"+
		"\u0000\u0000\u0000\u00c0\u00a1\u0001\u0000\u0000\u0000\u00c0\u00a2\u0001"+
		"\u0000\u0000\u0000\u00c0\u00a3\u0001\u0000\u0000\u0000\u00c0\u00a4\u0001"+
		"\u0000\u0000\u0000\u00c0\u00aa\u0001\u0000\u0000\u0000\u00c0\u00b0\u0001"+
		"\u0000\u0000\u0000\u00c0\u00b6\u0001\u0000\u0000\u0000\u00c0\u00b7\u0001"+
		"\u0000\u0000\u0000\u00c0\u00b8\u0001\u0000\u0000\u0000\u00c0\u00b9\u0001"+
		"\u0000\u0000\u0000\u00c0\u00ba\u0001\u0000\u0000\u0000\u00c0\u00bb\u0001"+
		"\u0000\u0000\u0000\u00c0\u00bc\u0001\u0000\u0000\u0000\u00c0\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u0005\u0001\u0000\u0000\u0000\u00c2\u00c5\u0005"+
		"\u0090\u0000\u0000\u00c3\u00c5\u0003\u0002\u0001\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u0007\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0003\n\u0005\u0000\u00c7\u00c8\u0005\u0080"+
		"\u0000\u0000\u00c8\u00e8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003 \u0010"+
		"\u0000\u00ca\u00cb\u0005\u0080\u0000\u0000\u00cb\u00e8\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0003l6\u0000\u00cd\u00ce\u0005\u0080\u0000\u0000\u00ce"+
		"\u00e8\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003:\u001d\u0000\u00d0\u00d1"+
		"\u0005\u0080\u0000\u0000\u00d1\u00e8\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0003<\u001e\u0000\u00d3\u00d4\u0005\u0080\u0000\u0000\u00d4\u00e8\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0003B!\u0000\u00d6\u00d7\u0005\u0080\u0000"+
		"\u0000\u00d7\u00e8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003P(\u0000\u00d9"+
		"\u00da\u0005\u0080\u0000\u0000\u00da\u00e8\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0003`0\u0000\u00dc\u00dd\u0005\u0080\u0000\u0000\u00dd\u00e8\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0003f3\u0000\u00df\u00e0\u0005\u0080\u0000"+
		"\u0000\u00e0\u00e8\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003h4\u0000\u00e2"+
		"\u00e3\u0005\u0080\u0000\u0000\u00e3\u00e8\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0003j5\u0000\u00e5\u00e6\u0005\u0080\u0000\u0000\u00e6\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e7\u00c6\u0001\u0000\u0000\u0000\u00e7\u00c9\u0001"+
		"\u0000\u0000\u0000\u00e7\u00cc\u0001\u0000\u0000\u0000\u00e7\u00cf\u0001"+
		"\u0000\u0000\u0000\u00e7\u00d2\u0001\u0000\u0000\u0000\u00e7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00d8\u0001\u0000\u0000\u0000\u00e7\u00db\u0001"+
		"\u0000\u0000\u0000\u00e7\u00de\u0001\u0000\u0000\u0000\u00e7\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e8\t\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0005\u0001\u0000\u0000\u00ea\u00ed\u0003\u0018"+
		"\f\u0000\u00eb\u00ec\u0005\u0002\u0000\u0000\u00ec\u00ee\u0003\u001a\r"+
		"\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u0004\u0000"+
		"\u0000\u00f0\u00f2\u0003l6\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f6\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0005\u0006\u0000\u0000\u00f4\u00f5\u0005/\u0000\u0000\u00f5\u00f7"+
		"\u0003\f\u0006\u0000\u00f6\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005"+
		"\u001a\u0000\u0000\u00f9\u00fb\u0003l6\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00ff\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0005\r\u0000\u0000\u00fd\u00fe\u0005/\u0000\u0000"+
		"\u00fe\u0100\u0003\u0016\u000b\u0000\u00ff\u00fc\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0005\u0011\u0000\u0000\u0102\u0104\u0005\u008f\u0000\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104\u000b\u0001\u0000\u0000\u0000\u0105\u010a\u0003l6\u0000\u0106\u0107"+
		"\u0005|\u0000\u0000\u0107\u0109\u0003l6\u0000\u0108\u0106\u0001\u0000"+
		"\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\r\u0001\u0000\u0000"+
		"\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u0112\u0003\u0006\u0003"+
		"\u0000\u010e\u0110\u0005)\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000"+
		"\u0111\u0113\u0003\u0006\u0003\u0000\u0112\u010f\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u011e\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0005~\u0000\u0000\u0115\u0116\u0003\n\u0005\u0000\u0116"+
		"\u011b\u0005\u007f\u0000\u0000\u0117\u0119\u0005)\u0000\u0000\u0118\u0117"+
		"\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0001\u0000\u0000\u0000\u011a\u011c\u0003\u0006\u0003\u0000\u011b\u0118"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011e"+
		"\u0001\u0000\u0000\u0000\u011d\u010d\u0001\u0000\u0000\u0000\u011d\u0114"+
		"\u0001\u0000\u0000\u0000\u011e\u000f\u0001\u0000\u0000\u0000\u011f\u0121"+
		"\u0005\u0013\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0005\u000e\u0000\u0000\u0123\u0124\u0003\u000e\u0007\u0000\u0124\u0125"+
		"\u0005\u0012\u0000\u0000\u0125\u0126\u0003l6\u0000\u0126\u0134\u0001\u0000"+
		"\u0000\u0000\u0127\u0129\u0007\u0001\u0000\u0000\u0128\u012a\u0005\u0018"+
		"\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u000e"+
		"\u0000\u0000\u012c\u012d\u0003\u000e\u0007\u0000\u012d\u012e\u0005\u0012"+
		"\u0000\u0000\u012e\u012f\u0003l6\u0000\u012f\u0134\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0005+\u0000\u0000\u0131\u0132\u0005\u000e\u0000\u0000\u0132"+
		"\u0134\u0003\u000e\u0007\u0000\u0133\u0120\u0001\u0000\u0000\u0000\u0133"+
		"\u0127\u0001\u0000\u0000\u0000\u0133\u0130\u0001\u0000\u0000\u0000\u0134"+
		"\u0011\u0001\u0000\u0000\u0000\u0135\u0139\u0003\u000e\u0007\u0000\u0136"+
		"\u0138\u0003\u0010\b\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u013b"+
		"\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0001\u0000\u0000\u0000\u013a\u0013\u0001\u0000\u0000\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013c\u013e\u0003l6\u0000\u013d\u013f\u0007\u0002"+
		"\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000"+
		"\u0000\u0000\u013f\u0015\u0001\u0000\u0000\u0000\u0140\u0145\u0003\u0014"+
		"\n\u0000\u0141\u0142\u0005|\u0000\u0000\u0142\u0144\u0003\u0014\n\u0000"+
		"\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000"+
		"\u0146\u0017\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000"+
		"\u0148\u0152\u0005y\u0000\u0000\u0149\u014e\u0003l6\u0000\u014a\u014b"+
		"\u0005|\u0000\u0000\u014b\u014d\u0003l6\u0000\u014c\u014a\u0001\u0000"+
		"\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000"+
		"\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0148\u0001\u0000"+
		"\u0000\u0000\u0151\u0149\u0001\u0000\u0000\u0000\u0152\u0019\u0001\u0000"+
		"\u0000\u0000\u0153\u0158\u0003\u0012\t\u0000\u0154\u0155\u0005|\u0000"+
		"\u0000\u0155\u0157\u0003\u0012\t\u0000\u0156\u0154\u0001\u0000\u0000\u0000"+
		"\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u001b\u0001\u0000\u0000\u0000"+
		"\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u0167\u0003\u0006\u0003\u0000"+
		"\u015c\u015d\u0003\u0006\u0003\u0000\u015d\u015e\u0005}\u0000\u0000\u015e"+
		"\u015f\u0003\u0006\u0003\u0000\u015f\u0167\u0001\u0000\u0000\u0000\u0160"+
		"\u0161\u0003\u0006\u0003\u0000\u0161\u0162\u0005}\u0000\u0000\u0162\u0163"+
		"\u0003\u0006\u0003\u0000\u0163\u0164\u0005}\u0000\u0000\u0164\u0165\u0003"+
		"\u0006\u0003\u0000\u0165\u0167\u0001\u0000\u0000\u0000\u0166\u015b\u0001"+
		"\u0000\u0000\u0000\u0166\u015c\u0001\u0000\u0000\u0000\u0166\u0160\u0001"+
		"\u0000\u0000\u0000\u0167\u001d\u0001\u0000\u0000\u0000\u0168\u0169\u0005"+
		"O\u0000\u0000\u0169\u016a\u0005~\u0000\u0000\u016a\u016b\u0003l6\u0000"+
		"\u016b\u016c\u0005\u007f\u0000\u0000\u016c\u0191\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u0005P\u0000\u0000\u016e\u016f\u0005~\u0000\u0000\u016f\u0170"+
		"\u0003l6\u0000\u0170\u0171\u0005\u007f\u0000\u0000\u0171\u0191\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0005Q\u0000\u0000\u0173\u0176\u0005~\u0000\u0000"+
		"\u0174\u0177\u0005y\u0000\u0000\u0175\u0177\u0003l6\u0000\u0176\u0174"+
		"\u0001\u0000\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0001\u0000\u0000\u0000\u0178\u0191\u0005\u007f\u0000\u0000\u0179\u017a"+
		"\u0005R\u0000\u0000\u017a\u017b\u0005~\u0000\u0000\u017b\u017c\u0003l"+
		"6\u0000\u017c\u017d\u0005\u007f\u0000\u0000\u017d\u0191\u0001\u0000\u0000"+
		"\u0000\u017e\u017f\u0005S\u0000\u0000\u017f\u0180\u0005~\u0000\u0000\u0180"+
		"\u0181\u0003l6\u0000\u0181\u0182\u0005\u007f\u0000\u0000\u0182\u0191\u0001"+
		"\u0000\u0000\u0000\u0183\u0184\u0005T\u0000\u0000\u0184\u0185\u0005~\u0000"+
		"\u0000\u0185\u0186\u0003l6\u0000\u0186\u0187\u0005\u007f\u0000\u0000\u0187"+
		"\u0191\u0001\u0000\u0000\u0000\u0188\u0189\u0005U\u0000\u0000\u0189\u018a"+
		"\u0005~\u0000\u0000\u018a\u0191\u0005\u007f\u0000\u0000\u018b\u018c\u0005"+
		"V\u0000\u0000\u018c\u018d\u0005~\u0000\u0000\u018d\u018e\u0003l6\u0000"+
		"\u018e\u018f\u0005\u007f\u0000\u0000\u018f\u0191\u0001\u0000\u0000\u0000"+
		"\u0190\u0168\u0001\u0000\u0000\u0000\u0190\u016d\u0001\u0000\u0000\u0000"+
		"\u0190\u0172\u0001\u0000\u0000\u0000\u0190\u0179\u0001\u0000\u0000\u0000"+
		"\u0190\u017e\u0001\u0000\u0000\u0000\u0190\u0183\u0001\u0000\u0000\u0000"+
		"\u0190\u0188\u0001\u0000\u0000\u0000\u0190\u018b\u0001\u0000\u0000\u0000"+
		"\u0191\u001f\u0001\u0000\u0000\u0000\u0192\u0199\u0003\"\u0011\u0000\u0193"+
		"\u0199\u0003$\u0012\u0000\u0194\u0199\u0003&\u0013\u0000\u0195\u0199\u0003"+
		"(\u0014\u0000\u0196\u0199\u00038\u001c\u0000\u0197\u0199\u0003*\u0015"+
		"\u0000\u0198\u0192\u0001\u0000\u0000\u0000\u0198\u0193\u0001\u0000\u0000"+
		"\u0000\u0198\u0194\u0001\u0000\u0000\u0000\u0198\u0195\u0001\u0000\u0000"+
		"\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0197\u0001\u0000\u0000"+
		"\u0000\u0199!\u0001\u0000\u0000\u0000\u019a\u019b\u0005\u0003\u0000\u0000"+
		"\u019b\u019c\u00053\u0000\u0000\u019c\u019d\u0003\u0006\u0003\u0000\u019d"+
		"#\u0001\u0000\u0000\u0000\u019e\u019f\u0005\u0003\u0000\u0000\u019f\u01a0"+
		"\u0005]\u0000\u0000\u01a0\u01a1\u0003\u0006\u0003\u0000\u01a1%\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0005\u0003\u0000\u0000\u01a3\u01a4\u0007\u0003"+
		"\u0000\u0000\u01a4\u01a6\u0003\u0006\u0003\u0000\u01a5\u01a7\u0005&\u0000"+
		"\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005^\u0000\u0000"+
		"\u01a9\u01ab\u0005\u008e\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\'\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0005\u0003\u0000\u0000\u01ad\u01ae\u0005\u000b\u0000\u0000\u01ae"+
		"\u01af\u0003\u0006\u0003\u0000\u01af\u01b0\u0005~\u0000\u0000\u01b0\u01b1"+
		"\u00034\u001a\u0000\u01b1\u01b2\u0005\u007f\u0000\u0000\u01b2)\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b4\u0005\u0003\u0000\u0000\u01b4\u01b5\u0005v\u0000"+
		"\u0000\u01b5\u01b6\u0003\u0006\u0003\u0000\u01b6\u01b7\u0005)\u0000\u0000"+
		"\u01b7\u01b8\u0003\n\u0005\u0000\u01b8+\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0005\u0019\u0000\u0000\u01ba\u01cf\u0005=\u0000\u0000\u01bb\u01bc"+
		"\u0005\u0016\u0000\u0000\u01bc\u01cf\u0005\u0015\u0000\u0000\u01bd\u01cf"+
		"\u0005\u0017\u0000\u0000\u01be\u01bf\u0005\u0005\u0000\u0000\u01bf\u01c0"+
		"\u0005~\u0000\u0000\u01c0\u01c1\u0003l6\u0000\u01c1\u01c2\u0005\u007f"+
		"\u0000\u0000\u01c2\u01cf\u0001\u0000\u0000\u0000\u01c3\u01cf\u0005\'\u0000"+
		"\u0000\u01c4\u01c5\u0005#\u0000\u0000\u01c5\u01cf\u0003l6\u0000\u01c6"+
		"\u01c7\u0005\u001c\u0000\u0000\u01c7\u01cc\u0003\u0006\u0003\u0000\u01c8"+
		"\u01c9\u0005~\u0000\u0000\u01c9\u01ca\u0003\u0006\u0003\u0000\u01ca\u01cb"+
		"\u0005\u007f\u0000\u0000\u01cb\u01cd\u0001\u0000\u0000\u0000\u01cc\u01c8"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01cf"+
		"\u0001\u0000\u0000\u0000\u01ce\u01b9\u0001\u0000\u0000\u0000\u01ce\u01bb"+
		"\u0001\u0000\u0000\u0000\u01ce\u01bd\u0001\u0000\u0000\u0000\u01ce\u01be"+
		"\u0001\u0000\u0000\u0000\u01ce\u01c3\u0001\u0000\u0000\u0000\u01ce\u01c4"+
		"\u0001\u0000\u0000\u0000\u01ce\u01c6\u0001\u0000\u0000\u0000\u01cf-\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d5\u0003\u0006\u0003\u0000\u01d1\u01d2\u0005"+
		"|\u0000\u0000\u01d2\u01d4\u0003\u0006\u0003\u0000\u01d3\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6/\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005(\u0000\u0000"+
		"\u01d9\u01db\u0003\u0006\u0003\u0000\u01da\u01d8\u0001\u0000\u0000\u0000"+
		"\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0005\u0019\u0000\u0000\u01dd\u01de\u0005=\u0000\u0000\u01de"+
		"\u01df\u0005~\u0000\u0000\u01df\u01e0\u0003.\u0017\u0000\u01e0\u01e1\u0005"+
		"\u007f\u0000\u0000\u01e1\u0204\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005"+
		"(\u0000\u0000\u01e3\u01e5\u0003\u0006\u0003\u0000\u01e4\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0005\u001d\u0000\u0000\u01e7\u01e8\u0005=\u0000"+
		"\u0000\u01e8\u01e9\u0005~\u0000\u0000\u01e9\u01ea\u0003.\u0017\u0000\u01ea"+
		"\u01eb\u0005\u007f\u0000\u0000\u01eb\u01ec\u0005\u001c\u0000\u0000\u01ec"+
		"\u01ed\u0003\u0006\u0003\u0000\u01ed\u01ee\u0005~\u0000\u0000\u01ee\u01ef"+
		"\u0003.\u0017\u0000\u01ef\u01f0\u0005\u007f\u0000\u0000\u01f0\u0204\u0001"+
		"\u0000\u0000\u0000\u01f1\u01f2\u0005(\u0000\u0000\u01f2\u01f4\u0003\u0006"+
		"\u0003\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005\'\u0000"+
		"\u0000\u01f6\u01f7\u0005~\u0000\u0000\u01f7\u01f8\u0003.\u0017\u0000\u01f8"+
		"\u01f9\u0005\u007f\u0000\u0000\u01f9\u0204\u0001\u0000\u0000\u0000\u01fa"+
		"\u01fb\u0005(\u0000\u0000\u01fb\u01fd\u0003\u0006\u0003\u0000\u01fc\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005\u0005\u0000\u0000\u01ff\u0200"+
		"\u0005~\u0000\u0000\u0200\u0201\u0003l6\u0000\u0201\u0202\u0005\u007f"+
		"\u0000\u0000\u0202\u0204\u0001\u0000\u0000\u0000\u0203\u01da\u0001\u0000"+
		"\u0000\u0000\u0203\u01e4\u0001\u0000\u0000\u0000\u0203\u01f3\u0001\u0000"+
		"\u0000\u0000\u0203\u01fc\u0001\u0000\u0000\u0000\u02041\u0001\u0000\u0000"+
		"\u0000\u0205\u0208\u00036\u001b\u0000\u0206\u0208\u00030\u0018\u0000\u0207"+
		"\u0205\u0001\u0000\u0000\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208"+
		"3\u0001\u0000\u0000\u0000\u0209\u020e\u00032\u0019\u0000\u020a\u020b\u0005"+
		"|\u0000\u0000\u020b\u020d\u00032\u0019\u0000\u020c\u020a\u0001\u0000\u0000"+
		"\u0000\u020d\u0210\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000"+
		"\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f5\u0001\u0000\u0000\u0000"+
		"\u0210\u020e\u0001\u0000\u0000\u0000\u0211\u0212\u0003\u0006\u0003\u0000"+
		"\u0212\u0216\u0003\u0004\u0002\u0000\u0213\u0215\u0003,\u0016\u0000\u0214"+
		"\u0213\u0001\u0000\u0000\u0000\u0215\u0218\u0001\u0000\u0000\u0000\u0216"+
		"\u0214\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217"+
		"7\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0219\u021b"+
		"\u0005\u0003\u0000\u0000\u021a\u021c\u0005\'\u0000\u0000\u021b\u021a\u0001"+
		"\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021d\u0001"+
		"\u0000\u0000\u0000\u021d\u021e\u0005L\u0000\u0000\u021e\u021f\u0003\u0006"+
		"\u0003\u0000\u021f\u0220\u0005\u0012\u0000\u0000\u0220\u0223\u0003\u0006"+
		"\u0003\u0000\u0221\u0222\u0005,\u0000\u0000\u0222\u0224\u0003\u0006\u0003"+
		"\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000"+
		"\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0226\u0005~\u0000\u0000"+
		"\u0226\u0227\u0003\u0016\u000b\u0000\u0227\u0228\u0005\u007f\u0000\u0000"+
		"\u02289\u0001\u0000\u0000\u0000\u0229\u022a\u00052\u0000\u0000\u022a\u022b"+
		"\u0005\u0002\u0000\u0000\u022b\u022e\u0003\u000e\u0007\u0000\u022c\u022d"+
		"\u0005\u0004\u0000\u0000\u022d\u022f\u0003l6\u0000\u022e\u022c\u0001\u0000"+
		"\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f;\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\u00050\u0000\u0000\u0231\u0232\u0003\u000e\u0007\u0000"+
		"\u0232\u0233\u00051\u0000\u0000\u0233\u0238\u0003>\u001f\u0000\u0234\u0235"+
		"\u0005|\u0000\u0000\u0235\u0237\u0003>\u001f\u0000\u0236\u0234\u0001\u0000"+
		"\u0000\u0000\u0237\u023a\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000"+
		"\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023d\u0001\u0000"+
		"\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023b\u023c\u0005\u0004"+
		"\u0000\u0000\u023c\u023e\u0003l6\u0000\u023d\u023b\u0001\u0000\u0000\u0000"+
		"\u023d\u023e\u0001\u0000\u0000\u0000\u023e=\u0001\u0000\u0000\u0000\u023f"+
		"\u0240\u0003\u001c\u000e\u0000\u0240\u0241\u0005{\u0000\u0000\u0241\u0242"+
		"\u0003l6\u0000\u0242?\u0001\u0000\u0000\u0000\u0243\u0245\u0005_\u0000"+
		"\u0000\u0244\u0246\u0005\f\u0000\u0000\u0245\u0244\u0001\u0000\u0000\u0000"+
		"\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000"+
		"\u0247\u0280\u00036\u001b\u0000\u0248\u024a\u0005`\u0000\u0000\u0249\u024b"+
		"\u0005\f\u0000\u0000\u024a\u0249\u0001\u0000\u0000\u0000\u024a\u024b\u0001"+
		"\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u0280\u0003"+
		"\u0006\u0003\u0000\u024d\u024e\u0005_\u0000\u0000\u024e\u0280\u00030\u0018"+
		"\u0000\u024f\u0250\u0005`\u0000\u0000\u0250\u0251\u0005(\u0000\u0000\u0251"+
		"\u0280\u0003\u0006\u0003\u0000\u0252\u0254\u0005\\\u0000\u0000\u0253\u0255"+
		"\u0005\f\u0000\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0254\u0255\u0001"+
		"\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256\u0257\u0003"+
		"\u0006\u0003\u0000\u0257\u0258\u00051\u0000\u0000\u0258\u0259\u0003\u0004"+
		"\u0002\u0000\u0259\u0280\u0001\u0000\u0000\u0000\u025a\u025c\u0005\\\u0000"+
		"\u0000\u025b\u025d\u0005\f\u0000\u0000\u025c\u025b\u0001\u0000\u0000\u0000"+
		"\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000"+
		"\u025e\u025f\u0003\u0006\u0003\u0000\u025f\u0260\u00051\u0000\u0000\u0260"+
		"\u0261\u0005#\u0000\u0000\u0261\u0262\u0003l6\u0000\u0262\u0280\u0001"+
		"\u0000\u0000\u0000\u0263\u0265\u0005\\\u0000\u0000\u0264\u0266\u0005\f"+
		"\u0000\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000"+
		"\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0268\u0003\u0006"+
		"\u0003\u0000\u0268\u0269\u0005`\u0000\u0000\u0269\u026a\u0005#\u0000\u0000"+
		"\u026a\u0280\u0001\u0000\u0000\u0000\u026b\u026d\u0005\\\u0000\u0000\u026c"+
		"\u026e\u0005\f\u0000\u0000\u026d\u026c\u0001\u0000\u0000\u0000\u026d\u026e"+
		"\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0270"+
		"\u0003\u0006\u0003\u0000\u0270\u0271\u0007\u0004\u0000\u0000\u0271\u0272"+
		"\u0005\u0016\u0000\u0000\u0272\u0273\u0005\u0015\u0000\u0000\u0273\u0280"+
		"\u0001\u0000\u0000\u0000\u0274\u0276\u0005b\u0000\u0000\u0275\u0277\u0005"+
		"\f\u0000\u0000\u0276\u0275\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000"+
		"\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0279\u0003\u0006"+
		"\u0003\u0000\u0279\u027a\u0005-\u0000\u0000\u027a\u027b\u0003\u0006\u0003"+
		"\u0000\u027b\u0280\u0001\u0000\u0000\u0000\u027c\u027d\u0005b\u0000\u0000"+
		"\u027d\u027e\u0005-\u0000\u0000\u027e\u0280\u0003\u0006\u0003\u0000\u027f"+
		"\u0243\u0001\u0000\u0000\u0000\u027f\u0248\u0001\u0000\u0000\u0000\u027f"+
		"\u024d\u0001\u0000\u0000\u0000\u027f\u024f\u0001\u0000\u0000\u0000\u027f"+
		"\u0252\u0001\u0000\u0000\u0000\u027f\u025a\u0001\u0000\u0000\u0000\u027f"+
		"\u0263\u0001\u0000\u0000\u0000\u027f\u026b\u0001\u0000\u0000\u0000\u027f"+
		"\u0274\u0001\u0000\u0000\u0000\u027f\u027c\u0001\u0000\u0000\u0000\u0280"+
		"A\u0001\u0000\u0000\u0000\u0281\u0287\u0003D\"\u0000\u0282\u0287\u0003"+
		"F#\u0000\u0283\u0287\u0003H$\u0000\u0284\u0287\u0003L&\u0000\u0285\u0287"+
		"\u0003N\'\u0000\u0286\u0281\u0001\u0000\u0000\u0000\u0286\u0282\u0001"+
		"\u0000\u0000\u0000\u0286\u0283\u0001\u0000\u0000\u0000\u0286\u0284\u0001"+
		"\u0000\u0000\u0000\u0286\u0285\u0001\u0000\u0000\u0000\u0287C\u0001\u0000"+
		"\u0000\u0000\u0288\u0289\u0005\\\u0000\u0000\u0289\u028a\u0005\u000b\u0000"+
		"\u0000\u028a\u028b\u0003\u0006\u0003\u0000\u028b\u0290\u0003@ \u0000\u028c"+
		"\u028d\u0005|\u0000\u0000\u028d\u028f\u0003@ \u0000\u028e\u028c\u0001"+
		"\u0000\u0000\u0000\u028f\u0292\u0001\u0000\u0000\u0000\u0290\u028e\u0001"+
		"\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u029b\u0001"+
		"\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0293\u0294\u0005"+
		"\\\u0000\u0000\u0294\u0295\u0005\u000b\u0000\u0000\u0295\u0296\u0003\u0006"+
		"\u0003\u0000\u0296\u0297\u0005b\u0000\u0000\u0297\u0298\u0005-\u0000\u0000"+
		"\u0298\u0299\u0003\u0006\u0003\u0000\u0299\u029b\u0001\u0000\u0000\u0000"+
		"\u029a\u0288\u0001\u0000\u0000\u0000\u029a\u0293\u0001\u0000\u0000\u0000"+
		"\u029bE\u0001\u0000\u0000\u0000\u029c\u029d\u0005\\\u0000\u0000\u029d"+
		"\u029e\u00053\u0000\u0000\u029e\u029f\u0003\u0006\u0003\u0000\u029f\u02a0"+
		"\u0005b\u0000\u0000\u02a0\u02a1\u0005-\u0000\u0000\u02a1\u02a2\u0003\u0006"+
		"\u0003\u0000\u02a2\u02ab\u0001\u0000\u0000\u0000\u02a3\u02a4\u0005\\\u0000"+
		"\u0000\u02a4\u02a5\u00053\u0000\u0000\u02a5\u02a6\u0003\u0006\u0003\u0000"+
		"\u02a6\u02a7\u0005c\u0000\u0000\u02a7\u02a8\u0005-\u0000\u0000\u02a8\u02a9"+
		"\u0003\u0006\u0003\u0000\u02a9\u02ab\u0001\u0000\u0000\u0000\u02aa\u029c"+
		"\u0001\u0000\u0000\u0000\u02aa\u02a3\u0001\u0000\u0000\u0000\u02abG\u0001"+
		"\u0000\u0000\u0000\u02ac\u02ad\u0005\\\u0000\u0000\u02ad\u02ae\u0005]"+
		"\u0000\u0000\u02ae\u02af\u0003\u0006\u0003\u0000\u02af\u02b0\u0005b\u0000"+
		"\u0000\u02b0\u02b1\u0005-\u0000\u0000\u02b1\u02b2\u0003\u0006\u0003\u0000"+
		"\u02b2\u02bb\u0001\u0000\u0000\u0000\u02b3\u02b4\u0005\\\u0000\u0000\u02b4"+
		"\u02b5\u0005]\u0000\u0000\u02b5\u02b6\u0003\u0006\u0003\u0000\u02b6\u02b7"+
		"\u0005c\u0000\u0000\u02b7\u02b8\u0005-\u0000\u0000\u02b8\u02b9\u0003\u0006"+
		"\u0003\u0000\u02b9\u02bb\u0001\u0000\u0000\u0000\u02ba\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ba\u02b3\u0001\u0000\u0000\u0000\u02bbI\u0001\u0000\u0000"+
		"\u0000\u02bc\u02bd\u0007\u0005\u0000\u0000\u02bdK\u0001\u0000\u0000\u0000"+
		"\u02be\u02bf\u0005\\\u0000\u0000\u02bf\u02c0\u0007\u0003\u0000\u0000\u02c0"+
		"\u02c1\u0003\u0006\u0003\u0000\u02c1\u02c2\u0005b\u0000\u0000\u02c2\u02c3"+
		"\u0005-\u0000\u0000\u02c3\u02c4\u0003\u0006\u0003\u0000\u02c4\u02da\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c6\u0005\\\u0000\u0000\u02c6\u02c7\u0007\u0003"+
		"\u0000\u0000\u02c7\u02c9\u0003\u0006\u0003\u0000\u02c8\u02ca\u0005&\u0000"+
		"\u0000\u02c9\u02c8\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000"+
		"\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb\u02cc\u0005^\u0000\u0000"+
		"\u02cc\u02cd\u0005\u008e\u0000\u0000\u02cd\u02da\u0001\u0000\u0000\u0000"+
		"\u02ce\u02cf\u0005\\\u0000\u0000\u02cf\u02d0\u0007\u0003\u0000\u0000\u02d0"+
		"\u02d2\u0003\u0006\u0003\u0000\u02d1\u02d3\u0005&\u0000\u0000\u02d2\u02d1"+
		"\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d4\u02d6\u0003J%\u0000\u02d5\u02d4\u0001\u0000"+
		"\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000"+
		"\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02da\u0001\u0000"+
		"\u0000\u0000\u02d9\u02be\u0001\u0000\u0000\u0000\u02d9\u02c5\u0001\u0000"+
		"\u0000\u0000\u02d9\u02ce\u0001\u0000\u0000\u0000\u02daM\u0001\u0000\u0000"+
		"\u0000\u02db\u02dc\u0005\\\u0000\u0000\u02dc\u02dd\u0005L\u0000\u0000"+
		"\u02dd\u02de\u0003\u0006\u0003\u0000\u02de\u02df\u0005b\u0000\u0000\u02df"+
		"\u02e0\u0005-\u0000\u0000\u02e0\u02e1\u0003\u0006\u0003\u0000\u02e1\u02e4"+
		"\u0001\u0000\u0000\u0000\u02e2\u02e4\u0005\\\u0000\u0000\u02e3\u02db\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e2\u0001\u0000\u0000\u0000\u02e4O\u0001\u0000"+
		"\u0000\u0000\u02e5\u02ec\u0003R)\u0000\u02e6\u02ec\u0003T*\u0000\u02e7"+
		"\u02ec\u0003X,\u0000\u02e8\u02ec\u0003V+\u0000\u02e9\u02ec\u0003Z-\u0000"+
		"\u02ea\u02ec\u0003\\.\u0000\u02eb\u02e5\u0001\u0000\u0000\u0000\u02eb"+
		"\u02e6\u0001\u0000\u0000\u0000\u02eb\u02e7\u0001\u0000\u0000\u0000\u02eb"+
		"\u02e8\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02eb"+
		"\u02ea\u0001\u0000\u0000\u0000\u02ecQ\u0001\u0000\u0000\u0000\u02ed\u02ee"+
		"\u0005`\u0000\u0000\u02ee\u02f1\u0005\u000b\u0000\u0000\u02ef\u02f0\u0005"+
		"n\u0000\u0000\u02f0\u02f2\u0005o\u0000\u0000\u02f1\u02ef\u0001\u0000\u0000"+
		"\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000"+
		"\u0000\u02f3\u02f5\u0003.\u0017\u0000\u02f4\u02f6\u0007\u0006\u0000\u0000"+
		"\u02f5\u02f4\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000"+
		"\u02f6S\u0001\u0000\u0000\u0000\u02f7\u02f8\u0005`\u0000\u0000\u02f8\u02fb"+
		"\u00053\u0000\u0000\u02f9\u02fa\u0005n\u0000\u0000\u02fa\u02fc\u0005o"+
		"\u0000\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02ff\u0003\u0006"+
		"\u0003\u0000\u02fe\u0300\u0007\u0006\u0000\u0000\u02ff\u02fe\u0001\u0000"+
		"\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300U\u0001\u0000\u0000"+
		"\u0000\u0301\u0302\u0005`\u0000\u0000\u0302\u0305\u0005]\u0000\u0000\u0303"+
		"\u0304\u0005n\u0000\u0000\u0304\u0306\u0005o\u0000\u0000\u0305\u0303\u0001"+
		"\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0307\u0001"+
		"\u0000\u0000\u0000\u0307\u0308\u0003\u0006\u0003\u0000\u0308W\u0001\u0000"+
		"\u0000\u0000\u0309\u030a\u0005`\u0000\u0000\u030a\u030d\u0007\u0003\u0000"+
		"\u0000\u030b\u030c\u0005n\u0000\u0000\u030c\u030e\u0005o\u0000\u0000\u030d"+
		"\u030b\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e"+
		"\u030f\u0001\u0000\u0000\u0000\u030f\u0310\u0003.\u0017\u0000\u0310Y\u0001"+
		"\u0000\u0000\u0000\u0311\u0312\u0005`\u0000\u0000\u0312\u0315\u0005L\u0000"+
		"\u0000\u0313\u0314\u0005n\u0000\u0000\u0314\u0316\u0005o\u0000\u0000\u0315"+
		"\u0313\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316"+
		"\u0317\u0001\u0000\u0000\u0000\u0317\u0318\u0003.\u0017\u0000\u0318\u0319"+
		"\u0007\u0006\u0000\u0000\u0319[\u0001\u0000\u0000\u0000\u031a\u031b\u0005"+
		"`\u0000\u0000\u031b\u031e\u0005v\u0000\u0000\u031c\u031d\u0005n\u0000"+
		"\u0000\u031d\u031f\u0005o\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000"+
		"\u031e\u031f\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000"+
		"\u0320\u0321\u0003.\u0017\u0000\u0321\u0322\u0007\u0006\u0000\u0000\u0322"+
		"]\u0001\u0000\u0000\u0000\u0323\u0324\u0005~\u0000\u0000\u0324\u0325\u0003"+
		"\f\u0006\u0000\u0325\u0326\u0005\u007f\u0000\u0000\u0326_\u0001\u0000"+
		"\u0000\u0000\u0327\u0328\u0005\u001e\u0000\u0000\u0328\u0329\u0005\u001f"+
		"\u0000\u0000\u0329\u032e\u0003\u0006\u0003\u0000\u032a\u032b\u0005~\u0000"+
		"\u0000\u032b\u032c\u0003.\u0017\u0000\u032c\u032d\u0005\u007f\u0000\u0000"+
		"\u032d\u032f\u0001\u0000\u0000\u0000\u032e\u032a\u0001\u0000\u0000\u0000"+
		"\u032e\u032f\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000"+
		"\u0330\u0331\u0005q\u0000\u0000\u0331\u0336\u0003^/\u0000\u0332\u0333"+
		"\u0005|\u0000\u0000\u0333\u0335\u0003^/\u0000\u0334\u0332\u0001\u0000"+
		"\u0000\u0000\u0335\u0338\u0001\u0000\u0000\u0000\u0336\u0334\u0001\u0000"+
		"\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337a\u0001\u0000\u0000"+
		"\u0000\u0338\u0336\u0001\u0000\u0000\u0000\u0339\u0343\u0005\u001e\u0000"+
		"\u0000\u033a\u0343\u00052\u0000\u0000\u033b\u0343\u00050\u0000\u0000\u033c"+
		"\u0343\u0005\u0003\u0000\u0000\u033d\u0343\u0005\u001e\u0000\u0000\u033e"+
		"\u0340\u0005.\u0000\u0000\u033f\u0341\u0005s\u0000\u0000\u0340\u033f\u0001"+
		"\u0000\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341\u0343\u0001"+
		"\u0000\u0000\u0000\u0342\u0339\u0001\u0000\u0000\u0000\u0342\u033a\u0001"+
		"\u0000\u0000\u0000\u0342\u033b\u0001\u0000\u0000\u0000\u0342\u033c\u0001"+
		"\u0000\u0000\u0000\u0342\u033d\u0001\u0000\u0000\u0000\u0342\u033e\u0001"+
		"\u0000\u0000\u0000\u0343c\u0001\u0000\u0000\u0000\u0344\u0349\u0003b1"+
		"\u0000\u0345\u0346\u0005|\u0000\u0000\u0346\u0348\u0003b1\u0000\u0347"+
		"\u0345\u0001\u0000\u0000\u0000\u0348\u034b\u0001\u0000\u0000\u0000\u0349"+
		"\u0347\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000\u034a"+
		"e\u0001\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034c\u034d"+
		"\u0005\u001b\u0000\u0000\u034d\u034e\u0003d2\u0000\u034e\u0350\u0005\u0012"+
		"\u0000\u0000\u034f\u0351\u0005\u000b\u0000\u0000\u0350\u034f\u0001\u0000"+
		"\u0000\u0000\u0350\u0351\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000"+
		"\u0000\u0000\u0352\u0353\u0003\u0006\u0003\u0000\u0353\u0354\u0005-\u0000"+
		"\u0000\u0354\u0355\u0003\u0006\u0003\u0000\u0355g\u0001\u0000\u0000\u0000"+
		"\u0356\u0357\u0005r\u0000\u0000\u0357\u0358\u0003d2\u0000\u0358\u035a"+
		"\u0005\u0012\u0000\u0000\u0359\u035b\u0005\u000b\u0000\u0000\u035a\u0359"+
		"\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000\u035b\u035c"+
		"\u0001\u0000\u0000\u0000\u035c\u035d\u0003\u0006\u0003\u0000\u035d\u035e"+
		"\u0005-\u0000\u0000\u035e\u035f\u0003\u0006\u0003\u0000\u035fi\u0001\u0000"+
		"\u0000\u0000\u0360\u0362\u0005Z\u0000\u0000\u0361\u0363\u0005t\u0000\u0000"+
		"\u0362\u0361\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000"+
		"\u0363\u036d\u0001\u0000\u0000\u0000\u0364\u0366\u0005Y\u0000\u0000\u0365"+
		"\u0367\u0005t\u0000\u0000\u0366\u0365\u0001\u0000\u0000\u0000\u0366\u0367"+
		"\u0001\u0000\u0000\u0000\u0367\u036d\u0001\u0000\u0000\u0000\u0368\u036a"+
		"\u0005[\u0000\u0000\u0369\u036b\u0005t\u0000\u0000\u036a\u0369\u0001\u0000"+
		"\u0000\u0000\u036a\u036b\u0001\u0000\u0000\u0000\u036b\u036d\u0001\u0000"+
		"\u0000\u0000\u036c\u0360\u0001\u0000\u0000\u0000\u036c\u0364\u0001\u0000"+
		"\u0000\u0000\u036c\u0368\u0001\u0000\u0000\u0000\u036dk\u0001\u0000\u0000"+
		"\u0000\u036e\u036f\u00066\uffff\uffff\u0000\u036f\u0370\u0005~\u0000\u0000"+
		"\u0370\u0371\u0003l6\u0000\u0371\u0372\u0005\u007f\u0000\u0000\u0372\u0381"+
		"\u0001\u0000\u0000\u0000\u0373\u0374\u0005\u0016\u0000\u0000\u0374\u0381"+
		"\u0003l6\u000f\u0375\u0376\u0005~\u0000\u0000\u0376\u0377\u0003\n\u0005"+
		"\u0000\u0377\u0378\u0005\u007f\u0000\u0000\u0378\u0381\u0001\u0000\u0000"+
		"\u0000\u0379\u0381\u0003\u001e\u000f\u0000\u037a\u0381\u0003\u001c\u000e"+
		"\u0000\u037b\u0381\u0005\u008f\u0000\u0000\u037c\u0381\u0005\u008e\u0000"+
		"\u0000\u037d\u0381\u0005 \u0000\u0000\u037e\u0381\u0005!\u0000\u0000\u037f"+
		"\u0381\u0005\u0015\u0000\u0000\u0380\u036e\u0001\u0000\u0000\u0000\u0380"+
		"\u0373\u0001\u0000\u0000\u0000\u0380\u0375\u0001\u0000\u0000\u0000\u0380"+
		"\u0379\u0001\u0000\u0000\u0000\u0380\u037a\u0001\u0000\u0000\u0000\u0380"+
		"\u037b\u0001\u0000\u0000\u0000\u0380\u037c\u0001\u0000\u0000\u0000\u0380"+
		"\u037d\u0001\u0000\u0000\u0000\u0380\u037e\u0001\u0000\u0000\u0000\u0380"+
		"\u037f\u0001\u0000\u0000\u0000\u0381\u0396\u0001\u0000\u0000\u0000\u0382"+
		"\u0383\n\u000e\u0000\u0000\u0383\u0384\u0007\u0007\u0000\u0000\u0384\u0395"+
		"\u0003l6\u000f\u0385\u0386\n\r\u0000\u0000\u0386\u0387\u0005w\u0000\u0000"+
		"\u0387\u0395\u0003l6\u000e\u0388\u0389\n\f\u0000\u0000\u0389\u038a\u0005"+
		"x\u0000\u0000\u038a\u0395\u0003l6\r\u038b\u038c\n\u000b\u0000\u0000\u038c"+
		"\u038d\u0007\b\u0000\u0000\u038d\u0395\u0003l6\f\u038e\u038f\n\n\u0000"+
		"\u0000\u038f\u0390\u0005%\u0000\u0000\u0390\u0395\u0003l6\u000b\u0391"+
		"\u0392\n\t\u0000\u0000\u0392\u0393\u0005$\u0000\u0000\u0393\u0395\u0003"+
		"l6\n\u0394\u0382\u0001\u0000\u0000\u0000\u0394\u0385\u0001\u0000\u0000"+
		"\u0000\u0394\u0388\u0001\u0000\u0000\u0000\u0394\u038b\u0001\u0000\u0000"+
		"\u0000\u0394\u038e\u0001\u0000\u0000\u0000\u0394\u0391\u0001\u0000\u0000"+
		"\u0000\u0395\u0398\u0001\u0000\u0000\u0000\u0396\u0394\u0001\u0000\u0000"+
		"\u0000\u0396\u0397\u0001\u0000\u0000\u0000\u0397m\u0001\u0000\u0000\u0000"+
		"\u0398\u0396\u0001\u0000\u0000\u0000bq}\u0080\u0087\u008a\u0090\u0096"+
		"\u009d\u00a8\u00ae\u00b4\u00c0\u00c4\u00e7\u00ed\u00f1\u00f6\u00fa\u00ff"+
		"\u0103\u010a\u010f\u0112\u0118\u011b\u011d\u0120\u0129\u0133\u0139\u013e"+
		"\u0145\u014e\u0151\u0158\u0166\u0176\u0190\u0198\u01a6\u01aa\u01cc\u01ce"+
		"\u01d5\u01da\u01e4\u01f3\u01fc\u0203\u0207\u020e\u0216\u021b\u0223\u022e"+
		"\u0238\u023d\u0245\u024a\u0254\u025c\u0265\u026d\u0276\u027f\u0286\u0290"+
		"\u029a\u02aa\u02ba\u02c9\u02d2\u02d7\u02d9\u02e3\u02eb\u02f1\u02f5\u02fb"+
		"\u02ff\u0305\u030d\u0315\u031e\u032e\u0336\u0340\u0342\u0349\u0350\u035a"+
		"\u0362\u0366\u036a\u036c\u0380\u0394\u0396";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}