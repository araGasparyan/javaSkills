/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author matenadaran
 */
public class Box {
    int x;
    int y;
    int z;
    Box c;

    public Box() {
    }

    @Override
    public String toString() {
        return "Box{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
    
    Box b(){
        
        return c;
        
    }
    
}
