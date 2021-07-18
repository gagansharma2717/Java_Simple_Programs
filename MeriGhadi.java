import javax.swing.*;

import java.awt.*;
import java.util.*;
public class MeriGhadi implements Runnable
{
	GregorianCalendar gc;
	Thread timeThread;
	JFrame frame;
	JPanel panel;
	JLabel timeLabel;
	Font font;
	public MeriGhadi() {
		frame=new JFrame("Pyaari Ghadi");
		
		panel=new JPanel();
		
		timeLabel=new JLabel("0:0:0");
		
		font=new Font("Fixedsys", Font.BOLD, 54);
		
		timeLabel.setFont(font);
		
		panel.add(timeLabel);
		
		panel.setBackground(Color.black);
		timeLabel.setForeground(Color.white);
		
		frame.add(panel);
		frame.setResizable(false);
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		
		frame.setLocation((d.width-200),(d.height-160));
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		frame.setSize(200,160);
		
		timeThread=new Thread(this);
		timeThread.start();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new MeriGhadi();

	}

	public void run() {
		try {
			while(true)
			{
				gc=new GregorianCalendar();
				int hh=gc.get(Calendar.HOUR);
				int mm=gc.get(Calendar.MINUTE);
				int ss=gc.get(Calendar.SECOND);
				timeLabel.setText(hh+":"+mm+":"+ss);
				Thread.sleep(1000);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
