# Generated from Expr.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,110,101,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,1,0,4,0,12,8,
        0,11,0,12,0,13,1,0,1,0,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,2,3,2,26,8,
        2,1,2,3,2,29,8,2,1,2,1,2,1,2,1,2,1,2,3,2,36,8,2,1,2,3,2,39,8,2,1,
        2,1,2,1,2,1,2,3,2,45,8,2,1,2,1,2,1,2,1,2,3,2,51,8,2,1,2,1,2,1,2,
        1,2,1,2,3,2,58,8,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,2,69,8,
        2,1,2,1,2,1,2,1,2,3,2,75,8,2,1,2,1,2,1,2,1,2,3,2,81,8,2,1,2,1,2,
        1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,2,93,8,2,1,3,1,3,3,3,97,8,3,1,
        4,1,4,1,4,0,0,5,0,2,4,6,8,0,1,1,0,38,82,130,0,11,1,0,0,0,2,17,1,
        0,0,0,4,92,1,0,0,0,6,96,1,0,0,0,8,98,1,0,0,0,10,12,3,8,4,0,11,10,
        1,0,0,0,12,13,1,0,0,0,13,11,1,0,0,0,13,14,1,0,0,0,14,15,1,0,0,0,
        15,16,5,0,0,1,16,1,1,0,0,0,17,18,7,0,0,0,18,3,1,0,0,0,19,93,5,43,
        0,0,20,28,5,44,0,0,21,22,5,89,0,0,22,25,5,106,0,0,23,24,5,88,0,0,
        24,26,5,106,0,0,25,23,1,0,0,0,25,26,1,0,0,0,26,27,1,0,0,0,27,29,
        5,90,0,0,28,21,1,0,0,0,28,29,1,0,0,0,29,93,1,0,0,0,30,38,5,45,0,
        0,31,32,5,89,0,0,32,35,5,106,0,0,33,34,5,88,0,0,34,36,5,106,0,0,
        35,33,1,0,0,0,35,36,1,0,0,0,36,37,1,0,0,0,37,39,5,90,0,0,38,31,1,
        0,0,0,38,39,1,0,0,0,39,93,1,0,0,0,40,44,5,46,0,0,41,42,5,89,0,0,
        42,43,5,106,0,0,43,45,5,90,0,0,44,41,1,0,0,0,44,45,1,0,0,0,45,93,
        1,0,0,0,46,50,5,47,0,0,47,48,5,89,0,0,48,49,5,106,0,0,49,51,5,90,
        0,0,50,47,1,0,0,0,50,51,1,0,0,0,51,93,1,0,0,0,52,53,5,78,0,0,53,
        57,5,79,0,0,54,55,5,89,0,0,55,56,5,106,0,0,56,58,5,90,0,0,57,54,
        1,0,0,0,57,58,1,0,0,0,58,93,1,0,0,0,59,93,5,48,0,0,60,93,5,49,0,
        0,61,93,5,50,0,0,62,93,5,51,0,0,63,93,5,53,0,0,64,68,5,54,0,0,65,
        66,5,89,0,0,66,67,5,106,0,0,67,69,5,90,0,0,68,65,1,0,0,0,68,69,1,
        0,0,0,69,93,1,0,0,0,70,74,5,55,0,0,71,72,5,89,0,0,72,73,5,106,0,
        0,73,75,5,90,0,0,74,71,1,0,0,0,74,75,1,0,0,0,75,93,1,0,0,0,76,80,
        5,56,0,0,77,78,5,89,0,0,78,79,5,106,0,0,79,81,5,90,0,0,80,77,1,0,
        0,0,80,81,1,0,0,0,81,93,1,0,0,0,82,93,5,57,0,0,83,93,5,58,0,0,84,
        93,5,59,0,0,85,93,5,60,0,0,86,93,5,61,0,0,87,93,5,62,0,0,88,93,5,
        63,0,0,89,93,5,64,0,0,90,93,5,65,0,0,91,93,5,66,0,0,92,19,1,0,0,
        0,92,20,1,0,0,0,92,30,1,0,0,0,92,40,1,0,0,0,92,46,1,0,0,0,92,52,
        1,0,0,0,92,59,1,0,0,0,92,60,1,0,0,0,92,61,1,0,0,0,92,62,1,0,0,0,
        92,63,1,0,0,0,92,64,1,0,0,0,92,70,1,0,0,0,92,76,1,0,0,0,92,82,1,
        0,0,0,92,83,1,0,0,0,92,84,1,0,0,0,92,85,1,0,0,0,92,86,1,0,0,0,92,
        87,1,0,0,0,92,88,1,0,0,0,92,89,1,0,0,0,92,90,1,0,0,0,92,91,1,0,0,
        0,93,5,1,0,0,0,94,97,5,107,0,0,95,97,3,2,1,0,96,94,1,0,0,0,96,95,
        1,0,0,0,97,7,1,0,0,0,98,99,5,106,0,0,99,9,1,0,0,0,13,13,25,28,35,
        38,44,50,57,68,74,80,92,96
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'SELECT'", "'FROM'", "'CREATE'", "'WHERE'", 
                     "'CHECK'", "'GROUP'", "'LIKE'", "'ILIKE'", "'ASC'", 
                     "'DESC'", "'TABLE'", "'COLUMN'", "'ORDER'", "'JOIN'", 
                     "'RIGHT'", "'LEFT'", "'LIMIT'", "'ON'", "'INNER'", 
                     "'USER'", "'NULL'", "'NOT'", "'NOTNULL'", "'OUTER'", 
                     "'PRIMARY'", "'HAVING'", "'GRANT'", "'REFERENCES'", 
                     "'FOREIGN'", "'INSERT'", "'INTO'", "'TRUE'", "'FALSE'", 
                     "'END'", "'DEFAULT'", "'OR'", "'AND'", "'BY'", "'UPDATE'", 
                     "'SET'", "'DELETE'", "'SCHEMA'", "'INT'", "'DECIMAL'", 
                     "'NUMERIC'", "'CHAR'", "'VARCHAR'", "'TEXT'", "'INTEGER'", 
                     "'SMALLINT'", "'SERIAL'", "'KEY'", "'DATE'", "'TIMESTAMP'", 
                     "'TIME'", "'TIMESTAMPZ'", "'BIGINT'", "'REAL'", "'BOOLEAN'", 
                     "'JSON'", "'JSONB'", "'INET'", "'CIDR'", "'MACADDR'", 
                     "'BYTEA'", "'OID'", "'INDEX'", "'DOUBLE'", "'PRECISION'", 
                     "'SUM'", "'AVG'", "'COUNT'", "'MIN'", "'MAX'", "'RANK'", 
                     "'RANDOM'", "'MD5'", "'CHARACTER'", "'VARYING'", "'COMMIT'", 
                     "'BEGIN'", "'ROLLBACK'", "'+'", "'-'", "'*'", "'/'", 
                     "'='", "','", "'('", "')'", "';'", "'|'", "'~'", "'!'", 
                     "'&'", "'?'", "'%'", "'#'", "'@'", "'^'", "'<'", "'>'", 
                     "'<='", "'>='" ]

    symbolicNames = [ "<INVALID>", "SELECT", "FROM", "CREATE", "WHERE", 
                      "CHECK", "GROUP", "LIKE", "ILIKE", "ASC", "DESC", 
                      "TABLE", "COLUMN", "ORDER", "JOIN", "RIGHT", "LEFT", 
                      "LIMIT", "ON", "INNER", "USER", "NULL", "NOT", "NOTNULL", 
                      "OUTER", "PRIMARY", "HAVING", "GRANT", "REFERENCES", 
                      "FOREIGN", "INSERT", "INTO", "TRUE", "FALSE", "END", 
                      "DEFAULT", "OR", "AND", "BY", "UPDATE", "SET", "DELETE", 
                      "SCHEMA", "INT", "DECIMAL", "NUMERIC", "CHAR", "VARCHAR", 
                      "TEXT", "INTEGER", "SMALLINT", "SERIAL", "KEY", "DATE", 
                      "TIMESTAMP", "TIME", "TIMESTAMPZ", "BIGINT", "REAL", 
                      "BOOLEAN", "JSON", "JSONB", "INET", "CIDR", "MACADDR", 
                      "BYTEA", "OID", "INDEX", "DOUBLE", "PRECISION", "SUM", 
                      "AVG", "COUNT", "MIN", "MAX", "RANK", "RANDOM", "MD5", 
                      "CHARACTER", "VARYING", "COMMIT", "BEGIN", "ROLLBACK", 
                      "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "IGUAL", 
                      "COMA", "PARENTA", "PARENTC", "PUNTOCOMA", "ORSIMB", 
                      "NOTSIMB", "EXCLAMACION", "ANDSIMB", "PREGUNTA", "PORCENTAJE", 
                      "GATO", "ARROBA", "POTENCIA", "COMP1", "COMP2", "COMPIG1", 
                      "COMPIG2", "CADENA", "NUM", "IDF", "COMENTARIO_LINEA", 
                      "COMENTARIO_BLOQUE", "WS" ]

    RULE_root = 0
    RULE_palabras_no_reservadas = 1
    RULE_tipo_dato = 2
    RULE_identi = 3
    RULE_expr = 4

    ruleNames =  [ "root", "palabras_no_reservadas", "tipo_dato", "identi", 
                   "expr" ]

    EOF = Token.EOF
    SELECT=1
    FROM=2
    CREATE=3
    WHERE=4
    CHECK=5
    GROUP=6
    LIKE=7
    ILIKE=8
    ASC=9
    DESC=10
    TABLE=11
    COLUMN=12
    ORDER=13
    JOIN=14
    RIGHT=15
    LEFT=16
    LIMIT=17
    ON=18
    INNER=19
    USER=20
    NULL=21
    NOT=22
    NOTNULL=23
    OUTER=24
    PRIMARY=25
    HAVING=26
    GRANT=27
    REFERENCES=28
    FOREIGN=29
    INSERT=30
    INTO=31
    TRUE=32
    FALSE=33
    END=34
    DEFAULT=35
    OR=36
    AND=37
    BY=38
    UPDATE=39
    SET=40
    DELETE=41
    SCHEMA=42
    INT=43
    DECIMAL=44
    NUMERIC=45
    CHAR=46
    VARCHAR=47
    TEXT=48
    INTEGER=49
    SMALLINT=50
    SERIAL=51
    KEY=52
    DATE=53
    TIMESTAMP=54
    TIME=55
    TIMESTAMPZ=56
    BIGINT=57
    REAL=58
    BOOLEAN=59
    JSON=60
    JSONB=61
    INET=62
    CIDR=63
    MACADDR=64
    BYTEA=65
    OID=66
    INDEX=67
    DOUBLE=68
    PRECISION=69
    SUM=70
    AVG=71
    COUNT=72
    MIN=73
    MAX=74
    RANK=75
    RANDOM=76
    MD5=77
    CHARACTER=78
    VARYING=79
    COMMIT=80
    BEGIN=81
    ROLLBACK=82
    SUMA=83
    RESTA=84
    MULTIPLICACION=85
    DIVISION=86
    IGUAL=87
    COMA=88
    PARENTA=89
    PARENTC=90
    PUNTOCOMA=91
    ORSIMB=92
    NOTSIMB=93
    EXCLAMACION=94
    ANDSIMB=95
    PREGUNTA=96
    PORCENTAJE=97
    GATO=98
    ARROBA=99
    POTENCIA=100
    COMP1=101
    COMP2=102
    COMPIG1=103
    COMPIG2=104
    CADENA=105
    NUM=106
    IDF=107
    COMENTARIO_LINEA=108
    COMENTARIO_BLOQUE=109
    WS=110

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ExprContext)
            else:
                return self.getTypedRuleContext(ExprParser.ExprContext,i)


        def getRuleIndex(self):
            return ExprParser.RULE_root




    def root(self):

        localctx = ExprParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 11 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 10
                self.expr()
                self.state = 13 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==106):
                    break

            self.state = 15
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Palabras_no_reservadasContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BY(self):
            return self.getToken(ExprParser.BY, 0)

        def UPDATE(self):
            return self.getToken(ExprParser.UPDATE, 0)

        def SET(self):
            return self.getToken(ExprParser.SET, 0)

        def DELETE(self):
            return self.getToken(ExprParser.DELETE, 0)

        def SCHEMA(self):
            return self.getToken(ExprParser.SCHEMA, 0)

        def INT(self):
            return self.getToken(ExprParser.INT, 0)

        def DECIMAL(self):
            return self.getToken(ExprParser.DECIMAL, 0)

        def NUMERIC(self):
            return self.getToken(ExprParser.NUMERIC, 0)

        def CHAR(self):
            return self.getToken(ExprParser.CHAR, 0)

        def VARCHAR(self):
            return self.getToken(ExprParser.VARCHAR, 0)

        def TEXT(self):
            return self.getToken(ExprParser.TEXT, 0)

        def INTEGER(self):
            return self.getToken(ExprParser.INTEGER, 0)

        def SMALLINT(self):
            return self.getToken(ExprParser.SMALLINT, 0)

        def SERIAL(self):
            return self.getToken(ExprParser.SERIAL, 0)

        def KEY(self):
            return self.getToken(ExprParser.KEY, 0)

        def DATE(self):
            return self.getToken(ExprParser.DATE, 0)

        def TIMESTAMP(self):
            return self.getToken(ExprParser.TIMESTAMP, 0)

        def TIME(self):
            return self.getToken(ExprParser.TIME, 0)

        def TIMESTAMPZ(self):
            return self.getToken(ExprParser.TIMESTAMPZ, 0)

        def BIGINT(self):
            return self.getToken(ExprParser.BIGINT, 0)

        def REAL(self):
            return self.getToken(ExprParser.REAL, 0)

        def BOOLEAN(self):
            return self.getToken(ExprParser.BOOLEAN, 0)

        def JSON(self):
            return self.getToken(ExprParser.JSON, 0)

        def JSONB(self):
            return self.getToken(ExprParser.JSONB, 0)

        def INET(self):
            return self.getToken(ExprParser.INET, 0)

        def CIDR(self):
            return self.getToken(ExprParser.CIDR, 0)

        def MACADDR(self):
            return self.getToken(ExprParser.MACADDR, 0)

        def BYTEA(self):
            return self.getToken(ExprParser.BYTEA, 0)

        def OID(self):
            return self.getToken(ExprParser.OID, 0)

        def INDEX(self):
            return self.getToken(ExprParser.INDEX, 0)

        def DOUBLE(self):
            return self.getToken(ExprParser.DOUBLE, 0)

        def PRECISION(self):
            return self.getToken(ExprParser.PRECISION, 0)

        def SUM(self):
            return self.getToken(ExprParser.SUM, 0)

        def AVG(self):
            return self.getToken(ExprParser.AVG, 0)

        def COUNT(self):
            return self.getToken(ExprParser.COUNT, 0)

        def MIN(self):
            return self.getToken(ExprParser.MIN, 0)

        def MAX(self):
            return self.getToken(ExprParser.MAX, 0)

        def RANK(self):
            return self.getToken(ExprParser.RANK, 0)

        def RANDOM(self):
            return self.getToken(ExprParser.RANDOM, 0)

        def MD5(self):
            return self.getToken(ExprParser.MD5, 0)

        def CHARACTER(self):
            return self.getToken(ExprParser.CHARACTER, 0)

        def VARYING(self):
            return self.getToken(ExprParser.VARYING, 0)

        def COMMIT(self):
            return self.getToken(ExprParser.COMMIT, 0)

        def BEGIN(self):
            return self.getToken(ExprParser.BEGIN, 0)

        def ROLLBACK(self):
            return self.getToken(ExprParser.ROLLBACK, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_palabras_no_reservadas




    def palabras_no_reservadas(self):

        localctx = ExprParser.Palabras_no_reservadasContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_palabras_no_reservadas)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 17
            _la = self._input.LA(1)
            if not(((((_la - 38)) & ~0x3f) == 0 and ((1 << (_la - 38)) & 35184372088831) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Tipo_datoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(ExprParser.INT, 0)

        def DECIMAL(self):
            return self.getToken(ExprParser.DECIMAL, 0)

        def PARENTA(self):
            return self.getToken(ExprParser.PARENTA, 0)

        def NUM(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.NUM)
            else:
                return self.getToken(ExprParser.NUM, i)

        def PARENTC(self):
            return self.getToken(ExprParser.PARENTC, 0)

        def COMA(self):
            return self.getToken(ExprParser.COMA, 0)

        def NUMERIC(self):
            return self.getToken(ExprParser.NUMERIC, 0)

        def CHAR(self):
            return self.getToken(ExprParser.CHAR, 0)

        def VARCHAR(self):
            return self.getToken(ExprParser.VARCHAR, 0)

        def CHARACTER(self):
            return self.getToken(ExprParser.CHARACTER, 0)

        def VARYING(self):
            return self.getToken(ExprParser.VARYING, 0)

        def TEXT(self):
            return self.getToken(ExprParser.TEXT, 0)

        def INTEGER(self):
            return self.getToken(ExprParser.INTEGER, 0)

        def SMALLINT(self):
            return self.getToken(ExprParser.SMALLINT, 0)

        def SERIAL(self):
            return self.getToken(ExprParser.SERIAL, 0)

        def DATE(self):
            return self.getToken(ExprParser.DATE, 0)

        def TIMESTAMP(self):
            return self.getToken(ExprParser.TIMESTAMP, 0)

        def TIME(self):
            return self.getToken(ExprParser.TIME, 0)

        def TIMESTAMPZ(self):
            return self.getToken(ExprParser.TIMESTAMPZ, 0)

        def BIGINT(self):
            return self.getToken(ExprParser.BIGINT, 0)

        def REAL(self):
            return self.getToken(ExprParser.REAL, 0)

        def BOOLEAN(self):
            return self.getToken(ExprParser.BOOLEAN, 0)

        def JSON(self):
            return self.getToken(ExprParser.JSON, 0)

        def JSONB(self):
            return self.getToken(ExprParser.JSONB, 0)

        def INET(self):
            return self.getToken(ExprParser.INET, 0)

        def CIDR(self):
            return self.getToken(ExprParser.CIDR, 0)

        def MACADDR(self):
            return self.getToken(ExprParser.MACADDR, 0)

        def BYTEA(self):
            return self.getToken(ExprParser.BYTEA, 0)

        def OID(self):
            return self.getToken(ExprParser.OID, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_tipo_dato




    def tipo_dato(self):

        localctx = ExprParser.Tipo_datoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_tipo_dato)
        self._la = 0 # Token type
        try:
            self.state = 92
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [43]:
                self.enterOuterAlt(localctx, 1)
                self.state = 19
                self.match(ExprParser.INT)
                pass
            elif token in [44]:
                self.enterOuterAlt(localctx, 2)
                self.state = 20
                self.match(ExprParser.DECIMAL)
                self.state = 28
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==89:
                    self.state = 21
                    self.match(ExprParser.PARENTA)
                    self.state = 22
                    self.match(ExprParser.NUM)
                    self.state = 25
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==88:
                        self.state = 23
                        self.match(ExprParser.COMA)
                        self.state = 24
                        self.match(ExprParser.NUM)


                    self.state = 27
                    self.match(ExprParser.PARENTC)


                pass
            elif token in [45]:
                self.enterOuterAlt(localctx, 3)
                self.state = 30
                self.match(ExprParser.NUMERIC)
                self.state = 38
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==89:
                    self.state = 31
                    self.match(ExprParser.PARENTA)
                    self.state = 32
                    self.match(ExprParser.NUM)
                    self.state = 35
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==88:
                        self.state = 33
                        self.match(ExprParser.COMA)
                        self.state = 34
                        self.match(ExprParser.NUM)


                    self.state = 37
                    self.match(ExprParser.PARENTC)


                pass
            elif token in [46]:
                self.enterOuterAlt(localctx, 4)
                self.state = 40
                self.match(ExprParser.CHAR)
                self.state = 44
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==89:
                    self.state = 41
                    self.match(ExprParser.PARENTA)
                    self.state = 42
                    self.match(ExprParser.NUM)
                    self.state = 43
                    self.match(ExprParser.PARENTC)


                pass
            elif token in [47]:
                self.enterOuterAlt(localctx, 5)
                self.state = 46
                self.match(ExprParser.VARCHAR)
                self.state = 50
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==89:
                    self.state = 47
                    self.match(ExprParser.PARENTA)
                    self.state = 48
                    self.match(ExprParser.NUM)
                    self.state = 49
                    self.match(ExprParser.PARENTC)


                pass
            elif token in [78]:
                self.enterOuterAlt(localctx, 6)
                self.state = 52
                self.match(ExprParser.CHARACTER)
                self.state = 53
                self.match(ExprParser.VARYING)
                self.state = 57
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==89:
                    self.state = 54
                    self.match(ExprParser.PARENTA)
                    self.state = 55
                    self.match(ExprParser.NUM)
                    self.state = 56
                    self.match(ExprParser.PARENTC)


                pass
            elif token in [48]:
                self.enterOuterAlt(localctx, 7)
                self.state = 59
                self.match(ExprParser.TEXT)
                pass
            elif token in [49]:
                self.enterOuterAlt(localctx, 8)
                self.state = 60
                self.match(ExprParser.INTEGER)
                pass
            elif token in [50]:
                self.enterOuterAlt(localctx, 9)
                self.state = 61
                self.match(ExprParser.SMALLINT)
                pass
            elif token in [51]:
                self.enterOuterAlt(localctx, 10)
                self.state = 62
                self.match(ExprParser.SERIAL)
                pass
            elif token in [53]:
                self.enterOuterAlt(localctx, 11)
                self.state = 63
                self.match(ExprParser.DATE)
                pass
            elif token in [54]:
                self.enterOuterAlt(localctx, 12)
                self.state = 64
                self.match(ExprParser.TIMESTAMP)
                self.state = 68
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==89:
                    self.state = 65
                    self.match(ExprParser.PARENTA)
                    self.state = 66
                    self.match(ExprParser.NUM)
                    self.state = 67
                    self.match(ExprParser.PARENTC)


                pass
            elif token in [55]:
                self.enterOuterAlt(localctx, 13)
                self.state = 70
                self.match(ExprParser.TIME)
                self.state = 74
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==89:
                    self.state = 71
                    self.match(ExprParser.PARENTA)
                    self.state = 72
                    self.match(ExprParser.NUM)
                    self.state = 73
                    self.match(ExprParser.PARENTC)


                pass
            elif token in [56]:
                self.enterOuterAlt(localctx, 14)
                self.state = 76
                self.match(ExprParser.TIMESTAMPZ)
                self.state = 80
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==89:
                    self.state = 77
                    self.match(ExprParser.PARENTA)
                    self.state = 78
                    self.match(ExprParser.NUM)
                    self.state = 79
                    self.match(ExprParser.PARENTC)


                pass
            elif token in [57]:
                self.enterOuterAlt(localctx, 15)
                self.state = 82
                self.match(ExprParser.BIGINT)
                pass
            elif token in [58]:
                self.enterOuterAlt(localctx, 16)
                self.state = 83
                self.match(ExprParser.REAL)
                pass
            elif token in [59]:
                self.enterOuterAlt(localctx, 17)
                self.state = 84
                self.match(ExprParser.BOOLEAN)
                pass
            elif token in [60]:
                self.enterOuterAlt(localctx, 18)
                self.state = 85
                self.match(ExprParser.JSON)
                pass
            elif token in [61]:
                self.enterOuterAlt(localctx, 19)
                self.state = 86
                self.match(ExprParser.JSONB)
                pass
            elif token in [62]:
                self.enterOuterAlt(localctx, 20)
                self.state = 87
                self.match(ExprParser.INET)
                pass
            elif token in [63]:
                self.enterOuterAlt(localctx, 21)
                self.state = 88
                self.match(ExprParser.CIDR)
                pass
            elif token in [64]:
                self.enterOuterAlt(localctx, 22)
                self.state = 89
                self.match(ExprParser.MACADDR)
                pass
            elif token in [65]:
                self.enterOuterAlt(localctx, 23)
                self.state = 90
                self.match(ExprParser.BYTEA)
                pass
            elif token in [66]:
                self.enterOuterAlt(localctx, 24)
                self.state = 91
                self.match(ExprParser.OID)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IdentiContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDF(self):
            return self.getToken(ExprParser.IDF, 0)

        def palabras_no_reservadas(self):
            return self.getTypedRuleContext(ExprParser.Palabras_no_reservadasContext,0)


        def getRuleIndex(self):
            return ExprParser.RULE_identi




    def identi(self):

        localctx = ExprParser.IdentiContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_identi)
        try:
            self.state = 96
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [107]:
                self.enterOuterAlt(localctx, 1)
                self.state = 94
                self.match(ExprParser.IDF)
                pass
            elif token in [38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82]:
                self.enterOuterAlt(localctx, 2)
                self.state = 95
                self.palabras_no_reservadas()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUM(self):
            return self.getToken(ExprParser.NUM, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 98
            self.match(ExprParser.NUM)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





