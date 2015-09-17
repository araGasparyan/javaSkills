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
public class B extends A{
    int i;
    B(int a, int b){
        i=a;
        //super.i=b;
        test();
    }
   
    void show(){
        System.out.println(i);
        System.out.println(super.i);
    }
    
    void test()
    {
        int i=1;
        this.i=i;
        
    }
   
}
