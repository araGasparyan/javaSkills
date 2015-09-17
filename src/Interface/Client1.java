/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Ara
 */
public class Client1 implements Callback, Callback1 {

    @Override
    public void callback(int param) {
        System.out.println("I am a method callback with parametr "+param);
    }

    @Override
    public void callback1(int p) {
        System.out.println("I am the method callback1 with parametr "+p);
    
}
}