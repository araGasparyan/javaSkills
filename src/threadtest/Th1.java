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
public class Th1 implements Runnable{
Thread t;
Police p;

Th1(Police p){
    this.p=p;
    t = new Thread(this, "thread1");
    t.start();
}

    @Override
    public void run() {
      int i=0; 
       while(true) 
       {
           p.check1(i);
           i++;
       }
           
           
       } 
}
    
    
    
    
    
    

