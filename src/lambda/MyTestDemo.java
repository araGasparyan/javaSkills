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
public class MyTestDemo {
    public static void main(String[] args) {
        MyTest my;
        A a=new A();
        B b = new B();
        my=(c)->true;
        if(my.test(new B()))
            System.out.println("sadas");
        
        
    }
}
