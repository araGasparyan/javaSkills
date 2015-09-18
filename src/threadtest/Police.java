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
public class Police {
    
    boolean b=true;
    
    synchronized void check1(int i){
        while (b){
            try {
            wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Police.class.getName()).log(Level.SEVERE, null, ex);
        } }
            
        
        
            System.out.println("th1-step"+i);
            
        b=true;
        notify();
        
        
        }
    
    
    synchronized void check2(int i){
       while (!b){
            try {
            wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Police.class.getName()).log(Level.SEVERE, null, ex);
        } }
           
      
            System.out.println("th2-step"+i);
            
        b=false;
        notify();
        
        
        
        }
    
    } 
    

