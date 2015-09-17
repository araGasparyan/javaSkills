/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycollection.newpackage;

/**
 *
 * @author Ara
 */
public class Gen<T extends Number> {
int x=5;
    T o;
    
    public Gen(T o) {
                   }
    
    void put(T o){
        this.o=o;
    }
    
    
}
