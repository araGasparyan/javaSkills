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
public class Th2 implements Runnable{
Thread t;
Police p;

Th2(Police p){
    this.p=p;
    t = new Thread(this, "thread2");
    t.start();
}
    
    
    
    @Override
    public void run() {
        int i=0; 
        while (true) 
        {
            p.check2(i);
            
            i++;
        }
            
       } 
    
    
}