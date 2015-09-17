/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author matenadaran
 */
public class MyFrame extends JFrame{
    public MyFrame(int x, int y){
        setSize(x,y);
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawLine(50, 400, 50, 50);
         g.drawLine(50, 400, 450, 400);
         g.drawLine(45, 60, 50, 50);
         g.drawLine(55, 60, 50, 50);
         g.drawLine(440, 395, 450, 400);
         g.drawLine(440, 405, 450, 400);
         g.drawString("x", 440, 420);
         g.drawString("y", 35, 60);
         double x=50;
         int y=400;
         int n=500;
         for(int i=1;i<=n;i++){
            // g.fillOval((int)x, (int)(400-100*Math.sin(x)), 5, 5);
             g.fillOval((int)x, y, 3, 3);
             x++;
             y=(int)(400-100*Math.sin((x-50)*(Math.PI)/180));
         }
         x=50;
         y=300;
         Color c = new Color(255,0,0);
         g.setColor(c);
         for(int i=1;i<=n;i++){
            // g.fillOval((int)x, (int)(400-100*Math.sin(x)), 5, 5);
             g.fillOval((int)x, y, 3, 3);
             x++;
             y=(int)(400-100*Math.cos((x-50)*(Math.PI)/180));
         }
         
         x=50;
         y=400;
       c = new Color(0,0,255);
         g.setColor(c);
         for(int i=1;i<=n;i++){
            // g.fillOval((int)x, (int)(400-100*Math.sin(x)), 5, 5);
             g.fillOval((int)x, y, 2, 9);
             x++;
             y=(int)(400-100*Math.tan((x-50)*(Math.PI)/180));
         }
         
        
         
    }
}
