/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

/**
 *
 * @author Ara
 */
public class Terminal {
    public static void main(String[] args) throws IOException {
      
      char b;
      String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        
        
        do{
         str=br.readLine();
        // String tmp = str.endsWith(str);
         if(str.startsWith("ping"+" ")){
             String ipAddress = str.substring(5);
             InetAddress inet = InetAddress.getByName(ipAddress);
              System.out.println("Sending Ping Request to " + ipAddress);
    System.out.println(inet.isReachable(5000) ? "Host is "
            + "reachable" : "Host is NOT reachable");
             // System.out.println(ipAddress);
            
         } 
         else  System.out.println("Պինգ անել չգիտես?");
         
      //b = (char) br.read();
      
          // System.out.println(b);
          
     } while (!str.equals("!q:"));
     
     
     
         //   System.out.println("sadasdsadasdasdasd");
            
    }
}
