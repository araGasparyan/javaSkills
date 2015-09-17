/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda.newpackage;

/**
 *
 * @author matenadaran
 */
public class Demo {
    public static void main(String[] args) {
        ForDemo f = new ForDemo();
        System.out.println(
        
        f.testmeth(Clmeth::meth, "", 7)
        
        );
        
        System.out.println((int)'7');
        
    }
}
