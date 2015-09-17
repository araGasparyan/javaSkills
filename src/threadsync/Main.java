/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsync;

/**
 *
 * @author matenadaran
 */
public class Main {
    public static void main(String args[]){
       Slave s1 =new Slave();
       Slave s2= new Slave();
       new Th3(s1);
       new Th3(s2);
        
      //  new Th1();
        //new Th2();
        
    }
}
