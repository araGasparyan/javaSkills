/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadgroup;

/**
 *
 * @author Ara
 */
public class Test extends Thread{
Test t;
Target target;
boolean b;
    public Test(Target target, boolean b) {
        super();
        this.b=b;
        this.target=target;
        start();
    }
    
    @Override
    public void run(){
      if(b)target.syncmeth();
      else target.meth();
//        synchronized(this){for (int i = 0; i < 1000; i++) {
//            System.out.println(getName()+" "+i);
//        }}
            }
    
  
    
}
