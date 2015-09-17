/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtimedemo;

import javax.swing.JFrame;

/**
 *
 * @author matenadaran
 */
public class NewClass {
    public static void main(String[] args) {
      Class<?> cl;
        cl = NewClass.class;
        System.out.println(cl.getName());
        cl=new ClassLoader() {
}.getClass();
         System.out.println(cl.getName());
         cl=new ClassLoader() {
}.getClass();
         System.out.println(cl.getName());
         cl=new NewClass(){
}.getClass();
         System.out.println(cl.getName());
         cl=new JFrame().getClass();
         System.out.println(cl.getName());
        cl=Compiler.class;
         System.out.println(cl.getName()); 
        
}
}