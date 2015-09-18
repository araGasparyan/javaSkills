/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.channels.SocketChannel;
import javax.swing.JFileChooser;
import javax.xml.transform.stream.StreamResult;
import static jdk.nashorn.internal.objects.NativeRegExp.source;

/**
 *
 * @author Ara
 */
public class PingExample {
 
    public static void main(String args[]) throws UnknownHostException, MalformedURLException, IOException{
  
        
        /*
             Socket s =new Socket();
        InetAddress adress = InetAddress.getLocalHost();
        System.out.println(adress);
        adress = InetAddress.getByName("facebook.com");
                System.out.println(adress.getHostAddress());
                
             InetAddress adresses[] = InetAddress.getAllByName("google.com");    
       for(int i=0;i<adresses.length;i++){
           System.out.println(adresses[i]);    
      
        InetAddress adress = InetAddress.getLocalHost();
        
       adress = InetAddress.getByName("facebook.com");
                System.out.println(adress.getHostAddress());
                System.out.println(adress.getCanonicalHostName());
                
                
                URL url = new URL("http","172.16.0.5",80,"index.html");
                
           System.out.println( url.getFile());
         System.out.println( url.getQuery());
        System.out.println( url.getHost());
         */

    
    
    
       
    String ipAddress = "127.0.0.1";
    InetAddress inet = InetAddress.getByName(ipAddress);

    System.out.println("Sending Ping Request to " + ipAddress);
    System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");

    ipAddress = "8.8.8.8";
    inet = InetAddress.getByName(ipAddress);

    System.out.println("Sending Ping Request to " + ipAddress);
    System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");

   
 
     
        
        
        
     /*
     File folder = new File("C:\\Users\\Ara\\Desktop\\test\\empty");
    String str;
     for(int i=0;i<1000;i++){
         str="C:\\Users\\Ara\\Desktop\\test\\"+i;
         folder = new File(str);
         folder.mkdir();
         folder.delete();
        // folder.renameTo(folder);
     }
    
if (folder.exists() && folder.isDirectory()) {
} else {
    folder.mkdir();
}
        System.out.println(folder.exists());
         System.out.println(folder.isDirectory());

String filePath = folder + File.separator;
File file = new File(filePath + "xxx.xml");

StreamResult result = new StreamResult(file);
//transformer.transform(source, result);
        */
        
    
    }
       
       }

