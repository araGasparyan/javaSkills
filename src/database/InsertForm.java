package database;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InsertForm extends JFrame implements ActionListener {
	ConnectDB cinnect = new ConnectDB();
	private JTextField field1=new JTextField(10); 
	private JTextField field2=new JTextField(10); 
	private JTextField field3=new JTextField(10); 
	private JTextField field4=new JTextField(10); 
	private JTextField field5=new JTextField(10); 
	
	private GridLayout grid = new GridLayout(6,2);
	private JPanel panel1=new JPanel();
	private JPanel panel2=new JPanel();
private JButton button = new JButton("Ok");	
private JLabel label1=new JLabel("StID");
private JLabel label2=new JLabel("name");
private JLabel label3=new JLabel("Sname");
private JLabel label4=new JLabel("Date");
private JLabel label5=new JLabel("Pay");
	
	
	
	public InsertForm()
	{
		setLayout(new FlowLayout());
		panel1.setLayout(grid);
		panel1.add(label1);
		panel1.add(field1);
		panel1.add(label2);
		panel1.add(field2);
		panel1.add(label3);
		panel1.add(field3);
		panel1.add(label4);
		panel1.add(field4);
		panel1.add(label5);
		panel1.add(field5);
		panel2.add(button);
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.SOUTH);
		button.addActionListener(this);
		setSize(300, 300);
		setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String st1;
		String st2;
		String st3;
		String st4;
		

		int num1;
		int num2;
		
		st1=field1.getText();
		st2=field2.getText();
		st3=field3.getText();
		st4=field4.getText();
		
		
		num1=Integer.parseInt(st3);
		num2=Integer.parseInt(st4);
		
	System.out.println(st1);
	cinnect.insert(st1, st2, num1, num2);
	
	}

}
