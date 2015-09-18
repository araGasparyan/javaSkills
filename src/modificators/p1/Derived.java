/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificators.p1;

/**
 *
 * @author Ara
 */
public class Derived extends Protection {
    Derived(){
        System.out.println("Ենթադասի կոնստրուկտոր");
         System.out.println("n= "+n);
       //  System.out.println("n_pri= " + n_pri);
          System.out.println("n_pr0= " + n_pr0);
          System.out.println("n_pub= " + n_pub);
    }
}
