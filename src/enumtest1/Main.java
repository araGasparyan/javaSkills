/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumtest;

import javax.swing.JFrame;

/**
 *
 * @author Ara
 */
public class Main {
    public static void main(String[] args) {
  /*
        Animals x[]=Animals.values();
   
   
   for(int i=0;i<x.length;i++){
       System.out.println(x[i]+" "+x[i].getLegs());
   }
        
   
   
   for(int i=0;i<x.length;i++){
       x[i]=Animals.valueOf("Lion");
   }
   
   for(int i=0;i<x.length;i++){
       System.out.println(x[i]);
   }
        */
        
        
        String s1,s2;
        s1="Abo";
        s2="Ara";
        s1=s2;
        System.out.println(s1+" "+s2);
        Gen<String> g=new Gen<>();
        Gen<Boolean> b=new Gen<>();
        Object o1=new String("anasun");
       // g.setO("Armenia");
    //  g.print();
        Object o2=new Integer(8);
      String s;
      s=(String)o2;
      
      
      
      
        /*
        int x [] ={1,5,5,7,6,12,3};
        int tmp = 0;
        for(int j=0;j<x.length;j++){
        for (int i=0;i<x.length-j;i++){
            if(x[i]>x[x.length-j-1]){
               tmp=x[i];
                x[i]=x[x.length-j-1];
                x[x.length-j-1]=tmp;
            }
        }
        }
        
       for(int i=0;i<x.length;i++){
           System.out.println(x[i]);
       }
        */
    }
}
