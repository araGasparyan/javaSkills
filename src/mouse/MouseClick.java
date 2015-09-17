package mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class MouseClick extends JFrame implements MouseListener, MouseMotionListener{

	private JLabel label = new JLabel();
	private JPanel panel = new JPanel();
	private Icon icon = new ImageIcon("red.gif");
	
	
	public MouseClick(){
		
		label.setIcon(icon);
		panel.add(label);
		add(panel);
		addMouseMotionListener(this);
		label.addMouseListener(this);
		setSize(600,600);
		setVisible(true);
		
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		// System.out.println("click");
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Entered");
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("Exited");
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("After");
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
	if(arg0.getButton()==MouseEvent.BUTTON1){
		System.out.println("pressmotion");
	}
		
		
		
	}


	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		// System.out.println("pressmotion");
		
	}


	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		// System.out.println("motion");
		
	}
	
	
	
	
}
