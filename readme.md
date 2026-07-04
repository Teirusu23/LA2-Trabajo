### Requisitos previos

```markdown
## Requisitos previos

- Java 21 o superior
- Python 3
- Visual Studio Code
- Git
- ANTLR4
```

### Instalación

```markdown
## Instalación

1. Clonar el repositorio:

```bash
git clone https://github.com/usuario/proyecto.git
```

2. Entrar a la carpeta del proyecto:

```bash
cd proyecto
```

3. Instalar dependencias:

```bash
pip install -r requirements.txt
```
```

### Configuración


```markdown
## Configuración

Configurar la variable de entorno `CLASSPATH` para poder ejecutar ANTLR4 desde PowerShell.
```

### 7. Ejecución del proyecto

```markdown
## Ejecución para los ejercicios de streamlit

```bash
streamlit run app.py
```

## Ejecución para los ejercicios de POO

```bash
py .\main.py
```
```


# Guía de instalación de ANTLR4

## 1. Verificar Java

ANTLR4 necesita Java para poder ejecutarse. Primero revisa si ya tienes Java instalado.

```powershell
java -version
```

Si no tienes Java instalado, puedes instalarlo con alguno de estos comandos en PowerShell:

```powershell
winget install EclipseAdoptium.Temurin.21.JDK
```

O también:

```powershell
winget install Microsoft.OpenJDK.21
```

Después de instalar Java, cierra la terminal, vuelve a abrirla y verifica nuevamente:

```powershell
java -version
```

## 2. Descargar ANTLR4

Descarga el archivo:

```text
antlr-4.13.2-complete.jar
```

Se recomienda guardar el archivo en una ruta fija y fácil de ubicar, por ejemplo:

```text
C:\antlr\antlr-4.13.2-complete.jar
```

## 3. Validar que el archivo exista

Antes de configurar la variable de entorno, valida que el archivo exista en la ruta indicada.

Ejemplo:

```powershell
Test-Path "C:\antlr\antlr-4.13.2-complete.jar"
```

Si devuelve:

```text
True
```

Significa que el archivo sí existe y la ruta es correcta.

Si devuelve:

```text
False
```

Significa que la ruta está mal o que el archivo no está en esa ubicación.

## 4. Configurar variable de entorno CLASSPATH

Ejecuta el siguiente comando en PowerShell:

```powershell
[Environment]::SetEnvironmentVariable("CLASSPATH", "C:\antlr\antlr-4.13.2-complete.jar", "User")
```

Después de ejecutar el comando, cierra PowerShell y vuelve a abrirlo para que Windows cargue la variable de entorno.

## 5. Confirmar que la variable se guardó

Ejecuta:

```powershell
echo $env:CLASSPATH
```

También puedes verificarla con:

```powershell
[Environment]::GetEnvironmentVariable("CLASSPATH", "User")
```

Debe aparecer una ruta similar a esta:

```text
C:\antlr\antlr-4.13.2-complete.jar
```

## 6. Probar que ANTLR4 funciona

Ejecuta:

```powershell
java org.antlr.v4.Tool
```

Si aparece la ayuda de ANTLR, la instalación quedó correctamente configurada.

---

# Instalación del runtime de ANTLR4 para Python

## Opción 1: Instalar ANTLR4 global en Python

Si deseas instalar la dependencia de ANTLR4 directamente en Python de forma global, ejecuta:

```powershell
pip install antlr4-python3-runtime
```

## Opción 2: Usar un entorno virtual de Python

Se recomienda usar un entorno virtual para que las dependencias del proyecto no se mezclen con las dependencias globales de Python.

## Comandos para crear y activar el environment

Crear el entorno virtual:

```powershell
python -m venv .venv
```

Activar el entorno virtual en PowerShell:

```powershell
.\.venv\Scripts\Activate.ps1
```

## Si da error de permisos

Si PowerShell muestra error de permisos al activar el entorno virtual, ejecuta:

```powershell
Set-ExecutionPolicy -Scope Process -ExecutionPolicy Bypass
```

Después intenta activar nuevamente:

```powershell
.\.venv\Scripts\Activate.ps1
```

## Instalar dependencias

Actualizar pip:

```powershell
python -m pip install --upgrade pip
```

Instalar las dependencias del archivo `requirements.txt`:

```powershell
pip install -r requirements.txt
```

Ejemplo de contenido básico para `requirements.txt`:

```text
antlr4-python3-runtime
streamlit
```

## Correr la aplicación

Para ejecutar la aplicación con Streamlit:

```powershell
streamlit run app.py
```

## Desactivar el environment

Cuando termines de trabajar, puedes desactivar el entorno virtual con:

```powershell
deactivate
```

---

# Generar archivos de Python desde Expr.g4

Para generar los archivos de Python a partir de la gramática `Expr.g4`, ejecuta el siguiente comando en PowerShell:

```powershell
java -jar $env:CLASSPATH -Dlanguage=Python3 -no-listener .\Expr.g4
```

Este comando genera los archivos necesarios para usar la gramática en Python, por ejemplo:

```text
ExprLexer.py
ExprParser.py
Expr.tokens
ExprLexer.tokens
```

## Nota importante

Debe existir el archivo `Expr.g4` en la carpeta donde estás ejecutando el comando.

Puedes validar que estás en la carpeta correcta con:

```powershell
dir
```

Si el archivo está en otra carpeta, entra primero a esa ubicación:

```powershell
cd ruta\del\proyecto
```

Luego ejecuta nuevamente:

```powershell
java -jar $env:CLASSPATH -Dlanguage=Python3 -no-listener .\Expr.g4
```

---

# Comandos rápidos

## Java

```powershell
java -version
```

## Instalar Java

```powershell
winget install EclipseAdoptium.Temurin.21.JDK
```

```powershell
winget install Microsoft.OpenJDK.21
```

## Verificar archivo de ANTLR4

```powershell
Test-Path "C:\antlr\antlr-4.13.2-complete.jar"
```

## Configurar CLASSPATH

```powershell
[Environment]::SetEnvironmentVariable("CLASSPATH", "C:\antlr\antlr-4.13.2-complete.jar", "User")
```

## Verificar CLASSPATH

```powershell
echo $env:CLASSPATH
```

```powershell
[Environment]::GetEnvironmentVariable("CLASSPATH", "User")
```

## Probar ANTLR4

```powershell
java org.antlr.v4.Tool
```

## Instalar runtime global de ANTLR4 para Python

```powershell
pip install antlr4-python3-runtime
```

## Crear entorno virtual

```powershell
python -m venv .venv
```

## Activar entorno virtual

```powershell
.\.venv\Scripts\Activate.ps1
```

## Permiso temporal si falla la activación

```powershell
Set-ExecutionPolicy -Scope Process -ExecutionPolicy Bypass
```

## Actualizar pip

```powershell
python -m pip install --upgrade pip
```

## Instalar dependencias

```powershell
pip install -r requirements.txt
```

## Ejecutar Streamlit

```powershell
streamlit run app.py
```

## Generar archivos desde Expr.g4

```powershell
java -jar $env:CLASSPATH -Dlanguage=Python3 -no-listener .\Expr.g4
```

## Desactivar entorno virtual

```powershell
deactivate
```

---