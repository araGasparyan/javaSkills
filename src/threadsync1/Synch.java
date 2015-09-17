/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsync1;

import java.util.logging.Level;
import java.util.logging.Logger;

class Synch {
public static void main(String args[]) {
final Callme target = new Callme();
//target.call("kkfenfenf");
Caller ob1 = new Caller(target, "Hello");
Caller ob2 = new Caller(target, "Synchronized");
Caller ob3 = new Caller(target, "World");
new Runnable() {

    @Override
    public void run() {
        System.out.println("I am runnable");
        target.print();
    }
}.run();
    System.err.println("jkjl");

// wait for threads to end
try {
ob1.t.join();
ob2.t.join();
ob3.t.join();
} catch(InterruptedException e) {
System.out.println("Interrupted");
}

    System.out.println("finished");
    

}
}
