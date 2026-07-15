# Importamos el Listener base generado por ANTLR
# (Asegúrate de que se llame ExprListener o el nombre de tu gramática)
from ExprListener import ExprListener

class AnalizadorSemantico(ExprListener):
    def __init__(self):
        self.tablas_creadas = set()
        self.errores_semanticos = []

    def enterCreate_table(self, ctx):
        try:
            # Intentamos obtener el texto. Si tu regla no se llama 'nombre_calificado', esto fallará y nos dirá por qué.
            nombre_tabla = ctx.nombre_calificado().getText()
            self.tablas_creadas.add(nombre_tabla)
            print(f"¡Éxito! Tabla {nombre_tabla} guardada en memoria.") # Para ver en la terminal
        except Exception as e:
            # ¡Aquí está la magia! En vez de 'pass', imprimimos el error en la terminal negra
            print(f"Error en enterCreate_table: No se encontró la regla. Detalles: {e}")

    def enterDrop_table(self, ctx):
        try:
            # Ahora sí llamamos a la función exacta que ANTLR generó
            if ctx.lista_nomb_cali():
                
                # Obtenemos el texto completo (ej. "rrhh.tabla1,rrhh.tabla2")
                texto_tablas = ctx.lista_nomb_cali().getText()
                
                # Lo dividimos por las comas por si intentan borrar varias al mismo tiempo
                tablas_a_borrar = texto_tablas.split(',')
                
                for tabla in tablas_a_borrar:
                    
                    # Limpiamos los espacios por si acaso
                    nombre_tabla = tabla.strip()
                    
                    # ¡LA VALIDACIÓN SEMÁNTICA!
                    if nombre_tabla not in self.tablas_creadas:
                        linea = ctx.start.line
                        self.errores_semanticos.append({
                            "linea": linea,
                            "mensaje": f"Error Semántico: Intentas borrar la tabla '{nombre_tabla}', pero no ha sido creada.",
                            "tipo": "Tabla no encontrada"
                        })
        except Exception as e:
            print(f"Error en enterDrop_table: Detalles: {e}")