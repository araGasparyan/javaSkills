/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author matenadaran
 */
public class NewClass1 {
  private  int x,y;
   private double z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
       
    }

    public NewClass1(int x, int y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
       
    }

    @Override
    public String toString() {
        return "NewClass1{" + "x=" + x + ", y=" + y + ", z=" + z + "}";
    }
    
    
    
}
