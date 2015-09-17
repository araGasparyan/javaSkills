/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author matenadaran
 */
public class UseTrim {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter 'stop' to quit");
        System.out.println("Enter state: ");
        do {            
            str=br.readLine();
            str = str.trim();
            if(str.equalsIgnoreCase("Armenia")){
                System.out.println("The capital is Yerevan");
            } else if(str.equalsIgnoreCase("Georgia")){
                System.out.println("The capital is Tbilisi");
            } else if (str.equalsIgnoreCase("Russia")){
                System.out.println("The capital is Moscow");
            } else if (str.equalsIgnoreCase("France")){
                System.out.println("The capital is Paris");
            } else if (str.equalsIgnoreCase("England")){
                System.out.println("The capital is London");
            }
            
        } while (!str.equals("stop"));
        
    }
    
}
