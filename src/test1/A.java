/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author matenadaran
 */



public  class A {
     static{System.err.println("asdsadasd");
     a();
     }
static{System.out.println("I am static");}
    
   A(){
        
    }
   
  
   static void a(){
       System.out.println("I am a");
   }
   
    void b(A a){
       System.out.println("I am b");
   }
    
    void c(){
         System.out.println("I am c");
    }
    
    
    public static void main(String[] args) {
//        new A();
//        new A();
//        A a=(B)new B();
//        a.b(new B());
//        B b = (B)a;
//        b.b(b);
//        b.b(new A());
        
//        byte x=100, y=100;
//        int l=x+y;
//        double d=x+y;
//        
//        long j=x+y;
//        float f=x+y;
//       byte z=(byte)(x+y);
//        System.out.println(z);
        
        
     //   new A();
       // new B();
        A a = new B();
        a.b(new A());
       
        
    }
   
}
