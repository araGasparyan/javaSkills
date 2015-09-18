/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ara
 */
public class Q {
    int n;
    synchronized int get(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Q.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Is received "+n);
        return n;
    }
    
    synchronized void put(int n){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Q.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.n=n;
        System.out.println("Is sent "+n);
    }
    
}
