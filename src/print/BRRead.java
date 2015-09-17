/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;

/**
 *
 * @author matenadaran
 */
public class BRRead {
    public static void main(String[] args) throws IOException  {
        char c;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter symbols, 'q' for exit");
        do{
            //System.out.println(br.read());
            c=(char) br.read();
            System.out.println(c);
           
        }while(c != 'q');
     
    }
}
