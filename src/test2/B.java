/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author matenadaran
 */
public class B {
    int x=0;
    
    B b(){
        System.out.println(x);
        x++;
        
        return this;
        
    }
    
}
