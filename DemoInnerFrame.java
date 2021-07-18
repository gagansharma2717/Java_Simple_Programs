import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DemoInnerFrame implements ActionListener 
{
	JFrame frame;
	JDesktopPane panel;
	JMenuBar menuBar;
	JMenu masterMenu;
	JMenuItem first, second;
	public DemoInnerFrame() 
	{
		frame=new JFrame("Demo Internal Frames");
		
		panel=new JDesktopPane();
		
		menuBar=new JMenuBar();
		
		masterMenu=new JMenu("Master");

		first=new JMenuItem("First");
		second=new JMenuItem("Second");

		menuBar.add(masterMenu);
		
		masterMenu.add(first);
		masterMenu.add(second);

		first.addActionListener(this);
		second.addActionListener(this);
		
		frame.setJMenuBar(menuBar);
		
		frame.add(panel);
		
		frame.setSize(600, 400);
		
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==first)
		{
			FirstInternalFrame ob=new FirstInternalFrame();
			panel.add(ob);
		}
		else if(evt.getSource()==second)
		{

			SecondInternalFrame ob=new SecondInternalFrame();
			panel.add(ob);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoInnerFrame();
	}

}
