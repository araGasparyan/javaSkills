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
public class Gen1<T extends Number> {
    T o;
    Gen1(T o){
        this.o=o;
        System.out.println(o.doubleValue());
        
    }
    
   <T, V extends Number> T myMeth(V v, T t, T t1){
        V v1=v;
        System.out.println(v1);
        if (v.equals(t))
                       return t;
        
        return t1;
            }
    
}
