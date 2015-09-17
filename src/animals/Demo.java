/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author matenadaran
 */
public class Demo {
    public static void main(String[] args) {
       Rabbit rabbit = new Rabbit("Ashot");
        Lion lion = new Lion(4,43,"first");
        lion.eat(lion);
        
    }
}
