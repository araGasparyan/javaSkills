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
public class MyClass<T extends Comparable<T>> implements MinMax<T> {
T [] vals;
MyClass (T [] o){vals=o;}

    
    @Override
    public T min() {
        T v=vals[0];
        for(int i=0;i<vals.length;i++){
            if(v.compareTo(vals[i])<0){
                v=vals[i];
        }
        }
   return v; }

    @Override
    public T max() {
        T v=vals[0];
        for(int i=0;i<vals.length;i++){
            if(v.compareTo(vals[i])>0){
                v=vals[i];
        }
        }
   return v;
    }
    
}
