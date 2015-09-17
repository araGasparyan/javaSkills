/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author matenadaran
 */
public class Coords<T extends TwoD> {
    T [] coords;

    public Coords(T[] coords) {
        this.coords = coords;
    }
    
    
    
}
