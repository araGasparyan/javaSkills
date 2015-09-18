/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Ara
 */
public class Callme {
   synchronized void call(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println("Disturbed");
        }
        System.out.println("]");
    }
}
