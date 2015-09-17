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
public class Stats<T extends Number> {
    T[] nums;
    
    Stats(T [] o){
        nums=o;
    }
    
    double averege(){
        double sum =0.0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i].doubleValue();
        }
   return sum/nums.length;
    }
    
     boolean sameAvg(Stats<?> ob){
         if(averege()==ob.averege())
     return true;
     
     return false;
     
     }
    
}
