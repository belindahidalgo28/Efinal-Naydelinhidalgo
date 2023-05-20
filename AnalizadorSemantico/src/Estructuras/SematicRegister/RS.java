/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras.SematicRegister;

import java_cup.runtime.Symbol;

/**
 *
 * @author pablo
 */
public class RS {
    public RS_TYPES id;
    public String value;
    public Symbol s;
    
    public RS(RS_TYPES rt, String v, Symbol s) {
        this.id = rt;
        this.value = v;
        this.s = s;
    }
    
    public RS(){}
}
