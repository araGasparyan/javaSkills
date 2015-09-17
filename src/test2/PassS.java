/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author matenadaran
 */
class PassS 
{
    public static void main(String [] args) 
    {
//        PassS p = new PassS();
//        p.start();
        B b1=new B();
        B b2=b1;
        System.out.println(b1 + " " + b2);
        System.out.println(b1 == b2);
        b2=new B();
        System.out.println(b1 + " " + b2);
        System.out.println(b1 == b2);
        
        String s1 = "slip";
        String s2=s1;
        System.out.println(s1 + " " + s2);
        System.out.println(s1 == s2);
        s2="sasa";
        System.out.println(s1 == s2);
        System.out.println(s1 + " " + s2);
    }

    void start() 
    {
        String s1 = "slip";
        String s2 = fix(s1);
        B btest=new B();
        B btest2=fis(btest);
        System.out.println(btest.x + " " + btest2.x);
        System.out.println(s1 + " " + s2);
    }

    String fix(String s1) 
    {
        
        s1 = s1 + "stream";
        System.out.println(s1 + " ");
        return "stream";
    }
    
    B fis(B btest){
        btest.x=btest.x+10;
        System.out.println(btest.x);
        
        return new B();
        
    }
    
    
}
