package writefile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ara
 */
public class Test1 {
    public static void main(String[] args) {
      generator(args[0]);
    }
    
     static void generator(String colums){
        
        
       
                BufferedWriter wr = null;
         		try {
                           
			wr = new BufferedWriter( new OutputStreamWriter(new FileOutputStream("test2.txt"),"UTF-8"));
                       // br1 = new BufferedWriter(new FileWriter("C:\\Users\\Ara\\Desktop\\test1.txt"));
			try {
           
            wr.write(colums);
             
      
       
        } catch (NoSuchElementException e) {
                            System.out.println(e);
        }
      
 		} catch (IOException e) {
			e.printStackTrace();
                        		} finally {
                           
                         
                            try {
				if (wr != null)wr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
       
	
        
            }

}
