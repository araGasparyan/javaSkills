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
public class MyTest2Demo {
    public static void main(String[] args) {
        MyTest2 i = () -> {
            System.out.println("I am void 1");
        };
        
        i.x();
        
        i = () -> {
            System.out.println("I am void 2");
        };
        
        i.x();
    }
}
