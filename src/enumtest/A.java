/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumtest;



/**
 *
 * @author matenadaran
 */
public class A {
    static int a=1;
      static int b=2;
      static int c=1;
     
   static enum B{
    AAA(a),
    BBB(b),
    CCC(c);
   private int x;
   private static int y;

        private B(int x) {
            this.x=x;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    
    
    
}
    
    
}
