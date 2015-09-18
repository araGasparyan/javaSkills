/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

/**
 *
 * @author Ara
 */
import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestHarness {

    public static void main(String[] args){
     
     

            Pattern pattern = 
            Pattern.compile(("%nEnter your regex: "));

            Matcher matcher = 
            pattern.matcher(("Enter input string to search: "));

           
    }
}
