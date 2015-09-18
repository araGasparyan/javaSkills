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
public class Main {
    public static void main(String args[]){
       
        
        System.out.println("1");
        Test t = new Test();
        System.out.println("2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
       // test1 t1=new test1();
        System.out.println("3");
       // t.print();
       // t.not();
         System.out.println("4");
                
        /*
        Police p = new Police();
        new Th2(p);
        new Th1(p);
        
        */
    }
}
