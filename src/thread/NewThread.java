/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author Ara
 */
public class NewThread implements Runnable{
     String name;
    Thread t;
    int m;

NewThread(String threadname, int m){
    this.m=m;
   name = threadname;
    t=new Thread(this,threadname);
    System.out.println("A new thread "+t);
    t.start();
}
    
@Override
    public void run() {
        try{ 
        for(int n=m;n>0;n--){
       System.out.println(name+" : "+n);
                Thread.sleep(1000);
                    }
        }
        catch(InterruptedException e){
             System.out.println(name+" is disturbed");
            }
         System.out.println(name+" is finished");
        }
    
    
    
    
}
