/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Ara
 */
public class GenIfDemo {
    public static void main(String[] args) {
        Integer inums [] = {1,2,3,4,5,6};
        Character chs [] = {'a','b','d', 's', 's'};
        String fruits [] ={"apple", "banana", "grape", "kiwi"};
        
        MyClass<Integer> iob = new MyClass(inums); 
        MyClass<Character> cob = new MyClass(chs);
         MyClass<String> sob = new MyClass(fruits);
         
         System.out.println("min integer is "+iob.min());
         System.out.println("min integer is "+iob.max());
         System.out.println("");
         
          System.out.println("min integer is "+cob.min());
         System.out.println("min integer is "+cob.max());
         System.out.println("");
         
          System.out.println("min integer is "+sob.min());
         System.out.println("min integer is "+sob.max());
         System.out.println("");
    }
}
