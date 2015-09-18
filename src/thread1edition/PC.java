/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1edition;

import thread1.*;

/**
 *
 * @author Ara
 */
public class PC {
    public static void main(String args[]){
        Q q=new Q();
         new Producer(q);
         new Consumer(q);
        // System.out.println("finished");
    }
    
}
