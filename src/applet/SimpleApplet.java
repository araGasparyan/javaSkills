/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author matenadaran
 */



/*
<applet code="SimpleApplet" width=200 heigt=60>
</applet>
*/

public class SimpleApplet extends Applet{
    @Override
    public void paint(Graphics g){
        g.drawString("simple string", 10, 20);
    }
    
    
     
}


