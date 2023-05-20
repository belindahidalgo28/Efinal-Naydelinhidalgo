/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

/**
 *
 * @author liset
 */
public class TablaSimbolosSemantico {

    Hashtable<String, Estructura> tabla;
    ArrayList<String> llaves;

    public TablaSimbolosSemantico() {
        this.tabla = new Hashtable<String, Estructura>();
        this.llaves = new ArrayList<>();
    }

    public void addEstructura(String llave, Estructura nueva) {
        this.tabla.put(llave, nueva);
        this.llaves.add(llave);
    }

    public boolean getBandera(String dato) {

        if (this.tabla.containsKey(dato)) {
            if (this.tabla.get(dato).estructura.equals("variable")) {

                Variable variable = (Variable) this.tabla.get(dato);
                return variable.isBandera();

            }
        }

        return false;

    }

    public boolean validateEstructura(String dato) {

        return this.llaves.contains(dato);

    }

    public Funcion getFuncion(String funcion) {

        for (int i = 0; i < this.llaves.size(); i++) {

            if (this.tabla.get(this.llaves.get(i)).nombre.equals(funcion)
                    && this.tabla.get(this.llaves.get(i)).estructura.equals("funcion")) {
                return (Funcion) this.tabla.get(this.llaves.get(i));
            }

        }
        return null;
    }

    public boolean validateParametro(String variable, String funcion) {

        Funcion searchFuncion = getFuncion(funcion);
        if (searchFuncion != null) {

            if (searchFuncion.searchVariable(variable)) {
                return true;
            }
        }

        return false;

    }

    public String imprimirTablaSimbolos() {
        String datos = " ";

        for (int i = 0; i < tabla.size(); i++) {

            datos += tabla.get(llaves.get(i)).imprimir();

        }

        return datos;

    }

    public ArrayList<String[]> getSymbols() {
        ArrayList<String[]> symbols = new ArrayList<>();
        for (int index = 0; index < tabla.size(); index++) {
            symbols.add(this.tabla.get(llaves.get(index)).getData());
        }
        return symbols;
    }

    public Variable getVariable(String name) {

        for (int i = 0; i < this.llaves.size(); i++) {

            if (this.tabla.get(this.llaves.get(i)).nombre.equals(name)
                    && this.tabla.get(this.llaves.get(i)).estructura.equals("variable")) {
                return (Variable) this.tabla.get(this.llaves.get(i));
            }

        }
        return null;

    }

    public void updateVariable(String name, String value) {
        ((Variable) this.tabla.get(name)).setDato(value);
    }

}
