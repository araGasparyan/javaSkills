/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1edition;

import thread1.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ara
 */
public class Q {
    int n;
    boolean valueset =false;
    
    synchronized int get(){
       while(!valueset)
           try {
               wait();
           } catch (InterruptedException e) {
               System.out.println("Inter is mine");
           }
        System.out.println("Is received "+n);
        valueset=false;
        notify();
        return n;
    }
    
    synchronized void put(int n){
        while(valueset)
        try {
          wait();
        } catch (InterruptedException ex) {
            System.out.println("Inter is mine");
        }
        this.n=n;
        valueset=true;
        System.out.println("Is sent "+n);
        notify();
    }
    
}
