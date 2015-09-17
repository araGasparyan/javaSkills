/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda.generics;

/**
 *
 * @author matenadaran
 */
public class Main extends A {
    
    @Override
    void meth(int x){
        System.out.println("I am Main "+x);
    };
    
    
    
    Main(){
       I i;
       i=this::meth;
        i.meth(4);
         i=super::meth;
        i.meth(4);
    }
    
    static void ddemo(){
    }
    
    
    public static void main(String[] args) {
        
        I i=new A()::meth;
        i.meth(4);
        
        i=new B()::meth;
        i.meth(4);
        
        new Main();
        
        
    }
}
