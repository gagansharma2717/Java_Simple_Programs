import javax.swing.*;
import java.awt.*;
public class AppletWaliPainting extends JApplet implements Runnable{
	
	Thread t1;
	int x, y, x1, y1;
	public void init()
	{
		t1=new Thread(this);
		t1.start();
		x=200;
		y=0;
		x1=250;
		y1=500;
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		if(y1>470)
		{
			g.setColor(Color.red);
		}
		else if(y1>420)
		{
			g.setColor(Color.green);
		}
		else if(y1>400)
		{
			g.setColor(Color.blue);
		}
		else if(y1>350)
		{
			g.setColor(Color.yellow);
		}
		else if(y1>300)
		{
			g.setColor(Color.pink);
		}
		
		g.drawLine(x, y, x1, y1);
		
	}
	public void run()
	{
		try {
			while(true)
			{
				x=x+2;
				y=y+5;
				x1=x1-5;
				y1=y1-2;
				repaint();
				Thread.sleep(200);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
