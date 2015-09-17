package database;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DFrame extends JFrame implements ActionListener {
private JPanel panel=new JPanel();
private JTable table = null;
ConnectDB cinnect = new ConnectDB();
private InsertForm form ;	
private JMenuBar menubar = new JMenuBar();

private JMenu myMenu = new JMenu("File");
private JMenu myMenu2 = new JMenu("Edit");

private JMenu item1 = new JMenu("New");
private JMenuItem item2 = new JMenuItem("Insert");
private JMenuItem item3 = new JMenuItem("Close");
private JMenuItem item4 = new JMenuItem("Copy");
private JMenuItem item5 = new JMenuItem("Cut");
private JMenuItem item6 = new JMenuItem("Paste");
private JMenuItem item7 = new JMenuItem("Java Project1");
private JMenuItem item8 = new JMenuItem("Java Project2");

public DFrame(){
	
	myMenu.add(item1);
	myMenu.addSeparator();
	item1.add(item7);
	item1.add(item8);
	myMenu.add(item2);
	myMenu.add(item3);
	myMenu2.add(item4);
	myMenu2.add(item5);
	myMenu2.add(item6);
	menubar.add(myMenu);
	menubar.add(myMenu2);
	item2.addActionListener(this);
	setJMenuBar(menubar);
	
	
	table=new JTable(cinnect.getData(),cinnect.getColumns());
	add(new JScrollPane(table));
	
	setSize(500,500);
	setVisible(true);
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource()==item2){new InsertForm();}
	
	
}

}
