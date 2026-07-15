# Generated from Expr.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete listener for a parse tree produced by ExprParser.
class ExprListener(ParseTreeListener):

    # Enter a parse tree produced by ExprParser#root.
    def enterRoot(self, ctx:ExprParser.RootContext):
        pass

    # Exit a parse tree produced by ExprParser#root.
    def exitRoot(self, ctx:ExprParser.RootContext):
        pass


    # Enter a parse tree produced by ExprParser#palabras_no_reservadas.
    def enterPalabras_no_reservadas(self, ctx:ExprParser.Palabras_no_reservadasContext):
        pass

    # Exit a parse tree produced by ExprParser#palabras_no_reservadas.
    def exitPalabras_no_reservadas(self, ctx:ExprParser.Palabras_no_reservadasContext):
        pass


    # Enter a parse tree produced by ExprParser#tipo_dato.
    def enterTipo_dato(self, ctx:ExprParser.Tipo_datoContext):
        pass

    # Exit a parse tree produced by ExprParser#tipo_dato.
    def exitTipo_dato(self, ctx:ExprParser.Tipo_datoContext):
        pass


    # Enter a parse tree produced by ExprParser#identi.
    def enterIdenti(self, ctx:ExprParser.IdentiContext):
        pass

    # Exit a parse tree produced by ExprParser#identi.
    def exitIdenti(self, ctx:ExprParser.IdentiContext):
        pass


    # Enter a parse tree produced by ExprParser#setencia.
    def enterSetencia(self, ctx:ExprParser.SetenciaContext):
        pass

    # Exit a parse tree produced by ExprParser#setencia.
    def exitSetencia(self, ctx:ExprParser.SetenciaContext):
        pass


    # Enter a parse tree produced by ExprParser#use.
    def enterUse(self, ctx:ExprParser.UseContext):
        pass

    # Exit a parse tree produced by ExprParser#use.
    def exitUse(self, ctx:ExprParser.UseContext):
        pass


    # Enter a parse tree produced by ExprParser#select.
    def enterSelect(self, ctx:ExprParser.SelectContext):
        pass

    # Exit a parse tree produced by ExprParser#select.
    def exitSelect(self, ctx:ExprParser.SelectContext):
        pass


    # Enter a parse tree produced by ExprParser#lista_expresiones.
    def enterLista_expresiones(self, ctx:ExprParser.Lista_expresionesContext):
        pass

    # Exit a parse tree produced by ExprParser#lista_expresiones.
    def exitLista_expresiones(self, ctx:ExprParser.Lista_expresionesContext):
        pass


    # Enter a parse tree produced by ExprParser#nombre_calificado.
    def enterNombre_calificado(self, ctx:ExprParser.Nombre_calificadoContext):
        pass

    # Exit a parse tree produced by ExprParser#nombre_calificado.
    def exitNombre_calificado(self, ctx:ExprParser.Nombre_calificadoContext):
        pass


    # Enter a parse tree produced by ExprParser#lista_nomb_cali.
    def enterLista_nomb_cali(self, ctx:ExprParser.Lista_nomb_caliContext):
        pass

    # Exit a parse tree produced by ExprParser#lista_nomb_cali.
    def exitLista_nomb_cali(self, ctx:ExprParser.Lista_nomb_caliContext):
        pass


    # Enter a parse tree produced by ExprParser#tabla_origen.
    def enterTabla_origen(self, ctx:ExprParser.Tabla_origenContext):
        pass

    # Exit a parse tree produced by ExprParser#tabla_origen.
    def exitTabla_origen(self, ctx:ExprParser.Tabla_origenContext):
        pass


    # Enter a parse tree produced by ExprParser#join.
    def enterJoin(self, ctx:ExprParser.JoinContext):
        pass

    # Exit a parse tree produced by ExprParser#join.
    def exitJoin(self, ctx:ExprParser.JoinContext):
        pass


    # Enter a parse tree produced by ExprParser#tabla_ref.
    def enterTabla_ref(self, ctx:ExprParser.Tabla_refContext):
        pass

    # Exit a parse tree produced by ExprParser#tabla_ref.
    def exitTabla_ref(self, ctx:ExprParser.Tabla_refContext):
        pass


    # Enter a parse tree produced by ExprParser#ordenamiento.
    def enterOrdenamiento(self, ctx:ExprParser.OrdenamientoContext):
        pass

    # Exit a parse tree produced by ExprParser#ordenamiento.
    def exitOrdenamiento(self, ctx:ExprParser.OrdenamientoContext):
        pass


    # Enter a parse tree produced by ExprParser#lista_ordenamiento.
    def enterLista_ordenamiento(self, ctx:ExprParser.Lista_ordenamientoContext):
        pass

    # Exit a parse tree produced by ExprParser#lista_ordenamiento.
    def exitLista_ordenamiento(self, ctx:ExprParser.Lista_ordenamientoContext):
        pass


    # Enter a parse tree produced by ExprParser#lista_columnas.
    def enterLista_columnas(self, ctx:ExprParser.Lista_columnasContext):
        pass

    # Exit a parse tree produced by ExprParser#lista_columnas.
    def exitLista_columnas(self, ctx:ExprParser.Lista_columnasContext):
        pass


    # Enter a parse tree produced by ExprParser#elemento_select.
    def enterElemento_select(self, ctx:ExprParser.Elemento_selectContext):
        pass

    # Exit a parse tree produced by ExprParser#elemento_select.
    def exitElemento_select(self, ctx:ExprParser.Elemento_selectContext):
        pass


    # Enter a parse tree produced by ExprParser#lista_tablas.
    def enterLista_tablas(self, ctx:ExprParser.Lista_tablasContext):
        pass

    # Exit a parse tree produced by ExprParser#lista_tablas.
    def exitLista_tablas(self, ctx:ExprParser.Lista_tablasContext):
        pass


    # Enter a parse tree produced by ExprParser#referencia_columna.
    def enterReferencia_columna(self, ctx:ExprParser.Referencia_columnaContext):
        pass

    # Exit a parse tree produced by ExprParser#referencia_columna.
    def exitReferencia_columna(self, ctx:ExprParser.Referencia_columnaContext):
        pass


    # Enter a parse tree produced by ExprParser#funciones_agg.
    def enterFunciones_agg(self, ctx:ExprParser.Funciones_aggContext):
        pass

    # Exit a parse tree produced by ExprParser#funciones_agg.
    def exitFunciones_agg(self, ctx:ExprParser.Funciones_aggContext):
        pass


    # Enter a parse tree produced by ExprParser#create.
    def enterCreate(self, ctx:ExprParser.CreateContext):
        pass

    # Exit a parse tree produced by ExprParser#create.
    def exitCreate(self, ctx:ExprParser.CreateContext):
        pass


    # Enter a parse tree produced by ExprParser#create_schema.
    def enterCreate_schema(self, ctx:ExprParser.Create_schemaContext):
        pass

    # Exit a parse tree produced by ExprParser#create_schema.
    def exitCreate_schema(self, ctx:ExprParser.Create_schemaContext):
        pass


    # Enter a parse tree produced by ExprParser#create_database.
    def enterCreate_database(self, ctx:ExprParser.Create_databaseContext):
        pass

    # Exit a parse tree produced by ExprParser#create_database.
    def exitCreate_database(self, ctx:ExprParser.Create_databaseContext):
        pass


    # Enter a parse tree produced by ExprParser#create_user.
    def enterCreate_user(self, ctx:ExprParser.Create_userContext):
        pass

    # Exit a parse tree produced by ExprParser#create_user.
    def exitCreate_user(self, ctx:ExprParser.Create_userContext):
        pass


    # Enter a parse tree produced by ExprParser#create_table.
    def enterCreate_table(self, ctx:ExprParser.Create_tableContext):
        pass

    # Exit a parse tree produced by ExprParser#create_table.
    def exitCreate_table(self, ctx:ExprParser.Create_tableContext):
        pass


    # Enter a parse tree produced by ExprParser#create_index.
    def enterCreate_index(self, ctx:ExprParser.Create_indexContext):
        pass

    # Exit a parse tree produced by ExprParser#create_index.
    def exitCreate_index(self, ctx:ExprParser.Create_indexContext):
        pass


    # Enter a parse tree produced by ExprParser#create_view.
    def enterCreate_view(self, ctx:ExprParser.Create_viewContext):
        pass

    # Exit a parse tree produced by ExprParser#create_view.
    def exitCreate_view(self, ctx:ExprParser.Create_viewContext):
        pass


    # Enter a parse tree produced by ExprParser#create_function.
    def enterCreate_function(self, ctx:ExprParser.Create_functionContext):
        pass

    # Exit a parse tree produced by ExprParser#create_function.
    def exitCreate_function(self, ctx:ExprParser.Create_functionContext):
        pass


    # Enter a parse tree produced by ExprParser#create_procedure.
    def enterCreate_procedure(self, ctx:ExprParser.Create_procedureContext):
        pass

    # Exit a parse tree produced by ExprParser#create_procedure.
    def exitCreate_procedure(self, ctx:ExprParser.Create_procedureContext):
        pass


    # Enter a parse tree produced by ExprParser#create_trigger.
    def enterCreate_trigger(self, ctx:ExprParser.Create_triggerContext):
        pass

    # Exit a parse tree produced by ExprParser#create_trigger.
    def exitCreate_trigger(self, ctx:ExprParser.Create_triggerContext):
        pass


    # Enter a parse tree produced by ExprParser#event_trigger.
    def enterEvent_trigger(self, ctx:ExprParser.Event_triggerContext):
        pass

    # Exit a parse tree produced by ExprParser#event_trigger.
    def exitEvent_trigger(self, ctx:ExprParser.Event_triggerContext):
        pass


    # Enter a parse tree produced by ExprParser#restriccion_col.
    def enterRestriccion_col(self, ctx:ExprParser.Restriccion_colContext):
        pass

    # Exit a parse tree produced by ExprParser#restriccion_col.
    def exitRestriccion_col(self, ctx:ExprParser.Restriccion_colContext):
        pass


    # Enter a parse tree produced by ExprParser#accion_referencial.
    def enterAccion_referencial(self, ctx:ExprParser.Accion_referencialContext):
        pass

    # Exit a parse tree produced by ExprParser#accion_referencial.
    def exitAccion_referencial(self, ctx:ExprParser.Accion_referencialContext):
        pass


    # Enter a parse tree produced by ExprParser#clausula_referencial.
    def enterClausula_referencial(self, ctx:ExprParser.Clausula_referencialContext):
        pass

    # Exit a parse tree produced by ExprParser#clausula_referencial.
    def exitClausula_referencial(self, ctx:ExprParser.Clausula_referencialContext):
        pass


    # Enter a parse tree produced by ExprParser#cuerpo_funcion.
    def enterCuerpo_funcion(self, ctx:ExprParser.Cuerpo_funcionContext):
        pass

    # Exit a parse tree produced by ExprParser#cuerpo_funcion.
    def exitCuerpo_funcion(self, ctx:ExprParser.Cuerpo_funcionContext):
        pass


    # Enter a parse tree produced by ExprParser#lista_identi.
    def enterLista_identi(self, ctx:ExprParser.Lista_identiContext):
        pass

    # Exit a parse tree produced by ExprParser#lista_identi.
    def exitLista_identi(self, ctx:ExprParser.Lista_identiContext):
        pass


    # Enter a parse tree produced by ExprParser#restricciones_tabla.
    def enterRestricciones_tabla(self, ctx:ExprParser.Restricciones_tablaContext):
        pass

    # Exit a parse tree produced by ExprParser#restricciones_tabla.
    def exitRestricciones_tabla(self, ctx:ExprParser.Restricciones_tablaContext):
        pass


    # Enter a parse tree produced by ExprParser#elemento_tabla.
    def enterElemento_tabla(self, ctx:ExprParser.Elemento_tablaContext):
        pass

    # Exit a parse tree produced by ExprParser#elemento_tabla.
    def exitElemento_tabla(self, ctx:ExprParser.Elemento_tablaContext):
        pass


    # Enter a parse tree produced by ExprParser#lista_columnas_def.
    def enterLista_columnas_def(self, ctx:ExprParser.Lista_columnas_defContext):
        pass

    # Exit a parse tree produced by ExprParser#lista_columnas_def.
    def exitLista_columnas_def(self, ctx:ExprParser.Lista_columnas_defContext):
        pass


    # Enter a parse tree produced by ExprParser#columna_def.
    def enterColumna_def(self, ctx:ExprParser.Columna_defContext):
        pass

    # Exit a parse tree produced by ExprParser#columna_def.
    def exitColumna_def(self, ctx:ExprParser.Columna_defContext):
        pass


    # Enter a parse tree produced by ExprParser#delete.
    def enterDelete(self, ctx:ExprParser.DeleteContext):
        pass

    # Exit a parse tree produced by ExprParser#delete.
    def exitDelete(self, ctx:ExprParser.DeleteContext):
        pass


    # Enter a parse tree produced by ExprParser#update.
    def enterUpdate(self, ctx:ExprParser.UpdateContext):
        pass

    # Exit a parse tree produced by ExprParser#update.
    def exitUpdate(self, ctx:ExprParser.UpdateContext):
        pass


    # Enter a parse tree produced by ExprParser#asignacion_upd.
    def enterAsignacion_upd(self, ctx:ExprParser.Asignacion_updContext):
        pass

    # Exit a parse tree produced by ExprParser#asignacion_upd.
    def exitAsignacion_upd(self, ctx:ExprParser.Asignacion_updContext):
        pass


    # Enter a parse tree produced by ExprParser#alter_accion.
    def enterAlter_accion(self, ctx:ExprParser.Alter_accionContext):
        pass

    # Exit a parse tree produced by ExprParser#alter_accion.
    def exitAlter_accion(self, ctx:ExprParser.Alter_accionContext):
        pass


    # Enter a parse tree produced by ExprParser#alter.
    def enterAlter(self, ctx:ExprParser.AlterContext):
        pass

    # Exit a parse tree produced by ExprParser#alter.
    def exitAlter(self, ctx:ExprParser.AlterContext):
        pass


    # Enter a parse tree produced by ExprParser#alter_table.
    def enterAlter_table(self, ctx:ExprParser.Alter_tableContext):
        pass

    # Exit a parse tree produced by ExprParser#alter_table.
    def exitAlter_table(self, ctx:ExprParser.Alter_tableContext):
        pass


    # Enter a parse tree produced by ExprParser#alter_schema.
    def enterAlter_schema(self, ctx:ExprParser.Alter_schemaContext):
        pass

    # Exit a parse tree produced by ExprParser#alter_schema.
    def exitAlter_schema(self, ctx:ExprParser.Alter_schemaContext):
        pass


    # Enter a parse tree produced by ExprParser#alter_database.
    def enterAlter_database(self, ctx:ExprParser.Alter_databaseContext):
        pass

    # Exit a parse tree produced by ExprParser#alter_database.
    def exitAlter_database(self, ctx:ExprParser.Alter_databaseContext):
        pass


    # Enter a parse tree produced by ExprParser#opcion_usuario.
    def enterOpcion_usuario(self, ctx:ExprParser.Opcion_usuarioContext):
        pass

    # Exit a parse tree produced by ExprParser#opcion_usuario.
    def exitOpcion_usuario(self, ctx:ExprParser.Opcion_usuarioContext):
        pass


    # Enter a parse tree produced by ExprParser#alter_user.
    def enterAlter_user(self, ctx:ExprParser.Alter_userContext):
        pass

    # Exit a parse tree produced by ExprParser#alter_user.
    def exitAlter_user(self, ctx:ExprParser.Alter_userContext):
        pass


    # Enter a parse tree produced by ExprParser#alter_index.
    def enterAlter_index(self, ctx:ExprParser.Alter_indexContext):
        pass

    # Exit a parse tree produced by ExprParser#alter_index.
    def exitAlter_index(self, ctx:ExprParser.Alter_indexContext):
        pass


    # Enter a parse tree produced by ExprParser#alter_function.
    def enterAlter_function(self, ctx:ExprParser.Alter_functionContext):
        pass

    # Exit a parse tree produced by ExprParser#alter_function.
    def exitAlter_function(self, ctx:ExprParser.Alter_functionContext):
        pass


    # Enter a parse tree produced by ExprParser#alter_view.
    def enterAlter_view(self, ctx:ExprParser.Alter_viewContext):
        pass

    # Exit a parse tree produced by ExprParser#alter_view.
    def exitAlter_view(self, ctx:ExprParser.Alter_viewContext):
        pass


    # Enter a parse tree produced by ExprParser#drop.
    def enterDrop(self, ctx:ExprParser.DropContext):
        pass

    # Exit a parse tree produced by ExprParser#drop.
    def exitDrop(self, ctx:ExprParser.DropContext):
        pass


    # Enter a parse tree produced by ExprParser#lista_tipos_dato.
    def enterLista_tipos_dato(self, ctx:ExprParser.Lista_tipos_datoContext):
        pass

    # Exit a parse tree produced by ExprParser#lista_tipos_dato.
    def exitLista_tipos_dato(self, ctx:ExprParser.Lista_tipos_datoContext):
        pass


    # Enter a parse tree produced by ExprParser#drop_table.
    def enterDrop_table(self, ctx:ExprParser.Drop_tableContext):
        pass

    # Exit a parse tree produced by ExprParser#drop_table.
    def exitDrop_table(self, ctx:ExprParser.Drop_tableContext):
        pass


    # Enter a parse tree produced by ExprParser#drop_schema.
    def enterDrop_schema(self, ctx:ExprParser.Drop_schemaContext):
        pass

    # Exit a parse tree produced by ExprParser#drop_schema.
    def exitDrop_schema(self, ctx:ExprParser.Drop_schemaContext):
        pass


    # Enter a parse tree produced by ExprParser#drop_database.
    def enterDrop_database(self, ctx:ExprParser.Drop_databaseContext):
        pass

    # Exit a parse tree produced by ExprParser#drop_database.
    def exitDrop_database(self, ctx:ExprParser.Drop_databaseContext):
        pass


    # Enter a parse tree produced by ExprParser#drop_user.
    def enterDrop_user(self, ctx:ExprParser.Drop_userContext):
        pass

    # Exit a parse tree produced by ExprParser#drop_user.
    def exitDrop_user(self, ctx:ExprParser.Drop_userContext):
        pass


    # Enter a parse tree produced by ExprParser#drop_index.
    def enterDrop_index(self, ctx:ExprParser.Drop_indexContext):
        pass

    # Exit a parse tree produced by ExprParser#drop_index.
    def exitDrop_index(self, ctx:ExprParser.Drop_indexContext):
        pass


    # Enter a parse tree produced by ExprParser#drop_view.
    def enterDrop_view(self, ctx:ExprParser.Drop_viewContext):
        pass

    # Exit a parse tree produced by ExprParser#drop_view.
    def exitDrop_view(self, ctx:ExprParser.Drop_viewContext):
        pass


    # Enter a parse tree produced by ExprParser#drop_function.
    def enterDrop_function(self, ctx:ExprParser.Drop_functionContext):
        pass

    # Exit a parse tree produced by ExprParser#drop_function.
    def exitDrop_function(self, ctx:ExprParser.Drop_functionContext):
        pass


    # Enter a parse tree produced by ExprParser#drop_trigger.
    def enterDrop_trigger(self, ctx:ExprParser.Drop_triggerContext):
        pass

    # Exit a parse tree produced by ExprParser#drop_trigger.
    def exitDrop_trigger(self, ctx:ExprParser.Drop_triggerContext):
        pass


    # Enter a parse tree produced by ExprParser#valores_fila.
    def enterValores_fila(self, ctx:ExprParser.Valores_filaContext):
        pass

    # Exit a parse tree produced by ExprParser#valores_fila.
    def exitValores_fila(self, ctx:ExprParser.Valores_filaContext):
        pass


    # Enter a parse tree produced by ExprParser#insert.
    def enterInsert(self, ctx:ExprParser.InsertContext):
        pass

    # Exit a parse tree produced by ExprParser#insert.
    def exitInsert(self, ctx:ExprParser.InsertContext):
        pass


    # Enter a parse tree produced by ExprParser#privilegios.
    def enterPrivilegios(self, ctx:ExprParser.PrivilegiosContext):
        pass

    # Exit a parse tree produced by ExprParser#privilegios.
    def exitPrivilegios(self, ctx:ExprParser.PrivilegiosContext):
        pass


    # Enter a parse tree produced by ExprParser#lista_previ.
    def enterLista_previ(self, ctx:ExprParser.Lista_previContext):
        pass

    # Exit a parse tree produced by ExprParser#lista_previ.
    def exitLista_previ(self, ctx:ExprParser.Lista_previContext):
        pass


    # Enter a parse tree produced by ExprParser#grant.
    def enterGrant(self, ctx:ExprParser.GrantContext):
        pass

    # Exit a parse tree produced by ExprParser#grant.
    def exitGrant(self, ctx:ExprParser.GrantContext):
        pass


    # Enter a parse tree produced by ExprParser#revoke.
    def enterRevoke(self, ctx:ExprParser.RevokeContext):
        pass

    # Exit a parse tree produced by ExprParser#revoke.
    def exitRevoke(self, ctx:ExprParser.RevokeContext):
        pass


    # Enter a parse tree produced by ExprParser#transaccion.
    def enterTransaccion(self, ctx:ExprParser.TransaccionContext):
        pass

    # Exit a parse tree produced by ExprParser#transaccion.
    def exitTransaccion(self, ctx:ExprParser.TransaccionContext):
        pass


    # Enter a parse tree produced by ExprParser#para_funcion.
    def enterPara_funcion(self, ctx:ExprParser.Para_funcionContext):
        pass

    # Exit a parse tree produced by ExprParser#para_funcion.
    def exitPara_funcion(self, ctx:ExprParser.Para_funcionContext):
        pass


    # Enter a parse tree produced by ExprParser#expr.
    def enterExpr(self, ctx:ExprParser.ExprContext):
        pass

    # Exit a parse tree produced by ExprParser#expr.
    def exitExpr(self, ctx:ExprParser.ExprContext):
        pass



del ExprParser