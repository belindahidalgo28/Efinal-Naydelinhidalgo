/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author pablo
 */
public class NasmRegister {
    public String name;
    public boolean isFree;
    
    public NasmRegister(String pName) {
        this.name = pName;
        this.isFree = true;
    }
}
