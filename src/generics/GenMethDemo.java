/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author matenadaran
 */
public class GenMethDemo {
  static <T, V extends T> boolean IsIn(T x, V [] y){
       for(int i=0;i<y.length;i++)
       if(x.equals(y[i]))return true; 
      
       return false;
}
  
    public static void main(String[] args) {
        Integer [] nums={1,2,3,4,5};
        if(IsIn(2,nums))
            System.out.println("2 is in nums");
        
        if(!IsIn(7,nums))
            System.out.println("7 is not in nums");
        
        System.out.println("");
        
        String s [] ={
            "one", "two", "three", "four", "five"
        };
        
        if(IsIn("two",s))
            System.out.println("two is in s");
        
        if(!IsIn("seven",s))
            System.out.println("seven is not in s");
               
    }
  
  
}
