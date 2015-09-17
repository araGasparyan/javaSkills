/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

/**
 *
 * @author matenadaran
 */
public class StackTraceElementDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//       Package pkgs[];
//pkgs = Package.getPackages();
//for(int i=0; i < pkgs.length; i++){
//System.out.println(
//pkgs[i].getName() + " " +
//pkgs[i].getImplementationTitle() + " " +
//pkgs[i].getImplementationVendor() + " " +
//pkgs[i].getImplementationVersion()
//       
//);
//        System.out.println("");}
//    }
      function1();
   }
 
   public static void function1()
   {
      new StackTraceElementDemo().function2();
   }
 
   public void function2() 
   {
      int i;
      System.out.println("method name : ");

      // print stack trace
      for( i = 0; i <= 3; i++ ) {
         System.out.println(Thread.currentThread().getStackTrace()[i].getMethodName());
         System.out.println(Thread.currentThread().getStackTrace()[i].getFileName());
        
         System.out.println(Thread.currentThread().getStackTrace()[i].getLineNumber());
         System.out.println(Thread.currentThread().getStackTrace()[i].getClassName());
          System.out.println("");
      }
   }
}   
    
  
    

