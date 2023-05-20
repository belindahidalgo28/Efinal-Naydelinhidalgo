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
public class Variable extends Estructura {

    String dato;
    boolean bandera;

    public Variable(String tipo, String nombre, int linea, String dato) {
        super(tipo, nombre, linea, "variable");
        this.dato = dato;
        this.bandera = true;
    }

    public Variable(String tipo, String nombre, int linea) {
        super(tipo, nombre, linea, "variable");
        this.dato = "";
        this.bandera = false;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

    public String imprimir() {

        String datos = super.imprimir()
                + "Dato: " + this.dato + "\n"
                + "Bandera: " + String.valueOf(bandera) + "\n";

        return datos;

    }

    @Override
    public String[] getData() {
        String[] data = new String[]{
            super.getData()[0],
            super.getData()[1],
            super.getData()[2],
            super.getData()[3],
            this.dato, 
            ""};
        return data;
    }
}
