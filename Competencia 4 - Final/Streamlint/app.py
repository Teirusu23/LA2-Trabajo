import streamlit as st
from archivo import Archivo
from analizador_lexico import AnalizadorLexico

# Importamos el nuevo analizador sintactico
from analizador_sintactico import AnalizadorSintactico


class App:

    def __init__(self):
        st.set_page_config(page_title="Analizador Lexico y Sintactico", layout="wide")
        
        # Instanciamos ambos analizadores
        self.analizador_lexico = AnalizadorLexico()
        self.analizador_sintactico = AnalizadorSintactico()

    def ejecutar(self):
        st.title("Analizador Lexico y Sintactico con ANTLR")
        st.write("Sube un archivo `.sql` para ver tokens, errores lexicos y sintacticos.")

        archivo_subido = st.file_uploader("Selecciona tu archivo", type=["sql"])

        if archivo_subido is None:
            st.info("Primero sube un archivo .sql")
            return

        archivo = Archivo(archivo_subido)

        if not archivo.es_txt():
            st.error("El archivo debe ser .sql")
            return

        codigo = archivo.leer()
        info = archivo.obtener_info()

        st.subheader("Informacion del archivo")
        st.write("Nombre:", info["nombre"])
        st.write("Extension:", info["extension"])

        st.subheader("Codigo original")
        st.code(codigo, language="text")

        # 1. Ejecutamos el analisis lexico
        self.analizador_lexico.analizar(codigo)
        tokens = self.analizador_lexico.obtener_tokens()
        errores_lex = self.analizador_lexico.obtener_errores()

        # 2. Ejecutamos el analisis sintactico pasandole los tokens del lexer
        self.analizador_sintactico.analizar(self.analizador_lexico.tokens)
        errores_sint = self.analizador_sintactico.obtener_errores()
        arbol_texto = self.analizador_sintactico.obtener_arbol_texto()

        # Mostramos resultados lexicos
        st.subheader("Tokens")
        if len(tokens) == 0:
            st.warning("No se encontraron tokens")
        else:
            st.dataframe(tokens, use_container_width=True)

        st.subheader("Errores Lexicos")
        if len(errores_lex) == 0:
            st.success("No hay errores lexicos")
        else:
            st.dataframe(errores_lex, use_container_width=True)

        # Mostramos resultados sintacticos
        st.subheader("Errores Sintacticos")
        if len(errores_sint) == 0:
            st.success("No hay errores sintacticos")
        else:
            st.dataframe(errores_sint, use_container_width=True)

        st.subheader("Arbol de Derivacion")
        if arbol_texto:
            st.code(arbol_texto, language="lisp")


if __name__ == "__main__":
    app = App()
    app.ejecutar()