/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import javax.swing.JFrame;



public class NewClass implements Runnable {

Thread t;
NewClass(){
    t=new Thread(this,"Demo thread");
    System.out.println("Dougther thread is created");
  t.start();
   // t.run();
}
    
@Override
    public void run() {
        
         for(int i=0;;){
            System.out.println("JAVA");
        }
    
    }
}
    
    

    

