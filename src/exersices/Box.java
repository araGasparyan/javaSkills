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
public class Box {
     protected double h=0;
    protected double w=0;
    protected double d=0;
    private int t;
    
    void sett(int t)
    {
        this.t=t;
    }
    
    int gett()
    {
        return t;
    }
    
    Box(double h, double w, double d)
    {
        this.h=h;
        this.w=w;
        this.d=d;
        System.out.println("Box1");
    }
    
    Box()
    {
        this.h=3;
        this.w=1;
        this.d=1;
        System.out.println("Box2");
    }
    
    protected Box(double x)
    {
        h=w=d=x;
    }
    
    void show()
    {
        System.out.println(h+" "+w+" "+d);
    }
}
