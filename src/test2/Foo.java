/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author matenadaran
 */
public class Foo 
{
    
   
    Foo() 
    {
        System.out.print("foo");
    }
    
class Bar
{
    Bar() 
    {
        System.out.print("bar");
    }
    public void go() 
    {
        System.out.print("hi");
    }
} /* class Bar ends */

    public static void main (String [] args) 
    {
        Foo f = new Foo(){};
        f.makeBar();
    }
    void makeBar() 
    {
        (new Bar()).go();
    }
}
