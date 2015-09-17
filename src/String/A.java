/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author matenadaran
 */
public class A implements I{
   int x;
   static int y;
   
   A meth(){
       System.out.println(this.x);
       x++;
       return new A();
   }
   
   A statmeth(){
       System.out.println(this.y);
       y++;
       return new A();
   }
   
   
   A meth1(){
       System.out.println(this.x);
       x++;
       return this;
   }
}
