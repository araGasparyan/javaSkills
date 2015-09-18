package simpleskills;

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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ara
 */
public class Test1 {
    public static void main(String[] args) {
      a();
    }
    
    
    static void a(){
          try {
            BufferedWriter wr = null;
            try {
                
                
                wr = new BufferedWriter( new OutputStreamWriter(new FileOutputStream("test1.txt")));
                Thread.sleep(1000);
                
                System.out.println("sdfsdf");
            } catch (Exception ex) {
                Logger.getLogger(Test1.class.getName()).log(Level.SEVERE, null, ex);
            }
            wr.write("sdasd");
        } catch (IOException ex) {
            Logger.getLogger(Test1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
}
