/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleskills1;

/**
 *
 * @author Ara
 */
public class Factorial {
    int fact(int n){    
    int result;
   if (n==1) return 1;
   result = fact(n-1)*n;
   System.out.println(result);
   return result;
    } 
    }

