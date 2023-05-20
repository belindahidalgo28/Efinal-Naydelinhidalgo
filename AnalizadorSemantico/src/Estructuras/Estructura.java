/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;


/**
 *
 * @author liset
 */
public class Estructura {
    String tipo;
    String nombre;
    int linea;
    String estructura;
    boolean error;

    public Estructura(String tipo, String nombre, int linea,String estructura) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.linea = linea;
        this.estructura = estructura;
        this.error = false;
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

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }
    
    public void setError(boolean pError) {
        this.error = pError;
    }
    
    public boolean getError() {
        return this.error;
    }
    
     public String imprimir(){
        String datos = "Tipo: " + this.tipo + "\n"+
                       "Nombre: " + this.nombre + "\n"+
                       "Linea: " + String.valueOf(this.linea)+ "\n" +
                       "Estructura: " + this.estructura + "\n";
        
        return datos;

    }
    
     
    public String[] getData() {
        String[] data = new String[4];
        data[0] = String.valueOf(this.linea);
        data[1] = this.tipo;
        data[2] = this.nombre;
        data[3] = this.estructura;
        return data;
    }
    
}
