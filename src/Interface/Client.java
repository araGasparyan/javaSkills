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
public class Client implements Callback, Callback1{
    
    @Override
    public void callback(int p) {
        System.out.println("I am the method callback with parametr "+p);
    }

    @Override
    public void callback1(int param) {
        System.out.println("I am the method callback1 with parametr "+param);
    }
    
}
