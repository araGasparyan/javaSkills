/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadgroup;

/**
 *
 * @author Ara
 */
public class Target {
    
     synchronized void syncmeth(){
        for (int i = 0; i < 10000; i++) {
        System.out.println("I am syncmeth "+i);
    }}
    
    synchronized void meth(){
        for (int i = 0; i < 10000; i++) {
        System.out.println("I am meth "+i);
    }}
    
     void meth1(){
        for (int i = 0; i < 10000; i++) {
        System.out.println("I am meth1 "+i);
    }}
    
    
}
