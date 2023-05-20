/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;
import Estructuras.Estructura;
import Estructuras.Funcion;
import Estructuras.Parametro;
import Estructuras.SemanticStack;
import Estructuras.SematicRegister.RS;
import Estructuras.TablaSimbolosScanner;
import Estructuras.TablaSimbolosSemantico;
import Estructuras.Token;
import Estructuras.Variable;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Fabian Martinez
 */
public class Principal {
    public static void main(String[] args) {
       //String ruta = "C:/Users/liset/OneDrive/Documentos/Ingenieria en Computacion/Computacion V Semestre/Compiladores e interpretes/Proyectos/Parser/AnalizadorSintactico/src/codigo/Lexer.flex";
       //ruta = "D:/Desktop/CI/Proyectos/Etapa 1/Analizador-Lexico-Compiladores/AnalizadorLexico/src/codigo/Lexer.flex";
       //generar(ruta);
       
     /* Parametro uno = new Parametro("int", 1,"largo");
      Parametro dos = new Parametro("String", 2, "hola");
      
      ArrayList<Parametro> parametros = new ArrayList<>();
      parametros.add(uno);
      parametros.add(dos);
      
      
      
      
      Estructura funcion = new Funcion("void","main",parametros,1);
      
      Estructura variable = new Variable("void","cantidad",2,"largo");
      
      TablaSimbolosSemantico tabla = new TablaSimbolosSemantico();
      
      
      tabla.addEstructura("main", funcion);
      tabla.addEstructura("cantidad", variable);
      System.out.println(tabla.validateParametro("cantidad","main"));
      //System.err.println(funcion.imprimir());
      //  System.err.println(tabla.validateEstructura("dasdas"));
       // System.err.println(tabla.getBandera("main"));
    //  System.err.println(tabla.imprimirTablaSimbolos());*/
  
      
    }
    
    public static void generar(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
