SET JAVA_HOME = "C:\Program Files\Java\jre1.8.0_271\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd "D:\Desktop\CI\Proyectos\Etapa 3\Analizador-Semantico-Compiladores\AnalizadorSemantico\src\codigo"
java -jar "D:\Desktop\CI\Proyectos\Etapa 3\Analizador-Semantico-Compiladores\lib\jflex-1.6.1.jar" Scanner.flex
pause
