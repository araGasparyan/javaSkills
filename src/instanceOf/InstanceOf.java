/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instanceOf;

/**
 *
 * @author matenadaran
 */
public class InstanceOf {
    public static void main(String[] args) {
        Object o=6;
        Object r=(String)"jkjkjk";
        String s="sdasdsa";
        Integer i;
        
        o=s;
        String s2=(String)o;
        
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
    // a=c;
       
       
      
       if(a instanceof A){
           System.out.println("a is instance of A");}
           
            if(b instanceof B){
           System.out.println("b is instance of B");
       }
        
         if(c instanceof C){
           System.out.println("c is instance of C");
       }
         
         if(c instanceof A){
           System.out.println("c can be given as A");
       }
         
         if(a instanceof C){
           System.out.println("a can be given as C");
       }
         
         System.out.println();
         D test1;
         C teset2;
         A ob;
         ob=d;
         test1=(D)ob;
         Object ghj=b;
         if(ob instanceof D){
           System.out.println("ob is an object of D");
       }
         
         ob=c;
         
         if(ob instanceof D){
           System.out.println("ob can be given as D");
       } else System.out.println("ob can not be given as D");
         
         if(ob instanceof A){
           System.out.println("ob can be given as A");
       }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
            
    }
}
