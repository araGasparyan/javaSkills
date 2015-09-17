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
public class InnerTest {
    int x=101;
    void show()
    {
         Inner obj = new Inner();
         obj.show();         
    }
    
    class Inner
    {
        int y = 0;
        void show()
        {
            System.out.println(x+"    "+y);
        }
    }
    
}
