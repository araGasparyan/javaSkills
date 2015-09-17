/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot;

import sun.misc.MetaIndex;

/**
 *
 * @author matenadaran
 */
public class Reel{
    private int [] spot;
    private int [] symbols;
    private double [] probabilaties;
    
    
    public int[] getSpot() {
        return spot;
    }

    public double [] getProbabilaties() {
        return probabilaties;
    }

    public int[] getSymbols() {
        return symbols;
    }

    public Reel(int spot_length, int symbol_count, double [] probabilaties) {
        this.spot = new int [spot_length];
        this.symbols = new int [symbol_count];
        this.probabilaties=probabilaties;
        fillSymbols();
        fillSpots(probabilaties);
    }
    
    //fills the array of Symbols by 1 to the array length
    private void fillSymbols(){
        for (int i = 0; i < symbols.length; i++) {
          symbols[i]=i;
        }
    }
    
    
    //method fills this Reel spots by using probabilaty array probabilaties, 
    //which shold have 0 as the 0-th index, length of the array should be symbols.length+1,
    //and the last index should be 1
    public void fillSpots(double [] probabilaties){
       
        for (int i = 0; i < spot.length; i++) {
           double temp=Math.random();
          // System.err.println(temp);
            for (int j = 0; j < probabilaties.length-1; j++){
//                System.out.println(j);
//               System.out.println(temp);
                 if((temp>=probabilaties[j])&&(temp<probabilaties[j+1])) {
                     spot[i]=symbols[j];
                     
                 break;
                 }
                 
            }
           
        }
    }

    
    
}
