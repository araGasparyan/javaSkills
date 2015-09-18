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
public class Main {
    public static void main(String args[])
    {
      
        /*
        new NewThread();
        Thread t = Thread.currentThread();
        try{
            for(int n=5;n>0;n--){
        System.out.println("main thread "+n+t);
                Thread.sleep(500);      
                   }
    }
       catch(InterruptedException e)
       {
            System.out.println("main thread is disturbed");
       
       }
        
        System.out.println("main thread is finished");
                
                */
        
        
        /*
        Callme target=new Callme();
        Caller ob1=new Caller(target,"Welcome");
         Caller ob2=new Caller(target,"to the Synchronized");
          Caller ob3=new Caller(target,"world!");
           Caller ob4=new Caller(target,"4");
            Caller ob5=new Caller(target,"5");
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
            ob4.t.join();
            ob5.t.join();
        }catch(InterruptedException e){
            System.out.println("Disturbed");
        }
        */
        
        
        /*
        System.out.println("Methods");
        
     Class<?> cl = Thread.class;
        for (int i = 0; i < cl.getMethods().length; i++) {
            System.out.println(cl.getMethods()[i]);
                    }
         System.out.println("");
        System.out.println("Interfaces");
        System.out.println("");
        
    for (int i = 0; i < cl.getInterfaces().length; i++) {
            System.out.println(cl.getInterfaces()[i].getMethods()[0]);
                    }
     
         System.out.println("");
        System.out.println("Constructors");
        System.out.println("");
        
    for (int i = 0; i < cl.getConstructors().length; i++) {
            System.out.println(cl.getConstructors()[i]);
                    }
        
         System.out.println("");
        System.out.println("Fields");
        System.out.println("");
        
    for (int i = 0; i < cl.getFields().length; i++) {
            System.out.println(cl.getFields()[i]);
            
                    }
    
    */
        
        
        
        
        /*
         System.out.println(Thread.activeCount());
        TestThread t = new TestThread();
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.out.println(Thread.activeCount());
        t.start();
         System.out.println(Thread.activeCount());
        
        try {
            System.out.println(Thread.activeCount());
           // TestThread t1 = new TestThread();
     //  t1.start();
            t.join();
            System.out.println(Thread.activeCount());
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       
       // t.n();
//        System.out.println("1");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        System.err.println("2");
        
        */
        
        
        new Thread1();
        for (int i = 0;;i++ ) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
    
}
