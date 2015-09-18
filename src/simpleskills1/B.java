/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleskills1;

/**
 *
 * @author Ara
 */
public class B extends A {
   
   
    B(){
         System.out.println("I am a test");
        super.show();
    }
  
    
   @Override
   void show(){
        System.out.println("I am B");
    }
}
