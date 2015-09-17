/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsdemo1;

/**
 *
 * @author Ara
 */
public class ExtendsThread extends Thread{
 
ExtendsThread() {
// Create a new, second thread

System.out.println("Child thread: ");
start(); // Start the thread
}
// This is the entry point for the second thread.
@Override
public void run() {
try {
for(int i = 5; i > 0; i--) {
System.out.println("Child Thread: " + i);
Thread.sleep(500);
}
} catch (InterruptedException e) {
System.out.println("Child interrupted.");
}
System.out.println("Exiting child thread.");
}
}
    



class ThreadDemoForExtends {
public static void main(String args[ ] ) {
new ExtendsThread(); // create a new thread
try {
for(int i = 5; i > 0; i--) {
System.out.println("Main Thread: " + i);
Thread.sleep(1000);
}
} catch (InterruptedException e) {
System.out.println("Main thread interrupted.");
}
System.out.println("Main thread exiting.");
}
}