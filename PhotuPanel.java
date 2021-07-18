import java.awt.*;

import javax.swing.*;
public class PhotuPanel extends JPanel{

	int w, h;
	ImageIcon image;
	public PhotuPanel(String strImagePath, int w, int h)
	{
		super();
		this.w=w;
		this.h=h;
		image=new ImageIcon(strImagePath);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawLine(10, 10, 400, 400);
		//g.setColor(Color.cyan);
		//g.fillRect(0, 0, 2000, 2000);
		
		g.drawImage(image.getImage(), 0, 0, w, h, null);
		
	}
}











