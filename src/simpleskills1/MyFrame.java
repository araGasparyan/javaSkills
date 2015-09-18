/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleskills1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author Ara
 */
public class MyFrame extends JFrame {
    MyFrame(){
        setSize(300,300);
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics p){
       // p.drawLine(0,0,100,100);
        for(int i=0;;i++){
        Color c = new Color((int)(255*Math.random()),155,155);
        p.setColor(c);
         p.fillRect(100,100,100,100);
    }
    }
}
