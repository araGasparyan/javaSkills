/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumtest;

/**
 *
 * @author matenadaran
 * @param <T>
 */
public class ETest<T extends ETest<T>> {
    T o;
    void test(){
        System.out.println("WOW!!!!!!!");
        System.out.println(o.getClass().getName());
    }

    public void setO(T o) {
        this.o = o;
    }
    
    
    
    
}
