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
public class Triangle extends Figure {
    
    Triangle(){
        System.out.println(super.area());
    }
    
    @Override
   public double area(){
       return dim1;
    }
}
