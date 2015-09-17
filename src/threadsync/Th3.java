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
public class Th3 implements Runnable{
    Thread t;
    Slave s;
    
    Th3(Slave s){
        this.s=s;
        t = new Thread(this);
        t.start();
        
    }

    @Override
    public void run() {
       
       s.UnS();
       
     

    }
    
}