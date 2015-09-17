/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListDemo;

import java.util.EnumSet;
import enumtest.Color;

/**
 *
 * @author matenadaran
 */
public class EnumSetDemo {
    public static void main(String[] args) {
        
        EnumSet t1=EnumSet.allOf(Color.class);
        EnumSet<Color> t2=EnumSet.allOf(Color.class);
        System.out.println(t1);
        
        
    }
}
