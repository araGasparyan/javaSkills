/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycollection;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Ara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyCollection coll = new MyCollection();
                   Class cl = AbstractCollection.class;
        for (int i = 0; i < cl.getMethods().length; i++) {
            System.out.println(cl.getMethods()[i]);
                    }
        
      
     
        
        
    }
    
}
