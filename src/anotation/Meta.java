/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 *
 * @author matenadaran
 */
@MyAnno(str="First Anno",val= 100)
public class Meta {
final  int x=100;
   
@MyAnno(str="First Anno", val=100)
    public static void myMeth(){
        Meta ob = new Meta();
        try {
            Class<?> c =Meta.class;
        Method m=c.getMethod("myMeth");
        MyAnno anno = m.getAnnotation(MyAnno.class);
        Annotation anno1 [] = m.getAnnotations();
         System.out.println(anno.str()+" "+anno.val());
        } catch (Exception e) {
            System.out.println("zzzzzz");
        }
        
     
       
    }

   
    public String toString() {
        return "Meta{" + "x=" + x + '}';
    }
    

    
    
}
