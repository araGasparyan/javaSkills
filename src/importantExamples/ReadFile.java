/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ara
 */
public class ReadFile {
    public static void main(String[] args) {
      // java ReadFile Test.txt;
        System.out.println(args.length);
        args=new String[1];
       args[0]="mysql_query.log";
        
        char c;
        int i;
        String s;
        FileInputStream fin;
        
        /*
        for(int j=0;j<args.length;j++){
            System.out.println("saddas");
        }
                */
        
        if (args.length!=1){
            System.out.println("Using of ShowFile");
            return; 
                  }
        
        
        
        
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException ex) {
             System.out.println("Can not open the file");
            return; 
        }
         
        
        
        
            try {
                do{
                i=fin.read();
                if((i!=-1)&&((char)i!='A'))System.out.print((char)i);
                if((char)i=='A')System.out.print('Ա');
                Thread.sleep(10);
                  }while (i!=-1);
            }
            catch (IOException ex) {
                 System.out.println("Can not read the file");
            } catch (InterruptedException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
       
            
            
                   
        
    }
    
}
