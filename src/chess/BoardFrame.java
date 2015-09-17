/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author matenadaran
 */
public class BoardFrame extends JFrame {
   public BoardFrame(){
        setSize(400+20+20,400+20+20);
       setVisible(true);
    
    }
    
    @Override
    public void paint(Graphics p){
        super.paint(p);
        Setter a = new Setter();
        int x=20;
        int y=40;
        Color c1 = new Color(255,255,255);
        Color c2 = new Color(0,0,0);
        Color c;
     char let[]={'A','B','C','D','E','F','G','H'};
         char num[]={'1','2','3','4','5','6','7','8'};
         String s;
         int k=0;
        for(int i=0; i<a.getN();i++){
            for(int j : a.getBoard()[i]){
               if (j==1) 
                    c = c1; else c=c2;
               p.setColor(c);
                p.fillRect(x,y,40,40);
                x+=40;
                if(i==0)
                    
                {
                    c=c2;
           p.setColor(c);
            p.drawChars(let, k, 1, x-25, y-3);
            k++;
                }

                }
             
            x=20;
            c=c2;
           p.setColor(c);
            p.drawChars(num, i, 1, x-10, y+25);
            y+=40;
        
        }
    }
    
}
