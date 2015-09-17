/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsync;

/**
 *
 * @author matenadaran
 */
public class Th2 implements Runnable{
    Thread t;
    
    Th2(){
        t = new Thread(this);
        t.start();
        
    }

    @Override
    public void run() {
         
       Slave.S2();
     

    }
    
}