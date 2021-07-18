import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DemoThreadClass implements ActionListener, Runnable
{
	Thread timeThread;
	JFrame frame;
	JPanel panel;
	JLabel timeLabel;
	JButton start, stop, pause, resume;
	Font font;
	int mm, ss, ms;
	public DemoThreadClass() 
	{
		frame=new JFrame("Demo Stop Watch");
		
		panel=new JPanel();
		
		timeLabel=new JLabel("0:0:0");

		start=new JButton("Start");
		stop=new JButton("Stop");
		pause=new JButton("Pause");
		resume=new JButton("Resume");
		
		font=new Font("Fixedsys", Font.BOLD, 54);
		
		mm=ss=ms=0;

		timeLabel.setFont(font);
		
		panel.add(timeLabel);
		panel.add(start);
		panel.add(pause);
		panel.add(resume);
		panel.add(stop);

		start.addActionListener(this);
		stop.addActionListener(this);
		pause.addActionListener(this);
		resume.addActionListener(this);
		
		panel.setBackground(Color.black);
		timeLabel.setForeground(Color.white);
		
		frame.add(panel);
		frame.setResizable(false);
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		
		frame.setLocation((d.width-200)/2,(d.height-160)/2);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		frame.setSize(200,160);
		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoThreadClass();
	}

	public void run() {
		try {
			while(true)
			{
				ms++;
				if(ms>=999)
				{
					ms=0;
					ss++;
					if(ss>=59)
					{
						ss=0;
						mm++;	
					}
				}
				timeLabel.setText(mm+":"+ss+":"+ms);
				Thread.sleep(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==start)
		{
			timeThread=new Thread(this);
			timeThread.start();
		}
		else if(evt.getSource()==stop)
		{
			timeThread.stop();
			mm=ss=ms=0;
		}
		else if(evt.getSource()==pause)
		{
			timeThread.suspend();
		}
		else if(evt.getSource()==resume)
		{
			timeThread.resume();
		}
	}

}
