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
		FOR=47, CAST=48, ARRAY=49, BY=50, UPDATE=51, SET=52, DELETE=53, SCHEMA=54, 
		INT=55, DECIMAL=56, NUMERIC=57, CHAR=58, VARCHAR=59, TEXT=60, INTEGER=61, 
		SMALLINT=62, SERIAL=63, KEY=64, DATE=65, TIMESTAMP=66, TIME=67, TIMESTAMPZ=68, 
		BIGINT=69, REAL=70, BOOLEAN=71, JSON=72, JSONB=73, INET=74, CIDR=75, MACADDR=76, 
		BYTEA=77, OID=78, INDEX=79, DOUBLE=80, PRECISION=81, SUM=82, AVG=83, COUNT=84, 
		MIN=85, MAX=86, RANK=87, RANDOM=88, MD5=89, CHARACTER=90, VARYING=91, 
		COMMIT=92, BEGIN=93, ROLLBACK=94, ALTER=95, DATABASE=96, PASSWORD=97, 
		ADD=98, DROP=99, TYPE=100, RENAME=101, OWNER=102, LOGIN=103, NOLOGIN=104, 
		SUPERUSER=105, NOSUPERUSER=106, CREATEDB=107, NOCREATEDB=108, CREATEROLE=109, 
		NOCREATEROLE=110, CASCADE=111, RESTRICT=112, IF=113, EXISTS=114, ROLE=115, 
		VALUES=116, REVOKE=117, PRIVILEGES=118, TRANSACTION=119, REPLACE=120, 
		VIEW=121, FUNCTION=122, PROCEDURE=123, RETURNS=124, LANGUAGE=125, TRIGGER=126, 
		BEFORE=127, AFTER=128, INSTEAD=129, OF=130, EACH=131, ROW=132, EXECUTE=133, 
		STATEMENT=134, TRUNCATE=135, USE=136, NO=137, ACTION=138, SUMA=139, RESTA=140, 
		MULTIPLICACION=141, DIVISION=142, IGUAL=143, COMA=144, PUNTO=145, PARENTA=146, 
		PARENTC=147, PUNTOCOMA=148, ORSIMB=149, NOTSIMB=150, EXCLAMACION=151, 
		ANDSIMB=152, PREGUNTA=153, PORCENTAJE=154, GATO=155, ARROBA=156, POTENCIA=157, 
		COMP1=158, COMP2=159, COMPIG1=160, COMPIG2=161, DOBLEPNTO=162, CORCHA=163, 
		CORCHC=164, CADENA=165, CADENA_DIN=166, NUM=167, IDF=168, COMENTARIO_LINEA=169, 
		COMENTARIO_BLOQUE=170, WS=171;
	public static final int
		RULE_root = 0, RULE_palabras_no_reservadas = 1, RULE_tipo_dato = 2, RULE_identi = 3, 
		RULE_setencia = 4, RULE_use = 5, RULE_select = 6, RULE_lista_expresiones = 7, 
		RULE_nombre_calificado = 8, RULE_lista_nomb_cali = 9, RULE_tabla_origen = 10, 
		RULE_join = 11, RULE_tabla_ref = 12, RULE_ordenamiento = 13, RULE_lista_ordenamiento = 14, 
		RULE_lista_columnas = 15, RULE_elemento_select = 16, RULE_lista_tablas = 17, 
		RULE_referencia_columna = 18, RULE_funciones_agg = 19, RULE_create = 20, 
		RULE_create_schema = 21, RULE_create_database = 22, RULE_create_user = 23, 
		RULE_create_table = 24, RULE_create_index = 25, RULE_create_view = 26, 
		RULE_create_function = 27, RULE_create_procedure = 28, RULE_create_trigger = 29, 
		RULE_event_trigger = 30, RULE_restriccion_col = 31, RULE_accion_referencial = 32, 
		RULE_clausula_referencial = 33, RULE_cuerpo_funcion = 34, RULE_lista_identi = 35, 
		RULE_restricciones_tabla = 36, RULE_elemento_tabla = 37, RULE_lista_columnas_def = 38, 
		RULE_columna_def = 39, RULE_delete = 40, RULE_update = 41, RULE_asignacion_upd = 42, 
		RULE_alter_accion = 43, RULE_alter = 44, RULE_alter_table = 45, RULE_alter_schema = 46, 
		RULE_alter_database = 47, RULE_opcion_usuario = 48, RULE_alter_user = 49, 
		RULE_alter_index = 50, RULE_alter_function = 51, RULE_alter_view = 52, 
		RULE_drop = 53, RULE_lista_tipos_dato = 54, RULE_drop_table = 55, RULE_drop_schema = 56, 
		RULE_drop_database = 57, RULE_drop_user = 58, RULE_drop_index = 59, RULE_drop_view = 60, 
		RULE_drop_function = 61, RULE_drop_trigger = 62, RULE_valores_fila = 63, 
		RULE_insert = 64, RULE_privilegios = 65, RULE_lista_previ = 66, RULE_grant = 67, 
		RULE_revoke = 68, RULE_transaccion = 69, RULE_para_funcion = 70, RULE_expr = 71;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "palabras_no_reservadas", "tipo_dato", "identi", "setencia", 
			"use", "select", "lista_expresiones", "nombre_calificado", "lista_nomb_cali", 
			"tabla_origen", "join", "tabla_ref", "ordenamiento", "lista_ordenamiento", 
			"lista_columnas", "elemento_select", "lista_tablas", "referencia_columna", 
			"funciones_agg", "create", "create_schema", "create_database", "create_user", 
			"create_table", "create_index", "create_view", "create_function", "create_procedure", 
			"create_trigger", "event_trigger", "restriccion_col", "accion_referencial", 
			"clausula_referencial", "cuerpo_funcion", "lista_identi", "restricciones_tabla", 
			"elemento_tabla", "lista_columnas_def", "columna_def", "delete", "update", 
			"asignacion_upd", "alter_accion", "alter", "alter_table", "alter_schema", 
			"alter_database", "opcion_usuario", "alter_user", "alter_index", "alter_function", 
			"alter_view", "drop", "lista_tipos_dato", "drop_table", "drop_schema", 
			"drop_database", "drop_user", "drop_index", "drop_view", "drop_function", 
			"drop_trigger", "valores_fila", "insert", "privilegios", "lista_previ", 
			"grant", "revoke", "transaccion", "para_funcion", "expr"
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
			"'AS'", "'FULL'", "'CROSS'", "'USING'", "'TO'", "'ALL'", "'FOR'", "'CAST'", 
			"'ARRAY'", "'BY'", "'UPDATE'", "'SET'", "'DELETE'", "'SCHEMA'", "'INT'", 
			"'DECIMAL'", "'NUMERIC'", "'CHAR'", "'VARCHAR'", "'TEXT'", "'INTEGER'", 
			"'SMALLINT'", "'SERIAL'", "'KEY'", "'DATE'", "'TIMESTAMP'", "'TIME'", 
			"'TIMESTAMPZ'", "'BIGINT'", "'REAL'", "'BOOLEAN'", "'JSON'", "'JSONB'", 
			"'INET'", "'CIDR'", "'MACADDR'", "'BYTEA'", "'OID'", "'INDEX'", "'DOUBLE'", 
			"'PRECISION'", "'SUM'", "'AVG'", "'COUNT'", "'MIN'", "'MAX'", "'RANK'", 
			"'RANDOM'", "'MD5'", "'CHARACTER'", "'VARYING'", "'COMMIT'", "'BEGIN'", 
			"'ROLLBACK'", "'ALTER'", "'DATABASE'", "'PASSWORD'", "'ADD'", "'DROP'", 
			"'TYPE'", "'RENAME'", "'OWNER'", "'LOGIN'", "'NOLOGIN'", "'SUPERUSER'", 
			"'NOSUPERUSER'", "'CREATEDB'", "'NOCREATEDB'", "'CREATEROLE'", "'NOCREATEROLE'", 
			"'CASCADE'", "'RESTRICT'", "'IF'", "'EXISTS'", "'ROLE'", "'VALUES'", 
			"'REVOKE'", "'PRIVILEGES'", "'TRANSACTION'", "'REPLACE'", "'VIEW'", "'FUNCTION'", 
			"'PROCEDURE'", "'RETURNS'", "'LANGUAGE'", "'TRIGGER'", "'BEFORE'", "'AFTER'", 
			"'INSTEAD'", "'OF'", "'EACH'", "'ROW'", "'EXECUTE'", "'STATEMENT'", "'TRUNCATE'", 
			"'USE'", "'NO'", "'ACTION'", "'+'", "'-'", "'*'", "'/'", "'='", "','", 
			"'.'", "'('", "')'", "';'", "'|'", "'~'", "'!'", "'&'", "'?'", "'%'", 
			"'#'", "'@'", "'^'", "'<'", "'>'", "'<='", "'>='", "'::'", "'['", "']'"
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
			"AS", "FULL", "CROSS", "USING", "TO", "ALL", "FOR", "CAST", "ARRAY", 
			"BY", "UPDATE", "SET", "DELETE", "SCHEMA", "INT", "DECIMAL", "NUMERIC", 
			"CHAR", "VARCHAR", "TEXT", "INTEGER", "SMALLINT", "SERIAL", "KEY", "DATE", 
			"TIMESTAMP", "TIME", "TIMESTAMPZ", "BIGINT", "REAL", "BOOLEAN", "JSON", 
			"JSONB", "INET", "CIDR", "MACADDR", "BYTEA", "OID", "INDEX", "DOUBLE", 
			"PRECISION", "SUM", "AVG", "COUNT", "MIN", "MAX", "RANK", "RANDOM", "MD5", 
			"CHARACTER", "VARYING", "COMMIT", "BEGIN", "ROLLBACK", "ALTER", "DATABASE", 
			"PASSWORD", "ADD", "DROP", "TYPE", "RENAME", "OWNER", "LOGIN", "NOLOGIN", 
			"SUPERUSER", "NOSUPERUSER", "CREATEDB", "NOCREATEDB", "CREATEROLE", "NOCREATEROLE", 
			"CASCADE", "RESTRICT", "IF", "EXISTS", "ROLE", "VALUES", "REVOKE", "PRIVILEGES", 
			"TRANSACTION", "REPLACE", "VIEW", "FUNCTION", "PROCEDURE", "RETURNS", 
			"LANGUAGE", "TRIGGER", "BEFORE", "AFTER", "INSTEAD", "OF", "EACH", "ROW", 
			"EXECUTE", "STATEMENT", "TRUNCATE", "USE", "NO", "ACTION", "SUMA", "RESTA", 
			"MULTIPLICACION", "DIVISION", "IGUAL", "COMA", "PUNTO", "PARENTA", "PARENTC", 
			"PUNTOCOMA", "ORSIMB", "NOTSIMB", "EXCLAMACION", "ANDSIMB", "PREGUNTA", 
			"PORCENTAJE", "GATO", "ARROBA", "POTENCIA", "COMP1", "COMP2", "COMPIG1", 
			"COMPIG2", "DOBLEPNTO", "CORCHA", "CORCHC", "CADENA", "CADENA_DIN", "NUM", 
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
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				setencia();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -281460877557750L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -36028797018963969L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 1786706659327L) != 0) );
			setState(149);
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
		public TerminalNode PROCEDURE() { return getToken(ExprParser.PROCEDURE, 0); }
		public TerminalNode FUNCTION() { return getToken(ExprParser.FUNCTION, 0); }
		public TerminalNode RETURNS() { return getToken(ExprParser.RETURNS, 0); }
		public TerminalNode LANGUAGE() { return getToken(ExprParser.LANGUAGE, 0); }
		public TerminalNode ROW() { return getToken(ExprParser.ROW, 0); }
		public TerminalNode EACH() { return getToken(ExprParser.EACH, 0); }
		public TerminalNode TRIGGER() { return getToken(ExprParser.TRIGGER, 0); }
		public TerminalNode BEFORE() { return getToken(ExprParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(ExprParser.AFTER, 0); }
		public TerminalNode INSTEAD() { return getToken(ExprParser.INSTEAD, 0); }
		public TerminalNode OF() { return getToken(ExprParser.OF, 0); }
		public TerminalNode EXECUTE() { return getToken(ExprParser.EXECUTE, 0); }
		public TerminalNode STATEMENT() { return getToken(ExprParser.STATEMENT, 0); }
		public TerminalNode TRUNCATE() { return getToken(ExprParser.TRUNCATE, 0); }
		public TerminalNode USE() { return getToken(ExprParser.USE, 0); }
		public TerminalNode NO() { return getToken(ExprParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(ExprParser.ACTION, 0); }
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
			setState(151);
			_la = _input.LA(1);
			if ( !(((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & -1L) != 0) || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & 33554399L) != 0)) ) {
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
		public List<TerminalNode> CORCHA() { return getTokens(ExprParser.CORCHA); }
		public TerminalNode CORCHA(int i) {
			return getToken(ExprParser.CORCHA, i);
		}
		public List<TerminalNode> CORCHC() { return getTokens(ExprParser.CORCHC); }
		public TerminalNode CORCHC(int i) {
			return getToken(ExprParser.CORCHC, i);
		}
		public TerminalNode PARENTA() { return getToken(ExprParser.PARENTA, 0); }
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public TerminalNode PARENTC() { return getToken(ExprParser.PARENTC, 0); }
		public TerminalNode COMA() { return getToken(ExprParser.COMA, 0); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(153);
				match(INT);
				}
				break;
			case DECIMAL:
				{
				setState(154);
				match(DECIMAL);
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(155);
					match(PARENTA);
					setState(156);
					match(NUM);
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMA) {
						{
						setState(157);
						match(COMA);
						setState(158);
						match(NUM);
						}
					}

					setState(161);
					match(PARENTC);
					}
					break;
				}
				}
				break;
			case NUMERIC:
				{
				setState(164);
				match(NUMERIC);
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(165);
					match(PARENTA);
					setState(166);
					match(NUM);
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMA) {
						{
						setState(167);
						match(COMA);
						setState(168);
						match(NUM);
						}
					}

					setState(171);
					match(PARENTC);
					}
					break;
				}
				}
				break;
			case CHAR:
				{
				setState(174);
				match(CHAR);
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(175);
					match(PARENTA);
					setState(176);
					match(NUM);
					setState(177);
					match(PARENTC);
					}
					break;
				}
				}
				break;
			case VARCHAR:
				{
				setState(180);
				match(VARCHAR);
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(181);
					match(PARENTA);
					setState(182);
					match(NUM);
					setState(183);
					match(PARENTC);
					}
					break;
				}
				}
				break;
			case CHARACTER:
				{
				setState(186);
				match(CHARACTER);
				setState(187);
				match(VARYING);
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(188);
					match(PARENTA);
					setState(189);
					match(NUM);
					setState(190);
					match(PARENTC);
					}
					break;
				}
				}
				break;
			case TEXT:
				{
				setState(193);
				match(TEXT);
				}
				break;
			case INTEGER:
				{
				setState(194);
				match(INTEGER);
				}
				break;
			case SMALLINT:
				{
				setState(195);
				match(SMALLINT);
				}
				break;
			case SERIAL:
				{
				setState(196);
				match(SERIAL);
				}
				break;
			case DATE:
				{
				setState(197);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				{
				setState(198);
				match(TIMESTAMP);
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(199);
					match(PARENTA);
					setState(200);
					match(NUM);
					setState(201);
					match(PARENTC);
					}
					break;
				}
				}
				break;
			case TIME:
				{
				setState(204);
				match(TIME);
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(205);
					match(PARENTA);
					setState(206);
					match(NUM);
					setState(207);
					match(PARENTC);
					}
					break;
				}
				}
				break;
			case TIMESTAMPZ:
				{
				setState(210);
				match(TIMESTAMPZ);
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(211);
					match(PARENTA);
					setState(212);
					match(NUM);
					setState(213);
					match(PARENTC);
					}
					break;
				}
				}
				break;
			case BIGINT:
				{
				setState(216);
				match(BIGINT);
				}
				break;
			case REAL:
				{
				setState(217);
				match(REAL);
				}
				break;
			case BOOLEAN:
				{
				setState(218);
				match(BOOLEAN);
				}
				break;
			case JSON:
				{
				setState(219);
				match(JSON);
				}
				break;
			case JSONB:
				{
				setState(220);
				match(JSONB);
				}
				break;
			case INET:
				{
				setState(221);
				match(INET);
				}
				break;
			case CIDR:
				{
				setState(222);
				match(CIDR);
				}
				break;
			case MACADDR:
				{
				setState(223);
				match(MACADDR);
				}
				break;
			case BYTEA:
				{
				setState(224);
				match(BYTEA);
				}
				break;
			case OID:
				{
				setState(225);
				match(OID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					match(CORCHA);
					setState(229);
					match(CORCHC);
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDF:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
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
			case FUNCTION:
			case PROCEDURE:
			case RETURNS:
			case LANGUAGE:
			case TRIGGER:
			case BEFORE:
			case AFTER:
			case INSTEAD:
			case OF:
			case EACH:
			case ROW:
			case EXECUTE:
			case STATEMENT:
			case TRUNCATE:
			case USE:
			case NO:
			case ACTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
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
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
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
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				select();
				setState(240);
				match(PUNTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				create();
				setState(243);
				match(PUNTOCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				expr(0);
				setState(246);
				match(PUNTOCOMA);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				delete();
				setState(249);
				match(PUNTOCOMA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				update();
				setState(252);
				match(PUNTOCOMA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				alter();
				setState(255);
				match(PUNTOCOMA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				drop();
				setState(258);
				match(PUNTOCOMA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(260);
				insert();
				setState(261);
				match(PUNTOCOMA);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(263);
				grant();
				setState(264);
				match(PUNTOCOMA);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(266);
				revoke();
				setState(267);
				match(PUNTOCOMA);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(269);
				transaccion();
				setState(270);
				match(PUNTOCOMA);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(272);
				use();
				setState(273);
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
	public static class UseContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(ExprParser.USE, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(USE);
			setState(278);
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
		enterRule(_localctx, 12, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(SELECT);
			setState(281);
			lista_columnas();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(282);
				match(FROM);
				setState(283);
				lista_tablas();
				}
			}

			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(286);
				match(WHERE);
				setState(287);
				expr(0);
				}
			}

			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(290);
				match(GROUP);
				setState(291);
				match(BY);
				setState(292);
				lista_expresiones();
				}
			}

			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(295);
				match(HAVING);
				setState(296);
				expr(0);
				}
			}

			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(299);
				match(ORDER);
				setState(300);
				match(BY);
				setState(301);
				lista_ordenamiento();
				}
			}

			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(304);
				match(LIMIT);
				setState(305);
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
		enterRule(_localctx, 14, RULE_lista_expresiones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			expr(0);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(309);
				match(COMA);
				setState(310);
				expr(0);
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
	public static class Nombre_calificadoContext extends ParserRuleContext {
		public List<IdentiContext> identi() {
			return getRuleContexts(IdentiContext.class);
		}
		public IdentiContext identi(int i) {
			return getRuleContext(IdentiContext.class,i);
		}
		public TerminalNode PUNTO() { return getToken(ExprParser.PUNTO, 0); }
		public Nombre_calificadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_calificado; }
	}

	public final Nombre_calificadoContext nombre_calificado() throws RecognitionException {
		Nombre_calificadoContext _localctx = new Nombre_calificadoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nombre_calificado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			identi();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTO) {
				{
				setState(317);
				match(PUNTO);
				setState(318);
				identi();
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
	public static class Lista_nomb_caliContext extends ParserRuleContext {
		public List<Nombre_calificadoContext> nombre_calificado() {
			return getRuleContexts(Nombre_calificadoContext.class);
		}
		public Nombre_calificadoContext nombre_calificado(int i) {
			return getRuleContext(Nombre_calificadoContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public Lista_nomb_caliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_nomb_cali; }
	}

	public final Lista_nomb_caliContext lista_nomb_cali() throws RecognitionException {
		Lista_nomb_caliContext _localctx = new Lista_nomb_caliContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lista_nomb_cali);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			nombre_calificado();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(322);
				match(COMA);
				setState(323);
				nombre_calificado();
				}
				}
				setState(328);
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
		public List<Nombre_calificadoContext> nombre_calificado() {
			return getRuleContexts(Nombre_calificadoContext.class);
		}
		public Nombre_calificadoContext nombre_calificado(int i) {
			return getRuleContext(Nombre_calificadoContext.class,i);
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
		enterRule(_localctx, 20, RULE_tabla_origen);
		int _la;
		try {
			setState(345);
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
			case FUNCTION:
			case PROCEDURE:
			case RETURNS:
			case LANGUAGE:
			case TRIGGER:
			case BEFORE:
			case AFTER:
			case INSTEAD:
			case OF:
			case EACH:
			case ROW:
			case EXECUTE:
			case STATEMENT:
			case TRUNCATE:
			case USE:
			case NO:
			case ACTION:
			case IDF:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				nombre_calificado();
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(330);
						match(AS);
						}
					}

					setState(333);
					nombre_calificado();
					}
					break;
				}
				}
				break;
			case PARENTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(PARENTA);
				setState(337);
				select();
				setState(338);
				match(PARENTC);
				setState(343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(339);
						match(AS);
						}
					}

					setState(342);
					nombre_calificado();
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
		enterRule(_localctx, 22, RULE_join);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(347);
					match(INNER);
					}
				}

				setState(350);
				match(JOIN);
				setState(351);
				tabla_origen();
				setState(352);
				match(ON);
				setState(353);
				expr(0);
				}
				break;
			case RIGHT:
			case LEFT:
			case FULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046609408L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(356);
					match(OUTER);
					}
				}

				setState(359);
				match(JOIN);
				setState(360);
				tabla_origen();
				setState(361);
				match(ON);
				setState(362);
				expr(0);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(CROSS);
				setState(365);
				match(JOIN);
				setState(366);
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
		enterRule(_localctx, 24, RULE_tabla_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			tabla_origen();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13194140172288L) != 0)) {
				{
				{
				setState(370);
				join();
				}
				}
				setState(375);
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
		enterRule(_localctx, 26, RULE_ordenamiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			expr(0);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(377);
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
		enterRule(_localctx, 28, RULE_lista_ordenamiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			ordenamiento();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(381);
				match(COMA);
				setState(382);
				ordenamiento();
				}
				}
				setState(387);
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
		public List<Elemento_selectContext> elemento_select() {
			return getRuleContexts(Elemento_selectContext.class);
		}
		public Elemento_selectContext elemento_select(int i) {
			return getRuleContext(Elemento_selectContext.class,i);
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
		enterRule(_localctx, 30, RULE_lista_columnas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			elemento_select();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(389);
				match(COMA);
				setState(390);
				elemento_select();
				}
				}
				setState(395);
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
	public static class Elemento_selectContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACION() { return getToken(ExprParser.MULTIPLICACION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExprParser.AS, 0); }
		public Elemento_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento_select; }
	}

	public final Elemento_selectContext elemento_select() throws RecognitionException {
		Elemento_selectContext _localctx = new Elemento_selectContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elemento_select);
		int _la;
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLICACION:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(MULTIPLICACION);
				}
				break;
			case NULL:
			case NOT:
			case TRUE:
			case FALSE:
			case CAST:
			case ARRAY:
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
			case FUNCTION:
			case PROCEDURE:
			case RETURNS:
			case LANGUAGE:
			case TRIGGER:
			case BEFORE:
			case AFTER:
			case INSTEAD:
			case OF:
			case EACH:
			case ROW:
			case EXECUTE:
			case STATEMENT:
			case TRUNCATE:
			case USE:
			case NO:
			case ACTION:
			case PARENTA:
			case CADENA:
			case NUM:
			case IDF:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				expr(0);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & -511L) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & -9223372019674923009L) != 0)) {
					{
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(398);
						match(AS);
						}
					}

					setState(401);
					identi();
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
		enterRule(_localctx, 34, RULE_lista_tablas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			tabla_ref();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(407);
				match(COMA);
				setState(408);
				tabla_ref();
				}
				}
				setState(413);
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
		enterRule(_localctx, 36, RULE_referencia_columna);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				identi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				identi();
				setState(416);
				match(PUNTO);
				setState(417);
				identi();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				identi();
				setState(420);
				match(PUNTO);
				setState(421);
				identi();
				setState(422);
				match(PUNTO);
				setState(423);
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
		enterRule(_localctx, 38, RULE_funciones_agg);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(SUM);
				setState(428);
				match(PARENTA);
				setState(429);
				expr(0);
				setState(430);
				match(PARENTC);
				}
				break;
			case AVG:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(AVG);
				setState(433);
				match(PARENTA);
				setState(434);
				expr(0);
				setState(435);
				match(PARENTC);
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				match(COUNT);
				setState(438);
				match(PARENTA);
				setState(441);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULTIPLICACION:
					{
					setState(439);
					match(MULTIPLICACION);
					}
					break;
				case NULL:
				case NOT:
				case TRUE:
				case FALSE:
				case CAST:
				case ARRAY:
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
				case FUNCTION:
				case PROCEDURE:
				case RETURNS:
				case LANGUAGE:
				case TRIGGER:
				case BEFORE:
				case AFTER:
				case INSTEAD:
				case OF:
				case EACH:
				case ROW:
				case EXECUTE:
				case STATEMENT:
				case TRUNCATE:
				case USE:
				case NO:
				case ACTION:
				case PARENTA:
				case CADENA:
				case NUM:
				case IDF:
					{
					setState(440);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(443);
				match(PARENTC);
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(444);
				match(MIN);
				setState(445);
				match(PARENTA);
				setState(446);
				expr(0);
				setState(447);
				match(PARENTC);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 5);
				{
				setState(449);
				match(MAX);
				setState(450);
				match(PARENTA);
				setState(451);
				expr(0);
				setState(452);
				match(PARENTC);
				}
				break;
			case RANK:
				enterOuterAlt(_localctx, 6);
				{
				setState(454);
				match(RANK);
				setState(455);
				match(PARENTA);
				setState(456);
				expr(0);
				setState(457);
				match(PARENTC);
				}
				break;
			case RANDOM:
				enterOuterAlt(_localctx, 7);
				{
				setState(459);
				match(RANDOM);
				setState(460);
				match(PARENTA);
				setState(461);
				match(PARENTC);
				}
				break;
			case MD5:
				enterOuterAlt(_localctx, 8);
				{
				setState(462);
				match(MD5);
				setState(463);
				match(PARENTA);
				setState(464);
				expr(0);
				setState(465);
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
		public Create_functionContext create_function() {
			return getRuleContext(Create_functionContext.class,0);
		}
		public Create_procedureContext create_procedure() {
			return getRuleContext(Create_procedureContext.class,0);
		}
		public Create_triggerContext create_trigger() {
			return getRuleContext(Create_triggerContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_create);
		try {
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				create_schema();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				create_database();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				create_user();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(472);
				create_table();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(473);
				create_index();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(474);
				create_view();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(475);
				create_function();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(476);
				create_procedure();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(477);
				create_trigger();
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
		enterRule(_localctx, 42, RULE_create_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(CREATE);
			setState(481);
			match(SCHEMA);
			setState(482);
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
		enterRule(_localctx, 44, RULE_create_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(CREATE);
			setState(485);
			match(DATABASE);
			setState(486);
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
		public List<Opcion_usuarioContext> opcion_usuario() {
			return getRuleContexts(Opcion_usuarioContext.class);
		}
		public Opcion_usuarioContext opcion_usuario(int i) {
			return getRuleContext(Opcion_usuarioContext.class,i);
		}
		public Create_userContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_user; }
	}

	public final Create_userContext create_user() throws RecognitionException {
		Create_userContext _localctx = new Create_userContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_create_user);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(CREATE);
			setState(489);
			_la = _input.LA(1);
			if ( !(_la==USER || _la==ROLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(490);
			identi();
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(491);
				match(WITH);
				}
			}

			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 16321L) != 0)) {
				{
				{
				setState(494);
				opcion_usuario();
				}
				}
				setState(499);
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
	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public Nombre_calificadoContext nombre_calificado() {
			return getRuleContext(Nombre_calificadoContext.class,0);
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
		enterRule(_localctx, 48, RULE_create_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(CREATE);
			setState(501);
			match(TABLE);
			setState(502);
			nombre_calificado();
			setState(503);
			match(PARENTA);
			setState(504);
			lista_columnas_def();
			setState(505);
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
		public Nombre_calificadoContext nombre_calificado() {
			return getRuleContext(Nombre_calificadoContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_create_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(CREATE);
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(508);
				match(UNIQUE);
				}
			}

			setState(511);
			match(INDEX);
			setState(512);
			identi();
			setState(513);
			match(ON);
			setState(514);
			nombre_calificado();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(515);
				match(USING);
				setState(516);
				identi();
				}
			}

			setState(519);
			match(PARENTA);
			setState(520);
			lista_ordenamiento();
			setState(521);
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
		public Nombre_calificadoContext nombre_calificado() {
			return getRuleContext(Nombre_calificadoContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExprParser.AS, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode OR() { return getToken(ExprParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(ExprParser.REPLACE, 0); }
		public Create_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view; }
	}

	public final Create_viewContext create_view() throws RecognitionException {
		Create_viewContext _localctx = new Create_viewContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_create_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(CREATE);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(524);
				match(OR);
				setState(525);
				match(REPLACE);
				}
			}

			setState(528);
			match(VIEW);
			setState(529);
			nombre_calificado();
			setState(530);
			match(AS);
			setState(531);
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
	public static class Create_functionContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(ExprParser.FUNCTION, 0); }
		public Nombre_calificadoContext nombre_calificado() {
			return getRuleContext(Nombre_calificadoContext.class,0);
		}
		public TerminalNode PARENTA() { return getToken(ExprParser.PARENTA, 0); }
		public TerminalNode PARENTC() { return getToken(ExprParser.PARENTC, 0); }
		public TerminalNode RETURNS() { return getToken(ExprParser.RETURNS, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode LANGUAGE() { return getToken(ExprParser.LANGUAGE, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExprParser.AS, 0); }
		public Cuerpo_funcionContext cuerpo_funcion() {
			return getRuleContext(Cuerpo_funcionContext.class,0);
		}
		public TerminalNode OR() { return getToken(ExprParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(ExprParser.REPLACE, 0); }
		public Para_funcionContext para_funcion() {
			return getRuleContext(Para_funcionContext.class,0);
		}
		public Create_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function; }
	}

	public final Create_functionContext create_function() throws RecognitionException {
		Create_functionContext _localctx = new Create_functionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_create_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(CREATE);
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(534);
				match(OR);
				setState(535);
				match(REPLACE);
				}
			}

			setState(538);
			match(FUNCTION);
			setState(539);
			nombre_calificado();
			setState(540);
			match(PARENTA);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & -1L) != 0) || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & 18014398543036383L) != 0)) {
				{
				setState(541);
				para_funcion();
				}
			}

			setState(544);
			match(PARENTC);
			setState(545);
			match(RETURNS);
			setState(546);
			tipo_dato();
			setState(547);
			match(LANGUAGE);
			setState(548);
			identi();
			setState(549);
			match(AS);
			setState(550);
			cuerpo_funcion();
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
	public static class Create_procedureContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode PROCEDURE() { return getToken(ExprParser.PROCEDURE, 0); }
		public Nombre_calificadoContext nombre_calificado() {
			return getRuleContext(Nombre_calificadoContext.class,0);
		}
		public TerminalNode PARENTA() { return getToken(ExprParser.PARENTA, 0); }
		public TerminalNode PARENTC() { return getToken(ExprParser.PARENTC, 0); }
		public TerminalNode LANGUAGE() { return getToken(ExprParser.LANGUAGE, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode AS() { return getToken(ExprParser.AS, 0); }
		public Cuerpo_funcionContext cuerpo_funcion() {
			return getRuleContext(Cuerpo_funcionContext.class,0);
		}
		public TerminalNode OR() { return getToken(ExprParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(ExprParser.REPLACE, 0); }
		public Para_funcionContext para_funcion() {
			return getRuleContext(Para_funcionContext.class,0);
		}
		public Create_procedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure; }
	}

	public final Create_procedureContext create_procedure() throws RecognitionException {
		Create_procedureContext _localctx = new Create_procedureContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_create_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(CREATE);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(553);
				match(OR);
				setState(554);
				match(REPLACE);
				}
			}

			setState(557);
			match(PROCEDURE);
			setState(558);
			nombre_calificado();
			setState(559);
			match(PARENTA);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & -1L) != 0) || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & 18014398543036383L) != 0)) {
				{
				setState(560);
				para_funcion();
				}
			}

			setState(563);
			match(PARENTC);
			setState(564);
			match(LANGUAGE);
			setState(565);
			identi();
			setState(566);
			match(AS);
			setState(567);
			cuerpo_funcion();
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
	public static class Create_triggerContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode TRIGGER() { return getToken(ExprParser.TRIGGER, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public List<Event_triggerContext> event_trigger() {
			return getRuleContexts(Event_triggerContext.class);
		}
		public Event_triggerContext event_trigger(int i) {
			return getRuleContext(Event_triggerContext.class,i);
		}
		public TerminalNode ON() { return getToken(ExprParser.ON, 0); }
		public List<Nombre_calificadoContext> nombre_calificado() {
			return getRuleContexts(Nombre_calificadoContext.class);
		}
		public Nombre_calificadoContext nombre_calificado(int i) {
			return getRuleContext(Nombre_calificadoContext.class,i);
		}
		public TerminalNode FOR() { return getToken(ExprParser.FOR, 0); }
		public TerminalNode EACH() { return getToken(ExprParser.EACH, 0); }
		public TerminalNode EXECUTE() { return getToken(ExprParser.EXECUTE, 0); }
		public TerminalNode PARENTA() { return getToken(ExprParser.PARENTA, 0); }
		public TerminalNode PARENTC() { return getToken(ExprParser.PARENTC, 0); }
		public TerminalNode ROW() { return getToken(ExprParser.ROW, 0); }
		public TerminalNode STATEMENT() { return getToken(ExprParser.STATEMENT, 0); }
		public TerminalNode FUNCTION() { return getToken(ExprParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(ExprParser.PROCEDURE, 0); }
		public TerminalNode BEFORE() { return getToken(ExprParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(ExprParser.AFTER, 0); }
		public TerminalNode INSTEAD() { return getToken(ExprParser.INSTEAD, 0); }
		public TerminalNode OF() { return getToken(ExprParser.OF, 0); }
		public List<TerminalNode> OR() { return getTokens(ExprParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ExprParser.OR, i);
		}
		public Create_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger; }
	}

	public final Create_triggerContext create_trigger() throws RecognitionException {
		Create_triggerContext _localctx = new Create_triggerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_create_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(CREATE);
			setState(570);
			match(TRIGGER);
			setState(571);
			identi();
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEFORE:
				{
				setState(572);
				match(BEFORE);
				}
				break;
			case AFTER:
				{
				setState(573);
				match(AFTER);
				}
				break;
			case INSTEAD:
				{
				setState(574);
				match(INSTEAD);
				setState(575);
				match(OF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(578);
			event_trigger();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(579);
				match(OR);
				setState(580);
				event_trigger();
				}
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(586);
			match(ON);
			setState(587);
			nombre_calificado();
			setState(588);
			match(FOR);
			setState(589);
			match(EACH);
			setState(590);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==STATEMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(591);
			match(EXECUTE);
			setState(592);
			_la = _input.LA(1);
			if ( !(_la==FUNCTION || _la==PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(593);
			nombre_calificado();
			setState(594);
			match(PARENTA);
			setState(595);
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
	public static class Event_triggerContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ExprParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(ExprParser.UPDATE, 0); }
		public TerminalNode OF() { return getToken(ExprParser.OF, 0); }
		public Lista_identiContext lista_identi() {
			return getRuleContext(Lista_identiContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(ExprParser.DELETE, 0); }
		public TerminalNode TRUNCATE() { return getToken(ExprParser.TRUNCATE, 0); }
		public Event_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_trigger; }
	}

	public final Event_triggerContext event_trigger() throws RecognitionException {
		Event_triggerContext _localctx = new Event_triggerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_event_trigger);
		int _la;
		try {
			setState(605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(INSERT);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				match(UPDATE);
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OF) {
					{
					setState(599);
					match(OF);
					setState(600);
					lista_identi();
					}
				}

				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				match(DELETE);
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(604);
				match(TRUNCATE);
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
	public static class Restriccion_colContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ExprParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ExprParser.KEY, 0); }
		public TerminalNode CONSTRAINT() { return getToken(ExprParser.CONSTRAINT, 0); }
		public List<IdentiContext> identi() {
			return getRuleContexts(IdentiContext.class);
		}
		public IdentiContext identi(int i) {
			return getRuleContext(IdentiContext.class,i);
		}
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
		public Nombre_calificadoContext nombre_calificado() {
			return getRuleContext(Nombre_calificadoContext.class,0);
		}
		public Clausula_referencialContext clausula_referencial() {
			return getRuleContext(Clausula_referencialContext.class,0);
		}
		public Restriccion_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restriccion_col; }
	}

	public final Restriccion_colContext restriccion_col() throws RecognitionException {
		Restriccion_colContext _localctx = new Restriccion_colContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_restriccion_col);
		int _la;
		try {
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(607);
					match(CONSTRAINT);
					setState(608);
					identi();
					}
				}

				setState(611);
				match(PRIMARY);
				setState(612);
				match(KEY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(613);
					match(CONSTRAINT);
					setState(614);
					identi();
					}
				}

				setState(617);
				match(NOT);
				setState(618);
				match(NULL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(619);
					match(CONSTRAINT);
					setState(620);
					identi();
					}
				}

				setState(623);
				match(NOTNULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(624);
					match(CONSTRAINT);
					setState(625);
					identi();
					}
				}

				setState(628);
				match(CHECK);
				setState(629);
				match(PARENTA);
				setState(630);
				expr(0);
				setState(631);
				match(PARENTC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(633);
					match(CONSTRAINT);
					setState(634);
					identi();
					}
				}

				setState(637);
				match(UNIQUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(638);
					match(CONSTRAINT);
					setState(639);
					identi();
					}
				}

				setState(642);
				match(DEFAULT);
				setState(643);
				expr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(644);
					match(CONSTRAINT);
					setState(645);
					identi();
					}
				}

				setState(648);
				match(REFERENCES);
				setState(649);
				nombre_calificado();
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(650);
					match(PARENTA);
					setState(651);
					identi();
					setState(652);
					match(PARENTC);
					}
				}

				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(656);
					clausula_referencial();
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
	public static class Accion_referencialContext extends ParserRuleContext {
		public TerminalNode CASCADE() { return getToken(ExprParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(ExprParser.RESTRICT, 0); }
		public TerminalNode SET() { return getToken(ExprParser.SET, 0); }
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(ExprParser.DEFAULT, 0); }
		public TerminalNode NO() { return getToken(ExprParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(ExprParser.ACTION, 0); }
		public Accion_referencialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion_referencial; }
	}

	public final Accion_referencialContext accion_referencial() throws RecognitionException {
		Accion_referencialContext _localctx = new Accion_referencialContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_accion_referencial);
		try {
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(661);
				match(CASCADE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
				match(RESTRICT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(663);
				match(SET);
				setState(664);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
				match(SET);
				setState(666);
				match(DEFAULT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(667);
				match(NO);
				setState(668);
				match(ACTION);
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
	public static class Clausula_referencialContext extends ParserRuleContext {
		public List<TerminalNode> ON() { return getTokens(ExprParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(ExprParser.ON, i);
		}
		public TerminalNode DELETE() { return getToken(ExprParser.DELETE, 0); }
		public List<Accion_referencialContext> accion_referencial() {
			return getRuleContexts(Accion_referencialContext.class);
		}
		public Accion_referencialContext accion_referencial(int i) {
			return getRuleContext(Accion_referencialContext.class,i);
		}
		public TerminalNode UPDATE() { return getToken(ExprParser.UPDATE, 0); }
		public Clausula_referencialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clausula_referencial; }
	}

	public final Clausula_referencialContext clausula_referencial() throws RecognitionException {
		Clausula_referencialContext _localctx = new Clausula_referencialContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_clausula_referencial);
		int _la;
		try {
			setState(687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				match(ON);
				setState(672);
				match(DELETE);
				setState(673);
				accion_referencial();
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(674);
					match(ON);
					setState(675);
					match(UPDATE);
					setState(676);
					accion_referencial();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				match(ON);
				setState(680);
				match(UPDATE);
				setState(681);
				accion_referencial();
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(682);
					match(ON);
					setState(683);
					match(DELETE);
					setState(684);
					accion_referencial();
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
	public static class Cuerpo_funcionContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(ExprParser.CADENA, 0); }
		public TerminalNode CADENA_DIN() { return getToken(ExprParser.CADENA_DIN, 0); }
		public Cuerpo_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_funcion; }
	}

	public final Cuerpo_funcionContext cuerpo_funcion() throws RecognitionException {
		Cuerpo_funcionContext _localctx = new Cuerpo_funcionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cuerpo_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			_la = _input.LA(1);
			if ( !(_la==CADENA || _la==CADENA_DIN) ) {
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
		enterRule(_localctx, 70, RULE_lista_identi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			identi();
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(692);
				match(COMA);
				setState(693);
				identi();
				}
				}
				setState(698);
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
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(ExprParser.FOREIGN, 0); }
		public TerminalNode REFERENCES() { return getToken(ExprParser.REFERENCES, 0); }
		public Nombre_calificadoContext nombre_calificado() {
			return getRuleContext(Nombre_calificadoContext.class,0);
		}
		public Clausula_referencialContext clausula_referencial() {
			return getRuleContext(Clausula_referencialContext.class,0);
		}
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
		enterRule(_localctx, 72, RULE_restricciones_tabla);
		int _la;
		try {
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(699);
					match(CONSTRAINT);
					setState(700);
					identi();
					}
				}

				setState(703);
				match(PRIMARY);
				setState(704);
				match(KEY);
				setState(705);
				match(PARENTA);
				setState(706);
				lista_identi();
				setState(707);
				match(PARENTC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(709);
					match(CONSTRAINT);
					setState(710);
					identi();
					}
				}

				setState(713);
				match(FOREIGN);
				setState(714);
				match(KEY);
				setState(715);
				match(PARENTA);
				setState(716);
				lista_identi();
				setState(717);
				match(PARENTC);
				setState(718);
				match(REFERENCES);
				setState(719);
				nombre_calificado();
				setState(720);
				match(PARENTA);
				setState(721);
				lista_identi();
				setState(722);
				match(PARENTC);
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(723);
					clausula_referencial();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(726);
					match(CONSTRAINT);
					setState(727);
					identi();
					}
				}

				setState(730);
				match(UNIQUE);
				setState(731);
				match(PARENTA);
				setState(732);
				lista_identi();
				setState(733);
				match(PARENTC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(735);
					match(CONSTRAINT);
					setState(736);
					identi();
					}
				}

				setState(739);
				match(CHECK);
				setState(740);
				match(PARENTA);
				setState(741);
				expr(0);
				setState(742);
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
		enterRule(_localctx, 74, RULE_elemento_tabla);
		try {
			setState(748);
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
			case FUNCTION:
			case PROCEDURE:
			case RETURNS:
			case LANGUAGE:
			case TRIGGER:
			case BEFORE:
			case AFTER:
			case INSTEAD:
			case OF:
			case EACH:
			case ROW:
			case EXECUTE:
			case STATEMENT:
			case TRUNCATE:
			case USE:
			case NO:
			case ACTION:
			case IDF:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
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
				setState(747);
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
		enterRule(_localctx, 76, RULE_lista_columnas_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			elemento_tabla();
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(751);
				match(COMA);
				setState(752);
				elemento_tabla();
				}
				}
				setState(757);
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
		enterRule(_localctx, 78, RULE_columna_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			identi();
			setState(759);
			tipo_dato();
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1683941752864L) != 0)) {
				{
				{
				setState(760);
				restriccion_col();
				}
				}
				setState(765);
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
		enterRule(_localctx, 80, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(DELETE);
			setState(767);
			match(FROM);
			setState(768);
			tabla_origen();
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(769);
				match(WHERE);
				setState(770);
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
		enterRule(_localctx, 82, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(UPDATE);
			setState(774);
			tabla_origen();
			setState(775);
			match(SET);
			setState(776);
			asignacion_upd();
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(777);
				match(COMA);
				setState(778);
				asignacion_upd();
				}
				}
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(784);
				match(WHERE);
				setState(785);
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
		enterRule(_localctx, 84, RULE_asignacion_upd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			referencia_columna();
			setState(789);
			match(IGUAL);
			setState(790);
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
		public TerminalNode SET() { return getToken(ExprParser.SET, 0); }
		public TerminalNode SCHEMA() { return getToken(ExprParser.SCHEMA, 0); }
		public TerminalNode ALTER() { return getToken(ExprParser.ALTER, 0); }
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
		enterRule(_localctx, 86, RULE_alter_accion);
		int _la;
		try {
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				match(ADD);
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(793);
					match(COLUMN);
					}
				}

				setState(796);
				columna_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				match(DROP);
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(798);
					match(COLUMN);
					}
				}

				setState(801);
				identi();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(802);
				match(ADD);
				setState(803);
				restricciones_tabla();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(804);
				match(DROP);
				setState(805);
				match(CONSTRAINT);
				setState(806);
				identi();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(807);
				match(SET);
				setState(808);
				match(SCHEMA);
				setState(809);
				identi();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(810);
				match(ALTER);
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(811);
					match(COLUMN);
					}
				}

				setState(814);
				identi();
				setState(815);
				match(SET);
				setState(816);
				tipo_dato();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(818);
				match(ALTER);
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(819);
					match(COLUMN);
					}
				}

				setState(822);
				identi();
				setState(823);
				match(SET);
				setState(824);
				match(DEFAULT);
				setState(825);
				expr(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(827);
				match(ALTER);
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(828);
					match(COLUMN);
					}
				}

				setState(831);
				identi();
				setState(832);
				match(DROP);
				setState(833);
				match(DEFAULT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(835);
				match(ALTER);
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(836);
					match(COLUMN);
					}
				}

				setState(839);
				identi();
				setState(840);
				_la = _input.LA(1);
				if ( !(_la==SET || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(841);
				match(NOT);
				setState(842);
				match(NULL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(844);
				match(RENAME);
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(845);
					match(COLUMN);
					}
				}

				setState(848);
				identi();
				setState(849);
				match(TO);
				setState(850);
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
		public Alter_functionContext alter_function() {
			return getRuleContext(Alter_functionContext.class,0);
		}
		public Alter_viewContext alter_view() {
			return getRuleContext(Alter_viewContext.class,0);
		}
		public AlterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter; }
	}

	public final AlterContext alter() throws RecognitionException {
		AlterContext _localctx = new AlterContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_alter);
		try {
			setState(861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				alter_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				alter_schema();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(856);
				alter_database();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(857);
				alter_user();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(858);
				alter_index();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(859);
				alter_function();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(860);
				alter_view();
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
		public Nombre_calificadoContext nombre_calificado() {
			return getRuleContext(Nombre_calificadoContext.class,0);
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
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public Alter_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table; }
	}

	public final Alter_tableContext alter_table() throws RecognitionException {
		Alter_tableContext _localctx = new Alter_tableContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_alter_table);
		int _la;
		try {
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(863);
				match(ALTER);
				setState(864);
				match(TABLE);
				setState(865);
				nombre_calificado();
				setState(866);
				alter_accion();
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(867);
					match(COMA);
					setState(868);
					alter_accion();
					}
					}
					setState(873);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				match(ALTER);
				setState(875);
				match(TABLE);
				setState(876);
				nombre_calificado();
				setState(877);
				match(RENAME);
				setState(878);
				match(TO);
				setState(879);
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
		enterRule(_localctx, 92, RULE_alter_schema);
		try {
			setState(897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				match(ALTER);
				setState(884);
				match(SCHEMA);
				setState(885);
				identi();
				setState(886);
				match(RENAME);
				setState(887);
				match(TO);
				setState(888);
				identi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				match(ALTER);
				setState(891);
				match(SCHEMA);
				setState(892);
				identi();
				setState(893);
				match(OWNER);
				setState(894);
				match(TO);
				setState(895);
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
		enterRule(_localctx, 94, RULE_alter_database);
		try {
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(899);
				match(ALTER);
				setState(900);
				match(DATABASE);
				setState(901);
				identi();
				setState(902);
				match(RENAME);
				setState(903);
				match(TO);
				setState(904);
				identi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(906);
				match(ALTER);
				setState(907);
				match(DATABASE);
				setState(908);
				identi();
				setState(909);
				match(OWNER);
				setState(910);
				match(TO);
				setState(911);
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
		public TerminalNode PASSWORD() { return getToken(ExprParser.PASSWORD, 0); }
		public TerminalNode CADENA() { return getToken(ExprParser.CADENA, 0); }
		public Opcion_usuarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcion_usuario; }
	}

	public final Opcion_usuarioContext opcion_usuario() throws RecognitionException {
		Opcion_usuarioContext _localctx = new Opcion_usuarioContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_opcion_usuario);
		try {
			setState(925);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(915);
				match(LOGIN);
				}
				break;
			case NOLOGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(916);
				match(NOLOGIN);
				}
				break;
			case SUPERUSER:
				enterOuterAlt(_localctx, 3);
				{
				setState(917);
				match(SUPERUSER);
				}
				break;
			case NOSUPERUSER:
				enterOuterAlt(_localctx, 4);
				{
				setState(918);
				match(NOSUPERUSER);
				}
				break;
			case CREATEDB:
				enterOuterAlt(_localctx, 5);
				{
				setState(919);
				match(CREATEDB);
				}
				break;
			case NOCREATEDB:
				enterOuterAlt(_localctx, 6);
				{
				setState(920);
				match(NOCREATEDB);
				}
				break;
			case CREATEROLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(921);
				match(CREATEROLE);
				}
				break;
			case NOCREATEROLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(922);
				match(NOCREATEROLE);
				}
				break;
			case PASSWORD:
				enterOuterAlt(_localctx, 9);
				{
				setState(923);
				match(PASSWORD);
				setState(924);
				match(CADENA);
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
		enterRule(_localctx, 98, RULE_alter_user);
		int _la;
		try {
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(927);
				match(ALTER);
				setState(928);
				_la = _input.LA(1);
				if ( !(_la==USER || _la==ROLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(929);
				identi();
				setState(930);
				match(RENAME);
				setState(931);
				match(TO);
				setState(932);
				identi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(934);
				match(ALTER);
				setState(935);
				_la = _input.LA(1);
				if ( !(_la==USER || _la==ROLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(936);
				identi();
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(937);
					match(WITH);
					}
				}

				setState(941); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(940);
					opcion_usuario();
					}
					}
					setState(943); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 16321L) != 0) );
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
		enterRule(_localctx, 100, RULE_alter_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(ALTER);
			setState(948);
			match(INDEX);
			setState(949);
			identi();
			setState(950);
			match(RENAME);
			setState(951);
			match(TO);
			setState(952);
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
	public static class Alter_functionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(ExprParser.ALTER, 0); }
		public Nombre_calificadoContext nombre_calificado() {
			return getRuleContext(Nombre_calificadoContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(ExprParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(ExprParser.TO, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(ExprParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(ExprParser.PROCEDURE, 0); }
		public TerminalNode PARENTA() { return getToken(ExprParser.PARENTA, 0); }
		public Para_funcionContext para_funcion() {
			return getRuleContext(Para_funcionContext.class,0);
		}
		public TerminalNode PARENTC() { return getToken(ExprParser.PARENTC, 0); }
		public TerminalNode OWNER() { return getToken(ExprParser.OWNER, 0); }
		public Alter_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_function; }
	}

	public final Alter_functionContext alter_function() throws RecognitionException {
		Alter_functionContext _localctx = new Alter_functionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_alter_function);
		int _la;
		try {
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				match(ALTER);
				setState(955);
				_la = _input.LA(1);
				if ( !(_la==FUNCTION || _la==PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(956);
				nombre_calificado();
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(957);
					match(PARENTA);
					setState(958);
					para_funcion();
					setState(959);
					match(PARENTC);
					}
				}

				setState(963);
				match(RENAME);
				setState(964);
				match(TO);
				setState(965);
				identi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				match(ALTER);
				setState(968);
				_la = _input.LA(1);
				if ( !(_la==FUNCTION || _la==PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(969);
				nombre_calificado();
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTA) {
					{
					setState(970);
					match(PARENTA);
					setState(971);
					para_funcion();
					setState(972);
					match(PARENTC);
					}
				}

				setState(976);
				match(OWNER);
				setState(977);
				match(TO);
				setState(978);
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
	public static class Alter_viewContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(ExprParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(ExprParser.VIEW, 0); }
		public Nombre_calificadoContext nombre_calificado() {
			return getRuleContext(Nombre_calificadoContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(ExprParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(ExprParser.TO, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode OWNER() { return getToken(ExprParser.OWNER, 0); }
		public TerminalNode SET() { return getToken(ExprParser.SET, 0); }
		public TerminalNode SCHEMA() { return getToken(ExprParser.SCHEMA, 0); }
		public Alter_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_view; }
	}

	public final Alter_viewContext alter_view() throws RecognitionException {
		Alter_viewContext _localctx = new Alter_viewContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_alter_view);
		try {
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				match(ALTER);
				setState(983);
				match(VIEW);
				setState(984);
				nombre_calificado();
				setState(985);
				match(RENAME);
				setState(986);
				match(TO);
				setState(987);
				identi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(989);
				match(ALTER);
				setState(990);
				match(VIEW);
				setState(991);
				nombre_calificado();
				setState(992);
				match(OWNER);
				setState(993);
				match(TO);
				setState(994);
				identi();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(996);
				match(ALTER);
				setState(997);
				match(VIEW);
				setState(998);
				nombre_calificado();
				setState(999);
				match(SET);
				setState(1000);
				match(SCHEMA);
				setState(1001);
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
		public Drop_functionContext drop_function() {
			return getRuleContext(Drop_functionContext.class,0);
		}
		public Drop_triggerContext drop_trigger() {
			return getRuleContext(Drop_triggerContext.class,0);
		}
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop; }
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_drop);
		try {
			setState(1013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				drop_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
				drop_schema();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1007);
				drop_user();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1008);
				drop_database();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1009);
				drop_index();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1010);
				drop_view();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1011);
				drop_function();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1012);
				drop_trigger();
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
	public static class Lista_tipos_datoContext extends ParserRuleContext {
		public List<Tipo_datoContext> tipo_dato() {
			return getRuleContexts(Tipo_datoContext.class);
		}
		public Tipo_datoContext tipo_dato(int i) {
			return getRuleContext(Tipo_datoContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public Lista_tipos_datoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_tipos_dato; }
	}

	public final Lista_tipos_datoContext lista_tipos_dato() throws RecognitionException {
		Lista_tipos_datoContext _localctx = new Lista_tipos_datoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_lista_tipos_dato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			tipo_dato();
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(1016);
				match(COMA);
				setState(1017);
				tipo_dato();
				}
				}
				setState(1022);
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
	public static class Drop_tableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ExprParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public Lista_nomb_caliContext lista_nomb_cali() {
			return getRuleContext(Lista_nomb_caliContext.class,0);
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
		enterRule(_localctx, 110, RULE_drop_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			match(DROP);
			setState(1024);
			match(TABLE);
			setState(1027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1025);
				match(IF);
				setState(1026);
				match(EXISTS);
				}
				break;
			}
			setState(1029);
			lista_nomb_cali();
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1030);
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
		enterRule(_localctx, 112, RULE_drop_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(DROP);
			setState(1034);
			match(SCHEMA);
			setState(1037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1035);
				match(IF);
				setState(1036);
				match(EXISTS);
				}
				break;
			}
			setState(1039);
			identi();
			setState(1041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1040);
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
		enterRule(_localctx, 114, RULE_drop_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			match(DROP);
			setState(1044);
			match(DATABASE);
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1045);
				match(IF);
				setState(1046);
				match(EXISTS);
				}
				break;
			}
			setState(1049);
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
		enterRule(_localctx, 116, RULE_drop_user);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(DROP);
			setState(1052);
			_la = _input.LA(1);
			if ( !(_la==USER || _la==ROLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1053);
				match(IF);
				setState(1054);
				match(EXISTS);
				}
				break;
			}
			setState(1057);
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
		public Lista_nomb_caliContext lista_nomb_cali() {
			return getRuleContext(Lista_nomb_caliContext.class,0);
		}
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExprParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(ExprParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(ExprParser.RESTRICT, 0); }
		public Drop_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index; }
	}

	public final Drop_indexContext drop_index() throws RecognitionException {
		Drop_indexContext _localctx = new Drop_indexContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_drop_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			match(DROP);
			setState(1060);
			match(INDEX);
			setState(1063);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1061);
				match(IF);
				setState(1062);
				match(EXISTS);
				}
				break;
			}
			setState(1065);
			lista_nomb_cali();
			setState(1067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1066);
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
	public static class Drop_viewContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ExprParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(ExprParser.VIEW, 0); }
		public Lista_nomb_caliContext lista_nomb_cali() {
			return getRuleContext(Lista_nomb_caliContext.class,0);
		}
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExprParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(ExprParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(ExprParser.RESTRICT, 0); }
		public Drop_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view; }
	}

	public final Drop_viewContext drop_view() throws RecognitionException {
		Drop_viewContext _localctx = new Drop_viewContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_drop_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			match(DROP);
			setState(1070);
			match(VIEW);
			setState(1073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1071);
				match(IF);
				setState(1072);
				match(EXISTS);
				}
				break;
			}
			setState(1075);
			lista_nomb_cali();
			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1076);
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
	public static class Drop_functionContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ExprParser.DROP, 0); }
		public Nombre_calificadoContext nombre_calificado() {
			return getRuleContext(Nombre_calificadoContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(ExprParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(ExprParser.PROCEDURE, 0); }
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExprParser.EXISTS, 0); }
		public TerminalNode PARENTA() { return getToken(ExprParser.PARENTA, 0); }
		public TerminalNode PARENTC() { return getToken(ExprParser.PARENTC, 0); }
		public TerminalNode CASCADE() { return getToken(ExprParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(ExprParser.RESTRICT, 0); }
		public Lista_tipos_datoContext lista_tipos_dato() {
			return getRuleContext(Lista_tipos_datoContext.class,0);
		}
		public Drop_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_function; }
	}

	public final Drop_functionContext drop_function() throws RecognitionException {
		Drop_functionContext _localctx = new Drop_functionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_drop_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			match(DROP);
			setState(1080);
			_la = _input.LA(1);
			if ( !(_la==FUNCTION || _la==PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1081);
				match(IF);
				setState(1082);
				match(EXISTS);
				}
				break;
			}
			setState(1085);
			nombre_calificado();
			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTA) {
				{
				setState(1086);
				match(PARENTA);
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 34376515071L) != 0)) {
					{
					setState(1087);
					lista_tipos_dato();
					}
				}

				setState(1090);
				match(PARENTC);
				}
			}

			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1093);
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
	public static class Drop_triggerContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(ExprParser.DROP, 0); }
		public TerminalNode TRIGGER() { return getToken(ExprParser.TRIGGER, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode ON() { return getToken(ExprParser.ON, 0); }
		public Nombre_calificadoContext nombre_calificado() {
			return getRuleContext(Nombre_calificadoContext.class,0);
		}
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(ExprParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(ExprParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(ExprParser.RESTRICT, 0); }
		public Drop_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger; }
	}

	public final Drop_triggerContext drop_trigger() throws RecognitionException {
		Drop_triggerContext _localctx = new Drop_triggerContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_drop_trigger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			match(DROP);
			setState(1097);
			match(TRIGGER);
			setState(1100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1098);
				match(IF);
				setState(1099);
				match(EXISTS);
				}
				break;
			}
			setState(1102);
			identi();
			setState(1103);
			match(ON);
			setState(1104);
			nombre_calificado();
			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1105);
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
		enterRule(_localctx, 126, RULE_valores_fila);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			match(PARENTA);
			setState(1109);
			lista_expresiones();
			setState(1110);
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
		public Nombre_calificadoContext nombre_calificado() {
			return getRuleContext(Nombre_calificadoContext.class,0);
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
		enterRule(_localctx, 128, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			match(INSERT);
			setState(1113);
			match(INTO);
			setState(1114);
			nombre_calificado();
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTA) {
				{
				setState(1115);
				match(PARENTA);
				setState(1116);
				lista_identi();
				setState(1117);
				match(PARENTC);
				}
			}

			setState(1121);
			match(VALUES);
			setState(1122);
			valores_fila();
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(1123);
				match(COMA);
				setState(1124);
				valores_fila();
				}
				}
				setState(1129);
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
		public TerminalNode SELECT() { return getToken(ExprParser.SELECT, 0); }
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
		enterRule(_localctx, 130, RULE_privilegios);
		int _la;
		try {
			setState(1139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				match(INSERT);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
				match(SELECT);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1132);
				match(DELETE);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1133);
				match(UPDATE);
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1134);
				match(CREATE);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1135);
				match(ALL);
				setState(1137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(1136);
					match(PRIVILEGES);
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
		enterRule(_localctx, 132, RULE_lista_previ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			privilegios();
			setState(1146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(1142);
				match(COMA);
				setState(1143);
				privilegios();
				}
				}
				setState(1148);
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
		public Nombre_calificadoContext nombre_calificado() {
			return getRuleContext(Nombre_calificadoContext.class,0);
		}
		public TerminalNode TO() { return getToken(ExprParser.TO, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_grant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			match(GRANT);
			setState(1150);
			lista_previ();
			setState(1151);
			match(ON);
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(1152);
				match(TABLE);
				}
			}

			setState(1155);
			nombre_calificado();
			setState(1156);
			match(TO);
			setState(1157);
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
		public Nombre_calificadoContext nombre_calificado() {
			return getRuleContext(Nombre_calificadoContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ExprParser.FROM, 0); }
		public IdentiContext identi() {
			return getRuleContext(IdentiContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_revoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			match(REVOKE);
			setState(1160);
			lista_previ();
			setState(1161);
			match(ON);
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(1162);
				match(TABLE);
				}
			}

			setState(1165);
			nombre_calificado();
			setState(1166);
			match(FROM);
			setState(1167);
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
		enterRule(_localctx, 138, RULE_transaccion);
		int _la;
		try {
			setState(1181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1169);
				match(BEGIN);
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSACTION) {
					{
					setState(1170);
					match(TRANSACTION);
					}
				}

				}
				break;
			case COMMIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1173);
				match(COMMIT);
				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSACTION) {
					{
					setState(1174);
					match(TRANSACTION);
					}
				}

				}
				break;
			case ROLLBACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1177);
				match(ROLLBACK);
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRANSACTION) {
					{
					setState(1178);
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
	public static class Para_funcionContext extends ParserRuleContext {
		public List<Columna_defContext> columna_def() {
			return getRuleContexts(Columna_defContext.class);
		}
		public Columna_defContext columna_def(int i) {
			return getRuleContext(Columna_defContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public Para_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_funcion; }
	}

	public final Para_funcionContext para_funcion() throws RecognitionException {
		Para_funcionContext _localctx = new Para_funcionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_para_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			columna_def();
			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(1184);
				match(COMA);
				setState(1185);
				columna_def();
				}
				}
				setState(1190);
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
		public TerminalNode CAST() { return getToken(ExprParser.CAST, 0); }
		public TerminalNode AS() { return getToken(ExprParser.AS, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(ExprParser.ARRAY, 0); }
		public TerminalNode CORCHA() { return getToken(ExprParser.CORCHA, 0); }
		public Lista_expresionesContext lista_expresiones() {
			return getRuleContext(Lista_expresionesContext.class,0);
		}
		public TerminalNode CORCHC() { return getToken(ExprParser.CORCHC, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public Nombre_calificadoContext nombre_calificado() {
			return getRuleContext(Nombre_calificadoContext.class,0);
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
		public TerminalNode DOBLEPNTO() { return getToken(ExprParser.DOBLEPNTO, 0); }
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
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1192);
				match(PARENTA);
				setState(1193);
				expr(0);
				setState(1194);
				match(PARENTC);
				}
				break;
			case 2:
				{
				setState(1196);
				match(NOT);
				setState(1197);
				expr(20);
				}
				break;
			case 3:
				{
				setState(1198);
				match(CAST);
				setState(1199);
				match(PARENTA);
				setState(1200);
				expr(0);
				setState(1201);
				match(AS);
				setState(1202);
				tipo_dato();
				setState(1203);
				match(PARENTC);
				}
				break;
			case 4:
				{
				setState(1205);
				match(ARRAY);
				setState(1206);
				match(CORCHA);
				setState(1207);
				lista_expresiones();
				setState(1208);
				match(CORCHC);
				}
				break;
			case 5:
				{
				setState(1210);
				match(PARENTA);
				setState(1211);
				select();
				setState(1212);
				match(PARENTC);
				}
				break;
			case 6:
				{
				setState(1214);
				nombre_calificado();
				setState(1215);
				match(PARENTA);
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -281462085517312L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -36028797018963969L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 1786706659327L) != 0)) {
					{
					setState(1216);
					lista_expresiones();
					}
				}

				setState(1219);
				match(PARENTC);
				}
				break;
			case 7:
				{
				setState(1221);
				funciones_agg();
				}
				break;
			case 8:
				{
				setState(1222);
				referencia_columna();
				}
				break;
			case 9:
				{
				setState(1223);
				match(NUM);
				}
				break;
			case 10:
				{
				setState(1224);
				match(CADENA);
				}
				break;
			case 11:
				{
				setState(1225);
				match(TRUE);
				}
				break;
			case 12:
				{
				setState(1226);
				match(FALSE);
				}
				break;
			case 13:
				{
				setState(1227);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1256);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1230);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1231);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLICACION || _la==DIVISION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1232);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1233);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1234);
						match(SUMA);
						setState(1235);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1236);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1237);
						match(RESTA);
						setState(1238);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1239);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1240);
						_la = _input.LA(1);
						if ( !(_la==LIKE || _la==ILIKE || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 491521L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1241);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1242);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1243);
						match(AND);
						setState(1244);
						expr(16);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1245);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1246);
						match(OR);
						setState(1247);
						expr(15);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1248);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1249);
						match(DOBLEPNTO);
						setState(1250);
						tipo_dato();
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1251);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1252);
						match(CORCHA);
						setState(1253);
						expr(0);
						setState(1254);
						match(CORCHC);
						}
						break;
					}
					} 
				}
				setState(1260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
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
		case 71:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00ab\u04ee\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0001\u0000\u0004\u0000\u0092\b\u0000\u000b"+
		"\u0000\f\u0000\u0093\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u00a0\b\u0002\u0001\u0002\u0003\u0002\u00a3\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00aa\b\u0002"+
		"\u0001\u0002\u0003\u0002\u00ad\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00b3\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00b9\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u00c0\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00cb\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00d1\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00d7\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00e3\b\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u00e7\b\u0002\n\u0002\f\u0002\u00ea\t\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00ee\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0114\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u011d"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0121\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0126\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u012a\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u012f\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0133\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0138\b\u0007\n\u0007\f\u0007"+
		"\u013b\t\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u0140\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u0145\b\t\n\t\f\t\u0148\t\t\u0001\n\u0001\n\u0003\n"+
		"\u014c\b\n\u0001\n\u0003\n\u014f\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0155\b\n\u0001\n\u0003\n\u0158\b\n\u0003\n\u015a\b\n\u0001\u000b\u0003"+
		"\u000b\u015d\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0166\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0170\b\u000b\u0001\f\u0001\f\u0005\f\u0174\b\f\n\f"+
		"\f\f\u0177\t\f\u0001\r\u0001\r\u0003\r\u017b\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0180\b\u000e\n\u000e\f\u000e\u0183\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0188\b\u000f\n\u000f\f\u000f"+
		"\u018b\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0190\b"+
		"\u0010\u0001\u0010\u0003\u0010\u0193\b\u0010\u0003\u0010\u0195\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u019a\b\u0011\n\u0011"+
		"\f\u0011\u019d\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u01aa\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01ba\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u01d4\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u01df\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u01ed\b\u0017\u0001\u0017\u0005\u0017"+
		"\u01f0\b\u0017\n\u0017\f\u0017\u01f3\t\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u01fe\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0206\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u020f\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0219\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u021f\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u022c"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0232"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u0241\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u0246\b\u001d\n\u001d\f\u001d\u0249\t\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u025a\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u025e\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u0262\b"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0268"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u026e"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0273\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u027c\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u0281\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u0287\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u028f\b\u001f\u0001\u001f\u0003\u001f"+
		"\u0292\b\u001f\u0003\u001f\u0294\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u029e\b \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u02a6\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003"+
		"!\u02ae\b!\u0003!\u02b0\b!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005"+
		"#\u02b7\b#\n#\f#\u02ba\t#\u0001$\u0001$\u0003$\u02be\b$\u0001$\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u02c8\b$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u02d5\b$\u0001$\u0001$\u0003$\u02d9\b$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u02e2\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u02e9\b$\u0001%\u0001%\u0003%\u02ed\b%\u0001&\u0001&\u0001&\u0005&\u02f2"+
		"\b&\n&\f&\u02f5\t&\u0001\'\u0001\'\u0001\'\u0005\'\u02fa\b\'\n\'\f\'\u02fd"+
		"\t\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0304\b(\u0001)\u0001)"+
		"\u0001)\u0001)\u0001)\u0001)\u0005)\u030c\b)\n)\f)\u030f\t)\u0001)\u0001"+
		")\u0003)\u0313\b)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0003+\u031b"+
		"\b+\u0001+\u0001+\u0001+\u0003+\u0320\b+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u032d\b+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u0335\b+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u033e\b+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0003+\u0346\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0003+\u034f\b+\u0001+\u0001+\u0001+\u0001+\u0003+\u0355\b+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u035e\b,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0005-\u0366\b-\n-\f-\u0369\t-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0003-\u0372\b-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u0382\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0392\b/\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u039e"+
		"\b0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00031\u03ab\b1\u00011\u00041\u03ae\b1\u000b1\f1\u03af\u0003"+
		"1\u03b2\b1\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00033\u03c2\b3\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00033\u03cf"+
		"\b3\u00013\u00013\u00013\u00013\u00033\u03d5\b3\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u03ec\b4\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u03f6\b5\u0001"+
		"6\u00016\u00016\u00056\u03fb\b6\n6\f6\u03fe\t6\u00017\u00017\u00017\u0001"+
		"7\u00037\u0404\b7\u00017\u00017\u00037\u0408\b7\u00018\u00018\u00018\u0001"+
		"8\u00038\u040e\b8\u00018\u00018\u00038\u0412\b8\u00019\u00019\u00019\u0001"+
		"9\u00039\u0418\b9\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0003:\u0420"+
		"\b:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0003;\u0428\b;\u0001;\u0001"+
		";\u0003;\u042c\b;\u0001<\u0001<\u0001<\u0001<\u0003<\u0432\b<\u0001<\u0001"+
		"<\u0003<\u0436\b<\u0001=\u0001=\u0001=\u0001=\u0003=\u043c\b=\u0001=\u0001"+
		"=\u0001=\u0003=\u0441\b=\u0001=\u0003=\u0444\b=\u0001=\u0003=\u0447\b"+
		"=\u0001>\u0001>\u0001>\u0001>\u0003>\u044d\b>\u0001>\u0001>\u0001>\u0001"+
		">\u0003>\u0453\b>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0003@\u0460\b@\u0001@\u0001@\u0001@\u0001@\u0005"+
		"@\u0466\b@\n@\f@\u0469\t@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0003A\u0472\bA\u0003A\u0474\bA\u0001B\u0001B\u0001B\u0005B\u0479\b"+
		"B\nB\fB\u047c\tB\u0001C\u0001C\u0001C\u0001C\u0003C\u0482\bC\u0001C\u0001"+
		"C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0003D\u048c\bD\u0001D\u0001"+
		"D\u0001D\u0001D\u0001E\u0001E\u0003E\u0494\bE\u0001E\u0001E\u0003E\u0498"+
		"\bE\u0001E\u0001E\u0003E\u049c\bE\u0003E\u049e\bE\u0001F\u0001F\u0001"+
		"F\u0005F\u04a3\bF\nF\fF\u04a6\tF\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0003G\u04c2\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0003G\u04cd\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0005"+
		"G\u04e9\bG\nG\fG\u04ec\tG\u0001G\u0000\u0001\u008eH\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0000\u000b\u0002\u00002vx\u008a\u0002\u0000"+
		"\u000f\u0010**\u0001\u0000\t\n\u0002\u0000\u0014\u0014ss\u0002\u0000\u0084"+
		"\u0084\u0086\u0086\u0001\u0000z{\u0001\u0000\u00a5\u00a6\u0002\u00004"+
		"4cc\u0001\u0000op\u0001\u0000\u008d\u008e\u0003\u0000\u0007\b\u008f\u008f"+
		"\u009e\u00a1\u059d\u0000\u0091\u0001\u0000\u0000\u0000\u0002\u0097\u0001"+
		"\u0000\u0000\u0000\u0004\u00e2\u0001\u0000\u0000\u0000\u0006\u00ed\u0001"+
		"\u0000\u0000\u0000\b\u0113\u0001\u0000\u0000\u0000\n\u0115\u0001\u0000"+
		"\u0000\u0000\f\u0118\u0001\u0000\u0000\u0000\u000e\u0134\u0001\u0000\u0000"+
		"\u0000\u0010\u013c\u0001\u0000\u0000\u0000\u0012\u0141\u0001\u0000\u0000"+
		"\u0000\u0014\u0159\u0001\u0000\u0000\u0000\u0016\u016f\u0001\u0000\u0000"+
		"\u0000\u0018\u0171\u0001\u0000\u0000\u0000\u001a\u0178\u0001\u0000\u0000"+
		"\u0000\u001c\u017c\u0001\u0000\u0000\u0000\u001e\u0184\u0001\u0000\u0000"+
		"\u0000 \u0194\u0001\u0000\u0000\u0000\"\u0196\u0001\u0000\u0000\u0000"+
		"$\u01a9\u0001\u0000\u0000\u0000&\u01d3\u0001\u0000\u0000\u0000(\u01de"+
		"\u0001\u0000\u0000\u0000*\u01e0\u0001\u0000\u0000\u0000,\u01e4\u0001\u0000"+
		"\u0000\u0000.\u01e8\u0001\u0000\u0000\u00000\u01f4\u0001\u0000\u0000\u0000"+
		"2\u01fb\u0001\u0000\u0000\u00004\u020b\u0001\u0000\u0000\u00006\u0215"+
		"\u0001\u0000\u0000\u00008\u0228\u0001\u0000\u0000\u0000:\u0239\u0001\u0000"+
		"\u0000\u0000<\u025d\u0001\u0000\u0000\u0000>\u0293\u0001\u0000\u0000\u0000"+
		"@\u029d\u0001\u0000\u0000\u0000B\u02af\u0001\u0000\u0000\u0000D\u02b1"+
		"\u0001\u0000\u0000\u0000F\u02b3\u0001\u0000\u0000\u0000H\u02e8\u0001\u0000"+
		"\u0000\u0000J\u02ec\u0001\u0000\u0000\u0000L\u02ee\u0001\u0000\u0000\u0000"+
		"N\u02f6\u0001\u0000\u0000\u0000P\u02fe\u0001\u0000\u0000\u0000R\u0305"+
		"\u0001\u0000\u0000\u0000T\u0314\u0001\u0000\u0000\u0000V\u0354\u0001\u0000"+
		"\u0000\u0000X\u035d\u0001\u0000\u0000\u0000Z\u0371\u0001\u0000\u0000\u0000"+
		"\\\u0381\u0001\u0000\u0000\u0000^\u0391\u0001\u0000\u0000\u0000`\u039d"+
		"\u0001\u0000\u0000\u0000b\u03b1\u0001\u0000\u0000\u0000d\u03b3\u0001\u0000"+
		"\u0000\u0000f\u03d4\u0001\u0000\u0000\u0000h\u03eb\u0001\u0000\u0000\u0000"+
		"j\u03f5\u0001\u0000\u0000\u0000l\u03f7\u0001\u0000\u0000\u0000n\u03ff"+
		"\u0001\u0000\u0000\u0000p\u0409\u0001\u0000\u0000\u0000r\u0413\u0001\u0000"+
		"\u0000\u0000t\u041b\u0001\u0000\u0000\u0000v\u0423\u0001\u0000\u0000\u0000"+
		"x\u042d\u0001\u0000\u0000\u0000z\u0437\u0001\u0000\u0000\u0000|\u0448"+
		"\u0001\u0000\u0000\u0000~\u0454\u0001\u0000\u0000\u0000\u0080\u0458\u0001"+
		"\u0000\u0000\u0000\u0082\u0473\u0001\u0000\u0000\u0000\u0084\u0475\u0001"+
		"\u0000\u0000\u0000\u0086\u047d\u0001\u0000\u0000\u0000\u0088\u0487\u0001"+
		"\u0000\u0000\u0000\u008a\u049d\u0001\u0000\u0000\u0000\u008c\u049f\u0001"+
		"\u0000\u0000\u0000\u008e\u04cc\u0001\u0000\u0000\u0000\u0090\u0092\u0003"+
		"\b\u0004\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0000"+
		"\u0000\u0001\u0096\u0001\u0001\u0000\u0000\u0000\u0097\u0098\u0007\u0000"+
		"\u0000\u0000\u0098\u0003\u0001\u0000\u0000\u0000\u0099\u00e3\u00057\u0000"+
		"\u0000\u009a\u00a2\u00058\u0000\u0000\u009b\u009c\u0005\u0092\u0000\u0000"+
		"\u009c\u009f\u0005\u00a7\u0000\u0000\u009d\u009e\u0005\u0090\u0000\u0000"+
		"\u009e\u00a0\u0005\u00a7\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a3\u0005\u0093\u0000\u0000\u00a2\u009b\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00e3\u0001\u0000\u0000\u0000"+
		"\u00a4\u00ac\u00059\u0000\u0000\u00a5\u00a6\u0005\u0092\u0000\u0000\u00a6"+
		"\u00a9\u0005\u00a7\u0000\u0000\u00a7\u00a8\u0005\u0090\u0000\u0000\u00a8"+
		"\u00aa\u0005\u00a7\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ad\u0005\u0093\u0000\u0000\u00ac\u00a5\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\u00e3\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b2\u0005:\u0000\u0000\u00af\u00b0\u0005\u0092\u0000\u0000\u00b0\u00b1"+
		"\u0005\u00a7\u0000\u0000\u00b1\u00b3\u0005\u0093\u0000\u0000\u00b2\u00af"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00e3"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b8\u0005;\u0000\u0000\u00b5\u00b6\u0005"+
		"\u0092\u0000\u0000\u00b6\u00b7\u0005\u00a7\u0000\u0000\u00b7\u00b9\u0005"+
		"\u0093\u0000\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00e3\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005"+
		"Z\u0000\u0000\u00bb\u00bf\u0005[\u0000\u0000\u00bc\u00bd\u0005\u0092\u0000"+
		"\u0000\u00bd\u00be\u0005\u00a7\u0000\u0000\u00be\u00c0\u0005\u0093\u0000"+
		"\u0000\u00bf\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00e3\u0001\u0000\u0000\u0000\u00c1\u00e3\u0005<\u0000\u0000"+
		"\u00c2\u00e3\u0005=\u0000\u0000\u00c3\u00e3\u0005>\u0000\u0000\u00c4\u00e3"+
		"\u0005?\u0000\u0000\u00c5\u00e3\u0005A\u0000\u0000\u00c6\u00ca\u0005B"+
		"\u0000\u0000\u00c7\u00c8\u0005\u0092\u0000\u0000\u00c8\u00c9\u0005\u00a7"+
		"\u0000\u0000\u00c9\u00cb\u0005\u0093\u0000\u0000\u00ca\u00c7\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00e3\u0001\u0000"+
		"\u0000\u0000\u00cc\u00d0\u0005C\u0000\u0000\u00cd\u00ce\u0005\u0092\u0000"+
		"\u0000\u00ce\u00cf\u0005\u00a7\u0000\u0000\u00cf\u00d1\u0005\u0093\u0000"+
		"\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00e3\u0001\u0000\u0000\u0000\u00d2\u00d6\u0005D\u0000\u0000"+
		"\u00d3\u00d4\u0005\u0092\u0000\u0000\u00d4\u00d5\u0005\u00a7\u0000\u0000"+
		"\u00d5\u00d7\u0005\u0093\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00e3\u0001\u0000\u0000\u0000"+
		"\u00d8\u00e3\u0005E\u0000\u0000\u00d9\u00e3\u0005F\u0000\u0000\u00da\u00e3"+
		"\u0005G\u0000\u0000\u00db\u00e3\u0005H\u0000\u0000\u00dc\u00e3\u0005I"+
		"\u0000\u0000\u00dd\u00e3\u0005J\u0000\u0000\u00de\u00e3\u0005K\u0000\u0000"+
		"\u00df\u00e3\u0005L\u0000\u0000\u00e0\u00e3\u0005M\u0000\u0000\u00e1\u00e3"+
		"\u0005N\u0000\u0000\u00e2\u0099\u0001\u0000\u0000\u0000\u00e2\u009a\u0001"+
		"\u0000\u0000\u0000\u00e2\u00a4\u0001\u0000\u0000\u0000\u00e2\u00ae\u0001"+
		"\u0000\u0000\u0000\u00e2\u00b4\u0001\u0000\u0000\u0000\u00e2\u00ba\u0001"+
		"\u0000\u0000\u0000\u00e2\u00c1\u0001\u0000\u0000\u0000\u00e2\u00c2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00c3\u0001\u0000\u0000\u0000\u00e2\u00c4\u0001"+
		"\u0000\u0000\u0000\u00e2\u00c5\u0001\u0000\u0000\u0000\u00e2\u00c6\u0001"+
		"\u0000\u0000\u0000\u00e2\u00cc\u0001\u0000\u0000\u0000\u00e2\u00d2\u0001"+
		"\u0000\u0000\u0000\u00e2\u00d8\u0001\u0000\u0000\u0000\u00e2\u00d9\u0001"+
		"\u0000\u0000\u0000\u00e2\u00da\u0001\u0000\u0000\u0000\u00e2\u00db\u0001"+
		"\u0000\u0000\u0000\u00e2\u00dc\u0001\u0000\u0000\u0000\u00e2\u00dd\u0001"+
		"\u0000\u0000\u0000\u00e2\u00de\u0001\u0000\u0000\u0000\u00e2\u00df\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e8\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"+
		"\u00a3\u0000\u0000\u00e5\u00e7\u0005\u00a4\u0000\u0000\u00e6\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u0005\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ee\u0005"+
		"\u00a8\u0000\u0000\u00ec\u00ee\u0003\u0002\u0001\u0000\u00ed\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u0007\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0003\f\u0006\u0000\u00f0\u00f1\u0005\u0094"+
		"\u0000\u0000\u00f1\u0114\u0001\u0000\u0000\u0000\u00f2\u00f3\u0003(\u0014"+
		"\u0000\u00f3\u00f4\u0005\u0094\u0000\u0000\u00f4\u0114\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0003\u008eG\u0000\u00f6\u00f7\u0005\u0094\u0000\u0000"+
		"\u00f7\u0114\u0001\u0000\u0000\u0000\u00f8\u00f9\u0003P(\u0000\u00f9\u00fa"+
		"\u0005\u0094\u0000\u0000\u00fa\u0114\u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0003R)\u0000\u00fc\u00fd\u0005\u0094\u0000\u0000\u00fd\u0114\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0003X,\u0000\u00ff\u0100\u0005\u0094\u0000\u0000"+
		"\u0100\u0114\u0001\u0000\u0000\u0000\u0101\u0102\u0003j5\u0000\u0102\u0103"+
		"\u0005\u0094\u0000\u0000\u0103\u0114\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0003\u0080@\u0000\u0105\u0106\u0005\u0094\u0000\u0000\u0106\u0114\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0003\u0086C\u0000\u0108\u0109\u0005\u0094"+
		"\u0000\u0000\u0109\u0114\u0001\u0000\u0000\u0000\u010a\u010b\u0003\u0088"+
		"D\u0000\u010b\u010c\u0005\u0094\u0000\u0000\u010c\u0114\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0003\u008aE\u0000\u010e\u010f\u0005\u0094\u0000\u0000"+
		"\u010f\u0114\u0001\u0000\u0000\u0000\u0110\u0111\u0003\n\u0005\u0000\u0111"+
		"\u0112\u0005\u0094\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113"+
		"\u00ef\u0001\u0000\u0000\u0000\u0113\u00f2\u0001\u0000\u0000\u0000\u0113"+
		"\u00f5\u0001\u0000\u0000\u0000\u0113\u00f8\u0001\u0000\u0000\u0000\u0113"+
		"\u00fb\u0001\u0000\u0000\u0000\u0113\u00fe\u0001\u0000\u0000\u0000\u0113"+
		"\u0101\u0001\u0000\u0000\u0000\u0113\u0104\u0001\u0000\u0000\u0000\u0113"+
		"\u0107\u0001\u0000\u0000\u0000\u0113\u010a\u0001\u0000\u0000\u0000\u0113"+
		"\u010d\u0001\u0000\u0000\u0000\u0113\u0110\u0001\u0000\u0000\u0000\u0114"+
		"\t\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u0088\u0000\u0000\u0116\u0117"+
		"\u0003\u0006\u0003\u0000\u0117\u000b\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0005\u0001\u0000\u0000\u0119\u011c\u0003\u001e\u000f\u0000\u011a\u011b"+
		"\u0005\u0002\u0000\u0000\u011b\u011d\u0003\"\u0011\u0000\u011c\u011a\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u0120\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0005\u0004\u0000\u0000\u011f\u0121\u0003"+
		"\u008eG\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121\u0125\u0001\u0000\u0000\u0000\u0122\u0123\u0005\u0006"+
		"\u0000\u0000\u0123\u0124\u00052\u0000\u0000\u0124\u0126\u0003\u000e\u0007"+
		"\u0000\u0125\u0122\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000"+
		"\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u001a\u0000"+
		"\u0000\u0128\u012a\u0003\u008eG\u0000\u0129\u0127\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012e\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0005\r\u0000\u0000\u012c\u012d\u00052\u0000\u0000\u012d"+
		"\u012f\u0003\u001c\u000e\u0000\u012e\u012b\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0005\u0011\u0000\u0000\u0131\u0133\u0005\u00a7\u0000\u0000\u0132"+
		"\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133"+
		"\r\u0001\u0000\u0000\u0000\u0134\u0139\u0003\u008eG\u0000\u0135\u0136"+
		"\u0005\u0090\u0000\u0000\u0136\u0138\u0003\u008eG\u0000\u0137\u0135\u0001"+
		"\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u000f\u0001"+
		"\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u013f\u0003"+
		"\u0006\u0003\u0000\u013d\u013e\u0005\u0091\u0000\u0000\u013e\u0140\u0003"+
		"\u0006\u0003\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\u0011\u0001\u0000\u0000\u0000\u0141\u0146\u0003"+
		"\u0010\b\u0000\u0142\u0143\u0005\u0090\u0000\u0000\u0143\u0145\u0003\u0010"+
		"\b\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000"+
		"\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\u0013\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000"+
		"\u0000\u0149\u014e\u0003\u0010\b\u0000\u014a\u014c\u0005)\u0000\u0000"+
		"\u014b\u014a\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0003\u0010\b\u0000\u014e"+
		"\u014b\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f"+
		"\u015a\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u0092\u0000\u0000\u0151"+
		"\u0152\u0003\f\u0006\u0000\u0152\u0157\u0005\u0093\u0000\u0000\u0153\u0155"+
		"\u0005)\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0158\u0003"+
		"\u0010\b\u0000\u0157\u0154\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u0149\u0001\u0000"+
		"\u0000\u0000\u0159\u0150\u0001\u0000\u0000\u0000\u015a\u0015\u0001\u0000"+
		"\u0000\u0000\u015b\u015d\u0005\u0013\u0000\u0000\u015c\u015b\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0005\u000e\u0000\u0000\u015f\u0160\u0003\u0014"+
		"\n\u0000\u0160\u0161\u0005\u0012\u0000\u0000\u0161\u0162\u0003\u008eG"+
		"\u0000\u0162\u0170\u0001\u0000\u0000\u0000\u0163\u0165\u0007\u0001\u0000"+
		"\u0000\u0164\u0166\u0005\u0018\u0000\u0000\u0165\u0164\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0005\u000e\u0000\u0000\u0168\u0169\u0003\u0014\n\u0000"+
		"\u0169\u016a\u0005\u0012\u0000\u0000\u016a\u016b\u0003\u008eG\u0000\u016b"+
		"\u0170\u0001\u0000\u0000\u0000\u016c\u016d\u0005+\u0000\u0000\u016d\u016e"+
		"\u0005\u000e\u0000\u0000\u016e\u0170\u0003\u0014\n\u0000\u016f\u015c\u0001"+
		"\u0000\u0000\u0000\u016f\u0163\u0001\u0000\u0000\u0000\u016f\u016c\u0001"+
		"\u0000\u0000\u0000\u0170\u0017\u0001\u0000\u0000\u0000\u0171\u0175\u0003"+
		"\u0014\n\u0000\u0172\u0174\u0003\u0016\u000b\u0000\u0173\u0172\u0001\u0000"+
		"\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0019\u0001\u0000"+
		"\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178\u017a\u0003\u008e"+
		"G\u0000\u0179\u017b\u0007\u0002\u0000\u0000\u017a\u0179\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u001b\u0001\u0000\u0000"+
		"\u0000\u017c\u0181\u0003\u001a\r\u0000\u017d\u017e\u0005\u0090\u0000\u0000"+
		"\u017e\u0180\u0003\u001a\r\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180"+
		"\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0001\u0000\u0000\u0000\u0182\u001d\u0001\u0000\u0000\u0000\u0183"+
		"\u0181\u0001\u0000\u0000\u0000\u0184\u0189\u0003 \u0010\u0000\u0185\u0186"+
		"\u0005\u0090\u0000\u0000\u0186\u0188\u0003 \u0010\u0000\u0187\u0185\u0001"+
		"\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u001f\u0001"+
		"\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u0195\u0005"+
		"\u008d\u0000\u0000\u018d\u0192\u0003\u008eG\u0000\u018e\u0190\u0005)\u0000"+
		"\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0193\u0003\u0006\u0003"+
		"\u0000\u0192\u018f\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000"+
		"\u0000\u0193\u0195\u0001\u0000\u0000\u0000\u0194\u018c\u0001\u0000\u0000"+
		"\u0000\u0194\u018d\u0001\u0000\u0000\u0000\u0195!\u0001\u0000\u0000\u0000"+
		"\u0196\u019b\u0003\u0018\f\u0000\u0197\u0198\u0005\u0090\u0000\u0000\u0198"+
		"\u019a\u0003\u0018\f\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u019d"+
		"\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0001\u0000\u0000\u0000\u019c#\u0001\u0000\u0000\u0000\u019d\u019b\u0001"+
		"\u0000\u0000\u0000\u019e\u01aa\u0003\u0006\u0003\u0000\u019f\u01a0\u0003"+
		"\u0006\u0003\u0000\u01a0\u01a1\u0005\u0091\u0000\u0000\u01a1\u01a2\u0003"+
		"\u0006\u0003\u0000\u01a2\u01aa\u0001\u0000\u0000\u0000\u01a3\u01a4\u0003"+
		"\u0006\u0003\u0000\u01a4\u01a5\u0005\u0091\u0000\u0000\u01a5\u01a6\u0003"+
		"\u0006\u0003\u0000\u01a6\u01a7\u0005\u0091\u0000\u0000\u01a7\u01a8\u0003"+
		"\u0006\u0003\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u019e\u0001"+
		"\u0000\u0000\u0000\u01a9\u019f\u0001\u0000\u0000\u0000\u01a9\u01a3\u0001"+
		"\u0000\u0000\u0000\u01aa%\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005R\u0000"+
		"\u0000\u01ac\u01ad\u0005\u0092\u0000\u0000\u01ad\u01ae\u0003\u008eG\u0000"+
		"\u01ae\u01af\u0005\u0093\u0000\u0000\u01af\u01d4\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b1\u0005S\u0000\u0000\u01b1\u01b2\u0005\u0092\u0000\u0000\u01b2"+
		"\u01b3\u0003\u008eG\u0000\u01b3\u01b4\u0005\u0093\u0000\u0000\u01b4\u01d4"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005T\u0000\u0000\u01b6\u01b9\u0005"+
		"\u0092\u0000\u0000\u01b7\u01ba\u0005\u008d\u0000\u0000\u01b8\u01ba\u0003"+
		"\u008eG\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01b8\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01d4\u0005\u0093"+
		"\u0000\u0000\u01bc\u01bd\u0005U\u0000\u0000\u01bd\u01be\u0005\u0092\u0000"+
		"\u0000\u01be\u01bf\u0003\u008eG\u0000\u01bf\u01c0\u0005\u0093\u0000\u0000"+
		"\u01c0\u01d4\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005V\u0000\u0000\u01c2"+
		"\u01c3\u0005\u0092\u0000\u0000\u01c3\u01c4\u0003\u008eG\u0000\u01c4\u01c5"+
		"\u0005\u0093\u0000\u0000\u01c5\u01d4\u0001\u0000\u0000\u0000\u01c6\u01c7"+
		"\u0005W\u0000\u0000\u01c7\u01c8\u0005\u0092\u0000\u0000\u01c8\u01c9\u0003"+
		"\u008eG\u0000\u01c9\u01ca\u0005\u0093\u0000\u0000\u01ca\u01d4\u0001\u0000"+
		"\u0000\u0000\u01cb\u01cc\u0005X\u0000\u0000\u01cc\u01cd\u0005\u0092\u0000"+
		"\u0000\u01cd\u01d4\u0005\u0093\u0000\u0000\u01ce\u01cf\u0005Y\u0000\u0000"+
		"\u01cf\u01d0\u0005\u0092\u0000\u0000\u01d0\u01d1\u0003\u008eG\u0000\u01d1"+
		"\u01d2\u0005\u0093\u0000\u0000\u01d2\u01d4\u0001\u0000\u0000\u0000\u01d3"+
		"\u01ab\u0001\u0000\u0000\u0000\u01d3\u01b0\u0001\u0000\u0000\u0000\u01d3"+
		"\u01b5\u0001\u0000\u0000\u0000\u01d3\u01bc\u0001\u0000\u0000\u0000\u01d3"+
		"\u01c1\u0001\u0000\u0000\u0000\u01d3\u01c6\u0001\u0000\u0000\u0000\u01d3"+
		"\u01cb\u0001\u0000\u0000\u0000\u01d3\u01ce\u0001\u0000\u0000\u0000\u01d4"+
		"\'\u0001\u0000\u0000\u0000\u01d5\u01df\u0003*\u0015\u0000\u01d6\u01df"+
		"\u0003,\u0016\u0000\u01d7\u01df\u0003.\u0017\u0000\u01d8\u01df\u00030"+
		"\u0018\u0000\u01d9\u01df\u00032\u0019\u0000\u01da\u01df\u00034\u001a\u0000"+
		"\u01db\u01df\u00036\u001b\u0000\u01dc\u01df\u00038\u001c\u0000\u01dd\u01df"+
		"\u0003:\u001d\u0000\u01de\u01d5\u0001\u0000\u0000\u0000\u01de\u01d6\u0001"+
		"\u0000\u0000\u0000\u01de\u01d7\u0001\u0000\u0000\u0000\u01de\u01d8\u0001"+
		"\u0000\u0000\u0000\u01de\u01d9\u0001\u0000\u0000\u0000\u01de\u01da\u0001"+
		"\u0000\u0000\u0000\u01de\u01db\u0001\u0000\u0000\u0000\u01de\u01dc\u0001"+
		"\u0000\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01df)\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e1\u0005\u0003\u0000\u0000\u01e1\u01e2\u00056\u0000"+
		"\u0000\u01e2\u01e3\u0003\u0006\u0003\u0000\u01e3+\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e5\u0005\u0003\u0000\u0000\u01e5\u01e6\u0005`\u0000\u0000\u01e6"+
		"\u01e7\u0003\u0006\u0003\u0000\u01e7-\u0001\u0000\u0000\u0000\u01e8\u01e9"+
		"\u0005\u0003\u0000\u0000\u01e9\u01ea\u0007\u0003\u0000\u0000\u01ea\u01ec"+
		"\u0003\u0006\u0003\u0000\u01eb\u01ed\u0005&\u0000\u0000\u01ec\u01eb\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01f1\u0001"+
		"\u0000\u0000\u0000\u01ee\u01f0\u0003`0\u0000\u01ef\u01ee\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f3\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2/\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005\u0003\u0000\u0000"+
		"\u01f5\u01f6\u0005\u000b\u0000\u0000\u01f6\u01f7\u0003\u0010\b\u0000\u01f7"+
		"\u01f8\u0005\u0092\u0000\u0000\u01f8\u01f9\u0003L&\u0000\u01f9\u01fa\u0005"+
		"\u0093\u0000\u0000\u01fa1\u0001\u0000\u0000\u0000\u01fb\u01fd\u0005\u0003"+
		"\u0000\u0000\u01fc\u01fe\u0005\'\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000"+
		"\u0000\u01ff\u0200\u0005O\u0000\u0000\u0200\u0201\u0003\u0006\u0003\u0000"+
		"\u0201\u0202\u0005\u0012\u0000\u0000\u0202\u0205\u0003\u0010\b\u0000\u0203"+
		"\u0204\u0005,\u0000\u0000\u0204\u0206\u0003\u0006\u0003\u0000\u0205\u0203"+
		"\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0001\u0000\u0000\u0000\u0207\u0208\u0005\u0092\u0000\u0000\u0208\u0209"+
		"\u0003\u001c\u000e\u0000\u0209\u020a\u0005\u0093\u0000\u0000\u020a3\u0001"+
		"\u0000\u0000\u0000\u020b\u020e\u0005\u0003\u0000\u0000\u020c\u020d\u0005"+
		"$\u0000\u0000\u020d\u020f\u0005x\u0000\u0000\u020e\u020c\u0001\u0000\u0000"+
		"\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000"+
		"\u0000\u0210\u0211\u0005y\u0000\u0000\u0211\u0212\u0003\u0010\b\u0000"+
		"\u0212\u0213\u0005)\u0000\u0000\u0213\u0214\u0003\f\u0006\u0000\u0214"+
		"5\u0001\u0000\u0000\u0000\u0215\u0218\u0005\u0003\u0000\u0000\u0216\u0217"+
		"\u0005$\u0000\u0000\u0217\u0219\u0005x\u0000\u0000\u0218\u0216\u0001\u0000"+
		"\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000"+
		"\u0000\u0000\u021a\u021b\u0005z\u0000\u0000\u021b\u021c\u0003\u0010\b"+
		"\u0000\u021c\u021e\u0005\u0092\u0000\u0000\u021d\u021f\u0003\u008cF\u0000"+
		"\u021e\u021d\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000"+
		"\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0005\u0093\u0000\u0000"+
		"\u0221\u0222\u0005|\u0000\u0000\u0222\u0223\u0003\u0004\u0002\u0000\u0223"+
		"\u0224\u0005}\u0000\u0000\u0224\u0225\u0003\u0006\u0003\u0000\u0225\u0226"+
		"\u0005)\u0000\u0000\u0226\u0227\u0003D\"\u0000\u02277\u0001\u0000\u0000"+
		"\u0000\u0228\u022b\u0005\u0003\u0000\u0000\u0229\u022a\u0005$\u0000\u0000"+
		"\u022a\u022c\u0005x\u0000\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022b"+
		"\u022c\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d"+
		"\u022e\u0005{\u0000\u0000\u022e\u022f\u0003\u0010\b\u0000\u022f\u0231"+
		"\u0005\u0092\u0000\u0000\u0230\u0232\u0003\u008cF\u0000\u0231\u0230\u0001"+
		"\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000\u0232\u0233\u0001"+
		"\u0000\u0000\u0000\u0233\u0234\u0005\u0093\u0000\u0000\u0234\u0235\u0005"+
		"}\u0000\u0000\u0235\u0236\u0003\u0006\u0003\u0000\u0236\u0237\u0005)\u0000"+
		"\u0000\u0237\u0238\u0003D\"\u0000\u02389\u0001\u0000\u0000\u0000\u0239"+
		"\u023a\u0005\u0003\u0000\u0000\u023a\u023b\u0005~\u0000\u0000\u023b\u0240"+
		"\u0003\u0006\u0003\u0000\u023c\u0241\u0005\u007f\u0000\u0000\u023d\u0241"+
		"\u0005\u0080\u0000\u0000\u023e\u023f\u0005\u0081\u0000\u0000\u023f\u0241"+
		"\u0005\u0082\u0000\u0000\u0240\u023c\u0001\u0000\u0000\u0000\u0240\u023d"+
		"\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0241\u0242"+
		"\u0001\u0000\u0000\u0000\u0242\u0247\u0003<\u001e\u0000\u0243\u0244\u0005"+
		"$\u0000\u0000\u0244\u0246\u0003<\u001e\u0000\u0245\u0243\u0001\u0000\u0000"+
		"\u0000\u0246\u0249\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000"+
		"\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u024a\u0001\u0000\u0000"+
		"\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u024a\u024b\u0005\u0012\u0000"+
		"\u0000\u024b\u024c\u0003\u0010\b\u0000\u024c\u024d\u0005/\u0000\u0000"+
		"\u024d\u024e\u0005\u0083\u0000\u0000\u024e\u024f\u0007\u0004\u0000\u0000"+
		"\u024f\u0250\u0005\u0085\u0000\u0000\u0250\u0251\u0007\u0005\u0000\u0000"+
		"\u0251\u0252\u0003\u0010\b\u0000\u0252\u0253\u0005\u0092\u0000\u0000\u0253"+
		"\u0254\u0005\u0093\u0000\u0000\u0254;\u0001\u0000\u0000\u0000\u0255\u025e"+
		"\u0005\u001e\u0000\u0000\u0256\u0259\u00053\u0000\u0000\u0257\u0258\u0005"+
		"\u0082\u0000\u0000\u0258\u025a\u0003F#\u0000\u0259\u0257\u0001\u0000\u0000"+
		"\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025e\u0001\u0000\u0000"+
		"\u0000\u025b\u025e\u00055\u0000\u0000\u025c\u025e\u0005\u0087\u0000\u0000"+
		"\u025d\u0255\u0001\u0000\u0000\u0000\u025d\u0256\u0001\u0000\u0000\u0000"+
		"\u025d\u025b\u0001\u0000\u0000\u0000\u025d\u025c\u0001\u0000\u0000\u0000"+
		"\u025e=\u0001\u0000\u0000\u0000\u025f\u0260\u0005(\u0000\u0000\u0260\u0262"+
		"\u0003\u0006\u0003\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0261\u0262"+
		"\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0264"+
		"\u0005\u0019\u0000\u0000\u0264\u0294\u0005@\u0000\u0000\u0265\u0266\u0005"+
		"(\u0000\u0000\u0266\u0268\u0003\u0006\u0003\u0000\u0267\u0265\u0001\u0000"+
		"\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000"+
		"\u0000\u0000\u0269\u026a\u0005\u0016\u0000\u0000\u026a\u0294\u0005\u0015"+
		"\u0000\u0000\u026b\u026c\u0005(\u0000\u0000\u026c\u026e\u0003\u0006\u0003"+
		"\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000"+
		"\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0294\u0005\u0017\u0000"+
		"\u0000\u0270\u0271\u0005(\u0000\u0000\u0271\u0273\u0003\u0006\u0003\u0000"+
		"\u0272\u0270\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000\u0000"+
		"\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0275\u0005\u0005\u0000\u0000"+
		"\u0275\u0276\u0005\u0092\u0000\u0000\u0276\u0277\u0003\u008eG\u0000\u0277"+
		"\u0278\u0005\u0093\u0000\u0000\u0278\u0294\u0001\u0000\u0000\u0000\u0279"+
		"\u027a\u0005(\u0000\u0000\u027a\u027c\u0003\u0006\u0003\u0000\u027b\u0279"+
		"\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027d"+
		"\u0001\u0000\u0000\u0000\u027d\u0294\u0005\'\u0000\u0000\u027e\u027f\u0005"+
		"(\u0000\u0000\u027f\u0281\u0003\u0006\u0003\u0000\u0280\u027e\u0001\u0000"+
		"\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000"+
		"\u0000\u0000\u0282\u0283\u0005#\u0000\u0000\u0283\u0294\u0003\u008eG\u0000"+
		"\u0284\u0285\u0005(\u0000\u0000\u0285\u0287\u0003\u0006\u0003\u0000\u0286"+
		"\u0284\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287"+
		"\u0288\u0001\u0000\u0000\u0000\u0288\u0289\u0005\u001c\u0000\u0000\u0289"+
		"\u028e\u0003\u0010\b\u0000\u028a\u028b\u0005\u0092\u0000\u0000\u028b\u028c"+
		"\u0003\u0006\u0003\u0000\u028c\u028d\u0005\u0093\u0000\u0000\u028d\u028f"+
		"\u0001\u0000\u0000\u0000\u028e\u028a\u0001\u0000\u0000\u0000\u028e\u028f"+
		"\u0001\u0000\u0000\u0000\u028f\u0291\u0001\u0000\u0000\u0000\u0290\u0292"+
		"\u0003B!\u0000\u0291\u0290\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000"+
		"\u0000\u0000\u0292\u0294\u0001\u0000\u0000\u0000\u0293\u0261\u0001\u0000"+
		"\u0000\u0000\u0293\u0267\u0001\u0000\u0000\u0000\u0293\u026d\u0001\u0000"+
		"\u0000\u0000\u0293\u0272\u0001\u0000\u0000\u0000\u0293\u027b\u0001\u0000"+
		"\u0000\u0000\u0293\u0280\u0001\u0000\u0000\u0000\u0293\u0286\u0001\u0000"+
		"\u0000\u0000\u0294?\u0001\u0000\u0000\u0000\u0295\u029e\u0005o\u0000\u0000"+
		"\u0296\u029e\u0005p\u0000\u0000\u0297\u0298\u00054\u0000\u0000\u0298\u029e"+
		"\u0005\u0015\u0000\u0000\u0299\u029a\u00054\u0000\u0000\u029a\u029e\u0005"+
		"#\u0000\u0000\u029b\u029c\u0005\u0089\u0000\u0000\u029c\u029e\u0005\u008a"+
		"\u0000\u0000\u029d\u0295\u0001\u0000\u0000\u0000\u029d\u0296\u0001\u0000"+
		"\u0000\u0000\u029d\u0297\u0001\u0000\u0000\u0000\u029d\u0299\u0001\u0000"+
		"\u0000\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029eA\u0001\u0000\u0000"+
		"\u0000\u029f\u02a0\u0005\u0012\u0000\u0000\u02a0\u02a1\u00055\u0000\u0000"+
		"\u02a1\u02a5\u0003@ \u0000\u02a2\u02a3\u0005\u0012\u0000\u0000\u02a3\u02a4"+
		"\u00053\u0000\u0000\u02a4\u02a6\u0003@ \u0000\u02a5\u02a2\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02b0\u0001\u0000"+
		"\u0000\u0000\u02a7\u02a8\u0005\u0012\u0000\u0000\u02a8\u02a9\u00053\u0000"+
		"\u0000\u02a9\u02ad\u0003@ \u0000\u02aa\u02ab\u0005\u0012\u0000\u0000\u02ab"+
		"\u02ac\u00055\u0000\u0000\u02ac\u02ae\u0003@ \u0000\u02ad\u02aa\u0001"+
		"\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae\u02b0\u0001"+
		"\u0000\u0000\u0000\u02af\u029f\u0001\u0000\u0000\u0000\u02af\u02a7\u0001"+
		"\u0000\u0000\u0000\u02b0C\u0001\u0000\u0000\u0000\u02b1\u02b2\u0007\u0006"+
		"\u0000\u0000\u02b2E\u0001\u0000\u0000\u0000\u02b3\u02b8\u0003\u0006\u0003"+
		"\u0000\u02b4\u02b5\u0005\u0090\u0000\u0000\u02b5\u02b7\u0003\u0006\u0003"+
		"\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b7\u02ba\u0001\u0000\u0000"+
		"\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000"+
		"\u0000\u02b9G\u0001\u0000\u0000\u0000\u02ba\u02b8\u0001\u0000\u0000\u0000"+
		"\u02bb\u02bc\u0005(\u0000\u0000\u02bc\u02be\u0003\u0006\u0003\u0000\u02bd"+
		"\u02bb\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be"+
		"\u02bf\u0001\u0000\u0000\u0000\u02bf\u02c0\u0005\u0019\u0000\u0000\u02c0"+
		"\u02c1\u0005@\u0000\u0000\u02c1\u02c2\u0005\u0092\u0000\u0000\u02c2\u02c3"+
		"\u0003F#\u0000\u02c3\u02c4\u0005\u0093\u0000\u0000\u02c4\u02e9\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c6\u0005(\u0000\u0000\u02c6\u02c8\u0003\u0006\u0003"+
		"\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000"+
		"\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9\u02ca\u0005\u001d\u0000"+
		"\u0000\u02ca\u02cb\u0005@\u0000\u0000\u02cb\u02cc\u0005\u0092\u0000\u0000"+
		"\u02cc\u02cd\u0003F#\u0000\u02cd\u02ce\u0005\u0093\u0000\u0000\u02ce\u02cf"+
		"\u0005\u001c\u0000\u0000\u02cf\u02d0\u0003\u0010\b\u0000\u02d0\u02d1\u0005"+
		"\u0092\u0000\u0000\u02d1\u02d2\u0003F#\u0000\u02d2\u02d4\u0005\u0093\u0000"+
		"\u0000\u02d3\u02d5\u0003B!\u0000\u02d4\u02d3\u0001\u0000\u0000\u0000\u02d4"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d5\u02e9\u0001\u0000\u0000\u0000\u02d6"+
		"\u02d7\u0005(\u0000\u0000\u02d7\u02d9\u0003\u0006\u0003\u0000\u02d8\u02d6"+
		"\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9\u02da"+
		"\u0001\u0000\u0000\u0000\u02da\u02db\u0005\'\u0000\u0000\u02db\u02dc\u0005"+
		"\u0092\u0000\u0000\u02dc\u02dd\u0003F#\u0000\u02dd\u02de\u0005\u0093\u0000"+
		"\u0000\u02de\u02e9\u0001\u0000\u0000\u0000\u02df\u02e0\u0005(\u0000\u0000"+
		"\u02e0\u02e2\u0003\u0006\u0003\u0000\u02e1\u02df\u0001\u0000\u0000\u0000"+
		"\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e4\u0005\u0005\u0000\u0000\u02e4\u02e5\u0005\u0092\u0000\u0000"+
		"\u02e5\u02e6\u0003\u008eG\u0000\u02e6\u02e7\u0005\u0093\u0000\u0000\u02e7"+
		"\u02e9\u0001\u0000\u0000\u0000\u02e8\u02bd\u0001\u0000\u0000\u0000\u02e8"+
		"\u02c7\u0001\u0000\u0000\u0000\u02e8\u02d8\u0001\u0000\u0000\u0000\u02e8"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e9I\u0001\u0000\u0000\u0000\u02ea\u02ed"+
		"\u0003N\'\u0000\u02eb\u02ed\u0003H$\u0000\u02ec\u02ea\u0001\u0000\u0000"+
		"\u0000\u02ec\u02eb\u0001\u0000\u0000\u0000\u02edK\u0001\u0000\u0000\u0000"+
		"\u02ee\u02f3\u0003J%\u0000\u02ef\u02f0\u0005\u0090\u0000\u0000\u02f0\u02f2"+
		"\u0003J%\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000\u02f2\u02f5\u0001\u0000"+
		"\u0000\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000"+
		"\u0000\u0000\u02f4M\u0001\u0000\u0000\u0000\u02f5\u02f3\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f7\u0003\u0006\u0003\u0000\u02f7\u02fb\u0003\u0004\u0002"+
		"\u0000\u02f8\u02fa\u0003>\u001f\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000"+
		"\u02fa\u02fd\u0001\u0000\u0000\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000"+
		"\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fcO\u0001\u0000\u0000\u0000\u02fd"+
		"\u02fb\u0001\u0000\u0000\u0000\u02fe\u02ff\u00055\u0000\u0000\u02ff\u0300"+
		"\u0005\u0002\u0000\u0000\u0300\u0303\u0003\u0014\n\u0000\u0301\u0302\u0005"+
		"\u0004\u0000\u0000\u0302\u0304\u0003\u008eG\u0000\u0303\u0301\u0001\u0000"+
		"\u0000\u0000\u0303\u0304\u0001\u0000\u0000\u0000\u0304Q\u0001\u0000\u0000"+
		"\u0000\u0305\u0306\u00053\u0000\u0000\u0306\u0307\u0003\u0014\n\u0000"+
		"\u0307\u0308\u00054\u0000\u0000\u0308\u030d\u0003T*\u0000\u0309\u030a"+
		"\u0005\u0090\u0000\u0000\u030a\u030c\u0003T*\u0000\u030b\u0309\u0001\u0000"+
		"\u0000\u0000\u030c\u030f\u0001\u0000\u0000\u0000\u030d\u030b\u0001\u0000"+
		"\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u0312\u0001\u0000"+
		"\u0000\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u0310\u0311\u0005\u0004"+
		"\u0000\u0000\u0311\u0313\u0003\u008eG\u0000\u0312\u0310\u0001\u0000\u0000"+
		"\u0000\u0312\u0313\u0001\u0000\u0000\u0000\u0313S\u0001\u0000\u0000\u0000"+
		"\u0314\u0315\u0003$\u0012\u0000\u0315\u0316\u0005\u008f\u0000\u0000\u0316"+
		"\u0317\u0003\u008eG\u0000\u0317U\u0001\u0000\u0000\u0000\u0318\u031a\u0005"+
		"b\u0000\u0000\u0319\u031b\u0005\f\u0000\u0000\u031a\u0319\u0001\u0000"+
		"\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000"+
		"\u0000\u0000\u031c\u0355\u0003N\'\u0000\u031d\u031f\u0005c\u0000\u0000"+
		"\u031e\u0320\u0005\f\u0000\u0000\u031f\u031e\u0001\u0000\u0000\u0000\u031f"+
		"\u0320\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321"+
		"\u0355\u0003\u0006\u0003\u0000\u0322\u0323\u0005b\u0000\u0000\u0323\u0355"+
		"\u0003H$\u0000\u0324\u0325\u0005c\u0000\u0000\u0325\u0326\u0005(\u0000"+
		"\u0000\u0326\u0355\u0003\u0006\u0003\u0000\u0327\u0328\u00054\u0000\u0000"+
		"\u0328\u0329\u00056\u0000\u0000\u0329\u0355\u0003\u0006\u0003\u0000\u032a"+
		"\u032c\u0005_\u0000\u0000\u032b\u032d\u0005\f\u0000\u0000\u032c\u032b"+
		"\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000\u0000\u0000\u032d\u032e"+
		"\u0001\u0000\u0000\u0000\u032e\u032f\u0003\u0006\u0003\u0000\u032f\u0330"+
		"\u00054\u0000\u0000\u0330\u0331\u0003\u0004\u0002\u0000\u0331\u0355\u0001"+
		"\u0000\u0000\u0000\u0332\u0334\u0005_\u0000\u0000\u0333\u0335\u0005\f"+
		"\u0000\u0000\u0334\u0333\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000"+
		"\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u0337\u0003\u0006"+
		"\u0003\u0000\u0337\u0338\u00054\u0000\u0000\u0338\u0339\u0005#\u0000\u0000"+
		"\u0339\u033a\u0003\u008eG\u0000\u033a\u0355\u0001\u0000\u0000\u0000\u033b"+
		"\u033d\u0005_\u0000\u0000\u033c\u033e\u0005\f\u0000\u0000\u033d\u033c"+
		"\u0001\u0000\u0000\u0000\u033d\u033e\u0001\u0000\u0000\u0000\u033e\u033f"+
		"\u0001\u0000\u0000\u0000\u033f\u0340\u0003\u0006\u0003\u0000\u0340\u0341"+
		"\u0005c\u0000\u0000\u0341\u0342\u0005#\u0000\u0000\u0342\u0355\u0001\u0000"+
		"\u0000\u0000\u0343\u0345\u0005_\u0000\u0000\u0344\u0346\u0005\f\u0000"+
		"\u0000\u0345\u0344\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000"+
		"\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347\u0348\u0003\u0006\u0003"+
		"\u0000\u0348\u0349\u0007\u0007\u0000\u0000\u0349\u034a\u0005\u0016\u0000"+
		"\u0000\u034a\u034b\u0005\u0015\u0000\u0000\u034b\u0355\u0001\u0000\u0000"+
		"\u0000\u034c\u034e\u0005e\u0000\u0000\u034d\u034f\u0005\f\u0000\u0000"+
		"\u034e\u034d\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000\u0000\u0000"+
		"\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0351\u0003\u0006\u0003\u0000"+
		"\u0351\u0352\u0005-\u0000\u0000\u0352\u0353\u0003\u0006\u0003\u0000\u0353"+
		"\u0355\u0001\u0000\u0000\u0000\u0354\u0318\u0001\u0000\u0000\u0000\u0354"+
		"\u031d\u0001\u0000\u0000\u0000\u0354\u0322\u0001\u0000\u0000\u0000\u0354"+
		"\u0324\u0001\u0000\u0000\u0000\u0354\u0327\u0001\u0000\u0000\u0000\u0354"+
		"\u032a\u0001\u0000\u0000\u0000\u0354\u0332\u0001\u0000\u0000\u0000\u0354"+
		"\u033b\u0001\u0000\u0000\u0000\u0354\u0343\u0001\u0000\u0000\u0000\u0354"+
		"\u034c\u0001\u0000\u0000\u0000\u0355W\u0001\u0000\u0000\u0000\u0356\u035e"+
		"\u0003Z-\u0000\u0357\u035e\u0003\\.\u0000\u0358\u035e\u0003^/\u0000\u0359"+
		"\u035e\u0003b1\u0000\u035a\u035e\u0003d2\u0000\u035b\u035e\u0003f3\u0000"+
		"\u035c\u035e\u0003h4\u0000\u035d\u0356\u0001\u0000\u0000\u0000\u035d\u0357"+
		"\u0001\u0000\u0000\u0000\u035d\u0358\u0001\u0000\u0000\u0000\u035d\u0359"+
		"\u0001\u0000\u0000\u0000\u035d\u035a\u0001\u0000\u0000\u0000\u035d\u035b"+
		"\u0001\u0000\u0000\u0000\u035d\u035c\u0001\u0000\u0000\u0000\u035eY\u0001"+
		"\u0000\u0000\u0000\u035f\u0360\u0005_\u0000\u0000\u0360\u0361\u0005\u000b"+
		"\u0000\u0000\u0361\u0362\u0003\u0010\b\u0000\u0362\u0367\u0003V+\u0000"+
		"\u0363\u0364\u0005\u0090\u0000\u0000\u0364\u0366\u0003V+\u0000\u0365\u0363"+
		"\u0001\u0000\u0000\u0000\u0366\u0369\u0001\u0000\u0000\u0000\u0367\u0365"+
		"\u0001\u0000\u0000\u0000\u0367\u0368\u0001\u0000\u0000\u0000\u0368\u0372"+
		"\u0001\u0000\u0000\u0000\u0369\u0367\u0001\u0000\u0000\u0000\u036a\u036b"+
		"\u0005_\u0000\u0000\u036b\u036c\u0005\u000b\u0000\u0000\u036c\u036d\u0003"+
		"\u0010\b\u0000\u036d\u036e\u0005e\u0000\u0000\u036e\u036f\u0005-\u0000"+
		"\u0000\u036f\u0370\u0003\u0006\u0003\u0000\u0370\u0372\u0001\u0000\u0000"+
		"\u0000\u0371\u035f\u0001\u0000\u0000\u0000\u0371\u036a\u0001\u0000\u0000"+
		"\u0000\u0372[\u0001\u0000\u0000\u0000\u0373\u0374\u0005_\u0000\u0000\u0374"+
		"\u0375\u00056\u0000\u0000\u0375\u0376\u0003\u0006\u0003\u0000\u0376\u0377"+
		"\u0005e\u0000\u0000\u0377\u0378\u0005-\u0000\u0000\u0378\u0379\u0003\u0006"+
		"\u0003\u0000\u0379\u0382\u0001\u0000\u0000\u0000\u037a\u037b\u0005_\u0000"+
		"\u0000\u037b\u037c\u00056\u0000\u0000\u037c\u037d\u0003\u0006\u0003\u0000"+
		"\u037d\u037e\u0005f\u0000\u0000\u037e\u037f\u0005-\u0000\u0000\u037f\u0380"+
		"\u0003\u0006\u0003\u0000\u0380\u0382\u0001\u0000\u0000\u0000\u0381\u0373"+
		"\u0001\u0000\u0000\u0000\u0381\u037a\u0001\u0000\u0000\u0000\u0382]\u0001"+
		"\u0000\u0000\u0000\u0383\u0384\u0005_\u0000\u0000\u0384\u0385\u0005`\u0000"+
		"\u0000\u0385\u0386\u0003\u0006\u0003\u0000\u0386\u0387\u0005e\u0000\u0000"+
		"\u0387\u0388\u0005-\u0000\u0000\u0388\u0389\u0003\u0006\u0003\u0000\u0389"+
		"\u0392\u0001\u0000\u0000\u0000\u038a\u038b\u0005_\u0000\u0000\u038b\u038c"+
		"\u0005`\u0000\u0000\u038c\u038d\u0003\u0006\u0003\u0000\u038d\u038e\u0005"+
		"f\u0000\u0000\u038e\u038f\u0005-\u0000\u0000\u038f\u0390\u0003\u0006\u0003"+
		"\u0000\u0390\u0392\u0001\u0000\u0000\u0000\u0391\u0383\u0001\u0000\u0000"+
		"\u0000\u0391\u038a\u0001\u0000\u0000\u0000\u0392_\u0001\u0000\u0000\u0000"+
		"\u0393\u039e\u0005g\u0000\u0000\u0394\u039e\u0005h\u0000\u0000\u0395\u039e"+
		"\u0005i\u0000\u0000\u0396\u039e\u0005j\u0000\u0000\u0397\u039e\u0005k"+
		"\u0000\u0000\u0398\u039e\u0005l\u0000\u0000\u0399\u039e\u0005m\u0000\u0000"+
		"\u039a\u039e\u0005n\u0000\u0000\u039b\u039c\u0005a\u0000\u0000\u039c\u039e"+
		"\u0005\u00a5\u0000\u0000\u039d\u0393\u0001\u0000\u0000\u0000\u039d\u0394"+
		"\u0001\u0000\u0000\u0000\u039d\u0395\u0001\u0000\u0000\u0000\u039d\u0396"+
		"\u0001\u0000\u0000\u0000\u039d\u0397\u0001\u0000\u0000\u0000\u039d\u0398"+
		"\u0001\u0000\u0000\u0000\u039d\u0399\u0001\u0000\u0000\u0000\u039d\u039a"+
		"\u0001\u0000\u0000\u0000\u039d\u039b\u0001\u0000\u0000\u0000\u039ea\u0001"+
		"\u0000\u0000\u0000\u039f\u03a0\u0005_\u0000\u0000\u03a0\u03a1\u0007\u0003"+
		"\u0000\u0000\u03a1\u03a2\u0003\u0006\u0003\u0000\u03a2\u03a3\u0005e\u0000"+
		"\u0000\u03a3\u03a4\u0005-\u0000\u0000\u03a4\u03a5\u0003\u0006\u0003\u0000"+
		"\u03a5\u03b2\u0001\u0000\u0000\u0000\u03a6\u03a7\u0005_\u0000\u0000\u03a7"+
		"\u03a8\u0007\u0003\u0000\u0000\u03a8\u03aa\u0003\u0006\u0003\u0000\u03a9"+
		"\u03ab\u0005&\u0000\u0000\u03aa\u03a9\u0001\u0000\u0000\u0000\u03aa\u03ab"+
		"\u0001\u0000\u0000\u0000\u03ab\u03ad\u0001\u0000\u0000\u0000\u03ac\u03ae"+
		"\u0003`0\u0000\u03ad\u03ac\u0001\u0000\u0000\u0000\u03ae\u03af\u0001\u0000"+
		"\u0000\u0000\u03af\u03ad\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000"+
		"\u0000\u0000\u03b0\u03b2\u0001\u0000\u0000\u0000\u03b1\u039f\u0001\u0000"+
		"\u0000\u0000\u03b1\u03a6\u0001\u0000\u0000\u0000\u03b2c\u0001\u0000\u0000"+
		"\u0000\u03b3\u03b4\u0005_\u0000\u0000\u03b4\u03b5\u0005O\u0000\u0000\u03b5"+
		"\u03b6\u0003\u0006\u0003\u0000\u03b6\u03b7\u0005e\u0000\u0000\u03b7\u03b8"+
		"\u0005-\u0000\u0000\u03b8\u03b9\u0003\u0006\u0003\u0000\u03b9e\u0001\u0000"+
		"\u0000\u0000\u03ba\u03bb\u0005_\u0000\u0000\u03bb\u03bc\u0007\u0005\u0000"+
		"\u0000\u03bc\u03c1\u0003\u0010\b\u0000\u03bd\u03be\u0005\u0092\u0000\u0000"+
		"\u03be\u03bf\u0003\u008cF\u0000\u03bf\u03c0\u0005\u0093\u0000\u0000\u03c0"+
		"\u03c2\u0001\u0000\u0000\u0000\u03c1\u03bd\u0001\u0000\u0000\u0000\u03c1"+
		"\u03c2\u0001\u0000\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000\u0000\u03c3"+
		"\u03c4\u0005e\u0000\u0000\u03c4\u03c5\u0005-\u0000\u0000\u03c5\u03c6\u0003"+
		"\u0006\u0003\u0000\u03c6\u03d5\u0001\u0000\u0000\u0000\u03c7\u03c8\u0005"+
		"_\u0000\u0000\u03c8\u03c9\u0007\u0005\u0000\u0000\u03c9\u03ce\u0003\u0010"+
		"\b\u0000\u03ca\u03cb\u0005\u0092\u0000\u0000\u03cb\u03cc\u0003\u008cF"+
		"\u0000\u03cc\u03cd\u0005\u0093\u0000\u0000\u03cd\u03cf\u0001\u0000\u0000"+
		"\u0000\u03ce\u03ca\u0001\u0000\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000"+
		"\u0000\u03cf\u03d0\u0001\u0000\u0000\u0000\u03d0\u03d1\u0005f\u0000\u0000"+
		"\u03d1\u03d2\u0005-\u0000\u0000\u03d2\u03d3\u0003\u0006\u0003\u0000\u03d3"+
		"\u03d5\u0001\u0000\u0000\u0000\u03d4\u03ba\u0001\u0000\u0000\u0000\u03d4"+
		"\u03c7\u0001\u0000\u0000\u0000\u03d5g\u0001\u0000\u0000\u0000\u03d6\u03d7"+
		"\u0005_\u0000\u0000\u03d7\u03d8\u0005y\u0000\u0000\u03d8\u03d9\u0003\u0010"+
		"\b\u0000\u03d9\u03da\u0005e\u0000\u0000\u03da\u03db\u0005-\u0000\u0000"+
		"\u03db\u03dc\u0003\u0006\u0003\u0000\u03dc\u03ec\u0001\u0000\u0000\u0000"+
		"\u03dd\u03de\u0005_\u0000\u0000\u03de\u03df\u0005y\u0000\u0000\u03df\u03e0"+
		"\u0003\u0010\b\u0000\u03e0\u03e1\u0005f\u0000\u0000\u03e1\u03e2\u0005"+
		"-\u0000\u0000\u03e2\u03e3\u0003\u0006\u0003\u0000\u03e3\u03ec\u0001\u0000"+
		"\u0000\u0000\u03e4\u03e5\u0005_\u0000\u0000\u03e5\u03e6\u0005y\u0000\u0000"+
		"\u03e6\u03e7\u0003\u0010\b\u0000\u03e7\u03e8\u00054\u0000\u0000\u03e8"+
		"\u03e9\u00056\u0000\u0000\u03e9\u03ea\u0003\u0006\u0003\u0000\u03ea\u03ec"+
		"\u0001\u0000\u0000\u0000\u03eb\u03d6\u0001\u0000\u0000\u0000\u03eb\u03dd"+
		"\u0001\u0000\u0000\u0000\u03eb\u03e4\u0001\u0000\u0000\u0000\u03eci\u0001"+
		"\u0000\u0000\u0000\u03ed\u03f6\u0003n7\u0000\u03ee\u03f6\u0003p8\u0000"+
		"\u03ef\u03f6\u0003t:\u0000\u03f0\u03f6\u0003r9\u0000\u03f1\u03f6\u0003"+
		"v;\u0000\u03f2\u03f6\u0003x<\u0000\u03f3\u03f6\u0003z=\u0000\u03f4\u03f6"+
		"\u0003|>\u0000\u03f5\u03ed\u0001\u0000\u0000\u0000\u03f5\u03ee\u0001\u0000"+
		"\u0000\u0000\u03f5\u03ef\u0001\u0000\u0000\u0000\u03f5\u03f0\u0001\u0000"+
		"\u0000\u0000\u03f5\u03f1\u0001\u0000\u0000\u0000\u03f5\u03f2\u0001\u0000"+
		"\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f5\u03f4\u0001\u0000"+
		"\u0000\u0000\u03f6k\u0001\u0000\u0000\u0000\u03f7\u03fc\u0003\u0004\u0002"+
		"\u0000\u03f8\u03f9\u0005\u0090\u0000\u0000\u03f9\u03fb\u0003\u0004\u0002"+
		"\u0000\u03fa\u03f8\u0001\u0000\u0000\u0000\u03fb\u03fe\u0001\u0000\u0000"+
		"\u0000\u03fc\u03fa\u0001\u0000\u0000\u0000\u03fc\u03fd\u0001\u0000\u0000"+
		"\u0000\u03fdm\u0001\u0000\u0000\u0000\u03fe\u03fc\u0001\u0000\u0000\u0000"+
		"\u03ff\u0400\u0005c\u0000\u0000\u0400\u0403\u0005\u000b\u0000\u0000\u0401"+
		"\u0402\u0005q\u0000\u0000\u0402\u0404\u0005r\u0000\u0000\u0403\u0401\u0001"+
		"\u0000\u0000\u0000\u0403\u0404\u0001\u0000\u0000\u0000\u0404\u0405\u0001"+
		"\u0000\u0000\u0000\u0405\u0407\u0003\u0012\t\u0000\u0406\u0408\u0007\b"+
		"\u0000\u0000\u0407\u0406\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000"+
		"\u0000\u0000\u0408o\u0001\u0000\u0000\u0000\u0409\u040a\u0005c\u0000\u0000"+
		"\u040a\u040d\u00056\u0000\u0000\u040b\u040c\u0005q\u0000\u0000\u040c\u040e"+
		"\u0005r\u0000\u0000\u040d\u040b\u0001\u0000\u0000\u0000\u040d\u040e\u0001"+
		"\u0000\u0000\u0000\u040e\u040f\u0001\u0000\u0000\u0000\u040f\u0411\u0003"+
		"\u0006\u0003\u0000\u0410\u0412\u0007\b\u0000\u0000\u0411\u0410\u0001\u0000"+
		"\u0000\u0000\u0411\u0412\u0001\u0000\u0000\u0000\u0412q\u0001\u0000\u0000"+
		"\u0000\u0413\u0414\u0005c\u0000\u0000\u0414\u0417\u0005`\u0000\u0000\u0415"+
		"\u0416\u0005q\u0000\u0000\u0416\u0418\u0005r\u0000\u0000\u0417\u0415\u0001"+
		"\u0000\u0000\u0000\u0417\u0418\u0001\u0000\u0000\u0000\u0418\u0419\u0001"+
		"\u0000\u0000\u0000\u0419\u041a\u0003\u0006\u0003\u0000\u041as\u0001\u0000"+
		"\u0000\u0000\u041b\u041c\u0005c\u0000\u0000\u041c\u041f\u0007\u0003\u0000"+
		"\u0000\u041d\u041e\u0005q\u0000\u0000\u041e\u0420\u0005r\u0000\u0000\u041f"+
		"\u041d\u0001\u0000\u0000\u0000\u041f\u0420\u0001\u0000\u0000\u0000\u0420"+
		"\u0421\u0001\u0000\u0000\u0000\u0421\u0422\u0003F#\u0000\u0422u\u0001"+
		"\u0000\u0000\u0000\u0423\u0424\u0005c\u0000\u0000\u0424\u0427\u0005O\u0000"+
		"\u0000\u0425\u0426\u0005q\u0000\u0000\u0426\u0428\u0005r\u0000\u0000\u0427"+
		"\u0425\u0001\u0000\u0000\u0000\u0427\u0428\u0001\u0000\u0000\u0000\u0428"+
		"\u0429\u0001\u0000\u0000\u0000\u0429\u042b\u0003\u0012\t\u0000\u042a\u042c"+
		"\u0007\b\u0000\u0000\u042b\u042a\u0001\u0000\u0000\u0000\u042b\u042c\u0001"+
		"\u0000\u0000\u0000\u042cw\u0001\u0000\u0000\u0000\u042d\u042e\u0005c\u0000"+
		"\u0000\u042e\u0431\u0005y\u0000\u0000\u042f\u0430\u0005q\u0000\u0000\u0430"+
		"\u0432\u0005r\u0000\u0000\u0431\u042f\u0001\u0000\u0000\u0000\u0431\u0432"+
		"\u0001\u0000\u0000\u0000\u0432\u0433\u0001\u0000\u0000\u0000\u0433\u0435"+
		"\u0003\u0012\t\u0000\u0434\u0436\u0007\b\u0000\u0000\u0435\u0434\u0001"+
		"\u0000\u0000\u0000\u0435\u0436\u0001\u0000\u0000\u0000\u0436y\u0001\u0000"+
		"\u0000\u0000\u0437\u0438\u0005c\u0000\u0000\u0438\u043b\u0007\u0005\u0000"+
		"\u0000\u0439\u043a\u0005q\u0000\u0000\u043a\u043c\u0005r\u0000\u0000\u043b"+
		"\u0439\u0001\u0000\u0000\u0000\u043b\u043c\u0001\u0000\u0000\u0000\u043c"+
		"\u043d\u0001\u0000\u0000\u0000\u043d\u0443\u0003\u0010\b\u0000\u043e\u0440"+
		"\u0005\u0092\u0000\u0000\u043f\u0441\u0003l6\u0000\u0440\u043f\u0001\u0000"+
		"\u0000\u0000\u0440\u0441\u0001\u0000\u0000\u0000\u0441\u0442\u0001\u0000"+
		"\u0000\u0000\u0442\u0444\u0005\u0093\u0000\u0000\u0443\u043e\u0001\u0000"+
		"\u0000\u0000\u0443\u0444\u0001\u0000\u0000\u0000\u0444\u0446\u0001\u0000"+
		"\u0000\u0000\u0445\u0447\u0007\b\u0000\u0000\u0446\u0445\u0001\u0000\u0000"+
		"\u0000\u0446\u0447\u0001\u0000\u0000\u0000\u0447{\u0001\u0000\u0000\u0000"+
		"\u0448\u0449\u0005c\u0000\u0000\u0449\u044c\u0005~\u0000\u0000\u044a\u044b"+
		"\u0005q\u0000\u0000\u044b\u044d\u0005r\u0000\u0000\u044c\u044a\u0001\u0000"+
		"\u0000\u0000\u044c\u044d\u0001\u0000\u0000\u0000\u044d\u044e\u0001\u0000"+
		"\u0000\u0000\u044e\u044f\u0003\u0006\u0003\u0000\u044f\u0450\u0005\u0012"+
		"\u0000\u0000\u0450\u0452\u0003\u0010\b\u0000\u0451\u0453\u0007\b\u0000"+
		"\u0000\u0452\u0451\u0001\u0000\u0000\u0000\u0452\u0453\u0001\u0000\u0000"+
		"\u0000\u0453}\u0001\u0000\u0000\u0000\u0454\u0455\u0005\u0092\u0000\u0000"+
		"\u0455\u0456\u0003\u000e\u0007\u0000\u0456\u0457\u0005\u0093\u0000\u0000"+
		"\u0457\u007f\u0001\u0000\u0000\u0000\u0458\u0459\u0005\u001e\u0000\u0000"+
		"\u0459\u045a\u0005\u001f\u0000\u0000\u045a\u045f\u0003\u0010\b\u0000\u045b"+
		"\u045c\u0005\u0092\u0000\u0000\u045c\u045d\u0003F#\u0000\u045d\u045e\u0005"+
		"\u0093\u0000\u0000\u045e\u0460\u0001\u0000\u0000\u0000\u045f\u045b\u0001"+
		"\u0000\u0000\u0000\u045f\u0460\u0001\u0000\u0000\u0000\u0460\u0461\u0001"+
		"\u0000\u0000\u0000\u0461\u0462\u0005t\u0000\u0000\u0462\u0467\u0003~?"+
		"\u0000\u0463\u0464\u0005\u0090\u0000\u0000\u0464\u0466\u0003~?\u0000\u0465"+
		"\u0463\u0001\u0000\u0000\u0000\u0466\u0469\u0001\u0000\u0000\u0000\u0467"+
		"\u0465\u0001\u0000\u0000\u0000\u0467\u0468\u0001\u0000\u0000\u0000\u0468"+
		"\u0081\u0001\u0000\u0000\u0000\u0469\u0467\u0001\u0000\u0000\u0000\u046a"+
		"\u0474\u0005\u001e\u0000\u0000\u046b\u0474\u0005\u0001\u0000\u0000\u046c"+
		"\u0474\u00055\u0000\u0000\u046d\u0474\u00053\u0000\u0000\u046e\u0474\u0005"+
		"\u0003\u0000\u0000\u046f\u0471\u0005.\u0000\u0000\u0470\u0472\u0005v\u0000"+
		"\u0000\u0471\u0470\u0001\u0000\u0000\u0000\u0471\u0472\u0001\u0000\u0000"+
		"\u0000\u0472\u0474\u0001\u0000\u0000\u0000\u0473\u046a\u0001\u0000\u0000"+
		"\u0000\u0473\u046b\u0001\u0000\u0000\u0000\u0473\u046c\u0001\u0000\u0000"+
		"\u0000\u0473\u046d\u0001\u0000\u0000\u0000\u0473\u046e\u0001\u0000\u0000"+
		"\u0000\u0473\u046f\u0001\u0000\u0000\u0000\u0474\u0083\u0001\u0000\u0000"+
		"\u0000\u0475\u047a\u0003\u0082A\u0000\u0476\u0477\u0005\u0090\u0000\u0000"+
		"\u0477\u0479\u0003\u0082A\u0000\u0478\u0476\u0001\u0000\u0000\u0000\u0479"+
		"\u047c\u0001\u0000\u0000\u0000\u047a\u0478\u0001\u0000\u0000\u0000\u047a"+
		"\u047b\u0001\u0000\u0000\u0000\u047b\u0085\u0001\u0000\u0000\u0000\u047c"+
		"\u047a\u0001\u0000\u0000\u0000\u047d\u047e\u0005\u001b\u0000\u0000\u047e"+
		"\u047f\u0003\u0084B\u0000\u047f\u0481\u0005\u0012\u0000\u0000\u0480\u0482"+
		"\u0005\u000b\u0000\u0000\u0481\u0480\u0001\u0000\u0000\u0000\u0481\u0482"+
		"\u0001\u0000\u0000\u0000\u0482\u0483\u0001\u0000\u0000\u0000\u0483\u0484"+
		"\u0003\u0010\b\u0000\u0484\u0485\u0005-\u0000\u0000\u0485\u0486\u0003"+
		"\u0006\u0003\u0000\u0486\u0087\u0001\u0000\u0000\u0000\u0487\u0488\u0005"+
		"u\u0000\u0000\u0488\u0489\u0003\u0084B\u0000\u0489\u048b\u0005\u0012\u0000"+
		"\u0000\u048a\u048c\u0005\u000b\u0000\u0000\u048b\u048a\u0001\u0000\u0000"+
		"\u0000\u048b\u048c\u0001\u0000\u0000\u0000\u048c\u048d\u0001\u0000\u0000"+
		"\u0000\u048d\u048e\u0003\u0010\b\u0000\u048e\u048f\u0005\u0002\u0000\u0000"+
		"\u048f\u0490\u0003\u0006\u0003\u0000\u0490\u0089\u0001\u0000\u0000\u0000"+
		"\u0491\u0493\u0005]\u0000\u0000\u0492\u0494\u0005w\u0000\u0000\u0493\u0492"+
		"\u0001\u0000\u0000\u0000\u0493\u0494\u0001\u0000\u0000\u0000\u0494\u049e"+
		"\u0001\u0000\u0000\u0000\u0495\u0497\u0005\\\u0000\u0000\u0496\u0498\u0005"+
		"w\u0000\u0000\u0497\u0496\u0001\u0000\u0000\u0000\u0497\u0498\u0001\u0000"+
		"\u0000\u0000\u0498\u049e\u0001\u0000\u0000\u0000\u0499\u049b\u0005^\u0000"+
		"\u0000\u049a\u049c\u0005w\u0000\u0000\u049b\u049a\u0001\u0000\u0000\u0000"+
		"\u049b\u049c\u0001\u0000\u0000\u0000\u049c\u049e\u0001\u0000\u0000\u0000"+
		"\u049d\u0491\u0001\u0000\u0000\u0000\u049d\u0495\u0001\u0000\u0000\u0000"+
		"\u049d\u0499\u0001\u0000\u0000\u0000\u049e\u008b\u0001\u0000\u0000\u0000"+
		"\u049f\u04a4\u0003N\'\u0000\u04a0\u04a1\u0005\u0090\u0000\u0000\u04a1"+
		"\u04a3\u0003N\'\u0000\u04a2\u04a0\u0001\u0000\u0000\u0000\u04a3\u04a6"+
		"\u0001\u0000\u0000\u0000\u04a4\u04a2\u0001\u0000\u0000\u0000\u04a4\u04a5"+
		"\u0001\u0000\u0000\u0000\u04a5\u008d\u0001\u0000\u0000\u0000\u04a6\u04a4"+
		"\u0001\u0000\u0000\u0000\u04a7\u04a8\u0006G\uffff\uffff\u0000\u04a8\u04a9"+
		"\u0005\u0092\u0000\u0000\u04a9\u04aa\u0003\u008eG\u0000\u04aa\u04ab\u0005"+
		"\u0093\u0000\u0000\u04ab\u04cd\u0001\u0000\u0000\u0000\u04ac\u04ad\u0005"+
		"\u0016\u0000\u0000\u04ad\u04cd\u0003\u008eG\u0014\u04ae\u04af\u00050\u0000"+
		"\u0000\u04af\u04b0\u0005\u0092\u0000\u0000\u04b0\u04b1\u0003\u008eG\u0000"+
		"\u04b1\u04b2\u0005)\u0000\u0000\u04b2\u04b3\u0003\u0004\u0002\u0000\u04b3"+
		"\u04b4\u0005\u0093\u0000\u0000\u04b4\u04cd\u0001\u0000\u0000\u0000\u04b5"+
		"\u04b6\u00051\u0000\u0000\u04b6\u04b7\u0005\u00a3\u0000\u0000\u04b7\u04b8"+
		"\u0003\u000e\u0007\u0000\u04b8\u04b9\u0005\u00a4\u0000\u0000\u04b9\u04cd"+
		"\u0001\u0000\u0000\u0000\u04ba\u04bb\u0005\u0092\u0000\u0000\u04bb\u04bc"+
		"\u0003\f\u0006\u0000\u04bc\u04bd\u0005\u0093\u0000\u0000\u04bd\u04cd\u0001"+
		"\u0000\u0000\u0000\u04be\u04bf\u0003\u0010\b\u0000\u04bf\u04c1\u0005\u0092"+
		"\u0000\u0000\u04c0\u04c2\u0003\u000e\u0007\u0000\u04c1\u04c0\u0001\u0000"+
		"\u0000\u0000\u04c1\u04c2\u0001\u0000\u0000\u0000\u04c2\u04c3\u0001\u0000"+
		"\u0000\u0000\u04c3\u04c4\u0005\u0093\u0000\u0000\u04c4\u04cd\u0001\u0000"+
		"\u0000\u0000\u04c5\u04cd\u0003&\u0013\u0000\u04c6\u04cd\u0003$\u0012\u0000"+
		"\u04c7\u04cd\u0005\u00a7\u0000\u0000\u04c8\u04cd\u0005\u00a5\u0000\u0000"+
		"\u04c9\u04cd\u0005 \u0000\u0000\u04ca\u04cd\u0005!\u0000\u0000\u04cb\u04cd"+
		"\u0005\u0015\u0000\u0000\u04cc\u04a7\u0001\u0000\u0000\u0000\u04cc\u04ac"+
		"\u0001\u0000\u0000\u0000\u04cc\u04ae\u0001\u0000\u0000\u0000\u04cc\u04b5"+
		"\u0001\u0000\u0000\u0000\u04cc\u04ba\u0001\u0000\u0000\u0000\u04cc\u04be"+
		"\u0001\u0000\u0000\u0000\u04cc\u04c5\u0001\u0000\u0000\u0000\u04cc\u04c6"+
		"\u0001\u0000\u0000\u0000\u04cc\u04c7\u0001\u0000\u0000\u0000\u04cc\u04c8"+
		"\u0001\u0000\u0000\u0000\u04cc\u04c9\u0001\u0000\u0000\u0000\u04cc\u04ca"+
		"\u0001\u0000\u0000\u0000\u04cc\u04cb\u0001\u0000\u0000\u0000\u04cd\u04ea"+
		"\u0001\u0000\u0000\u0000\u04ce\u04cf\n\u0013\u0000\u0000\u04cf\u04d0\u0007"+
		"\t\u0000\u0000\u04d0\u04e9\u0003\u008eG\u0014\u04d1\u04d2\n\u0012\u0000"+
		"\u0000\u04d2\u04d3\u0005\u008b\u0000\u0000\u04d3\u04e9\u0003\u008eG\u0013"+
		"\u04d4\u04d5\n\u0011\u0000\u0000\u04d5\u04d6\u0005\u008c\u0000\u0000\u04d6"+
		"\u04e9\u0003\u008eG\u0012\u04d7\u04d8\n\u0010\u0000\u0000\u04d8\u04d9"+
		"\u0007\n\u0000\u0000\u04d9\u04e9\u0003\u008eG\u0011\u04da\u04db\n\u000f"+
		"\u0000\u0000\u04db\u04dc\u0005%\u0000\u0000\u04dc\u04e9\u0003\u008eG\u0010"+
		"\u04dd\u04de\n\u000e\u0000\u0000\u04de\u04df\u0005$\u0000\u0000\u04df"+
		"\u04e9\u0003\u008eG\u000f\u04e0\u04e1\n\f\u0000\u0000\u04e1\u04e2\u0005"+
		"\u00a2\u0000\u0000\u04e2\u04e9\u0003\u0004\u0002\u0000\u04e3\u04e4\n\n"+
		"\u0000\u0000\u04e4\u04e5\u0005\u00a3\u0000\u0000\u04e5\u04e6\u0003\u008e"+
		"G\u0000\u04e6\u04e7\u0005\u00a4\u0000\u0000\u04e7\u04e9\u0001\u0000\u0000"+
		"\u0000\u04e8\u04ce\u0001\u0000\u0000\u0000\u04e8\u04d1\u0001\u0000\u0000"+
		"\u0000\u04e8\u04d4\u0001\u0000\u0000\u0000\u04e8\u04d7\u0001\u0000\u0000"+
		"\u0000\u04e8\u04da\u0001\u0000\u0000\u0000\u04e8\u04dd\u0001\u0000\u0000"+
		"\u0000\u04e8\u04e0\u0001\u0000\u0000\u0000\u04e8\u04e3\u0001\u0000\u0000"+
		"\u0000\u04e9\u04ec\u0001\u0000\u0000\u0000\u04ea\u04e8\u0001\u0000\u0000"+
		"\u0000\u04ea\u04eb\u0001\u0000\u0000\u0000\u04eb\u008f\u0001\u0000\u0000"+
		"\u0000\u04ec\u04ea\u0001\u0000\u0000\u0000\u008b\u0093\u009f\u00a2\u00a9"+
		"\u00ac\u00b2\u00b8\u00bf\u00ca\u00d0\u00d6\u00e2\u00e8\u00ed\u0113\u011c"+
		"\u0120\u0125\u0129\u012e\u0132\u0139\u013f\u0146\u014b\u014e\u0154\u0157"+
		"\u0159\u015c\u0165\u016f\u0175\u017a\u0181\u0189\u018f\u0192\u0194\u019b"+
		"\u01a9\u01b9\u01d3\u01de\u01ec\u01f1\u01fd\u0205\u020e\u0218\u021e\u022b"+
		"\u0231\u0240\u0247\u0259\u025d\u0261\u0267\u026d\u0272\u027b\u0280\u0286"+
		"\u028e\u0291\u0293\u029d\u02a5\u02ad\u02af\u02b8\u02bd\u02c7\u02d4\u02d8"+
		"\u02e1\u02e8\u02ec\u02f3\u02fb\u0303\u030d\u0312\u031a\u031f\u032c\u0334"+
		"\u033d\u0345\u034e\u0354\u035d\u0367\u0371\u0381\u0391\u039d\u03aa\u03af"+
		"\u03b1\u03c1\u03ce\u03d4\u03eb\u03f5\u03fc\u0403\u0407\u040d\u0411\u0417"+
		"\u041f\u0427\u042b\u0431\u0435\u043b\u0440\u0443\u0446\u044c\u0452\u045f"+
		"\u0467\u0471\u0473\u047a\u0481\u048b\u0493\u0497\u049b\u049d\u04a4\u04c1"+
		"\u04cc\u04e8\u04ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}