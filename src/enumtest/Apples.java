/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumtest;

/**
 *
 * @author matenadaran
 */
public enum Apples {
    Jonathan,
    GoldenDel,
    RedDel,
    Winesap,
    Cortland;
   private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Apples(int price) {
        this.price = price;
    }
   
   Apples() {
       
    }
    
    
}
