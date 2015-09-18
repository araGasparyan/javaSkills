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
public class NewThread implements Runnable{
Thread t;
 Thread t1 = Thread.currentThread();
NewThread(){
    t=new Thread(this,"Demo thread");
    System.out.println("Dougther thread is created");
    t.start();
}
    
@Override
    public void run() {
        try{ 
        for(int n=5;n>0;n--){
       System.out.println("Dougther thread "+n+t1);
                Thread.sleep(500);
                    }
        }
        catch(InterruptedException e){
             System.out.println("Dougther thread is disturbed");
            }
         System.out.println("Dougther thread is finished");
        }
    
    
    
    
}
