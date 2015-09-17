package String;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MyFrame extends JFrame implements ActionListener{
private JTextField text1 = new JTextField();
private JTextField text2 = new JTextField();
private JTextField text3 = new JPasswordField();
private JButton button = new JButton("Submit");
private JTextArea area = new JTextArea();
private JPanel panel1 = new JPanel();
private JPanel panel2 = new JPanel();
private GridLayout grid = new GridLayout(3,2);
private JLabel label1 = new JLabel("Mail");
private JLabel label2 = new JLabel("Login");
private JLabel label3 = new JLabel("Password");
private JMenuBar menubar = new JMenuBar();
private JMenu menu = new JMenu("File");
private JMenu menu1 = new JMenu("Edit");
private JMenu menu2 = new JMenu();
private JMenuItem item1 = new JMenuItem("New");
private JMenuItem item2 = new JMenuItem("open");
private JMenuItem item3 = new JMenuItem("close");
private JMenu item11 = new JMenu("rotate");
private JMenuItem item5 = new JMenuItem("rotate right");
private JMenuItem item6 = new JMenuItem("rotate left");
private JMenuItem item12 = new JMenuItem("flip");
private Icon icon1=new ImageIcon("mred.gif"); 
private Icon icon2=new ImageIcon("mblue.gif"); 
private JTable table = new JTable();



public MyFrame(){
	
	
	setLayout(new FlowLayout());
	//panel1.setSize(new Dimension(50,50));
	
	
	
	setJMenuBar(menubar);
	menubar.add(menu);
	menubar.add(menu1);
	item1.setIcon(icon1);
	item3.setIcon(icon2);
	menu.add(item1);
	menu.addSeparator();
	menu.add(item2);
	menu.add(item3);
	item11.add(item5);
	item5.addActionListener(this);
	item11.add(item6);
	menu1.add(item11);
	menu1.add(item12);
	panel1.add(label1); 
	panel1.add(text1);
	panel1.add(label2);
	panel1.add(text2);
	panel1.add(label3);
	panel1.add(text3);
	panel1.setLayout(grid);
	add(panel1, BorderLayout.NORTH);
	//button.addActionListener(this);
	//panel2.add(button, BorderLayout.SOUTH);
	add(panel2);
	
	setSize(500,500);
	setVisible(true);
}




@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource()==item5){
            
		NFrame n= new NFrame();
		n.setVisible(true);
	}
	
	/*
	String s1,s2,s3;
	s1=text1.getText();
	s2=text2.getText();
	s3=text3.getText();
	if(s3.length()<6){
	JOptionPane.showMessageDialog(null,"the password is not secure");
	} else {
		NFrame n= new NFrame();
		n.setVisible(true);
		
	}
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
