import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class LabelChalega implements Runnable 
{
	Thread t1;
	JFrame frame;
	JPanel panel;
	JLabel label;
	int x, y, w, h;
	Icon icon;
	public LabelChalega() 
	{
		x=-50;
		y=60;
		w=100;
		h=60;
		frame=new JFrame("Label Chalega : )");
		
		panel=new JPanel();
		
		icon=new ImageIcon("image/7.jpg");
		
		label=new JLabel(icon);
		
		panel.setLayout(null);
		
		label.setBounds(x, y, w, h);
		
		panel.add(label);
		
		frame.add(panel);
		
		frame.setSize(300,300);
		
		frame.setVisible(true);
		
		t1=new Thread(this);
		t1.start();
	}
	public void run()
	{
		try
		{
			while(true)
			{
				x=x+5;
				if(x>1400)
				{
					x=-100;
					y=y+20;
				}
				label.setBounds(x, y, w, h);
				
				Thread.sleep(10);
			}
		}
		catch(Exception ee)
		{}
		
	}
	public static void main(String[] args) {
		new LabelChalega();

	}

}
