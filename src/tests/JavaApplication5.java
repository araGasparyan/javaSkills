/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ProcessBuilder.Redirect;

/**
 *
 * @author matenadaran
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
      //  MyFrame frame = new MyFrame();
        //frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
      
       /*
        Class<?> c=Process.class;
        for(int i=0;i<c.getMethods().length;i++)
        System.out.println(c.getMethods()[i]); 
        
        
        
        Process p=new Process() {

            @Override
            public OutputStream getOutputStream() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public InputStream getInputStream() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public InputStream getErrorStream() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int waitFor() throws InterruptedException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int exitValue() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void destroy() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
               
               */
        
        
        Runtime r = Runtime.getRuntime();
      ProcessBuilder prb = new ProcessBuilder(args);
      File f= new File("sdsd");
    ProcessBuilder.Redirect prd;
    prd = prb.redirectError();
        System.out.println(prd.file()); ;
    }
}
