import javax.swing.*;
public class MeraApplet extends JApplet
{
	int i=10;
	public void init()
	{
		super.init();		
		System.out.println("Init Value is : "+i);	
	}
	public void start()
	{
		i=i+10;
		System.out.println("Start Value is : "+i);
	}
	public void stop()
	{
		i=i+10;
		System.out.println("Stop Value is : "+i);
	}
	public void destroy()
	{
		i=i+10;
		System.out.println("Destroy Value is : "+i);
	}
}