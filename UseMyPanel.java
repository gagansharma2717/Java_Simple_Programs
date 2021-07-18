import javax.swing.*;
import java.awt.*;
public class UseMyPanel 
{
	JFrame frame;
	PhotuPanel panel;
	JButton submit, cancel;
	public UseMyPanel() 
	{
		frame=new JFrame("My Photu Panel");

		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		panel=new PhotuPanel("image/7.jpg", d.width, d.height);

		submit=new JButton("submit");
		cancel=new JButton("cancel");

		panel.add(submit);
		panel.add(cancel);
		
		frame.add(panel);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UseMyPanel();
	}

}
