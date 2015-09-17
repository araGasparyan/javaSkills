package compmarket;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import chess.BoardFrame;

public class MyFrame extends JFrame {
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	JPanel panel = new JPanel();
	
	Computer comp = new Computer();
	HDD hdd = new HDD();
	RAM ram = new RAM();
	MotherBoard moth = new MotherBoard();
	
	public MyFrame()
	{
		
		comp.setPic("computer.jpg");
		hdd.setModel("seageate");
		hdd.setPow(50);
		moth.setModel("asdfdgh");
		moth.setP(1.5);
		ram.setModel("sdsdasdasd");
		ram.setPow(2);
		comp.setHdd(hdd);
		comp.setMoth(moth);
		comp.setRam(ram);
		
		Icon icon = new ImageIcon(comp.getPic());
		
		label.setIcon(icon);
		label2.setText(comp+"");
		panel.add(label);
		panel.add(label2);
		add(panel);
		
		
		setSize(1000,700);
		setVisible(true);
		 // setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	

}
