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
public class CloneDemo {
   static A a1=new A();
  static A a2;
    public static void main(String[] args) {
       /*
       Object o=new Object();
       Cloneable clone=a1;
       try {
       a2 = (A) super.clone();
       System.out.println(a1.equals(a2));
       } catch (CloneNotSupportedException ex) {
       Logger.getLogger(CloneDemo.class.getName()).log(Level.SEVERE, null, ex);
       }
        */
    
      
       
        
       TestClone x1 = new TestClone();
TestClone x2= new TestClone();
System.out.println(x1.equals(x2));
System.out.println("x2: " + x2.a + " " + x2.b);
x1.a = 10;
x1.b = 20.98;
x2 = x1.cloneTest(); // clone x1
System.out.println(x1.equals(x2));
System.out.println("x1: " + x1.a + " " + x1.b+" "+x1.s);
System.out.println("x2: " + x2.a + " " + x2.b+" "+x2.s);
        x2.s="changed";
        
        System.out.println("x1: " + x1.a + " " + x1.b+" "+x1.s);
System.out.println("x2: " + x2.a + " " + x2.b+" "+x2.s);

x1.s="changed1";
        
        System.out.println("x1: " + x1.a + " " + x1.b+" "+x1.s);
System.out.println("x2: " + x2.a + " " + x2.b+" "+x2.s);





//new B();
A.vvv();
        
    }
    
   
 
 
     
            }
    
    

