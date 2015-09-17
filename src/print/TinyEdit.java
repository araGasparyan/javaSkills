/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author matenadaran
 */
public class TinyEdit {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str [] = new String[100];
        System.out.println("Enter the lines of text");
        System.out.println("Enter 'stop' for finish");
       for(int i=0;i<100;i++){  
           str[i]= br.readLine();
           if (str[i].equals("stop")) break;
        } 
        
        System.out.println("\n This is your file");
        
        for(int i=0;i<100;i++){ 
           if (str[i].equals("stop")) break;
            System.out.print(str[i]);
          
        }
        
        
    }
}  

