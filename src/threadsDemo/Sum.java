/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsdemo1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ara
 */
public class Sum implements Runnable {
Thread t;
long start;
long end;
long sum;

    public Sum(long start, long end) {
        this.end=end;
        this.start=start;
        t=new Thread(this);
        t.start();
    }


    
    
    @Override
    public void run() {
        long sum=0;
        for (long i = start; i <= end; i++) {
            sum+=i;
            if(sum%11111==0)
            {
                //System.err.println("paho");
                for (long j = 0; j < 300000000L; j++) {
                    
                    
                }
            }
            
        }
        this.sum=sum;
        
    }
    
}


class ThreadPowerDemo{
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        
         //Sum sum1=new Sum(1,1_000_000L);
        Sum sum1=new Sum(1,4_000_00L);
        Sum sum2=new Sum(4_000_01,7_00_000L);
        Sum sum3=new Sum(7_000_01,8_00_000L);
        Sum sum5=new Sum(8_000_01,9_00_000L);
        Sum sum4=new Sum(9_000_01,1_000_000L);
        try {
            sum1.t.join();
            sum2.t.join();
            sum3.t.join();
            sum4.t.join();
            sum5.t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadPowerDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(sum1.sum);
        
         
               
        
        
        
        System.out.println(sum1.sum+sum2.sum+sum3.sum+sum4.sum+sum5.sum);
        
        
        
        
        long end=System.currentTimeMillis();
        System.out.println("Excecution time is "+(end-start));
    }
}