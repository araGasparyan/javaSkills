/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadgroup;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ara
 */
public class TestMain {
    public static void main(String[] args) {
        Target target=new Target();
        Test t1=new Test(target, true);
      Test t2=new Test(target, false);
       
        
       
       
    }
}
