/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

/**
 *
 * @author Ara
 */
public class Producer implements Runnable{
Q q;

    public Producer(Q q) {
        this.q=q;
        new Thread(this, "Producer").start();
    }

                   
    @Override
    public void run() {
    int i=0;
    
    while(true){
        q.put(i++);
    }
    
    
    }
    
}
