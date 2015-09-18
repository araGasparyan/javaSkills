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
public class Thread1 extends Thread {

    static int x(){
        return 0;
        
    };
    
    public Thread1() {
        start();
        int u=x();
    }
    
           
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("daughter thread " +i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    
}
