/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdademo;

/**
 *
 * @author Ara
 */
public class Main {
    static int meth(I i, int y){
        return i.test(y);
           }
    public static void main(String[] args) {
        I i=new I() {

            @Override
            public int test(int x) {
                return (x+5);
            }
        };
        
        int demo;
        System.out.println(meth(i, -5));
        
        
        demo=meth((x)->{
            x*=-1;
      return x;},6);
        
        System.out.println(demo);
        
        
    }
}
