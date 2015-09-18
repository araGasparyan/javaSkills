/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumtest;

/**
 *
 * @author Ara
 */
public class A {
    protected int test;
   static int a=1;
     static int b=2;
      static int c=3;
      
     public int y;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        A.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        A.b = b;
    }

    public static int getC() {
        return c;
    }

    public static void setC(int c) {
        A.c = c;
    }
   
    
    public enum enumtest{
        A(a),
        B(b),
        C(c);
        
        int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        private enumtest() {
        }

        private enumtest(int x) {
            this.x = x;
        }
                   
            }

    public A() {
    }

    public A(int y) {
        this.y = y;
    }
    
    
   
}
