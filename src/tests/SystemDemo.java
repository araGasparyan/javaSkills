/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author matenadaran
 */
public class SystemDemo {
    public static void main(String[] args) {
       // System.out.println(System.getProperty("user.home"));
    
        /*
        Integer x [] = {100,200,300,400,500};
    Integer y [] = new Integer[]{
        1,2,3,4,5,6,7,8,9,10
        
    };
    for(int i=0;i<y.length;i++)
            System.out.println(y[i]);
    System.arraycopy(x, 0, y, 1, 2);
    
        System.out.println("");
    
    for(int i=0;i<y.length;i++)
            System.out.println(y[i]);
    
   */
        
       // System.out.println(System.currentTimeMillis());
        //System.exit(0);
      Integer y [] = null;
      int z = 0;
                Integer x [] = {100,200,300,400,500};
  System.out.println(x.toString());
  System.out.println(z);
        System.out.println(System.identityHashCode(x));
        y=new Integer[]{100,200,300,400,500};
        System.out.println(System.identityHashCode(y));
        y=x;
        System.out.print(System.lineSeparator());
        System.out.println(System.identityHashCode(y));
        
        
       
        
        
        
        
        
        
        
        
        
                
    
    }
    
}
