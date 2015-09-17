/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matenadaran
 */
public class NewClass1 implements Runnable{
Thread t;

    public NewClass1() {
        t=new Thread(this);
        t.start();
    }



    @Override
    public void run() {
        for (int i = 0; ; i++) {
            new Integer(7);
            System.out.println(t.getName()+" "+i);
            
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
    
    
}
