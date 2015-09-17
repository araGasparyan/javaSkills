/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortests;

/**
 *
 * @author Ara
 */
public class Main {
    public static void main(String[] args) {
        String str [] = {
            "one", 
            "two", 
            "three"
            };
        String str1 [] = new String[7];
        
        Test1 [] test = {
            new Test1<Integer>(0),
         new Test1<Double>(1),
          new Test1<Float>(2),
           new Test1<Boolean>(3)
        };
        
     Object o = new Object();
        
        int i = 0;
        for (Test1 s : test) {
           s.eat(o);
            System.out.println(s.t.getClass().getName());
            
        }
        
        
       
        
        
    }
}
