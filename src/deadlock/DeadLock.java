/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadlock;

/**
 *
 * @author matenadaran
 */
public class DeadLock implements Runnable{
A a=new A();
B b=new B();

    public DeadLock() {
       // Thread.currentThread().setName("MainThread");
        Thread t= new Thread(this, "RacingThread");
        t.start();
        a.foo(b);
        System.out.println("Back to the main Thread");
    }



    @Override
    public void run() {
       b.bar(a);
       System.out.println("Back to another Thread");
    }
    
}
