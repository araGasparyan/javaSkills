package compmarket;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import chess.*;
import graphs.*;
import java.awt.Graphics;


public class MFrame extends JFrame implements ActionListener{
	
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	Icon icon = new ImageIcon("Mario-icon.png");
        Icon icon1 = new ImageIcon("red.gif");
        private JButton button1 = new JButton();
        private JButton button2 = new JButton();
        private JButton button3 = new JButton();
        private JButton button4 = new JButton();
        private boolean b = false;
       
        
	public MFrame(){
            if (b == true){}
            else{
		label.setText("Mario");
		label.setIcon(icon);
		add(panel);
				panel.add(label);
                                
                                setLayout(new FlowLayout());
                                 button1.setText("Graphs");
            add(button1);
            button1.addActionListener(this);
            button2.setText("lines");
         
            add(button2);
            button2.addActionListener(this);
            button3.setText("computer");
         
            add(button3);
            button3.addActionListener(this);
            
            add(button4);
            button4.addActionListener(this);
            button4.setText("Change picture");
            }
                      
		setSize(800,800);
		setVisible(true);
              setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
        
       public void Test()
       {
       removeAll();
           setSize(600,800);
		setVisible(true);
              setDefaultCloseOperation(EXIT_ON_CLOSE);
         repaint();
           
       }
                
        
        
        

    @Override
    public void actionPerformed(ActionEvent e) {
           
       if (e.getSource()==button1)
        new graphs.MyFrame(500,500);
       else if (e.getSource()==button3) 
           new MyFrame();
       else if  (e.getSource()==button4) {
       if(label.getIcon()==icon)
       { label.setIcon(icon1);
       label.setText("Red ball");}
       else {
               label.setText("Mario");
		label.setIcon(icon);}
       }
      
      
           }

    
}
