/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ara
 */
public class test1 implements Runnable {
    Thread t;
   public boolean b = false;
    void a(){
        try {
            wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    test1(){
       t = new Thread(this);
       t.start();
    }

    @Override
    public void run() {
         System.out.println("test1");
         
       if(b)
         a(); else notify();
        System.out.println("test2");
    }
    
}


