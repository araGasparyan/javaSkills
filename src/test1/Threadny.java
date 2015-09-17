/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import sun.awt.windows.ThemeReader;

/**
 *
 * @author matenadaran
 */
public class Threadny implements Runnable{

    Thread t;

    public Threadny() {
        t = new Thread(this);
        
    }
    
    
    
    
    @Override
    public void run() {
        
        new A();
        
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
