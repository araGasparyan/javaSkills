/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author Ara
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        /*
        StringBuffer strbfr=new StringBuffer("Hello");
        System.out.println(strbfr.length());
        System.out.println(strbfr.capacity());
        for (int i=strbfr.length();i>=0;i--){
       strbfr.setLength(i);
        System.out.println(strbfr.length());
        System.out.println(strbfr);
            System.out.println("");
                
        }
                */
        
       /* 
        StringBuffer str=new StringBuffer(40);
        System.out.println(str.append("h").append("e"));
        System.out.println(new A().meth().meth().meth().i);
        StringBuffer str1=new StringBuffer("abcdef");
        System.out.println(str1);
        str1.reverse();
        System.out.println(str1);
        */
        
        
        StringBuffer strbfr=new StringBuffer("Hello");
        System.out.println(strbfr);
         System.out.println(strbfr.charAt(0));
        System.out.println(strbfr.length());
        System.out.println(strbfr.capacity());
        System.out.println("");
        //strbfr.deleteCharAt(0);
        strbfr.delete(0,2);
        System.out.println(strbfr);
        System.out.println(strbfr.charAt(0));
         System.out.println(strbfr.length());
        System.out.println(strbfr.capacity());
        System.out.println("");
    }
                
}
