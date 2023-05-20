/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Estructuras.SematicRegister.RS;
import Estructuras.SematicRegister.RS_TYPES;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author pablo
 */
public class SemanticStack {
  LinkedList<RS> stack = new LinkedList<>();
  
  
  
  // remove and return the element in the last position of the list
  public RS pop() {
    return this.stack.removeLast();
  }
  
  // add element in last position of the list
  public void push(RS r) {
      this.stack.addLast(r);
  }
  
 // searching a register in entry list
    public String find(RS_TYPES p_id) {
        ListIterator<RS> iterator = this.stack.listIterator();
        RS r = null;
        while (iterator.hasNext()) {
            r = iterator.next();
            if (r.id.equals(p_id))
               return r.value;
        }
        return "";
    }
    public RS peek() {
        if (this.stack.size() == 0) {
            return null;
        }
        return this.stack.getLast();
    
    }
    
    public int getSize() {
        return this.stack.size();
    }
}
