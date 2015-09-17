/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda.newpackage1;

/**
 *
 * @author matenadaran
 */
public class C{
    int x;
    
    //C(){};
    
    C(int x){
        this.x=x;
    }
    
    public void length(int x){
        
        System.out.println(x);
}
    
  void a(C c){
        System.out.println("I am C "+x+" "+c.x);
    
      
    }
     
     void b(C c, C c1){
        System.out.println("I am C "+x);
      
    }
}
