package mouse;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class ComboBox extends JFrame implements ActionListener, MouseListener{

	private String string1[]={"choose","A","B","C","D","E","F"};
        private String string2[]={"choose","1","2","3","4","5","6"};
        private String string3[]={"choose","letter","number"};
	JComboBox combo1=new JComboBox(string3);
        JComboBox combo2=new JComboBox();
	JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JTextArea area = new JTextArea(20,20);
	JButton button = new JButton();
	JLabel label = new JLabel();
	
	
	ComboBox(){
            
            setLayout(new BorderLayout());
		combo1.addMouseListener(this);
            combo1.addActionListener(this);
           // combo2.setSize(new Dimension(20,20));
		panel1.add(combo1);
		panel1.add(combo2);
		
                button.setText("OK");
                button.addActionListener(this);
                button.addMouseListener(this);
                panel2.add(button);
                
                panel3.add(area);
                
		add(panel1, BorderLayout.NORTH);
                add(panel2, BorderLayout.CENTER);
                add(panel3, BorderLayout.SOUTH);
                
		//setResizable(false);
		setSize(500,500);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 
        if(e.getSource()==combo1)
        {
            if(combo1.getSelectedItem()=="letter") 
                {   
                panel1.remove(combo2);
                    combo2 = new JComboBox(string1);
                    panel1.add(combo2);
           validate();
                }
            
            if(combo1.getSelectedItem()=="number") 
                {   
                panel1.remove(combo2);
                    combo2 = new JComboBox(string2);
                    panel1.add(combo2);
           validate();
                }
           
        }
        
        if(e.getSource()==button)
        {
          if(combo2.getSelectedItem()!="choose")
            area.setText((String)combo2.getSelectedItem());
           
           
        }
        
	}

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e);
        System.out.println("mouseClicked");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
      System.out.println(e);
        System.out.println("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println(e);
        System.out.println("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println(e);
        System.out.println("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
       System.out.println(e);
        System.out.println("mouseExited");
    }
	
}
