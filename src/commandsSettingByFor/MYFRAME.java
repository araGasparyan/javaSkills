/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandsSettingByFor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author matenadaran
 */
public class MYFRAME extends JFrame {
JButton buttons [] = {new JButton("1"), new JButton("2"), new JButton("3")};

    
    
    
    
    public MYFRAME() {
        
        
         setLayout(new FlowLayout());
         
         funcsetter();
         
         add(buttons[0]);
         add(buttons[1]);
         add(buttons[2]);
         
         
         setSize(500, 500);
         setVisible(true);
        
    }

    
    void funcsetter(){
        
        
        for (int i = 0; i < buttons.length; i++) {
            int tmp=i;
            
            buttons[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    System.out.println(tmp);
                
                }
            });
            
        }
        
        
    }
    
  
    
    

}
