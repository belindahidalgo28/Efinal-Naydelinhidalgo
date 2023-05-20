/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author pablo
 */
public class Nasm {
    private Hashtable<String,NasmRegister> registers;
    
    
    public Nasm() {
        this.registers = new Hashtable<>();
        this.createAllRegister();
    }
    
    
    private void createAllRegister() {
        //rbx
        this.registers.put("rbx", new NasmRegister("rbx"));
        //rcx
        this.registers.put("rcx", new NasmRegister("rcx"));
        //rdx
        this.registers.put("rdx", new NasmRegister("rdx"));
        // create all register from r8 to r15
        for(int index = 8; index < 16; index++) {
            this.registers.put("r"+String.valueOf(index), new NasmRegister("r"+String.valueOf(index)));
        }
    }
    
    public void setRegisterState(String name, boolean isFree) {
        this.registers.get(name).isFree = isFree;
    }
    
    public Boolean getRegisterState(String name) {
        return this.registers.get(name).isFree;
    }
    
    public NasmRegister getFreeRegister() {
        Enumeration<String> keys = this.registers.keys();
        ArrayList<String> keyList = Collections.list(keys);
        for (String key : keyList) {
            if (this.registers.get(key).isFree) {
               this.registers.get(key).isFree = false;
               return this.registers.get(key);
            }
        }
        return null;
    }
}
