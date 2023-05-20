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
public class RS_DO extends RS{
    public String type;
    public String name;
    
    public RS_DO() {}
    
    public RS_DO(RS_TYPES id, String value, Symbol s) {
        super(id, value, s);
    }

}
