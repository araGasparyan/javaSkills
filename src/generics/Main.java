/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matenadaran
 */
public class Main {
    public static void main(String[] args) {
          
        
         
        Gen<Integer> iob;
        Integer y = 9;
        iob=new Gen<>(y);
        
     iob.showType();
     
        int v=iob.getOb();
        System.out.println(v);
        System.out.println("");
        
         Gen<String> strob=new Gen<>("mejq");
        
        
        strob.showType();
        String str=strob.getOb();
     
      
        
        
      // iob=strob;
            
        
        Object o1=new Integer(0);
         Object o2=new String("ddf");
         o1=o2;
        try {
             A a=(A)o1;
        } catch (Exception e) {
            System.out.println("OOPs");
        }
         
        
       str=(String) o1;
           System.out.println(str);
         v=(Integer) o1;
  
        
        
        /*
        new NewThread();
        System.out.println(A.getX());
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        A.setX(9);
        
        System.out.println(A.getX());
        
        
        */
        
         
         /* 
        String s = "";
        
        Class<?> c1=String.class;
        
        Class<Integer> c2=Integer.class;
        
        Class<?> i1=Runnable.class;
       
        Runnable i2 = new Runnable() {

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        System.out.println(s.getClass().getName());
        
        System.out.println(c1.getClass().getName());
        
        System.out.println(c2.getClass().getName());
        
          System.out.println(i1.getName());
           
           System.out.println(i2.getClass().getName());
        
            ActionListener e=new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        */
        
        
             
        
    }
    
    
}
