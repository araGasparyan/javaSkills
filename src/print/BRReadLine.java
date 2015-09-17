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
public class BRReadLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter the lines of text");
        System.out.println("Enter 'stop' for finish");
        do{
           str= br.readLine();
            System.out.println(str);
        } while(!str.equals("stop"));
        
        
        
        
    }
}
