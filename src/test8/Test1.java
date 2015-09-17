/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortests;

/**
 *
 * @author Ara
 */
public class Test1<T> {
    int x;
    T t;

    public Test1(int x) {
        this.x=x;
    }
    
    void eat(T t){
        this.t=t;
    }
    
    
}
