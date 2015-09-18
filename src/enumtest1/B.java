/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumtest;

/**
 *
 * @author Ara
 */
public class B {
    protected int x;
    
    public B(){
     vvv();
    }
    
 public static void vvv(){
        System.out.println("from a");
    }
    
    protected B protmeth(){
        System.out.println("I am a protected method");  
    return this;
    }
}
