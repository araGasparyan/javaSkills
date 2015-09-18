/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ara
 */
public class TestThread extends Thread {
    
    
    
    
    @Override
     public void run(){
         System.out.println("TestThted "+this.getName()+" has started");
         System.out.println("testThread activeCount is "+Thread.activeCount());
         try {
          
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestThread.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.out.println("TestThted "+this.getName()+" has finished");
        
    }
    
     void n(){
          new Thread(this).start();
     }
    
}
