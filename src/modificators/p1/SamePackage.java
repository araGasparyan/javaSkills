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
 public class SamePackage {
   public SamePackage(){
        Protection p = new Protection();
        System.out.println("պակետի կոնստրուկտոր");
         System.out.println("n= "+p.n);
       // System.out.println("n_pri= " + p.n_pri);
          System.out.println("n_pr0= " + p.n_pr0);
          System.out.println("n_pub= " + p.n_pub);
    }
}
