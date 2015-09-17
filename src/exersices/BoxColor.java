/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exersices;

/**
 *
 * @author matenadaran
 */
public class BoxColor extends Box {
    private double c;


BoxColor(double h, double w, double d, double c)
    {
        super(h,w,d);
        this.c=c;
    }

     BoxColor(double x)
    {
        super(x);
        c=x;
    }


 
   
}
