package String;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class NFrame extends JFrame{
	private String[] coloums = {"id","model","date","price","auto"};
	private Object[][] data={
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{1,"mersedes600",2000,25000,true},
			{2,"BMW7",2007,40000,false}
			};
	private JTable table1 = new JTable(data,coloums);

	
	NFrame(){
		
		
	//	add(table1);
		add(new JScrollPane(table1));
		setSize(300,200);
	}
		
		
		
		
	
	
	
}
