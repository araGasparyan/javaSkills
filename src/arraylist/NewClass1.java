/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.Iterator;

/**
 *
 * @author Ara
 */
public class NewClass1<T> implements Iterable<T>{
    
    T [] arr;
    int i=0;

    public NewClass1(T[] arr) {
        this.arr = arr;
    }
      

    @Override
    public Iterator<T> iterator() {
        Iterator<T> tmp=new Iterator<T>() {

            @Override
            public boolean hasNext() {
                i++;
                if(i>3)
return false; else return true;
            }

            @Override
            public T next() {
                return arr[0];
            }
        };
        
        
        
        return tmp;
    }
    
}
