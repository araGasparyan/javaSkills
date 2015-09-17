/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;


import java.awt.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author matenadaran
 */
public class MyFrame extends JFrame implements MouseListener, ActionListener{
  private String string1[]={"A","B","C","D","E","F"};
    private JPanel panel=new JPanel();
    private JPanel panel1=new JPanel();
    
      private JPanel panel3=new JPanel();
      private JButton button = new JButton();
        
	private JComboBox combo=new JComboBox(string1);
        private JCheckBox check=new JCheckBox();
        private JRadioButton radio[];
       private JLabel label[];
       private GridLayout g=new GridLayout(string1.length,2,10,0);
       private BorderLayout g1=new BorderLayout();
      
      Dimension d = new Dimension(10,10);
    
        
        
       private void radio(){
           for (int i=0;i < string1.length;i++){
               radio=new JRadioButton[string1.length];
               label = new JLabel[string1.length];
               label[i] = new JLabel();
               radio[i]=new JRadioButton("sadas");
                            radio[i].setSize(new Dimension(1,1));
               radio[i].addMouseListener(this);
               
               panel.add(radio[i]);
               panel.add(label[i]);
               label[i].setText(string1[i]);
               
           }
       }
    
    MyFrame(){
       super("MyFrame");
        setLayout(g1);
       setLocation(500,100);
        
        //panel.add(combo);
   // panel.add(check);
       //panel.add(combo);
       radio();
        
       panel.setBackground(Color.gray);
       panel.setLayout(g);
    
        panel.setPreferredSize(new Dimension(50,100));
        panel3.setPreferredSize(new Dimension(550,220));
        panel1.setBackground(Color.blue);
      button.addActionListener(this);
      button.setText("F I L L");
        panel1.add(button);
        panel3.setBackground(Color.red);
        add(panel,g1.NORTH);
          add(panel1,g1.CENTER);
            
          add(panel3,g1.SOUTH);
       //setResizable(false);
        setSize(400,400);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
       
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
       
           
                System.out.println("hello"+string1.length);
                
               System.out.println(radio[0].getText());
           
        
                
        
          
    }
    
}
