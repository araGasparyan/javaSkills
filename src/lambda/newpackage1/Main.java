/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda.newpackage1;

import java.util.function.Function;

/**
 *
 * @author matenadaran
 */
public class Main {
    
  public static void main(String[] argv){
    Function<String,  Integer> strLengthFunc = String::length; 
    String name ="java2s.com";
    int len   =  strLengthFunc.apply(name); 
    System.out.println("name  = "  +  name + ", length = "  + len);
    
    name ="www.java2s.com";
    len   =  strLengthFunc.apply(name); 
    System.out.println("name  = "  +  name + ", length = "  + len);
    
      for (int i = 0; i < Function.class.getMethods().length; i++) {
          System.out.println(Function.class.getMethods()[i]);
          
      }

  }
}

