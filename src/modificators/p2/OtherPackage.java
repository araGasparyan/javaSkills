/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificators.p2;

/**
 *
 * @author Ara
 */
public class OtherPackage {
  // p1.Protection p = new p1.Protection();
   modificators.p1.SamePackage p1 = new modificators.p1.SamePackage();
    OtherPackage()
    {
         modificators.p1.Protection p = new modificators.p1.Protection();
       // System.out.println("n= "+p.n);
        //  System.out.println("n_pri= " + p.n_pri);
         // System.out.println("n_pr0= " + p.n_pr0);
          System.out.println("n_pub= " + p.n_pub);
    }
}
