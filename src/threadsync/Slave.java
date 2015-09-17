/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsync;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matenadaran
 */
public class Slave {
    
    synchronized static void S1(){
         System.out.println("S1");
   for(int i=0;i<5;i++){
       System.out.println("S1-"+i);
       try {
           Thread.sleep(500);
       } catch (InterruptedException ex) {
           Logger.getLogger(Slave.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   System.out.println("S1");
    }
   
 synchronized static void S2(){
      System.out.println("S2");
   for(int i=0;i<5;i++){
       System.out.println("S2-"+i);
       try {
           Thread.sleep(500);
       } catch (InterruptedException ex) {
           Logger.getLogger(Slave.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   System.out.println("S2");
    }
   
synchronized void UnS(){
      System.out.println("UnS");
      for(int i=0;i<5;i++){
       System.out.println("UnS-"+i);
       try {
           Thread.sleep(500);
       } catch (InterruptedException ex) {
           Logger.getLogger(Slave.class.getName()).log(Level.SEVERE, null, ex);
       }
   } 
      System.out.println("UnS");
   }
   
   
    
    }
  