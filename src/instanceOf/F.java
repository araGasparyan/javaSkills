/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanceOf;

/**
 *
 * @author matenadaran
 */
public class F {
   static int x;
    int y;
int z=7;
    public F(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    static void mymeth(){
        x=6;
    }
    
    
    void m(){
        x=7;
        y=9;
    }
}
