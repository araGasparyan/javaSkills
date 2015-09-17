/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Ara
 */
public class Gen2<T> extends Gen<T> {

    public Gen2(T o) {
        super(o);
        
    }
    
    
    @Override
     T getOb() {
         System.out.println("getob() og class Gen2 ");
        return ob;
    }
}
