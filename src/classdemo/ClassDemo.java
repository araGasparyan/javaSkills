/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdemo;

/**
 *
 * @author Ara
 */
public class ClassDemo {
    public static void main(String[] args) {
        
        Class<?> cl;
        X x = new X();
        
    Math m;
   
        cl = Math.class;
        System.out.println(cl.getName());
        System.out.println(cl.getConstructors().length);
        for (int i = 0; i < cl.getConstructors().length; i++) {
            System.out.println(cl.getConstructors()[i]);
            
        }
        for (int i = 0; i < cl.getMethods().length; i++) {
            System.out.println(cl.getMethods()[i]);
            
        }
        
        for (int i = 0; i < cl.getFields().length; i++) {
            System.out.println(cl.getFields()[i]);
            
        }
    }
           
}
