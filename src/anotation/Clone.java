/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotation;

/**
 *
 * @author matenadaran
 */
public class Clone implements Cloneable{
    int x=50;

    public Clone(int x) {
        this.x = x;
    }

    public Clone() {
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException{
    return super.clone();
}

    @Override
    public String toString() {
        return "Clone{" + "x=" + x + '}';
    }
  
    
    
}
