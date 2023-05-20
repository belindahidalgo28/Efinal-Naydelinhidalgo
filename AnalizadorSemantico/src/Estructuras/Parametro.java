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
public class Parametro {
    String tipo;
    String nombre;
    int orden;

    public Parametro(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setOrden(int pOrden) {
        this.orden = pOrden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String imprimir(){
        String datos = "Tipo: " + this.tipo + "\n"+
                       "Nombre: " + this.nombre + "\n"+
                       "Orden: " + String.valueOf(this.orden)+ "\n" ;
        
        return datos;

    }
    
    public String getData() {
        return this.tipo + " " + this.nombre;     
    }
    
    
}
