/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Ara
 */
public class CoordsDemo {
    public static void main(String[] args) {
        ThreeD [] three={
          new ThreeD(1,1,1),
             new ThreeD(2,3,4),
              new ThreeD(5,6,7),
               new ThreeD(8,9,10),
         new ThreeD(11,12,13),
        };
        TwoD [] two={
            new TwoD(1,2),
             new TwoD(-100,4),
              new TwoD(400,250),
               new TwoD(-100,-200),
        };
        
        FourD [] four = {
      new FourD(1,1,1,1),
            new FourD(2,1,7,1),
            new FourD(1,7,1,19),
            new FourD(181,456,7,4),
                        
    };
        
        Coords<?> t1=new Coords<>(two);
        Coords<FourD> t2=new Coords<>(four);
        t1.showXY(t1);
        System.out.println("");
        t1.showXY(t2);
        t1.showXYZ(t2);
        
    }
    
    
    
}
