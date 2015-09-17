/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import javax.swing.JFrame;
//import lines.LFrame;

/**
 *
 * @author Ara
 */
public class Main {
   static boolean  b=true;
    public static void main(String args[]) throws InterruptedException{ 
/*      
//System.out.println( new Test().getN());
        NewThread obj1 = new NewThread("first",10);
        NewThread obj2 = new NewThread("second",10);
        NewThread obj3 = new NewThread("third",10);
        System.out.println("The first thread is started "+obj1.t.isAlive());
         System.out.println("The second thread is started "+obj2.t.isAlive());
          System.out.println("The third thread is started "+obj3.t.isAlive());
          
          obj3.t.setPriority(10);
          
          System.out.println("The third thread's priority "+obj3.t.getPriority());
          
        
         System.out.println("Waiting for a thread finishing");
        
         try{
                 // obj1.t.join();
                 // System.out.println("HHHH");
                  // obj2.t.join();
                     obj3.t.join();
                   
    }
       catch(InterruptedException e)
       {
            System.out.println("main thread is disturbed");
       
       }
         
        
        System.out.println("main thread is finished");
         */
        
        
                 
        /*
        
        
      System.out.println("start");
        
        new ThreadTest();
        
        
        System.out.println("finish");
        
        for(int i=0;;){
            System.out.println("MAVA");
        }
        
        
        */
        
        
        /*
        
        
        new NewClass();
        try{
        Thread.sleep(1000);
        }
        catch (InterruptedException e){
            
        }
        new LFrame();
      */
        
        
        
        while(b) {
            try{
        Thread.sleep(1000);
        System.out.println(1);
        }
        catch (InterruptedException e){
             System.out.println(4);
        }
       
        
           System.out.println(4);
        }
        
      //  System.out.println(1);
        
        
        
}
    
}
