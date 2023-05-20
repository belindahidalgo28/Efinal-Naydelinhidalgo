/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.ArrayList;

/**
 *
 * @author liset
 */
public class Funcion extends Estructura {

    ArrayList<Parametro> parametros;
    int cantidadParametros;
    //ArrayList<Variable> variables;

    public Funcion(String tipo, String nombre, ArrayList<Parametro> parametros, int linea) {
        super(tipo, nombre, linea, "funcion");
        this.parametros = parametros;
        this.cantidadParametros = this.parametros.size();
        //this.variables = variables;

    }

    public Funcion(String tipo, String nombre, int linea) {
        super(tipo, nombre, linea, "funcion");
    }

    public ArrayList<Parametro> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<Parametro> parametros) {
        this.parametros = parametros;
        this.cantidadParametros = this.parametros.size();
    }

    public int getCantidadParametros() {
        return cantidadParametros;
    }

    public boolean searchVariable(String variable) {

        for (int i = 0; i < this.cantidadParametros; i++) {
            if (this.parametros.get(i).nombre.equals(variable)) {
                return true;
            }
        }

        return false;

    }

    public boolean compareArgs(ArrayList<Parametro> args) {
        for (int index = 0; index < this.parametros.size(); index++) {
            if (!args.get(index).tipo.equals(this.parametros.get(index).tipo)) {
                return false;
            }
        }
        return true;
    }

    public String imprimir() {
        String datos = super.imprimir() + "\n"
                + "Parametros\n\n";

        for (int i = 0; i < this.cantidadParametros; i++) {
            datos += this.parametros.get(i).imprimir() + "\n";

        }
        return datos;
    }

    @Override
    public String[] getData() {
        String params = "";
        for (int index = 0; index < this.cantidadParametros; index++) {
            params = params + this.parametros.get(index).getData() + ", ";
        }
        if (!params.equals("")){ params = params.substring(0, params.length() - 1);}
        String[] data = new String[]{
            super.getData()[0],
            super.getData()[1],
            super.getData()[2],
            super.getData()[3],
            "",
            params
        };
        return data;
    }

}
