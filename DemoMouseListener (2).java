import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DemoMouseListener implements MouseListener, MouseMotionListener{

	JFrame frame;
	JPanel panel;
	List list;
	JTextField text;
	JLabel label;
	public DemoMouseListener() 
	{
		frame=new JFrame("Demo Mouse Wala");
		
		panel=new JPanel();
		
		list=new List();
		
		label=new JLabel("");
		
		text=new JTextField(10);
		
		panel.add(list);
		panel.add(text);
		panel.add(label);
		panel.addMouseMotionListener(this);
		text.addMouseListener(this);
		
		frame.add(panel);
		
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoMouseListener ob=new DemoMouseListener();
	}

	public void mouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub

		list.add("Mouse Clicked");
	}

	public void mouseEntered(MouseEvent evt) {
		// TODO Auto-generated method stub
		list.add("Mouse Entered");
		int x=evt.getX();
		int y=evt.getY();
		label.setText(x+", "+y);
	}

	public void mouseExited(MouseEvent evt) {
		// TODO Auto-generated method stub

		int x=evt.getX();
		int y=evt.getY();
		label.setText(x+", "+y);
		list.add("Mouse Exited");
	}

	public void mousePressed(MouseEvent evt) {
		// TODO Auto-generated method stub

		int x=evt.getX();
		int y=evt.getY();
		label.setText(x+", "+y);
		list.add("Mouse Pressed");
	}

	public void mouseReleased(MouseEvent evt) {
		// TODO Auto-generated method stub

		list.add("Mouse Released");
	}

	public void mouseDragged(MouseEvent evt) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent evt) {
		// TODO Auto-generated method stub

		int x=evt.getX();
		int y=evt.getY();
		label.setText(x+", "+y);
	}

}
