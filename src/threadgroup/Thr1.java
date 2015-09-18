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
public class Thr1 implements Runnable{
Thread t;

    public Thr1(ThreadGroup tg, String s) {
        t=new Thread(tg, this, s);
        t.start();
       
    }
   
    public Thr1( String s) {
        t=new Thread(this, s);
        t.start();;
    }
    
     public Thr1() {
        t=new Thread(this);
        t.start();
        
    }
     
     void newthr(){
         Thread daught = new Thread();
         System.out.println(daught.toString());
         System.out.println("Thread Id is "+daught.getId());
         System.out.println("Thread priority is "+daught.getPriority());
          System.out.println("Thread activeCount is "+Thread.activeCount());
          System.out.println("ThreadGroup is "+ daught.getThreadGroup().toString());
           System.out.println("ThreadGroup parent is"+ daught.getThreadGroup().getParent());
          System.out.println("super isalive "+t.isAlive());
     }
    
    @Override
    public void run() {
        System.out.println(t.toString());
         System.out.println("Thread Id is "+t.getId());
         System.out.println("Thread priority is "+t.getPriority());
         System.out.println("Thread priority is "+ t.getThreadGroup().toString());
         System.out.println("ThreadGroup parent is"+ t.getThreadGroup().getParent());
          System.out.println("Thread activeCount is "+Thread.activeCount());
          System.out.println("");
          newthr();
         try {
               Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thr1.class.getName()).log(Level.SEVERE, null, ex);
            }
          
         
       
         
         
          
//       for (int i = 0; i < 2; i++) {
//                        try {
//               Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Thr1.class.getName()).log(Level.SEVERE, null, ex);
//            }
//                        System.out.println(i);
//        }
        
    }
    
}
