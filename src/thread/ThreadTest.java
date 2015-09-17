/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author matenadaran
 */
public class ThreadTest implements Runnable{
    
    Thread t;
    
    ThreadTest(){
       t = new Thread(this,"test");
       t.start();
    }
    

    @Override
    public void run() {
        Test();
    }
    
    private void Test(){
        for(int i=0;;){
            System.out.println("JAVA");
        }
    }
    
    
    
}
