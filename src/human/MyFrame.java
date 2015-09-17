package human;

import javax.swing.*;

public class MyFrame extends JFrame {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String str;
private int count;
private Man man[];
private String name[]={"Armen","Anastasia", "Ashot", 
		"Natalia","Ani", "Arsen","Anna"};
private int j;
JPanel panel = new JPanel();
JTextArea textarea = new JTextArea(25,25);
private String barev="";



	public MyFrame(){
		
		
		str=JOptionPane.showInputDialog("Input count of man");
		count = Integer.parseInt(str);
		man = new Man[count];
		for ( int i=0;  i < count ; i++) {
			
			j=(int)(Math.random()*3);
			if (j==0) man[i] = new Formal(name[(int)(Math.random()*7)],(int)(20+(Math.random()*21)));
			else if (j==1) man[i] = new NonFormal(name[(int)(Math.random()*7)], (int)(20+(Math.random()*21)));
			else man[i] = new Real(name[(int)(Math.random()*7)], (int)(20+(Math.random()*21)));
				}
		
		for ( int i=0;  i < count ; i++){
			System.out.println(man[i].speak());
			System.out.println(man[i].hello(man[(int)(Math.random()*count)]));
			barev+=man[i].speak();
			barev+="\n";
                        j=(int)(Math.random()*count);
			 barev+=man[j].hello(man[i]);
			barev+="\n";
                        barev+=man[i].hello(man[j]);
			barev+="\n";
                                               barev+="\n";
			
			
		}
		textarea.setText(barev);
		panel.add(textarea);
		add(panel);
		
		
		setSize(600,600);
		setVisible(true);
	}
	
	
	
	
}
