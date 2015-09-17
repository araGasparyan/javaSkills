/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author matenadaran
 */
public class ComplexFuncDemo {
    public static void main(String[] args) {
        
        Complexfunc f1 = (x) -> {
        return Math.sinh(x);
        };
        
        
        Complexfunc f2 = (x) -> {
        return Math.cos(x);
        };
        
        
        System.out.println(f1.func(7));
        System.out.println(f2.func(10));
        
        
        
        
        
    }
}
