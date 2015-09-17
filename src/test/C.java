/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author matenadaran
 */
public class C implements I{
int c1,c2;

    void met(){
        
    }
    
    C(){
        c1=4;
        c2=5;
    }
    
    
    @Override
    public int X() {
        return c1;
       
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Y() {
        return c2;
       
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
