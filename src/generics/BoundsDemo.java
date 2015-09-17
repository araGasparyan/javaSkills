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
        
        /*
        Integer inums[] = {1,2,3,4,5};
        Stats<Integer> iob=new Stats<>(inums);
        System.out.println(iob.averege());
        
        
        
        Double dnums[] = {1.0,2.0,3.0,4.0,5.0};
        Stats<Double> dob=new Stats<>(dnums);
        System.out.println(dob.averege());
        
        if(iob.sameAvg(dob))
            System.out.println(iob.sameAvg(dob));
        else System.out.println(iob.sameAvg(dob));
        */
        
        Integer iob=10;
        Integer iob1=11;
        Integer iob2=12;
        Integer iob3=13;
        Object o1=new Object();
        
        
        Gen1<?> gen1ob=new Gen1(iob);
        
        System.out.println(gen1ob.myMeth(iob1, o1, o1));
        
        
        
    }
}
