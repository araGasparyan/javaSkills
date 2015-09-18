/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadgroup;

/**
 *
 * @author Ara
 */
public class StackTraceElementDemo {
    

   public static void main(String[] args) {

      function1();
   }
 
   public static void function1()
   {
      new StackTraceElementDemo().function2();
       new StackTraceElementDemo().function3();
   }
 
   public void function2() 
   {
      int i;
    
      // print stack trace
      for(i = 1 ; i < 4 ; i++ ) {
         System.out.println(Thread.currentThread().getStackTrace()[i].
         toString());
         System.out.println(Thread.currentThread().getStackTrace()[i].getMethodName()
        );
          System.out.println(Thread.currentThread().getStackTrace()[i].getLineNumber()
        );
      }
   }
   
   public void function3() 
   {
      int i;
    
      // print stack trace
      for(i = 1 ; i < 4 ; i++ ) {
         System.out.println(Thread.currentThread().getStackTrace()[i].
         toString());
         System.out.println(Thread.currentThread().getStackTrace()[i].getMethodName()
        );
          System.out.println(Thread.currentThread().getStackTrace()[i].getLineNumber()
        );
      }
   }
}   
