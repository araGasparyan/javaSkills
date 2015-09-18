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
public class Protection {
    int n=1;
    private int n_pri=2;
     protected int n_pr0=3;
      public int n_pub=4;
    
     public Protection(){
          System.out.println("Հիմնական դասի կոնստրուկտոր");
          System.out.println("n= "+n);
          System.out.println("n_pri= " + n_pri);
          System.out.println("n_pr0= " + n_pr0);
          System.out.println("n_pub= " + n_pub);
      }
      
}



