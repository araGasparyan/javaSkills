/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matenadaran
 */
public class NewThread implements Runnable{
Thread t;
    
    
    public NewThread() {
        t=new Thread(this);
        t.start();
    }

    
    
    
    
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                System.out.println("THread "+i+" "+A.getX());
                Thread.sleep(300);
            }

            catch (InterruptedException ex) {
                Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }

    }
    
    
}
