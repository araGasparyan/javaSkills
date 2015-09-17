/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author matenadaran
 */
public class Main {
    public static void main(String[] args) {
      
        /*
                C c=new C();
        I i=new C();
        System.out.println(new C().c1);
                */
      I i=new I() {

          @Override
          public int X() {
              System.out.println("sdasdsadsa");
              //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return 3;
                 }

          @Override
          public int Y() {
             System.out.println("dsdsdsds");
              //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return 3;}
      };
        
      NewInterface k = new NewInterface() {
};
      
    Class<?> j=  Object.class;
    Object o=new Object();
        System.out.println(i.getClass());
        System.out.println(k.getClass().getName());
        System.out.println(j.getName());
        System.out.println(o.getClass().getName());
        new A().k();
        
    }
}
