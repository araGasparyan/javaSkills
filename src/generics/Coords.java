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
    
    
    void showXY(Coords c){
        System.out.println("coordinates x and y");
        for(int i=0;i<c.coords.length;i++){
            System.out.println(c.coords[i].x+" "+c.coords[i].y);
                   }
    }
    
    void showXYZ(Coords<? extends ThreeD> c){
        System.out.println("coordinates x and y");
        for(int i=0;i<c.coords.length;i++){
            System.out.println(c.coords[i].x+" "+c.coords[i].y+" "+c.coords[i].z);
                   }
    }
    
}
