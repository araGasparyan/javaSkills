/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot;

/**
 *
 * @author matenadaran
 */
public class Slot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double [] prob={0,0.1,0.3,0.5,1};
        
        Reel r1 = new Reel(20,4,prob);
        
        
        for (int i = 0; i < r1.getSpot().length; i++) {
          System.out.println(r1.getSpot()[i]);
            }
        }
        
        
    }
    

