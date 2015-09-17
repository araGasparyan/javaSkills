/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsync1;

import java.util.logging.Level;
import java.util.logging.Logger;

class Callme {
    
synchronized void call(String msg) {
//System.out.print("[" + msg);
    System.out.println(Thread.currentThread().getName());
    System.err.println(Thread.activeCount());
try {
Thread.sleep(1000);
} catch(InterruptedException e) {
System.out.println("Interrupted");
}
//System.out.println("]");
}

void call1(String msg) {
System.out.print("[" + msg);
try {
Thread.sleep(1000);
} catch(InterruptedException e) {
System.out.println("Interrupted");
}
System.out.println("]");
}

 synchronized void print(){
    for (int i = 0; i < 10; i++) {
        System.out.println(i);
        
        
    }
}



}
