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
public class Lion extends Mammal{

   String pride;
    
    @Override
    void eat(Mammal m) {
        System.out.println("I am lion, I am eating "+m.name);
        
    }

    public Lion(int foot, int theeth, String pride) {
        this.foot=foot;
        this.theeth=theeth;
        this.pride=pride;
    }

    
   
    
}
