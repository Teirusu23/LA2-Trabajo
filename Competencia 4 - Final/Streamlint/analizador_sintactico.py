# Importamos ErrorListener para capturar errores sintacticos
from antlr4.error.ErrorListener import ErrorListener

# Importamos el parser generado por ANTLR (asegurate de que el nombre coincida)
from ExprParser import ExprParser


# Clase para guardar errores sintacticos
class ErroresSintacticos(ErrorListener):

    # Constructor
    def __init__(self):

        # Lista donde guardaremos los errores
        self.lista = []

    # Metodo que ANTLR ejecuta cuando encuentra error sintactico
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):

        # Obtenemos el texto del token que causo el error
        token_texto = offendingSymbol.text if offendingSymbol else "Desconocido"

        # Guardamos el error en la lista
        self.lista.append({
            "linea": line,
            "columna": column,
            "mensaje": msg,
            "token_causante": token_texto
        })


# Clase para hacer el analisis sintactico
class AnalizadorSintactico:

    # Constructor
    def __init__(self):

        # Variable para guardar el parser
        self.parser = None

        # Objeto para guardar errores sintacticos
        self.errores = ErroresSintacticos()
        
        # Variable para guardar el arbol generado
        self.arbol = None

    # Metodo para analizar los tokens
    def analizar(self, flujo_tokens):

        # Limpiamos errores previos por si se analiza otro archivo
        self.errores.lista = []

        # Creamos el parser utilizando los tokens del lexer
        self.parser = ExprParser(flujo_tokens)

        # Quitamos los errores normales de ANTLR
        self.parser.removeErrorListeners()

        # Agregamos nuestro capturador de errores sintacticos
        self.parser.addErrorListener(self.errores)

        # Ejecutamos la regla inicial de la gramatica para generar el arbol
        # IMPORTANTE: Cambia "programa" por el nombre de tu regla inicial del archivo .g4
        self.arbol = self.parser.expr()

    # Metodo para obtener errores sintacticos
    def obtener_errores(self):

        # Retornamos la lista de errores
        return self.errores.lista

    # Metodo para obtener el arbol sintactico como texto (formato LISP)
    def obtener_arbol_texto(self):

        # Verificamos que el arbol exista
        if self.arbol and self.parser:
            
            # Retornamos el arbol en formato string
            return self.arbol.toStringTree(recog=self.parser)
            
        return ""