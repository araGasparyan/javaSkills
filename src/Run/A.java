/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import enumtest.B;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ara
 */
public class A extends B implements Cloneable{
    int y;
    B b;

    public A() {
        super();
    }
    
    
   protected void meth(){
       x=y;
      
        try {
            clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       super.protmeth();
       System.out.println("sadasd");
   } 
   
 
    
  public static void vvv(){
       System.out.println("from b");
   }

}
