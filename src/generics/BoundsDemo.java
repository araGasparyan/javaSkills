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
public class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        Stats<Integer> iob=new Stats<>(inums);
        System.out.println(iob.averege());
        
        
        
        Double dnums[] = {1.0,2.0,3.0,4.0,5.0};
        Stats<Double> dob=new Stats<>(dnums);
        System.out.println(dob.averege());
        
        if(iob.sameAvg(dob))
            System.out.println(iob.sameAvg(dob));
        else System.out.println(iob.sameAvg(dob));
        
        
    }
}
