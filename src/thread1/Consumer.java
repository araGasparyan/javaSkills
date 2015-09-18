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
public class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q=q;
        new Thread(this, "Consumer").start();
    }

                   
    @Override
    public void run() {
        while(true){
        q.get();
        
    }
    }
}
