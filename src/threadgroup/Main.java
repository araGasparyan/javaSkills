/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadgroup;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ara
 */
public class Main {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("mygroup");
        ThreadGroup tg1 = new ThreadGroup(tg,"mygroup1");
       tg.list();
        System.out.println(tg1.getParent());
        Thread mainth=Thread.currentThread();
        System.out.println( mainth.toString());
         System.out.println("Thread Id is "+ mainth.getId());
         System.out.println("Thread priority is "+ mainth.getPriority());
         System.out.println("Thread activeCount is "+Thread.activeCount());
         System.out.println("ThreadGroup parent is"+ mainth.getThreadGroup().getParent());
          System.out.println("Thread priority is "+ mainth.getThreadGroup().toString());
         System.out.println("");
        try {
           Thr1 p = new Thr1(tg,"test1");
     
            //p.newthr();
                   p.t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            new Thr1(tg1,"test2").t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        try {
            new Thr1("test3").t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        try {
            new Thr1().t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          System.out.println(mainth.getId());
        System.out.println(Thread.activeCount());
        System.out.println("");
        
        
        
        
        
    }
}
