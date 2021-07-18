import javax.swing.*;
import java.awt.*;
public class DemoPhotu {
	JFrame frame;
	JPanel panel;
	JLabel photuLabel;
	Icon icon;
	public DemoPhotu()
	{
		frame=new JFrame("Demo Photu");
		
		panel=new JPanel();
		
		icon=new ImageIcon("image/7.jpg");
		
		photuLabel=new JLabel(icon);
		
		panel.add(photuLabel);
		
		frame.add(panel);
		
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public static void main(String arg[])
	{
		new DemoPhotu();
	}
}










